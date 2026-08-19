package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C12087F {

    /* JADX INFO: renamed from: b */
    public static volatile C12087F f36884b;

    /* JADX INFO: renamed from: c */
    public static final C12087F f36885c = new C12087F();

    /* JADX INFO: renamed from: a */
    public final Map f36886a = Collections.emptyMap();

    /* JADX INFO: renamed from: b */
    public static C12087F m13737b() {
        C12087F c12087f = f36884b;
        if (c12087f == null) {
            synchronized (C12087F.class) {
                try {
                    c12087f = f36884b;
                    if (c12087f == null) {
                        Class cls = AbstractC12081D.f36871a;
                        C12087F c12087f2 = null;
                        if (cls != null) {
                            try {
                                c12087f2 = (C12087F) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c12087f2 == null) {
                            c12087f2 = f36885c;
                        }
                        f36884b = c12087f2;
                        c12087f = c12087f2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c12087f;
    }

    /* JADX INFO: renamed from: a */
    public final C12129X m13738a(int i10, InterfaceC12091G0 interfaceC12091G0) {
        return (C12129X) this.f36886a.get(new C12084E(i10, interfaceC12091G0));
    }
}
