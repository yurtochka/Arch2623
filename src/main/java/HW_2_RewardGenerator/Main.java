package HW_2_RewardGenerator;

import HW_2_RewardGenerator.Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> genFabrics = iFabric();
        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 88; i++) {
            int index = random.nextInt(genFabrics.size());
            genFabrics.get(index).openReward();
        }
    }

    //    Инициализация фабрик
    public static List<ItemGenerator> iFabric() {

        List<ItemGenerator> genFabrics = new ArrayList<>();
        genFabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            genFabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            genFabrics.add(new BoneGenerator());
            genFabrics.add(new SilverGenerator());
            genFabrics.add(new EmeraldGenerator());
            genFabrics.add(new CopperGenerator());
            genFabrics.add(new TreeGenerator());
            genFabrics.add(new RubyGenerator());
        }
        return genFabrics;
    }
}
