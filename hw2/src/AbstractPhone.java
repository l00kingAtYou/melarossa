public abstract class AbstractPhone {
    private int year;
    private String manufacture;

    public AbstractPhone(int year, String manufacture) {
        this.year = year;
        this.manufacture = manufacture;
    }

    public void call(int outputNumber) {
        System.out.println("calling " + outputNumber);
    }

    public  void ring(int inputNumber) {
        System.out.println("Ring!" + inputNumber + " is calling");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPhone)) return false;

        AbstractPhone that = (AbstractPhone) o;

        if (year != that.year) return false;
        return manufacture.equals(that.manufacture);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + manufacture.hashCode();
        return result;
    }
}
