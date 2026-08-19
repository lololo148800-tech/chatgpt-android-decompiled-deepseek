package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10969l {

    /* JADX INFO: renamed from: b */
    public static volatile C10969l f33067b;

    /* JADX INFO: renamed from: c */
    public static final C10969l f33068c;

    /* JADX INFO: renamed from: a */
    public final Map f33069a = Collections.emptyMap();

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f33068c = new C10969l();
    }

    /* JADX INFO: renamed from: a */
    public static C10969l m11670a() {
        C10969l c10969l = f33067b;
        if (c10969l == null) {
            synchronized (C10969l.class) {
                try {
                    c10969l = f33067b;
                    if (c10969l == null) {
                        Class cls = AbstractC10967k.f33065a;
                        if (cls != null) {
                            try {
                                c10969l = (C10969l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                                c10969l = f33068c;
                            }
                        } else {
                            c10969l = f33068c;
                        }
                        f33067b = c10969l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c10969l;
    }
}
