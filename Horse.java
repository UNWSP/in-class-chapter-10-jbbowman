public class Horse {
    protected String name, color;
    protected int birthYear;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getBirthYear() {return birthYear;}
    public void setBirthYear(int birthYear) {this.birthYear = birthYear;}

    public void printHorse() {
        System.out.printf("Name: %s\nColor: %s\nBirth Year: %d\n\n", name, color, birthYear);
    }
}
