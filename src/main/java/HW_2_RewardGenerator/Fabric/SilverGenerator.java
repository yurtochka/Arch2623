package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.SilverReward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
