package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11034c {

    /* JADX INFO: renamed from: a */
    public static final Class f33286a;

    /* JADX INFO: renamed from: b */
    public static final boolean f33287b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f33286a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f33287b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11982a() {
        return (f33286a == null || f33287b) ? false : true;
    }
}
