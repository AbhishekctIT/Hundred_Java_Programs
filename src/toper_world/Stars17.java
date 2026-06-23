package toper_world;

public class Stars17 {
    public static void main(String[] args) {
        int rows;
        int numberOfStars;
        for (rows = 1; rows <= 10; rows++) {
            for (numberOfStars = 1; numberOfStars <= rows; numberOfStars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
