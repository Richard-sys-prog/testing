package org.example.parametertsUtility;

public class ClassEntityManager {

    private int a;
    private int b;
    private String string;

    public ClassEntityManager(int a, int b, String string) {
        this.a = a;
        this.b = b;
        this.string = string;
    }

    public ClassEntityManager() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
