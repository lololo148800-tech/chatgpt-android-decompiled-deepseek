package p628Zk;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import np.InterfaceC17710b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0613g0;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p544W9.AbstractC8565U2;
import p544W9.AbstractC8699q4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p754fl.C13693c;
import p792hl.AbstractC14527b;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16467o;
import p857kl.C16447N;
import p857kl.C16452T;
import p857kl.C16464l;
import p857kl.C16477y;
import p857kl.EnumC16465m;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C10416o implements Closeable {

    /* JADX INFO: renamed from: p0 */
    public static final C10409h f30876p0 = new C10409h();

    /* JADX INFO: renamed from: q0 */
    public static final C19666a f30877q0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10407f f30878Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f30879Z;

    /* JADX INFO: renamed from: o0 */
    public final C0564B0 f30880o0;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C10416o.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C10416o.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f30877q0 = new C19666a("HttpCookies", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
    }

    public C10416o(InterfaceC10407f storage, ArrayList defaults) {
        AbstractC16544l.m18094g(storage, "storage");
        AbstractC16544l.m18094g(defaults, "defaults");
        this.f30878Y = storage;
        this.f30879Z = defaults;
        this.f30880o0 = AbstractC0575H.m1156D(C0613g0.f1858Y, AbstractC0593T.f1825b, null, new C10413l(this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m10902a(C13693c c13693c, AbstractC19687c abstractC19687c) {
        C10411j c10411j;
        C10416o c10416o;
        ArrayList arrayList;
        Iterator it;
        C16452T c16452t;
        C10416o c10416o2;
        if (abstractC19687c instanceof C10411j) {
            c10411j = (C10411j) abstractC19687c;
            int i10 = c10411j.f30856r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10411j.f30856r0 = i10 - Integer.MIN_VALUE;
                c10416o = this;
            } else {
                c10416o = this;
                c10411j = new C10411j(c10416o, abstractC19687c);
            }
        } else {
            c10416o = this;
            c10411j = new C10411j(c10416o, abstractC19687c);
        }
        Object obj = c10411j.f30854p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10411j.f30856r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16447N c16447n = c13693c.f43195a;
            AbstractC16544l.m18094g(c16447n, "<this>");
            C16447N c16447n2 = new C16447N();
            AbstractC8699q4.m9404d(c16447n2, c16447n);
            C16452T c16452tM18021b = c16447n2.m18021b();
            List list = AbstractC16435B.f50983a;
            String strM4540z = c13693c.f43197c.m4540z("Cookie");
            if (strM4540z != null) {
                InterfaceC17710b interfaceC17710b = AbstractC10419r.f30884a;
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Saving cookie ", strM4540z, " for ");
                sbM11058p.append(c13693c.f43195a);
                interfaceC17710b.mo19442g(sbM11058p.toString());
                Map mapM18041c = AbstractC16467o.m18041c(strM4540z, true);
                arrayList = new ArrayList(mapM18041c.size());
                for (Map.Entry entry : mapM18041c.entrySet()) {
                    arrayList.add(new C16464l((String) entry.getKey(), (String) entry.getValue(), EnumC16465m.f51081Z, null, null, null, null, false, false, C17690x.f56481Y));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                it = arrayList.iterator();
                c16452t = c16452tM18021b;
                c10416o2 = c10416o;
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = c10411j.f30853o0;
        c16452t = c10411j.f30852Z;
        c10416o2 = c10411j.f30851Y;
        AbstractC9233X.m9807c(obj);
        while (it.hasNext()) {
            C16464l c16464l = (C16464l) it.next();
            InterfaceC10407f interfaceC10407f = c10416o2.f30878Y;
            c10411j.f30851Y = c10416o2;
            c10411j.f30852Z = c16452t;
            c10411j.f30853o0 = it;
            c10411j.f30856r0 = 1;
            if (interfaceC10407f.mo7291K0(c16452t, c16464l, c10411j) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30878Y.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m10903e(C16452T c16452t, AbstractC19687c abstractC19687c) {
        C10412k c10412k;
        C10416o c10416o;
        if (abstractC19687c instanceof C10412k) {
            c10412k = (C10412k) abstractC19687c;
            int i10 = c10412k.f30861q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10412k.f30861q0 = i10 - Integer.MIN_VALUE;
            } else {
                c10412k = new C10412k(this, abstractC19687c);
            }
        } else {
            c10412k = new C10412k(this, abstractC19687c);
        }
        Object objMo7290A = c10412k.f30859o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10412k.f30861q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16452t = c10412k.f30858Z;
                c10416o = c10412k.f30857Y;
                AbstractC9233X.m9807c(objMo7290A);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objMo7290A);
            }
        }
        AbstractC9233X.m9807c(objMo7290A);
        c10412k.f30857Y = this;
        c10412k.f30858Z = c16452t;
        c10412k.f30861q0 = 1;
        if (this.f30880o0.mo1272P(c10412k) == enumC19250a) {
            return enumC19250a;
        }
        c10416o = this;
        InterfaceC10407f interfaceC10407f = c10416o.f30878Y;
        c10412k.f30857Y = null;
        c10412k.f30858Z = null;
        c10412k.f30861q0 = 2;
        objMo7290A = interfaceC10407f.mo7290A(c16452t, c10412k);
        return objMo7290A == enumC19250a ? enumC19250a : objMo7290A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: k */
    public final Object m10904k(AbstractC14527b abstractC14527b, AbstractC19687c abstractC19687c) {
        C10414m c10414m;
        C10416o c10416o;
        C16452T c16452t;
        ?? arrayList;
        Iterator it;
        C10416o c10416o2;
        C16452T c16452t2;
        C16452T c16452t3;
        List listM9974d;
        int i10;
        if (abstractC19687c instanceof C10414m) {
            c10414m = (C10414m) abstractC19687c;
            int i11 = c10414m.f30871r0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10414m.f30871r0 = i11 - Integer.MIN_VALUE;
                c10416o = this;
            } else {
                c10416o = this;
                c10414m = new C10414m(c10416o, abstractC19687c);
            }
        } else {
            c10416o = this;
            c10414m = new C10414m(c10416o, abstractC19687c);
        }
        Object obj = c10414m.f30869p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c10414m.f30871r0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            C16452T c16452tMo7300S = AbstractC8565U2.m9230e(abstractC14527b).mo7300S();
            InterfaceC16476x interfaceC16476xMo7301a = abstractC14527b.mo7301a();
            List list = AbstractC16435B.f50983a;
            List<String> listMo7979d = interfaceC16476xMo7301a.mo7979d("Set-Cookie");
            if (listMo7979d != null) {
                for (String str : listMo7979d) {
                    InterfaceC17710b interfaceC17710b = AbstractC10419r.f30884a;
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Received cookie ", str, " in response for ");
                    sbM11058p.append(abstractC14527b.mo7303b().m7296c().mo7300S());
                    interfaceC17710b.mo19442g(sbM11058p.toString());
                }
            }
            InterfaceC16476x interfaceC16476xMo7301a2 = abstractC14527b.mo7301a();
            List list2 = AbstractC16435B.f50983a;
            List<String> listMo7979d2 = interfaceC16476xMo7301a2.mo7979d("Set-Cookie");
            if (listMo7979d2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : listMo7979d2) {
                    AbstractC16544l.m18094g(str2, "<this>");
                    int iM21678L = AbstractC21322p.m21678L(str2, ',', 0, false, 6);
                    if (iM21678L == -1) {
                        listM9974d = AbstractC9393x3.m9974d(str2);
                        c16452t3 = c16452tMo7300S;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        char c9 = '=';
                        int iM21678L2 = AbstractC21322p.m21678L(str2, '=', iM21678L, false, 4);
                        int i13 = 0;
                        int iM21678L3 = AbstractC21322p.m21678L(str2, ';', iM21678L, false, 4);
                        while (true) {
                            if (i13 >= str2.length() || iM21678L <= 0) {
                                c16452t3 = c16452tMo7300S;
                                if (i13 >= str2.length()) {
                                    break;
                                }
                                String strSubstring = str2.substring(i13);
                                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                                arrayList3.add(strSubstring);
                                break;
                            }
                            if (iM21678L2 < iM21678L) {
                                iM21678L2 = AbstractC21322p.m21678L(str2, c9, iM21678L, false, 4);
                            }
                            c16452t3 = c16452tMo7300S;
                            int iM21678L4 = AbstractC21322p.m21678L(str2, ',', iM21678L + 1, false, 4);
                            while (true) {
                                int i14 = iM21678L4;
                                i10 = iM21678L;
                                iM21678L = i14;
                                if (iM21678L < 0 || iM21678L >= iM21678L2) {
                                    break;
                                }
                                iM21678L4 = AbstractC21322p.m21678L(str2, ',', iM21678L + 1, false, 4);
                            }
                            if (iM21678L3 < i10) {
                                iM21678L3 = AbstractC21322p.m21678L(str2, ';', i10, false, 4);
                            }
                            if (iM21678L2 < 0) {
                                String strSubstring2 = str2.substring(i13);
                                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                                arrayList3.add(strSubstring2);
                                break;
                            }
                            if (iM21678L3 == -1 || iM21678L3 > iM21678L2) {
                                String strSubstring3 = str2.substring(i13, i10);
                                AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                                arrayList3.add(strSubstring3);
                                i13 = i10 + 1;
                            }
                            c16452tMo7300S = c16452t3;
                            c9 = '=';
                        }
                        listM9974d = arrayList3;
                    }
                    AbstractC17686t.m19398v(listM9974d, arrayList2);
                    c16452tMo7300S = c16452t3;
                }
                c16452t = c16452tMo7300S;
                arrayList = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(AbstractC16467o.m18042d((String) it2.next()));
                }
            } else {
                c16452t = c16452tMo7300S;
                arrayList = C17689w.f56480Y;
            }
            it = ((Iterable) arrayList).iterator();
            c10416o2 = c10416o;
            c16452t2 = c16452t;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c10414m.f30868o0;
            c16452t2 = c10414m.f30867Z;
            c10416o2 = c10414m.f30866Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            C16464l c16464l = (C16464l) it.next();
            InterfaceC10407f interfaceC10407f = c10416o2.f30878Y;
            c10414m.f30866Y = c10416o2;
            c10414m.f30867Z = c16452t2;
            c10414m.f30868o0 = it;
            c10414m.f30871r0 = 1;
            if (interfaceC10407f.mo7291K0(c16452t2, c16464l, c10414m) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m10905m(C13693c c13693c, AbstractC19687c abstractC19687c) {
        C10415n c10415n;
        if (abstractC19687c instanceof C10415n) {
            c10415n = (C10415n) abstractC19687c;
            int i10 = c10415n.f30875p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10415n.f30875p0 = i10 - Integer.MIN_VALUE;
            } else {
                c10415n = new C10415n(this, abstractC19687c);
            }
        } else {
            c10415n = new C10415n(this, abstractC19687c);
        }
        Object objM10903e = c10415n.f30873Z;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c10415n.f30875p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10903e);
            C16447N c16447n = c13693c.f43195a;
            AbstractC16544l.m18094g(c16447n, "<this>");
            C16447N c16447n2 = new C16447N();
            AbstractC8699q4.m9404d(c16447n2, c16447n);
            C16452T c16452tM18021b = c16447n2.m18021b();
            c10415n.f30872Y = c13693c;
            c10415n.f30875p0 = 1;
            objM10903e = m10903e(c16452tM18021b, c10415n);
            if (objM10903e == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13693c = c10415n.f30872Y;
            AbstractC9233X.m9807c(objM10903e);
        }
        List list = (List) objM10903e;
        if (list.isEmpty()) {
            C16477y c16477y = c13693c.f43197c;
            List list2 = AbstractC16435B.f50983a;
            ((Map) c16477y.f11539Z).remove("Cookie");
        } else {
            InterfaceC17710b interfaceC17710b = AbstractC10419r.f30884a;
            String strM19349Y = AbstractC17680n.m19349Y(list, "; ", null, null, 0, null, C10418q.f30883Y, 30);
            C16477y c16477y2 = c13693c.f43197c;
            List list3 = AbstractC16435B.f50983a;
            c16477y2.m4522M("Cookie", strM19349Y);
            InterfaceC17710b interfaceC17710b2 = AbstractC10419r.f30884a;
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Sending cookie ", strM19349Y, " for ");
            sbM11058p.append(c13693c.f43195a);
            interfaceC17710b2.mo19442g(sbM11058p.toString());
        }
        return C17296C.f55119a;
    }
}
