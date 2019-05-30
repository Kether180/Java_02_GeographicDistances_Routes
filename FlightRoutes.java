package lab2.geoPosition;

import java.util.ArrayList;
import java.util.Collections;

public class FlightRoutes {
   
    public static void main(String[] args) {
        ArrayList<GeoRoute> flightRoutes = RouteData.createFlightRoutes();
        Collections.sort(flightRoutes);
        System.out.println(flightRoutes);
    }
   
}

