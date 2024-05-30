/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1redo;

/**
 *
 * @author Roland
 */
import javax.swing.JOptionPane;
class login 
{
     //declaring variables
    private String username;
    private String password;
    private String name;
    private String surname;
    private String userLogin;
    private String userPassword;
    
    public login(String username,String password,String name,String surname)
            {
                this.password = password;
                this.username = username;
                this.name = name;
                this.surname = surname;
            }
    
    //creating a username
    public static boolean checkUsername(String username)
    {
        if (username.length() <= 5 && username.contains("_"))
                {
                    return true;
                }
        else
        {
            return false;
        }
    }
    
    //creating  a password
    public static boolean checkPasswordComplexity (String password)
    {
       boolean passwordSpecialChar = false;
       boolean passwordNum = false;
       boolean lengthOfPassword = false;
       boolean passwordUpperCase = false;
       
       lengthOfPassword = password.length() >=8;
       if (lengthOfPassword)
       {
           for (int i = 0; i < password.length(); i++)
           {
              char character = password.charAt(i);
              
              if (Character.isUpperCase(character))
              {
                  passwordUpperCase = true;
              }
              if(Character.isDigit(character))
              {
                  passwordNum = true;
              }
              if(!(Character.isLetterOrDigit(character)))
              {
                  passwordSpecialChar = true;
              }
           }
       }
       return passwordSpecialChar && passwordNum && lengthOfPassword && passwordUpperCase;
    }
    
    public String registerUser()
    {
       if(checkUsername(username) && checkPasswordComplexity(password))
       {
           userLogin = JOptionPane.showInputDialog(null, "Login Account\n" + "Please enter your username");
           userPassword = JOptionPane.showInputDialog(null, "Login Account\n" + "Please enter your password");
           return "Username succefully captured and password succefully captured";
       }
       else
       {
           if(!checkUsername(username))
           {
               return "Username is not \n" +
                       "correctly formatted, \n" +
                       "Please ensure that \n" +
                       "your username \n" +
                       "contains an \n" +
                       "underscore and is no \n"+
                       "more than 5 \n" + 
                       "character in length.";
                     
           }
       }
       if(!checkPasswordComplexity(password))
       {
           return "password is not \n" +
                   "correctly formatted, \n" +
                   "please ensure that \n" +
                   "the password \n" +
                   "contains atleast 8 \n" +
                   "characters, a captial \n" +
                   "letter, a number and \n" +
                   "a special character";
       }
       return null;
    }
    
    public boolean loginUser()
    {
        
        return userLogin.equals(username) && userPassword.equals(password);
            
    }
    public String returnLoginStatus()
    {
        if(loginUser())
        {
            return "Welcome " + name + " " + surname + " ." + "It is great to see you again";
        }
        else
        {
            return "Username or Pasword incorrect. Please try again.";
        }
    }
    
    
    
}
