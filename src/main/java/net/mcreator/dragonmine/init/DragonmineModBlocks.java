/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonmine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.dragonmine.block.BebekBlock;
import net.mcreator.dragonmine.DragonmineMod;

import java.util.function.Function;

public class DragonmineModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DragonmineMod.MODID);
	public static final DeferredBlock<Block> BEBEK = register("bebek", BebekBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}