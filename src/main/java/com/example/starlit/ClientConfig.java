package com.example.starlit;

import net.neoforged.neoforge.common.ModConfigSpec;

/** Reglages: config/starlit_outfit-client.toml */
public class ClientConfig {
    private static final ModConfigSpec.Builder B = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<String> HAIR_COLOR = B
            .comment("Couleur des cheveux, en hexadecimal (ex: #B79CED).")
            .define("hairColor", "#B79CED");
    public static final ModConfigSpec.ConfigValue<String> JACKET_COLOR = B
            .comment("Couleur de la veste et des manches.")
            .define("jacketColor", "#9FD3F5");
    public static final ModConfigSpec.ConfigValue<String> SKIRT_COLOR = B
            .comment("Couleur de la jupe.")
            .define("skirtColor", "#2C2F5A");

    public static final ModConfigSpec.BooleanValue SHOW_HAIR = B.define("showHair", true);
    public static final ModConfigSpec.BooleanValue SHOW_JACKET = B.define("showJacket", true);
    public static final ModConfigSpec.BooleanValue SHOW_SKIRT = B.define("showSkirt", true);
    public static final ModConfigSpec.BooleanValue HIDE_UNDER_ARMOR = B
            .comment("Cacher cheveux/veste/jupe quand un casque/plastron/pantalon est equipe.")
            .define("hideUnderArmor", true);

    public static final ModConfigSpec.BooleanValue EXTRA_BUST = B
            .comment("Ajoute une poitrine supplementaire a taille reglable et avec physique.",
                     "Laisse a false si tu veux seulement celle d'Estrogen (sinon il y en a deux).")
            .define("extraBust", false);
    public static final ModConfigSpec.DoubleValue BUST_SCALE = B
            .comment("Taille de la poitrine supplementaire (0.5 a 3.0). Page Haut / Page Bas en jeu.")
            .defineInRange("bustScale", 1.3, 0.5, 3.0);
    public static final ModConfigSpec.BooleanValue PHYSICS = B.define("physics", true);
    public static final ModConfigSpec.DoubleValue PHYSICS_STRENGTH = B
            .defineInRange("physicsStrength", 1.0, 0.0, 3.0);

    public static final ModConfigSpec SPEC = B.build();

    /** Couleur ARGB depuis un texte hexadecimal; blanc si invalide. */
    public static int rgb(String s) {
        try {
            String h = s.startsWith("#") ? s.substring(1) : s;
            return 0xFF000000 | Integer.parseInt(h.trim(), 16);
        } catch (Exception e) {
            return 0xFFFFFFFF;
        }
    }
}
