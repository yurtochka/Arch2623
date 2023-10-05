package HW_2_RewardGenerator.Fabric;

import HW_2_RewardGenerator.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
