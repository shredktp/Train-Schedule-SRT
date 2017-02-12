package io.github.shredktp.trainschedulesrt.data;

/**
 * Created by Korshreddern on 11-Feb-17.
 */

public class PairStation {
    private String startStation;
    private String endStation;
    private boolean isSeeItFirst;
    private long timestamp;

    public PairStation(String startStation, String endStation, boolean isSeeItFirst, long timestamp) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.isSeeItFirst = isSeeItFirst;
        this.timestamp = timestamp;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public boolean isSeeItFirst() {
        return isSeeItFirst;
    }

    public void setSeeItFirst(boolean seeItFirst) {
        isSeeItFirst = seeItFirst;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "PairStation{" +
                "\nstartStation='" + startStation + '\'' +
                ",\nendStation='" + endStation + '\'' +
                ",\nisSeeItFirst=" + isSeeItFirst +
                ",\ntimestamp=" + timestamp +
                "\n}";
    }
}
