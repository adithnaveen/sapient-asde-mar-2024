package com.naveen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {


    BusinessLogic logic = null;
    String name ="";
    String expected = "";
    @BeforeEach
     void setUp() {
         logic = new BusinessLogic();
         name ="Siddharth";
         expected = "hi " + name;
    }

    @AfterEach
     void tearDown() {
         System.out.println("you can close few values.. ");
    }


    @BeforeAll
    public static  void setUpAll () {
        System.out.println("This method shall be called before any other method ");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("This method shall be called after all ");
    }


    @Order(1)
    @DisplayName("to test the name for valid check")
    @Test
    public void testHelloDummy() {
        String name="Siddharth";
        String expected = "hi " + name  ;
        String actual ="hi " + name;

        assertEquals(expected, actual);
    }


    @DisplayName("To test name from the actual implementation-valid case")
    @Test
    public void testHello() {
        assertEquals(expected, logic.sayHi(name));
    }

    @Disabled("Testing for disabled.. ")
    @DisplayName("showing the method with time delay test ")
    @Test
    public void testReturnSlowForExceptionCheck() {

        assertTimeout(Duration.ofMillis(3000), () -> {
            assertEquals(expected, logic.returnSlowHi(name));
        });

    }


    @Nested
    class InsertRecordTestNested {
        @Order(1)
        @Test
        @DisplayName("to throw an exception when the name passed is less than 6 chars")
        public void checkNameLessThan6CharValidCaseForException() {
            RuntimeException exception = assertThrows(RuntimeException.class, () -> {
                assertTrue(logic.insertRecord(101, "Amy"));
            });
            assertEquals("Sorry Name Too small", exception.getMessage());
        }


        @Order(2)
        @Test
        @DisplayName("to check the name passed it more than 6 chars, valid case ")
        public void checkNameMoreThan6CharValidCaseBooleanAssertion() {
            assertTrue(logic.insertRecord(101, "Siddharth"));
        }


    }


}
