import org.junit.Test
import kotlin.test.assertEquals

class AdventDay1 {

    @Test
    fun `expense report return value`() {
        val actual = expenseReport(sampleData)
        val expect = 514579
        assertEquals(expect, actual)
    }

    @Test
    fun `expense 2 report return value`() {
        val actual = expenseReportUpgrade(sampleData)
        val expect = 514579
        assertEquals(expect, actual.first* actual.second)
    }

    @Test
    fun `expense report part two return value`() {
        val actual = expenseReportUpgradePartTwo(actualData)
//        val expect = 241861950
        val expect = 131248694
        assertEquals(expect, actual)
    }

    @Test
    fun `expense report part two buena final final esta si es copy return value`() {
        val actual = expenseReportUpgradePartTwoBuenaFinalFinal(sampleData)
        val expect = 241861950
//        val expect = 131248694
        assertEquals(expect, actual)
    }

    val sampleData = listOf(
        1721,
        979,
        366,
        299,
        675,
        1456,
    )

    val actualData = listOf(
        1535,
        1908,
        1783,
        1163,
        1472,
        1809,
        1566,
        1919,
        1562,
        1532,
        1728,
        1999,
        1942,
        337,
        1135,
        2006,
        1083,
        1483,
        1688,
        1511,
        1134,
        1558,
        1139,
        1790,
        1406,
        1255,
        1627,
        1941,
        1619,
        2009,
        1453,
        1806,
        1756,
        1634,
        1026,
        1847,
        1520,
        1914,
        1836,
        1440,
        1839,
        1527,
        1638,
        1642,
        1776,
        1148,
        1958,
        1616,
        1952,
        1092,
        1081,
        1898,
        1487,
        2000,
        1921,
        1579,
        54,
        1031,
        1842,
        1006,
        1781,
        1964,
        168,
        1339,
        1094,
        1997,
        1522,
        1962,
        1837,
        1730,
        1244,
        1593,
        1752,
        1400,
        1330,
        1649,
        1639,
        1493,
        1696,
        2003,
        1612,
        1717,
        1835,
        861,
        1950,
        1896,
        557,
        1926,
        571,
        1725,
        1229,
        1213,
        1625,
        1553,
        1204,
        1459,
        1666,
        1723,
        1118,
        1845,
        1663,
        1829,
        1929,
        1880,
        1738,
        1887,
        1605,
        1273,
        1759,
        1932,
        1156,
        1712,
        1767,
        1241,
        1159,
        1476,
        1705,
        1768,
        1680,
        1543,
        2010,
        1849,
        1289,
        1636,
        1894,
        1823,
        1706,
        1239,
        1802,
        1744,
        1584,
        1690,
        1758,
        1618,
        1749,
        1521,
        1594,
        1960,
        1479,
        1022,
        1559,
        1106,
        1755,
        1254,
        1878,
        1243,
        1418,
        1671,
        1895,
        1120,
        1673,
        1719,
        1904,
        724,
        1945,
        1940,
        1819,
        1939,
        1103,
        2008,
        1791,
        1874,
        1544,
        1892,
        1557,
        1617,
        1998,
        1641,
        1907,
        1563,
        1089,
        1086,
        1276,
        1591,
        1614,
        1216,
        1658,
        1514,
        1899,
        1760,
        1797,
        1831,
        277,
        1622,
        1795,
        1468,
        1537,
        1742,
        1709,
        1886,
        1846,
        1567,
        1492,
        1549,
        1587,
        1818,
        1687,
        1404,
        1778,
        1096,
    )

}