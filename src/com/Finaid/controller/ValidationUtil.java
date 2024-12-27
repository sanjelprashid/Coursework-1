// ValidationUtil.java
package com.Finaid.controller;

import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern STUDENT_ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern PROGRAM_PATTERN =
            Pattern.compile("^(Computing|Business|Engineering|Medicine)$");
    private static final Pattern INCOME_PATTERN =
            Pattern.compile("^\\$?\\d{1,3}(,\\d{3})*(\\.\\d{2})?$");
   
    /**
     * Validates if a string is null or empty.
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
   
    /**
     * Validates if the name contains only alphabets and spaces.
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }
   
    /**
     * Validates if the student ID is exactly 7 digits.
     * @param studentId the student ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStudentId(int studentId) {
        return STUDENT_ID_PATTERN.matcher(String.valueOf(studentId)).matches();
    }
   
    /**
     * Validates if the program is one of the allowed options.
     * @param program the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProgram(String program) {
        return !isNullOrEmpty(program) && PROGRAM_PATTERN.matcher(program).matches();
    }
   
    /**
     * Validates if the CGPA is between 0.0 and 4.0.
     * @param cgpa the CGPA to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidCGPA(double cgpa) {
        return cgpa >= 0.0 && cgpa <= 4.0;
    }
   
    /**
     * Validates if the family income is in correct currency format.
     * @param income the income to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidIncome(String income) {
        return !isNullOrEmpty(income) && INCOME_PATTERN.matcher(income).matches();
    }
   
    /**
     * Validates if the scholarship type is one of the allowed options.
     * @param type the scholarship type to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidScholarshipType(String type) {
        return !isNullOrEmpty(type) &&
               (type.equals("Merit-Based") ||
                type.equals("Need-Based") ||
                type.equals("Sports") ||
                type.equals("Research"));
    }
}