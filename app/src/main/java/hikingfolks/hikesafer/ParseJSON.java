package hikingfolks.hikesafer;


import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


/**
 * Created by adirosen on 6/19/16.
 */
public class ParseJSON {

    public ParseJSON(){

    }


    public static void main(String[] args) {
        Type hikeList = new TypeToken<ArrayList<Hike>>(){}.getType();
//        List<Hike> hike = new Gson().fromJson(jsonArray ,hikeList);


    }
}
