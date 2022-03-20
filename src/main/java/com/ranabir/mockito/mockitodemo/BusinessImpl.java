package com.ranabir.mockito.mockitodemo;

public class BusinessImpl{

    DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int greatestVal = Integer.MIN_VALUE;
        int[] data = dataService.retriveAllData();
        for (int value:data) {
            if(value>greatestVal){
                greatestVal = value;
            }
        }
        return greatestVal;
    }
}
