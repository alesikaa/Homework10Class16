package Homework10Class16;

public class Task2 {
    /*
    create a method that will take a String as a parameter and
    returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public String  revStr(String str){
        StringBuilder newStr= new StringBuilder(str);
        String revStr=newStr.reverse().toString();
        return revStr;
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println(task2.revStr("Syntax"));

    }
}
