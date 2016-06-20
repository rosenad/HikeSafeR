package hikingfolks.hikesafer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by adirosen on 6/20/16.
 */
public class RegionData {

    public static List<String> regionList(){
        return Arrays.asList("North", "Central", "South");
    }

    public static HashMap<String,List<String>> regionMap(){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("North", Arrays.asList("Nachal Amud", "Nachal Zoytan"));
        map.put("Central", Arrays.asList("Stalactite Cave", "Chirvat Mazin"));
        map.put("South", Arrays.asList("Ma'alei Eli"));
        return map;
    }

}
