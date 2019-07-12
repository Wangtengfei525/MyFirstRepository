package com.Adapterpatterns;

/**
 * @author 王腾飞
 * @date 2019/6/22 18:31
 */
public class Parrort implements   Bird {

    @Override
    public void chirp() {
        System.out.println("鹦鹉的叫声");
    }

    @Override
    public void fly() {
        System.out.println("鹦鹉的飞");
    }
}
