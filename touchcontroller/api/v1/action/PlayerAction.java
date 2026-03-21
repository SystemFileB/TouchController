package top.fifthlight.touchcontroller.api.v1.action;

@FunctionalInterface
public interface PlayerAction {
    /**
     * Execute this action on a player.
     *
     * @param player <code>LocalPlayer</code>(Mojmap) / <code>ClientPlayerEntity(Yarn)</code> instance
     */
    void action(Object player);
}
