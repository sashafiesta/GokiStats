package net.infstudio.goki.api.stat;

import net.infstudio.goki.common.config.stats.StatConfig;
import net.infstudio.goki.common.utils.DataHelper;
import net.minecraft.entity.player.EntityPlayer;

public abstract class StatSpecialBase extends StatBase<StatConfig> implements StatSpecial {
    public StatSpecialBase(int id, String key, int limit) {
        super(id, key, limit);
    }

    @Override
    public final float getSecondaryBonus(EntityPlayer player) {
        return getSecondaryBonus(DataHelper.getPlayerStatLevel(player, this));
    }
}
