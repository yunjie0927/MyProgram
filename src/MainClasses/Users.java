/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Users 
{
    private String username, password, id, name, email;
    
    public Users(String un, String pw, String id, String n, String em)
    {
        this.username = un;
        this.password = pw;
        this.id = id;
        this.name = n;
        this.email = em;
    }
    
    public void setUsername(String un)
    {
        this.username = un;
    }
    
    public String returnUsername()
    {
        return this.username;
    }
    
    public void setPassword(String p)
    {
        this.password = p;
    }
    
    public String returnPassword()
    {
        return this.password;
    }
    
    public void setID(String i)
    {
        this.id = i;
    }
    
    public String returnID()
    {
        return this.id;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public String returnName()
    {
        return this.name;
    }
    
    public void setEmail(String e)
    {
        this.email = e;
    }
    
    public String returnEmail()
    {
        return this.email;
    }
    
}
