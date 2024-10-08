package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationName;
    private String stationID;
    private List<Platform> platformList;

    public Station(String stationName, String stationID) {
        this.stationName = stationName;
        this.stationID = stationID;
        this.platformList=new ArrayList<>();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", stationID='" + stationID + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
