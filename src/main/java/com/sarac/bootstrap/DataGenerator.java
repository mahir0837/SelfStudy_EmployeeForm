package com.sarac.bootstrap;

import com.sarac.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<String>getAllStates(){
        return Arrays.asList("Ontario","Quebec","Nova Scotia",
                "New Brunswick","Manitoba",
                "British Columbia","Prince Edward " +
                 "Island","Saskatchewan", "Alberta",
                "Newfoundland and Labrador");
    }

}
