package memento.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    private static int COUNT_PARTICLE = 200000000;

    private static Random random = new Random();

    public static void main(String[] args) {
        List<Particle> particles = new ArrayList<>();
        int counter = 0;
        while(counter < COUNT_PARTICLE) {
            var particle = randomParticle();
            particle.changePosition(random.nextInt(100), random.nextInt(100));
            particles.add(randomParticle());
            counter++;
            if (counter % 100000 == 0) {
                sleep(2l);
            }
        }

        sleep(600000l);

    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Particle randomParticle() {
        return new Particle(Color.random(), Size.random(), Shape.random());
    }
}
