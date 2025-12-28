日本語版 README は [README.ja.md](README.ja.md) をご覧ください。
# 🚀 ThreatenGL — Unofficial 1.21.11 Update
*A fork of the original ThreatenGL by Richy-Z*

This is an **unofficial update** of ThreatenGL, bringing full support for:

- **Minecraft 1.21.11**
- **Fabric Loader 0.18+**
- **Java 21**
- **OpenGL 4.6 Core Profile**

The original mod was created by **Richy Z.**  
This fork is maintained independently by **hirohirosoft0**.

---

## 🤔 What is ThreatenGL?

ThreatenGL is a lightweight experiment that **forces Minecraft to use OpenGL 4.6** instead of the legacy 3.2 context.

This fork updates the internal Mixin targets and window creation logic so that the mod works correctly on the latest Fabric + Java 21 environment.

> Minecraft: “please… anything but that!”  
>  
> ThreatenGL: “OpenGL 4.6, or else.”

---

## 🛠 What’s new in this fork?

### ✔ Updated for Minecraft 1.21.11
- Updated Mixin targets for the new Window class
- Adjusted GLFW hint injection timing
- Ensured compatibility with Java 21
- Verified behavior on modern GPUs (RTX / RDNA / Arc)

### ✔ Fabric API is **not required**
This mod only uses Fabric Loader + Mixin.  
No additional dependencies are needed.

### ✔ OpenGL 4.6 Core Profile
On supported hardware, Minecraft will now request:

```
OpenGL Version: 4.6
Profile: Core
```

macOS will fall back to **4.1**, due to Apple’s OpenGL deprecation.

---

## 📥 Installation

1. Install **Fabric Loader 0.18+**
2. Use **Java 21**
3. Drop the mod JAR into your `mods` folder

That’s it.

---

## ⚠ Compatibility Notes

This mod modifies the GLFW window creation process.  
It may conflict with mods that:

- Replace the loading screen  
- Modify the initial window  
- Inject into the same Mixin targets  

### Known incompatible mods

| Mod | Compatible? | Notes |
|-----|-------------|-------|
| Early Loading Screen | ❌ | Both modify the initial window creation |

---

## 🔒 Hardware Requirements

This mod will **not** work if your GPU does not support OpenGL 4.6.

Generally supported:

- NVIDIA GPUs (Kepler and newer, 2012+)
- AMD GPUs (GCN and newer, 2012+)
- Intel GPUs (6th gen Core and newer)
- Any GPU that still receives driver updates

macOS does not support OpenGL 4.6.  
Even though this mod requests OpenGL 4.6, macOS will automatically fall back to 4.1 due to system limitations.

---

## 📝 Notes

ThreatenGL is experimental.  
While many users report smoother performance, results vary depending on hardware and drivers.

If you encounter issues, please include:

- Your logs  
- GPU model  
- Minecraft version  
- Other installed mods  

---

## 🧩 Source Code & Credits

### Original Project  
**ThreatenGL by Richy Z.**  
https://github.com/Richy-Z/ThreatenGL

### Unofficial Maintainer  
**hirohirosoft0**  
https://github.com/hirohirosoft0/ThreatenGL

### License  
This fork continues to use the **MIT License**, as in the original project.

---

## ❤️ Thank You

This fork exists thanks to the amazing work of the original author and the community.  
Enjoy experimenting with OpenGL 4.6 in Minecraft!
