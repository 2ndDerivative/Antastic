package mod.antastic.items;

import mod.antastic.Antastic;
import mod.antastic.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ANT_HILL = register(new BlockItem(ModBlocks.ANT_HILL, new Item.Settings().registryKey(registryKey("ant_hill"))), "ant_hill");

    public static RegistryKey<Item> registryKey(String id) {
        Identifier itemID = Antastic.identifier(id);
        RegistryKey<Item> registry_key = RegistryKey.of(RegistryKeys.ITEM, itemID);
        return registry_key;
    }

    public static Item register(Item item, String id) {
        Item registeredItem = Registry.register(Registries.ITEM, registryKey(id), item);
        return registeredItem;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ANT_HILL.asItem());
        });
    }
}
