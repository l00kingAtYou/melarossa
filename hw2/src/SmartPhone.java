public class SmartPhone extends AbstractPhone{
    private String screenResolution;
    private String operationSystem;

    public SmartPhone(int year, String manufacture, String screenResolution, String operationSystem) {
        super(year, manufacture);
        this.screenResolution = screenResolution;
        this.operationSystem = operationSystem;
    }

    public void playGame() {
        System.out.println("Play the game. Game rendered in " + screenResolution);
    }

    public void install(String program) {
        System.out.println("Installing! " + program + " for " + operationSystem);
    }
}
