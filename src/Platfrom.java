public class Platfrom {

    private int platfromNumber;
    private Train train;

    public Platfrom(int platfromNumber) {
        this.platfromNumber = platfromNumber;
    }

    public int getPlatfromNumber() {
        return platfromNumber;
    }

    public void setPlatfromNumber(int platfromNumber) {
        this.platfromNumber = platfromNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platfrom{" +
                "platfromNumber=" + platfromNumber +
                ", train=" + train +
                '}';
    }
}
