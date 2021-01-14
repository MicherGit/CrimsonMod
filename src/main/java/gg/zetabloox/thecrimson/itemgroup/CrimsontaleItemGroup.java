
package gg.zetabloox.thecrimson.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import gg.zetabloox.thecrimson.item.CrimsonGemItem;
import gg.zetabloox.thecrimson.InfinitepowerupdModElements;

@InfinitepowerupdModElements.ModElement.Tag
public class CrimsontaleItemGroup extends InfinitepowerupdModElements.ModElement {
	public CrimsontaleItemGroup(InfinitepowerupdModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcrimsontale") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrimsonGemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
