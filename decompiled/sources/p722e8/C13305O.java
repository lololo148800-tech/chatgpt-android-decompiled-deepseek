package p722e8;

import af.C10564U;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p033B5.C0842z;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8119j5;
import p604Yk.C10077b;
import p661b7.InterfaceC11256c;
import p677c8.C11689a;
import p714e0.C13254b;
import p743f7.C13578d;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p781h8.C14427b;
import p781h8.C14428c;
import p781h8.C14429d;
import p781h8.EnumC14426a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.C16360m;
import p861l1.xapn.suYVq;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p918o7.C17878e;

/* JADX INFO: renamed from: e8.O */
/* JADX INFO: loaded from: classes.dex */
public final class C13305O implements InterfaceC13303M {

    /* JADX INFO: renamed from: r */
    public static final long f42080r = TimeUnit.MINUTES.toNanos(15);

    /* JADX INFO: renamed from: s */
    public static final long f42081s = TimeUnit.HOURS.toNanos(4);

    /* JADX INFO: renamed from: a */
    public final C13323g f42082a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13823a f42083b;

    /* JADX INFO: renamed from: c */
    public final C15384c f42084c;

    /* JADX INFO: renamed from: d */
    public final float f42085d;

    /* JADX INFO: renamed from: e */
    public final boolean f42086e;

    /* JADX INFO: renamed from: f */
    public final C10077b f42087f;

    /* JADX INFO: renamed from: g */
    public final long f42088g;

    /* JADX INFO: renamed from: h */
    public final long f42089h;

    /* JADX INFO: renamed from: i */
    public String f42090i;

    /* JADX INFO: renamed from: j */
    public int f42091j;

    /* JADX INFO: renamed from: k */
    public int f42092k;

    /* JADX INFO: renamed from: l */
    public final boolean f42093l;

    /* JADX INFO: renamed from: m */
    public final AtomicLong f42094m;

    /* JADX INFO: renamed from: n */
    public final AtomicLong f42095n;

    /* JADX INFO: renamed from: o */
    public final SecureRandom f42096o;

    /* JADX INFO: renamed from: p */
    public final C13578d f42097p;

    /* JADX INFO: renamed from: q */
    public InterfaceC13303M f42098q;

    public C13305O(C13323g c13323g, InterfaceC13823a interfaceC13823a, C15384c c15384c, float f10, boolean z6, boolean z10, C13323g c13323g2, C13254b firstPartyHostHeaderTypeResolver, InterfaceC17524k cpuVitalMonitor, InterfaceC17524k memoryVitalMonitor, InterfaceC17524k frameRateVitalMonitor, C10077b c10077b, boolean z11) {
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
        AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
        AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
        this.f42082a = c13323g;
        this.f42083b = interfaceC13823a;
        this.f42084c = c15384c;
        this.f42085d = f10;
        this.f42086e = z6;
        this.f42087f = c10077b;
        this.f42088g = f42080r;
        this.f42089h = f42081s;
        this.f42090i = C11689a.f35456p;
        this.f42091j = 1;
        this.f42092k = 1;
        this.f42093l = true;
        this.f42094m = new AtomicLong(System.nanoTime());
        this.f42095n = new AtomicLong(0L);
        this.f42096o = new SecureRandom();
        this.f42097p = new C13578d();
        this.f42098q = new C13307Q(this, interfaceC13823a, c15384c, z6, z10, c13323g2, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, z11, f10);
        interfaceC13823a.mo15460p("rum", new C10564U(this, 24));
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return this.f42093l;
    }

    /* JADX INFO: renamed from: c */
    public final C11689a m14928c() {
        return C11689a.m13025a(this.f42082a.f42269k, this.f42090i, this.f42093l, null, null, null, null, this.f42091j, this.f42092k, 0, null, null, 0L, 0L, 32377);
    }

    /* JADX INFO: renamed from: d */
    public final void m14929d(int i10, long j10) {
        boolean z6 = ((double) this.f42096o.nextFloat()) < ((double) this.f42085d) / 100.0d;
        this.f42092k = i10;
        this.f42091j = z6 ? 2 : 1;
        this.f42090i = AbstractC3794B0.m4498w("randomUUID().toString()");
        this.f42094m.set(j10);
        if (z6) {
            String sessionId = this.f42090i;
            long j11 = this.f42083b.getTime().f35450d;
            C15384c c15384c = this.f42084c;
            AbstractC16544l.m18094g(sessionId, "sessionId");
            AbstractC14376f.m15825D(i10, "startReason");
            ((ConcurrentHashMap) c15384c.f47968o0).put(sessionId, new C14428c(sessionId, i10, j11, this.f42086e));
        }
        this.f42087f.mo10266o(this.f42090i, !z6);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0293 A[LOOP:0: B:101:0x028d->B:103:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:110:0x0314  */
    /* JADX WARN: Code duplicated, block: B:111:0x0319  */
    /* JADX WARN: Code duplicated, block: B:114:0x032f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0334  */
    /* JADX WARN: Code duplicated, block: B:118:0x034c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0351  */
    /* JADX WARN: Code duplicated, block: B:173:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0283  */
    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final InterfaceC13303M mo14927b(AbstractC8119j5 event, InterfaceC13575a writer) {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        InterfaceC13823a interfaceC13823a;
        Collection collectionValues;
        Iterator it;
        int i10;
        Collection collectionValues2;
        Iterator it2;
        int i11;
        Collection collectionValues3;
        Iterator it3;
        int i12;
        InterfaceC13823a interfaceC13823a2;
        int size;
        int iM19257b;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Integer num3;
        int iIntValue3;
        Integer num4;
        int iIntValue4;
        C13305O c13305o;
        int i13;
        int i14;
        boolean z13 = this.f42093l;
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(writer, "writer");
        long jNanoTime = System.nanoTime();
        boolean zM18089b = AbstractC16544l.m18089b(this.f42090i, C11689a.f35456p);
        AtomicLong atomicLong = this.f42095n;
        boolean z14 = jNanoTime - atomicLong.get() >= this.f42088g;
        boolean z15 = jNanoTime - this.f42094m.get() >= this.f42089h;
        boolean z16 = (event instanceof C13291A) || (event instanceof C13341y);
        boolean zM19298e = AbstractC17678l.m19298e(event.getClass(), C13307Q.f42102o);
        boolean z17 = event instanceof C13338v;
        boolean z18 = z17 && ((C13338v) event).f42312b;
        boolean z19 = z17 && !((C13338v) event).f42312b;
        InterfaceC13823a interfaceC13823a3 = this.f42083b;
        if (z14 || z15 || !z13) {
            String sessionId = this.f42090i;
            z6 = zM18089b;
            long j10 = interfaceC13823a3.getTime().f35450d;
            C15384c c15384c = this.f42084c;
            AbstractC16544l.m18094g(sessionId, "sessionId");
            z10 = z13;
            C14428c c14428c = (C14428c) ((ConcurrentHashMap) c15384c.f47968o0).remove(sessionId);
            if (c14428c != null) {
                C14429d c14429d = C14429d.f45359Y;
                C17309l c17309l = new C17309l("metric_type", "rum session ended");
                C17309l c17309l2 = new C17309l("process_type", "app");
                C17309l c17309l3 = new C17309l("precondition", AbstractC12107L1.m13815f(c14428c.f45358i));
                C14427b c14427b = c14428c.f45357h;
                if (c14427b != null) {
                    C14427b c14427b2 = c14428c.f45356g;
                    Long lValueOf = c14427b2 != null ? Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c14427b.f45347b - c14427b2.f45347b) + c14427b.f45348c) : null;
                    long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                    C17309l c17309l4 = new C17309l("duration", Long.valueOf(jLongValue));
                    C17309l c17309l5 = new C17309l("was_stopped", Boolean.FALSE);
                    LinkedHashMap linkedHashMap2 = c14428c.f45353d;
                    C17309l c17309l6 = new C17309l("total", Integer.valueOf(linkedHashMap2.size()));
                    collectionValues = linkedHashMap2.values();
                    if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        it = collectionValues.iterator();
                        i10 = 0;
                        while (it.hasNext()) {
                            Iterator it5 = it;
                            boolean z20 = z14;
                            if (!AbstractC16544l.m18089b(((C14427b) it.next()).f45346a, "com/datadog/background/view") && (i10 = i10 + 1) < 0) {
                                AbstractC17681o.m19387p();
                                throw null;
                            }
                            z14 = z20;
                            it = it5;
                        }
                        z11 = z14;
                    } else {
                        z11 = z14;
                        i10 = 0;
                    }
                    C17309l c17309l7 = new C17309l("background", Integer.valueOf(i10));
                    collectionValues2 = linkedHashMap2.values();
                    if ((collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        it2 = collectionValues2.iterator();
                        i11 = 0;
                        while (it2.hasNext()) {
                            Iterator it6 = it2;
                            boolean z21 = z16;
                            if (!AbstractC16544l.m18089b(((C14427b) it2.next()).f45346a, "com/datadog/application-launch/view") && (i11 = i11 + 1) < 0) {
                                AbstractC17681o.m19387p();
                                throw null;
                            }
                            z16 = z21;
                            it2 = it6;
                        }
                        z12 = z16;
                    } else {
                        z12 = z16;
                        i11 = 0;
                    }
                    C17309l c17309l8 = new C17309l("app_launch", Integer.valueOf(i11));
                    collectionValues3 = linkedHashMap2.values();
                    if ((collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
                        it3 = collectionValues3.iterator();
                        i12 = 0;
                        while (it3.hasNext()) {
                            if (!((C14427b) it3.next()).f45349d && (i12 = i12 + 1) < 0) {
                                AbstractC17681o.m19387p();
                                throw null;
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    interfaceC13823a2 = interfaceC13823a3;
                    C17309l c17309l9 = new C17309l("views_count", AbstractC17659D.m19244f(c17309l6, c17309l7, c17309l8, new C17309l("with_has_replay", Integer.valueOf(i12))));
                    LinkedHashMap linkedHashMap3 = c14428c.f45354e;
                    C17309l c17309l10 = new C17309l("total", Integer.valueOf(AbstractC17680n.m19372v0(linkedHashMap3.values())));
                    size = linkedHashMap3.size();
                    if (5 <= size) {
                        size = 5;
                    }
                    List listSubList = AbstractC17680n.m19370t0(linkedHashMap3.entrySet(), new C0842z(13)).subList(0, size);
                    iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(listSubList, 10));
                    if (iM19257b < 16) {
                        iM19257b = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM19257b);
                    it4 = listSubList.iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        String input = (String) entry.getKey();
                        Iterator it7 = it4;
                        Pattern patternCompile = Pattern.compile("[^\\w']+");
                        InterfaceC13823a interfaceC13823a4 = interfaceC13823a2;
                        AbstractC16544l.m18093f(patternCompile, "compile(...)");
                        AbstractC16544l.m18094g(input, "input");
                        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                        AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
                        linkedHashMap.put(strReplaceAll, entry.getValue());
                        interfaceC13823a2 = interfaceC13823a4;
                        it4 = it7;
                    }
                    interfaceC13823a = interfaceC13823a2;
                    C17309l c17309l11 = new C17309l("sdk_errors_count", AbstractC17659D.m19244f(c17309l10, new C17309l("by_kind", linkedHashMap)));
                    LinkedHashMap linkedHashMap4 = c14428c.f45355f;
                    num = (Integer) linkedHashMap4.get(EnumC14426a.f45341Y);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C17309l c17309l12 = new C17309l("actions", Integer.valueOf(iIntValue));
                    num2 = (Integer) linkedHashMap4.get(EnumC14426a.f45342Z);
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    C17309l c17309l13 = new C17309l("resources", Integer.valueOf(iIntValue2));
                    num3 = (Integer) linkedHashMap4.get(EnumC14426a.f45343o0);
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    C17309l c17309l14 = new C17309l("errors", Integer.valueOf(iIntValue3));
                    num4 = (Integer) linkedHashMap4.get(EnumC14426a.f45344p0);
                    if (num4 != null) {
                        iIntValue4 = num4.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    ((C17878e) ((InterfaceC11256c) c15384c.f47967Z)).m19604c(c14429d, AbstractC17659D.m19244f(c17309l, new C17309l("rse", AbstractC17659D.m19244f(c17309l2, c17309l3, c17309l4, c17309l5, c17309l9, c17309l11, new C17309l("no_view_events_count", AbstractC17659D.m19244f(c17309l12, c17309l13, c17309l14, new C17309l(suYVq.fcSDc, Integer.valueOf(iIntValue4)))), new C17309l("has_background_events_tracking_enabled", Boolean.valueOf(c14428c.f45352c)), new C17309l("ntp_offset", AbstractC17659D.m19244f(new C17309l("at_start", Long.valueOf(c14428c.f45351b)), new C17309l("at_end", Long.valueOf(j10))))))), 100.0f);
                } else {
                    c14429d = c14429d;
                    jNanoTime = jNanoTime;
                    zM19298e = zM19298e;
                    z14 = z14;
                }
                C17309l c17309l15 = new C17309l("duration", Long.valueOf(jLongValue));
                C17309l c17309l16 = new C17309l("was_stopped", Boolean.FALSE);
                LinkedHashMap linkedHashMap5 = c14428c.f45353d;
                C17309l c17309l17 = new C17309l("total", Integer.valueOf(linkedHashMap5.size()));
                collectionValues = linkedHashMap5.values();
                if (collectionValues instanceof Collection) {
                    it = collectionValues.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        Iterator it8 = it;
                        boolean z22 = z14;
                        if (!AbstractC16544l.m18089b(((C14427b) it.next()).f45346a, "com/datadog/background/view")) {
                        }
                        z14 = z22;
                        it = it8;
                    }
                    z11 = z14;
                } else {
                    it = collectionValues.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        Iterator it9 = it;
                        boolean z23 = z14;
                        if (!AbstractC16544l.m18089b(((C14427b) it.next()).f45346a, "com/datadog/background/view")) {
                        }
                        z14 = z23;
                        it = it9;
                    }
                    z11 = z14;
                }
                C17309l c17309l18 = new C17309l("background", Integer.valueOf(i10));
                collectionValues2 = linkedHashMap5.values();
                if (collectionValues2 instanceof Collection) {
                    it2 = collectionValues2.iterator();
                    i11 = 0;
                    while (it2.hasNext()) {
                        Iterator it10 = it2;
                        boolean z24 = z16;
                        if (!AbstractC16544l.m18089b(((C14427b) it2.next()).f45346a, "com/datadog/application-launch/view")) {
                        }
                        z16 = z24;
                        it2 = it10;
                    }
                    z12 = z16;
                } else {
                    it2 = collectionValues2.iterator();
                    i11 = 0;
                    while (it2.hasNext()) {
                        Iterator it11 = it2;
                        boolean z25 = z16;
                        if (!AbstractC16544l.m18089b(((C14427b) it2.next()).f45346a, "com/datadog/application-launch/view")) {
                        }
                        z16 = z25;
                        it2 = it11;
                    }
                    z12 = z16;
                }
                C17309l c17309l19 = new C17309l("app_launch", Integer.valueOf(i11));
                collectionValues3 = linkedHashMap5.values();
                if (collectionValues3 instanceof Collection) {
                    it3 = collectionValues3.iterator();
                    i12 = 0;
                    while (it3.hasNext()) {
                        if (!((C14427b) it3.next()).f45349d) {
                        }
                    }
                } else {
                    it3 = collectionValues3.iterator();
                    i12 = 0;
                    while (it3.hasNext()) {
                        if (!((C14427b) it3.next()).f45349d) {
                        }
                    }
                }
                interfaceC13823a2 = interfaceC13823a3;
                C17309l c17309l20 = new C17309l("views_count", AbstractC17659D.m19244f(c17309l17, c17309l18, c17309l19, new C17309l("with_has_replay", Integer.valueOf(i12))));
                LinkedHashMap linkedHashMap6 = c14428c.f45354e;
                C17309l c17309l110 = new C17309l("total", Integer.valueOf(AbstractC17680n.m19372v0(linkedHashMap6.values())));
                size = linkedHashMap6.size();
                if (5 <= size) {
                    size = 5;
                }
                List listSubList2 = AbstractC17680n.m19370t0(linkedHashMap6.entrySet(), new C0842z(13)).subList(0, size);
                iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(listSubList2, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                linkedHashMap = new LinkedHashMap(iM19257b);
                it4 = listSubList2.iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    String input2 = (String) entry2.getKey();
                    Iterator it12 = it4;
                    Pattern patternCompile2 = Pattern.compile("[^\\w']+");
                    InterfaceC13823a interfaceC13823a5 = interfaceC13823a2;
                    AbstractC16544l.m18093f(patternCompile2, "compile(...)");
                    AbstractC16544l.m18094g(input2, "input");
                    String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("_");
                    AbstractC16544l.m18093f(strReplaceAll2, "replaceAll(...)");
                    linkedHashMap.put(strReplaceAll2, entry2.getValue());
                    interfaceC13823a2 = interfaceC13823a5;
                    it4 = it12;
                }
                interfaceC13823a = interfaceC13823a2;
                C17309l c17309l111 = new C17309l("sdk_errors_count", AbstractC17659D.m19244f(c17309l110, new C17309l("by_kind", linkedHashMap)));
                LinkedHashMap linkedHashMap7 = c14428c.f45355f;
                num = (Integer) linkedHashMap7.get(EnumC14426a.f45341Y);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                C17309l c17309l112 = new C17309l("actions", Integer.valueOf(iIntValue));
                num2 = (Integer) linkedHashMap7.get(EnumC14426a.f45342Z);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                C17309l c17309l113 = new C17309l("resources", Integer.valueOf(iIntValue2));
                num3 = (Integer) linkedHashMap7.get(EnumC14426a.f45343o0);
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                C17309l c17309l114 = new C17309l("errors", Integer.valueOf(iIntValue3));
                num4 = (Integer) linkedHashMap7.get(EnumC14426a.f45344p0);
                if (num4 != null) {
                    iIntValue4 = num4.intValue();
                } else {
                    iIntValue4 = 0;
                }
                ((C17878e) ((InterfaceC11256c) c15384c.f47967Z)).m19604c(c14429d, AbstractC17659D.m19244f(c17309l, new C17309l("rse", AbstractC17659D.m19244f(c17309l2, c17309l3, c17309l15, c17309l16, c17309l20, c17309l111, new C17309l("no_view_events_count", AbstractC17659D.m19244f(c17309l112, c17309l113, c17309l114, new C17309l(suYVq.fcSDc, Integer.valueOf(iIntValue4)))), new C17309l("has_background_events_tracking_enabled", Boolean.valueOf(c14428c.f45352c)), new C17309l("ntp_offset", AbstractC17659D.m19244f(new C17309l("at_start", Long.valueOf(c14428c.f45351b)), new C17309l("at_end", Long.valueOf(j10))))))), 100.0f);
            } else {
                z11 = z14;
                z12 = z16;
                jNanoTime = jNanoTime;
                zM19298e = zM19298e;
                interfaceC13823a = interfaceC13823a3;
            }
        } else {
            z10 = z13;
            z11 = z14;
            interfaceC13823a = interfaceC13823a3;
            z12 = z16;
            z6 = zM18089b;
            jNanoTime = jNanoTime;
            zM19298e = zM19298e;
        }
        if (z12 || z18) {
            c13305o = this;
            long j11 = jNanoTime;
            if (z6 || z11 || z15 != 0) {
                if (z6) {
                    i13 = 1;
                } else {
                    i13 = z11 ? 2 : 3;
                }
                c13305o.m14929d(i13, j11);
            }
            atomicLong.set(j11);
        } else if (z11) {
            c13305o = this;
            if (c13305o.f42086e && (zM19298e || z19)) {
                long j12 = jNanoTime;
                c13305o.m14929d(2, j12);
                atomicLong.set(j12);
            } else {
                c13305o.f42091j = 3;
            }
        } else {
            c13305o = this;
            long j13 = jNanoTime;
            if (z15) {
                c13305o.m14929d(3, j13);
            }
        }
        int i15 = c13305o.f42091j;
        String str = c13305o.f42090i;
        boolean z26 = i15 == 2;
        C16360m c16360mMo15458n = interfaceC13823a.mo15458n("session-replay");
        if (c16360mMo15458n != null) {
            i14 = 2;
            c16360mMo15458n.m17960a(AbstractC17659D.m19244f(new C17309l("type", "rum_session_renewed"), new C17309l("keepSession", Boolean.valueOf(z26)), new C17309l("sessionId", str)));
        } else {
            i14 = 2;
        }
        InterfaceC13575a interfaceC13575a = c13305o.f42091j == i14 ? writer : c13305o.f42097p;
        if (!z17) {
            InterfaceC13303M interfaceC13303M = c13305o.f42098q;
            c13305o.f42098q = interfaceC13303M != null ? interfaceC13303M.mo14927b(event, interfaceC13575a) : null;
        }
        if (z10 || c13305o.f42098q != null) {
            return c13305o;
        }
        return null;
    }
}
