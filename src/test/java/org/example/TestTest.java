package org.example;


import org.junit.Test;

public class TestTest {

    @Test
    public void add() {
        org.example.Test test =new org.example.Test();
        int result = test.add(1,2);
        assert result==3;
    }


    @Test
    public void sub() {
        org.example.Test test =new org.example.Test();
        int result = test.sub(1,2);
        assert result==0;
    }
}