package p082D2;

import android.app.Application;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

/* JADX INFO: renamed from: D2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1854a {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ShortcutInfo.Builder m2713b(Application application, String str) {
        return new ShortcutInfo.Builder(application, str);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ShortcutManager m2717f(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Class m2718g() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2720i() {
    }
}
