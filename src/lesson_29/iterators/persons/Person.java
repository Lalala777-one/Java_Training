package lesson_29.iterators.persons;

public class Person {


        private String email;
        private String password;

        public Person(String email, String password) {
            setEmail(email);
            setPassword(password);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (isEmailValid(email))
                this.email = email;
        }

        public void setPassword(String password) {
            if(isValidPassword(password))
                this.password = password;
        }


    /*
    test@email.com
    1. Должна присутствовать @ и только ОДНА
    2. Должна присутствовать . после @
    3. После последней точки есть два или более символов
    4. Должны быть буквы (Алфавит), цифры '-', '_', '.', '@'
    5. До @ должен быть хотя бы один символ
    6. Первый символ должна быть буква
     */

        private boolean isEmailValid(String email) {
            // 1. Должна присутствовать @ и только ОДНА

            int indexAt = email.indexOf('@');
            if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

            // 2. Должна присутствовать . после @
            int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
            if (dotIndexAfterAt == -1) return false;

            // 3. После последней точки есть два или более символов
            // Разделить локальную  и доменную часть

            String localPart = email.substring(0, indexAt);
            String domainPart = email.substring(indexAt + 1);

            int lastDotIndex = domainPart.lastIndexOf('.');
            if ( lastDotIndex >= domainPart.length() - 2) return false;

// Условие 4: Проверка на допустимые символы (буквы, цифры, '-', '_', '.', '@')

            if (!areValidCharacters(localPart) || !areValidCharacters(domainPart))
                return false;

            // Условие 5: Должен быть хотя бы один символ до '@'
            // if (indexAt <= 0)
            //  return false;


            // Проверка номер 6 более широкая чем 5 и вкл в себя 5ю
            // Условие 6: Первый символ должен быть буквой / Условие 5: Должен быть хотя бы один символ до '@'
            if (!Character.isLetter(localPart.charAt(0))) return false;


            return true;
        }


        private static boolean areValidCharacters(String part) {
            for (int i = 0; i < part.length(); i++) {
                char c = part.charAt(i);

                if (!Character.isLetterOrDigit(c) && c != '-' && c !=  '_' && c != '.') {
                    return false;
                }
            }
            return true;
        }


        public String getPassword() {
            return password;
        }



        @Override
        public String toString() {
            return "Person{" +
                    "email = '" + email + '\'' +
                    ", password = '" + password + '\'' +
                    '}';
        }

    /*
Task 2
Написать в классе Person метод для проверки валидности Password
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
     */

        private boolean isValidPassword(String password) {
            if (password == null || password.length() < 8) {
                System.out.println();
                return false;
            }

            boolean isDigit = false; // наличие хотя бы одной цифры
            boolean isLowercase = false; //  наличие хотя бы одной маленькой буквы
            boolean isUppercase = false; // наличие хотя бы одной большой буквы:
            boolean isSpecialChar = false; // наличие хотя бы одного специального символа

            String specialCharacters = "!%$@&*()[].,-";

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isDigit(ch)) {
                    isDigit = true;
                }
                if (Character.isLowerCase(ch)) {
                    isLowercase = true;
                }
                if (Character.isUpperCase(ch)) {
                    isUppercase = true;
                }
                if (specialCharacters.indexOf(ch) != -1) {
                    isSpecialChar = true;
                }


                if (isDigit && isLowercase && isUppercase && isSpecialChar) {
                    return true;
                }

            }
            return isDigit && isLowercase && isUppercase && isSpecialChar;
        }
    }



// Полезные методы класса Character
// возвращает true если символ буква
//   Character.isAlphabetic('c');
// Возвращает true если символ цифра
//   Character.isDigit('v');

//  Character.isLetter('c');
//  Character.isLetterOrDigit('-');



