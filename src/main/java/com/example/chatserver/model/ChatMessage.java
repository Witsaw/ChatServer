package com.example.chatserver.model;


public class ChatMessage {
    private String message;
    private String clientName;
    private String timestamp;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public String getTimeStamp(){
        return timestamp;
    }

    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }
}
