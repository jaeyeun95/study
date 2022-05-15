package chap14.exception.alone;

public class PasswordExceptionTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() == 0) {
            try {
                throw new PasswordException("비밀번호는 null 일 수 없습니다.");
            } catch (PasswordException e) {
                System.out.println(e.getMessage());
            }
        } else if (password.matches("[a-zA-Z]+") && password.length() < 5) {
            try {
                throw new Exception("비밀번호는 문자로만 이루어졌을 경우 5글자 이하면 안됩니다.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("이상 없는 비밀번호");
    }

    public static void main(String[] args) {
        PasswordExceptionTest test = new PasswordExceptionTest();
        String pass = new String("abc");
//        String pass = "";

        test.setPassword(pass);

    }
}
