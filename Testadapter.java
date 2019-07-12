package com.Adapterpatterns;

/**
 * @author 王腾飞
 * @date 2019/6/22 18:38
 */
public class Testadapter {
    public static void main(String[] args) {

        System.out.println("鹦鹉会叫也会飞");
        Bird  parrort=new Parrort();
        parrort.chirp();
        parrort.fly();


        System.out.println("------------------------------");
        System.out.println("下面是鹅的处理过程");
        Goose  goose=new Goose();
         Bird goodAdapter=new Gooseadapter(goose);
         goodAdapter.chirp();
         goodAdapter.fly();

    }
}
