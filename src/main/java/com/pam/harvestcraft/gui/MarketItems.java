package com.pam.harvestcraft.gui;

import java.util.ArrayList;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;





public class MarketItems
{
/*  14 */   private static ArrayList<MarketData> items = new ArrayList();
  
  public static void registerItems(MarketData data)
  {
/*  18 */     items.add(data);
  }
  
  public static MarketData getData(int i)
  {
/*  23 */     return (MarketData)items.get(i);
  }
  
  public static int getSize()
  {
/*  28 */     return items.size();
  }
  
  public static void registerItems()
  {
/*  33 */     if (BlockRegistry.marketsellSeeds)
    {
/*  35 */       if (BlockRegistry.marketcurrencySeeds == 0)
      {
/*  37 */         for (int i = 0; i < 60; i++)
        {
/*  39 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.EMERALD), BlockRegistry.marketseedPrice));
        }
/*  41 */         registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.EMERALD), BlockRegistry.marketseedPrice));
/*  42 */         registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.EMERALD), BlockRegistry.marketseedPrice));
/*  43 */         registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.EMERALD), BlockRegistry.marketseedPrice));
      }
/*  45 */       if (BlockRegistry.marketcurrencySeeds == 1)
      {
/*  47 */         for (int i = 0; i < 60; i++)
        {
/*  49 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.DIAMOND), BlockRegistry.marketseedPrice));
/*  50 */           registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.DIAMOND), BlockRegistry.marketseedPrice));
/*  51 */           registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.DIAMOND), BlockRegistry.marketseedPrice));
/*  52 */           registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.DIAMOND), BlockRegistry.marketseedPrice));
        }
      }
/*  55 */       if (BlockRegistry.marketcurrencySeeds == 2)
      {
/*  57 */         for (int i = 0; i < 60; i++)
        {
/*  59 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketseedPrice));
/*  60 */           registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketseedPrice));
/*  61 */           registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketseedPrice));
/*  62 */           registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketseedPrice));
        }
      }
/*  65 */       if (BlockRegistry.marketcurrencySeeds == 3)
      {
/*  67 */         for (int i = 0; i < 60; i++)
        {
/*  69 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketseedPrice));
/*  70 */           registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketseedPrice));
/*  71 */           registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketseedPrice));
/*  72 */           registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketseedPrice));
        }
      }
/*  75 */       if (BlockRegistry.marketcurrencySeeds == 4)
      {
/*  77 */         for (int i = 0; i < 60; i++)
        {
/*  79 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketseedPrice));
/*  80 */           registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketseedPrice));
/*  81 */           registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketseedPrice));
/*  82 */           registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketseedPrice));
        }
      }
/*  85 */       if (BlockRegistry.marketcurrencySeeds == 5)
      {
/*  87 */         for (int i = 0; i < 60; i++)
        {
/*  89 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.WHEAT_SEEDS), BlockRegistry.marketseedPrice));
/*  90 */           registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.WHEAT_SEEDS), BlockRegistry.marketseedPrice));
/*  91 */           registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.WHEAT_SEEDS), BlockRegistry.marketseedPrice));
/*  92 */           registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.WHEAT_SEEDS), BlockRegistry.marketseedPrice));
        }
      }
    }
    
/*  97 */     if (BlockRegistry.marketselltemperateSAPLINGs)
    {
/*  99 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 0)
      {
/* 101 */         for (int i = 0; i < 9; i++)
        {
/* 103 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
        }
/* 105 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 106 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 107 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
      }
      
/* 110 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 1)
      {
/* 112 */         for (int i = 0; i < 9; i++)
        {
/* 114 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
        }
/* 116 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 117 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 118 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
      }
/* 120 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 2)
      {
/* 122 */         for (int i = 0; i < 9; i++)
        {
/* 124 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
        }
/* 126 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 127 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 128 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 130 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 3)
      {
/* 132 */         for (int i = 0; i < 9; i++)
        {
/* 134 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
        }
/* 136 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 137 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 138 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
      }
/* 140 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 4)
      {
/* 142 */         for (int i = 0; i < 9; i++)
        {
/* 144 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
        }
/* 146 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 147 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 148 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 150 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 5)
      {
/* 152 */         for (int i = 0; i < 9; i++)
        {
/* 154 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Blocks.SAPLING, 1, 0), BlockRegistry.marketSAPLINGPrice));
        }
/* 156 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Blocks.SAPLING, 1, 0), BlockRegistry.marketSAPLINGPrice));
/* 157 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Blocks.SAPLING, 1, 0), BlockRegistry.marketSAPLINGPrice));
/* 158 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Blocks.SAPLING, 1, 0), BlockRegistry.marketSAPLINGPrice));
      }
/* 160 */       if (BlockRegistry.marketcurrencytemperateSAPLINGs == 6)
      {
/* 162 */         for (int i = 0; i < 9; i++)
        {
/* 164 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSAPLINGs[i], 1), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
        }
/* 166 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
/* 167 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
/* 168 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
      }
    }
    
/* 172 */     if (BlockRegistry.marketselltropicalSAPLINGs)
    {
/* 174 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 0)
      {
/* 176 */         for (int i = 0; i < 24; i++)
        {
/* 178 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
        }
/* 180 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 181 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 182 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 183 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
      }
      
/* 186 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 1)
      {
/* 188 */         for (int i = 0; i < 24; i++)
        {
/* 190 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
        }
/* 192 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 193 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 194 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 195 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
      }
/* 197 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 2)
      {
/* 199 */         for (int i = 0; i < 24; i++)
        {
/* 201 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
        }
/* 203 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 204 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 205 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 206 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 208 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 3)
      {
/* 210 */         for (int i = 0; i < 24; i++)
        {
/* 212 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
        }
/* 214 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 215 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 216 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 217 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
      }
/* 219 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 4)
      {
/* 221 */         for (int i = 0; i < 24; i++)
        {
/* 223 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
        }
/* 225 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 226 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 227 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 228 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 230 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 5)
      {
/* 232 */         for (int i = 0; i < 24; i++)
        {
/* 234 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Blocks.SAPLING, 1, 3), BlockRegistry.marketSAPLINGPrice));
        }
/* 236 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Blocks.SAPLING, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 237 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Blocks.SAPLING, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 238 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Blocks.SAPLING, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 239 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Blocks.SAPLING, 1, 3), BlockRegistry.marketSAPLINGPrice));
      }
/* 241 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 6)
      {
/* 243 */         for (int i = 0; i < 24; i++)
        {
/* 245 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
        }
/* 247 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
/* 248 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
/* 249 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
/* 250 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.APPLE), BlockRegistry.marketSAPLINGPrice));
      }
/* 252 */       if (BlockRegistry.marketcurrencytropicalSAPLINGs == 7)
      {
/* 254 */         for (int i = 0; i < 24; i++)
        {
/* 256 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSAPLINGs[i], 1), new ItemStack(Items.DYE, 1, 3), BlockRegistry.marketSAPLINGPrice));
        }
/* 258 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSAPLING, 1), new ItemStack(Items.DYE, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 259 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSAPLING, 1), new ItemStack(Items.DYE, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 260 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), new ItemStack(Items.DYE, 1, 3), BlockRegistry.marketSAPLINGPrice));
/* 261 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), new ItemStack(Items.DYE, 1, 3), BlockRegistry.marketSAPLINGPrice));
      }
    }
    

/* 266 */     if (BlockRegistry.marketsellconiferousSAPLINGs)
    {
/* 268 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 0)
      {
/* 270 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
/* 271 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Items.EMERALD), BlockRegistry.marketSAPLINGPrice));
      }
/* 273 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 1)
      {
/* 275 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
/* 276 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Items.DIAMOND), BlockRegistry.marketSAPLINGPrice));
      }
/* 278 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 2)
      {
/* 280 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 281 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 283 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 3)
      {
/* 285 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
/* 286 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketSAPLINGPrice));
      }
/* 288 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 4)
      {
/* 290 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
/* 291 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketSAPLINGPrice));
      }
/* 293 */       if (BlockRegistry.marketcurrencyconiferousSAPLINGs == 5)
      {
/* 295 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSAPLING, 1), new ItemStack(Blocks.SAPLING, 1, 1), BlockRegistry.marketSAPLINGPrice));
/* 296 */         registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), new ItemStack(Blocks.SAPLING, 1, 1), BlockRegistry.marketSAPLINGPrice));
      }
    }
    
ItemStack pigegg = new ItemStack(Items.SPAWN_EGG, 1);
ItemMonsterPlacer.applyEntityIdToItemStack(pigegg, EntityList.classToStringMapping.get(EntityPig.class));
ItemStack sheepegg = new ItemStack(Items.SPAWN_EGG, 1);
ItemMonsterPlacer.applyEntityIdToItemStack(sheepegg, EntityList.classToStringMapping.get(EntitySheep.class));
ItemStack cowegg = new ItemStack(Items.SPAWN_EGG, 1);
ItemMonsterPlacer.applyEntityIdToItemStack(cowegg, EntityList.classToStringMapping.get(EntityCow.class));
ItemStack chickenegg = new ItemStack(Items.SPAWN_EGG, 1);
ItemMonsterPlacer.applyEntityIdToItemStack(chickenegg, EntityList.classToStringMapping.get(EntityChicken.class));
ItemStack horseegg = new ItemStack(Items.SPAWN_EGG, 1);
ItemMonsterPlacer.applyEntityIdToItemStack(horseegg, EntityList.classToStringMapping.get(EntityHorse.class));



/* 301 */     if (BlockRegistry.marketsellPig)
    {
/* 303 */       if (BlockRegistry.marketcurrencyPig == 0)
      {
/* 305 */         registerItems(new MarketData(pigegg, new ItemStack(Items.EMERALD), BlockRegistry.marketpigPrice));
      }
/* 307 */       if (BlockRegistry.marketcurrencyPig == 1)
      {
/* 309 */         registerItems(new MarketData(pigegg, new ItemStack(Items.DIAMOND), BlockRegistry.marketpigPrice));
      }
/* 311 */       if (BlockRegistry.marketcurrencyPig == 2)
      {
/* 313 */         registerItems(new MarketData(pigegg, new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketpigPrice));
      }
/* 315 */       if (BlockRegistry.marketcurrencyPig == 3)
      {
/* 317 */         registerItems(new MarketData(pigegg, new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketpigPrice));
      }
/* 319 */       if (BlockRegistry.marketcurrencyPig == 4)
      {
/* 321 */         registerItems(new MarketData(pigegg, new ItemStack(Items.IRON_INGOT), BlockRegistry.marketpigPrice));
      }
/* 323 */       if (BlockRegistry.marketcurrencyPig == 5)
      {
/* 325 */         registerItems(new MarketData(pigegg, new ItemStack(Items.EGG), BlockRegistry.marketpigPrice));
      }
    }
/* 328 */     if (BlockRegistry.marketsellSheep)
    {
/* 330 */       if (BlockRegistry.marketcurrencySheep == 0)
      {
/* 332 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.EMERALD), BlockRegistry.marketsheepPrice));
      }
/* 334 */       if (BlockRegistry.marketcurrencySheep == 1)
      {
/* 336 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.DIAMOND), BlockRegistry.marketsheepPrice));
      }
/* 338 */       if (BlockRegistry.marketcurrencySheep == 2)
      {
/* 340 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketsheepPrice));
      }
/* 342 */       if (BlockRegistry.marketcurrencySheep == 3)
      {
/* 344 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketsheepPrice));
      }
/* 346 */       if (BlockRegistry.marketcurrencySheep == 4)
      {
/* 348 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.IRON_INGOT), BlockRegistry.marketsheepPrice));
      }
/* 350 */       if (BlockRegistry.marketcurrencySheep == 5)
      {
/* 352 */         registerItems(new MarketData(sheepegg, new ItemStack(Items.EGG), BlockRegistry.marketsheepPrice));
      }
    }
/* 355 */     if (BlockRegistry.marketsellCow)
    {
/* 357 */       if (BlockRegistry.marketcurrencyCow == 0)
      {
/* 359 */         registerItems(new MarketData(cowegg, new ItemStack(Items.EMERALD), BlockRegistry.marketcowPrice));
      }
/* 361 */       if (BlockRegistry.marketcurrencyCow == 1)
      {
/* 363 */         registerItems(new MarketData(cowegg, new ItemStack(Items.DIAMOND), BlockRegistry.marketcowPrice));
      }
/* 365 */       if (BlockRegistry.marketcurrencyCow == 2)
      {
/* 367 */         registerItems(new MarketData(cowegg, new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketcowPrice));
      }
/* 369 */       if (BlockRegistry.marketcurrencyCow == 3)
      {
/* 371 */         registerItems(new MarketData(cowegg, new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketcowPrice));
      }
/* 373 */       if (BlockRegistry.marketcurrencyCow == 4)
      {
/* 375 */         registerItems(new MarketData(cowegg, new ItemStack(Items.IRON_INGOT), BlockRegistry.marketcowPrice));
      }
/* 377 */       if (BlockRegistry.marketcurrencyCow == 5)
      {
/* 379 */         registerItems(new MarketData(cowegg, new ItemStack(Items.EGG), BlockRegistry.marketcowPrice));
      }
    }
/* 382 */     if (BlockRegistry.marketsellChicken)
    {
/* 384 */       if (BlockRegistry.marketcurrencyChicken == 0)
      {
/* 386 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.EMERALD), BlockRegistry.marketchickenPrice));
      }
/* 388 */       if (BlockRegistry.marketcurrencyChicken == 1)
      {
/* 390 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.DIAMOND), BlockRegistry.marketchickenPrice));
      }
/* 392 */       if (BlockRegistry.marketcurrencyChicken == 2)
      {
/* 394 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketchickenPrice));
      }
/* 396 */       if (BlockRegistry.marketcurrencyChicken == 3)
      {
/* 398 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketchickenPrice));
      }
/* 400 */       if (BlockRegistry.marketcurrencyChicken == 4)
      {
/* 402 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.IRON_INGOT), BlockRegistry.marketchickenPrice));
      }
/* 404 */       if (BlockRegistry.marketcurrencyChicken == 5)
      {
/* 406 */         registerItems(new MarketData(chickenegg, new ItemStack(Items.EGG), BlockRegistry.marketchickenPrice));
      }
    }
/* 409 */     if (BlockRegistry.marketsellHorse)
    {
/* 411 */       if (BlockRegistry.marketcurrencyHorse == 0)
      {
/* 413 */         registerItems(new MarketData(horseegg, new ItemStack(Items.EMERALD), BlockRegistry.markethorsePrice));
      }
/* 415 */       if (BlockRegistry.marketcurrencyHorse == 1)
      {
/* 417 */         registerItems(new MarketData(horseegg, new ItemStack(Items.DIAMOND), BlockRegistry.markethorsePrice));
      }
/* 419 */       if (BlockRegistry.marketcurrencyHorse == 2)
      {
/* 421 */         registerItems(new MarketData(horseegg, new ItemStack(Items.GOLD_INGOT), BlockRegistry.markethorsePrice));
      }
/* 423 */       if (BlockRegistry.marketcurrencyHorse == 3)
      {
/* 425 */         registerItems(new MarketData(horseegg, new ItemStack(Items.GOLD_NUGGET), BlockRegistry.markethorsePrice));
      }
/* 427 */       if (BlockRegistry.marketcurrencyHorse == 4)
      {
/* 429 */         registerItems(new MarketData(horseegg, new ItemStack(Items.IRON_INGOT), BlockRegistry.markethorsePrice));
      }
/* 431 */       if (BlockRegistry.marketcurrencyHorse == 5)
      {
/* 433 */         registerItems(new MarketData(horseegg, new ItemStack(Items.EGG), BlockRegistry.markethorsePrice));
      }
    }
    
/* 437 */     if (BlockRegistry.marketsellBonemeal)
    {
/* 439 */       if (BlockRegistry.marketcurrencyBonemeal == 0)
      {
/* 441 */         registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.EMERALD), BlockRegistry.marketbonemealPrice));
      }
/* 443 */       if (BlockRegistry.marketcurrencyBonemeal == 1)
      {
/* 445 */         registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.DIAMOND), BlockRegistry.marketbonemealPrice));
      }
/* 447 */       if (BlockRegistry.marketcurrencyBonemeal == 2)
      {
/* 449 */         registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.GOLD_INGOT), BlockRegistry.marketbonemealPrice));
      }
	if (BlockRegistry.marketcurrencyBonemeal == 3)
      {
	registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.GOLD_NUGGET), BlockRegistry.marketbonemealPrice));
      }
	if (BlockRegistry.marketcurrencyBonemeal == 4)
      {
	registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.IRON_INGOT), BlockRegistry.marketbonemealPrice));
      }
    }
  }
}
