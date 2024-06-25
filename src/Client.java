/**
 * @author Angela Domingo
 */

public class Client {
    private String firstName;
    private String lastName;
    private int checkInDay;
    private int checkOutDay;
    private Room bookedRoom;

    public Client(String firstName, String lastName, int checkInDay, int checkOutDay, Room bookedRoom) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.bookedRoom = bookedRoom;
    }

    /**
     * This method is a getter for the variable bookedRoom.
     * @return the booked room of the Client
     */
    public Room getBookedRoom() {
        return bookedRoom;
    }

    /**
     * This is a setter for the variable bookedRoom
     * @param bookedRoom the room the Client would like to book
     */
    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    /**
     * This is a getter for the variable firstName
     * @return the first name of the Client
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is a getter for the variable lastName
     * @return the last name of the Client
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is a getter for the variable checkInDay
     * @return the check in day of the Client
     */
    public int getCheckInDay() {
        return checkInDay;
    }

    /**
     * This is a setter for the variable checkInDay
     * @param checkInDay the check in day of the Client
     */
    public void setCheckInDay(int checkInDay) {
        this.checkInDay = checkInDay;
    }

    /**
     * This is a getter for the variable checkOutDay
     * @return the check out day of the Client
     */
    public int getCheckOutDay() {
        return checkOutDay;
    }

    /**
     * This is a setter for the variable checkOutDay
     * @param checkOutDay the check out day of the Client
     */
    public void setCheckOutDay(int checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    /**
     * This calculates the number of days the client has booked.
     * @return the number of days the client booked the Room
     */
    public int getDaysBooked(){
        return checkOutDay - checkInDay + 1;
    }

    public float getReservationCost(){
        return bookedRoom.getBasePrice() * (checkOutDay - checkInDay + 1);
    }
}
