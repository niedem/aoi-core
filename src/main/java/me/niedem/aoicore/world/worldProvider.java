package me.niedem.aoicore.world;

/**
 * Created by Niels on 05/08/2017.
 */
public abstract class worldProvider extends net.minecraft.world.WorldProvider{

    @Override
    public float calculateCelestialAngle(long worldTime, float partialTicks) {
        int i = (int)(worldTime % 180000L);
        float f = ((float)i + partialTicks) / 180000.0F - 0.25F;

        if (f < 0.0F)
        {
            ++f;
        }

        if (f > 1.0F)
        {
            --f;
        }

        float f1 = 1.0F - (float)((Math.cos((double)f * Math.PI) + 1.0D) / 2.0D);
        f = f + (f1 - f) / 3.0F;
        return f;
    }
}
