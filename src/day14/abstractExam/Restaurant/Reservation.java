package day14.abstractExam.Restaurant;

public abstract class Reservation {
    private String restaurantId;
    private String customerName;
    private String dateTime;

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    protected abstract void makeReservation();
    protected abstract void modifyReservation();
    protected abstract void cancelReservation();
}
