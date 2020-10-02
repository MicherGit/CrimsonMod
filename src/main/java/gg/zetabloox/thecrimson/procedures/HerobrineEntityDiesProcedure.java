package gg.zetabloox.thecrimson.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import gg.zetabloox.thecrimson.InfinitepowerModElements;

@InfinitepowerModElements.ModElement.Tag
public class HerobrineEntityDiesProcedure extends InfinitepowerModElements.ModElement {
	public HerobrineEntityDiesProcedure(InfinitepowerModElements instance) {
		super(instance, 147);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HerobrineEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon lightning_bolt ~ ~ ~");
			}
		}
	}
}
