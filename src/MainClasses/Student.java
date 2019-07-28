/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClasses;

/**
 *
 * @author User
 */
public class Student extends Users
{
    private String degreeLevel, course, contact;
    
    public Student(String un, String pswd, String id, String n, String em, String dl, String c, String ctct)
    {
        super(un, pswd, id, n, em);
        setDegLevel(dl);
        setCourse(c);
        setContact(ctct);
    }
    
    public void setDegLevel(String dl)
    {
        this.degreeLevel = dl;
    }
    
    public String returnDegLevel()
    {
        return this.degreeLevel;
    }
    
    public void setCourse(String c)
    {
        this.course = c;
    }
    
    public String returnCourse()
    {
        return this.course;
    }
    
    public void setContact(String ctct)
    {
        this.contact = ctct;
    }
    
    public String returnContact()
    {
        return this.contact;
    }
    
}
