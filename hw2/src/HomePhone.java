public class HomePhone extends AbstractPhone {

    private String phoneNumber;


    public HomePhone(int year, String manufacture, String phoneNumber) {
        super(year, manufacture);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void call(int outputNumber) {
        super.call(outputNumber);
        System.out.println("Home phone");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
