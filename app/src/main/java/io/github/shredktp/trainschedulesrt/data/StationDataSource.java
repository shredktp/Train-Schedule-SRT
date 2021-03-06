package io.github.shredktp.trainschedulesrt.data;

import java.util.ArrayList;

import io.github.shredktp.trainschedulesrt.model.Station;

/**
 * Created by Korshreddern on 28-Jan-17.
 */

public interface StationDataSource {
    int countStation();

    long addStation(String name);
    long addStation(String name, String line);
    long addStation(ArrayList<Station> stationArrayList);
    long addStation(Station[] station);

    ArrayList<Station> getAllStation();
    Station getStation(String name);
    Station getStation(String name, String line);

    ArrayList<Station> searchStation(String piecesOfStation);

//    long updateStation(String name);
//    long updateStation(ArrayList<Station> stationArrayList);

//    long deleteAllStation();
//    long deleteStation(String name);
}
