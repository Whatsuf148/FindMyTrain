import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();

        Station station1 = new Station("01", "Delhi");
        Station station2 = new Station("02", "Agar");
        Train train1 = new Train("T01", "Express1", "Faster");
        Train train2 = new Train("T02", "Passenger", "Express");

        //adding platform
        Platfrom p1 = new Platfrom(1);
        Platfrom p2 = new Platfrom(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platfrom> platfromList = new ArrayList<>();
        platfromList.add(p1);
        platfromList.add(p2);

        station1.setPlatfromList(platfromList);

        Schedule s1 = new Schedule(train1, station1, p1, "9:00 AM", "9:05 AM");
        Schedule s2 = new Schedule(train2, station2, p2, "10:00 AM", "10:05 AM");

        system.addTrain(train1);
        system.addStation(station1);
        system.addSchedule(s1);
        system.addTrain(train2);
        system.addStation(station2);
        system.addSchedule(s2);

        //FindMyTrain
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Source : ");
        String source = sc.nextLine();
        System.out.println("Enter the destination :");
        String des = sc.nextLine();

        List<Schedule> myTrains = system.FindMyTrain(source, des);
        System.out.println("Your Trains between" + source + " and " + des + "is :");
        for (Schedule schedule : myTrains) {
            System.out.println(schedule);
        }


    }


}
