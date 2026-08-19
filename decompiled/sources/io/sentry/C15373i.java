package io.sentry;

import io.sentry.hints.EnumC15366e;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15449v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: io.sentry.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15373i implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47953Y;

    /* JADX INFO: renamed from: Z */
    public final Object f47954Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f47955o0;

    public C15373i() {
        this.f47953Y = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f47954Z = property;
        this.f47955o0 = property2;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        int i10 = this.f47953Y;
        return c15108a1;
    }

    /* JADX INFO: renamed from: b */
    public void m16630b(AbstractC15160S0 abstractC15160S0) {
        C15449v c15449v = (C15449v) abstractC15160S0.f47195Z.m16663d(C15449v.class, "runtime");
        C15430c c15430c = abstractC15160S0.f47195Z;
        if (c15449v == null) {
            c15430c.put("runtime", new C15449v());
        }
        C15449v c15449v2 = (C15449v) c15430c.m16663d(C15449v.class, "runtime");
        if (c15449v2 != null && c15449v2.f48221Y == null && c15449v2.f48222Z == null) {
            c15449v2.f48221Y = (String) this.f47955o0;
            c15449v2.f48222Z = (String) this.f47954Z;
        }
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        C15446s c15446sM16575d;
        String str;
        Long l4;
        Object obj = this.f47954Z;
        Object obj2 = this.f47955o0;
        switch (this.f47953Y) {
            case 0:
                if (!C15170V1.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || (c15446sM16575d = c15347d1.m16575d()) == null || (str = c15446sM16575d.f48209Y) == null || (l4 = c15446sM16575d.f48212p0) == null) {
                    return c15347d1;
                }
                Map map = (Map) obj;
                Long l10 = (Long) map.get(str);
                if (l10 == null || l10.equals(l4)) {
                    map.put(str, l4);
                    return c15347d1;
                }
                ((C15524y1) obj2).getLogger().mo16298o(EnumC15375i1.INFO, "Event %s has been dropped due to multi-threaded deduplication", c15347d1.f47194Y);
                c15516w.m16729c("sentry:eventDropReason", EnumC15366e.MULTITHREADED_DEDUPLICATION);
                return null;
            case 1:
                C15524y1 c15524y1 = (C15524y1) obj2;
                if (!c15524y1.isEnableDeduplication()) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return c15347d1;
                }
                Throwable thM16339a = c15347d1.m16339a();
                if (thM16339a == null) {
                    return c15347d1;
                }
                Map map2 = (Map) obj;
                if (!map2.containsKey(thM16339a)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = thM16339a; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map2.containsKey(it.next())) {
                        }
                    }
                    map2.put(thM16339a, null);
                    return c15347d1;
                }
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c15347d1.f47194Y);
                return null;
            default:
                m16630b(c15347d1);
                return c15347d1;
        }
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        switch (this.f47953Y) {
            default:
                m16630b(c15421a);
            case 0:
            case 1:
                return c15421a;
        }
    }

    public C15373i(C15524y1 c15524y1, int i10) {
        this.f47953Y = i10;
        switch (i10) {
            case 1:
                this.f47954Z = DesugarCollections.synchronizedMap(new WeakHashMap());
                AbstractC8483G3.m9133c(c15524y1, "options are required");
                this.f47955o0 = c15524y1;
                break;
            default:
                this.f47954Z = DesugarCollections.synchronizedMap(new HashMap());
                this.f47955o0 = c15524y1;
                break;
        }
    }
}
