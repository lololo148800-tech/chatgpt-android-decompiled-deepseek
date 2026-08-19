package p722e8;

import com.datadog.android.rum.DdRumContentProvider;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8119j5;
import p661b7.EnumC11255b;
import p662b8.C11260d;
import p672c3.C11636v0;
import p677c8.C11691c;
import p714e0.C13254b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p781h8.C14428c;
import p781h8.EnumC14426a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p902n8.C17519f;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p918o7.C17878e;

/* JADX INFO: renamed from: e8.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C13307Q implements InterfaceC13303M {

    /* JADX INFO: renamed from: o */
    public static final Class[] f42102o = {C13326j.class, C13341y.class, C13342z.class};

    /* JADX INFO: renamed from: p */
    public static final Class[] f42103p = {C13329m.class, C13332p.class, AbstractC13335s.class, C13295E.class, C13324h.class, C13325i.class, C13330n.class, C13331o.class, C13333q.class, C13334r.class, C13336t.class, C13337u.class};

    /* JADX INFO: renamed from: q */
    public static final long f42104q = TimeUnit.SECONDS.toNanos(3);

    /* JADX INFO: renamed from: a */
    public final C13305O f42105a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13823a f42106b;

    /* JADX INFO: renamed from: c */
    public final C15384c f42107c;

    /* JADX INFO: renamed from: d */
    public final boolean f42108d;

    /* JADX INFO: renamed from: e */
    public final boolean f42109e;

    /* JADX INFO: renamed from: f */
    public final C13323g f42110f;

    /* JADX INFO: renamed from: g */
    public final C13254b f42111g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17524k f42112h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17524k f42113i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17524k f42114j;

    /* JADX INFO: renamed from: k */
    public boolean f42115k;

    /* JADX INFO: renamed from: l */
    public final float f42116l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f42117m;

    /* JADX INFO: renamed from: n */
    public C11691c f42118n;

    public C13307Q(C13305O c13305o, InterfaceC13823a interfaceC13823a, C15384c c15384c, boolean z6, boolean z10, C13323g c13323g, C13254b firstPartyHostHeaderTypeResolver, InterfaceC17524k cpuVitalMonitor, InterfaceC17524k memoryVitalMonitor, InterfaceC17524k frameRateVitalMonitor, boolean z11, float f10) {
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
        AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
        AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
        this.f42105a = c13305o;
        this.f42106b = interfaceC13823a;
        this.f42107c = c15384c;
        this.f42108d = z6;
        this.f42109e = z10;
        this.f42110f = c13323g;
        this.f42111g = firstPartyHostHeaderTypeResolver;
        this.f42112h = cpuVitalMonitor;
        this.f42113i = memoryVitalMonitor;
        this.f42114j = frameRateVitalMonitor;
        this.f42115k = z11;
        this.f42116l = f10;
        this.f42117m = new ArrayList();
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0304  */
    /* JADX WARN: Code duplicated, block: B:103:0x031f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0329  */
    /* JADX WARN: Code duplicated, block: B:108:0x0339  */
    /* JADX WARN: Code duplicated, block: B:110:0x033c  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0301  */
    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final InterfaceC13303M mo14927b(AbstractC8119j5 event, InterfaceC13575a writer) {
        int i10;
        AbstractC8119j5 abstractC8119j5;
        EnumC14426a enumC14426a;
        C15384c c15384c;
        boolean z6;
        C13307Q c13307q;
        boolean z10;
        EnumC14426a enumC14426a2;
        Object obj;
        C14428c c14428c;
        C13307Q c13307q2 = this;
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(writer, "writer");
        boolean z11 = event instanceof C13329m;
        C17690x c17690x = C17690x.f56481Y;
        ArrayList arrayList = c13307q2.f42117m;
        C15384c c15384c2 = c13307q2.f42107c;
        InterfaceC13823a interfaceC13823a = c13307q2.f42106b;
        C13323g c13323g = c13307q2.f42110f;
        if (z11 && !c13307q2.f42115k) {
            C13329m c13329m = (C13329m) event;
            C13315Z c13315z = new C13315Z(this, interfaceC13823a, c15384c2, new C13304N("com.datadog.application-launch.view", "com/datadog/application-launch/view", "ApplicationLaunch"), c13329m.f42295b, c17690x, c13323g, c13307q2.f42111g, new C17519f(), new C17519f(), new C17519f(), 4, c13307q2.f42109e, c13307q2.f42116l, 2048);
            this.f42115k = true;
            c13315z.mo14927b(c13329m, writer);
            arrayList.add(c13315z);
            return this;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC13303M interfaceC13303M = (InterfaceC13303M) it.next();
            if ((event instanceof C13295E) && interfaceC13303M.mo14926a()) {
                C13315Z c13315z2 = interfaceC13303M instanceof C13315Z ? (C13315Z) interfaceC13303M : null;
                if (AbstractC16544l.m18089b(c13315z2 != null ? c13315z2.f42185d.f42077a : null, ((C13295E) event).f42027b.f42077a)) {
                    c13307q2.f42118n = ((C13295E) event).f42029d;
                }
            }
            if (interfaceC13303M.mo14927b(event, writer) == null) {
                it.remove();
            }
        }
        if (event instanceof C13291A) {
            C13291A c13291a = (C13291A) event;
            int i11 = C13315Z.f42161W;
            C13254b firstPartyHostHeaderTypeResolver = c13307q2.f42111g;
            AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
            InterfaceC17524k cpuVitalMonitor = c13307q2.f42112h;
            AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
            InterfaceC17524k memoryVitalMonitor = c13307q2.f42113i;
            AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
            InterfaceC17524k frameRateVitalMonitor = c13307q2.f42114j;
            AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
            C13304N c13304n = c13291a.f42008b;
            C13315Z c13315z3 = new C13315Z(this, interfaceC13823a, c15384c2, c13304n, c13291a.f42010d, c13291a.f42009c, c13323g, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, 0, c13307q2.f42109e, c13307q2.f42116l, 6144);
            c13307q2 = this;
            c13307q2.f42115k = true;
            arrayList.add(c13315z3);
            c13315z3.mo14927b(new C13332p(), writer);
            c13323g.f42271m = new C13306P(c13304n, c13291a.f42009c, true);
            C11691c c11691c = c13307q2.f42118n;
            if (c11691c != null) {
                long j10 = event.mo8622a().f35477b - c11691c.f35477b;
                if (1 <= j10 && j10 < f42104q) {
                    ((C17878e) interfaceC13823a.mo15463s()).m19604c(new C11636v0(j10, 1), AbstractC17660E.m19258c(new C17309l("view_gap", Long.valueOf(j10))), 1.0f);
                } else if (j10 < 0) {
                    ((C17878e) interfaceC13823a.mo15463s()).m19604c(new C11636v0(j10, 2), AbstractC17660E.m19258c(new C17309l("view_gap", Long.valueOf(j10))), 1.0f);
                }
            }
            c13307q2.f42118n = null;
        } else {
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC13303M) it2.next()).mo14926a() && (i10 = i10 + 1) < 0) {
                        AbstractC17681o.m19387p();
                        throw null;
                    }
                }
            }
            if (i10 == 0) {
                boolean z12 = DdRumContentProvider.f35997Y == 100;
                boolean z13 = c13307q2.f42115k;
                EnumC11255b enumC11255b = EnumC11255b.f34098Y;
                Class[] clsArr = f42103p;
                if (z13 || !z12) {
                    if ((event instanceof C13326j) && (((C13326j) event).f42280d instanceof C11260d)) {
                        abstractC8119j5 = event;
                    } else {
                        boolean zM19298e = AbstractC17678l.m19298e(event.getClass(), f42102o);
                        boolean zM19298e2 = AbstractC17678l.m19298e(event.getClass(), clsArr);
                        if (zM19298e && c13307q2.f42108d) {
                            c15384c = c15384c2;
                            z6 = true;
                            C13315Z c13315z4 = new C13315Z(this, interfaceC13823a, c15384c2, new C13304N("com.datadog.background.view", "com/datadog/background/view", "Background"), event.mo8622a(), c17690x, c13323g, c13307q2.f42111g, new C17519f(), new C17519f(), new C17519f(), 3, c13307q2.f42109e, c13307q2.f42116l, 2048);
                            abstractC8119j5 = event;
                            c13315z4.mo14927b(abstractC8119j5, writer);
                            arrayList.add(c13315z4);
                            enumC14426a = null;
                            c13307q = this;
                            c13307q.f42118n = null;
                        } else {
                            abstractC8119j5 = event;
                            enumC14426a = null;
                            c15384c = c15384c2;
                            z6 = true;
                            c13307q = c13307q2;
                            if (!zM19298e2) {
                                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C13322f.f42252o0, null, false, 56);
                            }
                        }
                    }
                    if (abstractC8119j5 instanceof C13326j) {
                        z10 = z6;
                    } else {
                        z10 = abstractC8119j5 instanceof C13294D;
                    }
                    if (z10) {
                        enumC14426a2 = EnumC14426a.f45343o0;
                    } else if (abstractC8119j5 instanceof C13341y) {
                        enumC14426a2 = EnumC14426a.f45341Y;
                    } else if (abstractC8119j5 instanceof C13342z) {
                        enumC14426a2 = EnumC14426a.f45342Z;
                    } else if (abstractC8119j5 instanceof C13328l) {
                        enumC14426a2 = EnumC14426a.f45344p0;
                    } else {
                        enumC14426a2 = enumC14426a;
                    }
                    if (enumC14426a2 != null) {
                        String sessionId = c13307q.f42105a.m14928c().f35458b;
                        AbstractC16544l.m18094g(sessionId, "sessionId");
                        c14428c = (C14428c) ((ConcurrentHashMap) c15384c.f47968o0).get(sessionId);
                        if (c14428c != null) {
                            LinkedHashMap linkedHashMap = c14428c.f45355f;
                            Integer num = (Integer) linkedHashMap.get(enumC14426a2);
                            linkedHashMap.put(enumC14426a2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        }
                        obj = C17296C.f55119a;
                    } else {
                        obj = enumC14426a;
                    }
                    if (obj == null) {
                        return c13307q;
                    }
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, EnumC11255b.f34099Z, C13322f.f42254q0, null, false, 56);
                    return c13307q;
                }
                if (!AbstractC17678l.m19298e(event.getClass(), clsArr)) {
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C13322f.f42253p0, null, false, 56);
                }
                abstractC8119j5 = event;
                enumC14426a = null;
                c15384c = c15384c2;
                z6 = true;
                c13307q = c13307q2;
                if (abstractC8119j5 instanceof C13326j) {
                    z10 = z6;
                } else {
                    z10 = abstractC8119j5 instanceof C13294D;
                }
                if (z10) {
                    enumC14426a2 = EnumC14426a.f45343o0;
                } else if (abstractC8119j5 instanceof C13341y) {
                    enumC14426a2 = EnumC14426a.f45341Y;
                } else if (abstractC8119j5 instanceof C13342z) {
                    enumC14426a2 = EnumC14426a.f45342Z;
                } else if (abstractC8119j5 instanceof C13328l) {
                    enumC14426a2 = EnumC14426a.f45344p0;
                } else {
                    enumC14426a2 = enumC14426a;
                }
                if (enumC14426a2 != null) {
                    String sessionId2 = c13307q.f42105a.m14928c().f35458b;
                    AbstractC16544l.m18094g(sessionId2, "sessionId");
                    c14428c = (C14428c) ((ConcurrentHashMap) c15384c.f47968o0).get(sessionId2);
                    if (c14428c != null) {
                        LinkedHashMap linkedHashMap2 = c14428c.f45355f;
                        Integer num2 = (Integer) linkedHashMap2.get(enumC14426a2);
                        linkedHashMap2.put(enumC14426a2, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                    }
                    obj = C17296C.f55119a;
                } else {
                    obj = enumC14426a;
                }
                if (obj == null) {
                    return c13307q;
                }
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, EnumC11255b.f34099Z, C13322f.f42254q0, null, false, 56);
                return c13307q;
            }
        }
        return c13307q2;
    }
}
