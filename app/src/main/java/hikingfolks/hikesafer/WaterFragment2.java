package hikingfolks.hikesafer;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adirosen on 6/20/16.
 */
public class WaterFragment2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public WaterFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WaterFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static WaterFragment2 newInstance(String param1, String param2) {
        WaterFragment2 fragment = new WaterFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

            int volume = Integer.parseInt(mParam1); // in milliliters

            // temperature came in here
            String longitude = "31";
            String latitude = "35";

            String address = "http://api.openweathermap.org/data/2.5/weather?lon="+longitude+"&lat="+latitude+"&units=metric&appid=";
            String key = "f788fb5757f2400068af4d33c24173df";


            URL website = null;
            try {
                website = new URL(address + key);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(website.openStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String text = "", inputLine;
            try {
                while ((inputLine = in.readLine()) != null)
                    text += inputLine;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // String to be scanned to find the pattern.
            text = text.substring(text.indexOf("temp"));
            String pattern = "(\\d+)";

            // Create a Pattern object
            Pattern r = Pattern.compile(pattern);

            // Now create matcher object.
            Matcher m = r.matcher(text);
            if (m.find( )) {
                System.out.println("Current temperature: " + m.group(0) +" degrees celsius");
            } else {
                System.out.println("Temperature not available!");
            }
            int temperature = 31;

            // how long will water last, how much more do I need, how far should I hike
            int base = 300;

            int ml_per_hour = base + 20 * temperature;

            int hours_left = volume / ml_per_hour;

            int water_needed = 1000 - volume; // because you need 1 liter

            int distance = hours_left * 5;



        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_water2, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {


        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
