package com.citytouristguide;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CityTouristGuide {

    private Map<String, Set<String>> cityAttractions;

    // Constructor to initialize the map
    public CityTouristGuide() {
        cityAttractions = new HashMap<>();
    }

    // Method to add a city and its attractions
    public void addCityAttractions(String city, Set<String> attractions) {
        cityAttractions.put(city, attractions);
    }

    // Method to display attractions of a city
    public void displayAttractions(String city) {
        Set<String> attractions = cityAttractions.get(city);
        if (attractions != null) {
            System.out.println("Tourist attractions in " + city + ": ");
            for (String attraction : attractions) {
                System.out.println("- " + attraction);
            }
        } else {
            System.out.println("No attractions found for " + city);
        }
    }

    // Method to display all cities and their attractions
    public void displayAllAttractions() {
        for (Map.Entry<String, Set<String>> entry : cityAttractions.entrySet()) {
            System.out.println("City: " + entry.getKey());
            for (String attraction : entry.getValue()) {
                System.out.println("  - " + attraction);
            }
        }
    }

    public static void main(String[] args) {
        CityTouristGuide guide = new CityTouristGuide();

        // Adding attractions for cities
        Set<String> parisAttractions = new HashSet<>();
        parisAttractions.add("Eiffel Tower");
        parisAttractions.add("Louvre Museum");
        guide.addCityAttractions("Paris", parisAttractions);

        Set<String> newYorkAttractions = new HashSet<>();
        newYorkAttractions.add("Statue of Liberty");
        newYorkAttractions.add("Central Park");
        guide.addCityAttractions("New York", newYorkAttractions);

        // Displaying all attractions
        guide.displayAllAttractions();

        // Displaying attractions of a specific city
        guide.displayAttractions("Paris");
    }
}
