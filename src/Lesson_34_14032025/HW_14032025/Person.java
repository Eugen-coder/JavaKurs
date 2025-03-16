package Lesson_34_14032025.HW_14032025;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public Person() {
        String email;
        String password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){}
        this.email = email;
    }

    private boolean isEmailValid(String email){

        if (email == null) return false;
        // 1.
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;
        // 2.
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;
        // 3.
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) return false;
        // 4.
        for (char ch : email.toCharArray()){
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            if (!isPass) return false;
        }

        // 5.

        if (indexAt == 0) return false;

        // 6.

        if (Character.isLetter(email.charAt(0))) return false;

        // Vse proverki proideni. Email podxodit.
        return true;
    }

    public String getPassword() {
        return password;
    }

    public Object setPassword(String password) {
        this.password = password;
        return null;
    }

    /*
    Trebovaniya k parolyu:
    1. Dlina parolya >= 8
    2. 1 zifra
    3. 1 mal.bukva
    4. 1 bolshaya bukva
    5. 1 spez.simvol

    Parol dolzhen udovletvoryat vsem trebovaniyam srazu.

    5 boolean peremennix. Kazhdaya otvechaet za svoy punkt.
    Parol podxodit esli vse pyat podxodyat.
     */

    public boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        //vtoroy sposob obiyavleniya peremennix:
        boolean[] rezult = new boolean[4];

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if ("!%$@&*()[],.-".contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        System.out.printf("%s | %s | %s | %s | ", hasDigit, hasLowerCase, hasUpperCase, hasSpecialChar);

        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Object isValidEmail(String email) {

        return null;
    }
}
