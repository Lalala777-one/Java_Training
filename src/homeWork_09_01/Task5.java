package homeWork_09_01;

public class Task5 {
    public static void main(String[] args) {

        String[] strings = {"Java", "Hello", "Task", "Bye", "Town"};
        String theLongestString = printLongestString(strings);
        System.out.println("The longest String : " + theLongestString);

        int index = 0;
        while (index < theLongestString.length()) {
            System.out.println(theLongestString.charAt(index++));
        }

    }

    // Method

    public static String printLongestString(String[] arrayString) {
        String maxString = "";
        int i = 0;

        while (i < arrayString.length) {
            String str1 = arrayString[i];
            if (str1 != null && str1.length() > maxString.length()) {
                maxString = str1;

            }
            i++;
        }
        return maxString;

        }

    }
