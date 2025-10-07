import java.util.List;
import java.util.ArrayList;

interface Playable {
    void play();
}
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Choi guitar");
    }
}
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Choi piano");
    }
}
class Violin implements Playable {
    @Override
    public void play() {
        System.out.println("Choi violin");
    }
}
public class Bai3 {
    public static void main(String[] args) {
        List<Playable> playables = new ArrayList<>();
        playables.add(new Guitar());
        playables.add(new Piano());
        playables.add(new Violin());
        for (Playable p : playables) {
            p.play();
        }
    }
}
