
package gg.zetabloox.thecrimson.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import gg.zetabloox.thecrimson.InfinitepowerModElements;

@InfinitepowerModElements.ModElement.Tag
public class QuartzAxeItem extends InfinitepowerModElements.ModElement {
	@ObjectHolder("infinitepower:quartz_axe")
	public static final Item block = null;
	public QuartzAxeItem(InfinitepowerModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("quartz_axe"));
	}
}
