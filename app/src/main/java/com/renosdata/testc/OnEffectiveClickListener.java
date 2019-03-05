package com.renosdata.testc;

import android.view.View;

/**
 * @author orange
 * @time 2019-03-02 13:01
 */
public abstract class OnEffectiveClickListener implements View.OnClickListener {

    private static long mLastClickTime = System.currentTimeMillis();
    private static final int ST_EFFECTIVECLICKINTERVAL = 800;


    public OnEffectiveClickListener() {
        super();
    }

    @Override
    public void onClick(View v) {

        try {
            if (isEffectiveClick()) {
                onEffectiveClick(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void onEffectiveClick(View v);

    private synchronized static boolean isEffectiveClick() {
        long current = System.currentTimeMillis();
        long dt = System.currentTimeMillis() - mLastClickTime;
        if (Math.abs(dt) >= ST_EFFECTIVECLICKINTERVAL) {
            mLastClickTime = current;
            return true;
        }
        return false;
    }

}
