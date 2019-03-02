package com.renosdata.testc.mvp.view;

/**
 * 基类
 *
 * @author orange
 * @time 2019-03-03 01:14
 */
public interface BaseView<T> {
    /**
     * 设置presenter
     *
     * @param presenter p
     */
    void setPresenter(T presenter);
}
