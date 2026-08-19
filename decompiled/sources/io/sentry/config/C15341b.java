package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15341b implements InterfaceC15343d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f47901a;

    public C15341b(ArrayList arrayList) {
        this.f47901a = arrayList;
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: a */
    public final String mo16569a(String str) {
        Iterator it = this.f47901a.iterator();
        while (it.hasNext()) {
            String strMo16569a = ((InterfaceC15343d) it.next()).mo16569a(str);
            if (strMo16569a != null) {
                return strMo16569a;
            }
        }
        return null;
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: b */
    public final Map mo16570b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f47901a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((InterfaceC15343d) it.next()).mo16570b());
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m16571c(String str) {
        String strMo16569a = mo16569a(str);
        if (strMo16569a != null) {
            return Boolean.valueOf(strMo16569a);
        }
        return null;
    }
}
