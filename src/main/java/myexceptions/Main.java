package myexceptions;

public class Main {
    public static void main(String[] args) {
        try {
            check("admin", "admin1","admin1");
            System.out.println("Проверка пройдена");
        }
        catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    public static void check(String login, String password, String confirmPassword) {
        if(!isStringCorrect(login)){
            throw new WrongLoginException("В логине есть некорректный символ");
            }
        if(login.length()>20){
            throw new WrongLoginException("Длина логина больше 20 символов");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongLoginException("Пароли не совпадают");
        }
        if(!isStringCorrect(password)){
            throw new WrongPasswordException("Пароль содержит некорректный символ");
        }
        if(password.length()>20){
            throw new WrongLoginException("Длина пароля больше 20 символов");
        }
    }
    private static boolean isStringCorrect(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z')||('0'<=ch && ch<='9')||(ch=='_')){
                continue;
            }
            else{ return false;}
        }
        return true;
    }
}
