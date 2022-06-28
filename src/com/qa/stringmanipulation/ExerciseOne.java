package com.qa.stringmanipulation;

public class ExerciseOne {

//Create two Strings where one string has a value of “yesterday it was raining” 
// and the other string with a value of “today it is sunny”
// Concatenate both values, capitalise both strings and print out the result.
// The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
// Now use the substring method to print out: `TODAY IT IS RAINING`

String str1 = "yesterday it was raining";
String str2 = "today it is sunny";
String str3;
String str4;
String str5;

// converts text to UPPERCASE

public void stringConCap() {

str1 = str1.toUpperCase();
str2 = str2.toUpperCase();
str3 = str1 + " " + str2;
System.out.println(str3);

str4 = str3.substring(0,11); // Print "TODAY IT IS"
str5 = str3.substring(38,43); // Print "RAINING"
System.out.println(str4 + str5);
}






















}
