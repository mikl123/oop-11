package com.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
     MailjetClient client;
    MailjetRequest request;
    MailjetResponse response;
    String API_KEY  = "";
String API_SECRET ="";
    public void sendMail(MailInfo info) throws MailjetException, MailjetSocketTimeoutException{
        String text;
    if (info.getMailCode()==1){
         text = "Happy birthday";
    }else{
         text = "Hello";
    }
    client = new MailjetClient(API_KEY, API_SECRET, new ClientOptions("v3.1"));
    request = new MailjetRequest(Emailv31.resource)
    .property(Emailv31.MESSAGES, new JSONArray()
    .put(new JSONObject()
    .put(Emailv31.Message.FROM, new JSONObject()
    .put("Email", "mishaemail211@gmail.com")
    .put("Name", "Mykhailo"))
    .put(Emailv31.Message.TO, new JSONArray()
    .put(new JSONObject()
    .put("Email", info.getClient().getEmail())
    .put("Name", info.getClient().getName())))
    .put(Emailv31.Message.SUBJECT, "Greetings from Mykhailo." )
    .put(Emailv31.Message.TEXTPART, "Your personal data")
    .put(Emailv31.Message.HTMLPART, "<h3> "+text+" dear "+info.getClient().getName()+" your gender: "+info.getClient().getSex())
    .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
    response = client.post(request);
    System.out.println(response.getStatus());
    System.out.println(response.getData());

    }
}
