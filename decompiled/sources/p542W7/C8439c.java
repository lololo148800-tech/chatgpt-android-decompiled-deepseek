package p542W7;

import android.gov.nist.core.Separators;
import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import hm.InterfaceC14539d;
import hm.InterfaceC14540e;
import io.opentracing.util.GlobalTracer;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import jm.C16270a;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import mm.C17309l;
import mo.C17327D;
import mo.C17349p;
import mo.C17358y;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import p001A.C0100z;
import p087D7.AbstractC1976c;
import p1021t8.EnumC19815f;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p164G8.C3007a;
import p164G8.C3009c;
import p239Ja.C4307j;
import p273Kl.C4714D;
import p402Qc.C6593i;
import p473T7.AbstractC7262c;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p544W9.AbstractC8446A2;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9756K2;
import p658b5.C11234e;
import p661b7.C11254a;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p714e0.C13254b;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p791hj.C14522e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import ro.C19261e;

/* JADX INFO: renamed from: W7.c */
/* JADX INFO: loaded from: classes.dex */
public class C8439c implements InterfaceC17351r {

    /* JADX INFO: renamed from: a */
    public final String f26267a;

    /* JADX INFO: renamed from: b */
    public final C11234e f26268b;

    /* JADX INFO: renamed from: c */
    public final C8437a f26269c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f26270d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f26271e;

    /* JADX INFO: renamed from: f */
    public final C13254b f26272f;

    /* JADX INFO: renamed from: g */
    public final C15358g1 f26273g;

    /* JADX INFO: renamed from: h */
    public final int f26274h;

    public C8439c(LinkedHashMap linkedHashMap, C7591u c7591u, String str, C11234e traceSampler, int i10, C8437a localTracerFactory) {
        AbstractC16544l.m18094g(traceSampler, "traceSampler");
        AbstractC14376f.m15825D(i10, "traceContextInjection");
        AbstractC16544l.m18094g(localTracerFactory, "localTracerFactory");
        this.f26267a = str;
        this.f26268b = traceSampler;
        this.f26274h = i10;
        this.f26269c = localTracerFactory;
        this.f26270d = new AtomicReference();
        this.f26271e = AbstractC8446A2.m9049b("Network Requests", AbstractC17680n.m19322C0(linkedHashMap.keySet()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (this.f26271e.contains((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        this.f26272f = new C13254b(linkedHashMap2);
        C6593i c6593i = new C6593i(this, 18);
        C15358g1 c15358g1 = new C15358g1();
        c15358g1.f47945Y = c6593i;
        c15358g1.f47946Z = new AtomicReference(null);
        this.f26273g = c15358g1;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7709a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9039b(InterfaceC13823a interfaceC13823a, C17358y c17358y, C17327D c17327d, InterfaceC14537b interfaceC14537b, boolean z6) {
        if (!z6) {
            mo7710c(interfaceC13823a, c17358y, null, c17327d, null);
            return;
        }
        int i10 = c17327d.f55176p0;
        interfaceC14537b.mo3834d(Integer.valueOf(i10));
        if (400 <= i10 && i10 < 500) {
            C3007a c3007a = interfaceC14537b instanceof C3007a ? (C3007a) interfaceC14537b : null;
            if (c3007a != null) {
                c3007a.f9032a.f9048k = true;
            }
        }
        if (i10 == 404) {
            C3007a c3007a2 = interfaceC14537b instanceof C3007a ? (C3007a) interfaceC14537b : null;
            if (c3007a2 != null) {
                c3007a2.f9032a.f9046i = "404";
            }
        }
        mo7710c(interfaceC13823a, c17358y, interfaceC14537b, c17327d, null);
        if (mo7709a()) {
            interfaceC14537b.mo3832b();
            return;
        }
        C3007a c3007a3 = interfaceC14537b instanceof C3007a ? (C3007a) interfaceC14537b : null;
        if (c3007a3 != null) {
            c3007a3.f9032a.f9039b.m3857j(c3007a3, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo7710c(InterfaceC13823a interfaceC13823a, C17358y request, InterfaceC14537b interfaceC14537b, C17327D c17327d, Throwable th2) {
        AbstractC16544l.m18094g(request, "request");
    }

    /* JADX INFO: renamed from: d */
    public void mo7711d(InterfaceC13823a sdkCore) {
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        if (this.f26272f.f41868a.isEmpty() && sdkCore.mo15464t().f41868a.isEmpty()) {
            AbstractC7889G0.m8184b(sdkCore.mo15463s(), 4, EnumC11255b.f34098Y, C8438b.f26263o0, null, true, 40);
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC14540e m9040e(InterfaceC13823a interfaceC13823a) {
        AtomicReference atomicReference = this.f26270d;
        if (atomicReference.get() == null) {
            Object objInvoke = this.f26269c.invoke(interfaceC13823a, AbstractC17665J.m19266f(AbstractC17680n.m19328G0(AbstractC17682p.m19390s(this.f26272f.f41868a.values())), AbstractC17680n.m19328G0(AbstractC17682p.m19390s(interfaceC13823a.mo15464t().f41868a.values()))));
            while (!atomicReference.compareAndSet(null, objInvoke) && atomicReference.get() == null) {
            }
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, EnumC11255b.f34098Y, C8438b.f26264p0, null, false, 56);
        }
        Object obj = atomicReference.get();
        AbstractC16544l.m18093f(obj, "localTracerReference.get()");
        return (InterfaceC14540e) obj;
    }

    /* JADX INFO: renamed from: f */
    public final C14522e m9041f(InterfaceC13823a interfaceC13823a, C17358y c17358y, InterfaceC14540e interfaceC14540e, InterfaceC14537b interfaceC14537b, boolean z6) {
        C14522e c14522eM19038b = c17358y.m19038b();
        C13254b c13254b = this.f26272f;
        C17349p c17349p = c17358y.f55379a;
        Set setM14851a = c13254b.m14851a(c17349p);
        if (setM14851a.isEmpty()) {
            setM14851a = interfaceC13823a.mo15464t().m14851a(c17349p);
        }
        Set set = setM14851a;
        if (z6) {
            interfaceC14540e.mo3854y(interfaceC14537b.mo3833c(), new C0100z(c14522eM19038b, 22, set));
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((EnumC19815f) it.next()).ordinal();
                int i10 = this.f26274h;
                if (iOrdinal == 0) {
                    Iterator it2 = AbstractC17681o.m19382k("x-datadog-sampling-priority", "x-datadog-trace-id", "x-datadog-tags", "x-datadog-parent-id", "x-datadog-origin").iterator();
                    while (it2.hasNext()) {
                        c14522eM19038b.m16030x((String) it2.next());
                    }
                    if (i10 == 1) {
                        interfaceC14540e.mo3854y(interfaceC14537b.mo3833c(), new C4307j(c14522eM19038b, 10));
                        c14522eM19038b.m16012b("x-datadog-sampling-priority", WebrtcBuildVersion.maint_version);
                    }
                } else if (iOrdinal == 1) {
                    c14522eM19038b.m16030x("b3");
                    if (i10 == 1) {
                        c14522eM19038b.m16012b("b3", WebrtcBuildVersion.maint_version);
                    }
                } else if (iOrdinal == 2) {
                    Iterator it3 = AbstractC17681o.m19382k("X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled").iterator();
                    while (it3.hasNext()) {
                        c14522eM19038b.m16030x((String) it3.next());
                    }
                    if (i10 == 1) {
                        c14522eM19038b.m16012b("X-B3-Sampled", WebrtcBuildVersion.maint_version);
                    }
                } else if (iOrdinal == 3) {
                    c14522eM19038b.m16030x("traceparent");
                    c14522eM19038b.m16030x("tracestate");
                    if (i10 == 1) {
                        InterfaceC14538c interfaceC14538cMo3833c = interfaceC14537b.mo3833c();
                        AbstractC16544l.m18093f(interfaceC14538cMo3833c, "span.context()");
                        String strM10357b = AbstractC9756K2.m10357b(interfaceC14538cMo3833c);
                        String spanId = interfaceC14537b.mo3833c().mo3838a();
                        String strM21686T = AbstractC21322p.m21686T(32, strM10357b);
                        AbstractC16544l.m18093f(spanId, "spanId");
                        c14522eM19038b.m16012b("traceparent", String.format("00-%s-%s-00", Arrays.copyOf(new Object[]{strM21686T, AbstractC21322p.m21686T(16, spanId)}, 2)));
                        String strM9890i = String.format("dd=p:%s;s:0", Arrays.copyOf(new Object[]{AbstractC21322p.m21686T(16, spanId)}, 1));
                        String str = this.f26267a;
                        if (str != null) {
                            strM9890i = AbstractC9306j0.m9890i(strM9890i, ";o:", str);
                        }
                        c14522eM19038b.m16012b("tracestate", strM9890i);
                    }
                }
            }
        }
        return c14522eM19038b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    @Override // mo.InterfaceC17351r
    public C17327D intercept(InterfaceC17350q interfaceC17350q) {
        InterfaceC14540e interfaceC14540eM9040e;
        InterfaceC14540e interfaceC14540e;
        String strM19012f;
        List listM21697e0;
        Integer numM21736w;
        Boolean boolValueOf;
        InterfaceC14538c interfaceC14538cMo3833c;
        C17358y c17358yM16017i;
        InterfaceC13823a interfaceC13823aM16583k = this.f26273g.m16583k();
        if (interfaceC13823aM16583k == null) {
            InterfaceC11256c.f34102a.getClass();
            C19261e c19261e = (C19261e) interfaceC17350q;
            AbstractC7889G0.m8184b(C11254a.f34097b, 3, EnumC11255b.f34098Y, new C4714D("Default SDK instance", 29, c19261e), null, false, 56);
            return c19261e.m20335b(c19261e.f61057e);
        }
        InterfaceC13823a interfaceC13823a = interfaceC13823aM16583k;
        synchronized (this) {
            try {
                if (interfaceC13823a.mo15458n("tracing") == null) {
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, EnumC11255b.f34098Y, C8438b.f26265q0, null, true, 40);
                    interfaceC14540e = null;
                } else {
                    if (GlobalTracer.isRegistered()) {
                        this.f26270d.set(null);
                        interfaceC14540eM9040e = GlobalTracer.f46995Y;
                    } else {
                        interfaceC14540eM9040e = m9040e(interfaceC13823a);
                    }
                    interfaceC14540e = interfaceC14540eM9040e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C17358y c17358y = ((C19261e) interfaceC17350q).f61057e;
        if (interfaceC14540e != null) {
            C17349p c17349p = c17358y.f55379a;
            if (interfaceC13823a.mo15464t().m14853c(c17349p) || this.f26272f.m14853c(c17349p)) {
                String strM19012f2 = c17358y.f55381c.m19012f("x-datadog-sampling-priority");
                Integer numM21736w2 = strM19012f2 != null ? AbstractC21329w.m21736w(strM19012f2) : null;
                if (numM21736w2 == null) {
                    String strM19012f3 = c17358y.f55381c.m19012f("X-B3-Sampled");
                    if (strM19012f3 == null) {
                        String strM19012f4 = c17358y.f55381c.m19012f("b3");
                        if (strM19012f4 == null) {
                            strM19012f = c17358y.f55381c.m19012f("traceparent");
                            if (strM19012f != null) {
                                listM21697e0 = AbstractC21322p.m21697e0(strM19012f, new String[]{"-"}, 0, 6);
                                if (listM21697e0.size() < 4) {
                                    boolValueOf = null;
                                } else {
                                    numM21736w = AbstractC21329w.m21736w((String) listM21697e0.get(3));
                                    if (numM21736w != null && numM21736w.intValue() == 1) {
                                        boolValueOf = Boolean.TRUE;
                                    } else if (numM21736w == null && numM21736w.intValue() == 0) {
                                        boolValueOf = Boolean.FALSE;
                                    } else {
                                        boolValueOf = null;
                                    }
                                }
                            } else {
                                boolValueOf = null;
                            }
                        } else if (strM19012f4.equals(WebrtcBuildVersion.maint_version)) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            List listM21697e1 = AbstractC21322p.m21697e0(strM19012f4, new String[]{"-"}, 0, 6);
                            if (listM21697e1.size() >= 3) {
                                String str = (String) listM21697e1.get(2);
                                int iHashCode = str.hashCode();
                                if (iHashCode != 48) {
                                    boolValueOf = iHashCode != 49 ? Boolean.TRUE : Boolean.TRUE;
                                } else if (str.equals(WebrtcBuildVersion.maint_version)) {
                                    boolValueOf = Boolean.FALSE;
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                strM19012f = c17358y.f55381c.m19012f("traceparent");
                                if (strM19012f != null) {
                                    listM21697e0 = AbstractC21322p.m21697e0(strM19012f, new String[]{"-"}, 0, 6);
                                    if (listM21697e0.size() < 4) {
                                        boolValueOf = null;
                                    } else {
                                        numM21736w = AbstractC21329w.m21736w((String) listM21697e0.get(3));
                                        if (numM21736w != null) {
                                            boolValueOf = Boolean.TRUE;
                                        } else if (numM21736w == null) {
                                            boolValueOf = null;
                                        } else {
                                            boolValueOf = Boolean.FALSE;
                                        }
                                    }
                                } else {
                                    boolValueOf = null;
                                }
                            }
                        }
                    } else if (strM19012f3.equals("1")) {
                        boolValueOf = Boolean.TRUE;
                    } else if (strM19012f3.equals(WebrtcBuildVersion.maint_version)) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                } else if (numM21736w2.intValue() == Integer.MIN_VALUE) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numM21736w2.intValue() == 2 || numM21736w2.intValue() == 1);
                }
                boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : this.f26268b.m12504H();
                InterfaceC14537b interfaceC14537b = (InterfaceC14537b) InterfaceC14537b.class.cast(c17358y.f55383e.get(InterfaceC14537b.class));
                if (interfaceC14537b == null || (interfaceC14538cMo3833c = interfaceC14537b.mo3833c()) == null) {
                    if (AbstractC7262c.class.cast(c17358y.f55383e.get(AbstractC7262c.class)) != null) {
                        throw new ClassCastException();
                    }
                    interfaceC14538cMo3833c = null;
                }
                TreeMap treeMapM19017r = c17358y.f55381c.m19017r();
                ArrayList arrayList = new ArrayList(treeMapM19017r.size());
                for (Map.Entry entry : treeMapM19017r.entrySet()) {
                    arrayList.add(new C17309l(entry.getKey(), AbstractC17680n.m19349Y((Iterable) entry.getValue(), Separators.SEMICOLON, null, null, 0, null, null, 62)));
                }
                InterfaceC14538c interfaceC14538cMo3853m0 = interfaceC14540e.mo3853m0(new C16270a(AbstractC17659D.m19253o(arrayList)));
                if (interfaceC14538cMo3853m0 != null) {
                    interfaceC14538cMo3833c = interfaceC14538cMo3853m0;
                }
                String str2 = c17358y.f55379a.f55294i;
                InterfaceC14539d interfaceC14539dMo16040J = interfaceC14540e.mo16040J("okhttp.request");
                C3009c c3009c = interfaceC14539dMo16040J instanceof C3009c ? (C3009c) interfaceC14539dMo16040J : null;
                if (c3009c != null) {
                    c3009c.f9058f = this.f26267a;
                }
                InterfaceC14537b interfaceC14537bStart = interfaceC14539dMo16040J.mo3847b(interfaceC14538cMo3833c).start();
                boolean z6 = interfaceC14537bStart instanceof C3007a;
                C3007a c3007a = z6 ? (C3007a) interfaceC14537bStart : null;
                if (c3007a != null) {
                    c3007a.f9032a.f9046i = AbstractC21322p.m21705m0(str2, '?');
                }
                interfaceC14537bStart.mo3831a("http.url", str2);
                interfaceC14537bStart.mo3831a("http.method", c17358y.f55380b);
                interfaceC14537bStart.mo3835e();
                try {
                    c17358yM16017i = m9041f(interfaceC13823a, c17358y, interfaceC14540e, interfaceC14537bStart, zBooleanValue).m16017i();
                } catch (IllegalStateException e10) {
                    AbstractC7889G0.m8185c(interfaceC13823a.mo15463s(), 4, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C8438b.f26262Z, e10, 48);
                    c17358yM16017i = c17358y;
                }
                try {
                    C17327D c17327dM20335b = ((C19261e) interfaceC17350q).m20335b(c17358yM16017i);
                    m9039b(interfaceC13823a, c17358y, c17327dM20335b, interfaceC14537bStart, zBooleanValue);
                    return c17327dM20335b;
                } catch (Throwable th3) {
                    if (zBooleanValue) {
                        C3007a c3007a2 = z6 ? (C3007a) interfaceC14537bStart : null;
                        if (c3007a2 != null) {
                            c3007a2.f9032a.f9048k = true;
                        }
                        interfaceC14537bStart.mo3831a("error.msg", th3.getMessage());
                        interfaceC14537bStart.mo3831a("error.type", th3.getClass().getName());
                        interfaceC14537bStart.mo3831a("error.stack", AbstractC1976c.m3148e(th3));
                        mo7710c(interfaceC13823a, c17358y, interfaceC14537bStart, null, th3);
                        if (mo7709a()) {
                            interfaceC14537bStart.mo3832b();
                        } else {
                            C3007a c3007a3 = z6 ? (C3007a) interfaceC14537bStart : null;
                            if (c3007a3 != null) {
                                c3007a3.f9032a.f9039b.m3857j(c3007a3, false);
                            }
                        }
                    } else {
                        mo7710c(interfaceC13823a, c17358y, null, null, th3);
                    }
                    throw th3;
                }
            }
        }
        try {
            C17327D c17327dM20335b2 = ((C19261e) interfaceC17350q).m20335b(c17358y);
            mo7710c(interfaceC13823a, c17358y, null, c17327dM20335b2, null);
            return c17327dM20335b2;
        } catch (Throwable th4) {
            mo7710c(interfaceC13823a, c17358y, null, null, th4);
            throw th4;
        }
    }
}
