package com.company.practice.practice_1_interface;

public class Main implements Trial{
    Second s = new Second();

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    void init(){
        s.buildInterface(this);
        s.sendMessageWithParameter("HALO");
    }

    @Override
    public void fromInterface(String key) {
        System.out.println("DARI INTERFACE => "+key);
    }
}
