package lol.richy.threatengl.mixin;

import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "com.mojang.blaze3d.platform.Window")
public class ThreatenGLMixin {

    @Inject(
        method = "<init>(Lcom/mojang/blaze3d/platform/WindowEventHandler;Lcom/mojang/blaze3d/platform/ScreenManager;Lcom/mojang/blaze3d/platform/DisplayData;Ljava/lang/String;Ljava/lang/String;)V",
        at = @At(
            value = "INVOKE",
            target = "Lorg/lwjgl/glfw/GLFW;glfwCreateWindow(IILjava/lang/CharSequence;JJ)J",
            shift = At.Shift.BEFORE
        )
    )
    private static void threatenGl_beforeCreate(CallbackInfo ci) {
        System.out.println("[ThreatenGL] Injecting GL hints right before glfwCreateWindow.");

        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_FORWARD_COMPAT, GLFW.GLFW_TRUE);
        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_DEBUG_CONTEXT, GLFW.GLFW_TRUE);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 4);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 6);
    }
}