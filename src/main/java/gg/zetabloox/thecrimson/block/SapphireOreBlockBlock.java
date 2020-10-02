
package gg.zetabloox.thecrimson.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import gg.zetabloox.thecrimson.itemgroup.CrimsontaleItemGroup;
import gg.zetabloox.thecrimson.InfinitepowerModElements;

@InfinitepowerModElements.ModElement.Tag
public class SapphireOreBlockBlock extends InfinitepowerModElements.ModElement {
	@ObjectHolder("infinitepower:sapphire_ore_block")
	public static final Block block = null;
	public SapphireOreBlockBlock(InfinitepowerModElements instance) {
		super(instance, 99);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CrimsontaleItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(10)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("sapphire_ore_block");
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
