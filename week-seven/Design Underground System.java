import java.util.HashMap;
import java.util.Map;

public class DesignUndergroundSystem {
    static class UndergroundSystem {
        static class CheckInInfo {
            String stationName;
            int time;
            CheckInInfo(String stationName, int time) {
                this.stationName = stationName;
                this.time = time;
            }
        }

        static class RouteInfo {
            double totalTime = 0;
            int count = 0;
        }

        private Map<Integer, CheckInInfo> checkInMap = new HashMap<>();
        private Map<String, RouteInfo> routeMap = new HashMap<>();

        public void checkIn(int id, String stationName, int t) {
            checkInMap.put(id, new CheckInInfo(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            CheckInInfo info = checkInMap.remove(id);
            String route = info.stationName + "->" + stationName;
            double duration = t - info.time;

            routeMap.putIfAbsent(route, new RouteInfo());
            RouteInfo routeInfo = routeMap.get(route);
            routeInfo.totalTime += duration;
            routeInfo.count++;
        }

        public double getAverageTime(String startStation, String endStation) {
            String route = startStation + "->" + endStation;
            RouteInfo info = routeMap.get(route);
            return info.totalTime / info.count;
        }
    }

    public static void main(String[] args) {
        UndergroundSystem system = new UndergroundSystem();
        system.checkIn(45, "Leyton", 3);
        system.checkIn(32, "Paradise", 8);
        system.checkIn(27, "Leyton", 10);

        system.checkOut(45, "Waterloo", 15);
        system.checkOut(27, "Waterloo", 20);
        system.checkOut(32, "Cambridge", 22);

        System.out.println("Average Time (Leyton -> Waterloo): " + system.getAverageTime("Leyton", "Waterloo"));

        system.checkIn(10, "Leyton", 24);
        system.checkOut(10, "Waterloo", 38);
        System.out.println("Average Time (Leyton -> Waterloo): " + system.getAverageTime("Leyton", "Waterloo"));
    }
}

/*
INPUT & OUTPUT:

Average Time (Leyton -> Waterloo): 11.0
Average Time (Leyton -> Waterloo): 12.0
*/
