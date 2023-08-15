package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ConditionalTest {

    @Test
    @Disabled("Don't run  until Jira #123 is resolved")
    void basicTest() {
        // execute method and perform assert
    }


    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // execute method and perform assert
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMACOnly() {
        // execute method and perform assert
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMACAndWindowsOnly() {
        // execute method and perform assert
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // execute method and perform assert
    }


    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17() {
        // execute method and perform assert
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyJava13() {
        // execute method and perform assert
    }
    @Test
    @EnabledOnJre(JRE.JAVA_20)
    void testForOnlyJava20() {
        // execute method and perform assert
    }


    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
    void testForOnlyForJavaRange() {
        // execute method and perform assert
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyForJavaRangeMin() {
        // execute method and perform assert
    }


    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    @Order(1)
    void testForDevEnvironment() {
        // execute method and perform assert
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    @Order(2)
    void testForSystemProperty() {
        // execute method and perform assert
    }

}
