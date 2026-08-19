package io.sentry.config;

import android.gov.nist.core.Separators;
import io.sentry.util.AbstractC15503h;
import java.util.Locale;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15342c implements InterfaceC15343d {
    /* JADX INFO: renamed from: c */
    public static String m16572c(String str) {
        return "SENTRY_" + str.replace(Separators.DOT, "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: a */
    public final String mo16569a(String str) {
        return AbstractC15503h.m16688b(System.getenv(m16572c(str)));
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: b */
    public final Map mo16570b() {
        String strM16688b;
        String str = m16572c("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strM16688b = AbstractC15503h.m16688b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strM16688b);
            }
        }
        return concurrentHashMap;
    }
}
