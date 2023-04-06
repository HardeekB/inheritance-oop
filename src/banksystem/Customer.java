package banksystem;

public class Customer extends Sbi {
    public static void main(String[] args) {
        Customer rbiRate = new Customer();
        int repoRates = rbiRate.getRepoRate();
        System.out.println("RBI's current repo rates are:" + repoRates);
        System.out.println("Last updated " + rbiRate.lastUpdate);
        System.out.println("SBI's FD rates are:" + rbiRate.getIntresetRate());
        System.out.println("Note: Applicable " + rbiRate.validFrom + " onwards");
    }
}