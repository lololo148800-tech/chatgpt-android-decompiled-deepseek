package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12144d {

    /* JADX INFO: renamed from: a */
    public static final Class f37025a;

    /* JADX INFO: renamed from: b */
    public static final boolean f37026b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f37025a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f37026b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13942a() {
        return (f37025a == null || f37026b) ? false : true;
    }
}
