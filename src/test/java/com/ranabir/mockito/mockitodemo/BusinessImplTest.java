package com.ranabir.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BusinessImplTest {

    @Test
    @DisplayName("greatest value check")
    public void testFindTheGreatestFromAllData(){
        DataService dataServiceMock = mock(DataService.class); // you can use interface of class for mocking.
        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{22,15,55});
        BusinessImpl obj = new BusinessImpl(dataServiceMock); // by using mockito
        // BusinessImpl obj = new BusinessImpl(new DataServiceImpl()); // by using normL METHOD call in Junit
        int result = obj.findTheGreatestFromAllData();

        assertEquals(55,result);
    }
}
