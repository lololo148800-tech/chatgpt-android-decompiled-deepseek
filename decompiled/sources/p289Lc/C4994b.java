package p289Lc;

import fo.C13711h;
import io.sentry.C15358g1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p195Hh.InterfaceC3426a;
import p261K7.C4548a;
import p261K7.C4549b;
import p284L7.C4957b;
import p336Nc.C5706b;
import p355O7.C6141c;
import p355O7.InterfaceC6142d;
import p523V9.AbstractC7889G0;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.C16360m;
import p909nm.AbstractC17659D;
import p959q8.C18639a;

/* JADX INFO: renamed from: Lc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4994b implements InterfaceC3426a {

    /* JADX INFO: renamed from: a */
    public final C4996d f16301a;

    /* JADX INFO: renamed from: b */
    public final C13711h f16302b;

    /* JADX INFO: renamed from: c */
    public C13711h f16303c;

    public C4994b(C5706b datadogConfig, C4996d logObserver) {
        AbstractC16544l.m18094g(datadogConfig, "datadogConfig");
        AbstractC16544l.m18094g(logObserver, "logObserver");
        this.f16301a = logObserver;
        C13711h c13711hM5644f = m5644f(C4993a.f16298Z);
        this.f16302b = c13711hM5644f;
        this.f16303c = c13711hM5644f;
    }

    /* JADX INFO: renamed from: f */
    public static C13711h m5644f(InterfaceC1436k interfaceC1436k) {
        InterfaceC6142d c18639a;
        C4549b c4549b = new C4549b();
        c4549b.f14867b = true;
        c4549b.f14869d = true;
        c4549b.f14868c = true;
        interfaceC1436k.invoke(c4549b);
        InterfaceC13823a sdkCore = c4549b.f14866a;
        C16360m c16360mMo15458n = sdkCore.mo15458n("logs");
        C4957b c4957b = c16360mMo15458n != null ? (C4957b) c16360mMo15458n.f50808b : null;
        if (c4549b.f14870e <= 0.0f) {
            c18639a = new C18639a(12);
        } else if (c4957b == null) {
            AbstractC7889G0.m8184b(sdkCore.mo15463s(), 5, EnumC11255b.f34098Y, C4548a.f14865Y, null, false, 56);
            c18639a = new C18639a(12);
        } else {
            String loggerName = c4957b.f16175q0;
            C15358g1 c15358g1 = new C15358g1(sdkCore.mo15456l());
            InterfaceC13575a interfaceC13575a = c4957b.f16173o0;
            boolean z6 = c4549b.f14868c;
            boolean z10 = c4549b.f14869d;
            C11234e c11234e = new C11234e(c4549b.f14870e);
            boolean z11 = c4549b.f14867b;
            int i10 = c4549b.f14871f;
            AbstractC16544l.m18094g(loggerName, "loggerName");
            AbstractC16544l.m18094g(sdkCore, "sdkCore");
            C6141c c6141c = new C6141c();
            c6141c.f20023q0 = loggerName;
            c6141c.f20024r0 = c15358g1;
            c6141c.f20025s0 = sdkCore;
            c6141c.f20026t0 = interfaceC13575a;
            c6141c.f20019Y = z11;
            c6141c.f20021o0 = z6;
            c6141c.f20022p0 = z10;
            c6141c.f20027u0 = c11234e;
            c6141c.f20020Z = i10;
            c18639a = c6141c;
        }
        return new C13711h(c18639a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p195Hh.InterfaceC3426a
    /* JADX INFO: renamed from: a */
    public final void mo4186a(String message, Throwable th2, Map attributes) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(attributes, "attributes");
        m5645e(5, message, th2, AbstractC17659D.m19248j(C5706b.f18491q0, attributes));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p195Hh.InterfaceC3426a
    /* JADX INFO: renamed from: b */
    public final void mo4187b(String message, Throwable th2, Map attributes) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(attributes, "attributes");
        m5645e(6, message, th2, AbstractC17659D.m19248j(C5706b.f18491q0, attributes));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p195Hh.InterfaceC3426a
    /* JADX INFO: renamed from: c */
    public final void mo4188c(String message, Throwable th2, Map attributes) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(attributes, "attributes");
        m5645e(4, message, th2, AbstractC17659D.m19248j(C5706b.f18491q0, attributes));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p195Hh.InterfaceC3426a
    /* JADX INFO: renamed from: d */
    public final void mo4189d(String message, Throwable th2, Map attributes) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(attributes, "attributes");
        m5645e(3, message, th2, AbstractC17659D.m19248j(C5706b.f18491q0, attributes));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final void m5645e(int i10, String message, Throwable th2, LinkedHashMap linkedHashMap) {
        if (i10 >= 4) {
            C13711h c13711h = this.f16303c;
            LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(C5706b.f18491q0, linkedHashMap);
            c13711h.getClass();
            AbstractC16544l.m18094g(message, "message");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll((ConcurrentHashMap) c13711h.f43260o0);
            linkedHashMap2.putAll(linkedHashMapM19248j);
            ((InterfaceC6142d) c13711h.f43259Z).mo6709a(i10, message, th2, linkedHashMap2, new HashSet((CopyOnWriteArraySet) c13711h.f43261p0), null);
            C4996d c4996d = this.f16301a;
            c4996d.getClass();
            Iterator it = c4996d.f16306a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1441p) it.next()).mo985d(Integer.valueOf(i10), message, th2, linkedHashMap);
            }
        }
    }
}
