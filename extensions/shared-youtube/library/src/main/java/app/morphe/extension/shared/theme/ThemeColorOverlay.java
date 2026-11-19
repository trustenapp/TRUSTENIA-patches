package app.morphe.extension.shared.theme;
import android.content.Context;
import java.util.Map;
final class ThemeColorOverlay {
    static boolean isAvailable(Context c) { return false; }
    static void register(Context c, boolean d, Map<String, Integer> m) {}
    static void unregisterIfRegistered(Context c, boolean d) {}
    static void applyTo(Context c, boolean d, boolean f) {}
    static void removeFrom(Context c) {}
}
