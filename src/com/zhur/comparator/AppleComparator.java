package com.zhur.comparator;

import com.zhur.model.Apple;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2){
        return a1.getSize().compareTo(a2.getSize());
    }
}

