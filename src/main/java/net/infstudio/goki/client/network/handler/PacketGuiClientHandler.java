package net.infstudio.goki.client.network.handler;

import net.infstudio.goki.client.gui.GuiStats;
import net.infstudio.goki.common.network.message.S2COpenGui;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PacketGuiClientHandler implements IMessageHandler<S2COpenGui, IMessage> {
    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(S2COpenGui message, MessageContext ctx) {
        Minecraft.getMinecraft().addScheduledTask(() ->
                Minecraft.getMinecraft().displayGuiScreen(new GuiStats(Minecraft.getMinecraft().player)));
        return null;
    }
}
