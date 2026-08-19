package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10973n {

    /* JADX INFO: renamed from: a */
    public static final C10971m f33072a = new C10971m();

    /* JADX INFO: renamed from: b */
    public static final C10971m f33073b;

    static {
        C10971m c10971m = null;
        try {
            c10971m = (C10971m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33073b = c10971m;
    }
}
