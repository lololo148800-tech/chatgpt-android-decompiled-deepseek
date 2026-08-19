package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11053o {

    /* JADX INFO: renamed from: a */
    public static final C11052n f33332a = new C11052n();

    /* JADX INFO: renamed from: b */
    public static final C11052n f33333b;

    static {
        C11023T c11023t = C11023T.f33266c;
        C11052n c11052n = null;
        try {
            c11052n = (C11052n) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33333b = c11052n;
    }
}
