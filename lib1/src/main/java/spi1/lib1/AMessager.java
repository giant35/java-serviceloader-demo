/*
 *  copyright (c) thelook.cn
 */
package spi1.lib1;

import spi1.api.Messager;

/**
 *
 * @author 老唐
 */
public class AMessager implements Messager {

    @Override
    public void sendMsg(String to, String msg) {
        System.out.println("hello " + to + " , " + msg);
    }

}
