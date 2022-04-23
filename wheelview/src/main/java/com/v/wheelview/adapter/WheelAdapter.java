package com.v.wheelview.adapter;

public interface WheelAdapter<T> {
    int getItemsCount();

    T getItem(int var1);

    int indexOf(T var1);
}
