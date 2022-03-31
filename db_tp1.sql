-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2022 at 06:55 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tp1`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_author`
--

CREATE TABLE `tabel_author` (
  `id` int(11) NOT NULL,
  `img` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `juml` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_author`
--

INSERT INTO `tabel_author` (`id`, `img`, `nama`, `juml`) VALUES
(1, 'https://asset.kompas.com/crops/WKpnsRuD7PdqqC7pbLncvc3g9pQ=/0x0:780x520/750x500/data/photo/2019/08/12/5d50d755e3a37.jpg', 'Pramoedya Ananta Toer', 50),
(2, 'http://bctemas.beacukai.go.id/wp-content/uploads/2015/07/Buya_Hamka.jpeg.jpeg', 'Buya Hamka', 3),
(3, 'saya', 'ww', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_buku`
--

CREATE TABLE `tabel_buku` (
  `id` int(11) NOT NULL,
  `img` varchar(255) NOT NULL,
  `penerbit` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `deskr` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_buku`
--

INSERT INTO `tabel_buku` (`id`, `img`, `penerbit`, `author`, `deskr`) VALUES
(1, 'https://cdn.gramedia.com/uploads/items/bumi-manusia-edit__w600_hauto.jpg', 'Hasta Mitra', 'Pramoedya Ananta Toer', 'Bumi Manusia\r\nBuku oleh Pramoedya Ananta Toer'),
(2, 'https://upload.wikimedia.org/wikipedia/id/0/0b/Habis_gelap_terbitlah_terang.jpg', 'Balai Pustaka', 'Kartini', 'Habis Gelap Terbitlah Terang\r\nBuku oleh Kartini'),
(3, 'Image', 'Penerbit', 'Author', 'Deskripsi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_author`
--
ALTER TABLE `tabel_author`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_buku`
--
ALTER TABLE `tabel_buku`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_author`
--
ALTER TABLE `tabel_author`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tabel_buku`
--
ALTER TABLE `tabel_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
