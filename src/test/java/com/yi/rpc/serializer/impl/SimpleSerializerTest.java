package com.yi.rpc.serializer.impl;

import com.yi.rpc.example.message.SimpleReqMessage;

class SimpleSerializerTest {
    public static void main(String[] args) {
        SimpleReqMessage reqMessage = new SimpleReqMessage("Hello Serializer");
        SimpleSerializer serializer = new SimpleSerializer();
        byte[] bytes = serializer.encode(reqMessage);
        Object obj = serializer.decode(bytes);
        System.out.println(obj);
    }
}