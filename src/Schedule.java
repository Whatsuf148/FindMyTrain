public class Schedule {

    private Train train;
    private Station station;
    private Platfrom platfrom;
    private String arrivalTime;
    private String departureTime;


    public Schedule(Train train, Station station, Platfrom platfrom, String arrivalTime, String departureTime) {
        this.train = train;
        this.station = station;
        this.platfrom = platfrom;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Platfrom getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(Platfrom platfrom) {
        this.platfrom = platfrom;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", platfrom=" + platfrom +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                '}';
    }
}
