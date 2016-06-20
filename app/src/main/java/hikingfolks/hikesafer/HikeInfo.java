package hikingfolks.hikesafer;

import java.util.HashMap;

/**
 * Created by adirosen on 6/20/16.
 */
public class HikeInfo {
    HashMap<String, Hike> hikeMap = new HashMap<String,Hike>();

    hikeMap.put("Nahal Amud",new Hike("Nahal Amud", "Road 8669 - Between kilometre 40 and 41", 170,
                                              "description": "A mix of unique nature and man-made beauties. In the place you can find Nachal Eitan, pools between the rocks, rich fauna along the banks of the streams, and caves of ancient Man.",
                                              "region": "galilee",
                                              "time": "3 hours",
                                              "distance": "10km",
                                              "difficulty": "hard",
                                              "cost": {
        "adult": "29",
                "child": "15",
                "student": "25",
                "pensioner": "15"
    },
            "hours": {
        "summer": {"regular": "08:00-17:00", "fridays": "08:00-13:00"},
        "winter": {"regular": "08:00-17:00", "fridays": "08:00-13:00"}
    },
            "overnight": "false",
            "water": "2",
            "bagWeight": "3",
            "keywords": ["water", "swimming", "family", "north"],
            "transportation": "",
            "areaContact": "04-6999984",
            "userReviews": [{
        "userName": "snag87",
                "rating": "4",
                "review": "I had a great time taking my family here in September. Highly recommended!"
    }, {
        "userName": "rosenad",
                "rating": "2",
                "review": "Make sure you don't take kids younger than 5. We made that mistake."
    }],
            "timeOfYear": "all",
            "other": "",
            "disabledFriendly": "false",
            "dogs": "true")


}
