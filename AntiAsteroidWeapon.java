import java.util.*;

public class AntiAsteroidWeapon {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numTests = input.nextInt();
        for (int i = 0; i < numTests; i++) {
            int numAsteroids = input.nextInt();
            Asteroid[] asteroids = new Asteroid[numAsteroids];
            
            for (int j = 0; j < numAsteroids; j++) {
                int x = input.nextInt();
                int y = input.nextInt();
                asteroids[j] = new Asteroid(x, y);
            }
            
            Arrays.sort(asteroids, new Comparator<Asteroid>() {
                public int compare(Asteroid a1, Asteroid a2) {
                    double dist1 = Math.sqrt(a1.x * a1.x + a1.y * a1.y);
                    double dist2 = Math.sqrt(a2.x * a2.x + a2.y * a2.y);
                    if (dist1 < dist2) {
                        return -1;
                    } else if (dist1 > dist2) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
            
            for (Asteroid asteroid : asteroids) {
                System.out.println(asteroid.x + " " + asteroid.y);
            }
        }
        
        input.close();
    }
    
    static class Asteroid {
        int x, y;
        
        public Asteroid(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
