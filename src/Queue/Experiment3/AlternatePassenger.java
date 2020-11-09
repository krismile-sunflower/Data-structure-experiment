package Queue.Experiment3;

public class AlternatePassenger {
    private String name;
    private String needBookingNumber;

    public AlternatePassenger() {
    }

    public AlternatePassenger(String name, String needBookingNumber) {
        this.name = name;
        this.needBookingNumber = needBookingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeedBookingNumber() {
        return needBookingNumber;
    }

    public void setNeedBookingNumber(String needBookingNumber) {
        this.needBookingNumber = needBookingNumber;
    }

    @Override
    public String toString() {
        return "AlternatePassenger{" +
                "name='" + name + '\'' +
                ", needBookingNumber='" + needBookingNumber + '\'' +
                '}';
    }
}
