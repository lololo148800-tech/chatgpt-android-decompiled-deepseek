package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10941U {

    /* JADX INFO: renamed from: a */
    public static final C10940T f33001a;

    /* JADX INFO: renamed from: b */
    public static final C10940T f33002b;

    static {
        C10940T c10940t = null;
        try {
            c10940t = (C10940T) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f33001a = c10940t;
        f33002b = new C10940T();
    }
}
