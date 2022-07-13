package ObjectTutorial;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantResponse {
    private ArrayList<Restaurant> restaurantList;
    private String requestId;
    private Date dateGenerated;

    public RestaurantResponse(ArrayList<Restaurant> restaurantList, String requestId, Date dateGenerated) {
        this.restaurantList = restaurantList;
        this.requestId = requestId;
        this.dateGenerated=dateGenerated;
    }
    public void showRestaurants() {
        for(int i=0;i<restaurantList.size();i++) {
            System.out.println(restaurantList.get(i).getInformation());
        }
    }
}
