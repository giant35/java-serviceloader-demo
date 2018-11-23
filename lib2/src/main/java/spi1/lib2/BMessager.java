/*
 *  copyright (c) thelook.cn
 */
package spi1.lib2;

import spi1.api.Messager;

/**
 *
 * @author 老唐
 */
public class BMessager implements Messager {

    @Override
    public void sendMsg(String to, String msg) {
        System.out.println("BMessage how are yuo ?" + to + " msg:" + msg);
    }

}
