package com.craftersmc.mods.healthalerts.mixin;

import com.craftersmc.mods.healthalerts.HealthAlertsMod;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class HealthAlertsMixin {
	@Inject(at = @At("TAIL"), method = "applyDamage")
	private void afterApplyDamage(CallbackInfo info) {
		HealthAlertsMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
