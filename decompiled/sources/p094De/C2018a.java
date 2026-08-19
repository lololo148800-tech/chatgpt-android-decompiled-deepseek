package p094De;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p1155zi.C22011h0;
import p120Ee.C2412f;
import p120Ee.C2423q;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p313Mc.C5317a;
import p403Qd.C6636i;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: De.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2018a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C2029l f6183Y;

    /* JADX INFO: renamed from: Z */
    public C5317a f6184Z;

    /* JADX INFO: renamed from: o0 */
    public List f6185o0;

    /* JADX INFO: renamed from: p0 */
    public Iterator f6186p0;

    /* JADX INFO: renamed from: q0 */
    public int f6187q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C2029l f6188r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2018a(C2029l c2029l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6188r0 = c2029l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2018a(this.f6188r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2018a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5 A[Catch: all -> 0x0022, Exception -> 0x0025, TryCatch #2 {all -> 0x0022, blocks: (B:8:0x001d, B:51:0x00c3, B:53:0x00c9, B:57:0x00e8, B:60:0x0101, B:61:0x010a, B:63:0x0110, B:64:0x0122, B:66:0x012a, B:17:0x0034, B:47:0x00ab, B:48:0x00ad, B:50:0x00b5, B:20:0x003d, B:30:0x0072, B:41:0x0086), top: B:73:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9 A[Catch: all -> 0x0022, Exception -> 0x0025, TryCatch #2 {all -> 0x0022, blocks: (B:8:0x001d, B:51:0x00c3, B:53:0x00c9, B:57:0x00e8, B:60:0x0101, B:61:0x010a, B:63:0x0110, B:64:0x0122, B:66:0x012a, B:17:0x0034, B:47:0x00ab, B:48:0x00ad, B:50:0x00b5, B:20:0x003d, B:30:0x0072, B:41:0x0086), top: B:73:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110 A[Catch: all -> 0x0022, Exception -> 0x0025, LOOP:1: B:61:0x010a->B:63:0x0110, LOOP_END, TryCatch #2 {all -> 0x0022, blocks: (B:8:0x001d, B:51:0x00c3, B:53:0x00c9, B:57:0x00e8, B:60:0x0101, B:61:0x010a, B:63:0x0110, B:64:0x0122, B:66:0x012a, B:17:0x0034, B:47:0x00ab, B:48:0x00ad, B:50:0x00b5, B:20:0x003d, B:30:0x0072, B:41:0x0086), top: B:73:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:0: B:51:0x00c3->B:81:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [Mc.a] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [Mc.a] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2029l c2029l;
        ?? r10;
        C5317a c5317a;
        IllegalArgumentException e10;
        Object objM1168P;
        List list;
        C5317a c5317a2;
        Iterator it;
        List list2;
        int iM19257b;
        LinkedHashMap linkedHashMap;
        C5317a c5317a3;
        C2423q c2423q;
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6187q0;
        C17296C c17296c = C17296C.f55119a;
        ?? r11 = 1;
        ?? r12 = 1;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        c5317a = this.f6184Z;
                        c2029l = this.f6183Y;
                        try {
                            AbstractC9233X.m9807c(obj);
                            c5317a = c5317a;
                        } catch (IllegalArgumentException e11) {
                            e10 = e11;
                            AbstractC8160o6.m8731f(c2029l.f6229b, "Error deserializing persisted conversations", e10, null, 4);
                            C2423q c2423q2 = c2029l.f6228a;
                            this.f6183Y = c2029l;
                            this.f6184Z = c5317a;
                            this.f6187q0 = 2;
                            C3516e c3516e = AbstractC0593T.f1824a;
                            objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2412f(c2423q2, null), this);
                            if (objM1168P == EnumC19250a.f61036Y) {
                                objM1168P = c17296c;
                            }
                            if (objM1168P == enumC19250a) {
                                return enumC19250a;
                            }
                            list = C17689w.f56480Y;
                            c5317a2 = c5317a;
                        }
                    } else {
                        if (i10 == 2) {
                            c5317a = this.f6184Z;
                            c2029l = this.f6183Y;
                            AbstractC9233X.m9807c(obj);
                            list = C17689w.f56480Y;
                            c5317a2 = c5317a;
                            r11 = c5317a2;
                            if (list.size() > 1000) {
                                it = AbstractC17680n.m19336L(list, 1000).iterator();
                                list2 = list;
                                c5317a3 = c5317a2;
                            }
                            C2153Q0 c2153q0 = c2029l.f6231d;
                            Map map = (Map) c2153q0.getValue();
                            List list3 = list;
                            iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list3, 10));
                            if (iM19257b < 16) {
                                iM19257b = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iM19257b);
                            for (Object obj2 : list3) {
                                linkedHashMap.put(new C22011h0(((C6636i) obj2).f21379a), obj2);
                            }
                            c2153q0.m3251l(null, AbstractC17659D.m19248j(map, linkedHashMap));
                            r10 = r11;
                            r10.m5875a();
                            return c17296c;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = this.f6186p0;
                        list2 = this.f6185o0;
                        C5317a c5317a4 = this.f6184Z;
                        c2029l = this.f6183Y;
                        AbstractC9233X.m9807c(obj);
                        c5317a3 = c5317a4;
                    }
                    while (it.hasNext()) {
                        C6636i c6636i = (C6636i) it.next();
                        c2423q = c2029l.f6228a;
                        str = c6636i.f21379a;
                        this.f6183Y = c2029l;
                        this.f6184Z = c5317a3;
                        this.f6185o0 = list2;
                        this.f6186p0 = it;
                        this.f6187q0 = 3;
                        if (c2423q.m3579d(str, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    list = list2;
                    r11 = c5317a3;
                    C2153Q0 c2153q1 = c2029l.f6231d;
                    Map map2 = (Map) c2153q1.getValue();
                    List list4 = list;
                    iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list4, 10));
                    if (iM19257b < 16) {
                        iM19257b = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM19257b);
                    while (r12.hasNext()) {
                        linkedHashMap.put(new C22011h0(((C6636i) obj2).f21379a), obj2);
                    }
                    c2153q1.m3251l(null, AbstractC17659D.m19248j(map2, linkedHashMap));
                    r10 = r11;
                    r10.m5875a();
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                EnumC21542a enumC21542a = EnumC21542a.f68237p0;
                c2029l = this.f6188r0;
                C5317a c5317aM5877a = AbstractC21544c.m21827a().m5877a(enumC21542a, null);
                try {
                    c5317aM5877a.m5876b();
                    try {
                        C2423q c2423q3 = c2029l.f6228a;
                        boolean zBooleanValue = ((Boolean) c2029l.f6230c.getValue()).booleanValue();
                        this.f6183Y = c2029l;
                        this.f6184Z = c5317aM5877a;
                        this.f6187q0 = 1;
                        Object objM3580e = c2423q3.m3580e(zBooleanValue, this);
                        if (objM3580e == enumC19250a) {
                            return enumC19250a;
                        }
                        c5317a = c5317aM5877a;
                        obj = objM3580e;
                    } catch (IllegalArgumentException e12) {
                        c5317a = c5317aM5877a;
                        e10 = e12;
                        AbstractC8160o6.m8731f(c2029l.f6229b, "Error deserializing persisted conversations", e10, null, 4);
                        C2423q c2423q4 = c2029l.f6228a;
                        this.f6183Y = c2029l;
                        this.f6184Z = c5317a;
                        this.f6187q0 = 2;
                        C3516e c3516e2 = AbstractC0593T.f1824a;
                        objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2412f(c2423q4, null), this);
                        if (objM1168P == EnumC19250a.f61036Y) {
                            objM1168P = c17296c;
                        }
                        if (objM1168P == enumC19250a) {
                            return enumC19250a;
                        }
                        list = C17689w.f56480Y;
                        c5317a2 = c5317a;
                    } catch (Exception e13) {
                        r11 = c5317aM5877a;
                        e = e13;
                        AbstractC8160o6.m8727b(c2029l.f6229b, "Database error", e, 4);
                        r10 = r11;
                        r10.m5875a();
                        return c17296c;
                    }
                } catch (Throwable th2) {
                    r12 = c5317aM5877a;
                    th = th2;
                    r12.m5875a();
                    throw th;
                }
                list = (List) obj;
                c5317a2 = c5317a;
                r11 = c5317a2;
                if (list.size() > 1000) {
                    it = AbstractC17680n.m19336L(list, 1000).iterator();
                    list2 = list;
                    c5317a3 = c5317a2;
                    while (it.hasNext()) {
                        C6636i c6636i2 = (C6636i) it.next();
                        c2423q = c2029l.f6228a;
                        str = c6636i2.f21379a;
                        this.f6183Y = c2029l;
                        this.f6184Z = c5317a3;
                        this.f6185o0 = list2;
                        this.f6186p0 = it;
                        this.f6187q0 = 3;
                        if (c2423q.m3579d(str, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    list = list2;
                    r11 = c5317a3;
                }
                C2153Q0 c2153q2 = c2029l.f6231d;
                Map map3 = (Map) c2153q2.getValue();
                List list5 = list;
                iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list5, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                linkedHashMap = new LinkedHashMap(iM19257b);
                while (r12.hasNext()) {
                    linkedHashMap.put(new C22011h0(((C6636i) obj2).f21379a), obj2);
                }
                c2153q2.m3251l(null, AbstractC17659D.m19248j(map3, linkedHashMap));
                r10 = r11;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e14) {
            e = e14;
        }
        r10.m5875a();
        return c17296c;
    }
}
