package hikingfolks.hikesafer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by adirosen on 6/20/16.
 */
public class RegionData {

    public static List<String> regionList(){
        return Arrays.asList("North", "Central", "South");
    }

    public static HashMap<String,List<String>> regionMap(){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("North", Arrays.asList("Nahal Amud", "Nachal Zoytan"));
        map.put("Central", Arrays.asList("Stalactite Cave", "Chirvat Mazin - Einot Tzukim"));
        map.put("South", Arrays.asList("Maaleh Eli - Small Crater"));
        return map;
    }

}
