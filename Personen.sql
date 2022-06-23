-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: mysqldb
-- Erstellungszeit: 23. Jun 2022 um 08:29
-- Server-Version: 8.0.29
-- PHP-Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `Personen`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Person`
--

CREATE TABLE `Person` (
  `id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `vorname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `geburtsdatum` date NOT NULL,
  `geschlecht` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `Person`
--

INSERT INTO `Person` (`id`, `name`, `vorname`, `email`, `geburtsdatum`, `geschlecht`) VALUES
(1, 'Huber', 'Yves', 'yves.huber@lernende.bbw.ch', '2014-11-20', 'm'),
(2, 'Bertschi', 'Tobias', 'tobias.bertschi@lernende.bbw.ch', '2012-11-20', 'm');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `Person`
--
ALTER TABLE `Person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `Person`
--
ALTER TABLE `Person`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
