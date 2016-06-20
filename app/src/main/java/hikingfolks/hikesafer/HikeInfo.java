package hikingfolks.hikesafer;

import java.util.HashMap;

/**
 * Created by adirosen on 6/20/16.
 */
public class HikeInfo {
    static HashMap<String, Hike> hikeMap = new HashMap<String,Hike>();


    public static void returnMap() {
        hikeMap.put("Nahal Amud", new Hike("Nahal Amud",
                "Road 8669 - Between kilometre 40 and 41",
                "17",
                "A mix of unique nature and man-made beauties. In the place you can find Nachal Eitan, pools between the rocks, rich fauna along the banks of the streams, and caves of ancient Man.",
                "galilee",
                "3 hours",
                "10km",
                "hard",
                29, 15, 25, 15,
                "08:00-17:00", "08:00-13:00", "08:00-17:00", "08:00-13:00",
                false,
                2,
                3,
                new String[]{"water", "swimming", "family", "north"},
                "04-6999984",
                "snag87 '\n' rating: 4 '\n' review: I had a great time taking my family here in September. Highly recommended! '\n' rosenad '\n' rating : 2 '\n' review: Make sure you don't take kids younger than 5. We made that mistake.",
                "all",
                "",
                false,
                true));

        hikeMap.put("Maaleh Eli - Small Crater", new Hike(
                "",
                "",
                "170",
                "Adventures down south. Come and take a glance at the unique geological phenomenona in this nature reserve.",
                "South",
                "5 hours",
                "6 km",
                "medium-hard",
                0,0,0,0,
                "N/A","N/A","N/A","N/A",
                false,
                2,
                3,
                new String[]{"all year round", "south"},
                "08-6588821",
                "",
                "all",
                "",
                false,
                false
        ));



    }



}
