package D33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LeftJoinTest {

        @Test
        public void leftJoinTest() {
            Map<String, String> map1 = new HashMap<>();
            map1.put("fond", "enamored");
            map1.put("wrath", "anger");
            map1.put("diligent", "employed");
            map1.put("outfit", "garb");
            map1.put("guide", "usher");
            System.out.println("Map 1 = " + map1);
            System.out.println("Map 1 KeySet = " + map1.keySet());

            Map<String, String> map2 = new HashMap<>();
            map2.put("fond", "averse");
            map2.put("wrath", "delight");
            map2.put("diligent", "idle");
            map2.put("guide", "follow");
            map2.put("flow", "jam");
            System.out.println("Map 2 = " + map2);


            Map<String, List<String>> actual = LeftJoin.leftJoin(map1, map2);
            Map<String, List<String>> expected = new HashMap<>();

            List<String> fondList = new ArrayList<>();
            fondList.add("enamored");
            fondList.add("averse");

            expected.put("fond", fondList);

            List<String> wrathList = new ArrayList<>();
            wrathList.add("anger");
            wrathList.add("delight");

            List<String> diligentList = new ArrayList<>();
            diligentList.add("employed");
            diligentList.add("idle");

            List<String> guideList = new ArrayList<>();
            guideList.add("usher");
            guideList.add("follow");

//            List<String> flowList = new ArrayList<>();
//            flowList.add("usher");
//            flowList.add("jam");

            assertEquals(expected, actual);
        }
    }