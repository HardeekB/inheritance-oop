public class rbi {
    private int repoRate = 6;
    public int lastUpdate = 2023;
    protected int getRepoRate() {
        return repoRate;
    }
}

class sbi extends rbi{
    rbi rbiRate = new rbi();
    protected int validFrom = rbiRate.lastUpdate;
    private int repoRates = rbiRate.getRepoRate();
    int getIntresetRate(){
        return repoRates-2;
    }
}
