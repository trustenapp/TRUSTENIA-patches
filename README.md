<div align="center">

# 🔺 TRUSTENIA Δ Patches

**Next-Gen Open-Source Android Patches für YouTube & YouTube Music**  
*Universal SABR Readahead Buffer Fix · Custom Glass UI · Adaptive Branding*

[![Release](https://shields.io)](https://github.com)
[![License](https://shields.io)](LICENSE)
[![Platform](https://shields.io)](https://github.com)
[![Build](https://shields.io)](https://github.com/actions)

📦 **[v2.3.0-trustenia](https://github.com)** · ⚖️ **[GPL-3.0](LICENSE)** · 🤖 **Android (arm64-v8a)**

![Release](https://shields.io/Release-v2.3.0-gold?style=for-the-badge) ![License](https://shields.io/License-GPL--3.0-blue?style=for-the-badge) ![Android](https://shields.io/Android-arm64--v8a-3DDC84?style=for-the-badge)

### 📥 [1-Klick Direkt-Download: `trustenia-patches-v2.3.0.mpp`](https://github.com/download/trustenia-patches-v2.3.0.mpp)

</div>

---

## 🚀 Technische Highlights / Technical Architecture

| Modul / Datei | Funktion (DE) | Function (EN) |
| :--- | :--- | :--- |
| **`SabrReadaheadLimit.java`** | **Universal SABR Buffer Fix:** Verdoppelt `MAX_BUFFERED_BYTES` und erhöht `MIN_READAHEAD_MS` (60s) & `FORMAT_EXPIRATION_MS` (180s) gegen Ladestopps. | **Universal SABR Buffer Fix:** Doubles heap buffer cap & extends readahead/expiration windows to eliminate stream stalls. |
| **`MusicGlassNavigationBar.java`** & **`GlassBackdrop.java`** | **Custom Glass UI:** Moderne Transparenz-, Unschärfe- und Theme-Overlays. | **Custom Glass UI:** Refined translucent navigation bar, backdrop blur & theme color overlays. |
| **`ForceFullscreenLandscapePatch.java`** & **`MinimalMiniplayerPatch.java`** | **Player UX:** Optimierte Vollbild- und Miniplayer-Steuerung. | **Player UX:** Enhanced fullscreen orientation & minimal miniplayer controls. |
| **`custom-branding`** | **TRUSTENIA Δ Branding:** Eigene adaptive Icons (`mdpi` bis `xxxhdpi`) für Tube & Music. | **TRUSTENIA Δ Branding:** Custom adaptive icons across all Android DPI buckets. |

---

## 🇩🇪 Schnellstart (Deutsch) & 🇬🇧 Quick Start (English)

1. **Patch-Paket herunterladen / Download Bundle:**  
   Klicke oben auf **[`trustenia-patches-v2.3.0.mpp`](https://github.com/download/trustenia-patches-v2.3.0.mpp)**.
2. **Empfohlene Original-APKs (`arm64-v8a` / `nodpi`):**  
   * **YouTube:** `v21.30.216`  
   * **YouTube Music:** `v9.30.53`
3. **Patchen & Installieren / Patch & Install:**  
   Lade die `.mpp`-Datei in deinen kompatiblen Patch-Manager, wähle die Original-APK aus und installiere die fertige App *(GmsCore / microG wird für die Google-Anmeldung benötigt)*.

---

## 🌐 Community & Kontakt / Links

* **Website:** [trusten.eu](https://trusten.eu)
* **Instagram:** [@trustenia](https://instagram.com)
* **Kontakt / Support:** `info@trusten.eu`
* **Lizenz / License:** GNU General Public License v3.0 (siehe `LICENSE` & `NOTICE`)