package FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainAPP {
    public static void main(String[] args) {
        TrainSystem system=new TrainSystem();

        Station station1=new Station("Agra","SOO333");
        Station station2=new Station("Lucknow","SOO444");
        Train train1=new Train("Kacheguda Exp", "12408","Express");

        Train train2=new Train("Intercity","12608","Passenger");
        Platform p1=new Platform(1);
        Platform p2=new Platform(2);
        p1.setTrain(train1);
        p2.setTrain(train2);
        List<Platform> platformList=new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);
        Schedule s1=new Schedule(train1,station1,"9AM","9:05AM",p1);
        Schedule s2=new Schedule(train1,station2,"10AM","10:02AM",p2);
        system.addStations(station1);
        system.addStations(station2);
        system.addTrains(train1);
        system.addTrains(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the source");
        String source=sc.nextLine();
        System.out.println(("enter the destination"));
        String des=sc.nextLine();
        List<Schedule> myTrains=system.findMyTrains(source,des);
        for(Schedule schedule:myTrains){
            System.out.println(schedule);
        }

    }
}
