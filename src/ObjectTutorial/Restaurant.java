package ObjectTutorial;

public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private double restaurantRating;
    private String restaurantPictureUrl;
    private int price;
    private String restaurantNameAndAddress;

    public Restaurant(String restaurantName, String restaurantAddress, double restaurantRating, String restaurantPictureUrl, int price) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantRating = restaurantRating;
        this.restaurantPictureUrl = restaurantPictureUrl;
        this.price = price;
        this.restaurantNameAndAddress = restaurantName+" is located at "+restaurantAddress;
    }

    public String getInformation(){
        return restaurantName+" is located at "+restaurantAddress;
    }
}
