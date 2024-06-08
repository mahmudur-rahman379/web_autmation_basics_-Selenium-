package com.rafat;

import org.testng.annotations.*;

public class Testng_annotation_example {
    @BeforeSuite
    //browser open ,one time usable
public void beforesuit_example()
{
    System.out.println("before suite example");
}
    @BeforeTest
    // 1st before test then Before class
    public void before_test_example() {
        System.out.println("before test example");
    }
    @BeforeClass
//first run method in a class
    public void beforclass_example(){
        System.out.println("beforclass example");
    }
    @BeforeMethod
    //1st run before method then run test
    public void before_method_example() {
        System.out.println("before method example");
    }
    @Test (priority = 1)
//log in ,reg other operations
    public void test_example1(){
        System.out.println("test example1");
    }
    @Test (priority = 2)
//log in ,reg other operations
    public void test_example2(){
        System.out.println("test example2");
    }
    @AfterMethod
    //1st run test then After method
    public void after_method_example() {
        System.out.println("after method example");

    }
    @AfterClass
    //method run after all the operation run in class
    public void afterclass_example() {
        System.out.println("afterclass example");
    }
    @AfterTest
    //!st after class then after test
    public void after_test_example() {
        System.out.println("after test example");
    }

    @AfterSuite
//use one time and for close browser
public void aftersuit_example()
{
    System.out.println("after suite example");
}
}
