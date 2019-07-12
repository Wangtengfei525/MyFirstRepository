package com.Adapterpatterns;

/**
 * @author 王腾飞
 * @date 2019/6/22 18:34
 */
public class Gooseadapter implements Bird {
   Goose  goose;

    public Gooseadapter(Goose goose) {
        this.goose = goose;
    }


    @Override
    public void chirp() {

        if(goose!=null)
        {
            goose.chirp();
        }
    }

    @Override
    public void fly() {
        System.out.println("鹅不会飞翔");
    }





}
