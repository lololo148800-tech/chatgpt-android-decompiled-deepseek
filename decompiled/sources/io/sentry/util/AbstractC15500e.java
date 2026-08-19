package io.sentry.util;

/* JADX INFO: renamed from: io.sentry.util.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15500e {

    /* JADX INFO: renamed from: a */
    public static final boolean f48420a;

    /* JADX INFO: renamed from: b */
    public static final boolean f48421b;

    static {
        try {
            f48420a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f48420a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f48421b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f48421b = false;
            }
        } catch (Throwable unused2) {
            f48421b = false;
        }
    }
}
