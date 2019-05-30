                                        Java Praktikum Lab 02 Geographic Distances Routes

1.1 Geographic Distances

The classes and interfaces do have the following purpose:

          ▪ GeoPosition represents a location. Use the class created in lab exercise 1.
          ▪ GeoRoute represents a distance or a route between geographic locations.
          ▪ GeoTrack represents a (e.g. while jogging) recorded route.
          ▪ RouteData creates some routes to save typing work.
          ▪ The interface Distance allows to query a length.
          ▪ The interface Comparable is known from the lecture and provided by Java.

2.1 Functionality

2.2 Interface Distance
▪ Requirement 1 The interface declares an abstract method getDistance() to return a distance.
Declaration:

          ▪ double getDistance()

3.1 Class GeoRoute
▪ Requirement 2 A route has a name and an organized list of way points.

▪ Requirement 3 The class has two constructors, one to which the name is passed and another one to which the name as well as a list of way points is passed.

▪ Requirement 4 The name can be received by using a getter and be assigned a new value by using a setter.

▪ Requirement 5 The method addWaypoint() adds a way point to the end of the list.

▪ Requirement 6 The method removeWaypoint() removes a way point with index i from the list.

▪ Requirement 7 The method getNumberWaypoints() returns the number of way point being in the list.

▪ Requirement 8 The method getWaypoint() returns a reference to a way point with index i. Please remember that the first element of the list has the index 0.

▪ Requirement 9 The method getWaypoints() returns an array with all way points contained in the list. (Please note: use one of the toArray()-methods of class ArrayList. How are the methods different? Which one should you use best?)

▪ Requirement 10 The class implements the interface Distance. The method getDistance() returns the total distance of a route in kilometers.

▪ Requirement 11 The class implements the interface Comparable<GeoRoute>. The criterion for the comparison is the total distance.
  
▪ Requirement 12 The class overrides the method toString(). The return value has the format „<Name> (<Gesamtstrecke> km)“, whereas expressions in angle brackets are to be replaced by the corresponding values. The value of the total distance is output with one decimal place.
  
  Declarations:
  
          ▪ public GeoRoute(String name)
          ▪ public GeoRoute(String name, ArrayList<GeoPosition> waypoints)
          ▪ public String getName()
          ▪ public void setName(String name)
          ▪ public void addWaypoint(GeoPosition waypoint)
          ▪ public void removeWaypoint(int index)
          ▪ public int getNumberWaypoints()
          ▪ public GeoPosition getWaypoint(int index)
          ▪ public GeoPosition[] getWaypoints()
          ▪ public double getDistance()
          ▪ public int compareTo(GeoRoute other)
          ▪ public String toString()
  
  
  3.2 Class GeoTrack
▪ Requirement 13 The class extends the class GeoRoute by the date on which the represented route was covered. The date is stored as string having the format yyyy-mm-dd with year y, month m and day d.

▪ Requirement 14 Exactly one constructor is existing to which the name of the route and the date are passed.

▪ Requirement 15 The date can be received by using a getter and be assigned a new value by using a setter.

  Declarations:

          ▪ GeoTrack(String name, String date)
          ▪ public String getDate()
          ▪ public void setDate(String date)

3.2 Unit-Tests
Requirement 16 Ensure that all given Unit-tests are executed properly.

4.1 HAW-Running Group
You want to start a HAW running group. The following three routes are available: from the HAW around the Binnenalster or the Außenalster and back or around the city park.

Create an executable class to estimate the lengths of these routes. The class RouteData contains methods that generate routes around the Binnenalster or Außenalster. You still must create the route around the city park. Coordinates of the waypoints can be obtained, for example, by clicking on the corresponding positions in Google Maps. Choose as the starting point the connection of the Ohlsdorfer Straße to the Jahnkampfbahn and add some coordinates, which lead you in the largest possible round around the city park and back to the starting point. Transfer the length of the routes to the table below.

        Route         Length km 

        Binnenalster
        Außenalster
        City Park


5.1 Flight Routes

The method createFlightRoutes() of the class RouteData creates a list of different flight routes. Create an executable class that sorts the list in ascending order of the length of the flight routes and then outputs the routes and route names. (Please note: A list of type ArrayList list can be sorted using the class method Collections.sort().)
