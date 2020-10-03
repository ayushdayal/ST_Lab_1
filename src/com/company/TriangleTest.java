package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private void createTriangleAndAssertValue(int i, int i1, int i2, String expectedValue) {
        try {
            String actualValue = Triangle.checkTriangle(i, i1, i2);
            assertEquals(expectedValue, actualValue);

        } catch (Exception e) {
            assertEquals(expectedValue, e.getMessage());
        }

    }

    //BVC testing

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC1() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom, nom1, nom, "isosceles triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC2() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom, nom1, min, "not triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC3() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom, nom1, max, "scalene triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC4() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom, nom1, justAboveMin, "scalene triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC5() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom, nom1, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC6() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom1, nom2, min, "not triangle");
        ;
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC7() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom1, nom2, max, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC8() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom1, nom2, justAboveMin, "not triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC9() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom2, nom, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC10() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom1, nom2, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC11() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;

        createTriangleAndAssertValue(nom2, nom, min, "not triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC12() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom2, nom, max, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_BVC13() {
        int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55;
        createTriangleAndAssertValue(nom2, nom, justAboveMin, "not triangle");
    }


    /* @org.junit.jupiter.api.Test
     void checkTriangle_Robustness() {

         assertAll(
                 createTriangleAndAssertValue(nom, nom1, nom, "equilateral triangle"),
                 createTriangleAndAssertValue(nom, nom1, min, "isosceles triangle"),
                 createTriangleAndAssertValue(nom, nom1, max, "not triangle"),
                 createTriangleAndAssertValue(nom, nom1, justAboveMin, "isosceles triangle"),
                 createTriangleAndAssertValue(nom, nom1, justBelowMax, "isosceles triangle"),

                 createTriangleAndAssertValue(nom1, nom2, min, "isosceles triangle"),
                 createTriangleAndAssertValue(nom1, nom2, max, "not triangle"),
                 createTriangleAndAssertValue(nom1, nom2, justAboveMin, "isosceles triangle"),
                 createTriangleAndAssertValue(nom1, nom2, justBelowMax, "isosceles triangle"),


                 createTriangleAndAssertValue(nom2, nom, min, "isosceles triangle"),
                 createTriangleAndAssertValue(nom2, nom, max, "not triangle"),
                 createTriangleAndAssertValue(nom2, nom, justAboveMin, "isosceles triangle"),
                 createTriangleAndAssertValue(nom2, nom, justBelowMax, "isosceles triangle"),
                 createTriangleAndAssertValue(nom, nom1, justAboveMax, "side out of range");


         );
     }
 */
    ////// robustness testing
    int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, nom2 = 55, justBelowMin = 0, justAboveMax = 101;

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness1() {

        createTriangleAndAssertValue(nom, nom1, nom, "isosceles triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness2() {

        createTriangleAndAssertValue(nom, nom1, min, "not triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness3() {

        createTriangleAndAssertValue(nom, nom1, max, "scalene triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness4() {

        createTriangleAndAssertValue(nom, nom1, justAboveMin, "scalene triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness5() {

        createTriangleAndAssertValue(nom, nom1, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness6() {

        createTriangleAndAssertValue(nom1, nom2, min, "not triangle");
        ;
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness7() {

        createTriangleAndAssertValue(nom1, nom2, max, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness8() {

        createTriangleAndAssertValue(nom1, nom2, justAboveMin, "not triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness9() {

        createTriangleAndAssertValue(nom2, nom, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness10() {

        createTriangleAndAssertValue(nom1, nom2, justBelowMax, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness11() {


        createTriangleAndAssertValue(nom2, nom, min, "not triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness12() {

        createTriangleAndAssertValue(nom2, nom, max, "scalene triangle");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness13() {

        createTriangleAndAssertValue(nom2, nom, justAboveMin, "not triangle");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness14() {

        createTriangleAndAssertValue(nom, nom1, justBelowMin, "side out of range");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness15() {

        createTriangleAndAssertValue(nom, nom1, justAboveMax, "side out of range");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness16() {

        createTriangleAndAssertValue(nom1, nom2, justBelowMin, "side out of range");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness17() {

        createTriangleAndAssertValue(nom1, nom2, justAboveMax, "side out of range");

    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness18() {

        createTriangleAndAssertValue(nom, nom2, justBelowMin, "side out of range");
    }

    @org.junit.jupiter.api.Test
    void checkTriangle_Robusteness19() {

        createTriangleAndAssertValue(nom, nom2, justAboveMin, "not triangle");
    }

    // WorstCase testing

    @Test
    void WorstCaseTesting() {
        Collection<Executable> allCases = new ArrayList<>();
        int[] input = new int[]{1, 100, 50, 2, 99, 51, 55};

        for (int i : input)
            for (int j : input)
                for (int k : input)
                    allCases.add(createTriangle(i, j, k));
        assertAll(allCases);
    }

    private Executable createTriangle(int i, int j, int k) {
        Boolean expectedValue = Boolean.TRUE;
        Boolean actualValue;
        try {
            Triangle.checkTriangle(i, j, k);
            actualValue = Boolean.TRUE;
        } catch (Exception e) {
            actualValue = Boolean.FALSE;
        }
        Boolean finalActualValue = actualValue;
        return () -> assertEquals(expectedValue, finalActualValue);
    }

}