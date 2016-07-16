package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class BlockRegistry {

    // Market blocks
    public static Block pamMarket;

    // Garden blocks
    public static Block aridGardenBlock;
    public static Block frostGardenBlock;
    public static Block tropicalGardenBlock;
    public static Block windyGardenBlock;
    public static Block shadedGardenBlock;
    public static Block soggyGardenBlock;

    // SAPLING lists
    public static Block[] PamTemperateSAPLINGs;
    public static Block[] PamWarmSAPLINGs;
    public static Block[] PamLogSAPLINGs;

    // Crops
    public static Block pamblackberryCrop;
    public static Block pamblueberryCrop;
    public static Block pamcandleberryCrop;
    public static Block pamraspberryCrop;
    public static Block pamstrawberryCrop;
    public static Block pamcactusfruitCrop;
    public static Block pamasparagusCrop;
    public static Block pambarleyCrop;
    public static Block pamoatsCrop;
    public static Block pamryeCrop;
    public static Block pamcornCrop;
    public static Block pambambooshootCrop;
    public static Block pamcantaloupeCrop;
    public static Block pamcucumberCrop;
    public static Block pamwintersquashCrop;
    public static Block pamzucchiniCrop;
    public static Block pambeetCrop;
    public static Block pamonionCrop;
    public static Block pamparsnipCrop;
    public static Block pampeanutCrop;
    public static Block pamradishCrop;
    public static Block pamrutabagaCrop;
    public static Block pamsweetpotatoCrop;
    public static Block pamturnipCrop;
    public static Block pamrhubarbCrop;
    public static Block pamceleryCrop;
    public static Block pamgarlicCrop;
    public static Block pamgingerCrop;
    public static Block pamspiceleafCrop;
    public static Block pamtealeafCrop;
    public static Block pamcoffeebeanCrop;
    public static Block pammustardseedsCrop;
    public static Block pambroccoliCrop;
    public static Block pamcauliflowerCrop;
    public static Block pamleekCrop;
    public static Block pamlettuceCrop;
    public static Block pamscallionCrop;
    public static Block pamartichokeCrop;
    public static Block pambrusselsproutCrop;
    public static Block pamcabbageCrop;
    public static Block pamspinachCrop;
    public static Block pamwhitemushroomCrop;
    public static Block pambeanCrop;
    public static Block pamsoybeanCrop;
    public static Block pambellpepperCrop;
    public static Block pamchilipepperCrop;
    public static Block pameggplantCrop;
    public static Block pamokraCrop;
    public static Block pampeasCrop;
    public static Block pamtomatoCrop;
    public static Block pamcottonCrop;
    public static Block pampineappleCrop;
    public static Block pamgrapeCrop;
    public static Block pamkiwiCrop;
    public static Block pamcranberryCrop;
    public static Block pamriceCrop;
    public static Block pamseaweedCrop;
    public static Block pamcurryleafCrop;
    public static Block pamsesameseedsCrop;
    public static Block pamwaterchestnutCrop;

    // Tree fruits and SAPLINGs
    public static Block pamApple;
    public static Block pamappleSAPLING;
    public static Block pamAlmond;
    public static Block pamalmondSAPLING;
    public static Block pamApricot;
    public static Block pamapricotSAPLING;
    public static Block pamAvocado;
    public static Block pamavocadoSAPLING;
    public static Block pamBanana;
    public static Block pambananaSAPLING;
    public static Block pamCashew;
    public static Block pamcashewSAPLING;
    public static Block pamCherry;
    public static Block pamcherrySAPLING;
    public static Block pamChestnut;
    public static Block pamchestnutSAPLING;
    public static Block pamCinnamon;
    public static Block pamcinnamonSAPLING;
    public static Block pamCoconut;
    public static Block pamcoconutSAPLING;
    public static Block pamDate;
    public static Block pamdateSAPLING;
    public static Block pamDragonfruit;
    public static Block pamdragonfruitSAPLING;
    public static Block pamDurian;
    public static Block pamdurianSAPLING;
    public static Block pamFig;
    public static Block pamfigSAPLING;
    public static Block pamGooseberry;
    public static Block pamgooseberrySAPLING;
    public static Block pamGrapefruit;
    public static Block pamgrapefruitSAPLING;
    public static Block pamLemon;
    public static Block pamlemonSAPLING;
    public static Block pamLime;
    public static Block pamlimeSAPLING;
    public static Block pamMaple;
    public static Block pammapleSAPLING;
    public static Block pamMango;
    public static Block pammangoSAPLING;
    public static Block pamNutmeg;
    public static Block pamnutmegSAPLING;
    public static Block pamOlive;
    public static Block pamoliveSAPLING;
    public static Block pamOrange;
    public static Block pamorangeSAPLING;
    public static Block pamPapaya;
    public static Block pampapayaSAPLING;
    public static Block pamPaperbark;
    public static Block pampaperbarkSAPLING;
    public static Block pamPeach;
    public static Block pampeachSAPLING;
    public static Block pamPear;
    public static Block pampearSAPLING;
    public static Block pamPecan;
    public static Block pampecanSAPLING;
    public static Block pamPeppercorn;
    public static Block pampeppercornSAPLING;
    public static Block pamPersimmon;
    public static Block pampersimmonSAPLING;
    public static Block pamPistachio;
    public static Block pampistachioSAPLING;
    public static Block pamPlum;
    public static Block pamplumSAPLING;
    public static Block pamPomegranate;
    public static Block pampomegranateSAPLING;
    public static Block pamStarfruit;
    public static Block pamstarfruitSAPLING;
    public static Block pamVanillabean;
    public static Block pamvanillabeanSAPLING;
    public static Block pamWalnut;
    public static Block pamwalnutSAPLING;

    public static ItemBlock marketItemBlock;

    // Block configuration variables
    public static int gardenRarity;
    public static int gardendropAmount;
    public static boolean enablegardenSpread;
    public static int gardenspreadRate;
    public static boolean enablearidgardenGeneration;
    public static boolean enablefrostgardenGeneration;
    public static boolean enabletropicalgardenGeneration;
    public static boolean enablewindygardenGeneration;
    public static boolean enableshadedgardenGeneration;
    public static boolean enablesoggygardenGeneration;
    public static int temperatefruittreeRarity;
    public static int tropicalfruittreeRarity;
    public static int coniferousfruittreeRarity;
    public static boolean appletreeGeneration;
    public static boolean almondtreeGeneration;
    public static boolean apricottreeGeneration;
    public static boolean avocadotreeGeneration;
    public static boolean bananatreeGeneration;
    public static boolean cashewtreeGeneration;
    public static boolean cherrytreeGeneration;
    public static boolean chestnuttreeGeneration;
    public static boolean cinnamontreeGeneration;
    public static boolean coconuttreeGeneration;
    public static boolean datetreeGeneration;
    public static boolean dragonfruittreeGeneration;
    public static boolean duriantreeGeneration;
    public static boolean figtreeGeneration;
    public static boolean grapefruittreeGeneration;
    public static boolean lemontreeGeneration;
    public static boolean limetreeGeneration;
    public static boolean mapletreeGeneration;
    public static boolean mangotreeGeneration;
    public static boolean nutmegtreeGeneration;
    public static boolean olivetreeGeneration;
    public static boolean orangetreeGeneration;
    public static boolean papayatreeGeneration;
    public static boolean paperbarktreeGeneration;
    public static boolean peachtreeGeneration;
    public static boolean peartreeGeneration;
    public static boolean pecantreeGeneration;
    public static boolean peppercorntreeGeneration;
    public static boolean persimmontreeGeneration;
    public static boolean pistachiotreeGeneration;
    public static boolean plumtreeGeneration;
    public static boolean pomegranatetreeGeneration;
    public static boolean starfruittreeGeneration;
    public static boolean vanillabeantreeGeneration;
    public static boolean walnuttreeGeneration;
    public static boolean gooseberrytreeGeneration;
    public static boolean rightclickharvestCrop;
    public static boolean rightclickharvestFruit;
    public static boolean enablecropspecialplanting;

    // Market configuration
    public static boolean marketsellSeeds;
    public static boolean marketselltemperateSAPLINGs;
    public static boolean marketselltropicalSAPLINGs;
    public static boolean marketsellconiferousSAPLINGs;
    public static boolean marketsellPig;
    public static boolean marketsellSheep;
    public static boolean marketsellCow;
    public static boolean marketsellChicken;
    public static boolean marketsellHorse;
    public static boolean marketsellBonemeal;
    public static int marketblockrecipeItem;
    public static int marketseedPrice;
    public static int marketSAPLINGPrice;
    public static int marketpigPrice;
    public static int marketsheepPrice;
    public static int marketcowPrice;
    public static int marketchickenPrice;
    public static int markethorsePrice;
    public static int marketbonemealPrice;
    public static int marketcurrencySeeds;
    public static int marketcurrencytemperateSAPLINGs;
    public static int marketcurrencytropicalSAPLINGs;
    public static int marketcurrencyconiferousSAPLINGs;
    public static int marketcurrencyPig;
    public static int marketcurrencySheep;
    public static int marketcurrencyCow;
    public static int marketcurrencyChicken;
    public static int marketcurrencyHorse;
    public static int marketcurrencyBonemeal;


    public static void initBlockConfig(Configuration config) {
        gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
        gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
        enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
        gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
        enablearidgardenGeneration = config.get("gardens", "enablearidgardenGeneration", true).getBoolean(true);
        enablefrostgardenGeneration = config.get("gardens", "enablefrostgardenGeneration", true).getBoolean(true);
        enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
        enablewindygardenGeneration = config.get("gardens", "enablewindygardenGeneration", true).getBoolean(true);
        enableshadedgardenGeneration = config.get("gardens", "enableshadedgardenGeneration", true).getBoolean(true);
        enablesoggygardenGeneration = config.get("gardens", "enablesoggygardenGeneration", true).getBoolean(true);
        temperatefruittreeRarity = config.get("fruit trees", "temperatefruittreeRarity", 24).getInt();
        tropicalfruittreeRarity = config.get("fruit trees", "tropicalfruittreeRarity", 32).getInt();
        coniferousfruittreeRarity = config.get("fruit trees", "coniferousfruittreeRarity", 24).getInt();
        appletreeGeneration = config.get("fruit trees", "appletreeGeneration", true).getBoolean(true);
        almondtreeGeneration = config.get("fruit trees", "almondtreeGeneration", true).getBoolean(true);
        apricottreeGeneration = config.get("fruit trees", "apricottreeGeneration", true).getBoolean(true);
        avocadotreeGeneration = config.get("fruit trees", "avocadotreeGeneration", true).getBoolean(true);
        bananatreeGeneration = config.get("fruit trees", "bananatreeGeneration", true).getBoolean(true);
        cashewtreeGeneration = config.get("fruit trees", "cashewtreeGeneration", true).getBoolean(true);
        cherrytreeGeneration = config.get("fruit trees", "cherrytreeGeneration", true).getBoolean(true);
        chestnuttreeGeneration = config.get("fruit trees", "chestnuttreeGeneration", true).getBoolean(true);
        cinnamontreeGeneration = config.get("fruit trees", "cinnamontreeGeneration", true).getBoolean(true);
        coconuttreeGeneration = config.get("fruit trees", "coconuttreeGeneration", true).getBoolean(true);
        datetreeGeneration = config.get("fruit trees", "datetreeGeneration", true).getBoolean(true);
        dragonfruittreeGeneration = config.get("fruit trees", "dragonfruittreeGeneration", true).getBoolean(true);
        duriantreeGeneration = config.get("fruit trees", "duriantreeGeneration", true).getBoolean(true);
        figtreeGeneration = config.get("fruit trees", "figtreeGeneration", true).getBoolean(true);
        grapefruittreeGeneration = config.get("fruit trees", "grapefruittreeGeneration", true).getBoolean(true);
        lemontreeGeneration = config.get("fruit trees", "lemontreeGeneration", true).getBoolean(true);
        limetreeGeneration = config.get("fruit trees", "limetreeGeneration", true).getBoolean(true);
        mapletreeGeneration = config.get("fruit trees", "mapletreeGeneration", true).getBoolean(true);
        mangotreeGeneration = config.get("fruit trees", "mangotreeGeneration", true).getBoolean(true);
        nutmegtreeGeneration = config.get("fruit trees", "nutmegtreeGeneration", true).getBoolean(true);
        olivetreeGeneration = config.get("fruit trees", "olivetreeGeneration", true).getBoolean(true);
        orangetreeGeneration = config.get("fruit trees", "orangetreeGeneration", true).getBoolean(true);
        papayatreeGeneration = config.get("fruit trees", "papayatreeGeneration", true).getBoolean(true);
        paperbarktreeGeneration = config.get("fruit trees", "paperbarktreeGeneration", true).getBoolean(true);
        peachtreeGeneration = config.get("fruit trees", "peachtreeGeneration", true).getBoolean(true);
        peartreeGeneration = config.get("fruit trees", "peartreeGeneration", true).getBoolean(true);
        pecantreeGeneration = config.get("fruit trees", "pecantreeGeneration", true).getBoolean(true);
        peppercorntreeGeneration = config.get("fruit trees", "peppercorntreeGeneration", true).getBoolean(true);
        persimmontreeGeneration = config.get("fruit trees", "persimmontreeGeneration", true).getBoolean(true);
        pistachiotreeGeneration = config.get("fruit trees", "pistachiotreeGeneration", true).getBoolean(true);
        plumtreeGeneration = config.get("fruit trees", "plumtreeGeneration", true).getBoolean(true);
        pomegranatetreeGeneration = config.get("fruit trees", "pomegranatetreeGeneration", true).getBoolean(true);
        starfruittreeGeneration = config.get("fruit trees", "starfruittreeGeneration", true).getBoolean(true);
        vanillabeantreeGeneration = config.get("fruit trees", "vanillabeantreeGeneration", true).getBoolean(true);
        walnuttreeGeneration = config.get("fruit trees", "walnuttreeGeneration", true).getBoolean(true);
        gooseberrytreeGeneration = config.get("fruit trees", "gooseberrytreeGeneration", true).getBoolean(true);
        rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
        rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
        enablecropspecialplanting = config.get("crops", "enablecropspecialplanting", true).getBoolean(true);

        marketsellSeeds = config.get("market sales", "marketsellSeeds", true).getBoolean(true);
        marketselltemperateSAPLINGs = config.get("market sales", "marketselltemperateSAPLINGs", true).getBoolean(true);
        marketselltropicalSAPLINGs = config.get("market sales", "marketselltropicalSAPLINGs", true).getBoolean(true);
        marketsellconiferousSAPLINGs = config.get("market sales", "marketsellconiferousSAPLINGs", true).getBoolean(true);
        marketsellPig = config.get("market sales", "marketsellPig", true).getBoolean(true);
        marketsellSheep = config.get("market sales", "marketsellSheep", true).getBoolean(true);
        marketsellCow = config.get("market sales", "marketsellCow", true).getBoolean(true);
        marketsellChicken = config.get("market sales", "marketsellChicken", true).getBoolean(true);
        marketsellHorse = config.get("market sales", "marketsellHorse", true).getBoolean(true);
        marketsellBonemeal = config.get("market sales", "marketsellBonemeal", true).getBoolean(true);
        marketblockrecipeItem = config.get("miscellaneous recipes", "marketblockrecipeItem", 0).getInt();
        marketseedPrice = config.get("market prices", "marketseedPrice", 1).getInt();
        marketSAPLINGPrice = config.get("market prices", "marketSAPLINGPrice", 3).getInt();
        marketpigPrice = config.get("market prices", "marketpigPrice", 6).getInt();
        marketsheepPrice = config.get("market prices", "marketsheepPrice", 6).getInt();
        marketcowPrice = config.get("market prices", "marketcowPrice", 9).getInt();
        marketchickenPrice = config.get("market prices", "marketchickenPrice", 3).getInt();
        markethorsePrice = config.get("market prices", "markethorsePrice", 12).getInt();
        marketbonemealPrice = config.get("market prices", "marketbonemealPrice", 3).getInt();
        marketcurrencySeeds = config.get("market currency", "marketcurrencySeeds", 0).getInt();
        marketcurrencytemperateSAPLINGs = config.get("market currency", "marketcurrencytemperateSAPLINGs", 0).getInt();
        marketcurrencytropicalSAPLINGs = config.get("market currency", "marketcurrencytropicalSAPLINGs", 0).getInt();
        marketcurrencyconiferousSAPLINGs = config.get("market currency", "marketcurrencyconiferousSAPLINGs", 0).getInt();
        marketcurrencyPig = config.get("market currency", "marketcurrencyPig", 0).getInt();
        marketcurrencySheep = config.get("market currency", "marketcurrencySheep", 0).getInt();
        marketcurrencyCow = config.get("market currency", "marketcurrencyCow", 0).getInt();
        marketcurrencyChicken = config.get("market currency", "marketcurrencyChicken", 0).getInt();
        marketcurrencyHorse = config.get("market currency", "marketcurrencyHorse", 0).getInt();
        marketcurrencyBonemeal = config.get("market currency", "marketcurrencyBonemeal", 0).getInt();
    }

    public static void loadBlockRegistry() {

        // Market block
        pamMarket = new BlockPamMarket(Material.WOOD).setHardness(1.0F).setResistance(1.0F);
        marketItemBlock = new ItemBlock(pamMarket);

        registerBlock("market", marketItemBlock, pamMarket);

        aridGardenBlock = new AridGardenBlock();
        frostGardenBlock = new FrostGardenBlock();
        tropicalGardenBlock = new TropicalGardenBlock();
        windyGardenBlock = new WindyGardenBlock();
        shadedGardenBlock = new ShadedGardenBlock();
        soggyGardenBlock = new SoggyGardenBlock();

        pamblackberryCrop = registerBlockCrop("pamblackberryCrop");
        pamblueberryCrop = registerBlockCrop("pamblueberryCrop");
        pamcandleberryCrop = registerBlockCrop("pamcandleberryCrop");
        pamraspberryCrop = registerBlockCrop("pamraspberryCrop");
        pamstrawberryCrop = registerBlockCrop("pamstrawberryCrop");
        pamcactusfruitCrop = registerBlockCrop("pamcactusfruitCrop");
        pamasparagusCrop = registerBlockCrop("pamasparagusCrop");
        pambarleyCrop = registerBlockCrop("pambarleyCrop");
        pamoatsCrop = registerBlockCrop("pamoatsCrop");
        pamryeCrop = registerBlockCrop("pamryeCrop");
        pamcornCrop = registerBlockCrop("pamcornCrop");
        pambambooshootCrop = registerBlockCrop("pambambooshootCrop");
        pamcantaloupeCrop = registerBlockCrop("pamcantaloupeCrop");
        pamcucumberCrop = registerBlockCrop("pamcucumberCrop");
        pamwintersquashCrop = registerBlockCrop("pamwintersquashCrop");
        pamzucchiniCrop = registerBlockCrop("pamzucchiniCrop");
        pambeetCrop = registerBlockCrop("pambeetCrop");
        pamonionCrop = registerBlockCrop("pamonionCrop");
        pamparsnipCrop = registerBlockCrop("pamparsnipCrop");
        pampeanutCrop = registerBlockCrop("pampeanutCrop");
        pamradishCrop = registerBlockCrop("pamradishCrop");
        pamrutabagaCrop = registerBlockCrop("pamrutabagaCrop");
        pamsweetpotatoCrop = registerBlockCrop("pamsweetpotatoCrop");
        pamturnipCrop = registerBlockCrop("pamturnipCrop");
        pamrhubarbCrop = registerBlockCrop("pamrhubarbCrop");
        pamceleryCrop = registerBlockCrop("pamceleryCrop");
        pamgarlicCrop = registerBlockCrop("pamgarlicCrop");
        pamgingerCrop = registerBlockCrop("pamgingerCrop");
        pamspiceleafCrop = registerBlockCrop("pamspiceleafCrop");
        pamtealeafCrop = registerBlockCrop("pamtealeafCrop");
        pamcoffeebeanCrop = registerBlockCrop("pamcoffeebeanCrop");
        pammustardseedsCrop = registerBlockCrop("pammustardseedsCrop");
        pambroccoliCrop = registerBlockCrop("pambroccoliCrop");
        pamcauliflowerCrop = registerBlockCrop("pamcauliflowerCrop");
        pamleekCrop = registerBlockCrop("pamleekCrop");
        pamlettuceCrop = registerBlockCrop("pamlettuceCrop");
        pamscallionCrop = registerBlockCrop("pamscallionCrop");
        pamartichokeCrop = registerBlockCrop("pamartichokeCrop");
        pambrusselsproutCrop = registerBlockCrop("pambrusselsproutCrop");
        pamcabbageCrop = registerBlockCrop("pamcabbageCrop");
        pamspinachCrop = registerBlockCrop("pamspinachCrop");
        pamwhitemushroomCrop = registerBlockCrop("pamwhitemushroomCrop");
        pambeanCrop = registerBlockCrop("pambeanCrop");
        pamsoybeanCrop = registerBlockCrop("pamsoybeanCrop");
        pambellpepperCrop = registerBlockCrop("pambellpepperCrop");
        pamchilipepperCrop = registerBlockCrop("pamchilipepperCrop");
        pameggplantCrop = registerBlockCrop("pameggplantCrop");
        pamokraCrop = registerBlockCrop("pamokraCrop");
        pampeasCrop = registerBlockCrop("pampeasCrop");
        pamtomatoCrop = registerBlockCrop("pamtomatoCrop");
        pamcottonCrop = registerBlockCrop("pamcottonCrop");
        pampineappleCrop = registerBlockCrop("pampineappleCrop");
        pamgrapeCrop = registerBlockCrop("pamgrapeCrop");
        pamkiwiCrop = registerBlockCrop("pamkiwiCrop");
        pamcranberryCrop = registerBlockCrop("pamcranberryCrop");
        pamriceCrop = registerBlockCrop("pamriceCrop");
        pamseaweedCrop = registerBlockCrop("pamseaweedCrop");
        pamcurryleafCrop = registerBlockCrop("pamcurryleafCrop");
        pamsesameseedsCrop = registerBlockCrop("pamsesameseedsCrop");
        pamwaterchestnutCrop = registerBlockCrop("pamwaterchestnutCrop");

        pamApple = registerBlockFruit("pamApple");
        pamappleSAPLING = new BlockPamSAPLING("apple_SAPLING");
        pamAlmond = registerBlockFruit("pamAlmond");
        pamalmondSAPLING = new BlockPamSAPLING("almond_SAPLING");
        pamApricot = registerBlockFruit("pamApricot");
        pamapricotSAPLING = new BlockPamSAPLING("apricot_SAPLING");
        pamAvocado = registerBlockFruit("pamAvocado");
        pamavocadoSAPLING = new BlockPamSAPLING("avocado_SAPLING");
        pamBanana = registerBlockFruit("pamBanana");
        pambananaSAPLING = new BlockPamSAPLING("banana_SAPLING");
        pamCashew = registerBlockFruit("pamCashew");
        pamcashewSAPLING = new BlockPamSAPLING("cashew_SAPLING");
        pamCherry = registerBlockFruit("pamCherry");
        pamcherrySAPLING = new BlockPamSAPLING("cherry_SAPLING");
        pamChestnut = registerBlockFruit("pamChestnut");
        pamchestnutSAPLING = new BlockPamSAPLING("chestnut_SAPLING");
        pamCinnamon = registerBlockLogFruit("pamCinnamon");
        pamcinnamonSAPLING = new BlockPamSAPLING("cinnamon_SAPLING");
        pamCoconut = registerBlockFruit("pamCoconut");
        pamcoconutSAPLING = new BlockPamSAPLING("coconut_SAPLING");
        pamDate = registerBlockFruit("pamDate");
        pamdateSAPLING = new BlockPamSAPLING("date_SAPLING");
        pamDragonfruit = registerBlockFruit("pamDragonfruit");
        pamdragonfruitSAPLING = new BlockPamSAPLING("dragonfruit_SAPLING");
        pamDurian = registerBlockFruit("pamDurian");
        pamdurianSAPLING = new BlockPamSAPLING("durian_SAPLING");
        pamFig = registerBlockFruit("pamFig");
        pamfigSAPLING = new BlockPamSAPLING("fig_SAPLING");
        pamGooseberry = registerBlockFruit("pamGooseberry");
        pamgooseberrySAPLING = new BlockPamSAPLING("gooseberry_SAPLING");
        pamGrapefruit = registerBlockFruit("pamGrapefruit");
        pamgrapefruitSAPLING = new BlockPamSAPLING("grapefruit_SAPLING");
        pamLemon = registerBlockFruit("pamLemon");
        pamlemonSAPLING = new BlockPamSAPLING("lemon_SAPLING");
        pamLime = registerBlockFruit("pamLime");
        pamlimeSAPLING = new BlockPamSAPLING("lime_SAPLING");
        pamMaple = registerBlockLogFruit("pamMaple");
        pammapleSAPLING = new BlockPamSAPLING("maple_SAPLING");
        pamMango = registerBlockFruit("pamMango");
        pammangoSAPLING = new BlockPamSAPLING("mango_SAPLING");
        pamNutmeg = registerBlockFruit("pamNutmeg");
        pamnutmegSAPLING = new BlockPamSAPLING("nutmeg_SAPLING");
        pamOlive = registerBlockFruit("pamOlive");
        pamoliveSAPLING = new BlockPamSAPLING("olive_SAPLING");
        pamOrange = registerBlockFruit("pamOrange");
        pamorangeSAPLING = new BlockPamSAPLING("orange_SAPLING");
        pamPapaya = registerBlockFruit("pamPapaya");
        pampapayaSAPLING = new BlockPamSAPLING("papaya_SAPLING");
        pamPaperbark = registerBlockLogFruit("pamPaperbark");
        pampaperbarkSAPLING = new BlockPamSAPLING("paperbark_SAPLING");
        pamPeach = registerBlockFruit("pamPeach");
        pampeachSAPLING = new BlockPamSAPLING("peach_SAPLING");
        pamPear = registerBlockFruit("pamPear");
        pampearSAPLING = new BlockPamSAPLING("pear_SAPLING");
        pamPecan = registerBlockFruit("pamPecan");
        pampecanSAPLING = new BlockPamSAPLING("pecan_SAPLING");
        pamPeppercorn = registerBlockFruit("pamPeppercorn");
        pampeppercornSAPLING = new BlockPamSAPLING("peppercorn_SAPLING");
        pamPersimmon = registerBlockFruit("pamPersimmon");
        pampersimmonSAPLING = new BlockPamSAPLING("persimmon_SAPLING");
        pamPistachio = registerBlockFruit("pamPistachio");
        pampistachioSAPLING = new BlockPamSAPLING("pistachio_SAPLING");
        pamPlum = registerBlockFruit("pamPlum");
        pamplumSAPLING = new BlockPamSAPLING("plum_SAPLING");
        pamPomegranate = registerBlockFruit("pamPomegranate");
        pampomegranateSAPLING = new BlockPamSAPLING("pomegranate_SAPLING");
        pamStarfruit = registerBlockFruit("pamStarfruit");
        pamstarfruitSAPLING = new BlockPamSAPLING("starfruit_SAPLING");
        pamVanillabean = registerBlockFruit("pamVanillabean");
        pamvanillabeanSAPLING = new BlockPamSAPLING("vanillabean_SAPLING");
        pamWalnut = registerBlockFruit("pamWalnut");
        pamwalnutSAPLING = new BlockPamSAPLING("walnut_SAPLING");

        // Assign SAPLINGs to arrays
        PamTemperateSAPLINGs = new Block[]{pamappleSAPLING, pamavocadoSAPLING, pamcherrySAPLING, pamchestnutSAPLING, pamnutmegSAPLING, pampearSAPLING, pamplumSAPLING, pamwalnutSAPLING, pamgooseberrySAPLING};
        PamWarmSAPLINGs = new Block[]{pamalmondSAPLING, pamapricotSAPLING, pambananaSAPLING, pamcashewSAPLING, pamcoconutSAPLING, pamdateSAPLING, pamdragonfruitSAPLING, pamdurianSAPLING, pamfigSAPLING, pamgrapefruitSAPLING, pamlemonSAPLING, pamlimeSAPLING, pammangoSAPLING, pamoliveSAPLING, pamorangeSAPLING, pampapayaSAPLING, pampeachSAPLING, pampecanSAPLING, pampeppercornSAPLING, pampersimmonSAPLING, pampistachioSAPLING, pampomegranateSAPLING, pamstarfruitSAPLING, pamvanillabeanSAPLING};
        PamLogSAPLINGs = new Block[]{pamcinnamonSAPLING, pammapleSAPLING, pampaperbarkSAPLING};
    }

    private static Block registerBlockCrop(String registerName) {
        final Block pamCrop = new BlockPamCrop(registerName);
        final ItemBlock itemBlock = new ItemBlockFruit(pamCrop);

        return registerBlock(registerName, itemBlock, pamCrop);
    }

    private static Block registerBlockFruit(String registerName) {
        final Block pamFruit = new BlockPamFruit();
        final ItemBlock itemBlock = new ItemBlockFruit(pamFruit);

        return registerBlock(registerName, itemBlock, pamFruit);
    }

    private static Block registerBlockLogFruit(String registerName) {
        final Block pamLogFruit = new BlockPamLogFruit();
        final ItemBlock itemBlock = new ItemBlockFruit(pamLogFruit);

        return registerBlock(registerName, itemBlock, pamLogFruit);
    }

    private static Block registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(registerName);
        itemBlock.setUnlocalizedName(registerName);
        GameRegistry.register(itemBlock);

        return block;
    }

    public static Block registerBlock(String registerName, Block block) {
        final ItemBlock itemBlock = new ItemBlock(block);
        return registerBlock(registerName, itemBlock, block);
    }
}
