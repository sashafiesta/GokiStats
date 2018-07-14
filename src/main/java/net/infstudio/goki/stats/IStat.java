package net.infstudio.goki.stats;

import net.minecraft.entity.player.EntityPlayer;

public interface IStat {
    boolean needAffectedByStat(Object... obj);

    float[] getAppliedDescriptionVar(EntityPlayer player);

    float getBonus(EntityPlayer player);

//	abstract float getBonus(int paramInt);

    float getAppliedBonus(EntityPlayer player, Object paramObject);

    int getCost(int level);

    int getLimit();

//	public String getSimpleDescriptionString();
}