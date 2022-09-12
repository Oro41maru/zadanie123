public class main {
    public static void main(String[] args) {
        veterinar v = new veterinar();
        dog d = new dog("kost'", "budka");
        cat c = new cat("ryba", "dom");
        horse h = new horse("seno", "hlev");

        animals[] animals = {d, c, h};
        for (int i = 0; i < animals.length; i++) {
            veterinar.treatAnimal(animals[i]);
        }
    }
}