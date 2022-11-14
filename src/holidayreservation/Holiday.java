
package holidayreservation;


public abstract class Holiday {
    private String travelAgencyName, destination;
    private int days;

    public Holiday() {
    }

    public Holiday(String travelAgencyName, String destination, int days) {
        this.travelAgencyName = travelAgencyName;
        this.destination = destination;
        this.days = days;
    }

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Holiday: Your winter holiday with the agency " + travelAgencyName + " in " + destination + " for a period of " + days + " days ";
    }

    
    
    public abstract double calculateThePrice();
}
