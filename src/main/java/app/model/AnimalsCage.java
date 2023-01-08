package app.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

//    @Autowired
    private final Animal animal;
    private final Timer timer;

    public AnimalsCage(Animal dog, Timer timer) {
        this.animal = dog;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
