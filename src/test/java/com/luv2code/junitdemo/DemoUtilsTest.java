package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setUpBeforeEachMethod() {
        demoUtils = new DemoUtils();
    }


    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
    }

    @Test
    @DisplayName("Null and not Null")
    @Order(2)
    void testNullAndNotNull() {
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    @Order(1)
    void testSameAndNotSame() {
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to the same object");
        assertNotSame(str, demoUtils.getAcademyDuplicate(), "Object should not refer to the same object");
    }

    @Test
    @DisplayName("True and False")
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    @Order(-8)
    void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be same");
    }

    @DisplayName("Iterable equals")
    @Test
    void testIterableEquals() {
        List<String> list = List.of("luv", "2", "code");

        assertIterableEquals(list, demoUtils.getAcademyInList(), "Expected list should be the same");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesEquals() {
        List<String> list = List.of("luv", "2", "code");

        assertLinesMatch(list, demoUtils.getAcademyInList(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowAndDoesNotThrow() {
        assertThrows(Exception.class, () -> demoUtils.throwException(-1), "Should throw exception");

        assertDoesNotThrow(() -> demoUtils.throwException(7), "Should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> demoUtils.checkTimeout(), "Method should execute withing 3 seconds");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
        assertEquals(12, demoUtils.multiply(4,3), "4 * 3 must be 12");
    }


//    @AfterEach
//    void tearDownAfterEachMethod() {
//        System.out.println("@AfterEach running");
//    }
//
//    @BeforeAll
//    static void setUpBeforeEachClass() {
//        System.out.println("@BeforeAll running...");
//    }
//
//    @AfterAll
//    static void tearDownAfterEachClass() {
//        System.out.println("\n@AfterAll running...");
//    }
}