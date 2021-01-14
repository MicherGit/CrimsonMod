
package gg.zetabloox.thecrimson.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import gg.zetabloox.thecrimson.itemgroup.CrimsontaleItemGroup;
import gg.zetabloox.thecrimson.InfinitepowerupdModElements;

@InfinitepowerupdModElements.ModElement.Tag
public class VoidblockBlock extends InfinitepowerupdModElements.ModElement {
	@ObjectHolder("infinitepowerupd:voidblock")
	public static final Block block = null;
	public VoidblockBlock(InfinitepowerupdModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CrimsontaleItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(50f, 10f).setLightLevel(s -> 0));
			setRegistryName("voidblock");
		}

		@Override
		public boolean isReplaceable(BlockState state, BlockItemUseContext context) {
			return context.getItem().getItem() != this.asItem();
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
