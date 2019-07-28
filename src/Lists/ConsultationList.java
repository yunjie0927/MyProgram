/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import MainClasses.Consultation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yunjiekoh
 */
public class ConsultationList{
    
    private ArrayList<Consultation> conshrsarr = new ArrayList();
    
    public ConsultationList() throws FileNotFoundException{
        instantiateConsultationList();
    }
    
    private void instantiateConsultationList() throws FileNotFoundException{
        File file = new File("./src/TextFiles/ConsultationList.txt");
        Scanner sc = new Scanner(file);
        LocalDate getdate = LocalDate.now();
        LocalTime gettime = LocalTime.now();
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("HHmm");
        String date = myDateFormat.format(getdate);
        String time = myTimeFormat.format(gettime);

        while(sc.hasNextLine()){
            String[] temp = new String[14];
            temp = sc.nextLine().split(",");
            if (LocalDate.parse(date, myDateFormat).isBefore(LocalDate.parse(temp[3], myDateFormat))){
                conshrsarr.add(new Consultation(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9],temp[10],temp[11],temp[12],temp[13]));
            }
            else if (LocalDate.parse(date, myDateFormat).equals(LocalDate.parse(temp[3], myDateFormat))){
                if (LocalTime.parse(time, myTimeFormat).isBefore(LocalTime.parse(temp[4], myTimeFormat))){
                    conshrsarr.add(new Consultation(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9],temp[10],temp[11],temp[12],temp[13]));
                }
            }
        }
    }
    
    public ArrayList getConsultationList(){
        return this.conshrsarr;
    }
    
    public void saveConsultationList() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("./src/TextFiles/ConsultationList.txt"));
        for (int i = 0; i < conshrsarr.size(); i++){
            pw.println(conshrsarr.get(i).returnLecturerID() + "," + conshrsarr.get(i).returnLecturerName() + "," + conshrsarr.get(i).returnLecturerEmail() + "," + conshrsarr.get(i).returnDate() + "," + conshrsarr.get(i).returnFromTime() + "," + conshrsarr.get(i).returnToTime() + "," + conshrsarr.get(i).returnVenue() + "," + conshrsarr.get(i).returnStatus() + "," + conshrsarr.get(i).returnStudentID() + "," + conshrsarr.get(i).returnStudentName() + "," + conshrsarr.get(i).returnStudentEmail() + "," + conshrsarr.get(i).returnDegLevel() + "," + conshrsarr.get(i).returnCourse() + "," + conshrsarr.get(i).returnContact());
        }
        pw.close();
    }
    
}
