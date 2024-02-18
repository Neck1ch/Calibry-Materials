package dev.ctm.calibry_materials;

import dev.architectury.platform.Platform;
import dev.ctm.calibry_materials.block.CalibryMaterialsBlocks;
import dev.ctm.calibry_materials.fluid.CalibryTeamFluidRegistry;
import dev.ctm.calibry_materials.item.CalibryMaterialsItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.List;

@Mod("calibry_materials")
@Mod.EventBusSubscriber(
        modid = "calibry_materials"
)
public class CalibryMaterials
{
    public static final String MODID = "calibry_materials";
    public static final String VERSION = "${mod_version}";
    public static final Logger LOGGER = LogManager.getLogger("Calibry Materials");
    public static final List<DeferredRegister<?>> REGISTERS;
    public static final CreativeModeTab TAB;
    public CalibryMaterials()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Path configPath = Platform.getConfigFolder().resolve("calibry-materials-common.snbt");
        CalibryMaterialsConfig.CONFIG.load(configPath);
        MinecraftForge.EVENT_BUS.register(this);
        REGISTERS.forEach((e) -> {
            e.register(modEventBus);
        });
        CalibryMaterialsConfig.init();
    }

    static {
        REGISTERS = List.of(CalibryMaterialsItems.REGISTRY, CalibryMaterialsBlocks.REGISTRY, CalibryTeamFluidRegistry.REGISTRY, CalibryTeamFluidRegistry.REGISTRY_TYPES);
        TAB = new CreativeModeTab("calibry_materials") {
            @OnlyIn(Dist.CLIENT)
            public @NotNull ItemStack makeIcon() {
                return new ItemStack((ItemLike) CalibryMaterialsItems.SUBTANIUM_CHESTPLATE.get());
            }
        };
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setting up Calibry Team Materials ("+MODID+") v"+VERSION);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(CalibryTeamFluidRegistry.SUBTANIUM_FLUID.source.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CalibryTeamFluidRegistry.SUBTANIUM_FLUID.flowing.get(), RenderType.translucent());
        }
    }
}
