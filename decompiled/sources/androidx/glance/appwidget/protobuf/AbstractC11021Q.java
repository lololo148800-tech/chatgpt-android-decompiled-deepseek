package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11021Q {

    /* JADX INFO: renamed from: a */
    public static final C11020P f33264a;

    /* JADX INFO: renamed from: b */
    public static final C11020P f33265b;

    static {
        C11023T c11023t = C11023T.f33266c;
        C11020P c11020p = null;
        try {
            c11020p = (C11020P) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33264a = c11020p;
        f33265b = new C11020P();
    }
}
