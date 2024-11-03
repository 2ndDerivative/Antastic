package mod.antastic.blocks;

import mod.antastic.Antastic;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {
    public static final Block ANT_HILL = register(new Block(Settings.create()
        .sounds(BlockSoundGroup.GRASS)
        .registryKey(registryKey("ant_hill"))), "ant_hill");
    
    static RegistryKey<Block> registryKey(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Antastic.identifier(id));
    }
    static Block register(Block block, String id) {
        return Registry.register(Registries.BLOCK, registryKey(id), block);
    }
    public static void initialize() {}
}
