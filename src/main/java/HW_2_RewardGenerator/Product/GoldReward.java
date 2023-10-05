package HW_2_RewardGenerator.Product;

public class GoldReward extends ItemReward{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    @Override
    public void open() {
        System.out.println(ANSI_YELLOW_BACKGROUND + "*Gold*" + ANSI_RESET);
    }
}
