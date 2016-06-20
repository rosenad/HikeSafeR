package hikingfolks.hikesafer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

        viewName.setText(hikeMap.get("Nahal Amud").name);
        viewLocation.setText(hikeMap.get("Nahal Amud").location);
        viewAltitude.setText(hikeMap.get("Nahal Amud").altitude);
        viewDescription.setText(hikeMap.get("Nahal Amud").description);
        viewRegion.setText(hikeMap.get("Nahal Amud").region);
        viewTime.setText(hikeMap.get("Nahal Amud").time);
        viewDistance.setText(hikeMap.get("Nahal Amud").distance);
        viewDifficulty.setText(hikeMap.get("Nahal Amud").difficulty);

//        viewMap = (ImageView) rootView.findViewById(R.id.viewMap);
//        viewMap.setImageURI((new URL("https://www.google.co.il/maps/dir/32.9100622,35.4864562/32.8764549,35.5030149/@32.8936893,35.4849258,14.07z/data=!4m2!4m1!3e2)").toURI()));
//        Drawable hikeImage = getResources().getDrawable(android.R.drawable.viewMap);
//        viewMap.setImageDrawable(hikeImage);

        return rootView;
    }


}
