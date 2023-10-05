package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;
import HW_2_RewardGenerator.Product.CopperReward;

public class CopperGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new CopperReward();
    }
}
