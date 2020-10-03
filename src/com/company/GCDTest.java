package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    private void createGcdAndAssertValue(int i, int i1, int expectedValue) {
        try {
            int actualValue = GCD.findGCD(i, i1);
            assertEquals(expectedValue, actualValue);

        } catch (Exception e) {
            assertEquals("input out of range", e.getMessage());
        }

    }

    int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, justBelowMin = 0, justAboveMax = 101;

    @Test
    void findGCD_BVC1() {
        createGcdAndAssertValue(nom1, justBelowMax, 3);

    }

    @Test
    void findGCD_BVC2() {
        createGcdAndAssertValue(nom, min, 1);

    }

    @Test
    void findGCD_BVC3() {
        createGcdAndAssertValue(nom, max, 50);

    }

    @Test
    void findGCD_BVC4() {
        createGcdAndAssertValue(nom, nom1, 1);

    }

    @Test
    void findGCD_BVC5() {
        createGcdAndAssertValue(nom, justAboveMin, 2);

    }

    @Test
    void findGCD_BVC6() {
        createGcdAndAssertValue(nom, justBelowMax, 1);

    }

    @Test
    void findGCD_BVC7() {

        createGcdAndAssertValue(nom1, min, 1);

    }

    @Test
    void findGCD_BVC8() {
        createGcdAndAssertValue(nom1, max, 1);

    }

    @Test
    void findGCD_BVC9() {
        createGcdAndAssertValue(nom1, justAboveMin, 1);
        createGcdAndAssertValue(nom1, justBelowMax, 3);
    }

    ////  Robustness testing


    @Test
    void findGCD_Roubustness1() {
        createGcdAndAssertValue(nom1, justBelowMax, 3);

    }

    @Test
    void findGCD_Roubustness2() {
        createGcdAndAssertValue(nom, min, 1);

    }

    @Test
    void findGCD_Roubustness3() {
        createGcdAndAssertValue(nom, max, 50);

    }

    @Test
    void findGCD_Roubustness4() {
        createGcdAndAssertValue(nom, nom1, 1);

    }

    @Test
    void findGCD_Roubustness5() {
        createGcdAndAssertValue(nom, justAboveMin, 2);

    }

    @Test
    void findGCD_Roubustness6() {
        createGcdAndAssertValue(nom, justBelowMax, 1);

    }

    @Test
    void findGCD_Roubustness7() {

        createGcdAndAssertValue(nom1, min, 1);

    }

    @Test
    void findGCD_Roubustness8() {
        createGcdAndAssertValue(nom1, max, 1);

    }

    @Test
    void findGCD_Roubustness9() {
        createGcdAndAssertValue(nom1, justAboveMin, 1);

    }

    @Test
    void findGCD_Roubustness10() {
        createGcdAndAssertValue(nom, justAboveMax, 1);

    }

    @Test
    void findGCD_Roubustness11() {
        createGcdAndAssertValue(nom, justBelowMin, 1);

    }

    @Test
    void findGCD_Roubustness12() {
        createGcdAndAssertValue(nom1, justAboveMax, 1);

    }

    @Test
    void findGCD_Roubustness13() {
        createGcdAndAssertValue(nom1, justBelowMin, 1);
    }

    // worstCase testing
    @Test
    void WorstCaseTesting(){
        Collection<Executable> allCases  = new ArrayList<>();
        int[] input = new int[]{1, 100, 50, 2, 99, 51, 55};

        for (int i : input)
            for (int j : input)
                for (int k : input)
                    allCases.add(createGCD(i, j));
        assertAll(allCases);
    }

    private Executable createGCD(int i, int j) {
        Boolean expectedValue= Boolean.TRUE;
        Boolean actualValue;
        try{
            GCD.findGCD(i,j);
            actualValue=Boolean.TRUE;
        }catch (Exception e) {
            actualValue = Boolean.FALSE;
        }
        Boolean finalActualValue = actualValue;
        return ()-> assertEquals(expectedValue, finalActualValue);
    }

}