package com.thoughtworks.tdd;

public class Fizzbuzz {
    int number=0;

    public String Fizz_buzz(int num){
        String result="";
        int flag=1;
        number=num;
        if(number%3==0) {
            result += "Fizz";
            number /= 3;
            flag=0;
        }
        if(number%5==0) {
            result += "Buzz";
            number /=5;
            flag=0;
        }
        if(number%7==0) {
            result += "Whizz";
            flag=0;
        }
        if(flag==1)
            result+=number;
        return result;

    }
}
