package me.fzzyhmstrs.attributes_core.Attributes;

import me.fzzyhmstrs.attributes_core.AC;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreAttributes {

    public static final EntityAttribute OXYGEN_TIME = make("oxygen_time", 300.0, 0.0, 32767.0);
    public static final EntityAttribute EXHAUSTION_RESISTANCE = make("exhaustion_resistance", 0.0, -256.0, 256.0);
    public static final EntityAttribute JUMP_STRENGTH = make("jump_strength", 0.0, -256.0, 256.0);
    public static final EntityAttribute PROJECTILE_GRAVITY = make("projectile_gravity", 0.0, -10.0, 10.0);
    public static final EntityAttribute PROJECTILE_AIR_RESISTANCE = make("projectile_air_resistance", 0.0, -10.0, 10.0);
    public static final EntityAttribute PROJECTILE_SPEED = make("projectile_speed", 0.0, 0.0, 16.0);
    public static final EntityAttribute MAGIC_RESISTANCE = make("magic_resistance", 0.0, 0.0, 1.0);

    private static EntityAttribute make(final String name, final double base, final double min, final double max) {
        return new ClampedEntityAttribute("attribute.name.generic." + AC.MOD_ID + '.' + name, base, min, max).setTracked(true);
    }

    public static void registerAll(){
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"oxygen_time"),OXYGEN_TIME);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"exhaustion_resistance"),EXHAUSTION_RESISTANCE);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"jump_strength"),JUMP_STRENGTH);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"projectile_gravity"),PROJECTILE_GRAVITY);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"projectile_air_resistance"),PROJECTILE_AIR_RESISTANCE);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"projectile_speed"),PROJECTILE_SPEED);
        Registry.register(Registry.ATTRIBUTE,new Identifier(AC.MOD_ID,"magic_resistance"),MAGIC_RESISTANCE);
    }

}
