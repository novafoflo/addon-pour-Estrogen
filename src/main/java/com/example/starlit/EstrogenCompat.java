package com.example.starlit;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

import java.util.Optional;

/** Cherche l'effet Girl Power du mod Estrogen par son identifiant. */
public final class EstrogenCompat {
    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath("estrogen", "estrogen");

    private EstrogenCompat() {}

    public static Holder<MobEffect> effect() {
        Optional<Holder.Reference<MobEffect>> o = BuiltInRegistries.MOB_EFFECT.getHolder(ID);
        return o.isPresent() ? o.get() : null;
    }
}
