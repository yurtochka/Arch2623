package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.EmeraldReward;

public class EmeraldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new EmeraldReward();
    }
}
