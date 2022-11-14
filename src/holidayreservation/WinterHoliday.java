
package holidayreservation;

public class WinterHoliday extends Holiday implements Comparable<WinterHoliday>{
    private int daysM, daysT;
    private String reservationID;
    
    public int getDaysM() {
        return daysM;
    }

    public void setDaysM(int daysM) {
        this.daysM = daysM;
    }

    public int getDaysT() {
        return daysT;
    }

    public void setDaysT(int daysT) {
        this.daysT = daysT;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    
    public WinterHoliday() {
    }

    public WinterHoliday(String travelAgencyName, String destination, int days, int daysM, int daysT, String reservationID) {
        super(travelAgencyName, destination, days);
        this.daysM = daysM;
        this.daysT = daysT;
        this.reservationID = reservationID;
    }

    @Override
    public String toString() {
        return super.toString()+  " of which you will spend " + daysM + " days at the mountatin and " + daysT + " days at the touristic town. Your reservation ID is " + reservationID + ".\nThe price of your holiday is:";
        
    }


    
    @Override
    public double calculateThePrice() {
        return (daysM+daysT)*10000;
    }

    @Override
    public int compareTo(WinterHoliday o) {
        if(this.daysM==((WinterHoliday)o).daysM){
            return 0;
        }
        else if(this.daysM<((WinterHoliday)o).daysM){
            return -1;
        }
        else
            return 1;
    }


    
    
}
