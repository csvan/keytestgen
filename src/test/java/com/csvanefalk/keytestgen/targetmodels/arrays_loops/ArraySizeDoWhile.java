package com.csvanefalk.keytestgen.targetmodels.arrays_loops;

public class ArraySizeDoWhile {
    public static int size(int[] array) {
        int result = 0;
        int i = 0;
        /*@ loop_invariant i >= 0 && i <= array.length && result == i;
          @ decreasing array.length - i;
		  @ assignable \strictly_nothing;
		  @*/
        do {
            result++;
            i++;
        }
        while (i < array.length);
        return result;
    }
}
