SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `bdestoque` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `bdestoque` ;

-- -----------------------------------------------------
-- Table `bdestoque`.`Fornecedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(100) NOT NULL ,
  `Responsavel` VARCHAR(50) NULL ,
  `CNPJ` INT NULL ,
  `Telefone` INT NULL ,
  `TelefoneResponsavel` INT NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` DATE NULL ,
  PRIMARY KEY (`idFornecedor`) ,
  UNIQUE INDEX `idFornecedor_UNIQUE` (`idFornecedor` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(50) NOT NULL ,
  `DataCadastro` DATE NULL ,
  `Administrador` TINYINT(1) NULL ,
  `Edicao` TINYINT(1) NULL ,
  PRIMARY KEY (`idUsuario`) ,
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Categoria`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(50) NOT NULL ,
  `Descricao` VARCHAR(100) NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` INT NULL ,
  PRIMARY KEY (`idCategoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`Produto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT ,
  `Nome` VARCHAR(100) NOT NULL ,
  `Descricao` VARCHAR(100) NULL ,
  `ValorCompra` INT NULL ,
  `ValorVenda` INT NULL ,
  `Quantidade` INT NULL ,
  `Fornecedor` INT NULL ,
  `Categoria` INT NULL ,
  `UsuarioCadastro` INT NULL ,
  `DataCadastro` DATE NULL ,
  `Padaria` TINYINT(1) NULL ,
  PRIMARY KEY (`idProduto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdestoque`.`table1`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bdestoque`.`table1` ()
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
