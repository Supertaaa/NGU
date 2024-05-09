//package com.example.demo.Aspect;
//
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class PersonServiceAspect {
////    @Before(value = "execution(* com.example.demo.Controller.PersonController.create(String, String, String)) && args(fname, lname, address)")
////    //@Before(value = "execution(* com.example.demo.Controller.*(..)) and args(empId, fname, sname)")
////    public void before(JoinPoint joinPoint, String fname, String lname, String address) {
////        System.out.println("Before method:" + joinPoint.getSignature());
////        System.out.println("Prepare to create a person with name " + fname + " " + lname + " and and address " + address);
////    }
//
//    @Around(value = "execution(* com.example.demo.Controller.PersonController.create(String, String, String)) && args(fname, lname, address)")
//
//    public void around(ProceedingJoinPoint joinPoint, String fname, String lname, String address) throws Throwable {
//        System.out.println("Around method:" + joinPoint.getSignature());
//        System.out.println("Prepare to create a person with name " + fname);
//        joinPoint.proceed();
//        System.out.println("After method:" + joinPoint.getSignature());
//        System.out.println("Created a person with name " + fname + " " + lname);
//    }
//}
