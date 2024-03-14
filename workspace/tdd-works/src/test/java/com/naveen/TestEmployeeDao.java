package com.naveen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;



public class TestEmployeeDao {
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private IEmployeeDAO mock ;

//    @InjectMocks
//    private IEmployeeService service;

    @Test
    public void testInsertEmployeMock() {

        when(mock.insertEmployee(101, "Harry"))
                .thenReturn("Inserted Mock");

        assertEquals("Inserted Mock",
                mock.insertEmployee(101, "Harry"));;

    }
}
