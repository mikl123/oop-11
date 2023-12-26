package com.example.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class MailBox {
    ArrayList<MailInfo> infos;  
    public MailBox(){
        infos = new ArrayList<>();
    }
    public void addMailInfo(MailInfo info){
        infos.add(info);
    }
    public void sendAll() throws MailjetException, MailjetSocketTimeoutException{
        MailSender sender = new MailSender();
        for(int i = 0; i<this.infos.size(); i++){
            sender.sendMail(infos.get(i));
        }

    }
}
