package hikingfolks.hikesafer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by adirosen on 6/20/16.
 */
public class RouteFragment extends Fragment {
    TextView viewName;
    TextView viewLocation;
    TextView viewAltitude;
    TextView viewDescription;
    TextView viewRegion;
    TextView viewTime;
    TextView viewDistance; //km
    TextView viewDifficulty;

    ImageView viewMap;

    public RouteFragment(){

    }
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_route, container, false);
        viewName = (TextView) rootView.findViewById(R.id.viewName);
        viewLocation = (TextView) rootView.findViewById(R.id.viewLocation);
        viewAltitude = (TextView) rootView.findViewById(R.id.viewAltitude);
        viewDescription = (TextView) rootView.findViewById(R.id.viewDescription);
        viewRegion = (TextView) rootView.findViewById(R.id.viewRegion);
        viewTime = (TextView) rootView.findViewById(R.id.viewTime);
        viewDistance = (TextView) rootView.findViewById(R.id.viewDistance);
        viewDifficulty = (TextView) rootView.findViewById(R.id.viewDifficulty);

        HashMap<String, Hike> hikeMap = new HashMap<String,Hike>();

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


        hikeMap.put("Nachal Zoytan", new Hike(
                "Road 9088 - Near Katzrin",
                "",
                "",
                "Deep canyons cut through the center of Ramat Hagolan and along these canyons waterfalls stream down to the deep pools.",
                "North",
                "5 hours",
                "6 km",
                "medium-hard",
                29,15,25,15,
                "08:00-17:00","08:00-16:00","08:00-16:00", "08:00-15:00",
                false,
                2,
                3,
                new String[]{"spring", "north", "short"},
                "02-9942355",
                "",
                "all",
                "Start 6 hours before sunset.",
                true,
                true
        ));

        hikeMap.put("Stalactite Cave", new Hike(
                "Road 3866",
                "",
                "",
                "In this nature reserve there is a natural,expansive plowing area and one of the most beautiful stalactite caves in Israel.",
                "center",
                "45 minutes",
                "10km",
                "hard",
                29,15,25,15,
                "08:00-17:00","08:00-16:00","08:00-16:00", "08:00-15:00",
                false,
                2,
                3,
                new String[]{"cave", "family", "center"},
                "02-9911117",
                "",
                "all",
                "",
                false,
                false
        ));

        hikeMap.put("Chirvat Mazin - Einot Tzukim", new Hike(
                "Road 90 - 271 Kilometre mark",
                "",
                "",
                "One of the most amazing phenomenons of nature in the land of Israel. Now you can become familiar with its views on a path that starts opposite Churvat Mazin and finishes at Einot Tzukim.",
                "Yehuda and Shomron",
                "5 hours",
                "6.5 km",
                "hard",
                0,0,0,0,
                "always open", "always open", "always open", "always open",
                false,
                2,
                3,
                new String []{"summer", "disabled friendly", "swimming"},
                "02-9942355",
                "",
                "all",
                "Start 6 hours before sunset.",
                true,
                false

        ));
        String hikeName = NavigationActivity.name;
        Log.d("jakhsjkdahsjkdh", hikeName);

        viewName.setText(hikeName);
        viewLocation.setText(hikeMap.get(hikeName).location);
        viewAltitude.setText(hikeMap.get(hikeName).altitude);
        viewDescription.setText(hikeMap.get(hikeName).description);
        viewRegion.setText(hikeMap.get(hikeName).region);
        viewTime.setText(hikeMap.get(hikeName).time);
        viewDistance.setText(hikeMap.get(hikeName).distance);
        viewDifficulty.setText(hikeMap.get(hikeName).difficulty);

//        viewMap = (ImageView) rootView.findViewById(R.id.viewMap);
//        viewMap.setImageURI((new URL("https://www.google.co.il/maps/dir/32.9100622,35.4864562/32.8764549,35.5030149/@32.8936893,35.4849258,14.07z/data=!4m2!4m1!3e2)").toURI()));
//        Drawable hikeImage = getResources().getDrawable(android.R.drawable.viewMap);
//        viewMap.setImageDrawable(hikeImage);

        return rootView;
    }


}
