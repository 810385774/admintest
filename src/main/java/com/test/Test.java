package com.test;

public class Test {

    private String neme;

    public Test(String neme) {
        this.neme = neme;
    }
    public Test() {

    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    @Override
    public String toString() {
        return "Test{" +
                "neme='" + neme + '\'' +
                '}';
    }
}
