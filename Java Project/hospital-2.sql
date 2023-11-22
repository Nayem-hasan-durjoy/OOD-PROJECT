-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 04, 2022 at 10:17 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_record`
--

CREATE TABLE `doctor_record` (
  `id` varchar(200) NOT NULL,
  `DoctorName` text NOT NULL,
  `Specialization` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_record`
--

INSERT INTO `doctor_record` (`id`, `DoctorName`, `Specialization`) VALUES
('1', 'Dr.Nil', 'Surgery'),
('2', 'Dr.Shakib', 'Urology'),
('3', 'Dr.Shahruk', 'Medicine'),
('4', 'Dr.Rabeya Bosri', 'Pathology'),
('5', 'Dr.Shishir', 'Gynecologist');

-- --------------------------------------------------------

--
-- Table structure for table `patient_record`
--

CREATE TABLE `patient_record` (
  `ID` varchar(200) NOT NULL,
  `Name` text NOT NULL,
  `Disease` text NOT NULL,
  `Date` text NOT NULL,
  `Time` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_record`
--

INSERT INTO `patient_record` (`ID`, `Name`, `Disease`, `Date`, `Time`) VALUES
('1', 'imran', 'AIDS', '03-12-2022', ''),
('2', 'joy', 'dibedex', '03-12-2022', ''),
('3', 'samim', 'fever', '03-12-2022', ''),
('4', 'jony', 'fever', '04-12-2022', '14:59:02:pm');

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `id` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`id`, `username`, `password`) VALUES
('1', 'admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
