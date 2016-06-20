package hikingfolks.hikesafer;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Created by adirosen on 6/19/16.
 */
public class ParseJSON {
    public static List<Hike> hike;

    public ParseJSON(){

    }


    public static void main(String[] args) {

        try {
            BufferedReader jsonFile = new BufferedReader(new FileReader("data.json"));
            Type hikeList = new TypeToken<List<Hike>>(){}.getType();
            hike = new Gson().fromJson(jsonFile ,hikeList);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
