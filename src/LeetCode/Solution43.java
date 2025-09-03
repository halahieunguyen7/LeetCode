package LeetCode;

public class Solution43 {
    public String multiply(String num1, String num2) {
        if (num2.equals("0") || num1.equals("0")) {
            return "0";
        }

        int length = num2.length();
        StringBuilder num1Builder = new StringBuilder(num1);

        StringBuilder result = this.multiplyUnit(num1Builder, num2.charAt(length - 1) - '0');
        int current = 0;
        int unitNum;
        int flag = 0;
        for (int i = length - 2; i>=0; i--) {
            current++;
            StringBuilder temp = this.multiplyUnit(num1Builder, num2.charAt(i) - '0');
            System.out.println(temp.toString());
            for (int j = result.length() - current - 1; j >= 0; j--) {
                unitNum = temp.charAt(temp.length() - result.length() + current + j) - '0' + result.charAt(j) - '0' + flag;
                flag = unitNum >= 10 ? 1 : 0;
                result.setCharAt(j, (char)(unitNum % 10 + '0'));
            }

            for (int j = temp.length() - 1 - result.length() + current; j >= 0; j--) {
                unitNum = temp.charAt(j) - '0' + flag;
                flag = unitNum >= 10 ? 1 : 0;
                result.insert(0, unitNum % 10);
            }

            if (flag != 0) {
                result.insert(0, 1);
            }
            flag = 0;
        }

        return result.toString();
    }

    public StringBuilder multiplyUnit(StringBuilder num, int u) {
        StringBuilder result = new StringBuilder();
        int length = num.length();
        int flag = 0;
        int unitNum;
        for (int i = length - 1; i>=0; i--) {
            unitNum = (num.charAt(i) - '0') * u + flag;
            flag = unitNum / 10;
            result.insert(0, unitNum % 10);
        }

        if (flag != 0) {
            result.insert(0, flag);
        }

        return result;
    }
}
