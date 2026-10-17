package pl.jakub.lynxchemistry.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;

public class ModBlocks {
    public static final Block AIR_SEPARATOR = Registry.register(Registries.BLOCK, Identifier.of("lynx-chemistry", "air_separator"),new Block(AbstractBlock.Settings.create().strength(3.0f, 6.0f).requiresTool().registryKey(RegistryKey.of(Registries.BLOCK.getKey(), Identifier.of("lynx-chemistry", "air_separator")))));
}
