
package com.mycompany.mavenproject;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Util {
    
    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(date);
    }
    
    public static String formatBrl (double value) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(value);
    }
    
    public static int timeBetween(LocalDate birDate) {
        Period age = Period.between(birDate, LocalDate.now());
        return age.getYears();
    }
}
