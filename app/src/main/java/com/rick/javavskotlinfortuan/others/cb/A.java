package com.rick.javavskotlinfortuan.others.cb;

public class A {
    interface CallBack {
        void onDone();
    }
    void action(CallBack cb) {
        // do things ex. internet
        System.out.println("Download is start.");
        cb.onDone();
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.action(() -> System.out.println("Download is finish."));
    }
}