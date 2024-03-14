package com.naveen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

// if you want to test you have to use
// either junit or testng
// find he required dependency in maven
// artifact - mockito-junit-jupiter
public class MockTest01 {

    @Test
    public void testSimpleList () {
//        new List<>()

        List mockList = mock(List.class);
        when(mockList.get(1)).thenReturn("Paras");
        assertEquals("Paras", mockList.get(1));
    }
    @Test
    public void testSimpleList2() {
        List mockList = mock(List.class);
        when(mockList.get(100)).thenThrow(new RuntimeException("Invalid Position"));

        RuntimeException assertedThrows = assertThrows(RuntimeException.class, () -> {
            mockList.get(100);
        });
        assertEquals("Invalid Position", assertedThrows.getMessage());;
    }


    @Test
    public void testSimpleList3WithAnyInt() {
        List mockList = mock(List.class);
        when(mockList.get(anyInt())).thenThrow(new RuntimeException("Invalid Position"));

        RuntimeException assertedThrows = assertThrows(RuntimeException.class, () -> {
            mockList.get(100);
        });
        assertEquals("Invalid Position", assertedThrows.getMessage());;
    }


    @Test
    public void testSimpleList4WithMultipleReturn() {
        List mockList = mock(List.class);
        when(mockList.get(1))
                .thenReturn("Hi")
                .thenReturn("Bye");

        assertEquals("Hi", mockList.get(1));
        assertEquals("Bye", mockList.get(1));


    }

//    working with spy
@Test
    public void testWithSpy1() {
        ArrayList arrayList = spy(ArrayList.class); // new ArrayList();

        assertEquals(0, arrayList.size());

        arrayList.add("Siddharth");
        assertEquals(1, arrayList.size());
    }


    // to assert list
    // TODO - to assert use hamcrest

}
