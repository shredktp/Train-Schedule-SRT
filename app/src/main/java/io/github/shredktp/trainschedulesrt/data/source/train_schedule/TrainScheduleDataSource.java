package io.github.shredktp.trainschedulesrt.data.source.train_schedule;

import java.util.ArrayList;

import io.github.shredktp.trainschedulesrt.data.TrainSchedule;

/**
 * Created by Korshreddern on 07-Feb-17.
 */

public interface TrainScheduleDataSource {

    long add(TrainSchedule trainSchedule);
    long add(ArrayList<TrainSchedule> trainScheduleArrayList);

    ArrayList<TrainSchedule> getTrainScheduleByStation(String startStation, String endStation);
    ArrayList<TrainSchedule> getTrainScheduleByIsFirst();
    ArrayList<TrainSchedule> getAllTrainSchedule();

    int deleteAll();
}
