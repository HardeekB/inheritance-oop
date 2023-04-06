package banksystem;

public class Rbi {
    private final int repoRate = 6;
    public int lastUpdate = 2023;

    protected int getRepoRate() {
        return repoRate;
    }
}

class Sbi extends Rbi {
    Rbi rbiRate = new Rbi();
    protected int validFrom = rbiRate.lastUpdate;
    private final int repoRates = rbiRate.getRepoRate();

    int getIntresetRate() {
        return repoRates - 2;
    }
}
