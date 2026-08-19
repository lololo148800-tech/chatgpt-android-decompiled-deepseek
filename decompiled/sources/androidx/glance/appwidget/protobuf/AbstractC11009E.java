package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11009E {

    /* JADX INFO: renamed from: a */
    public static final C11008D f33236a;

    /* JADX INFO: renamed from: b */
    public static final C11008D f33237b;

    static {
        C11023T c11023t = C11023T.f33266c;
        C11008D c11008d = null;
        try {
            c11008d = (C11008D) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33236a = c11008d;
        f33237b = new C11008D();
    }
}
