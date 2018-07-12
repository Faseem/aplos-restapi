package com.aplos.transformer;

/**
 * Created by Aux072 on 18/04/2018.
 */
public interface BaseTransformer<T, I> {

    I transform(T type);

    T reverseTransform(I type);
}