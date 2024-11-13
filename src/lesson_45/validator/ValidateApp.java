package lesson_45.validator;

public class ValidateApp {
    public static void main(String[] args) {

        // получаем email от пользователя (сканером, из другого слоя приложения и тд)
        String email = "1estemail@co.m";

        String password = "jjhjl!1ррррр";

        // Валидация пароля
        try {
            EmailAndPasswordValidator.isValidPassword(password);
            System.out.println("Password has passed the validation.");
        } catch (PasswordValidateException e) {
            System.out.println("Password is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }


        //Валидация email
        try {
            EmailAndPasswordValidator.isValidEmail(email);
            // если мы дойдем до этой строчки кода, значит email валидный
            // можем создавать нового пользователя
            System.out.println("Email has passed the validation.");
            //  User user = new User(email, password);
        } catch (EmailValidateException e) {
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);


        }
    }
}

