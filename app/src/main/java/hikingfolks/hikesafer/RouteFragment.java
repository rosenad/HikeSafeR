package hikingfolks.hikesafer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

        viewName.setText(MainActivity.json.hike.get(1).name);
        viewLocation.setText(ParseJSON.hike.get(1).location);
        viewAltitude.setText(ParseJSON.hike.get(1).altitude);
        viewDescription.setText(ParseJSON.hike.get(1).description);
        viewRegion.setText(ParseJSON.hike.get(1).region);
        viewTime.setText(ParseJSON.hike.get(1).time);
        viewDistance.setText(ParseJSON.hike.get(1).distance);
        viewDifficulty.setText(ParseJSON.hike.get(1).difficulty);

        viewMap = (ImageView) rootView.findViewById(R.id.viewMap);
//        viewMap.setImageURI((new URL("https://www.google.co.il/maps/dir/32.9100622,35.4864562/32.8764549,35.5030149/@32.8936893,35.4849258,14.07z/data=!4m2!4m1!3e2)").toURI()));
//        Drawable hikeImage = getResources().getDrawable(android.R.drawable.viewMap);
//        viewMap.setImageDrawable(hikeImage);

        return rootView;
    }


}
