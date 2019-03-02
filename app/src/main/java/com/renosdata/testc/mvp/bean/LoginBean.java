package com.renosdata.testc.mvp.bean;

import java.io.Serializable;

/**
 * 数据类型
 *
 * @author orange
 * @time 2019-03-03 02:16
 */
public class LoginBean implements Serializable {


    private String mName;
    private String mPassword;
    private String mDate;
    private String mNote;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getNote() {
        return mNote;
    }

    public void setNote(String note) {
        mNote = note;
    }

    public LoginBean(String name, String password) {
        mName = name;
        mPassword = password;
    }

    public LoginBean() {

    }
}
