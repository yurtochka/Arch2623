package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.TreeReward;

public class TreeGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new TreeReward();
    }
}
