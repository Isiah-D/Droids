package com.zaycodes;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Droid sarah = new Droid("sarah");
        System.out.println(sarah);
        sarah.performTask("jump");
        sarah.performTask("clap");
        sarah.energyReport();
    }
}
