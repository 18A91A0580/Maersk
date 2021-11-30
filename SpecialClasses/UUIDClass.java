package SpecialClasses;

import java.util.UUID;

public class UUIDClass {
    public static void main(String[] args){
        //UUID--> Universally Unique Identifiers
        //provides alpha-numeric 128 bit value
        for(int i=1;i<=5;i++){
            System.out.println(UUID.randomUUID());
        }
    }
}
