package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11051m {

    /* JADX INFO: renamed from: b */
    public static volatile C11051m f33329b;

    /* JADX INFO: renamed from: c */
    public static final C11051m f33330c = new C11051m();

    /* JADX INFO: renamed from: a */
    public final Map f33331a = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public static C11051m m12089a() {
        C11023T c11023t = C11023T.f33266c;
        C11051m c11051m = f33329b;
        if (c11051m == null) {
            synchronized (C11051m.class) {
                try {
                    c11051m = f33329b;
                    if (c11051m == null) {
                        Class cls = AbstractC11050l.f33328a;
                        C11051m c11051m2 = null;
                        if (cls != null) {
                            try {
                                c11051m2 = (C11051m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c11051m2 == null) {
                            c11051m2 = f33330c;
                        }
                        f33329b = c11051m2;
                        c11051m = c11051m2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c11051m;
    }
}
