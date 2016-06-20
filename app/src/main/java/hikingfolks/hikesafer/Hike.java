package hikingfolks.hikesafer;

/**
 * Created by adirosen on 6/19/16.
 */
public class Hike {
    String name;
    String location;
    String altitude;
    String description;
    String region;
    String time;
    String distance; //km
    String difficulty;
    private class Person{
        int child;
        int adult;
        int student;
        int pensioner;
    }
    Person cost;
    private class Season{
        Times summer;
        Times winter;

        private class Times{
            String regular;
            String fridays;
        }
    }
    Season[] hours;
    Boolean overnight;
    int water;
    int bagWeight;
    String[] keywords;
    //transportation
    String areaContact;
    String userReviews;
    String timeOfYear;
    String other;
    Boolean disabledFriendly;
    Boolean dogs;

}
