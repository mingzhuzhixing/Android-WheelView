package com.v.wheelview.listener;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

import com.v.wheelview.view.WheelView;

public final class LoopViewGestureListener extends SimpleOnGestureListener {
    private final WheelView wheelView;

    public LoopViewGestureListener(WheelView wheelView) {
        this.wheelView = wheelView;
    }

    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        this.wheelView.scrollBy(velocityY);
        return true;
    }
}