package com.babcsany.minecraft.ervin_mod_1.init;

import com.babcsany.minecraft.ervin_mod_1.Ervin_mod_1;
import com.babcsany.minecraft.ervin_mod_1.block.*;
import com.babcsany.minecraft.ervin_mod_1.block.FirgSaplingBlock;
import com.babcsany.minecraft.ervin_mod_1.block.trees.FirgTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Ervin_mod_1.MOD_ID);

    public static final RegistryObject<Block> VILTDROP_BLOCK = BLOCKS.register("viltdrop_block", () -> new ViltdropBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000.0f)
    ));
    public static final RegistryObject<Block> SRIUNK_BLOCK = BLOCKS.register("sriunk_block", () -> new SriunkBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(500.0f)
    ));
    public static final RegistryObject<Block> TRUGN = BLOCKS.register("trugn", () -> new Trugn(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(8)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000000.0f)
    ));
    public static final RegistryObject<Block> REGDEM_BLOCK = BLOCKS.register("regdem_block", () -> new RegdemBlock(
            Block.Properties.create(Material.WOOD)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(10.0f)
    ));
    public static final RegistryObject<Block> LEAT_BLOCK = BLOCKS.register("leat_block", () -> new LeatBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(100.0f)
    ));
    public static final RegistryObject<Block> LEAT_BLOCK_CRAFTING_TABLE = BLOCKS.register("leat_block_crafting_table", () -> new LeatBlockCraftingTable(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(500.0f)
    ));
    public static final RegistryObject<Block> CRAINT_BLOCK = BLOCKS.register("craint_block", () -> new CraintBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000.0f)
    ));
    public static final RegistryObject<Block> CRAINT_BLOCK_CRAFTING_TABLE = BLOCKS.register("craint_block_crafting_table", () -> new CraintBlockCraftingTable(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000.0f)
    ));
    public static final RegistryObject<Block> NARIN_BLOCK = BLOCKS.register("narin_block", () -> new NarinBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5000.0f)
    ));
    public static final RegistryObject<Block> TERAT_BLOCK = BLOCKS.register("terat_block", () -> new TeratBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(32)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000000.0f)
    ));
    public static final RegistryObject<Block> SRIUNK_ORE = BLOCKS.register("sriunk_ore", () -> new SriunkOre(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(100.0f)
    ));
    public static final RegistryObject<Block> NIRK_BLOCK = BLOCKS.register("nirk_block", () -> new NirkBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(20)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1562.0f)
    ));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new RubyBlock(
            Block.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(8.0f)
    ));
    public static final RegistryObject<Block> GRINT_BLOCK = BLOCKS.register("grint_block", () -> new GrintBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(100.0f)
    ));
    public static final RegistryObject<Block> RED_STONE = BLOCKS.register("red_stone", () -> new RedStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10.0f)
    ));
    public static final RegistryObject<Block> RED_COBBLESTONE = BLOCKS.register("red_cobblestone", () -> new RedCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> EPKIN = BLOCKS.register("epkin", () -> new Epkin(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000000.0f)
    ));
    public static final RegistryObject<Block> RED_SMOOTH_STONE = BLOCKS.register("red_smooth_stone", () -> new RedSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000000.0f)
    ));
    public static final RegistryObject<Block> RED_FURANCE = BLOCKS.register("red_furance", () -> new RedFurance(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10.0f)
    ));
    public static final RegistryObject<Block> AVTER_BLOCK = BLOCKS.register("avter_block", () -> new AvterBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6000.0f)
    ));
    public static final RegistryObject<Block> FIRG = BLOCKS.register("firg", () -> new Firg(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> FRIT_BLOCK = BLOCKS.register("frit_block", () -> new FritBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> END_PORTAL = BLOCKS.register("end_portal", () -> new EndPortal(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> SCRAFTH = BLOCKS.register("scrafth", () -> new Scrafth(
            Block.Properties.create(Material.AIR)
                    .harvestLevel(0)
                    .hardnessAndResistance(10.0f)
    ));
    public static final RegistryObject<Block> ENDER_SRACKHT = BLOCKS.register("ender_srackht", () -> new EnderSrackht(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(20.0f)
    ));
    public static final RegistryObject<Block> END_STONE_CISK = BLOCKS.register("end_stone_cisk", () -> new EndStoneCisk(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(30.0f)
    ));
    public static final RegistryObject<Block> END_STONE_CRISK = BLOCKS.register("end_stone_crisk", () -> new EndStoneCrisk(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(45.0f)
    ));
    public static final RegistryObject<Block> END_SRACT = BLOCKS.register("end_sract", () -> new EndSract(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(8.0f)
    ));
    public static final RegistryObject<Block> ENDER_SRACT = BLOCKS.register("ender_sract", () -> new EnderSract(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(9.0f)
    ));
    public static final RegistryObject<Block> ENDER_SACKT = BLOCKS.register("ender_sackt", () -> new EnderSackt(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10.0f)
    ));
    public static final RegistryObject<Block> ENDER_SACT = BLOCKS.register("ender_sact", () -> new EnderSact(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(12.0f)
    ));
    public static final RegistryObject<Block> ENDER_SRACKH = BLOCKS.register("ender_srackh", () -> new EnderSrackh(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(14.0f)
    ));
    public static final RegistryObject<Block> ENDER_SRACK = BLOCKS.register("ender_srack", () -> new EnderSrack(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(16.0f)
    ));
    public static final RegistryObject<Block> END_SRACKT = BLOCKS.register("end_srackt", () -> new EndSrackt(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(16.0f)
    ));
    public static final RegistryObject<Block> VIRK_BLOCK = BLOCKS.register("virk_block", () -> new VirkBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(650.0f)
    ));
    public static final RegistryObject<Block> FIRT_BLOCK = BLOCKS.register("firt_block", () -> new FirtBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> TRING = BLOCKS.register("tring", () -> new Tring(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> PACK_BLOCK = BLOCKS.register("pack_block", () -> new PackBlock(
            Block.Properties.create(Material.EARTH)
                    .harvestLevel(1)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> TIRKS_BLOCK = BLOCKS.register("tirks_block", () -> new TirksBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> SHZ_BLOCK = BLOCKS.register("shz_block", () -> new ShzBlock(
            Block.Properties.create(Material.ORGANIC)
                    //.hardnessAndResistance(6000000.0f)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> TIRSK_BLOCK = BLOCKS.register("tirsk_block", () -> new TirskBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> KALT_BLOCK = BLOCKS.register("kalt_block", () -> new KaltBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> VILKT_BLOCK = BLOCKS.register("vilkt_block", () -> new VilktBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(60.0f, 60)
    ));
    public static final RegistryObject<Block> URVI = BLOCKS.register("urvi", () -> new Urvi(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.0F, 9.0F)
    ));
    public static final RegistryObject<Block> SURVI = BLOCKS.register("survi", () -> new Survi(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 9.0F)
    ));
    public static final RegistryObject<Block> SURV = BLOCKS.register("surv", () -> new Surv(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4.0F, 10.0F)
    ));
    public static final RegistryObject<Block> SURT = BLOCKS.register("surt", () -> new Surt(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5.0F, 12.0F)
    ));
    public static final RegistryObject<Block> BLACK_COBBLESTONE = BLOCKS.register("black_cobblestone", () -> new BlackCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> BLUE_COBBLESTONE = BLOCKS.register("blue_cobblestone", () -> new BlueCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> BROWN_COBBLESTONE = BLOCKS.register("brown_cobblestone", () -> new BrownCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> CYAN_COBBLESTONE = BLOCKS.register("cyan_cobblestone", () -> new CyanCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> GREEN_COBBLESTONE = BLOCKS.register("green_cobblestone", () -> new GreenCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE = BLOCKS.register("light_blue_cobblestone", () -> new LightBlueCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> LIME_COBBLESTONE = BLOCKS.register("lime_cobblestone", () -> new LimeCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE = BLOCKS.register("magenta_cobblestone", () -> new MagentaCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> ORANGE_COBBLESTONE = BLOCKS.register("orange_cobblestone", () -> new OrangeCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> PINK_COBBLESTONE = BLOCKS.register("pink_cobblestone", () -> new PinkCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> PURPLE_COBBLESTONE = BLOCKS.register("purple_cobblestone", () -> new PurpleCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> WHITE_COBBLESTONE = BLOCKS.register("white_cobblestone", () -> new WhiteCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> YELLOW_COBBLESTONE = BLOCKS.register("yellow_cobblestone", () -> new YellowCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> NETHER_PORTAL = BLOCKS.register("nether_portal", () -> new NetherPortal(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .lightValue(15)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(120.0F, 12.0F)
    ));
    public static final RegistryObject<Block> ENDER_STAKRACH = BLOCKS.register("ender_stakrach", () -> new EnderStakrach(
            Block.Properties.create(Material.WOOD)
                    .harvestLevel(2)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(40.0f)
    ));
    public static final RegistryObject<Block> ENDER_SRACKTH = BLOCKS.register("ender_srackth", () -> new EnderSrackth(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(20.0f)
    ));
    public static final RegistryObject<Block> OAK_TURG = BLOCKS.register("oak_turg", () -> new EnderSrackth(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> ENDER_SRAKTCAF = BLOCKS.register("ender_sraktcaf", () -> new EnderSraktcaf(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(60.0f)
    ));
    public static final RegistryObject<Block> ENDER_TRASKRACH = BLOCKS.register("ender_traskrach", () -> new EnderTraskrach(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(4)
                    .hardnessAndResistance(80.0f)
    ));
    public static final RegistryObject<Block> ENDER_TRASKCRAFTH = BLOCKS.register("ender_traskcrafth", () -> new EnderTraskcrafth(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(5)
                    .hardnessAndResistance(100.0f)
    ));
    public static final RegistryObject<Block> ENDER_TRASK = BLOCKS.register("ender_trask", () -> new EnderTrask(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(6)
                    .hardnessAndResistance(160.0f)
    ));
    public static final RegistryObject<Block> VILKT_BLOCK_2 = BLOCKS.register("vilkt_block_2", () -> new VilktBlock2(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(6)
                    .hardnessAndResistance(160.0f)
    ));
    /*public static final RegistryObject<Block> SRIUNK_STAIRS = BLOCKS.register("sriunk_stairs", new StairsBlock(
            SRIUNK_BLOCK. Block.Properties.from(SRIUNK_BLOCK)
    ));*/
    public static final RegistryObject<Block> ACACIA_TURG = BLOCKS.register("acacia_turg", () -> new AcaciaTurg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> BIRCH_TURG = BLOCKS.register("birch_turg", () -> new BirchTurg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> DARK_OAK_TURG = BLOCKS.register("dark_oak_turg", () -> new DarkOakTurg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> JUNGLE_TURG = BLOCKS.register("jungle_turg", () -> new JungleTurg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> SPRUCE_TURG = BLOCKS.register("spruce_turg", () -> new SpruceTurg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> TURG = BLOCKS.register("turg", () -> new Turg(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(20.0f).sound(SoundType.WOOD)
    ));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new CharcoalBlock(
            Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5.0F, 6.0F)
    ));
    public static final RegistryObject<Block> L0 = BLOCKS.register("0", () -> new L0(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L1 = BLOCKS.register("1", () -> new L1(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L2 = BLOCKS.register("2", () -> new L2(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L3 = BLOCKS.register("3", () -> new L3(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L4 = BLOCKS.register("4", () -> new L4(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L5 = BLOCKS.register("5", () -> new L5(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L6 = BLOCKS.register("6", () -> new L6(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L7 = BLOCKS.register("7", () -> new L7(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L8 = BLOCKS.register("8", () -> new L8(
            Block.Properties.create(Material.ORGANIC)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> L9 = BLOCKS.register("9", () -> new L9(
            Block.Properties.create(Material.ORGANIC)
                    .hardnessAndResistance(200.0F, 5000.0F)
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> AIR = BLOCKS.register("air", () -> new Air(
            Block.Properties.create(Material.AIR)
                    .doesNotBlockMovement()
                    .noDrops()
    ));
    public static final RegistryObject<Block> TRINKS = BLOCKS.register("trinks", () -> new Trinks(
            Block.Properties.create(Material.ROCK)
                    .doesNotBlockMovement()
                    .lightValue(15)
    ));
    public static final RegistryObject<Block> GNITH_BLOCK = BLOCKS.register("gnith_block", () -> new GnithBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(200.0F, 5000.0F)
    ));
    public static final RegistryObject<Block> SRIUNK_STAIRS = BLOCKS.register("sriunk_stairs", () -> new SriunkStairs(
        () -> SRIUNK_BLOCK.get().getDefaultState(),Block.Properties.from(SRIUNK_BLOCK.get())
    ));

    public static final RegistryObject<Block> SRIUNK_SLAB = BLOCKS.register("sriunk_slab", () -> new SriunkSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(200.0F, 5000.0F)
    ));
    public static final RegistryObject<Block> DIAMOND_SLAB = BLOCKS.register("diamond_slab", () -> new DiamondSlab(
            Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).sound(SoundType.METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> IRON_SLAB = BLOCKS.register("iron_slab", () -> new IronSlab(
            Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GOLD_SLAB = BLOCKS.register("gold_slab", () -> new GoldSlab(
            Block.Properties.create(Material.IRON, MaterialColor.GOLD).sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4.0F, 6.0F)
    ));
    public static final RegistryObject<Block> REDSTONE_SLAB = BLOCKS.register("redstone_slab", () -> new Redstone_Slab(
            Block.Properties.create(Material.IRON, MaterialColor.TNT).sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab", () -> new DirtSlab(
            Block.Properties.create(Material.EARTH, MaterialColor.DIRT).sound(SoundType.GROUND)
                    .harvestLevel(0)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(1.0F)
    ));
    public static final RegistryObject<Block> LAPIS_SLAB = BLOCKS.register("lapis_slab", () -> new LapisSlab(
            Block.Properties.create(Material.IRON, MaterialColor.LAPIS)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.0F, 3.0F)
    ));
    public static final RegistryObject<Block> EMERALD_SLAB = BLOCKS.register("emerald_slab", () -> new EmeraldSlab(
            Block.Properties.create(Material.IRON, MaterialColor.EMERALD)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> RUBY_SLAB = BLOCKS.register("ruby_slab", () -> new RubySlab(
            Block.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(9.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_COBBLESTONE = BLOCKS.register("light_gray_cobblestone", () -> new LightGrayCobblestone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 12.0F)
    ));
    public static final RegistryObject<Block> BLACK_STONE = BLOCKS.register("black_stone", () -> new BlackStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new BlueStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> BROWN_STONE = BLOCKS.register("brown_stone", () -> new BrownStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> CYAN_STONE = BLOCKS.register("cyan_stone", () -> new CyanStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> GREEN_STONE = BLOCKS.register("green_stone", () -> new GreenStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_STONE = BLOCKS.register("light_blue_stone", () -> new LightBlueStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_STONE = BLOCKS.register("light_gray_stone", () -> new LightGrayStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIME_STONE = BLOCKS.register("lime_stone", () -> new LimeStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_STONE = BLOCKS.register("magenta_stone", () -> new MagentaStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> ORANGE_STONE = BLOCKS.register("orange_stone", () -> new OrangeStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> PINK_STONE = BLOCKS.register("pink_stone", () -> new PinkStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> PURPLE_STONE = BLOCKS.register("purple_stone", () -> new PurpleStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> WHITE_STONE = BLOCKS.register("white_stone", () -> new WhiteStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> YELLOW_STONE = BLOCKS.register("yellow_stone", () -> new YellowStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> BLACK_COBBLESTONE_SLAB = BLOCKS.register("black_cobblestone_slab", () -> new BlackCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BLUE_COBBLESTONE_SLAB = BLOCKS.register("blue_cobblestone_slab", () -> new BlueCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BROWN_COBBLESTONE_SLAB = BLOCKS.register("brown_cobblestone_slab", () -> new BrownCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> CYAN_COBBLESTONE_SLAB = BLOCKS.register("cyan_cobblestone_slab", () -> new CyanCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GREEN_COBBLESTONE_SLAB = BLOCKS.register("green_cobblestone_slab", () -> new GreenCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE_SLAB = BLOCKS.register("light_blue_cobblestone_slab", () -> new LightBlueCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_COBBLESTONE_SLAB = BLOCKS.register("light_gray_cobblestone_slab", () -> new LightGrayCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIME_COBBLESTONE_SLAB = BLOCKS.register("lime_cobblestone_slab", () -> new LimeCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE_SLAB = BLOCKS.register("magenta_cobblestone_slab", () -> new MagentaCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> ORANGE_COBBLESTONE_SLAB = BLOCKS.register("orange_cobblestone_slab", () -> new OrangeCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PINK_COBBLESTONE_SLAB = BLOCKS.register("pink_cobblestone_slab", () -> new PinkCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PURPLE_COBBLESTONE_SLAB = BLOCKS.register("purple_cobblestone_slab", () -> new PurpleCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> RED_COBBLESTONE_SLAB = BLOCKS.register("red_cobblestone_slab", () -> new RedCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> WHITE_COBBLESTONE_SLAB = BLOCKS.register("white_cobblestone_slab", () -> new WhiteCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> YELLOW_COBBLESTONE_SLAB = BLOCKS.register("yellow_cobblestone_slab", () -> new YellowCobblestoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BLACK_STONE_SLAB = BLOCKS.register("black_stone_slab", () -> new BlackStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BLUE_STONE_SLAB = BLOCKS.register("blue_stone_slab", () -> new BlueStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BROWN_STONE_SLAB = BLOCKS.register("brown_stone_slab", () -> new BrownStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> CYAN_STONE_SLAB = BLOCKS.register("cyan_stone_slab", () -> new CyanStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GREEN_STONE_SLAB = BLOCKS.register("green_stone_slab", () -> new GreenStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_STONE_SLAB = BLOCKS.register("light_blue_stone_slab", () -> new LightBlueStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_STONE_SLAB = BLOCKS.register("light_gray_stone_slab", () -> new LightGrayStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIME_STONE_SLAB = BLOCKS.register("lime_stone_slab", () -> new LimeStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_STONE_SLAB = BLOCKS.register("magenta_stone_slab", () -> new MagentaStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> ORANGE_STONE_SLAB = BLOCKS.register("orange_stone_slab", () -> new OrangeStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PINK_STONE_SLAB = BLOCKS.register("pink_stone_slab", () -> new PinkStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PURPLE_STONE_SLAB = BLOCKS.register("purple_stone_slab", () -> new PurpleStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> RED_STONE_SLAB = BLOCKS.register("red_stone_slab", () -> new RedStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> WHITE_STONE_SLAB = BLOCKS.register("white_stone_slab", () -> new WhiteStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> YELLOW_STONE_SLAB = BLOCKS.register("yellow_stone_slab", () -> new YellowStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GRITK_BLOCK = BLOCKS.register("gritk_block", () -> new GritkBlock(
            Block.Properties.create(Material.IRON)
                    .harvestLevel(0)
                    .lightValue(15)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(500000.0F, 1200000.0F)
    ));
    public static final RegistryObject<Block> COAL_SLAB = BLOCKS.register("coal_slab", () -> new CoalSlab(
            Block.Properties.create(Material.ROCK, MaterialColor.BLACK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> CHARCOAL_SLAB = BLOCKS.register("charcoal_slab", () -> new CharcoalSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GRINT_SLAB = BLOCKS.register("grint_slab", () -> new GrintSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(120.0f)
    ));
    public static final RegistryObject<Block> GURK_BLOCK = BLOCKS.register("gurk_block", () -> new GurkBlock(
            Block.Properties.create(Material.EARTH)
                    .harvestLevel(1)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(20.0f)
    ));
    public static final RegistryObject<Block> GURK_SLAB = BLOCKS.register("gurk_slab", () -> new GurkSlab(
            Block.Properties.create(Material.EARTH)
                    .harvestLevel(1)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(20.0f, 22.0f)
    ));
    public static final RegistryObject<Block> GARK_BLOCK = BLOCKS.register("gark_block", () -> new GarkBlock(
        Block.Properties.create(Material.ROCK)
                    .harvestLevel(12)
                    .hardnessAndResistance(2000.0f)
    ));
    public static final RegistryObject<Block> GARK_SLAB = BLOCKS.register("gark_slab", () -> new GarkSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(12)
                    .hardnessAndResistance(2000.0f, 2200.0f)
    ));
    public static final RegistryObject<Block> BLACK_SMOOTH_STONE = BLOCKS.register("black_smooth_stone", () -> new BlackSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> BLUE_SMOOTH_STONE = BLOCKS.register("blue_smooth_stone", () -> new BlueSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> BROWN_SMOOTH_STONE = BLOCKS.register("brown_smooth_stone", () -> new BrownSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> CYAN_SMOOTH_STONE = BLOCKS.register("cyan_smooth_stone", () -> new CyanSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> GREEN_SMOOTH_STONE = BLOCKS.register("green_smooth_stone", () -> new GreenSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_STONE = BLOCKS.register("light_blue_smooth_stone", () -> new LightBlueSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_STONE = BLOCKS.register("light_gray_smooth_stone", () -> new LightGraySmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> LIME_SMOOTH_STONE = BLOCKS.register("lime_smooth_stone", () -> new LimeSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_STONE = BLOCKS.register("magenta_smooth_stone", () -> new MagentaSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> ORANGE_SMOOTH_STONE = BLOCKS.register("orange_smooth_stone", () -> new OrangeSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> PINK_SMOOTH_STONE = BLOCKS.register("pink_smooth_stone", () -> new PinkSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> PURPLE_SMOOTH_STONE = BLOCKS.register("purple_smooth_stone", () -> new PurpleSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> WHITE_SMOOTH_STONE = BLOCKS.register("white_smooth_stone", () -> new WhiteSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> YELLOW_SMOOTH_STONE = BLOCKS.register("yellow_smooth_stone", () -> new YellowSmoothStone(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> ENDER_SRACKHT1 = BLOCKS.register("ender_srackht_1", () -> new EnderSrackht1(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(20.0F)
    ));
    public static final RegistryObject<Block> ENDER_SRAKTCAF1 = BLOCKS.register("ender_sraktcaf_1", () -> new EnderSraktcaf1(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(60.0F)
    ));
    public static final RegistryObject<Block> ENDER_STAKRACH1 = BLOCKS.register("ender_stakrach_1", () -> new EnderStakrach1(
            Block.Properties.create(Material.WOOD)
                    .harvestLevel(2)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(40.0F)
    ));
    public static final RegistryObject<Block> ENDER_TRASKCRAFTH1 = BLOCKS.register("ender_traskcrafth_1", () -> new EnderTraskcrafth1(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(5)
                    .hardnessAndResistance(100.0F)
    ));
    public static final RegistryObject<Block> ENDER_TRASKRACH1 = BLOCKS.register("ender_traskrach_1", () -> new EnderTraskrach1(
            Block.Properties.create(Material.SPONGE)
                    .harvestLevel(4)
                    .hardnessAndResistance(80.0F)
    ));
    public static final RegistryObject<Block> BLACK_SMOOTH_STONE_SLAB = BLOCKS.register("black_smooth_stone_slab", () -> new BlackSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BLUE_SMOOTH_STONE_SLAB = BLOCKS.register("blue_smooth_stone_slab", () -> new BlueSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> BROWN_SMOOTH_STONE_SLAB = BLOCKS.register("brown_smooth_stone_slab", () -> new BrownSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> CYAN_SMOOTH_STONE_SLAB = BLOCKS.register("cyan_smooth_stone_slab", () -> new CyanSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> GREEN_SMOOTH_STONE_SLAB = BLOCKS.register("green_smooth_stone_slab", () -> new GreenSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_STONE_SLAB = BLOCKS.register("light_blue_smooth_stone_slab", () -> new LightBlueSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_STONE_SLAB = BLOCKS.register("light_gray_smooth_stone_slab", () -> new LightGraySmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> LIME_SMOOTH_STONE_SLAB = BLOCKS.register("lime_smooth_stone_slab", () -> new LimeSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_STONE_SLAB = BLOCKS.register("magenta_smooth_stone_slab", () -> new MagentaSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> ORANGE_SMOOTH_STONE_SLAB = BLOCKS.register("orange_smooth_stone_slab", () -> new OrangeSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PINK_SMOOTH_STONE_SLAB = BLOCKS.register("pink_smooth_stone_slab", () -> new PinkSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> PURPLE_SMOOTH_STONE_SLAB = BLOCKS.register("purple_smooth_stone_slab", () -> new PurpleSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> RED_SMOOTH_STONE_SLAB = BLOCKS.register("red_smooth_stone_slab", () -> new RedSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> WHITE_SMOOTH_STONE_SLAB = BLOCKS.register("white_smooth_stone_slab", () -> new WhiteSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> YELLOW_SMOOTH_STONE_SLAB = BLOCKS.register("yellow_smooth_stone_slab", () -> new YellowSmoothStoneSlab(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.0F, 6.0F)
    ));
    public static final RegistryObject<Block> ZURK_BLOCK = BLOCKS.register("zurk_block", () -> new ZurkBlock(
            Block.Properties.create(Material.EARTH)
                    .harvestLevel(6)
                    .hardnessAndResistance(200.0F)
    ));
    public static final RegistryObject<Block> ZUNK_BLOCK = BLOCKS.register("zunk_block", () -> new ZunkBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .hardnessAndResistance(40.0F)
    ));
    public static final RegistryObject<Block> BLACK_COBBLESTONE_STAIRS = BLOCKS.register("black_cobblestone_stairs", () -> new BlackCobblestoneStairs(
            () -> BLACK_COBBLESTONE.get().getDefaultState(),Block.Properties.from(BLACK_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> BLACK_SMOOTH_STONE_STAIRS = BLOCKS.register("black_smooth_stone_stairs", () -> new BlackSmoothStoneStairs(
            () -> BLACK_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(BLACK_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> BLACK_STONE_STAIRS = BLOCKS.register("black_stone_stairs", () -> new BlackStoneStairs(
            () -> BLACK_STONE.get().getDefaultState(),Block.Properties.from(BLACK_STONE.get())
    ));
    public static final RegistryObject<Block> BLUE_COBBLESTONE_STAIRS = BLOCKS.register("blue_cobblestone_stairs", () -> new BlueCobblestoneStairs(
            () -> BLUE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(BLUE_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> BLUE_SMOOTH_STONE_STAIRS = BLOCKS.register("blue_smooth_stone_stairs", () -> new BlueSmoothStoneStairs(
            () -> BLUE_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(BLUE_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> BLUE_STONE_STAIRS = BLOCKS.register("blue_stone_stairs", () -> new BlueStoneStairs(
            () -> BLUE_STONE.get().getDefaultState(),Block.Properties.from(BLUE_STONE.get())
    ));
    public static final RegistryObject<Block> BROWN_COBBLESTONE_STAIRS = BLOCKS.register("brown_cobblestone_stairs", () -> new BrownCobblestoneStairs(
            () -> BROWN_COBBLESTONE.get().getDefaultState(),Block.Properties.from(BROWN_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> BROWN_SMOOTH_STONE_STAIRS = BLOCKS.register("brown_smooth_stone_stairs", () -> new BrownSmoothStoneStairs(
            () -> BROWN_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(BROWN_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> BROWN_STONE_STAIRS = BLOCKS.register("brown_stone_stairs", () -> new BrownStoneStairs(
            () -> BROWN_STONE.get().getDefaultState(),Block.Properties.from(BROWN_STONE.get())
    ));
    public static final RegistryObject<Block> CYAN_COBBLESTONE_STAIRS = BLOCKS.register("cyan_cobblestone_stairs", () -> new CyanCobblestoneStairs(
            () -> CYAN_COBBLESTONE.get().getDefaultState(),Block.Properties.from(CYAN_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> CYAN_SMOOTH_STONE_STAIRS = BLOCKS.register("cyan_smooth_stone_stairs", () -> new CyanSmoothStoneStairs(
            () -> CYAN_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(CYAN_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> CYAN_STONE_STAIRS = BLOCKS.register("cyan_stone_stairs", () -> new CyanStoneStairs(
            () -> CYAN_STONE.get().getDefaultState(),Block.Properties.from(CYAN_STONE.get())
    ));
    public static final RegistryObject<Block> GREEN_COBBLESTONE_STAIRS = BLOCKS.register("green_cobblestone_stairs", () -> new GreenCobblestoneStairs(
            () -> GREEN_COBBLESTONE.get().getDefaultState(),Block.Properties.from(GREEN_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> GREEN_SMOOTH_STONE_STAIRS = BLOCKS.register("green_smooth_stone_stairs", () -> new GreenSmoothStoneStairs(
            () -> GREEN_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(GREEN_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> GREEN_STONE_STAIRS = BLOCKS.register("green_stone_stairs", () -> new GreenStoneStairs(
            () -> GREEN_STONE.get().getDefaultState(),Block.Properties.from(GREEN_STONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE_STAIRS = BLOCKS.register("light_blue_cobblestone_stairs", () -> new LightBlueCobblestoneStairs(
            () -> LIGHT_BLUE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(LIGHT_BLUE_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_STONE_STAIRS = BLOCKS.register("light_blue_smooth_stone_stairs", () -> new LightBlueSmoothStoneStairs(
            () -> LIGHT_BLUE_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(LIGHT_BLUE_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_STONE_STAIRS = BLOCKS.register("light_blue_stone_stairs", () -> new LightBlueStoneStairs(
            () -> LIGHT_BLUE_STONE.get().getDefaultState(),Block.Properties.from(LIGHT_BLUE_STONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_COBBLESTONE_STAIRS = BLOCKS.register("light_gray_cobblestone_stairs", () -> new LightGrayCobblestoneStairs(
            () -> LIGHT_GRAY_COBBLESTONE.get().getDefaultState(),Block.Properties.from(LIGHT_GRAY_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_STONE_STAIRS = BLOCKS.register("light_gray_smooth_stone_stairs", () -> new LightGraySmoothStoneStairs(
            () -> LIGHT_GRAY_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(LIGHT_GRAY_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_STONE_STAIRS = BLOCKS.register("light_gray_stone_stairs", () -> new LightGrayStoneStairs(
            () -> LIGHT_GRAY_STONE.get().getDefaultState(),Block.Properties.from(LIGHT_GRAY_STONE.get())
    ));
    public static final RegistryObject<Block> LIME_COBBLESTONE_STAIRS = BLOCKS.register("lime_cobblestone_stairs", () -> new LimeCobblestoneStairs(
            () -> LIME_COBBLESTONE.get().getDefaultState(),Block.Properties.from(LIME_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> LIME_SMOOTH_STONE_STAIRS = BLOCKS.register("lime_smooth_stone_stairs", () -> new LimeSmoothStoneStairs(
            () -> LIME_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(LIME_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> LIME_STONE_STAIRS = BLOCKS.register("lime_stone_stairs", () -> new LightGrayStoneStairs(
            () -> LIME_STONE.get().getDefaultState(),Block.Properties.from(LIME_STONE.get())
    ));
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE_STAIRS = BLOCKS.register("magenta_cobblestone_stairs", () -> new MagentaCobblestoneStairs(
            () -> MAGENTA_COBBLESTONE.get().getDefaultState(),Block.Properties.from(MAGENTA_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_STONE_STAIRS = BLOCKS.register("magenta_smooth_stone_stairs", () -> new MagentaCobblestoneStairs(
            () -> MAGENTA_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(MAGENTA_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> MAGENTA_STONE_STAIRS = BLOCKS.register("magenta_stone_stairs", () -> new MagentaStoneStairs(
            () -> MAGENTA_STONE.get().getDefaultState(),Block.Properties.from(MAGENTA_STONE.get())
    ));
    public static final RegistryObject<Block> ORANGE_COBBLESTONE_STAIRS = BLOCKS.register("orange_cobblestone_stairs", () -> new OrangeCobblestoneStairs(
            () -> ORANGE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(ORANGE_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> ORANGE_SMOOTH_STONE_STAIRS = BLOCKS.register("orange_smooth_stone_stairs", () -> new OrangeCobblestoneStairs(
            () -> ORANGE_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(ORANGE_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> ORANGE_STONE_STAIRS = BLOCKS.register("orange_stone_stairs", () -> new OrangeStoneStairs(
            () -> ORANGE_STONE.get().getDefaultState(),Block.Properties.from(ORANGE_STONE.get())
    ));
    public static final RegistryObject<Block> PINK_COBBLESTONE_STAIRS = BLOCKS.register("pink_cobblestone_stairs", () -> new PinkCobblestoneStairs(
            () -> PINK_COBBLESTONE.get().getDefaultState(),Block.Properties.from(PINK_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> PINK_SMOOTH_STONE_STAIRS = BLOCKS.register("pink_smooth_stone_stairs", () -> new PinkCobblestoneStairs(
            () -> PINK_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(PINK_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> PINK_STONE_STAIRS = BLOCKS.register("pink_stone_stairs", () -> new PinkStoneStairs(
            () -> PINK_STONE.get().getDefaultState(),Block.Properties.from(PINK_STONE.get())
    ));
    public static final RegistryObject<Block> PURPLE_COBBLESTONE_STAIRS = BLOCKS.register("purple_cobblestone_stairs", () -> new PurpleCobblestoneStairs(
            () -> PURPLE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(PURPLE_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> PURPLE_SMOOTH_STONE_STAIRS = BLOCKS.register("purple_smooth_stone_stairs", () -> new PurpleCobblestoneStairs(
            () -> PURPLE_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(PURPLE_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> PURPLE_STONE_STAIRS = BLOCKS.register("purple_stone_stairs", () -> new PurpleStoneStairs(
            () -> PURPLE_STONE.get().getDefaultState(),Block.Properties.from(PURPLE_STONE.get())
    ));
    public static final RegistryObject<Block> RED_COBBLESTONE_STAIRS = BLOCKS.register("red_cobblestone_stairs", () -> new RedCobblestoneStairs(
            () -> RED_COBBLESTONE.get().getDefaultState(),Block.Properties.from(RED_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> RED_SMOOTH_STONE_STAIRS = BLOCKS.register("red_smooth_stone_stairs", () -> new RedCobblestoneStairs(
            () -> RED_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(RED_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> RED_STONE_STAIRS = BLOCKS.register("red_stone_stairs", () -> new RedStoneStairs(
            () -> RED_STONE.get().getDefaultState(),Block.Properties.from(RED_STONE.get())
    ));
    public static final RegistryObject<Block> WHITE_COBBLESTONE_STAIRS = BLOCKS.register("white_cobblestone_stairs", () -> new WhiteCobblestoneStairs(
            () -> WHITE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(WHITE_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> WHITE_SMOOTH_STONE_STAIRS = BLOCKS.register("white_smooth_stone_stairs", () -> new WhiteCobblestoneStairs(
            () -> WHITE_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(WHITE_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> WHITE_STONE_STAIRS = BLOCKS.register("white_stone_stairs", () -> new WhiteStoneStairs(
            () -> WHITE_STONE.get().getDefaultState(),Block.Properties.from(WHITE_STONE.get())
    ));
    public static final RegistryObject<Block> YELLOW_COBBLESTONE_STAIRS = BLOCKS.register("yellow_cobblestone_stairs", () -> new YellowCobblestoneStairs(
            () -> YELLOW_COBBLESTONE.get().getDefaultState(),Block.Properties.from(YELLOW_COBBLESTONE.get())
    ));
    public static final RegistryObject<Block> YELLOW_SMOOTH_STONE_STAIRS = BLOCKS.register("yellow_smooth_stone_stairs", () -> new YellowCobblestoneStairs(
            () -> YELLOW_SMOOTH_STONE.get().getDefaultState(),Block.Properties.from(YELLOW_SMOOTH_STONE.get())
    ));
    public static final RegistryObject<Block> YELLOW_STONE_STAIRS = BLOCKS.register("yellow_stone_stairs", () -> new YellowStoneStairs(
            () -> YELLOW_STONE.get().getDefaultState(),Block.Properties.from(YELLOW_STONE.get())
    ));
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs", () -> new SmoothStoneStairs(
            () -> YELLOW_STONE.get().getDefaultState(),Block.Properties.from(YELLOW_STONE.get())
    ));
    public static final RegistryObject<Block> FREIN_BLOCK = BLOCKS.register("frein_block", () -> new FreinBlock(
            Block.Properties.create(Material.CLAY)
                    .slipperiness(1.0F)
                    .sound(SoundType.SLIME)
                    .hardnessAndResistance(0.0F)
                    .notSolid()
    ));
    public static final RegistryObject<Block> GANK_BLOCK = BLOCKS.register("gank_block", () -> new GankBlock(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(990.0F)
    ));
    public static final RegistryObject<Block> FIRG_SAPLING = BLOCKS.register("firg_sapling", () -> new FirgSaplingBlock(
            new FirgTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)
    ));
    public static final RegistryObject<Block> FIRG_LOG = BLOCKS.register("firg_log", () -> new FirgLog(
            Block.Properties.create(Material.WOOD)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(2.0F)
    ));
    public static final RegistryObject<Block> FIRG_LEAVES = BLOCKS.register("firg_leaves", () -> new FirgLeaves(
            Block.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
    ));
}
