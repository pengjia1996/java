package com.pengjia.design.model.factory_pattern.example3.v1;



import java.util.Scanner;

/**
 * 计算
 * @author pengjia
 * @date 2022/6/16 17:07
 */
public class Calculate {

    //实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第1个数字：");
        double number1 = sc.nextDouble();
        System.out.println("请输入运算符号（+，=，*，/）：");
        String operate = sc.next();

        System.out.println("请输入第2个数字：");
        double number2 = sc.nextDouble();
        double result = 0;
        switch (operate){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;

        }

        System.out.println(number1+operate+number2+"="+result);

    }




}
