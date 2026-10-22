package com.example.starlit;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(value = StarlitMod.MODID, dist = Dist.CLIENT)
public class StarlitMod {
    public static final String MODID = "starlit_outfit";

    public StarlitMod(ModContainer container) {
        container.registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
    }
}
