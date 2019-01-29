package com.self.core.VAR.models

object TestData extends Serializable {
  val canadaLaborData = Array(
    "1980-01", 929.6105, 405.3665, 386.1361,  7.53,
    "1980-04", 929.8040, 404.6398, 388.1358,  7.70,
    "1980-07", 930.3184, 403.8149, 390.5401,  7.47,
    "1980-10", 931.4277, 404.2158, 393.9638,  7.27,
    "1981-01", 932.6620, 405.0467, 396.7647,  7.37,
    "1981-04", 933.5509, 404.4167, 400.0217,  7.13,
    "1981-07", 933.5315, 402.8191, 400.7515,  7.40,
    "1981-10", 933.0769, 401.9773, 405.7335,  8.33,
    "1982-01", 932.1238, 402.0897, 409.0504,  8.83,
    "1982-04", 930.6359, 401.3067, 411.3984, 10.43,
    "1982-07", 929.0971, 401.6302, 413.0194, 12.20,
    "1982-10", 928.5633, 401.5638, 415.1670, 12.77,
    "1983-01", 929.0694, 402.8157, 414.6621, 12.43,
    "1983-04", 930.2655, 403.1421, 415.7319, 12.23,
    "1983-07", 931.6770, 403.0786, 416.2315, 11.70,
    "1983-10", 932.1390, 403.7188, 418.1439, 11.20,
    "1984-01", 932.2767, 404.8668, 419.7352, 11.27,
    "1984-04", 932.8328, 405.6362, 420.4842, 11.47,
    "1984-07", 933.7334, 405.1363, 420.9309, 11.30,
    "1984-10", 934.1772, 406.0246, 422.1124, 11.17,
    "1985-01", 934.5928, 406.4123, 423.6278, 11.00,
    "1985-04", 935.6067, 406.3009, 423.9887, 10.63,
    "1985-07", 936.5111, 406.3354, 424.1902, 10.27,
    "1985-10", 937.4201, 406.7737, 426.1270, 10.20,
    "1986-01", 938.4159, 405.1525, 426.8578,  9.67,
    "1986-04", 938.9992, 404.9298, 426.7457,  9.60,
    "1986-07", 939.2354, 404.5765, 426.8858,  9.60,
    "1986-10", 939.6795, 404.1995, 428.8403,  9.50,
    "1987-01", 940.2497, 405.9499, 430.1223,  9.50,
    "1987-04", 941.4358, 405.8221, 430.2307,  9.03,
    "1987-07", 942.2981, 406.4463, 430.3930,  8.70,
    "1987-10", 943.5322, 407.0512, 432.0284,  8.13,
    "1988-01", 944.3490, 407.9460, 433.3886,  7.87,
    "1988-04", 944.8215, 408.1796, 433.9641,  7.67,
    "1988-07", 945.0671, 408.5998, 434.4844,  7.80,
    "1988-10", 945.8067, 409.0906, 436.1569,  7.73,
    "1989-01", 946.8697, 408.7042, 438.2651,  7.57,
    "1989-04", 946.8766, 408.9803, 438.7636,  7.57,
    "1989-07", 947.2497, 408.3287, 439.9498,  7.33,
    "1989-10", 947.6513, 407.8857, 441.8359,  7.57,
    "1990-01", 948.1840, 407.2605, 443.1769,  7.63,
    "1990-04", 948.3492, 406.7752, 444.3592,  7.60,
    "1990-07", 948.0322, 406.1794, 444.5236,  8.17,
    "1990-10", 947.1065, 405.4398, 446.9694,  9.20,
    "1991-01", 946.0796, 403.2800, 450.1586, 10.17,
    "1991-04", 946.1838, 403.3649, 451.5464, 10.33,
    "1991-07", 946.2258, 403.3807, 452.2984, 10.40,
    "1991-10", 945.9978, 404.0032, 453.1201, 10.37,
    "1992-01", 945.5183, 404.4774, 453.9991, 10.60,
    "1992-04", 945.3514, 404.7868, 454.9552, 11.00,
    "1992-07", 945.2918, 405.2710, 455.4824, 11.40,
    "1992-10", 945.4008, 405.3830, 456.1009, 11.73,
    "1993-01", 945.9058, 405.1564, 457.2027, 11.07,
    "1993-04", 945.9035, 406.4700, 457.3886, 11.67,
    "1993-07", 946.3190, 406.2293, 457.7799, 11.47,
    "1993-10", 946.5796, 406.7265, 457.5535, 11.30,
    "1994-01", 946.7800, 408.5785, 458.8024, 10.97,
    "1994-04", 947.6283, 409.6767, 459.0564, 10.63,
    "1994-07", 948.6221, 410.3858, 459.1578, 10.10,
    "1994-10", 949.3992, 410.5395, 459.7037,  9.67,
    "1995-01", 949.9481, 410.4453, 459.7037,  9.53,
    "1995-04", 949.7945, 410.6256, 460.0258,  9.47,
    "1995-07", 949.9534, 410.8672, 461.0257,  9.50,
    "1995-10", 950.2502, 411.2359, 461.3039,  9.27,
    "1996-01", 950.5380, 410.6637, 461.4031,  9.50,
    "1996-04", 950.7871, 410.8085, 462.9277,  9.43,
    "1996-07", 950.8695, 412.1160, 464.6888,  9.70,
    "1996-10", 950.9281, 412.9994, 465.0717,  9.90,
    "1997-01", 951.8457, 412.9551, 464.2851,  9.43,
    "1997-04", 952.6005, 412.8241, 464.0344,  9.30,
    "1997-07", 953.5976, 413.0489, 463.4535,  8.87,
    "1997-10", 954.1434, 413.6110, 465.0717,  8.77,
    "1998-01", 954.5426, 413.6048, 466.0889,  8.60,
    "1998-04", 955.2631, 412.9684, 466.6171,  8.33,
    "1998-07", 956.0561, 412.2659, 465.7478,  8.17,
    "1998-10", 956.7966, 412.9106, 465.8995,  8.03,
    "1999-01", 957.3865, 413.8294, 466.4099,  7.90,
    "1999-04", 958.0634, 414.2242, 466.9552,  7.87,
    "1999-07", 958.7166, 415.1678, 467.6281,  7.53,
    "1999-10", 959.4881, 415.7016, 467.7026,  6.93,
    "2000-01", 960.3625, 416.8674, 469.1348,  6.80,
    "2000-04", 960.7834, 417.6104, 469.3364,  6.70,
    "2000-07", 961.0290, 418.0030, 470.0117,  6.93,
    "2000-10", 961.7657, 417.2667, 469.6472,  6.87
  )

  implicit class ArrayToMatrix[T](val values: Array[T]){
    def toMatrixArrayByCol(rows: Int, cols: Int) = {
      require(values.lengthCompare(rows * cols) == 0, "Array长度和矩阵行数和列数的乘积不一致")
      Array.range(0, cols).map(col => values.slice(col * rows, (col + 1) * rows))
    }


    def toMatrixArrayByRow(rows: Int, cols: Int) = {
      require(values.lengthCompare(rows * cols) == 0, "Array长度和矩阵行数和列数的乘积不一致")
      Array.range(0, rows).map(row => values.slice(row * cols, (row + 1) * cols))
    }
  }


}