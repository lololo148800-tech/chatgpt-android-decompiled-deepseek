package p988rc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p033B5.C0842z;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2213w0;
import p1091wn.AbstractC21031l;
import p1113xn.AbstractC21322p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p153Fn.C2925c;
import p204I1.C3573D;
import p204I1.C3587c;
import p204I1.C3588d;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8128k6;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9393x3;
import p586Y0.C9563o;
import p586Y0.C9566r;
import p586Y0.C9569u;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p911o0.AbstractC17758g;
import p946pc.AbstractC18319D;
import p946pc.AbstractC18322G;
import p946pc.C18320E;
import sc.C19530l;

/* JADX INFO: renamed from: rc.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18912B {

    /* JADX INFO: renamed from: a */
    public static final C18916d f60347a = new C18916d(0);

    /* JADX WARN: Code duplicated, block: B:105:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0216  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0262  */
    /* JADX WARN: Code duplicated, block: B:122:0x026e  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:132:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x0374  */
    /* JADX WARN: Code duplicated, block: B:136:0x037d  */
    /* JADX WARN: Code duplicated, block: B:139:0x038e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0396  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f4 A[LOOP:1: B:149:0x03ec->B:151:0x03f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x04a0 A[LOOP:2: B:155:0x049a->B:157:0x04a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:165:0x0505  */
    /* JADX WARN: Code duplicated, block: B:170:0x0434 A[EDGE_INSN: B:170:0x0434->B:152:0x0434 BREAK  A[LOOP:1: B:149:0x03ec->B:151:0x03f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0193 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:96:0x0199  */
    /* JADX INFO: renamed from: a */
    public static final void m20266a(C18320E Text, C18929q text, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, boolean z6, boolean z10, C18918f c18918f, InterfaceC5985X interfaceC5985X, int i10, int i11, C6021p c6021p, int i12, int i13) {
        InterfaceC10459q interfaceC10459q2;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        InterfaceC5985X interfaceC5985X2;
        int i18;
        int i19;
        C5975S c5975s;
        C18918f c18918f2;
        InterfaceC5985X interfaceC5985XM6430Q;
        boolean z12;
        int i20;
        C18918f c18918f3;
        InterfaceC1436k interfaceC1436k2;
        InterfaceC5985X interfaceC5985X3;
        boolean z13;
        InterfaceC10459q interfaceC10459q3;
        int i21;
        int i22;
        C18930r c18930r;
        long jM19845d;
        boolean zM6542f;
        Object objM6514H;
        Object obj;
        Map map;
        C3587c c3587c;
        AbstractC18928p abstractC18928pM20267b;
        C3573D c3573dMo1115a;
        C3590f c3590f;
        boolean zM6542f2;
        Object objM6514H2;
        Map map2;
        boolean zIsEmpty;
        Object objM6514H3;
        C2925c c2925c;
        Object objM6514H4;
        C9569u c9569u;
        Object objM6514H5;
        InterfaceC5985X interfaceC5985X4;
        C18918f c18918f4;
        C3590f c3590f2;
        C18918f c18918f5;
        InterfaceC1436k interfaceC1436k3;
        boolean z14;
        boolean z15;
        InterfaceC5985X interfaceC5985X5;
        int i23;
        int i24;
        InterfaceC10459q interfaceC10459q4;
        C3590f c3590fM4297i;
        C9563o c9563o;
        C9566r c9566r;
        Iterator it;
        C3587c c3587c2;
        Iterator it2;
        C18931s c18931s;
        int i25;
        String str;
        ArrayList arrayList;
        Iterator it3;
        boolean zHasNext;
        float f10;
        Iterator it4;
        C18918f c18918f6;
        Object objM6514H6;
        Object objM6514H7;
        boolean z16;
        Object objM6514H8;
        InterfaceC2213w0 interfaceC2213w0;
        Object objM6514H9;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(Text, "$this$Text");
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(-545654046);
        int i26 = (i12 & 14) == 0 ? (c6021p.m6542f(Text) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i26 |= c6021p.m6542f(text) ? 32 : 16;
        }
        int i27 = i13 & 2;
        if (i27 == 0) {
            if ((i12 & 896) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i26 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i14 = i26 | 27648;
            i15 = i13 & 16;
            if (i15 != 0) {
                if ((458752 & i12) == 0) {
                    z11 = z10;
                    if (c6021p.m6544g(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 32;
                if (i17 != 0) {
                    i14 |= 524288;
                }
                if ((29360128 & i12) == 0) {
                    if ((i13 & 64) == 0) {
                        interfaceC5985X2 = interfaceC5985X;
                        int i28 = c6021p.m6542f(interfaceC5985X2) ? 8388608 : 4194304;
                        i14 |= i28;
                    } else {
                        interfaceC5985X2 = interfaceC5985X;
                    }
                    i14 |= i28;
                } else {
                    interfaceC5985X2 = interfaceC5985X;
                }
                i18 = i14 | 905969664;
                if (i17 != 32 && (1533916891 & i18) == 306783378 && c6021p.m6562y()) {
                    c6021p.m6517L();
                    z14 = z6;
                    c18918f5 = c18918f;
                    i24 = i11;
                    interfaceC10459q4 = interfaceC10459q2;
                    interfaceC5985X5 = interfaceC5985X2;
                    i23 = i10;
                    z15 = z11;
                    interfaceC1436k3 = interfaceC1436k;
                } else {
                    c6021p.m6519N();
                    i19 = i12 & 1;
                    c5975s = C5975S.f19448r0;
                    if (i19 != 0 || c6021p.m6561x()) {
                        if (i27 != 0) {
                            interfaceC10459q2 = C10456n.f30959Y;
                        }
                        C18914b c18914b = C18914b.f60354p0;
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                            i18 &= -3670017;
                        } else {
                            c18918f2 = c18918f;
                        }
                        if ((i13 & 64) != 0) {
                            interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                            i18 &= -29360129;
                        } else {
                            interfaceC5985XM6430Q = interfaceC5985X2;
                        }
                        z12 = true;
                        i20 = 1;
                        c18918f3 = c18918f2;
                        interfaceC1436k2 = c18914b;
                        interfaceC5985X3 = interfaceC5985XM6430Q;
                        z13 = z11;
                        interfaceC10459q3 = interfaceC10459q2;
                        i21 = i18;
                        i22 = Integer.MAX_VALUE;
                    } else {
                        c6021p.m6517L();
                        if (i17 != 0) {
                            i18 &= -3670017;
                        }
                        if ((i13 & 64) != 0) {
                            i18 &= -29360129;
                        }
                        interfaceC1436k2 = interfaceC1436k;
                        z12 = z6;
                        i20 = i10;
                        i22 = i11;
                        z13 = z11;
                        interfaceC10459q3 = interfaceC10459q2;
                        i21 = i18;
                        interfaceC5985X3 = interfaceC5985X2;
                        c18918f3 = c18918f;
                    }
                    c6021p.m6554q();
                    c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
                    jM19845d = AbstractC18319D.m19845d(Text, c6021p);
                    Object c14365u = new C14365u(jM19845d);
                    c6021p.m6525T(1618982084);
                    zM6542f = c6021p.m6542f(c14365u) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
                    objM6514H = c6021p.m6514H();
                    obj = C6013l.f19514a;
                    map = text.f60395b;
                    if (zM6542f || objM6514H == obj) {
                        if (c18930r == null) {
                            c18930r = C18930r.f60396i;
                        }
                        C18930r c18930rM20272a = c18930r.m20272a();
                        c3587c = new C3587c();
                        C3590f c3590f3 = text.f60394a;
                        c3587c.m4290b(c3590f3);
                        for (C3588d c3588d : c3590f3.m4300c(0, c3590f3.f10934Y.length(), AbstractC18928p.f60391b)) {
                            String str2 = AbstractC18928p.f60391b;
                            abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                            if (abstractC18928pM20267b == null && (c3573dMo1115a = abstractC18928pM20267b.mo1115a(c18930rM20272a)) != null) {
                                c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                            }
                        }
                        objM6514H = c3587c.m4297i();
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    c3590f = (C3590f) objM6514H;
                    c6021p.m6525T(1157296644);
                    zM6542f2 = c6021p.m6542f(text);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == obj) {
                        objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    map2 = (Map) objM6514H2;
                    zIsEmpty = map2.isEmpty();
                    c6021p.m6525T(1858664088);
                    c6021p.m6525T(773894976);
                    c6021p.m6525T(-492369756);
                    objM6514H3 = c6021p.m6514H();
                    if (objM6514H3 == obj) {
                        objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                    }
                    c6021p.m6553p(false);
                    c2925c = ((C6035w) objM6514H3).f19668Y;
                    c6021p.m6553p(false);
                    c6021p.m6525T(-492369756);
                    objM6514H4 = c6021p.m6514H();
                    if (objM6514H4 == obj) {
                        objM6514H4 = new C9569u();
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    c9569u = (C9569u) objM6514H4;
                    c6021p.m6525T(-492369756);
                    objM6514H5 = c6021p.m6514H();
                    if (objM6514H5 == obj) {
                        objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                        c6021p.m6537c0(objM6514H5);
                    }
                    c6021p.m6553p(false);
                    interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
                    if (c18918f3.f60364a) {
                        c6021p.m6525T(-492369756);
                        objM6514H6 = c6021p.m6514H();
                        if (objM6514H6 == obj) {
                            objM6514H6 = C5997d.m6429P(-1);
                            c6021p.m6537c0(objM6514H6);
                        }
                        c6021p.m6553p(false);
                        C5996c0 c5996c0 = (C5996c0) objM6514H6;
                        c6021p.m6525T(-492369756);
                        objM6514H7 = c6021p.m6514H();
                        if (objM6514H7 == obj) {
                            z16 = false;
                            objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                            c6021p.m6537c0(objM6514H7);
                        } else {
                            z16 = false;
                        }
                        c6021p.m6553p(z16);
                        InterfaceC5985X interfaceC5985X6 = (InterfaceC5985X) objM6514H7;
                        c6021p.m6525T(-492369756);
                        objM6514H8 = c6021p.m6514H();
                        if (objM6514H8 == obj) {
                            objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                            c6021p.m6537c0(objM6514H8);
                        }
                        c6021p.m6553p(false);
                        interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                        c6021p.m6525T(-492369756);
                        objM6514H9 = c6021p.m6514H();
                        if (objM6514H9 == obj) {
                            C21554a c21554a = C21555b.f68260Z;
                            objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                            c6021p.m6537c0(objM6514H9);
                        }
                        c6021p.m6553p(false);
                        InterfaceC5985X interfaceC5985XM6468x = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                        C18911A c18911a = new C18911A(interfaceC5985X6, interfaceC5985X4, c5996c0, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                        C18918f c18918f7 = c18918f3;
                        C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f7, z13, interfaceC5985X6, c18911a, null), c6021p, c3590f);
                        C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f7, interfaceC5985X6, c18911a, null), c6021p);
                        C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X6, c18911a, interfaceC5985XM6468x, null), c6021p, (C3590f) interfaceC5985XM6468x.getValue());
                    } else {
                        map2 = map2;
                        interfaceC10459q3 = interfaceC10459q3;
                        interfaceC5985X4.setValue(c3590f);
                    }
                    if (zIsEmpty) {
                        c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                        c9563o = c9569u.f28782p0;
                        if (c3590fM4297i.f10934Y.length() == 0 && !c9563o.f28769Y.isEmpty()) {
                            c9566r = new C9566r();
                            it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                            while (it.hasNext()) {
                                c18931s = (C18931s) it.next();
                                i25 = c18931s.f60405a;
                                str = c3590fM4297i.f10934Y;
                                if (i25 >= str.length()) {
                                    it4 = it;
                                    c18918f6 = c18918f3;
                                } else {
                                    int length = str.length();
                                    int i29 = c18931s.f60405a;
                                    C3590f c3590fSubSequence = c3590fM4297i.subSequence(i29, length);
                                    List listM4299b = c3590fSubSequence.m4299b();
                                    arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b, 10));
                                    it3 = listM4299b.iterator();
                                    while (true) {
                                        zHasNext = it3.hasNext();
                                        f10 = c18931s.f60406b;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        C3588d c3588d2 = (C3588d) it3.next();
                                        C3573D c3573d = (C3573D) c3588d2.f10930a;
                                        arrayList.add(new C3588d(C3573D.m4244a(c3573d, C14365u.m15774b(f10, c3573d.f10859a.mo7588b()), 0L, 65534), c3588d2.f10931b, c3588d2.f10932c, c3588d2.f10933d));
                                        it = it;
                                        it3 = it3;
                                        c18918f3 = c18918f3;
                                    }
                                    it4 = it;
                                    c18918f6 = c18918f3;
                                    C3573D c3573d2 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                                    String str3 = c3590fSubSequence.f10934Y;
                                    c9566r.add(new C3590f(4, str3, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d2, 0, str3.length())), arrayList)));
                                    c3590fM4297i = c3590fM4297i.subSequence(0, i29);
                                }
                                it = it4;
                                c18918f3 = c18918f6;
                            }
                            c18918f4 = c18918f3;
                            c3587c2 = new C3587c(c3590fM4297i);
                            it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                            while (it2.hasNext()) {
                                c3587c2.m4290b((C3590f) it2.next());
                            }
                            c3590fM4297i = c3587c2.m4297i();
                        } else {
                            c18918f4 = c18918f3;
                        }
                        c3590f2 = c3590fM4297i;
                    } else {
                        c18918f4 = c18918f3;
                        c3590f2 = c3590f;
                    }
                    c6021p.m6553p(false);
                    AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
                    c18918f5 = c18918f4;
                    interfaceC1436k3 = interfaceC1436k2;
                    z14 = z12;
                    z15 = z13;
                    interfaceC5985X5 = interfaceC5985X3;
                    i23 = i20;
                    i24 = i22;
                    interfaceC10459q4 = interfaceC10459q3;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C18934v(Text, text, interfaceC10459q4, interfaceC1436k3, z14, z15, c18918f5, interfaceC5985X5, i23, i24, i12, i13);
                }
            }
            i14 = 224256 | i26;
            z11 = z10;
            i17 = i13 & 32;
            if (i17 != 0) {
                i14 |= 524288;
            }
            if ((29360128 & i12) == 0) {
                if ((i13 & 64) == 0) {
                    interfaceC5985X2 = interfaceC5985X;
                    if (c6021p.m6542f(interfaceC5985X2)) {
                    }
                    i14 |= i28;
                } else {
                    interfaceC5985X2 = interfaceC5985X;
                }
                i14 |= i28;
            } else {
                interfaceC5985X2 = interfaceC5985X;
            }
            i18 = i14 | 905969664;
            if (i17 != 32) {
                c6021p.m6519N();
                i19 = i12 & 1;
                c5975s = C5975S.f19448r0;
                if (i19 != 0) {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b2 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b2;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                } else {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b3 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b3;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                }
                c6021p.m6554q();
                c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
                jM19845d = AbstractC18319D.m19845d(Text, c6021p);
                Object c14365u2 = new C14365u(jM19845d);
                c6021p.m6525T(1618982084);
                zM6542f = c6021p.m6542f(c14365u2) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                map = text.f60395b;
                if (zM6542f) {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a2 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f4 = text.f60394a;
                    c3587c.m4290b(c3590f4);
                    while (r4.hasNext()) {
                        String str4 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a3 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f5 = text.f60394a;
                    c3587c.m4290b(c3590f5);
                    while (r4.hasNext()) {
                        String str5 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                c3590f = (C3590f) objM6514H;
                c6021p.m6525T(1157296644);
                zM6542f2 = c6021p.m6542f(text);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                map2 = (Map) objM6514H2;
                zIsEmpty = map2.isEmpty();
                c6021p.m6525T(1858664088);
                c6021p.m6525T(773894976);
                c6021p.m6525T(-492369756);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == obj) {
                    objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c6021p.m6553p(false);
                c2925c = ((C6035w) objM6514H3).f19668Y;
                c6021p.m6553p(false);
                c6021p.m6525T(-492369756);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C9569u();
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                c9569u = (C9569u) objM6514H4;
                c6021p.m6525T(-492369756);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
                if (c18918f3.f60364a) {
                    c6021p.m6525T(-492369756);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == obj) {
                        objM6514H6 = C5997d.m6429P(-1);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    C5996c0 c5996c1 = (C5996c0) objM6514H6;
                    c6021p.m6525T(-492369756);
                    objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == obj) {
                        z16 = false;
                        objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        z16 = false;
                    }
                    c6021p.m6553p(z16);
                    InterfaceC5985X interfaceC5985X7 = (InterfaceC5985X) objM6514H7;
                    c6021p.m6525T(-492369756);
                    objM6514H8 = c6021p.m6514H();
                    if (objM6514H8 == obj) {
                        objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                        c6021p.m6537c0(objM6514H8);
                    }
                    c6021p.m6553p(false);
                    interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                    c6021p.m6525T(-492369756);
                    objM6514H9 = c6021p.m6514H();
                    if (objM6514H9 == obj) {
                        C21554a c21554a2 = C21555b.f68260Z;
                        objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                        c6021p.m6537c0(objM6514H9);
                    }
                    c6021p.m6553p(false);
                    InterfaceC5985X interfaceC5985XM6468x2 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                    C18911A c18911a2 = new C18911A(interfaceC5985X7, interfaceC5985X4, c5996c1, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                    C18918f c18918f8 = c18918f3;
                    C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f8, z13, interfaceC5985X7, c18911a2, null), c6021p, c3590f);
                    C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f8, interfaceC5985X7, c18911a2, null), c6021p);
                    C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X7, c18911a2, interfaceC5985XM6468x2, null), c6021p, (C3590f) interfaceC5985XM6468x2.getValue());
                } else {
                    map2 = map2;
                    interfaceC10459q3 = interfaceC10459q3;
                    interfaceC5985X4.setValue(c3590f);
                }
                if (zIsEmpty) {
                    c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                    c9563o = c9569u.f28782p0;
                    if (c3590fM4297i.f10934Y.length() == 0) {
                        c18918f4 = c18918f3;
                    } else {
                        c9566r = new C9566r();
                        it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                        while (it.hasNext()) {
                            c18931s = (C18931s) it.next();
                            i25 = c18931s.f60405a;
                            str = c3590fM4297i.f10934Y;
                            if (i25 >= str.length()) {
                                it4 = it;
                                c18918f6 = c18918f3;
                            } else {
                                int length2 = str.length();
                                int i210 = c18931s.f60405a;
                                C3590f c3590fSubSequence2 = c3590fM4297i.subSequence(i210, length2);
                                List listM4299b2 = c3590fSubSequence2.m4299b();
                                arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b2, 10));
                                it3 = listM4299b2.iterator();
                                while (true) {
                                    zHasNext = it3.hasNext();
                                    f10 = c18931s.f60406b;
                                    if (!zHasNext) {
                                        break;
                                        break;
                                    }
                                    C3588d c3588d3 = (C3588d) it3.next();
                                    C3573D c3573d3 = (C3573D) c3588d3.f10930a;
                                    arrayList.add(new C3588d(C3573D.m4244a(c3573d3, C14365u.m15774b(f10, c3573d3.f10859a.mo7588b()), 0L, 65534), c3588d3.f10931b, c3588d3.f10932c, c3588d3.f10933d));
                                    it = it;
                                    it3 = it3;
                                    c18918f3 = c18918f3;
                                }
                                it4 = it;
                                c18918f6 = c18918f3;
                                C3573D c3573d4 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                                String str6 = c3590fSubSequence2.f10934Y;
                                c9566r.add(new C3590f(4, str6, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d4, 0, str6.length())), arrayList)));
                                c3590fM4297i = c3590fM4297i.subSequence(0, i210);
                            }
                            it = it4;
                            c18918f3 = c18918f6;
                        }
                        c18918f4 = c18918f3;
                        c3587c2 = new C3587c(c3590fM4297i);
                        it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                        while (it2.hasNext()) {
                            c3587c2.m4290b((C3590f) it2.next());
                        }
                        c3590fM4297i = c3587c2.m4297i();
                    }
                    c3590f2 = c3590fM4297i;
                } else {
                    c18918f4 = c18918f3;
                    c3590f2 = c3590f;
                }
                c6021p.m6553p(false);
                AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
                c18918f5 = c18918f4;
                interfaceC1436k3 = interfaceC1436k2;
                z14 = z12;
                z15 = z13;
                interfaceC5985X5 = interfaceC5985X3;
                i23 = i20;
                i24 = i22;
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6519N();
                i19 = i12 & 1;
                c5975s = C5975S.f19448r0;
                if (i19 != 0) {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b4 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b4;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                } else {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b5 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b5;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                }
                c6021p.m6554q();
                c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
                jM19845d = AbstractC18319D.m19845d(Text, c6021p);
                Object c14365u3 = new C14365u(jM19845d);
                c6021p.m6525T(1618982084);
                zM6542f = c6021p.m6542f(c14365u3) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                map = text.f60395b;
                if (zM6542f) {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a4 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f6 = text.f60394a;
                    c3587c.m4290b(c3590f6);
                    while (r4.hasNext()) {
                        String str7 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a5 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f7 = text.f60394a;
                    c3587c.m4290b(c3590f7);
                    while (r4.hasNext()) {
                        String str8 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                c3590f = (C3590f) objM6514H;
                c6021p.m6525T(1157296644);
                zM6542f2 = c6021p.m6542f(text);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                map2 = (Map) objM6514H2;
                zIsEmpty = map2.isEmpty();
                c6021p.m6525T(1858664088);
                c6021p.m6525T(773894976);
                c6021p.m6525T(-492369756);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == obj) {
                    objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c6021p.m6553p(false);
                c2925c = ((C6035w) objM6514H3).f19668Y;
                c6021p.m6553p(false);
                c6021p.m6525T(-492369756);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C9569u();
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                c9569u = (C9569u) objM6514H4;
                c6021p.m6525T(-492369756);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
                if (c18918f3.f60364a) {
                    c6021p.m6525T(-492369756);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == obj) {
                        objM6514H6 = C5997d.m6429P(-1);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    C5996c0 c5996c2 = (C5996c0) objM6514H6;
                    c6021p.m6525T(-492369756);
                    objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == obj) {
                        z16 = false;
                        objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        z16 = false;
                    }
                    c6021p.m6553p(z16);
                    InterfaceC5985X interfaceC5985X8 = (InterfaceC5985X) objM6514H7;
                    c6021p.m6525T(-492369756);
                    objM6514H8 = c6021p.m6514H();
                    if (objM6514H8 == obj) {
                        objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                        c6021p.m6537c0(objM6514H8);
                    }
                    c6021p.m6553p(false);
                    interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                    c6021p.m6525T(-492369756);
                    objM6514H9 = c6021p.m6514H();
                    if (objM6514H9 == obj) {
                        C21554a c21554a3 = C21555b.f68260Z;
                        objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                        c6021p.m6537c0(objM6514H9);
                    }
                    c6021p.m6553p(false);
                    InterfaceC5985X interfaceC5985XM6468x3 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                    C18911A c18911a3 = new C18911A(interfaceC5985X8, interfaceC5985X4, c5996c2, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                    C18918f c18918f9 = c18918f3;
                    C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f9, z13, interfaceC5985X8, c18911a3, null), c6021p, c3590f);
                    C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f9, interfaceC5985X8, c18911a3, null), c6021p);
                    C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X8, c18911a3, interfaceC5985XM6468x3, null), c6021p, (C3590f) interfaceC5985XM6468x3.getValue());
                } else {
                    map2 = map2;
                    interfaceC10459q3 = interfaceC10459q3;
                    interfaceC5985X4.setValue(c3590f);
                }
                if (zIsEmpty) {
                    c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                    c9563o = c9569u.f28782p0;
                    if (c3590fM4297i.f10934Y.length() == 0) {
                        c18918f4 = c18918f3;
                    } else {
                        c9566r = new C9566r();
                        it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                        while (it.hasNext()) {
                            c18931s = (C18931s) it.next();
                            i25 = c18931s.f60405a;
                            str = c3590fM4297i.f10934Y;
                            if (i25 >= str.length()) {
                                it4 = it;
                                c18918f6 = c18918f3;
                            } else {
                                int length3 = str.length();
                                int i211 = c18931s.f60405a;
                                C3590f c3590fSubSequence3 = c3590fM4297i.subSequence(i211, length3);
                                List listM4299b3 = c3590fSubSequence3.m4299b();
                                arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b3, 10));
                                it3 = listM4299b3.iterator();
                                while (true) {
                                    zHasNext = it3.hasNext();
                                    f10 = c18931s.f60406b;
                                    if (!zHasNext) {
                                        break;
                                        break;
                                    }
                                    C3588d c3588d4 = (C3588d) it3.next();
                                    C3573D c3573d5 = (C3573D) c3588d4.f10930a;
                                    arrayList.add(new C3588d(C3573D.m4244a(c3573d5, C14365u.m15774b(f10, c3573d5.f10859a.mo7588b()), 0L, 65534), c3588d4.f10931b, c3588d4.f10932c, c3588d4.f10933d));
                                    it = it;
                                    it3 = it3;
                                    c18918f3 = c18918f3;
                                }
                                it4 = it;
                                c18918f6 = c18918f3;
                                C3573D c3573d6 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                                String str9 = c3590fSubSequence3.f10934Y;
                                c9566r.add(new C3590f(4, str9, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d6, 0, str9.length())), arrayList)));
                                c3590fM4297i = c3590fM4297i.subSequence(0, i211);
                            }
                            it = it4;
                            c18918f3 = c18918f6;
                        }
                        c18918f4 = c18918f3;
                        c3587c2 = new C3587c(c3590fM4297i);
                        it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                        while (it2.hasNext()) {
                            c3587c2.m4290b((C3590f) it2.next());
                        }
                        c3590fM4297i = c3587c2.m4297i();
                    }
                    c3590f2 = c3590fM4297i;
                } else {
                    c18918f4 = c18918f3;
                    c3590f2 = c3590f;
                }
                c6021p.m6553p(false);
                AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
                c18918f5 = c18918f4;
                interfaceC1436k3 = interfaceC1436k2;
                z14 = z12;
                z15 = z13;
                interfaceC5985X5 = interfaceC5985X3;
                i23 = i20;
                i24 = i22;
                interfaceC10459q4 = interfaceC10459q3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C18934v(Text, text, interfaceC10459q4, interfaceC1436k3, z14, z15, c18918f5, interfaceC5985X5, i23, i24, i12, i13);
            }
        }
        i26 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i14 = i26 | 27648;
        i15 = i13 & 16;
        if (i15 != 0) {
            if ((458752 & i12) == 0) {
                z11 = z10;
                if (c6021p.m6544g(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i14 |= i16;
            }
            i17 = i13 & 32;
            if (i17 != 0) {
                i14 |= 524288;
            }
            if ((29360128 & i12) == 0) {
                if ((i13 & 64) == 0) {
                    interfaceC5985X2 = interfaceC5985X;
                    if (c6021p.m6542f(interfaceC5985X2)) {
                    }
                    i14 |= i28;
                } else {
                    interfaceC5985X2 = interfaceC5985X;
                }
                i14 |= i28;
            } else {
                interfaceC5985X2 = interfaceC5985X;
            }
            i18 = i14 | 905969664;
            if (i17 != 32) {
                c6021p.m6519N();
                i19 = i12 & 1;
                c5975s = C5975S.f19448r0;
                if (i19 != 0) {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b6 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b6;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                } else {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b7 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b7;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                }
                c6021p.m6554q();
                c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
                jM19845d = AbstractC18319D.m19845d(Text, c6021p);
                Object c14365u4 = new C14365u(jM19845d);
                c6021p.m6525T(1618982084);
                zM6542f = c6021p.m6542f(c14365u4) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                map = text.f60395b;
                if (zM6542f) {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a6 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f8 = text.f60394a;
                    c3587c.m4290b(c3590f8);
                    while (r4.hasNext()) {
                        String str10 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a7 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f9 = text.f60394a;
                    c3587c.m4290b(c3590f9);
                    while (r4.hasNext()) {
                        String str11 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                c3590f = (C3590f) objM6514H;
                c6021p.m6525T(1157296644);
                zM6542f2 = c6021p.m6542f(text);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                map2 = (Map) objM6514H2;
                zIsEmpty = map2.isEmpty();
                c6021p.m6525T(1858664088);
                c6021p.m6525T(773894976);
                c6021p.m6525T(-492369756);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == obj) {
                    objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c6021p.m6553p(false);
                c2925c = ((C6035w) objM6514H3).f19668Y;
                c6021p.m6553p(false);
                c6021p.m6525T(-492369756);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C9569u();
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                c9569u = (C9569u) objM6514H4;
                c6021p.m6525T(-492369756);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
                if (c18918f3.f60364a) {
                    c6021p.m6525T(-492369756);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == obj) {
                        objM6514H6 = C5997d.m6429P(-1);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    C5996c0 c5996c3 = (C5996c0) objM6514H6;
                    c6021p.m6525T(-492369756);
                    objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == obj) {
                        z16 = false;
                        objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        z16 = false;
                    }
                    c6021p.m6553p(z16);
                    InterfaceC5985X interfaceC5985X9 = (InterfaceC5985X) objM6514H7;
                    c6021p.m6525T(-492369756);
                    objM6514H8 = c6021p.m6514H();
                    if (objM6514H8 == obj) {
                        objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                        c6021p.m6537c0(objM6514H8);
                    }
                    c6021p.m6553p(false);
                    interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                    c6021p.m6525T(-492369756);
                    objM6514H9 = c6021p.m6514H();
                    if (objM6514H9 == obj) {
                        C21554a c21554a4 = C21555b.f68260Z;
                        objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                        c6021p.m6537c0(objM6514H9);
                    }
                    c6021p.m6553p(false);
                    InterfaceC5985X interfaceC5985XM6468x4 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                    C18911A c18911a4 = new C18911A(interfaceC5985X9, interfaceC5985X4, c5996c3, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                    C18918f c18918f10 = c18918f3;
                    C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f10, z13, interfaceC5985X9, c18911a4, null), c6021p, c3590f);
                    C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f10, interfaceC5985X9, c18911a4, null), c6021p);
                    C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X9, c18911a4, interfaceC5985XM6468x4, null), c6021p, (C3590f) interfaceC5985XM6468x4.getValue());
                } else {
                    map2 = map2;
                    interfaceC10459q3 = interfaceC10459q3;
                    interfaceC5985X4.setValue(c3590f);
                }
                if (zIsEmpty) {
                    c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                    c9563o = c9569u.f28782p0;
                    if (c3590fM4297i.f10934Y.length() == 0) {
                        c18918f4 = c18918f3;
                    } else {
                        c9566r = new C9566r();
                        it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                        while (it.hasNext()) {
                            c18931s = (C18931s) it.next();
                            i25 = c18931s.f60405a;
                            str = c3590fM4297i.f10934Y;
                            if (i25 >= str.length()) {
                                it4 = it;
                                c18918f6 = c18918f3;
                            } else {
                                int length4 = str.length();
                                int i212 = c18931s.f60405a;
                                C3590f c3590fSubSequence4 = c3590fM4297i.subSequence(i212, length4);
                                List listM4299b4 = c3590fSubSequence4.m4299b();
                                arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b4, 10));
                                it3 = listM4299b4.iterator();
                                while (true) {
                                    zHasNext = it3.hasNext();
                                    f10 = c18931s.f60406b;
                                    if (!zHasNext) {
                                        break;
                                        break;
                                    }
                                    C3588d c3588d5 = (C3588d) it3.next();
                                    C3573D c3573d7 = (C3573D) c3588d5.f10930a;
                                    arrayList.add(new C3588d(C3573D.m4244a(c3573d7, C14365u.m15774b(f10, c3573d7.f10859a.mo7588b()), 0L, 65534), c3588d5.f10931b, c3588d5.f10932c, c3588d5.f10933d));
                                    it = it;
                                    it3 = it3;
                                    c18918f3 = c18918f3;
                                }
                                it4 = it;
                                c18918f6 = c18918f3;
                                C3573D c3573d8 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                                String str12 = c3590fSubSequence4.f10934Y;
                                c9566r.add(new C3590f(4, str12, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d8, 0, str12.length())), arrayList)));
                                c3590fM4297i = c3590fM4297i.subSequence(0, i212);
                            }
                            it = it4;
                            c18918f3 = c18918f6;
                        }
                        c18918f4 = c18918f3;
                        c3587c2 = new C3587c(c3590fM4297i);
                        it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                        while (it2.hasNext()) {
                            c3587c2.m4290b((C3590f) it2.next());
                        }
                        c3590fM4297i = c3587c2.m4297i();
                    }
                    c3590f2 = c3590fM4297i;
                } else {
                    c18918f4 = c18918f3;
                    c3590f2 = c3590f;
                }
                c6021p.m6553p(false);
                AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
                c18918f5 = c18918f4;
                interfaceC1436k3 = interfaceC1436k2;
                z14 = z12;
                z15 = z13;
                interfaceC5985X5 = interfaceC5985X3;
                i23 = i20;
                i24 = i22;
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6519N();
                i19 = i12 & 1;
                c5975s = C5975S.f19448r0;
                if (i19 != 0) {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b8 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b8;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                } else {
                    if (i27 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    C18914b c18914b9 = C18914b.f60354p0;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                        i18 &= -3670017;
                    } else {
                        c18918f2 = c18918f;
                    }
                    if ((i13 & 64) != 0) {
                        interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                        i18 &= -29360129;
                    } else {
                        interfaceC5985XM6430Q = interfaceC5985X2;
                    }
                    z12 = true;
                    i20 = 1;
                    c18918f3 = c18918f2;
                    interfaceC1436k2 = c18914b9;
                    interfaceC5985X3 = interfaceC5985XM6430Q;
                    z13 = z11;
                    interfaceC10459q3 = interfaceC10459q2;
                    i21 = i18;
                    i22 = Integer.MAX_VALUE;
                }
                c6021p.m6554q();
                c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
                jM19845d = AbstractC18319D.m19845d(Text, c6021p);
                Object c14365u5 = new C14365u(jM19845d);
                c6021p.m6525T(1618982084);
                zM6542f = c6021p.m6542f(c14365u5) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                map = text.f60395b;
                if (zM6542f) {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a8 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f10 = text.f60394a;
                    c3587c.m4290b(c3590f10);
                    while (r4.hasNext()) {
                        String str13 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (c18930r == null) {
                        c18930r = C18930r.f60396i;
                    }
                    C18930r c18930rM20272a9 = c18930r.m20272a();
                    c3587c = new C3587c();
                    C3590f c3590f11 = text.f60394a;
                    c3587c.m4290b(c3590f11);
                    while (r4.hasNext()) {
                        String str14 = AbstractC18928p.f60391b;
                        abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                        if (abstractC18928pM20267b == null) {
                            c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                        }
                    }
                    objM6514H = c3587c.m4297i();
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                c3590f = (C3590f) objM6514H;
                c6021p.m6525T(1157296644);
                zM6542f2 = c6021p.m6542f(text);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                map2 = (Map) objM6514H2;
                zIsEmpty = map2.isEmpty();
                c6021p.m6525T(1858664088);
                c6021p.m6525T(773894976);
                c6021p.m6525T(-492369756);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == obj) {
                    objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c6021p.m6553p(false);
                c2925c = ((C6035w) objM6514H3).f19668Y;
                c6021p.m6553p(false);
                c6021p.m6525T(-492369756);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C9569u();
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                c9569u = (C9569u) objM6514H4;
                c6021p.m6525T(-492369756);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
                if (c18918f3.f60364a) {
                    c6021p.m6525T(-492369756);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == obj) {
                        objM6514H6 = C5997d.m6429P(-1);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    C5996c0 c5996c4 = (C5996c0) objM6514H6;
                    c6021p.m6525T(-492369756);
                    objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == obj) {
                        z16 = false;
                        objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        z16 = false;
                    }
                    c6021p.m6553p(z16);
                    InterfaceC5985X interfaceC5985X10 = (InterfaceC5985X) objM6514H7;
                    c6021p.m6525T(-492369756);
                    objM6514H8 = c6021p.m6514H();
                    if (objM6514H8 == obj) {
                        objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                        c6021p.m6537c0(objM6514H8);
                    }
                    c6021p.m6553p(false);
                    interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                    c6021p.m6525T(-492369756);
                    objM6514H9 = c6021p.m6514H();
                    if (objM6514H9 == obj) {
                        C21554a c21554a5 = C21555b.f68260Z;
                        objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                        c6021p.m6537c0(objM6514H9);
                    }
                    c6021p.m6553p(false);
                    InterfaceC5985X interfaceC5985XM6468x5 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                    C18911A c18911a5 = new C18911A(interfaceC5985X10, interfaceC5985X4, c5996c4, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                    C18918f c18918f11 = c18918f3;
                    C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f11, z13, interfaceC5985X10, c18911a5, null), c6021p, c3590f);
                    C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f11, interfaceC5985X10, c18911a5, null), c6021p);
                    C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X10, c18911a5, interfaceC5985XM6468x5, null), c6021p, (C3590f) interfaceC5985XM6468x5.getValue());
                } else {
                    map2 = map2;
                    interfaceC10459q3 = interfaceC10459q3;
                    interfaceC5985X4.setValue(c3590f);
                }
                if (zIsEmpty) {
                    c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                    c9563o = c9569u.f28782p0;
                    if (c3590fM4297i.f10934Y.length() == 0) {
                        c18918f4 = c18918f3;
                    } else {
                        c9566r = new C9566r();
                        it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                        while (it.hasNext()) {
                            c18931s = (C18931s) it.next();
                            i25 = c18931s.f60405a;
                            str = c3590fM4297i.f10934Y;
                            if (i25 >= str.length()) {
                                it4 = it;
                                c18918f6 = c18918f3;
                            } else {
                                int length5 = str.length();
                                int i213 = c18931s.f60405a;
                                C3590f c3590fSubSequence5 = c3590fM4297i.subSequence(i213, length5);
                                List listM4299b5 = c3590fSubSequence5.m4299b();
                                arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b5, 10));
                                it3 = listM4299b5.iterator();
                                while (true) {
                                    zHasNext = it3.hasNext();
                                    f10 = c18931s.f60406b;
                                    if (!zHasNext) {
                                        break;
                                        break;
                                    }
                                    C3588d c3588d6 = (C3588d) it3.next();
                                    C3573D c3573d9 = (C3573D) c3588d6.f10930a;
                                    arrayList.add(new C3588d(C3573D.m4244a(c3573d9, C14365u.m15774b(f10, c3573d9.f10859a.mo7588b()), 0L, 65534), c3588d6.f10931b, c3588d6.f10932c, c3588d6.f10933d));
                                    it = it;
                                    it3 = it3;
                                    c18918f3 = c18918f3;
                                }
                                it4 = it;
                                c18918f6 = c18918f3;
                                C3573D c3573d10 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                                String str15 = c3590fSubSequence5.f10934Y;
                                c9566r.add(new C3590f(4, str15, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d10, 0, str15.length())), arrayList)));
                                c3590fM4297i = c3590fM4297i.subSequence(0, i213);
                            }
                            it = it4;
                            c18918f3 = c18918f6;
                        }
                        c18918f4 = c18918f3;
                        c3587c2 = new C3587c(c3590fM4297i);
                        it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                        while (it2.hasNext()) {
                            c3587c2.m4290b((C3590f) it2.next());
                        }
                        c3590fM4297i = c3587c2.m4297i();
                    }
                    c3590f2 = c3590fM4297i;
                } else {
                    c18918f4 = c18918f3;
                    c3590f2 = c3590f;
                }
                c6021p.m6553p(false);
                AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
                c18918f5 = c18918f4;
                interfaceC1436k3 = interfaceC1436k2;
                z14 = z12;
                z15 = z13;
                interfaceC5985X5 = interfaceC5985X3;
                i23 = i20;
                i24 = i22;
                interfaceC10459q4 = interfaceC10459q3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C18934v(Text, text, interfaceC10459q4, interfaceC1436k3, z14, z15, c18918f5, interfaceC5985X5, i23, i24, i12, i13);
            }
        }
        i14 = 224256 | i26;
        z11 = z10;
        i17 = i13 & 32;
        if (i17 != 0) {
            i14 |= 524288;
        }
        if ((29360128 & i12) == 0) {
            if ((i13 & 64) == 0) {
                interfaceC5985X2 = interfaceC5985X;
                if (c6021p.m6542f(interfaceC5985X2)) {
                }
                i14 |= i28;
            } else {
                interfaceC5985X2 = interfaceC5985X;
            }
            i14 |= i28;
        } else {
            interfaceC5985X2 = interfaceC5985X;
        }
        i18 = i14 | 905969664;
        if (i17 != 32) {
            c6021p.m6519N();
            i19 = i12 & 1;
            c5975s = C5975S.f19448r0;
            if (i19 != 0) {
                if (i27 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                C18914b c18914b10 = C18914b.f60354p0;
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                    i18 &= -3670017;
                } else {
                    c18918f2 = c18918f;
                }
                if ((i13 & 64) != 0) {
                    interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                    i18 &= -29360129;
                } else {
                    interfaceC5985XM6430Q = interfaceC5985X2;
                }
                z12 = true;
                i20 = 1;
                c18918f3 = c18918f2;
                interfaceC1436k2 = c18914b10;
                interfaceC5985X3 = interfaceC5985XM6430Q;
                z13 = z11;
                interfaceC10459q3 = interfaceC10459q2;
                i21 = i18;
                i22 = Integer.MAX_VALUE;
            } else {
                if (i27 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                C18914b c18914b11 = C18914b.f60354p0;
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                    i18 &= -3670017;
                } else {
                    c18918f2 = c18918f;
                }
                if ((i13 & 64) != 0) {
                    interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                    i18 &= -29360129;
                } else {
                    interfaceC5985XM6430Q = interfaceC5985X2;
                }
                z12 = true;
                i20 = 1;
                c18918f3 = c18918f2;
                interfaceC1436k2 = c18914b11;
                interfaceC5985X3 = interfaceC5985XM6430Q;
                z13 = z11;
                interfaceC10459q3 = interfaceC10459q2;
                i21 = i18;
                i22 = Integer.MAX_VALUE;
            }
            c6021p.m6554q();
            c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
            jM19845d = AbstractC18319D.m19845d(Text, c6021p);
            Object c14365u6 = new C14365u(jM19845d);
            c6021p.m6525T(1618982084);
            zM6542f = c6021p.m6542f(c14365u6) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            map = text.f60395b;
            if (zM6542f) {
                if (c18930r == null) {
                    c18930r = C18930r.f60396i;
                }
                C18930r c18930rM20272a10 = c18930r.m20272a();
                c3587c = new C3587c();
                C3590f c3590f12 = text.f60394a;
                c3587c.m4290b(c3590f12);
                while (r4.hasNext()) {
                    String str16 = AbstractC18928p.f60391b;
                    abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                    if (abstractC18928pM20267b == null) {
                        c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                    }
                }
                objM6514H = c3587c.m4297i();
                c6021p.m6537c0(objM6514H);
            } else {
                if (c18930r == null) {
                    c18930r = C18930r.f60396i;
                }
                C18930r c18930rM20272a11 = c18930r.m20272a();
                c3587c = new C3587c();
                C3590f c3590f13 = text.f60394a;
                c3587c.m4290b(c3590f13);
                while (r4.hasNext()) {
                    String str17 = AbstractC18928p.f60391b;
                    abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                    if (abstractC18928pM20267b == null) {
                        c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                    }
                }
                objM6514H = c3587c.m4297i();
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            c3590f = (C3590f) objM6514H;
            c6021p.m6525T(1157296644);
            zM6542f2 = c6021p.m6542f(text);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            map2 = (Map) objM6514H2;
            zIsEmpty = map2.isEmpty();
            c6021p.m6525T(1858664088);
            c6021p.m6525T(773894976);
            c6021p.m6525T(-492369756);
            objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c6021p.m6553p(false);
            c2925c = ((C6035w) objM6514H3).f19668Y;
            c6021p.m6553p(false);
            c6021p.m6525T(-492369756);
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C9569u();
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            c9569u = (C9569u) objM6514H4;
            c6021p.m6525T(-492369756);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
            if (c18918f3.f60364a) {
                c6021p.m6525T(-492369756);
                objM6514H6 = c6021p.m6514H();
                if (objM6514H6 == obj) {
                    objM6514H6 = C5997d.m6429P(-1);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                C5996c0 c5996c5 = (C5996c0) objM6514H6;
                c6021p.m6525T(-492369756);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    z16 = false;
                    objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    z16 = false;
                }
                c6021p.m6553p(z16);
                InterfaceC5985X interfaceC5985X11 = (InterfaceC5985X) objM6514H7;
                c6021p.m6525T(-492369756);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                    c6021p.m6537c0(objM6514H8);
                }
                c6021p.m6553p(false);
                interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                c6021p.m6525T(-492369756);
                objM6514H9 = c6021p.m6514H();
                if (objM6514H9 == obj) {
                    C21554a c21554a6 = C21555b.f68260Z;
                    objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                    c6021p.m6537c0(objM6514H9);
                }
                c6021p.m6553p(false);
                InterfaceC5985X interfaceC5985XM6468x6 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                C18911A c18911a6 = new C18911A(interfaceC5985X11, interfaceC5985X4, c5996c5, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                C18918f c18918f12 = c18918f3;
                C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f12, z13, interfaceC5985X11, c18911a6, null), c6021p, c3590f);
                C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f12, interfaceC5985X11, c18911a6, null), c6021p);
                C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X11, c18911a6, interfaceC5985XM6468x6, null), c6021p, (C3590f) interfaceC5985XM6468x6.getValue());
            } else {
                map2 = map2;
                interfaceC10459q3 = interfaceC10459q3;
                interfaceC5985X4.setValue(c3590f);
            }
            if (zIsEmpty) {
                c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                c9563o = c9569u.f28782p0;
                if (c3590fM4297i.f10934Y.length() == 0) {
                    c18918f4 = c18918f3;
                } else {
                    c9566r = new C9566r();
                    it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                    while (it.hasNext()) {
                        c18931s = (C18931s) it.next();
                        i25 = c18931s.f60405a;
                        str = c3590fM4297i.f10934Y;
                        if (i25 >= str.length()) {
                            it4 = it;
                            c18918f6 = c18918f3;
                        } else {
                            int length6 = str.length();
                            int i214 = c18931s.f60405a;
                            C3590f c3590fSubSequence6 = c3590fM4297i.subSequence(i214, length6);
                            List listM4299b6 = c3590fSubSequence6.m4299b();
                            arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b6, 10));
                            it3 = listM4299b6.iterator();
                            while (true) {
                                zHasNext = it3.hasNext();
                                f10 = c18931s.f60406b;
                                if (!zHasNext) {
                                    break;
                                    break;
                                }
                                C3588d c3588d7 = (C3588d) it3.next();
                                C3573D c3573d11 = (C3573D) c3588d7.f10930a;
                                arrayList.add(new C3588d(C3573D.m4244a(c3573d11, C14365u.m15774b(f10, c3573d11.f10859a.mo7588b()), 0L, 65534), c3588d7.f10931b, c3588d7.f10932c, c3588d7.f10933d));
                                it = it;
                                it3 = it3;
                                c18918f3 = c18918f3;
                            }
                            it4 = it;
                            c18918f6 = c18918f3;
                            C3573D c3573d12 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                            String str18 = c3590fSubSequence6.f10934Y;
                            c9566r.add(new C3590f(4, str18, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d12, 0, str18.length())), arrayList)));
                            c3590fM4297i = c3590fM4297i.subSequence(0, i214);
                        }
                        it = it4;
                        c18918f3 = c18918f6;
                    }
                    c18918f4 = c18918f3;
                    c3587c2 = new C3587c(c3590fM4297i);
                    it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                    while (it2.hasNext()) {
                        c3587c2.m4290b((C3590f) it2.next());
                    }
                    c3590fM4297i = c3587c2.m4297i();
                }
                c3590f2 = c3590fM4297i;
            } else {
                c18918f4 = c18918f3;
                c3590f2 = c3590f;
            }
            c6021p.m6553p(false);
            AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
            c18918f5 = c18918f4;
            interfaceC1436k3 = interfaceC1436k2;
            z14 = z12;
            z15 = z13;
            interfaceC5985X5 = interfaceC5985X3;
            i23 = i20;
            i24 = i22;
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            c6021p.m6519N();
            i19 = i12 & 1;
            c5975s = C5975S.f19448r0;
            if (i19 != 0) {
                if (i27 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                C18914b c18914b12 = C18914b.f60354p0;
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                    i18 &= -3670017;
                } else {
                    c18918f2 = c18918f;
                }
                if ((i13 & 64) != 0) {
                    interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                    i18 &= -29360129;
                } else {
                    interfaceC5985XM6430Q = interfaceC5985X2;
                }
                z12 = true;
                i20 = 1;
                c18918f3 = c18918f2;
                interfaceC1436k2 = c18914b12;
                interfaceC5985X3 = interfaceC5985XM6430Q;
                z13 = z11;
                interfaceC10459q3 = interfaceC10459q2;
                i21 = i18;
                i22 = Integer.MAX_VALUE;
            } else {
                if (i27 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                C18914b c18914b13 = C18914b.f60354p0;
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    c18918f2 = new C18918f(false, 0, 0, 0, null, 511);
                    i18 &= -3670017;
                } else {
                    c18918f2 = c18918f;
                }
                if ((i13 & 64) != 0) {
                    interfaceC5985XM6430Q = C5997d.m6430Q(f60347a, c5975s);
                    i18 &= -29360129;
                } else {
                    interfaceC5985XM6430Q = interfaceC5985X2;
                }
                z12 = true;
                i20 = 1;
                c18918f3 = c18918f2;
                interfaceC1436k2 = c18914b13;
                interfaceC5985X3 = interfaceC5985XM6430Q;
                z13 = z11;
                interfaceC10459q3 = interfaceC10459q2;
                i21 = i18;
                i22 = Integer.MAX_VALUE;
            }
            c6021p.m6554q();
            c18930r = AbstractC18322G.m19849b(Text, c6021p).f58488h;
            jM19845d = AbstractC18319D.m19845d(Text, c6021p);
            Object c14365u7 = new C14365u(jM19845d);
            c6021p.m6525T(1618982084);
            zM6542f = c6021p.m6542f(c14365u7) | c6021p.m6542f(text) | c6021p.m6542f(c18930r);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            map = text.f60395b;
            if (zM6542f) {
                if (c18930r == null) {
                    c18930r = C18930r.f60396i;
                }
                C18930r c18930rM20272a12 = c18930r.m20272a();
                c3587c = new C3587c();
                C3590f c3590f14 = text.f60394a;
                c3587c.m4290b(c3590f14);
                while (r4.hasNext()) {
                    String str19 = AbstractC18928p.f60391b;
                    abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                    if (abstractC18928pM20267b == null) {
                        c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                    }
                }
                objM6514H = c3587c.m4297i();
                c6021p.m6537c0(objM6514H);
            } else {
                if (c18930r == null) {
                    c18930r = C18930r.f60396i;
                }
                C18930r c18930rM20272a13 = c18930r.m20272a();
                c3587c = new C3587c();
                C3590f c3590f15 = text.f60394a;
                c3587c.m4290b(c3590f15);
                while (r4.hasNext()) {
                    String str110 = AbstractC18928p.f60391b;
                    abstractC18928pM20267b = m20267b((String) c3588d.f10930a, map);
                    if (abstractC18928pM20267b == null) {
                        c3587c.m4289a(c3573dMo1115a, c3588d.f10931b, c3588d.f10932c);
                    }
                }
                objM6514H = c3587c.m4297i();
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            c3590f = (C3590f) objM6514H;
            c6021p.m6525T(1157296644);
            zM6542f2 = c6021p.m6542f(text);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = AbstractC17659D.m19255q(AbstractC21031l.m21496t(AbstractC17680n.m19329H(map.entrySet()), C18914b.f60353o0));
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            map2 = (Map) objM6514H2;
            zIsEmpty = map2.isEmpty();
            c6021p.m6525T(1858664088);
            c6021p.m6525T(773894976);
            c6021p.m6525T(-492369756);
            objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c6021p.m6553p(false);
            c2925c = ((C6035w) objM6514H3).f19668Y;
            c6021p.m6553p(false);
            c6021p.m6525T(-492369756);
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C9569u();
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            c9569u = (C9569u) objM6514H4;
            c6021p.m6525T(-492369756);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = C5997d.m6430Q(new C3590f(6, "", null), c5975s);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            interfaceC5985X4 = (InterfaceC5985X) objM6514H5;
            if (c18918f3.f60364a) {
                c6021p.m6525T(-492369756);
                objM6514H6 = c6021p.m6514H();
                if (objM6514H6 == obj) {
                    objM6514H6 = C5997d.m6429P(-1);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                C5996c0 c5996c6 = (C5996c0) objM6514H6;
                c6021p.m6525T(-492369756);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    z16 = false;
                    objM6514H7 = C5997d.m6430Q(new C19530l(new C3590f(6, "", null), C17689w.f56480Y, false), c5975s);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    z16 = false;
                }
                c6021p.m6553p(z16);
                InterfaceC5985X interfaceC5985X12 = (InterfaceC5985X) objM6514H7;
                c6021p.m6525T(-492369756);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = AbstractC2124C.m3204c(new C3590f(6, "", null));
                    c6021p.m6537c0(objM6514H8);
                }
                c6021p.m6553p(false);
                interfaceC2213w0 = (InterfaceC2213w0) objM6514H8;
                c6021p.m6525T(-492369756);
                objM6514H9 = c6021p.m6514H();
                if (objM6514H9 == obj) {
                    C21554a c21554a7 = C21555b.f68260Z;
                    objM6514H9 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(c18918f3.f60366c, EnumC21557d.MILLISECONDS)));
                    c6021p.m6537c0(objM6514H9);
                }
                c6021p.m6553p(false);
                InterfaceC5985X interfaceC5985XM6468x7 = C5997d.m6468x((InterfaceC2184i) objM6514H9, new C3590f(6, "", null), c2925c.f8769Y, c6021p, 568, 0);
                C18911A c18911a7 = new C18911A(interfaceC5985X12, interfaceC5985X4, c5996c6, c9569u, c2925c, z13, interfaceC5985X3, c18918f3);
                C18918f c18918f13 = c18918f3;
                C5997d.m6450f(new C18935w(interfaceC2213w0, c3590f, c18918f13, z13, interfaceC5985X12, c18911a7, null), c6021p, c3590f);
                C5997d.m6451g(Boolean.valueOf(z13), c3590f, new C18936x(z13, c3590f, c18918f13, interfaceC5985X12, c18911a7, null), c6021p);
                C5997d.m6450f(new C18937y(c18918f3, interfaceC5985X12, c18911a7, interfaceC5985XM6468x7, null), c6021p, (C3590f) interfaceC5985XM6468x7.getValue());
            } else {
                map2 = map2;
                interfaceC10459q3 = interfaceC10459q3;
                interfaceC5985X4.setValue(c3590f);
            }
            if (zIsEmpty) {
                c3590fM4297i = (C3590f) interfaceC5985X4.getValue();
                c9563o = c9569u.f28782p0;
                if (c3590fM4297i.f10934Y.length() == 0) {
                    c18918f4 = c18918f3;
                } else {
                    c9566r = new C9566r();
                    it = AbstractC17680n.m19370t0(c9563o, new C0842z(18)).iterator();
                    while (it.hasNext()) {
                        c18931s = (C18931s) it.next();
                        i25 = c18931s.f60405a;
                        str = c3590fM4297i.f10934Y;
                        if (i25 >= str.length()) {
                            it4 = it;
                            c18918f6 = c18918f3;
                        } else {
                            int length7 = str.length();
                            int i215 = c18931s.f60405a;
                            C3590f c3590fSubSequence7 = c3590fM4297i.subSequence(i215, length7);
                            List listM4299b7 = c3590fSubSequence7.m4299b();
                            arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b7, 10));
                            it3 = listM4299b7.iterator();
                            while (true) {
                                zHasNext = it3.hasNext();
                                f10 = c18931s.f60406b;
                                if (!zHasNext) {
                                    break;
                                    break;
                                }
                                C3588d c3588d8 = (C3588d) it3.next();
                                C3573D c3573d13 = (C3573D) c3588d8.f10930a;
                                arrayList.add(new C3588d(C3573D.m4244a(c3573d13, C14365u.m15774b(f10, c3573d13.f10859a.mo7588b()), 0L, 65534), c3588d8.f10931b, c3588d8.f10932c, c3588d8.f10933d));
                                it = it;
                                it3 = it3;
                                c18918f3 = c18918f3;
                            }
                            it4 = it;
                            c18918f6 = c18918f3;
                            C3573D c3573d14 = new C3573D(C14365u.m15774b(f10, jM19845d), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                            String str111 = c3590fSubSequence7.f10934Y;
                            c9566r.add(new C3590f(4, str111, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C3588d(c3573d14, 0, str111.length())), arrayList)));
                            c3590fM4297i = c3590fM4297i.subSequence(0, i215);
                        }
                        it = it4;
                        c18918f3 = c18918f6;
                    }
                    c18918f4 = c18918f3;
                    c3587c2 = new C3587c(c3590fM4297i);
                    it2 = AbstractC17680n.m19363m0(c9566r).iterator();
                    while (it2.hasNext()) {
                        c3587c2.m4290b((C3590f) it2.next());
                    }
                    c3590fM4297i = c3587c2.m4297i();
                }
                c3590f2 = c3590fM4297i;
            } else {
                c18918f4 = c18918f3;
                c3590f2 = c3590f;
            }
            c6021p.m6553p(false);
            AbstractC17758g.m19481a(interfaceC10459q3, null, false, AbstractC8411c.m8968b(971515980, c6021p, new C18933u(map2, Text, c3590f2, z12, i20, i22, interfaceC1436k2, c3590f, text)), c6021p, ((i21 >> 6) & 14) | 3072, 6);
            c18918f5 = c18918f4;
            interfaceC1436k3 = interfaceC1436k2;
            z14 = z12;
            z15 = z13;
            interfaceC5985X5 = interfaceC5985X3;
            i23 = i20;
            i24 = i22;
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18934v(Text, text, interfaceC10459q4, interfaceC1436k3, z14, z15, c18918f5, interfaceC5985X5, i23, i24, i12, i13);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: b */
    public static AbstractC18928p m20267b(String tag, Map map) {
        AbstractC16544l.m18094g(tag, "tag");
        String strM21688V = AbstractC21322p.m21688V(tag, "format:");
        Object obj = null;
        if (strM21688V != tag) {
            Object obj2 = map.get(strM21688V);
            if (obj2 instanceof AbstractC18928p) {
                return (AbstractC18928p) obj2;
            }
            return null;
        }
        for (Object obj3 : (List) AbstractC18928p.f60392c.getValue()) {
            if (AbstractC16544l.m18089b(((AbstractC18928p) obj3).f60393a, tag)) {
                obj = obj3;
                break;
            }
        }
        return (AbstractC18928p) obj;
    }
}
