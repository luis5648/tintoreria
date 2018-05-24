
-- Volcando estructura de base de datos para tintoreria
CREATE DATABASE IF NOT EXISTS `tintoreria` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tintoreria`;

-- Volcando estructura para tabla tintoreria.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `idClientes` int(11) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Telefono` bigint(20) NOT NULL,
  `Domicilio` varchar(59) NOT NULL,
  PRIMARY KEY (`idClientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tintoreria.clientes: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`idClientes`, `Nombres`, `Apellidos`, `Telefono`, `Domicilio`) VALUES
	(1, 'raul', 'corona', 789, '42'),
	(2, 'mirsha', 'espinoza', 789, 'Basilio Vadillo'),
	(3, 'arturo', 'gonzalez', 123, 'hacienda real'),
	(4, 'guilermo', 'gomez', 123, 'valle'),
	(5, 'q', 'q', 8888888888, 'q');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla tintoreria.empleados
DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `idEmpleados` int(11) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Domicilio` varchar(50) NOT NULL,
  `Telefono` bigint(20) NOT NULL,
  `Salario` float NOT NULL,
  `Horario` varchar(20) NOT NULL,
  `Contrasenia` int(11) NOT NULL,
  PRIMARY KEY (`idEmpleados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tintoreria.empleados: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` (`idEmpleados`, `Nombres`, `Apellidos`, `Domicilio`, `Telefono`, `Salario`, `Horario`, `Contrasenia`) VALUES
	(1, 'q', 'q', 'q', 11111111, 1111110000, 'Matutino', 1),
	(111, 'qww', 'wwq', 'qww', 1, 1, 'Matutino', 1),
	(345, 'luis', 'gonzalez', 'salvador diaz mriron', 753140, 300, 'Matutino', 456),
	(700, 'jose', 'hrndz', 'salvaodr', 753140113, 500, 'Matutino', 69);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;

-- Volcando estructura para tabla tintoreria.gastos
DROP TABLE IF EXISTS `gastos`;
CREATE TABLE IF NOT EXISTS `gastos` (
  `idGastos` int(11) NOT NULL,
  `luz` float NOT NULL,
  `Agua` float NOT NULL,
  `Renta` float NOT NULL,
  `fechaPagos` date NOT NULL,
  `idEmpleados` int(11) NOT NULL,
  PRIMARY KEY (`idGastos`),
  KEY `idEmpleados` (`idEmpleados`),
  CONSTRAINT `gastos_ibfk_1` FOREIGN KEY (`idEmpleados`) REFERENCES `empleados` (`idEmpleados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tintoreria.gastos: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `gastos` DISABLE KEYS */;
INSERT INTO `gastos` (`idGastos`, `luz`, `Agua`, `Renta`, `fechaPagos`, `idEmpleados`) VALUES
	(2, 12, 12, 12, '0003-03-03', 111),
	(12, 2, 2, 2, '0001-01-01', 111),
	(111111111, 11, 1, 1, '0002-02-02', 1);
/*!40000 ALTER TABLE `gastos` ENABLE KEYS */;

-- Volcando estructura para tabla tintoreria.servicios
DROP TABLE IF EXISTS `servicios`;
CREATE TABLE IF NOT EXISTS `servicios` (
  `idServicios` int(11) NOT NULL,
  `NumeroPrendas` int(11) NOT NULL,
  `PrecioTotal` float NOT NULL,
  `FechaIngreso` date DEFAULT NULL,
  `idClientes` int(11) NOT NULL,
  `idEmpleados` int(11) NOT NULL,
  PRIMARY KEY (`idServicios`),
  KEY `idClientes` (`idClientes`),
  KEY `idEmpleados` (`idEmpleados`),
  CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`idClientes`) REFERENCES `clientes` (`idClientes`),
  CONSTRAINT `servicios_ibfk_2` FOREIGN KEY (`idEmpleados`) REFERENCES `empleados` (`idEmpleados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tintoreria.servicios: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` (`idServicios`, `NumeroPrendas`, `PrecioTotal`, `FechaIngreso`, `idClientes`, `idEmpleados`) VALUES
	(1, 200, 100, '1998-11-16', 1, 1),
	(2, 2, 2, '1998-11-11', 1, 1),
	(3, 3, 3, '1998-11-15', 1, 1),
	(4, 10, 100, '2018-05-09', 1, 1),
	(111, 1, 1, '0001-01-01', 1, 1);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;



drop database tintoreria;