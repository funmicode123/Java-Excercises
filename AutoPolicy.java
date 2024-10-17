public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        switch (state) {
            case "CT": // Connecticut
            case "MA": // Massachusetts
            case "NH": // New Hamphsire
            case "NJ": // New Jersey
            case "NY": // New York
            case "PA": // Pennsylvania
            case "VT": // Vermont
                return true;
            default:
                return false;
        }
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account: %d; Car: %s; %nState %s %s a no-fault state.%n%n",
                policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }

    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

}
