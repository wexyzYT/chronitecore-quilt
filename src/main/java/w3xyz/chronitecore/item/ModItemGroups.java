package w3xyz.chronitecore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import w3xyz.chronitecore.ChroniteCore;
import w3xyz.chronitecore.block.ModBlocks;

public class ModItemGroups {

	public static final ItemGroup CHRONITE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ChroniteCore.MOD_ID, "chronite"),
			FabricItemGroup.builder().name(Text.translatable("itemgroup.chronite")).icon(() -> new ItemStack(ModItems.CHRONITE)).entries(((displayParameters, itemStackCollector) -> {
				//itemStackCollector.addItem(ModItems.GAS_CONTAINER);


				itemStackCollector.addItem(ModItems.CHRONITE);
				itemStackCollector.addItem(ModItems.RAW_CHRONITE);
				itemStackCollector.addItem(ModBlocks.IONIZED_CHRONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.RAW_CHRONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.DEEPSLATE_CHRONITE_ORE);
				itemStackCollector.addItem(ModBlocks.CHRONITE_BLOCK);
				itemStackCollector.addItem(ModItems.ION_DUST);
				itemStackCollector.addItem(ModItems.ION_SHARD);
/*				itemStackCollector.addItem(ModBlocks.AQUANITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUMINITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SPARKSTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.GEMFORGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.EMBERITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.GRAPHITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SKYBLOOM_BLOCK);
				itemStackCollector.addItem(ModBlocks.AIRITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.FROZITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.GLOWNITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SEANITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LAVADITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.ALLOYITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SILVASTEEL_BLOCK);
				itemStackCollector.addItem(ModBlocks.GLOWPHITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SULFIRE_BLOCK);
				itemStackCollector.addItem(ModBlocks.AQUEOUSITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.INERTIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.VOLTASHARD_BLOCK);
				itemStackCollector.addItem(ModBlocks.STONEMOSS_BLOCK);
				itemStackCollector.addItem(ModBlocks.ETHERIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.TITANFORGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.METALLURGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.CHROMALLOY_BLOCK);
				itemStackCollector.addItem(ModBlocks.MANASTEEL_BLOCK);
				itemStackCollector.addItem(ModBlocks.COBALTITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.MAGNETITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.ZINCRUSH_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUNALITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.GEOCRYSTAL_BLOCK);
				itemStackCollector.addItem(ModBlocks.TOXINBITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SOLARITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.BRIMSTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.CRYPTOLITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PYROFUME_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUMINSTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.MYSTICORE_BLOCK);
				itemStackCollector.addItem(ModBlocks.GEMSPARK_BLOCK);
				itemStackCollector.addItem(ModBlocks.NETHERIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.MOLYFORGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.TECHNEON_BLOCK);
				itemStackCollector.addItem(ModBlocks.STARSHARD_BLOCK);
				itemStackCollector.addItem(ModBlocks.RHODITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PALLADUST_BLOCK);
				itemStackCollector.addItem(ModBlocks.ARGENTUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUMINIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.INDIGEM_BLOCK);
				itemStackCollector.addItem(ModBlocks.TINFORGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.VENOMITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.TELLUBRIGHT_BLOCK);
				itemStackCollector.addItem(ModBlocks.IRIDESCENTITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.XENOLIGHT_BLOCK);
				itemStackCollector.addItem(ModBlocks.PYROSURGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.RADIANCESTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.MAGUSITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.CELESTIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.PRISMATICORE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUSTRONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.ENERGONIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.AURALITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.EUROCRYSTAL_BLOCK);
				itemStackCollector.addItem(ModBlocks.GEMINITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.TERRESTEEL_BLOCK);
				itemStackCollector.addItem(ModBlocks.DRACONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.HARMONIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.GEMERALD_BLOCK);
				itemStackCollector.addItem(ModBlocks.ETHERTIDE_BLOCK);
				itemStackCollector.addItem(ModBlocks.SPECTRONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUCENTIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.PLASMIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.MISTICORE_BLOCK);
				itemStackCollector.addItem(ModBlocks.WOLFRAMITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.RHEOFLUX_BLOCK);
				itemStackCollector.addItem(ModBlocks.OSMISTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.IRIDESPIRE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PLATINAURUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.QUICKSILVA_BLOCK);
				itemStackCollector.addItem(ModBlocks.RADIOLITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LEADTIDE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PRISMABITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.POLONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.NEBULITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.RADIONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.VOLCANIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.RADITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.ACTINASTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.THORINITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PROTOMYST_BLOCK);
				itemStackCollector.addItem(ModBlocks.NAUTICALITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.PLUTONIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.STARSTRUCKITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.CURIOFLUX_BLOCK);
				itemStackCollector.addItem(ModBlocks.QUANTUMITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.CALIOPTRON_BLOCK);
				itemStackCollector.addItem(ModBlocks.EINSTARITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.FERMETRON_BLOCK);
				itemStackCollector.addItem(ModBlocks.MENDELSTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.NOBELLITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LAWRENCITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.RUTHERFORDIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.DUBNIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.SEABORITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.BOHRSTONE_BLOCK);
				itemStackCollector.addItem(ModBlocks.HASSISURGE_BLOCK);
				itemStackCollector.addItem(ModBlocks.MEITNERIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.DARMSTADIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.ROENTGENIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.COPERNICITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.NIHONITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.FLEROVIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.MOSCOVITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.LUMINITIUM_BLOCK);
				itemStackCollector.addItem(ModBlocks.TENNELITE_BLOCK);
				itemStackCollector.addItem(ModBlocks.OGANITE_BLOCK);
				itemStackCollector.addItem(ModItems.AQUANITE);
				itemStackCollector.addItem(ModItems.LUMINITE);
				itemStackCollector.addItem(ModItems.SPARKSTONE);
				itemStackCollector.addItem(ModItems.GEMFORGE);
				itemStackCollector.addItem(ModItems.EMBERITE);
				itemStackCollector.addItem(ModItems.GRAPHITE);
				itemStackCollector.addItem(ModItems.SKYBLOOM);
				itemStackCollector.addItem(ModItems.AIRITE);
				itemStackCollector.addItem(ModItems.FROZITE);
				itemStackCollector.addItem(ModItems.GLOWNITE);
				itemStackCollector.addItem(ModItems.SEANITE);
				itemStackCollector.addItem(ModItems.LAVADITE);
				itemStackCollector.addItem(ModItems.ALLOYITE);
				itemStackCollector.addItem(ModItems.SILVASTEEL);
				itemStackCollector.addItem(ModItems.GLOWPHITE);
				itemStackCollector.addItem(ModItems.SULFIRE);
				itemStackCollector.addItem(ModItems.AQUEOUSITE);
				itemStackCollector.addItem(ModItems.INERTIUM);
				itemStackCollector.addItem(ModItems.VOLTASHARD);
				itemStackCollector.addItem(ModItems.STONEMOSS);
				itemStackCollector.addItem(ModItems.ETHERIUM);
				itemStackCollector.addItem(ModItems.TITANFORGE);
				itemStackCollector.addItem(ModItems.METALLURGE);
				itemStackCollector.addItem(ModItems.CHROMALLOY);
				itemStackCollector.addItem(ModItems.MANASTEEL);
				itemStackCollector.addItem(ModItems.COBALTITE);
				itemStackCollector.addItem(ModItems.MAGNETITE);
				itemStackCollector.addItem(ModItems.ZINCRUSH);
				itemStackCollector.addItem(ModItems.LUNALITE);
				itemStackCollector.addItem(ModItems.GEOCRYSTAL);
				itemStackCollector.addItem(ModItems.TOXINBITE);
				itemStackCollector.addItem(ModItems.SOLARITE);
				itemStackCollector.addItem(ModItems.BRIMSTONE);
				itemStackCollector.addItem(ModItems.CRYPTOLITE);
				itemStackCollector.addItem(ModItems.PYROFUME);
				itemStackCollector.addItem(ModItems.LUMINSTONE);
				itemStackCollector.addItem(ModItems.MYSTICORE);
				itemStackCollector.addItem(ModItems.GEMSPARK);
				itemStackCollector.addItem(ModItems.NETHERIUM);
				itemStackCollector.addItem(ModItems.MOLYFORGE);
				itemStackCollector.addItem(ModItems.TECHNEON);
				itemStackCollector.addItem(ModItems.STARSHARD);
				itemStackCollector.addItem(ModItems.RHODITE);
				itemStackCollector.addItem(ModItems.PALLADUST);
				itemStackCollector.addItem(ModItems.ARGENTUM);
				itemStackCollector.addItem(ModItems.LUMINIUM);
				itemStackCollector.addItem(ModItems.INDIGEM);
				itemStackCollector.addItem(ModItems.TINFORGE);
				itemStackCollector.addItem(ModItems.VENOMITE);
				itemStackCollector.addItem(ModItems.TELLUBRIGHT);
				itemStackCollector.addItem(ModItems.IRIDESCENTITE);
				itemStackCollector.addItem(ModItems.XENOLIGHT);
				itemStackCollector.addItem(ModItems.PYROSURGE);
				itemStackCollector.addItem(ModItems.RADIANCESTONE);
				itemStackCollector.addItem(ModItems.MAGUSITE);
				itemStackCollector.addItem(ModItems.CELESTIUM);
				itemStackCollector.addItem(ModItems.PRISMATICORE);
				itemStackCollector.addItem(ModItems.LUSTRONITE);
				itemStackCollector.addItem(ModItems.ENERGONIUM);
				itemStackCollector.addItem(ModItems.AURALITE);
				itemStackCollector.addItem(ModItems.EUROCRYSTAL);
				itemStackCollector.addItem(ModItems.GEMINITE);
				itemStackCollector.addItem(ModItems.TERRESTEEL);
				itemStackCollector.addItem(ModItems.DRACONITE);
				itemStackCollector.addItem(ModItems.HARMONIUM);
				itemStackCollector.addItem(ModItems.GEMERALD);
				itemStackCollector.addItem(ModItems.ETHERTIDE);
				itemStackCollector.addItem(ModItems.SPECTRONITE);
				itemStackCollector.addItem(ModItems.LUCENTIUM);
				itemStackCollector.addItem(ModItems.PLASMIUM);
				itemStackCollector.addItem(ModItems.MISTICORE);
				itemStackCollector.addItem(ModItems.WOLFRAMITE);
				itemStackCollector.addItem(ModItems.RHEOFLUX);
				itemStackCollector.addItem(ModItems.OSMISTONE);
				itemStackCollector.addItem(ModItems.IRIDESPIRE);
				itemStackCollector.addItem(ModItems.PLATINAURUM);
				itemStackCollector.addItem(ModItems.QUICKSILVA);
				itemStackCollector.addItem(ModItems.RADIOLITE);
				itemStackCollector.addItem(ModItems.LEADTIDE);
				itemStackCollector.addItem(ModItems.PRISMABITE);
				itemStackCollector.addItem(ModItems.POLONITE);
				itemStackCollector.addItem(ModItems.NEBULITE);
				itemStackCollector.addItem(ModItems.RADIONITE);
				itemStackCollector.addItem(ModItems.VOLCANIUM);
				itemStackCollector.addItem(ModItems.RADITE);
				itemStackCollector.addItem(ModItems.ACTINASTONE);
				itemStackCollector.addItem(ModItems.THORINITE);
				itemStackCollector.addItem(ModItems.PROTOMYST);
				itemStackCollector.addItem(ModItems.NAUTICALITE);
				itemStackCollector.addItem(ModItems.PLUTONIUM);
				itemStackCollector.addItem(ModItems.STARSTRUCKITE);
				itemStackCollector.addItem(ModItems.CURIOFLUX);
				itemStackCollector.addItem(ModItems.QUANTUMITE);
				itemStackCollector.addItem(ModItems.CALIOPTRON);
				itemStackCollector.addItem(ModItems.EINSTARITE);
				itemStackCollector.addItem(ModItems.FERMETRON);
				itemStackCollector.addItem(ModItems.MENDELSTONE);
				itemStackCollector.addItem(ModItems.NOBELLITE);
				itemStackCollector.addItem(ModItems.LAWRENCITE);
				itemStackCollector.addItem(ModItems.RUTHERFORDIUM);
				itemStackCollector.addItem(ModItems.DUBNIUM);
				itemStackCollector.addItem(ModItems.SEABORITE);
				itemStackCollector.addItem(ModItems.BOHRSTONE);
				itemStackCollector.addItem(ModItems.HASSISURGE);
				itemStackCollector.addItem(ModItems.MEITNERIUM);
				itemStackCollector.addItem(ModItems.DARMSTADIUM);
				itemStackCollector.addItem(ModItems.ROENTGENIUM);
				itemStackCollector.addItem(ModItems.COPERNICITE);
				itemStackCollector.addItem(ModItems.NIHONITE);
				itemStackCollector.addItem(ModItems.FLEROVIUM);
				itemStackCollector.addItem(ModItems.MOSCOVITE);
				itemStackCollector.addItem(ModItems.LUMINITIUM);
				itemStackCollector.addItem(ModItems.TENNELITE);
				itemStackCollector.addItem(ModItems.OGANITE);
*/
			})).build());

	public static void registerItemGroups() {
		ChroniteCore.LOGGER.info("registering item groups for" + ChroniteCore.MOD_ID);
	}
}
