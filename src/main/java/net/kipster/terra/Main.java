package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.proxy.CommonProxy;
import net.kipster.terra.util.handlers.OreDictionaryHandler;
import net.kipster.terra.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modId, name = Main.name, version = Main.version)
public class Main {
	
	public static final String modId = "terra";
	public static final String name = "Terra";
	public static final String version = "1.0";

	@Mod.Instance(modId)
	public static Main instance;
	
	@SidedProxy(serverSide = "net.kipster.terra.proxy.CommonProxy", clientSide = "net.kipster.terra.proxy.ClientProxy")
	public static CommonProxy proxy;
	

	public static final CreativeTabs TERRATABMISC = new TerraTabMisc("terratabmisc");
	public static final CreativeTabs TERRATABGEOLOGY = new TerraTabGeology("terratabgeology");
	public static final CreativeTabs TERRATABPLANTS = new TerraTabPlants("terratabplants");
	
	
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is doing a thing!");
		RegistryHandler.preInitRegistries(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	}
}
