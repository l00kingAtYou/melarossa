public class Main {

    public static void main(String[] args) {
        AbstractPhone smartPhone = new SmartPhone(2020,"Apple", "1440p", "A14");
        SmartPhone galaxy = new SmartPhone(2020,"Samsung", "1440p", "Exynos");
        AbstractPhone homePhone = new HomePhone(2017,"Siemens", "88005553535");

        homePhone.call(75548464);
        galaxy.playGame();
        galaxy.call(35);
        galaxy.ring(54);
//        smartPhone.playGame();
    }
}
