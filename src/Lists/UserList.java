/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import UserRole.Lecturer;
import UserRole.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class UserList {
    
    private ArrayList<Student> studentarr = new ArrayList();
    private ArrayList<Lecturer> lecturerarr = new ArrayList();
    
    public UserList() throws FileNotFoundException
    {
        instantiateUserLists(); //when UserList() object is instantiated, create arraylists of student and lecturer
    }
    
    private void instantiateUserLists() throws FileNotFoundException{
            File file = new File("./src/TextFiles/User.txt"); //. - go back one step
            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine())
            {
                String[] temp = new String[8];
                temp = sc.nextLine().split(",");
                if (temp[2].substring(0,1).equals("S")) {
                    studentarr.add(new Student(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7])); 
                } else if (temp[2].substring(0,1).equals("L")) {
                    lecturerarr.add(new Lecturer(temp[0], temp[1], temp[2], temp[3], temp[4]));
                }
            }
    }
    
    public ArrayList getStudentList(){
        return studentarr;
    }
    
    public ArrayList getLecturerList(){
        return lecturerarr;
    }
    
    public Lecturer getLecturerObject(String usn){ //from the arraylist, decide which lecturer object to get based on usn
        for (int i = 0; i < lecturerarr.size(); i++) {
            if (lecturerarr.get(i).returnUsername().equals(usn)) {
                 return lecturerarr.get(i);
            }
            
        }
        return null;  
    }
    
    public Student getStudentObject(String usn){ //from the arraylist, decide which student object to get based on usn
        for (int i = 0; i < studentarr.size(); i++) {
            if (studentarr.get(i).returnUsername().equals(usn)) {
                 return studentarr.get(i);
            }
            
        }
        return null;  
    }
    
    public void saveList()throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("./src/TextFiles/Text.txt"));
        pw.println("Test");
        pw.close();
    }
}
