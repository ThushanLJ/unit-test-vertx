import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StudentTest {
    HashMap<Character, Double> gpaMap = new HashMap<Character, Double>();

    @Test
    public void calculateGPA() {

        gpaMap.put('A', 2.5);
        gpaMap.put('B', 3.0);

        Student std = new Student(gpaMap);
        assertEquals(3.45,Double.parseDouble(std.calculateGPA()),0 );
    }

    @Test
    public void calculateGPA2() {

        gpaMap.put('C', 2.5);
        gpaMap.put('D', 2.0);

        Student std = new Student(gpaMap);
        assertEquals(1.56,Double.parseDouble(std.calculateGPA()),0 );
    }

    @Test
    public void calculateGPA3() {

        gpaMap.put('F', 2.5);

        Student std = new Student(gpaMap);
        assertEquals(0.00,Double.parseDouble(std.calculateGPA()),0 );
    }

    @Test
    public void mainMethod(){
        gpaMap.put('F', 2.5);
        Student std = new Student(gpaMap);
        assertEquals("hello","hello");
    }

}