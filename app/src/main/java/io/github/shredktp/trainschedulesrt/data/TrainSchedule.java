package io.github.shredktp.trainschedulesrt.data;

/**
 * Created by Korshreddern on 25-Jan-17.
 */

public class TrainSchedule {
    private String StartEndStation;
    private String number;
    private String type;
    private String startTime;
    private String endTime;

    public TrainSchedule(String startEndStation, String number, String type, String startTime,
                         String endTime) {
        this.StartEndStation = startEndStation;
        this.number = number;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartEndStation() {
        return StartEndStation;
    }

    public void setStartEndStation(String startEndStation) {
        StartEndStation = startEndStation;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "TrainSchedule{" +
                "\nStartEndStation='" + StartEndStation + '\'' +
                ",\nnumber='" + number + '\'' +
                ",\ntype='" + type + '\'' +
                ",\nstartTime='" + startTime + '\'' +
                ",\nendTime='" + endTime + '\'' +
                "\n}";
    }
}
