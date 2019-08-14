package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecttemplate1 {

        Projecttemplate1Delegate projecttemplate1Delegate = new Projecttemplate1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecttemplate1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}