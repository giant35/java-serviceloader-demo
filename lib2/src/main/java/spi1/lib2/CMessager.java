/*
 *  copyright (c) thelook.cn
 */
package spi1.lib2;

import spi1.api.Messager;

/**
 *
 * @author 老唐
 */
public class CMessager implements Messager {

    @Override
    public void sendMsg(String to, String msg) {
        System.out.println("CMessage ?" + to + " msg:" + msg);//will not work ,not in file /META-INF/services/spi1.api.Messager
    }

}
