package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10935N {

    /* JADX INFO: renamed from: a */
    public static final C10934M f32978a;

    /* JADX INFO: renamed from: b */
    public static final C10934M f32979b;

    static {
        C10934M c10934m = null;
        try {
            c10934m = (C10934M) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f32978a = c10934m;
        f32979b = new C10934M();
    }
}
