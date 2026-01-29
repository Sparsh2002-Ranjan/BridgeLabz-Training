interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        // Strong if length >= 8, contains digit, contains uppercase
        return password.length() >= 8
                && password.matches(".*\\d.*")
                && password.matches(".*[A-Z].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pwd1 = "Pass1234";
        String pwd2 = "weakpass";

        System.out.println("Is pwd1 strong? " + SecurityUtils.isStrongPassword(pwd1));
        System.out.println("Is pwd2 strong? " + SecurityUtils.isStrongPassword(pwd2));
    }
}
