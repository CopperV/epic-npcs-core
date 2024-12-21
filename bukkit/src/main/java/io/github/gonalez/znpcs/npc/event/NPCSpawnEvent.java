package io.github.gonalez.znpcs.npc.event;

import io.github.gonalez.znpcs.npc.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NPCSpawnEvent extends Event implements Cancellable {
   private final Player player;
   private final NPC npc;
   private boolean show;
   private boolean cancelled;
   private static final HandlerList handlerList = new HandlerList();

   public NPCSpawnEvent(Player player, NPC npc, boolean show) {
      this.player = player;
      this.npc = npc;
      this.show = show;
      this.cancelled = false;
   }

   public NPCSpawnEvent(Player player, NPC npc, boolean show, boolean async) {
      super(async);
      this.player = player;
      this.npc = npc;
      this.show = show;
      this.cancelled = false;
   }

   public boolean isShow() {
      return this.show;
   }

   public void setShow(boolean show) {
      this.show = show;
   }

   public Player getPlayer() {
      return this.player;
   }

   public NPC getNpc() {
      return this.npc;
   }

   public boolean isCancelled() {
      return this.cancelled;
   }

   public void setCancelled(boolean cancel) {
      this.cancelled = cancel;
   }

   public HandlerList getHandlers() {
      return handlerList;
   }

   public static HandlerList getHandlerList() {
      return handlerList;
   }
}