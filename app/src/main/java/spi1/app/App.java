/*
 *  copyright (c) thelook.cn
 */
package spi1.app;

import java.util.Iterator;
import java.util.ServiceLoader;
import spi1.api.Messager;

/**
 *
 * @author 老唐
 */
public class App {

    public static void main(String[] argv) {
        final Iterator<Messager> ms = ServiceLoader.load(Messager.class).iterator();
        if (!ms.hasNext()) {
            System.out.println("can't found Messager");
            return;
        }
        final String to = "tom";
        final String msg = "hello";
        while (ms.hasNext()) {
            final Messager m = ms.next();
            System.out.println("invoke " + m + ".sendMsg");
            m.sendMsg(to, msg);
        }
    }
}
