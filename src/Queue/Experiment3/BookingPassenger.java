package Queue.Experiment3;

/**
 * 已订票客户
 */
public class BookingPassenger {
    private String name;    //订票乘客姓名
    private int bookingNumber;      //订票数量
    private int degree;     //订票舱位等级

    public BookingPassenger() {
    }

    public BookingPassenger(String name, int bookingNumber, int degree) {
        this.name = name;
        this.bookingNumber = bookingNumber;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "BookingPassenger{" +
                "name='" + name + '\'' +
                ", bookingNumber=" + bookingNumber +
                ", degree=" + degree +
                '}';
    }
}
