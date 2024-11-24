import java.util.ArrayList;
import java.util.List;

public class Station {

    private String stationId;
    private String stationName;
    private List<Platfrom> platfromList;


    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.platfromList = new ArrayList<>();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public List<Platfrom> getPlatfromList() {
        return platfromList;
    }

    public void setPlatfromList(List<Platfrom> platfromList) {
        this.platfromList = platfromList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platfromList=" + platfromList +
                '}';
    }
}
