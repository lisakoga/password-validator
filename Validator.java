public class Validator
{
    public static boolean pwCheck(String pw)
    {
        String goodPassword =  "(?=.*[!@#$%^&*()_+=-])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}";

        // the password has to contain: 1) at least one special character; 2) at least one digit; 3) both upper case and lower case
        // the password is at least 8 characters long and it should not be "password"
        
        return pw.matches(goodPassword) && !(isPassword(pw));
    }
    public static boolean isPassword(String pw)
    {
        // checks if the password is not “password” (case insensitive)
        return pw.toLowerCase().equals("password");
    }
}
