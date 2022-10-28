public class RaceHorse extends Horse {
    private int races;

    public int getRaces() {return races;}
    public void setRaces(int races) {this.races = races;}

    public void printHorse() {
        System.out.printf("Name: %s\nColor: %s\nBirth Year: %d\nRaces: %d\n\n", name, color, birthYear, races);
    }
}
