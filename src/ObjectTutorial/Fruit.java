package ObjectTutorial;

public class Fruit {
    private String name;
    private String colour;
    private String taste;
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public Fruit(String name, String colour, String taste) {
        this.name = name;
        this.colour = colour;
        this.taste = taste;
    }

    public void ShowInformation() {
        System.out.println(String.format("The fruit %s has the colour %s and tastes %s", name, colour, taste));
    }

    public static void ShowInformationStatic() {
        System.out.println("This is our static show information");
    }
}
