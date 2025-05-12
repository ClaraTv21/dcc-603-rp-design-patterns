package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    private static final String SPECIALS = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?";

    @Override
    public boolean validate(String password) {
        if (password == null) return false;
        for (char c : password.toCharArray()) {
            if (SPECIALS.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}