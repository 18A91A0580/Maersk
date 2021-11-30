package OOPS;

public class AccessClass {
    public static void main(String[] args){
        AccessSpecifiers a=new AccessSpecifiers();
//        a.privateMethod(); cannot access private method outside the class
        a.defaultMethod();
        a.publicMethod();
        a.protectedMethod();
    }
}

