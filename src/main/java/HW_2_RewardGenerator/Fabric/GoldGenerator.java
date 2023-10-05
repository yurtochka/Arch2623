package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.GoldReward;

public class GoldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
