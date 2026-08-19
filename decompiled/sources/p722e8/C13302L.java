package p722e8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p035B7.C0846c;
import p087D7.AbstractC1976c;
import p1113xn.AbstractC21322p;
import p228J.AbstractC3794B0;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9150J;
import p592Y7.AbstractC9667b;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11685d;
import p677c8.C11689a;
import p677c8.C11691c;
import p700d8.C13040a;
import p714e0.C13254b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p888m8.C17198c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p919o8.AbstractC17962d;
import p919o8.C17952Z0;
import p919o8.C17972g0;
import p919o8.C17985k1;

/* JADX INFO: renamed from: e8.L */
/* JADX INFO: loaded from: classes.dex */
public final class C13302L implements InterfaceC13303M {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f42062a;

    /* JADX INFO: renamed from: b */
    public final String f42063b;

    /* JADX INFO: renamed from: c */
    public final int f42064c;

    /* JADX INFO: renamed from: d */
    public final Object f42065d;

    /* JADX INFO: renamed from: e */
    public final C13254b f42066e;

    /* JADX INFO: renamed from: f */
    public final C7591u f42067f;

    /* JADX INFO: renamed from: g */
    public final float f42068g;

    /* JADX INFO: renamed from: h */
    public final String f42069h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f42070i;

    /* JADX INFO: renamed from: j */
    public final C11689a f42071j;

    /* JADX INFO: renamed from: k */
    public final long f42072k;

    /* JADX INFO: renamed from: l */
    public final long f42073l;

    /* JADX INFO: renamed from: m */
    public final C11685d f42074m;

    /* JADX INFO: renamed from: n */
    public boolean f42075n;

    /* JADX INFO: renamed from: o */
    public boolean f42076o;

    public C13302L(C13315Z c13315z, InterfaceC13823a interfaceC13823a, String str, int i10, Object obj, C11691c c11691c, LinkedHashMap linkedHashMap, long j10, C13254b firstPartyHostHeaderTypeResolver, C7591u c7591u, float f10) {
        AbstractC14376f.m15825D(i10, "method");
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        this.f42062a = interfaceC13823a;
        this.f42063b = str;
        this.f42064c = i10;
        this.f42065d = obj;
        this.f42066e = firstPartyHostHeaderTypeResolver;
        this.f42067f = c7591u;
        this.f42068g = f10;
        this.f42069h = AbstractC3794B0.m4498w("randomUUID().toString()");
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap);
        linkedHashMapM19256r.putAll(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
        this.f42070i = linkedHashMapM19256r;
        this.f42071j = c13315z.m14932d();
        this.f42072k = c11691c.f35476a + j10;
        this.f42073l = c11691c.f35477b;
        this.f42074m = interfaceC13823a.mo15450f();
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return !this.f42076o;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x039b  */
    /* JADX WARN: Code duplicated, block: B:177:0x039e  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final InterfaceC13303M mo14927b(AbstractC8119j5 event, InterfaceC13575a writer) {
        C13302L c13302l;
        InterfaceC13303M interfaceC13303M;
        C17972g0 c17972g0;
        InterfaceC13303M interfaceC13303M2;
        C13302L c13302l2;
        String str;
        C13040a c13040a;
        C13040a c13040a2;
        C13317a0 c13317a0;
        int iM19643d0;
        String str2;
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(writer, "writer");
        boolean z6 = event instanceof C13293C;
        LinkedHashMap linkedHashMap = this.f42070i;
        Object obj = this.f42065d;
        C11689a c11689a = this.f42071j;
        InterfaceC13823a interfaceC13823a = this.f42062a;
        if (!z6) {
            c13302l = this;
            if (event instanceof C13294D) {
                C13294D c13294d = (C13294D) event;
                if (obj.equals(c13294d.f42020b)) {
                    linkedHashMap.putAll(c13294d.f42025g);
                    Throwable th2 = c13294d.f42024f;
                    String strM3148e = AbstractC1976c.m3148e(th2);
                    String canonicalName = th2.getClass().getCanonicalName();
                    linkedHashMap.putAll(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
                    Object objRemove = linkedHashMap.remove("_dd.error.fingerprint");
                    String str3 = objRemove instanceof String ? (String) objRemove : null;
                    LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap);
                    String str4 = c11689a.f35464h;
                    if (str4 == null || AbstractC21322p.m21681O(str4) || (str = c11689a.f35465i) == null || AbstractC21322p.m21681O(str)) {
                        interfaceC13303M = null;
                        c17972g0 = null;
                    } else {
                        String str5 = c11689a.f35464h;
                        interfaceC13303M = null;
                        c17972g0 = new C17972g0(str5, str, null);
                    }
                    interfaceC13303M2 = interfaceC13303M;
                    C17198c c17198cM9697b = AbstractC9150J.m9697b(interfaceC13823a, writer, 1, new C13299I(this, c11689a, c13294d.f42023e, c13294d.f42021c, c13294d.f42022d, strM3148e, str3, canonicalName, c17972g0 == null ? 1 : 2, linkedHashMapM19256r, c17972g0));
                    c17198cM9697b.f54904e = new C13300J(c11689a, 0);
                    c17198cM9697b.f54905f = new C13300J(c11689a, 1);
                    c17198cM9697b.m18940m();
                    c13302l2 = this;
                    c13302l2.f42075n = true;
                }
            }
            return c13302l2.f42075n ? interfaceC13303M2 : c13302l2;
        }
        C13293C c13293c = (C13293C) event;
        if (obj.equals(c13293c.f42014b)) {
            this.f42076o = true;
            linkedHashMap.putAll(c13293c.f42018f);
            C11691c c11691c = c13293c.f42019g;
            linkedHashMap.putAll(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
            Object objRemove2 = linkedHashMap.remove("_dd.trace_id");
            String string = objRemove2 != null ? objRemove2.toString() : null;
            Object objRemove3 = linkedHashMap.remove("_dd.span_id");
            String string2 = objRemove3 != null ? objRemove3.toString() : null;
            Object objRemove4 = linkedHashMap.remove("_dd.rule_psr");
            Number number = objRemove4 instanceof Number ? (Number) objRemove4 : null;
            String str6 = c11689a.f35464h;
            C17985k1 c17985k1 = (str6 == null || AbstractC21322p.m21681O(str6) || (str2 = c11689a.f35465i) == null || AbstractC21322p.m21681O(str2)) ? null : new C17985k1(c11689a.f35464h, str2, null);
            int i10 = c17985k1 == null ? 1 : 2;
            Object objRemove5 = linkedHashMap.remove("_dd.resource_timings");
            Map map = objRemove5 instanceof Map ? (Map) objRemove5 : null;
            if (map == null) {
                List list = AbstractC13316a.f42208a;
                c13040a2 = null;
            } else {
                List list2 = AbstractC13316a.f42208a;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b);
                for (Object obj2 : list2) {
                    Object obj3 = map.get((String) obj2);
                    if (obj3 == null || !(obj3 instanceof Map)) {
                        c13317a0 = null;
                    } else {
                        Map map2 = (Map) obj3;
                        Object obj4 = map2.get("startTime");
                        Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                        Long lValueOf = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        Object obj5 = map2.get("duration");
                        Number number3 = obj5 instanceof Number ? (Number) obj5 : null;
                        Long lValueOf2 = number3 != null ? Long.valueOf(number3.longValue()) : null;
                        if (lValueOf == null || lValueOf2 == null) {
                            c13317a0 = null;
                        } else {
                            c13317a0 = new C13317a0(lValueOf.longValue(), lValueOf2.longValue());
                        }
                    }
                    linkedHashMap2.put(obj2, c13317a0);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((C13317a0) entry.getValue()) != null) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap3.isEmpty()) {
                    c13040a = null;
                } else {
                    C13317a0 c13317a1 = (C13317a0) linkedHashMap3.get("firstByte");
                    long j10 = c13317a1 != null ? c13317a1.f42209a : 0L;
                    C13317a0 c13317a2 = (C13317a0) linkedHashMap3.get("firstByte");
                    long j11 = c13317a2 != null ? c13317a2.f42210b : 0L;
                    C13317a0 c13317a3 = (C13317a0) linkedHashMap3.get("download");
                    long j12 = c13317a3 != null ? c13317a3.f42209a : 0L;
                    C13317a0 c13317a4 = (C13317a0) linkedHashMap3.get("download");
                    long j13 = c13317a4 != null ? c13317a4.f42210b : 0L;
                    C13317a0 c13317a5 = (C13317a0) linkedHashMap3.get("dns");
                    long j14 = c13317a5 != null ? c13317a5.f42209a : 0L;
                    C13317a0 c13317a6 = (C13317a0) linkedHashMap3.get("dns");
                    long j15 = c13317a6 != null ? c13317a6.f42210b : 0L;
                    C13317a0 c13317a7 = (C13317a0) linkedHashMap3.get("connect");
                    long j16 = c13317a7 != null ? c13317a7.f42209a : 0L;
                    C13317a0 c13317a8 = (C13317a0) linkedHashMap3.get("connect");
                    long j17 = c13317a8 != null ? c13317a8.f42210b : 0L;
                    C13317a0 c13317a9 = (C13317a0) linkedHashMap3.get("ssl");
                    long j18 = c13317a9 != null ? c13317a9.f42209a : 0L;
                    C13317a0 c13317a10 = (C13317a0) linkedHashMap3.get("ssl");
                    c13040a = new C13040a(j14, j15, j16, j17, j18, c13317a10 != null ? c13317a10.f42210b : 0L, j10, j11, j12, j13);
                }
                c13040a2 = c13040a;
            }
            Object objRemove6 = linkedHashMap.remove("_dd.graphql.operation_type");
            String str7 = objRemove6 instanceof String ? (String) objRemove6 : null;
            Object objRemove7 = linkedHashMap.remove("_dd.graphql.operation_name");
            String str8 = objRemove7 instanceof String ? (String) objRemove7 : null;
            Object objRemove8 = linkedHashMap.remove("_dd.graphql.payload");
            String str9 = objRemove8 instanceof String ? (String) objRemove8 : null;
            Object objRemove9 = linkedHashMap.remove("_dd.graphql.variables");
            String str10 = objRemove9 instanceof String ? (String) objRemove9 : null;
            if (str7 != null) {
                InterfaceC11256c internalLogger = interfaceC13823a.mo15463s();
                AbstractC16544l.m18094g(internalLogger, "internalLogger");
                try {
                    Locale US = Locale.US;
                    AbstractC16544l.m18093f(US, "US");
                    String upperCase = str7.toUpperCase(US);
                    AbstractC16544l.m18093f(upperCase, "toUpperCase(...)");
                    iM19643d0 = AbstractC17962d.m19643d0(upperCase);
                } catch (IllegalArgumentException e10) {
                    AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0846c(str7, 12), e10, 48);
                    iM19643d0 = 0;
                }
                C17952Z0 c17952z0 = iM19643d0 != 0 ? new C17952Z0(iM19643d0, str8, str9, str10) : null;
                C17198c c17198cM9697b2 = AbstractC9150J.m9697b(interfaceC13823a, writer, 1, new C13301K(this, c11689a, c11691c, c13293c.f42017e, c13040a2, c13293c.f42015c, c13293c.f42016d, c17952z0, i10, AbstractC17659D.m19256r(linkedHashMap), string2, string, number, c17985k1));
                c17198cM9697b2.f54904e = new C13300J(c11689a, 2);
                c17198cM9697b2.f54905f = new C13300J(c11689a, 3);
                c17198cM9697b2.m18940m();
                c13302l = this;
                c13302l.f42075n = true;
            }
            C17198c c17198cM9697b3 = AbstractC9150J.m9697b(interfaceC13823a, writer, 1, new C13301K(this, c11689a, c11691c, c13293c.f42017e, c13040a2, c13293c.f42015c, c13293c.f42016d, c17952z0, i10, AbstractC17659D.m19256r(linkedHashMap), string2, string, number, c17985k1));
            c17198cM9697b3.f54904e = new C13300J(c11689a, 2);
            c17198cM9697b3.f54905f = new C13300J(c11689a, 3);
            c17198cM9697b3.m18940m();
            c13302l = this;
            c13302l.f42075n = true;
        } else {
            c13302l = this;
        }
        c13302l2 = c13302l;
        interfaceC13303M2 = null;
        if (c13302l2.f42075n) {
        }
    }
}
