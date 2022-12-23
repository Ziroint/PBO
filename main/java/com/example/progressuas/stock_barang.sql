-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 23, 2022 at 02:14 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stok_barang`
--

-- --------------------------------------------------------

--
-- Table structure for table `stock_barang`
--

CREATE TABLE `stock_barang` (
  `kode_barang` varchar(10) NOT NULL,
  `jenis_barang` varchar(30) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` double NOT NULL,
  `jumlah` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `stock_barang`
--

INSERT INTO `stock_barang` (`kode_barang`, `jenis_barang`, `nama_barang`, `harga`, `jumlah`) VALUES
('A101', 'Pensil', 'Joyko', 9000, 30),
('A102', 'Pensil', 'Faber Castell', 23000, 50),
('A201', 'Pena', 'Standard', 20000, 30),
('A202', 'Pena', 'Joyko', 20000, 30),
('A301', 'Spidol', 'Joyko', 40000, 30),
('A302', 'Spidol', 'Faber Castell', 22000, 20),
('A303', 'Spidol', 'Kenko', 20000, 10),
('B101', 'Buku', 'Kiky (58 lembar) ', 50000, 35),
('B102', 'Buku', 'Sinar Dunia (58 lembar)', 30000, 20),
('B201', 'Buku Gambar', 'Sinar Dunia A3', 50000, 10),
('C101', 'Penghapus Pensil', 'Faber Castell (1 pack 40)', 175000, 10),
('C201', 'Penggaris', 'Penggaris 30 cm (1 lusin)', 35000, 20);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `stock_barang`
--
ALTER TABLE `stock_barang`
  ADD PRIMARY KEY (`kode_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
