package com.ranabir.mockito.mockitodemo;

public class DataServiceImpl implements DataService{

    @Override
    public int[] retriveAllData() {
        return new int[]{22,3,55,2};
    }
}