package com.csvanefalk.keytestgen.targetmodels.unclassified;

public class IntegerConditionTest {
    private int x;

    public static int y;

    public int compute(int a) {
        if (x == 1) {
            int z = a + 1;
            if (z == 2) {
                if (y == 3) {
                    return 42;
                } else {
                    return -300;
                }
            } else {
                return -200;
            }
        } else {
            return -100;
        }
    }
}
