# ThreatenGL — Unofficial 1.21.11 Update
*A fork of the original ThreatenGL by Richy-Z*

This is an **unofficial update** of ThreatenGL, updated for:

- **Minecraft 1.21.11**
- **Fabric Loader 0.18+**
- **Java 21**
- **OpenGL 4.6 Core Profile**

The original mod was created by **Richy Z.**  
This fork is maintained independently by **hirohirosoft0**.

---

## What is ThreatenGL?

ThreatenGL forces Minecraft to request **OpenGL 4.6** instead of the legacy 3.2 context.

Some GPU drivers behave differently depending on the OpenGL version, and users have reported smoother performance on modern hardware.

This fork updates the Mixin targets and window creation logic so the mod works correctly on the latest Fabric + Java 21 environment.

---

## What’s new in this fork?

### ✔ Updated for Minecraft 1.21.11
- Updated Mixin targets for the new Window class  
- Adjusted GLFW hint injection timing  
- Ensured compatibility with Java 21  
- Tested on modern GPUs (RTX / RDNA / Arc)

### ✔ Fabric API not required
Only Fabric Loader + Mixin is needed.

### ✔ OpenGL 4.6 Core Profile
Minecraft will request:

```
OpenGL Version: 4.6
Profile: Core
```

macOS does not support OpenGL 4.6 and will automatically fall back to **4.1**.

---

## Installation

1. Install **Fabric Loader 0.18+**  
2. Use **Java 21**  
3. Place the mod JAR into your `mods` folder  

Done.

---

## Compatibility Notes

This mod modifies the GLFW window creation process.  
It may conflict with mods that:

- Replace the loading screen  
- Modify the initial window  
- Inject into the same Mixin targets  

### Known incompatible mods

| Mod | Compatible? | Notes |
|-----|-------------|-------|
| Early Loading Screen | ❌ | Conflicts with window creation |

---

## Hardware Requirements

Your GPU must support **OpenGL 4.6**.

Generally supported:

- NVIDIA (Kepler+, 2012+)  
- AMD (GCN+, 2012+)  
- Intel (6th gen Core+)  
- Any GPU with active driver support  

macOS will always fall back to **OpenGL 4.1**.

---

## Notes

ThreatenGL is experimental.  
Performance improvements vary depending on hardware and drivers.

If reporting issues, please include:

- Logs  
- GPU model  
- Minecraft version  
- Installed mods  

---

## Credits

**Original Project:**  
ThreatenGL by Richy-Z  
https://github.com/Richy-Z/ThreatenGL

**Unofficial Maintainer:**  
hirohirosoft0  
https://github.com/hirohirosoft0/ThreatenGL

**License:** MIT License (same as original)
