package net.tofikarz.toffiumforge.procedures;

import net.tofikarz.toffiumforge.ToffiumforgeModElements;
import net.tofikarz.toffiumforge.ToffiumforgeMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ToffiumforgeModElements.ModElement.Tag
public class FioletowejablkoFoodEatenProcedure extends ToffiumforgeModElements.ModElement {
	public FioletowejablkoFoodEatenProcedure(ToffiumforgeModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ToffiumforgeMod.LOGGER.warn("Failed to load dependency entity for procedure FioletowejablkoFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 240, (int) 2, (false), (true)));
	}
}
