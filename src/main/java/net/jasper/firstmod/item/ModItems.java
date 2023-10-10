package net.jasper.firstmod.item;

import net.jasper.firstmod.firstmod;
import net.jasper.firstmod.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, firstmod.MOD_ID);

    public static final RegistryObject<Item> MAGIC = ITEMS.register("magic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGIC_TAB)));
    public static final RegistryObject<Item> RAW_MAGIC = ITEMS.register("raw_magic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGIC_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.MAGIC_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
