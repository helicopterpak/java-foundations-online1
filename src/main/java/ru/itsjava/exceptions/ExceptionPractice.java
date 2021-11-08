package ru.itsjava.exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
//        throw new RuntimeException("my runtime exception");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!!");
////            e.printStackTrace();
//        }

//        try {
//            System.out.println("begin");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("CATCH");
////            e.printStackTrace();
//        } finally {
//            System.out.println("FINALLY");
//        }
//        System.out.println("end");

//        try {
//            throw  new RuntimeException();
//        } catch (RuntimeException runtimeException) {
//            System.out.println("runtime exception");
//        } catch (Throwable throwable) {
//            System.out.println("throwable");
//        }
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.division(5, 3));
//        try{
//        System.out.println(calculator.division(5, 0));}
//        catch (CalculatorException ce){
//            System.out.println("error");
//            ce.printStackTrace();
//        }

        Calculator calculator = new Calculator();

//        try {
//            System.out.println(calculator.division(5, 0));
//        } catch (CalculatorException e) {
//            e.printStackTrace();
//        }

        // System.out.println(calculator.division(5, 0));


        Person person = new Person("Fedor", 160);
        person.ageCheck();

    }
}
