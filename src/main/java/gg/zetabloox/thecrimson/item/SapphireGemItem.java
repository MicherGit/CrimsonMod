
package gg.zetabloox.thecrimson.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import gg.zetabloox.thecrimson.itemgroup.CrimsontaleItemGroup;
import gg.zetabloox.thecrimson.InfinitepowerupdModElements;

@InfinitepowerupdModElements.ModElement.Tag
public class SapphireGemItem extends InfinitepowerupdModElements.ModElement {
	@ObjectHolder("infinitepowerupd:sapphire_gem")
	public static final Item block = null;
	public SapphireGemItem(InfinitepowerupdModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CrimsontaleItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sapphire_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
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
