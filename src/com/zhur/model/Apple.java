package com.zhur.model;


public class Apple{

    private Integer size;
    private String color = "";

    public Apple() {
    }

    public Apple(int size) {
        this.size = size;
    }

    public Apple(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
