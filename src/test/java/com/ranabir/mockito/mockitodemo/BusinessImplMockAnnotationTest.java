package com.ranabir.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)   // MockitoJUnitRunner.class will check the annotations and initialize them accordingly.
class BusinessImplMockAnnotationTest {

    @Mock
    DataService dataServiceMock;  // this is the method that need to be mocked.

    @InjectMocks
    BusinessImpl businessImpl;  // DataService dependency will be injected inside BusinessImpl.

    @Test
    void testFindGreatestNum(){
        // when dataService method is called then return int[]{22,12,44,55} argument.
        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{22,15,55});
        assertEquals(55,businessImpl.findTheGreatestFromAllData());
    }

}
