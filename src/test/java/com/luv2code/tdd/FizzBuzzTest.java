package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {


    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testDivisibleByThree() {
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }


    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testDivisibleByFive() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }


    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    void testDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }


    @DisplayName("Not Divisible by Three and Five")
    @Test
    @Order(3)
    void testNotDivisibleByThreeAndFive() {
        String expected = "14";

        assertEquals(expected, FizzBuzz.compute(14), "Should return 14");
    }

    @DisplayName("Testing with Small data file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testSmallDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value), "Should return " + expected);
    }

    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value), "Should return " + expected);
    }

    @DisplayName("Testing with Large data file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value), "Should return " + expected);
    }

}