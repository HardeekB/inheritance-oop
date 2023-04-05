public class customer extends sbi{
    public static void main(String[] args) {
        customer rbiRate = new customer();
        int repoRates = rbiRate.getRepoRate();
        System.out.println("RBI's current repo rates are:" + repoRates);
        System.out.println("Last updated " + rbiRate.lastUpdate);
        System.out.println("SBI's FD rates are:" + rbiRate.getIntresetRate());
        System.out.println("Note: Applicable " + rbiRate.validFrom + " onwards");

    }
}