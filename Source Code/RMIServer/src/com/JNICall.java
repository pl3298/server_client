package com;

public class JNICall {
	
	public native void helloC();

    static {
        System.loadLibrary("HelloWorld");
    }

    public static void main(String[] args) {
        new JNICall().helloC();
    }
	
}
