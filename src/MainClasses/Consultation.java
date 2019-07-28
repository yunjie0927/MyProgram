/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClasses;

/**
 *
 * @author yunjiekoh
 */
public class Consultation {
    
    private String lecturerID, lecturerName, lecturerEmail, date, fromTime, toTime, venue, status, studentID, studentName, studentEmail, degLevel, course, contact;
    
    public Consultation(String lId, String ln, String le, String d, String ft, String tt, String v, String s, String sId, String sn, String se, String dl, String c, String ct){
        this.lecturerID = lId;
        this.lecturerName = ln;
        this.lecturerEmail = le;
        this.date = d;
        this.fromTime = ft;
        this.toTime = tt;
        this.venue = v;
        this.status = s;
        this.studentID = sId;
        this.studentName = sn;
        this.studentEmail = se;
        this.degLevel = dl;
        this.course = c;
        this.contact = ct;
    }
    
    public void setLecturerID(String lId){
        this.lecturerID = lId;
    }
    
    public String returnLecturerID(){
        return this.lecturerID;
    }
    
    public void setLecturerName(String ln){
        this.lecturerName = ln;
    }
    
    public String returnLecturerName(){
        return this.lecturerName;
    }
    
    public void setLecturerEmail(String le){
        this.lecturerEmail = le;
    }
    
    public String returnLecturerEmail(){
        return this.lecturerEmail;
    }
    
    public void setDate(String d){
        this.date = d;
    }
    
    public String returnDate(){
        return this.date;
    }
    
    public void setFromTime(String ft){
        this.fromTime = ft;
    }
    
    public String returnFromTime(){
        return this.fromTime;
    }
    
    public void setToTime(String tt){
        this.toTime = tt;
    }
    
    public String returnToTime(){
        return this.toTime;
    }
    
    public void setVenue(String v){
        this.venue = v;
    }
    
    public String returnVenue(){
        return this.venue;
    }
    
    public void setStatus(String s){
        this.status = s;
    }
    
    public String returnStatus(){
        return this.status;
    }
    
    public void setStudentID(String sId){
        this.studentID = sId;
    }
    
    public String returnStudentID(){
        return this.studentID;
    }
    
    public void setStudentName(String sn){
        this.studentName = sn;
    }
    
    public String returnStudentName(){
        return this.studentName;
    }
    
    public void setStudentEmail(String se){
        this.studentEmail = se;
    }
    
    public String returnStudentEmail(){
        return this.studentEmail;
    }
    
    public void setDegLevel(String dl){
        this.degLevel = dl;
    }
    
    public String returnDegLevel(){
        return this.degLevel;
    }
    
    public void setCourse(String c){
        this.course = c;
    }
    
    public String returnCourse(){
        return this.course;
    }
    
    public void setContact(String ct){
        this.contact = ct;
    }
    
    public String returnContact(){
        return this.contact;
    }
    
}
