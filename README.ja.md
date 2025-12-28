# 🚀 ThreatenGL — 非公式 1.21.11 対応版  
*Original: ThreatenGL by Richy-Z / Unofficial Fork by hirohirosoft0*

このリポジトリは、ThreatenGL を **Minecraft 1.21.11 / Fabric Loader 0.18+ / Java 21** に対応させた **非公式フォーク** です。

---

## 🤔 ThreatenGL とは？

ThreatenGL は、Minecraft が使用する OpenGL バージョンを **3.2 → 4.6 に強制的に変更する実験的な Mod** です。

GPU ドライバによっては、OpenGL のバージョンが変わることで  
パフォーマンスが改善する場合があります。

このフォークでは、最新の Fabric + Java 21 環境で動作するように  
Mixin のターゲットやウィンドウ生成処理を更新しています。

> Minecraft: 「やめて…それだけは…！」  
>  
> ThreatenGL: 「OpenGL 4.6 を使え。さもなくば…」

---

## 🛠 このフォークでの変更点

### ✔ Minecraft 1.21.11 に対応
- 新しい Window クラスに合わせて Mixin を更新  
- GLFW ヒントの注入タイミングを調整  
- Java 21 での動作を確認  
- RTX / RDNA / Arc など最新 GPU で動作確認済み  

### ✔ Fabric API は不要
必要なのは **Fabric Loader + Mixin** のみです。

### ✔ OpenGL 4.6 Core Profile を要求
対応 GPU では Minecraft が次の設定で起動します：

```
OpenGL Version: 4.6
Profile: Core
```

macOS は OpenGL 4.6 をサポートしていないため、  
**自動的に 4.1 にフォールバック**します。

---

## 📥 インストール方法

1. **Fabric Loader 0.18+** をインストール  
2. **Java 21** を使用  
3. ダウンロードした JAR を `mods` フォルダに入れるだけ

---

## ⚠ 互換性について

この Mod は **GLFW のウィンドウ生成処理を変更**します。  
そのため、以下のような Mod と競合する可能性があります：

- ローディング画面を置き換える Mod  
- ウィンドウ生成処理を変更する Mod  
- 同じ Mixin ターゲットを使用する Mod  

### 既知の非互換 Mod

| Mod | 対応状況 | 備考 |
|-----|----------|------|
| Early Loading Screen | ❌ | ウィンドウ生成処理が競合 |

---

## 🔒 ハードウェア要件

OpenGL 4.6 に対応していない GPU では、この Mod は効果を発揮しません。

一般的に対応している GPU：

- NVIDIA: Kepler 世代以降（2012+）  
- AMD: GCN 世代以降（2012+）  
- Intel: 第 6 世代 Core 以降  
- 現在もドライバ更新が提供されている GPU  

macOS は OpenGL 4.6 をサポートしていません。  
要求しても **4.1 に自動ダウングレード**されます。

---

## 📝 注意事項

ThreatenGL は実験的な Mod です。  
環境によってはパフォーマンスが改善する場合がありますが、  
すべての環境で効果があるとは限りません。

不具合報告の際は以下を添えてください：

- 最新のログ  
- GPU モデル名  
- Minecraft バージョン  
- 使用中の Mod 一覧  

---

## 🧩 ソースコード & クレジット

### オリジナル  
**ThreatenGL by Richy-Z**  
https://github.com/Richy-Z/ThreatenGL

### 非公式フォーク  
**hirohirosoft0**  
https://github.com/hirohirosoft0/ThreatenGL

### ライセンス  
オリジナルと同じ **MIT License** を継承しています。

---

## ❤️ Special Thanks

このフォークは、オリジナル作者とコミュニティの貢献によって成り立っています。  
OpenGL 4.6 での Minecraft をぜひ楽しんでください！
