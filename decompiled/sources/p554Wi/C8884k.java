package p554Wi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p049Bm.InterfaceC1436k;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p402Qc.C6593i;
import p482Tg.C7448e;
import p530Vi.C8300H;
import p530Vi.C8312h;
import p552Wg.C8847i;
import p571X9.AbstractC9221V;
import p580Xi.C9519e;
import p594Y9.AbstractC9799R4;
import p594Y9.AbstractC9852a3;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Wi.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C8884k {

    /* JADX INFO: renamed from: a */
    public final Object f27192a = AbstractC17659D.m19244f(new C17309l(EnumC8881h.f27183Y, new C8880g()), new C17309l(EnumC8881h.f27184Z, new C8880g()), new C17309l(EnumC8881h.f27185o0, new C8880g()), new C17309l(EnumC8881h.f27186p0, new C8880g()), new C17309l(EnumC8881h.f27187q0, new C8880g()));

    /* JADX INFO: renamed from: b */
    public C8312h f27193b;

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final void m9554a(InterfaceC8882i plugin) {
        AbstractC16544l.m18094g(plugin, "plugin");
        try {
            C8312h c8312h = this.f27193b;
            if (c8312h == null) {
                AbstractC16544l.m18103p("analytics");
                throw null;
            }
            plugin.mo7805d(c8312h);
            C8300H.f25862Y.m8909c("analytics_mobile.integration.invoke", new C6593i(plugin, 21));
            C8880g c8880g = (C8880g) this.f27192a.get(plugin.getType());
            if (c8880g != null) {
                c8880g.f27182a.add(plugin);
            }
            C8312h c8312h2 = this.f27193b;
            if (c8312h2 == null) {
                AbstractC16544l.m18103p("analytics");
                throw null;
            }
            C2392v c2392v = c8312h2.f25903Z;
            AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8883j(c8312h2, plugin, null), 2);
        } catch (Throwable th2) {
            C8312h c8312h3 = this.f27193b;
            if (c8312h3 == null) {
                AbstractC16544l.m18103p("analytics");
                throw null;
            }
            AbstractC9852a3.m10501b(c8312h3, th2, "Caught Exception while setting up plugin " + plugin, "analytics_mobile.integration.invoke.error", AbstractC9221V.m9790b(th2), new C7448e(th2, plugin, this, 5));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final void m9555b(InterfaceC1436k interfaceC1436k) {
        Iterator it = this.f27192a.entrySet().iterator();
        while (it.hasNext()) {
            C8880g c8880g = (C8880g) ((Map.Entry) it.next()).getValue();
            c8880g.getClass();
            for (InterfaceC8882i plugin : c8880g.f27182a) {
                try {
                    AbstractC16544l.m18093f(plugin, "plugin");
                    interfaceC1436k.invoke(plugin);
                } catch (Throwable th2) {
                    AbstractC9852a3.m10501b(null, th2, "Caught Exception applying closure to plugin: " + plugin, "analytics_mobile.integration.invoke.error", AbstractC9221V.m9790b(th2), new C8879f(th2, plugin, 0));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final AbstractC12774a m9556c(EnumC8881h enumC8881h, AbstractC12774a abstractC12774a) {
        C8880g c8880g = (C8880g) this.f27192a.get(enumC8881h);
        if (abstractC12774a == null) {
            return abstractC12774a;
        }
        if (c8880g == null) {
            return null;
        }
        for (InterfaceC8882i interfaceC8882i : c8880g.f27182a) {
            if (abstractC12774a != null) {
                AbstractC12774a abstractC12774aM14522b = abstractC12774a.m14522b();
                try {
                    C8300H.f25862Y.m8909c("analytics_mobile.integration.invoke", new C8847i(abstractC12774a, 1, interfaceC8882i));
                    if (interfaceC8882i instanceof C9519e) {
                        ((C9519e) interfaceC8882i).mo7802a(abstractC12774aM14522b);
                    } else {
                        abstractC12774a = interfaceC8882i.mo7802a(abstractC12774aM14522b);
                    }
                } catch (Throwable th2) {
                    AbstractC9799R4.m10419a(C8312h.Companion, "Skipping plugin due to Exception: " + interfaceC8882i, 2);
                    AbstractC9852a3.m10501b(null, th2, "Caught Exception in plugin", "analytics_mobile.integration.invoke.error", AbstractC9221V.m9790b(th2), new C8879f(th2, interfaceC8882i, 1));
                }
            }
        }
        return abstractC12774a;
    }
}
