package com.company.practice.practice_1_interface;

public class Second {
    Trial trialInterface;

    void buildInterface(Trial trialInterface){
        this.trialInterface = trialInterface;
    }

    void sendMessageNoParameter(){
        trialInterface.fromInterface("INI PESAN TANPA PARAMETER DARI INTERFACE");
    }

    void sendMessageWithParameter(String key){
        trialInterface.fromInterface(key);
    }
}
