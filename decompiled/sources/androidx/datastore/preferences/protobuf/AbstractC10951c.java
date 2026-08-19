package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10951c {

    /* JADX INFO: renamed from: a */
    public static final Class f33018a;

    /* JADX INFO: renamed from: b */
    public static final boolean f33019b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f33018a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f33019b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11572a() {
        return (f33018a == null || f33019b) ? false : true;
    }
}
