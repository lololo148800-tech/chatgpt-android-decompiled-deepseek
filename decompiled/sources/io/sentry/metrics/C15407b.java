package io.sentry.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p817j$.util.Objects;

/* JADX INFO: renamed from: io.sentry.metrics.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15407b {

    /* JADX INFO: renamed from: a */
    public final HashMap f48027a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final HashMap m16652a() {
        HashMap map = new HashMap();
        synchronized (this.f48027a) {
            try {
                for (Map.Entry entry : this.f48027a.entrySet()) {
                    String str = (String) entry.getKey();
                    Objects.requireNonNull(str);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Map) entry.getValue()).values().iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
