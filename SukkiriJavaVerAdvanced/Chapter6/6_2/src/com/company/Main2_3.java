package com.company;

import java.util.function.IntToDoubleFunction;

/**
 * Created by RyomaArai on 15/05/05.
 */
public class Main2_3 {
    double b = 2.1;

    IntToDoubleFunction func = (x) -> {
        return b * x;
    };

}
