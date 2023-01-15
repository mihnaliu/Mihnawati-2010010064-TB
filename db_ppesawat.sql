-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2023 at 11:46 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ppesawat`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `nama_penumpang` varchar(50) NOT NULL,
  `maskapai_class` varchar(50) NOT NULL,
  `harga_tiket` int(30) NOT NULL,
  `jumlah_tiket` int(30) NOT NULL,
  `total` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_penjualan`
--

INSERT INTO `tb_penjualan` (`id_penjualan`, `nama_penumpang`, `maskapai_class`, `harga_tiket`, `jumlah_tiket`, `total`) VALUES
(12344, 'Mihna', 'GARUDA - First Class', 5289000, 3, 15867000),
(12455, 'Jeno', 'GARUDA - Bisnis', 4367000, 2, 8734000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_penumpang`
--

CREATE TABLE `tb_penumpang` (
  `kode_penumpang` int(10) DEFAULT NULL,
  `nama_penumpang` varchar(50) NOT NULL,
  `no_identitas` int(20) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `usia` int(10) NOT NULL,
  `no_telpon` int(15) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_penumpang`
--

INSERT INTO `tb_penumpang` (`kode_penumpang`, `nama_penumpang`, `no_identitas`, `jenis_kelamin`, `usia`, `no_telpon`, `alamat`) VALUES
(1234, 'Mihna', 2335789, 'Perempuan', 20, 85543568, 'Banjarbaru'),
(1235, 'Jeno', 2345677, 'Laki-laki', 22, 856787750, 'Banjarbaru'),
(4768, 'yuta', 2455678, 'Laki-laki', 25, 899807844, 'Bandung'),
(4877, 'jisung', 24567761, 'Laki-laki', 20, 899654556, 'Bandung'),
(56456, 'Ten', 245678, 'Laki-laki', 25, 865778099, 'Surabaya'),
(67987, 'Jaehyun', 247785, 'Laki-laki', 24, 866754047, 'Banjarbaru'),
(43221, 'Haechan', 236557, 'Laki-laki', 22, 855446001, 'Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pesawat`
--

CREATE TABLE `tb_pesawat` (
  `id_pesawat` int(15) NOT NULL,
  `maskapai_class` varchar(70) NOT NULL,
  `kota_awal` varchar(50) NOT NULL,
  `kota_tujuan` varchar(50) NOT NULL,
  `harga_tiket` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pesawat`
--

INSERT INTO `tb_pesawat` (`id_pesawat`, `maskapai_class`, `kota_awal`, `kota_tujuan`, `harga_tiket`) VALUES
(12337, 'SRIWIJAYA - Ekonomi', 'Makasar', 'Jakarta Selatan', 1385000),
(13552, 'GARUDA - Ekonomi', 'Jakarta', 'Surabaya', 3685000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`id_penjualan`);

--
-- Indexes for table `tb_pesawat`
--
ALTER TABLE `tb_pesawat`
  ADD PRIMARY KEY (`id_pesawat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
