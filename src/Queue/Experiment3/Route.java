package Queue.Experiment3;

/**
 * 航班路线
 */
public class Route {
    private String terminalName;    //终点站名
    private String flightNumber;    //航班号
    private String flightId;    //飞行号
    private String data;    //飞行日期
    private int passengerNumber;    //乘员定额
    private int remainingVotes;     //余票量
    private BookingPassenger bookingPassenger;  //订票乘客
    private AlternatePassenger alternatePassenger;  //候补乘客

    public Route() {
    }

    public Route(String terminalName, String flightNumber, String flightId, String data, int passengerNumber, int remainingVotes, BookingPassenger bookingPassenger, AlternatePassenger alternatePassenger) {
        this.terminalName = terminalName;
        this.flightNumber = flightNumber;
        this.flightId = flightId;
        this.data = data;
        this.passengerNumber = passengerNumber;
        this.remainingVotes = remainingVotes;
        this.bookingPassenger = bookingPassenger;
        this.alternatePassenger = alternatePassenger;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getRemainingVotes() {
        return remainingVotes;
    }

    public void setRemainingVotes(int remainingVotes) {
        this.remainingVotes = remainingVotes;
    }

    public BookingPassenger getBookingPassenger() {
        return bookingPassenger;
    }

    public void setBookingPassenger(BookingPassenger bookingPassenger) {
        this.bookingPassenger = bookingPassenger;
    }

    public AlternatePassenger getAlternatePassenger() {
        return alternatePassenger;
    }

    public void setAlternatePassenger(AlternatePassenger alternatePassenger) {
        this.alternatePassenger = alternatePassenger;
    }

    @Override
    public String toString() {
        return "Route{" +
                "terminalName='" + terminalName + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightId='" + flightId + '\'' +
                ", data='" + data + '\'' +
                ", passengerNumber=" + passengerNumber +
                ", remainingVotes=" + remainingVotes +
                ", bookingPassenger=" + bookingPassenger +
                ", alternatePassenger=" + alternatePassenger +
                '}';
    }
}
