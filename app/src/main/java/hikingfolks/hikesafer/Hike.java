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
    public class Person{
        int child;
        int adult;
        int student;
        int pensioner;

        public Person(int child, int adult, int student, int pensioner) {
            this.child = child;
            this.adult = adult;
            this.student = student;
            this.pensioner = pensioner;
        }
    }
    Person cost;
    public class Season{
        Times summer;
        Times winter;

        public Season(Times summer, Times winter) {
            this.summer = summer;
            this.winter = winter;
        }

    }
    public class Times{
        String regular;
        String fridays;

        public Times(String regular, String fridays) {
            this.regular = regular;
            this.fridays = fridays;
        }
    }
    Season hours;
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

    public Hike(String name, String location, String altitude, String description, String region, String time, String distance, String difficulty, int cost1,int cost2, int cost3,int cost4 , String season1, String season2, String season3 , String season4 , Boolean overnight, int water, int bagWeight, String[] keywords, String areaContact, String userReviews, String timeOfYear, String other, Boolean disabledFriendly, Boolean dogs) {
        this.name = name;
        this.location = location;
        this.altitude = altitude;
        this.description = description;
        this.region = region;
        this.time = time;
        this.distance = distance;
        this.difficulty = difficulty;
        this.cost = new Person(cost1, cost2, cost3, cost4);
        this.hours = new Season(new Times(season1, season2), new Times(season3, season4));
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
