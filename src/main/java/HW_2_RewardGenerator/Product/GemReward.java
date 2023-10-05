package HW_2_RewardGenerator.Product;

public class GemReward extends ItemReward {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    @Override
    public void open() {
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK + "*Gem*" + ANSI_RESET);
    }
}
