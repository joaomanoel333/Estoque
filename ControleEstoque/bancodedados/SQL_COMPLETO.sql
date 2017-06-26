SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `bdestoque` ;
CREATE SCHEMA IF NOT EXISTS `bdestoque` DEFAULT CHARACTER SET utf8 ;
USE `bdestoque` ;

-- -----------------------------------------------------
-- Table `bdestoque`.`Usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(50) NOT NULL ,
  `DataCadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ,
  `Administrador` TINYINT(1) NULL ,
  `Edicao` TINYINT(1) NULL ,
  PRIMARY KEY (`idUsuario`) ,
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Fornecedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(100) NOT NULL ,
  `Responsavel` VARCHAR(50) NULL ,
  `CNPJ` VARCHAR(20) NULL ,
  `Telefone` VARCHAR(20) NULL ,
  `TelefoneResponsavel` VARCHAR(20) NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ,
  PRIMARY KEY (`idFornecedor`) ,
  UNIQUE INDEX `idFornecedor_UNIQUE` (`idFornecedor` ASC) ,
  INDEX `usuario_idx` (`UsuarioCadastro` ASC) ,
  CONSTRAINT `usuario`
    FOREIGN KEY (`UsuarioCadastro` )
    REFERENCES `bdestoque`.`Usuario` (`idUsuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Categoria`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(50) NOT NULL ,
  `Descricao` VARCHAR(100) NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ,
  PRIMARY KEY (`idCategoria`) ,
  INDEX `usuario_idx` (`UsuarioCadastro` ASC) ,
  CONSTRAINT `usuario`
    FOREIGN KEY (`UsuarioCadastro` )
    REFERENCES `bdestoque`.`Usuario` (`idUsuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Produto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(100) NOT NULL ,
  `Descricao` VARCHAR(100) NULL ,
  `ValorCompra` DOUBLE NULL ,
  `ValorVenda` DOUBLE NULL ,
  `Quantidade` INT NULL ,
  `Fornecedor` INT NULL ,
  `Categoria` INT NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ,
  `Padaria` TINYINT(1) NULL ,
  PRIMARY KEY (`idProduto`) ,
  INDEX `usuario_idx` (`UsuarioCadastro` ASC) ,
  INDEX `fornecedor_idx` (`Fornecedor` ASC) ,
  INDEX `categoria_idx` (`Categoria` ASC) ,
  CONSTRAINT `usuario`
    FOREIGN KEY (`UsuarioCadastro` )
    REFERENCES `bdestoque`.`Usuario` (`idUsuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fornecedor`
    FOREIGN KEY (`Fornecedor` )
    REFERENCES `bdestoque`.`Fornecedor` (`idFornecedor` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `categoria`
    FOREIGN KEY (`Categoria` )
    REFERENCES `bdestoque`.`Categoria` (`idCategoria` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
