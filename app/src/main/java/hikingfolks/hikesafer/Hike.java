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

    public Hike(String name, String location, String altitude, String description, String region, String time, String distance, String difficulty, Person cost, Season[] hours, Boolean overnight, int water, int bagWeight, String[] keywords, String areaContact, String userReviews, String timeOfYear, String other, Boolean disabledFriendly, Boolean dogs) {
        this.name = name;
        this.location = location;
        this.altitude = altitude;
        this.description = description;
        this.region = region;
        this.time = time;
        this.distance = distance;
        this.difficulty = difficulty;
        this.cost = cost;
        this.hours = hours;
        this.overnight = overnight;
        this.water = water;
        this.bagWeight = bagWeight;
        this.keywords = keywords;
        this.areaContact = areaContact;
        this.userReviews = userReviews;
        this.timeOfYear = timeOfYear;
        this.other = other;
        this.disabledFriendly = disabledFriendly;
        this.dogs = dogs;
    }
}
