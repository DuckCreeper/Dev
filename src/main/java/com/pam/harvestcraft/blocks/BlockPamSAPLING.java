package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.worldgen.FruitTreeGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeGen;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPamSAPLING extends BlockBush implements IGrowable {

    public String name;
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);


    public BlockPamSAPLING(String name) {
        super();
        BlockRegistry.registerBlock(name, this);
        this.setSoundType(SoundType.PLANT);
        this.setHardness(0.0F);
        this.setCreativeTab(HarvestCraft.modTab);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        Block soilBlock = world.getBlockState(pos.down()).getBlock();

        return this.isSuitableSoilBlock(soilBlock);
    }

    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
        this.validatePosition(world, pos, state);
    }

    public void validatePosition(World world, BlockPos pos, IBlockState state) {
        if (!this.canPlaceBlockAt(world, pos)) {
            this.dropBlockAsItem(world, pos, state, 0);

            world.setBlockToAir(pos);
        }
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean isSuitableSoilBlock(Block soilBlock) {
        return soilBlock == Blocks.GRASS || soilBlock == Blocks.DIRT || soilBlock == Blocks.FARMLAND;
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        this.generateTree(worldIn, pos, state, rand);
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (this == BlockRegistry.pamappleSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamApple.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamavocadoSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamAvocado.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamcherrySAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamCherry.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamchestnutSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamChestnut.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamnutmegSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamNutmeg.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampearSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPear.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamplumSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPlum.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamwalnutSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamWalnut.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamgooseberrySAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamGooseberry.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }

        if (this == BlockRegistry.pamalmondSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamAlmond.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamapricotSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamApricot.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pambananaSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamBanana.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamcashewSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamCashew.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamcoconutSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamCoconut.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamdateSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamDate.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamdragonfruitSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamDragonfruit.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamdurianSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamDurian.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamfigSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamFig.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamgrapefruitSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamGrapefruit.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamlemonSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamLemon.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamlimeSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamLime.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pammangoSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamMango.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamoliveSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamOlive.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamorangeSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamOrange.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampapayaSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPapaya.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampeachSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPeach.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampecanSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPecan.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampeppercornSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPeppercorn.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampersimmonSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPersimmon.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampistachioSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPistachio.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampomegranateSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPomegranate.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamstarfruitSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamStarfruit.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamvanillabeanSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamVanillabean.getDefaultState();
            if (!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pamcinnamonSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamCinnamon.getDefaultState();
            if (!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pammapleSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamMaple.getDefaultState();
            if (!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
        if (this == BlockRegistry.pampaperbarkSAPLING) {
            if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
                return;
            }
            worldIn.setBlockToAir(pos);
            final IBlockState a = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
            final IBlockState b = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
            final IBlockState c = BlockRegistry.pamPaperbark.getDefaultState();
            if (!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos)) {
                worldIn.setBlockState(pos, state); //Re-add the SAPLING if the tree failed to grow
            }
        }
    }


    /**
     * Whether this IGrowable can grow
     */
    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }


}