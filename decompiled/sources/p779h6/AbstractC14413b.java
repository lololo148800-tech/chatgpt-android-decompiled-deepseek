package p779h6;

import io.sentry.android.core.AbstractC15256t;
import java.util.HashSet;

/* JADX INFO: renamed from: h6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14413b {

    /* JADX INFO: renamed from: a */
    public static final C14412a f45287a = new C14412a();

    /* JADX INFO: renamed from: a */
    public static void m15912a() {
        f45287a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m15913b(String str) {
        f45287a.getClass();
        HashSet hashSet = C14412a.f45286a;
        if (hashSet.contains(str)) {
            return;
        }
        AbstractC15256t.m16483u("LOTTIE", str, null);
        hashSet.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m15914c(String str, Throwable th2) {
        f45287a.getClass();
        HashSet hashSet = C14412a.f45286a;
        if (hashSet.contains(str)) {
            return;
        }
        AbstractC15256t.m16483u("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
