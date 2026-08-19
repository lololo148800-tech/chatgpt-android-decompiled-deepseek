package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11015K {

    /* JADX INFO: renamed from: a */
    public static final C11014J f33243a;

    /* JADX INFO: renamed from: b */
    public static final C11014J f33244b;

    static {
        C11023T c11023t = C11023T.f33266c;
        C11014J c11014j = null;
        try {
            c11014j = (C11014J) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33243a = c11014j;
        f33244b = new C11014J();
    }
}
