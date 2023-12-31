package w3xyz.chronitecore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import w3xyz.chronitecore.ChroniteCore;
import w3xyz.chronitecore.item.custom.GasContainer;

public class ModItems {

	public static final Item GAS_CONTAINER = registerItem("gas_conatiner", new GasContainer(new QuiltItemSettings()));
	public static final Item CHRONITE = registerItem("chronite", new Item(new QuiltItemSettings()));
	public static final Item RAW_CHRONITE = registerItem("raw_chronite", new Item(new QuiltItemSettings()));
	public static final Item ION_SHARD = registerItem("ion_shard", new Item(new QuiltItemSettings()));
	public static final Item ION_DUST = registerItem("ion_dust", new Item(new QuiltItemSettings()));

	public static final Item AQUANITE = registerItem("aquanite", new Item(new QuiltItemSettings()));
	public static final Item LUMINITE = registerItem("luminite", new Item(new QuiltItemSettings()));
	public static final Item SPARKSTONE = registerItem("sparkstone", new Item(new QuiltItemSettings()));
	public static final Item GEMFORGE = registerItem("gemforge", new Item(new QuiltItemSettings()));
	public static final Item EMBERITE = registerItem("emberite", new Item(new QuiltItemSettings()));
	public static final Item GRAPHITE = registerItem("graphite", new Item(new QuiltItemSettings()));
	public static final Item SKYBLOOM = registerItem("skybloom", new Item(new QuiltItemSettings()));
	public static final Item AIRITE = registerItem("airite", new Item(new QuiltItemSettings()));
	public static final Item FROZITE = registerItem("frozite", new Item(new QuiltItemSettings()));
	public static final Item GLOWNITE = registerItem("glownite", new Item(new QuiltItemSettings()));
	public static final Item SEANITE = registerItem("seanite", new Item(new QuiltItemSettings()));
	public static final Item LAVADITE = registerItem("lavadite", new Item(new QuiltItemSettings()));
	public static final Item ALLOYITE = registerItem("alloyite", new Item(new QuiltItemSettings()));
	public static final Item SILVASTEEL = registerItem("silvasteel", new Item(new QuiltItemSettings()));
	public static final Item GLOWPHITE = registerItem("glowphite", new Item(new QuiltItemSettings()));
	public static final Item SULFIRE = registerItem("sulfire", new Item(new QuiltItemSettings()));
	public static final Item AQUEOUSITE = registerItem("aqueousite", new Item(new QuiltItemSettings()));
	public static final Item INERTIUM = registerItem("inertium", new Item(new QuiltItemSettings()));
	public static final Item VOLTASHARD = registerItem("voltashard", new Item(new QuiltItemSettings()));
	public static final Item STONEMOSS = registerItem("stonemoss", new Item(new QuiltItemSettings()));
	public static final Item ETHERIUM = registerItem("etherium", new Item(new QuiltItemSettings()));
	public static final Item TITANFORGE = registerItem("titanforge", new Item(new QuiltItemSettings()));
	public static final Item METALLURGE = registerItem("metallurge", new Item(new QuiltItemSettings()));
	public static final Item CHROMALLOY = registerItem("chromalloy", new Item(new QuiltItemSettings()));
	public static final Item MANASTEEL = registerItem("manasteel", new Item(new QuiltItemSettings()));
	public static final Item COBALTITE = registerItem("cobaltite", new Item(new QuiltItemSettings()));
	public static final Item MAGNETITE = registerItem("magnetite", new Item(new QuiltItemSettings()));
	public static final Item ZINCRUSH = registerItem("zincrush", new Item(new QuiltItemSettings()));
	public static final Item LUNALITE = registerItem("lunalite", new Item(new QuiltItemSettings()));
	public static final Item GEOCRYSTAL = registerItem("geocrystal", new Item(new QuiltItemSettings()));
	public static final Item TOXINBITE = registerItem("toxinbite", new Item(new QuiltItemSettings()));
	public static final Item SOLARITE = registerItem("solarite", new Item(new QuiltItemSettings()));
	public static final Item BRIMSTONE = registerItem("brimstone", new Item(new QuiltItemSettings()));
	public static final Item CRYPTOLITE = registerItem("cryptolite", new Item(new QuiltItemSettings()));
	public static final Item PYROFUME = registerItem("pyrofume", new Item(new QuiltItemSettings()));
	public static final Item LUMINSTONE = registerItem("luminstone", new Item(new QuiltItemSettings()));
	public static final Item MYSTICORE = registerItem("mysticore", new Item(new QuiltItemSettings()));
	public static final Item GEMSPARK = registerItem("gemspark", new Item(new QuiltItemSettings()));
	public static final Item NETHERIUM = registerItem("netherium", new Item(new QuiltItemSettings()));
	public static final Item MOLYFORGE = registerItem("molyforge", new Item(new QuiltItemSettings()));
	public static final Item TECHNEON = registerItem("techneon", new Item(new QuiltItemSettings()));
	public static final Item STARSHARD = registerItem("starshard", new Item(new QuiltItemSettings()));
	public static final Item RHODITE = registerItem("rhodite", new Item(new QuiltItemSettings()));
	public static final Item PALLADUST = registerItem("palladust", new Item(new QuiltItemSettings()));
	public static final Item ARGENTUM = registerItem("argentum", new Item(new QuiltItemSettings()));
	public static final Item LUMINIUM = registerItem("luminium", new Item(new QuiltItemSettings()));
	public static final Item INDIGEM = registerItem("indigem", new Item(new QuiltItemSettings()));
	public static final Item TINFORGE = registerItem("tinforge", new Item(new QuiltItemSettings()));
	public static final Item VENOMITE = registerItem("venomite", new Item(new QuiltItemSettings()));
	public static final Item TELLUBRIGHT = registerItem("tellubright", new Item(new QuiltItemSettings()));
	public static final Item IRIDESCENTITE = registerItem("iridescentite", new Item(new QuiltItemSettings()));
	public static final Item XENOLIGHT = registerItem("xenolight", new Item(new QuiltItemSettings()));
	public static final Item PYROSURGE = registerItem("pyrosurge", new Item(new QuiltItemSettings()));
	public static final Item RADIANCESTONE = registerItem("radiancestone", new Item(new QuiltItemSettings()));
	public static final Item MAGUSITE = registerItem("magusite", new Item(new QuiltItemSettings()));
	public static final Item CELESTIUM = registerItem("celestium", new Item(new QuiltItemSettings()));
	public static final Item PRISMATICORE = registerItem("prismaticore", new Item(new QuiltItemSettings()));
	public static final Item LUSTRONITE = registerItem("lustronite", new Item(new QuiltItemSettings()));
	public static final Item ENERGONIUM = registerItem("energonium", new Item(new QuiltItemSettings()));
	public static final Item AURALITE = registerItem("auralite", new Item(new QuiltItemSettings()));
	public static final Item EUROCRYSTAL = registerItem("eurocrystal", new Item(new QuiltItemSettings()));
	public static final Item GEMINITE = registerItem("geminite", new Item(new QuiltItemSettings()));
	public static final Item TERRESTEEL = registerItem("terresteel", new Item(new QuiltItemSettings()));
	public static final Item DRACONITE = registerItem("draconite", new Item(new QuiltItemSettings()));
	public static final Item HARMONIUM = registerItem("harmonium", new Item(new QuiltItemSettings()));
	public static final Item GEMERALD = registerItem("gemerald", new Item(new QuiltItemSettings()));
	public static final Item ETHERTIDE = registerItem("ethertide", new Item(new QuiltItemSettings()));
	public static final Item SPECTRONITE = registerItem("spectronite", new Item(new QuiltItemSettings()));
	public static final Item LUCENTIUM = registerItem("lucentium", new Item(new QuiltItemSettings()));
	public static final Item PLASMIUM = registerItem("plasmium", new Item(new QuiltItemSettings()));
	public static final Item MISTICORE = registerItem("misticore", new Item(new QuiltItemSettings()));
	public static final Item WOLFRAMITE = registerItem("wolframite", new Item(new QuiltItemSettings()));
	public static final Item RHEOFLUX = registerItem("rheoflux", new Item(new QuiltItemSettings()));
	public static final Item OSMISTONE = registerItem("osmistone", new Item(new QuiltItemSettings()));
	public static final Item IRIDESPIRE = registerItem("iridespire", new Item(new QuiltItemSettings()));
	public static final Item PLATINAURUM = registerItem("platinaurum", new Item(new QuiltItemSettings()));
	public static final Item QUICKSILVA = registerItem("quicksilva", new Item(new QuiltItemSettings()));
	public static final Item RADIOLITE = registerItem("radiolite", new Item(new QuiltItemSettings()));
	public static final Item LEADTIDE = registerItem("leadtide", new Item(new QuiltItemSettings()));
	public static final Item PRISMABITE = registerItem("prismabite", new Item(new QuiltItemSettings()));
	public static final Item POLONITE = registerItem("polonite", new Item(new QuiltItemSettings()));
	public static final Item NEBULITE = registerItem("nebulite", new Item(new QuiltItemSettings()));
	public static final Item RADIONITE = registerItem("radionite", new Item(new QuiltItemSettings()));
	public static final Item VOLCANIUM = registerItem("volcanium", new Item(new QuiltItemSettings()));
	public static final Item RADITE = registerItem("radite", new Item(new QuiltItemSettings()));
	public static final Item ACTINASTONE = registerItem("actinastone", new Item(new QuiltItemSettings()));
	public static final Item THORINITE = registerItem("thorinite", new Item(new QuiltItemSettings()));
	public static final Item PROTOMYST = registerItem("protomyst", new Item(new QuiltItemSettings()));
	public static final Item NAUTICALITE = registerItem("nauticalite", new Item(new QuiltItemSettings()));
	public static final Item PLUTONIUM = registerItem("plutonium", new Item(new QuiltItemSettings()));
	public static final Item STARSTRUCKITE = registerItem("starstruckite", new Item(new QuiltItemSettings()));
	public static final Item CURIOFLUX = registerItem("curioflux", new Item(new QuiltItemSettings()));
	public static final Item QUANTUMITE = registerItem("quantumite", new Item(new QuiltItemSettings()));
	public static final Item CALIOPTRON = registerItem("calioptron", new Item(new QuiltItemSettings()));
	public static final Item EINSTARITE = registerItem("einstarite", new Item(new QuiltItemSettings()));
	public static final Item FERMETRON = registerItem("fermetron", new Item(new QuiltItemSettings()));
	public static final Item MENDELSTONE = registerItem("mendelstone", new Item(new QuiltItemSettings()));
	public static final Item NOBELLITE = registerItem("nobellite", new Item(new QuiltItemSettings()));
	public static final Item LAWRENCITE = registerItem("lawrencite", new Item(new QuiltItemSettings()));
	public static final Item RUTHERFORDIUM = registerItem("rutherfordium", new Item(new QuiltItemSettings()));
	public static final Item DUBNIUM = registerItem("dubnium", new Item(new QuiltItemSettings()));
	public static final Item SEABORITE = registerItem("seaborite", new Item(new QuiltItemSettings()));
	public static final Item BOHRSTONE = registerItem("bohrstone", new Item(new QuiltItemSettings()));
	public static final Item HASSISURGE = registerItem("hassisurge", new Item(new QuiltItemSettings()));
	public static final Item MEITNERIUM = registerItem("meitnerium", new Item(new QuiltItemSettings()));
	public static final Item DARMSTADIUM = registerItem("darmstadium", new Item(new QuiltItemSettings()));
	public static final Item ROENTGENIUM = registerItem("roentgenium", new Item(new QuiltItemSettings()));
	public static final Item COPERNICITE = registerItem("copernicite", new Item(new QuiltItemSettings()));
	public static final Item NIHONITE = registerItem("nihonite", new Item(new QuiltItemSettings()));
	public static final Item FLEROVIUM = registerItem("flerovium", new Item(new QuiltItemSettings()));
	public static final Item MOSCOVITE = registerItem("moscovite", new Item(new QuiltItemSettings()));
	public static final Item LUMINITIUM = registerItem("luminitium", new Item(new QuiltItemSettings()));
	public static final Item TENNELITE = registerItem("tennelite", new Item(new QuiltItemSettings()));
	public static final Item OGANITE = registerItem("oganite", new Item(new QuiltItemSettings()));


	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(ChroniteCore.MOD_ID, name), item);
	}
	public static void registerModItems() {
		ChroniteCore.LOGGER.info("Starting Mod Items for " + ChroniteCore.MOD_ID);
	}
}
