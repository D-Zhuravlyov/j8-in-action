package com.zhur;

import com.zhur.util.Letter;

import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {

        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline
                = addHeader.andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);

        System.out.println(transformationPipeline.apply("this is inside labda"));
    }
}
