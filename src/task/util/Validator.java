package task.util;

import java.util.Scanner;

public class Validator {

    public String[] splitToArr(String str) {
        if (!str.isEmpty()) {
            System.out.println(str);
            String[] strArr = str.replaceAll("\\s", "").split(",");
            return strArr;
        } else {
            return null;
        }

    }

    public float parseFloat(String str) {
        try {
            return Float.valueOf(str);
        } catch (Exception ex) {
            return 0;
        }
    }

    public boolean isCorrectSide(float a, float b, float c) {
        if (a == 0 || b == 0 || c == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isTriangleExist(float a, float b, float c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public boolean ContinueConfirm(String str) {
        String answer = str.toUpperCase();
        return answer.equals("YES") || answer.equals("Y");
    }

}
