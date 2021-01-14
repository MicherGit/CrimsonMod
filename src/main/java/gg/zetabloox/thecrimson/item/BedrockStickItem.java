
package gg.zetabloox.thecrimson.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import gg.zetabloox.thecrimson.InfinitepowerupdModElements;

@InfinitepowerupdModElements.ModElement.Tag
public class BedrockStickItem extends InfinitepowerupdModElements.ModElement {
	@ObjectHolder("infinitepowerupd:bedrock_stick")
	public static final Item block = null;
	public BedrockStickItem(InfinitepowerupdModElements instance) {
		super(instance, 149);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bedrock_stick");
		}

		@Override
		public int getItemEnchantability() {
			return 1;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
