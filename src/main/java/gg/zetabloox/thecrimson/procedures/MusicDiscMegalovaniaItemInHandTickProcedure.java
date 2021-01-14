package gg.zetabloox.thecrimson.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import gg.zetabloox.thecrimson.InfinitepowerupdModElements;
import gg.zetabloox.thecrimson.InfinitepowerupdMod;

@InfinitepowerupdModElements.ModElement.Tag
public class MusicDiscMegalovaniaItemInHandTickProcedure extends InfinitepowerupdModElements.ModElement {
	public MusicDiscMegalovaniaItemInHandTickProcedure(InfinitepowerupdModElements instance) {
		super(instance, 150);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				InfinitepowerupdMod.LOGGER.warn("Failed to load dependency entity for procedure MusicDiscMegalovaniaItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/playsound infinitepower:megalovania ambient @p ~ ~ ~ 0.05");
			}
		}
	}
}
