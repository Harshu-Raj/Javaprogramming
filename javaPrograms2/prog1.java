import java.io.*;
import java.util.*;

class UserMainCode {
    public int calculateBMI(int input1, int[] input2, int[] input3, int input4) {
        int count = 0; // Counter for eligible people

        for (int i = 0; i < input1; i++) {
            // Calculate BMI using the provided formula
            double bmi = (double) input3[i] / input2[i] * 10; // Weight / Height * 10
            
            // Check if BMI is within allowed limit
            if (bmi <= input4) {
                count++;
            }
        }
        
        return count; // Return the number of eligible people
    }
}