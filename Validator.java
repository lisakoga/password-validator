public class Validator
{
    public static boolean pwCheck(String pw)
    {
        // checks if the password is not “password” (case insensitive)
        if (pw.toLowerCase().equals("password"))
        {
            return false;
        }
        // checks if the password is at least 8 characters long
        else if (pw.length() < 8)
        {
            return false;
        }
        return true;
    }
}
