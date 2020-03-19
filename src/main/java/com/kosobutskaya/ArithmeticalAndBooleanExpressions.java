package com.kosobutskaya;

public class ArithmeticalAndBooleanExpressions {

    public static void main(String[] args) {
                     //метод

        int result1 = 5 + 2 / 8; // 2/8=0; 5+0=5;
           //переменная
        System.out.println(result1);

        int result2 = (5 + 2) / 8; // 5+2=7; 7/8=0;
        System.out.println(result2);

//        int result3 = (5 + 2++) / 8;
        // инкрементация литерала (2++) не поддерживается;

//        int result4 = (5 + 2++) / --8;
        // инкрементация литерала (2++), декремент литерала (--8) не поддерживается;

//        int result5 = (5 * 2 >> 2++) / --8;
        // инкрементация литерала (2++), декремент литерала (--8) не поддерживается;

//        int result6 = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8;
        // инкрементация литерала (2++), декремент литерала (--8) не поддерживается;

//        int result7 = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8
//               в java нет оператора =>; инкрементация литерала (2++), декремент литерала (--8) не поддерживается;

        boolean result8 = - 2 > 3 && 12 * 12 <= 119;
//        -2>3 == false; 12*12=144; 144<=119 == false; false && false == false;
        System.out.println(result8);

        boolean result9 = true && false;
//        true && false == false;
        System.out.println(result9);
    }
}
