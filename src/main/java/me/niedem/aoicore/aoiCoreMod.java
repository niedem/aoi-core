package me.niedem.aoicore;

import me.niedem.aoicore.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Niels on 05/08/2017.
 */
@Mod(modid = aoiCoreMod.MODID, version = aoiCoreMod.VERSION, name = aoiCoreMod.NAME)
public class aoiCoreMod {
    public static final String MODID = "aoicoremod";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "AOI Core Mod";

    @SidedProxy(clientSide = "me.niedem.aoicore.proxy.ClientProxy", serverSide = "me.niedem.aoicore.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
