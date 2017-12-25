package com.renosdata.hellojni;

/**
 * 创建者    吴岩桔
 * 创建时间  2017/12/15  16:36.
 * 描述
 * 更新者
 * 更新时间  2017/12/15  16:36.
 */

public class JniUtil {


    public JniUtil(){

    }
    //该方法为java调用c/c++的接口
    public static native String hello();
    static{
        System.loadLibrary("HelloJni");//注意这个名字是我们在build.gradle中ndk中配置的moduleName
    }
}
