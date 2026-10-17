package pl.jakub.lynxchemistry.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import pl.jakub.lynxchemistry.block.ModBlocks;

public class ModItems {
    public static final Item SULFUR = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "sulfur"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "sulfur")))));
    public static final Item CARBON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "carbon"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "carbon")))));
    public static final Item IRON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "iron"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "iron")))));
    public static final Item SILICON = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "silicon"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "silicon")))));
    public static final Item COPPER = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "copper"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "copper")))));
    public static final Item OXYGEN_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "oxygen_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "oxygen_tube")))));
    public static final Item TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "tube")))));
    public static final BlockItem AIR_SEPARATOR = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "air_separator"), new BlockItem(ModBlocks.AIR_SEPARATOR, new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "air_separator")))));
    public static final Item ARGON_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "argon_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "argon_tube")))));
    public static final Item CARBON_DIOXIDE_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "carbon_dioxide_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "carbon_dioxide_tube")))));
    public static final Item HAZE_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "haze_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "haze_tube")))));
    public static final Item NITROGEN_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "nitrogen_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "nitrogen_tube")))));
    public static final Item OZONE_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "ozone_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "ozone_tube")))));
    public static final Item WATER_VAPOR_TUBE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "water_vapor_tube"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "water_vapor_tube")))));
    public static final Item ALUMINIUM = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "aluminium"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "aluminium")))));
    public static final Item COKE = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "coke"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "coke")))));
    public static final Item GOLD = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "gold"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "gold")))));
    public static final Item LEAD = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "lead"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "lead")))));
    public static final Item LITHIUM = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "lithium"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "lithium")))));
    public static final Item MAGNESIUM = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "magnesium"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "magnesium")))));
    public static final Item NICKEL = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "nickel"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "nickel")))));
    public static final Item PHOSPHORUS = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "phosphorus"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "phosphorus")))));
    public static final Item SILVER = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "silver"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "silver")))));
    public static final Item TIN = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "tin"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "tin")))));
    public static final Item TITANIUM = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "titanium"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "titanium")))));
    public static final Item URANIUM = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "uranium"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "uranium")))));
    public static final Item ZINC = Registry.register(Registries.ITEM, Identifier.of("lynx-chemistry", "zinc"), new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("lynx-chemistry", "zinc")))));
}