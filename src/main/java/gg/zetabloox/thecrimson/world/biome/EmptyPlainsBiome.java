
package gg.zetabloox.thecrimson.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import gg.zetabloox.thecrimson.block.VoidblockBlock;
import gg.zetabloox.thecrimson.InfinitepowerModElements;

import com.google.common.collect.ImmutableList;

@InfinitepowerModElements.ModElement.Tag
public class EmptyPlainsBiome extends InfinitepowerModElements.ModElement {
	@ObjectHolder("infinitepower:empty_plains")
	public static final CustomBiome biome = null;
	public EmptyPlainsBiome(InfinitepowerModElements instance) {
		super(instance, 145);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.1f).depth(0.1f).scale(1f).temperature(2f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.PLAINS).waterColor(-16777216).waterFogColor(-16777216)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(VoidblockBlock.block.getDefaultState(),
							VoidblockBlock.block.getDefaultState(), VoidblockBlock.block.getDefaultState())));
			setRegistryName("empty_plains");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			DefaultBiomeFeatures.addLakes(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_SELECTOR
							.withConfiguration(new MultipleRandomFeatureConfig(
									ImmutableList.of(Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).withChance(0.2F),
											Feature.FANCY_TREE.withConfiguration(DefaultBiomeFeatures.field_230131_m_).withChance(0.1F)),
									Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230132_o_)))
							.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(double posX, double posZ) {
			return -16777216;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor() {
			return -16777216;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -16777216;
		}
	}
}
