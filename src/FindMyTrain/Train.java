package FindMyTrain;

public class Train {
    private String trainName;
    private String trainID;
    private String type;

    public Train(String trainName, String trainID, String type) {
        this.trainName = trainName;
        this.trainID = trainID;
        this.type = type;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainID='" + trainID + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
