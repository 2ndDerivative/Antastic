package mod.antastic.items;

import mod.antastic.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;


public class ModItems {
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.addAfter(Items.BEE_NEST.asItem(), ModBlocks.ANT_HILL.asItem());
        });
    }
}
