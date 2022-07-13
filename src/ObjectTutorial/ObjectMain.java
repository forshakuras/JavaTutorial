package ObjectTutorial;

import java.util.ArrayList;
import java.util.Date;

public class ObjectMain {
    public static void main(String[] args) {
//        Fruit apple = new Fruit("Apple", "Red", "Sweet");
//        Fruit lemon = new Fruit("Lemon", "Yellow", "Sour");
//        Fruit watermelon = new Fruit("Watermelon", "Green", "Sweet");
//
//        apple.ShowInformation();
//        lemon.ShowInformation();
//        watermelon.ShowInformation();
//
//        Fruit.ShowInformationStatic();

        Restaurant jAndY = new Restaurant("J and Y Chinese cuisine", "somewhere on leslie and sheppard",
                5.0d, "some url on aws", 4);
        Restaurant mcDonalds = new Restaurant("Mcdonalds", "somewhere near singer ct",
                1.0, "some other url on aws", 1);

        ArrayList<Restaurant> restaurants= new ArrayList();
        restaurants.add(jAndY);
        restaurants.add(mcDonalds);

        RestaurantResponse response= new RestaurantResponse(restaurants, "SomeId", new Date(2022,7,12));

        response.showRestaurants();
        //Post userPost = new Post("My reddit post", new Date("2022-07-12"), "someUser");
    }
}
