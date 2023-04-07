package com.system.bank;

public class Sbi extends Rbi {
    Rbi rbiRate = new Rbi();
    protected int validFrom = rbiRate.lastUpdate;
    private final int repoRates = rbiRate.getRepoRate();

    protected int getIntresetRate() {
        return repoRates - 2;
    }
}
