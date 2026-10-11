package pl.jakub.lynxchemistry.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;

public class ModItems {
    public static final Item SULFUR = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "sulfur"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "sulfur")))));
    public static final Item CARBON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "carbon"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "carbon")))));
    public static final Item IRON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "iron"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "iron")))));
    public static final Item SILICON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "silicon"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "silicon")))));
    public static final Item COPPER = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "copper"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "copper")))));
    public static final Item OXYGEN_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "oxygen_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "oxygen_tube")))));
}
// dodac maszyne do przerabiania pierwiastków na inne