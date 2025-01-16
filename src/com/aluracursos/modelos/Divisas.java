package com.aluracursos.modelos;

import java.util.HashMap;
import java.util.Map;

public class Divisas {

    // Declarar el Map como un atributo de la clase con nombre divisas
    private Map<Integer, String> divisas;

    // Constructor de la clase Divisas
    public Divisas() {
      divisas = new HashMap<>(); // se inicializa el map anteriormente nombrado divisas

        // se añaden las divisas al map
        divisas.put(1, "AED");
        divisas.put(2, "AFN");
        divisas.put(3, "ALL");
        divisas.put(4, "AMD");
        divisas.put(5, "ANG");
        divisas.put(6, "AOA");
        divisas.put(7, "ARS");
        divisas.put(8, "AUD");
        divisas.put(9, "AWG");
        divisas.put(10, "AZN");
        divisas.put(11, "BAM");
        divisas.put(12, "BBD");
        divisas.put(13, "BDT");
        divisas.put(14, "BGN");
        divisas.put(15, "BHD");
        divisas.put(16, "BIF");
        divisas.put(17, "BMD");
        divisas.put(18, "BND");
        divisas.put(19, "BOB");
        divisas.put(20, "BRL");
        divisas.put(21, "BSD");
        divisas.put(22, "BTN");
        divisas.put(23, "BWP");
        divisas.put(24, "BYN");
        divisas.put(25, "BZD");
        divisas.put(26, "CAD");
        divisas.put(27, "CDF");
        divisas.put(28, "CHF");
        divisas.put(29, "CLP");
        divisas.put(30, "CNY");
        divisas.put(31, "COP");
        divisas.put(32, "CRC");
        divisas.put(33, "CUP");
        divisas.put(34, "CVE");
        divisas.put(35, "CZK");
        divisas.put(36, "DJF");
        divisas.put(37, "DKK");
        divisas.put(38, "DOP");
        divisas.put(39, "DZD");
        divisas.put(40, "EGP");
        divisas.put(41, "ERN");
        divisas.put(42, "ETB");
        divisas.put(43, "EUR");
        divisas.put(44, "FJD");
        divisas.put(45, "FKP");
        divisas.put(46, "FOK");
        divisas.put(47, "GBP");
        divisas.put(48, "GEL");
        divisas.put(49, "GGP");
        divisas.put(50, "GHS");
        divisas.put(51, "GIP");
        divisas.put(52, "GMD");
        divisas.put(53, "GNF");
        divisas.put(54, "GTQ");
        divisas.put(55, "GYD");
        divisas.put(56, "HKD");
        divisas.put(57, "HNL");
        divisas.put(58, "HRK");
        divisas.put(59, "HTG");
        divisas.put(60, "HUF");
        divisas.put(61, "IDR");
        divisas.put(62, "ILS");
        divisas.put(63, "IMP");
        divisas.put(64, "INR");
        divisas.put(65, "IQD");
        divisas.put(66, "IRR");
        divisas.put(67, "ISK");
        divisas.put(68, "JEP");
        divisas.put(69, "JMD");
        divisas.put(70, "JOD");
        divisas.put(71, "JPY");
        divisas.put(72, "KES");
        divisas.put(73, "KGS");
        divisas.put(74, "KHR");
        divisas.put(75, "KID");
        divisas.put(76, "KMF");
        divisas.put(77, "KRW");
        divisas.put(78, "KWD");
        divisas.put(79, "KYD");
        divisas.put(80, "KZT");
        divisas.put(81, "LAK");
        divisas.put(82, "LBP");
        divisas.put(83, "LKR");
        divisas.put(84, "LRD");
        divisas.put(85, "LSL");
        divisas.put(86, "LYD");
        divisas.put(87, "MAD");
        divisas.put(88, "MDL");
        divisas.put(89, "MGA");
        divisas.put(90, "MKD");
        divisas.put(91, "MMK");
        divisas.put(92, "MNT");
        divisas.put(93, "MOP");
        divisas.put(94, "MRU");
        divisas.put(95, "MUR");
        divisas.put(96, "MVR");
        divisas.put(97, "MWK");
        divisas.put(98, "MXN");
        divisas.put(99, "MYR");
        divisas.put(100, "MZN");
        divisas.put(101, "NAD");
        divisas.put(102, "NGN");
        divisas.put(103, "NIO");
        divisas.put(104, "NOK");
        divisas.put(105, "NPR");
        divisas.put(106, "NZD");
        divisas.put(107, "OMR");
        divisas.put(108, "PAB");
        divisas.put(109, "PEN");
        divisas.put(110, "PGK");
        divisas.put(111, "PHP");
        divisas.put(112, "PKR");
        divisas.put(113, "PLN");
        divisas.put(114, "PYG");
        divisas.put(115, "QAR");
        divisas.put(116, "RON");
        divisas.put(117, "RSD");
        divisas.put(118, "RUB");
        divisas.put(119, "RWF");
        divisas.put(120, "SAR");
        divisas.put(121, "SBD");
        divisas.put(122, "SCR");
        divisas.put(123, "SDG");
        divisas.put(124, "SEK");
        divisas.put(125, "SGD");
        divisas.put(126, "SHP");
        divisas.put(127, "SLE");
        divisas.put(128, "SOS");
        divisas.put(129, "SRD");
        divisas.put(130, "SSP");
        divisas.put(131, "STN");
        divisas.put(132, "SYP");
        divisas.put(133, "SZL");
        divisas.put(134, "THB");
        divisas.put(135, "TJS");
        divisas.put(136, "TMT");
        divisas.put(137, "TND");
        divisas.put(138, "TOP");
        divisas.put(139, "TRY");
        divisas.put(140, "TTD");
        divisas.put(141, "TVD");
        divisas.put(142, "TWD");
        divisas.put(143, "TZS");
        divisas.put(144, "UAH");
        divisas.put(145, "UGX");
        divisas.put(146, "USD");
        divisas.put(147, "UYU");
        divisas.put(148, "UZS");
        divisas.put(149, "VES");
        divisas.put(150, "VND");
        divisas.put(151, "VUV");
        divisas.put(152, "WST");
        divisas.put(153, "XAF");
        divisas.put(154, "XCD");
        divisas.put(155, "XDR");
        divisas.put(156, "XOF");
        divisas.put(157, "XPF");
        divisas.put(158, "YER");
        divisas.put(159, "ZAR");
        divisas.put(160, "ZMW");
        divisas.put(161, "ZWL");
    }
    // Método para obtener una divisa por su clave
    public String get(int clave) {
        return divisas.get(clave);  // Retorna el valor correspondiente a la clave
    }

}