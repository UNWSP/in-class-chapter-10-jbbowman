public class DemoHorse {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();

        horse1.setName("John");
        horse1.setColor("Blue");
        horse1.setBirthYear(1999);
        horse2.setName("Bob");
        horse2.setColor("Green");
        horse2.setBirthYear(2005);
        horse2.setRaces(5);

        horse1.printHorse();
        horse2.printHorse();
    }
}
