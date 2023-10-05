package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.BoneReward;

public class RubyGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new BoneReward();
    }
}
