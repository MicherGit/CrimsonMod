
package gg.zetabloox.thecrimson.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import gg.zetabloox.thecrimson.InfinitepowerModElements;

@InfinitepowerModElements.ModElement.Tag
public class VoidShadowHoeItem extends InfinitepowerModElements.ModElement {
	@ObjectHolder("infinitepower:void_shadow_hoe")
	public static final Item block = null;
	public VoidShadowHoeItem(InfinitepowerModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("void_shadow_hoe"));
	}
}
