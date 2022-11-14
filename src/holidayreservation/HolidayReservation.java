
package holidayreservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HolidayReservation {

    public static void validateID(String id) throws reservationIDCheck{
        int counter = 0;
        if(id.length()!=4){
            throw new reservationIDCheck("ID must have 4 chracters");
        }
        else if(id.length()==4){
            for(int i = 0;i<id.length();i++){
                if(i==0){
                    if(id.charAt(i)!='W'){
                        throw new reservationIDCheck("ID must begin with letter W!");
                    }
                    else
                        counter++;
                }
                else if(!Character.isDigit(id.charAt(i))){
                   throw new reservationIDCheck("Last three characters must be digits!");
                }
                else
                    counter++;
            }
        }
        
        if(counter==4){
            System.out.println("ID is OK!");
        }
        
    }
    public static void main(String[] args) {
        String fileName = "data.txt";
        File file = new File(fileName);
        List <WinterHoliday> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                WinterHoliday h = new WinterHoliday();
                h.setTravelAgencyName(sc.nextLine());
                h.setDestination(sc.nextLine());
                h.setDays(Integer.parseInt(sc.nextLine()));
                h.setDaysM(Integer.parseInt(sc.nextLine()));
                h.setDaysT(Integer.parseInt(sc.nextLine()));
                h.setReservationID(sc.nextLine());
                list.add(new WinterHoliday(h.getTravelAgencyName(),h.getDestination(),h.getDays(),h.getDaysM(),h.getDaysT(),h.getReservationID()));
            
                try {
                    validateID(h.getReservationID());
                } catch (reservationIDCheck ex) {
                    System.err.println(ex.getMessage());
                }
                
                Collections.sort(list); //ascending
                //descending Collection.sort(list, Collections.reverseOrder());
                

                //System.out.println(h.toString());
                //System.out.println(h.calculateThePrice());
            }
                for (WinterHoliday wh:list){
                System.out.println(wh.toString());
                System.out.println(wh.calculateThePrice());
                }
            
        } catch (FileNotFoundException ex) {
            System.err.println("File " + fileName + " does not exist!");
        }
        
        
        

        
    }
    
}
