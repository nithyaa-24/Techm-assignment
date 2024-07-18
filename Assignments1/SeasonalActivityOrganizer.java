package com.app.organizer;



import java.util.EnumSet;
import java.util.Set;

public class SeasonalActivityOrganizer {

    // Enum for Seasons
    public enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    // Enum for Activities
    public enum Activity {
        HIKING, SWIMMING, SKIING, PUMPKIN_CARVING
    }

    // EnumSets for each season to store activities
    private EnumSet<Activity> springActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> summerActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> autumnActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> winterActivities = EnumSet.noneOf(Activity.class);

    // Get activities for a specific season
    public Set<Activity> getActivitiesForSeason(Season season) {
        switch (season) {
            case SPRING:
                return springActivities;
            case SUMMER:
                return summerActivities;
            case AUTUMN:
                return autumnActivities;
            case WINTER:
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    // Add activity for a specific season
    public Set<Activity> addActivityForSeason(Activity activity, Season season) {
        switch (season) {
            case SPRING:
                springActivities.add(activity);
                return springActivities;
            case SUMMER:
                summerActivities.add(activity);
                return summerActivities;
            case AUTUMN:
                autumnActivities.add(activity);
                return autumnActivities;
            case WINTER:
                winterActivities.add(activity);
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    // Remove activity from all seasons
    public void removeActivityFromAllSeasons(Activity activity) {
        springActivities.remove(activity);
        summerActivities.remove(activity);
        autumnActivities.remove(activity);
        winterActivities.remove(activity);
    }

    // Get all activities from all seasons
    public Set<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        allActivities.addAll(springActivities);
        allActivities.addAll(summerActivities);
        allActivities.addAll(autumnActivities);
        allActivities.addAll(winterActivities);
        return allActivities;
    }

    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();
        
        // Adding activities to seasons
        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

        // Getting all activities
        System.out.println(organizer.getAllActivities());

        // Getting activities for specific seasons
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER));
        System.out.println(organizer.getActivitiesForSeason(Season.WINTER));

        // Removing an activity from all seasons
        organizer.removeActivityFromAllSeasons(Activity.HIKING);

        // Getting activities for Spring after removal
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
    }
}
