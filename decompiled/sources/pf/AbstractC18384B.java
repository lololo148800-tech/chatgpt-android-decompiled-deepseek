package pf;

import androidx.compose.p650ui.layout.AbstractC10868a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p039Bc.C0884r;
import p042Bf.C1269k;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19744u;
import p103Dn.InterfaceC2184i;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8455C;
import p544W9.AbstractC8467E;
import p547Wc.C8758B;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9930m3;
import p635a1.InterfaceC10459q;
import p636a2.C10467d;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p758g0.C13756d;
import p774h1.AbstractC14360p;
import p774h1.C14327E;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: pf.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18384B {

    /* JADX INFO: renamed from: a */
    public static final List f58664a;

    static {
        Float fValueOf = Float.valueOf(0.052431922f);
        Float fValueOf2 = Float.valueOf(0.044152293f);
        Float fValueOf3 = Float.valueOf(0.069414705f);
        Float fValueOf4 = Float.valueOf(0.062584616f);
        Float fValueOf5 = Float.valueOf(0.029585473f);
        Float fValueOf6 = Float.valueOf(0.040978745f);
        Float fValueOf7 = Float.valueOf(0.031900346f);
        Float fValueOf8 = Float.valueOf(0.011577489f);
        Float fValueOf9 = Float.valueOf(0.009443121f);
        Float fValueOf10 = Float.valueOf(0.07090659f);
        Float fValueOf11 = Float.valueOf(0.06371302f);
        Float fValueOf12 = Float.valueOf(0.03701033f);
        Float fValueOf13 = Float.valueOf(0.027984198f);
        Float fValueOf14 = Float.valueOf(0.02490154f);
        Float fValueOf15 = Float.valueOf(0.008405885f);
        Float fValueOf16 = Float.valueOf(2.386179E-4f);
        Float fValueOf17 = Float.valueOf(2.8472158E-4f);
        Float fValueOf18 = Float.valueOf(3.6731127E-4f);
        Float fValueOf19 = Float.valueOf(0.001547938f);
        Float fValueOf20 = Float.valueOf(0.08509952f);
        Float fValueOf21 = Float.valueOf(0.05648171f);
        Float fValueOf22 = Float.valueOf(0.068350405f);
        Float fValueOf23 = Float.valueOf(0.055271182f);
        Float fValueOf24 = Float.valueOf(0.034786254f);
        Float fValueOf25 = Float.valueOf(0.06033569f);
        Float fValueOf26 = Float.valueOf(0.031018967f);
        Float fValueOf27 = Float.valueOf(0.010628631f);
        Float fValueOf28 = Float.valueOf(0.021574067f);
        Float fValueOf29 = Float.valueOf(0.0365847f);
        Float fValueOf30 = Float.valueOf(0.045271646f);
        Float fValueOf31 = Float.valueOf(0.019578807f);
        Float fValueOf32 = Float.valueOf(0.05673204f);
        Float fValueOf33 = Float.valueOf(0.026047947f);
        Float fValueOf34 = Float.valueOf(0.033229176f);
        Float fValueOf35 = Float.valueOf(0.03629315f);
        Float fValueOf36 = Float.valueOf(0.038187016f);
        Float fValueOf37 = Float.valueOf(0.031089354f);
        Float fValueOf38 = Float.valueOf(0.03767811f);
        Float fValueOf39 = Float.valueOf(0.041174285f);
        f58664a = AbstractC17681o.m19382k(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, fValueOf8, fValueOf9, fValueOf10, fValueOf11, fValueOf12, fValueOf13, fValueOf14, fValueOf15, fValueOf16, fValueOf17, fValueOf18, fValueOf19, fValueOf20, fValueOf21, fValueOf22, fValueOf23, fValueOf24, fValueOf25, fValueOf26, fValueOf27, fValueOf28, fValueOf29, fValueOf30, fValueOf31, fValueOf32, fValueOf33, fValueOf34, fValueOf35, fValueOf36, fValueOf37, fValueOf38, fValueOf39, fValueOf39, fValueOf25, fValueOf26, fValueOf27, fValueOf28, fValueOf29, fValueOf39, fValueOf39, fValueOf39, Float.valueOf(0.031424057f), Float.valueOf(0.028398396f), Float.valueOf(0.02338961f), Float.valueOf(0.024917435f), Float.valueOf(0.039971903f), Float.valueOf(0.021276072f));
    }

    /* JADX INFO: renamed from: a */
    public static final void m19861a(C18398n state, InterfaceC2184i progressFlow, InterfaceC1436k onSeek, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(progressFlow, "progressFlow");
        AbstractC16544l.m18094g(onSeek, "onSeek");
        c6021p.m6526U(-2062606047);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(progressFlow) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onSeek) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-650440015);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-650437774);
            List list = state.f58696k;
            boolean zM6542f = c6021p.m6542f(list);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (m19863c(list)) {
                    List list2 = list;
                    Float fM19355e0 = AbstractC17680n.m19355e0(list2);
                    float fFloatValue = 1.0f / (fM19355e0 != null ? fM19355e0.floatValue() : 1.0f);
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Float.valueOf(((Number) it.next()).floatValue() * fFloatValue));
                    }
                    list = arrayList;
                }
                c6021p.m6537c0(list);
                objM6514H2 = list;
            }
            List list3 = (List) objM6514H2;
            c6021p.m6553p(false);
            int iM6412g = c5996c0.m6412g();
            c6021p.m6524S(-650425913);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = new C0884r(c5996c0, 8);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            m19862b(list3, progressFlow, iM6412g, onSeek, (InterfaceC1436k) objM6514H3, interfaceC10459q, c6021p, (i11 & 112) | 24576 | ((i11 << 3) & 7168) | ((i11 << 6) & 458752));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(state, progressFlow, onSeek, interfaceC10459q, i10, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:115:0x027c  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x0428  */
    /* JADX WARN: Code duplicated, block: B:151:0x042b  */
    /* JADX WARN: Code duplicated, block: B:155:0x043d  */
    /* JADX WARN: Code duplicated, block: B:159:0x048d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6 A[LOOP:2: B:96:0x01e4->B:97:0x01e6, LOOP_END] */
    /* JADX INFO: renamed from: b */
    public static final void m19862b(List list, InterfaceC2184i interfaceC2184i, int i10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i11) {
        float fFloatValue;
        float f10;
        InterfaceC5985X interfaceC5985X;
        boolean z6;
        Object objM6514H;
        ArrayList arrayList;
        int i12;
        InterfaceC5985X interfaceC5985X2;
        Object objM530s;
        InterfaceC5985X interfaceC5985X3;
        boolean zM6542f;
        Object objM6514H2;
        InterfaceC7537b interfaceC7537b;
        float f11;
        List list2;
        Object obj;
        AbstractC14360p abstractC14360p;
        boolean z10;
        boolean z11;
        Object objM6514H3;
        InterfaceC5985X interfaceC5985X4;
        Object objM6514H4;
        boolean zM6542f2;
        Object objM6514H5;
        boolean zM6545h;
        Object objM6514H6;
        boolean z12 = true;
        c6021p.m6526U(657447972);
        int i13 = (i11 & 6) == 0 ? (c6021p.m6545h(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6545h(interfaceC2184i) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6538d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        int i14 = i13;
        if ((74899 & i14) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC7537b interfaceC7537b2 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            long j10 = AbstractC8467E.m9097b(c6021p) ? C14365u.f45055e : C14365u.f45052b;
            long jM15774b = C14365u.m15774b(0.4f, j10);
            InterfaceC5985X interfaceC5985XM9640b = AbstractC9112C3.m9640b(interfaceC2184i, new C17309l(0L, 1L), c6021p, ((i14 >> 3) & 14) | 48);
            c6021p.m6524S(-708665302);
            Object objM6514H7 = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H7 == c5975s) {
                objM6514H7 = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(objM6514H7);
            }
            InterfaceC5985X interfaceC5985X5 = (InterfaceC5985X) objM6514H7;
            Object objM530s2 = AbstractC0168G.m530s(-708663694, c6021p, false);
            if (objM530s2 == c5975s) {
                objM530s2 = C5997d.m6430Q(new C7545j(0L), c5975s2);
                c6021p.m6537c0(objM530s2);
            }
            InterfaceC5985X interfaceC5985X6 = (InterfaceC5985X) objM530s2;
            c6021p.m6553p(false);
            if (((Float) interfaceC5985X5.getValue()) != null) {
                Float f12 = (Float) interfaceC5985X5.getValue();
                if (f12 != null) {
                    fFloatValue = f12.floatValue();
                    f10 = fFloatValue;
                } else {
                    interfaceC5985X6 = interfaceC5985X6;
                    f10 = 0.0f;
                }
            } else if (((Number) ((C17309l) interfaceC5985XM9640b.getValue()).f55137Z).longValue() == 0) {
                interfaceC5985X6 = interfaceC5985X6;
                f10 = 0.0f;
            } else {
                fFloatValue = ((Number) ((C17309l) interfaceC5985XM9640b.getValue()).f55136Y).floatValue() / ((Number) ((C17309l) interfaceC5985XM9640b.getValue()).f55137Z).longValue();
                f10 = fFloatValue;
            }
            int i15 = ((i14 >> 6) & 14) | ((i14 << 3) & 112);
            c6021p.m6524S(-1186939410);
            if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                c6021p.m6553p(false);
                list2 = list;
                c5975s = c5975s;
                interfaceC5985X = interfaceC5985XM9640b;
                interfaceC7537b = interfaceC7537b2;
                j10 = j10;
                f11 = 0.0f;
            } else {
                c6021p.m6524S(-2055802149);
                Object objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == c5975s) {
                    objM6514H8 = AbstractC13758e.m15236a(1.0f);
                    c6021p.m6537c0(objM6514H8);
                }
                C13756d c13756d = (C13756d) objM6514H8;
                c6021p.m6553p(false);
                c6021p.m6524S(-2055800260);
                int i16 = (i15 & 14) ^ 6;
                if (i16 <= 4 || !c6021p.m6538d(i10)) {
                    interfaceC5985X = interfaceC5985XM9640b;
                    if ((i15 & 6) != 4) {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z6 || objM6514H == c5975s) {
                        arrayList = new ArrayList(i10);
                        for (i12 = 0; i12 < i10; i12++) {
                            arrayList.add(Float.valueOf(m19864d(i12 / i10, list)));
                        }
                        objM6514H = C5997d.m6430Q(arrayList, c5975s2);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X2 = (InterfaceC5985X) objM6514H;
                    objM530s = AbstractC0168G.m530s(-2055794139, c6021p, false);
                    if (objM530s == c5975s) {
                        objM530s = C5997d.m6430Q(list, c5975s2);
                        c6021p.m6537c0(objM530s);
                    }
                    interfaceC5985X3 = (InterfaceC5985X) objM530s;
                    c6021p.m6553p(false);
                    Integer numValueOf = Integer.valueOf(i10);
                    Float fValueOf = Float.valueOf(AbstractC17680n.m19371u0(list));
                    c6021p.m6524S(-2055791215);
                    zM6542f = ((i16 <= 4 && c6021p.m6538d(i10)) || (i15 & 6) == 4) | c6021p.m6542f(interfaceC5985X2) | c6021p.m6545h(c13756d) | c6021p.m6545h(list);
                    objM6514H2 = c6021p.m6514H();
                    if (!zM6542f || objM6514H2 == c5975s) {
                        interfaceC7537b = interfaceC7537b2;
                        f11 = 0.0f;
                        Object c18383a = new C18383A(c13756d, interfaceC5985X2, interfaceC5985X3, i10, list, null);
                        c6021p.m6537c0(c18383a);
                        objM6514H2 = c18383a;
                    } else {
                        interfaceC7537b = interfaceC7537b2;
                        f11 = 0.0f;
                    }
                    c6021p.m6553p(false);
                    C5997d.m6451g(numValueOf, fValueOf, (InterfaceC1439n) objM6514H2, c6021p);
                    List list3 = (List) interfaceC5985X2.getValue();
                    c6021p.m6553p(false);
                    list2 = list3;
                } else {
                    interfaceC5985X = interfaceC5985XM9640b;
                }
                z6 = true;
                objM6514H = c6021p.m6514H();
                if (z6) {
                    arrayList = new ArrayList(i10);
                    while (i12 < i10) {
                        arrayList.add(Float.valueOf(m19864d(i12 / i10, list)));
                    }
                    objM6514H = C5997d.m6430Q(arrayList, c5975s2);
                    c6021p.m6537c0(objM6514H);
                } else {
                    arrayList = new ArrayList(i10);
                    while (i12 < i10) {
                        arrayList.add(Float.valueOf(m19864d(i12 / i10, list)));
                    }
                    objM6514H = C5997d.m6430Q(arrayList, c5975s2);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM6514H;
                objM530s = AbstractC0168G.m530s(-2055794139, c6021p, false);
                if (objM530s == c5975s) {
                    objM530s = C5997d.m6430Q(list, c5975s2);
                    c6021p.m6537c0(objM530s);
                }
                interfaceC5985X3 = (InterfaceC5985X) objM530s;
                c6021p.m6553p(false);
                Integer numValueOf2 = Integer.valueOf(i10);
                Float fValueOf2 = Float.valueOf(AbstractC17680n.m19371u0(list));
                c6021p.m6524S(-2055791215);
                zM6542f = ((i16 <= 4 && c6021p.m6538d(i10)) || (i15 & 6) == 4) | c6021p.m6542f(interfaceC5985X2) | c6021p.m6545h(c13756d) | c6021p.m6545h(list);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f) {
                    interfaceC7537b = interfaceC7537b2;
                    f11 = 0.0f;
                    Object c18383a2 = new C18383A(c13756d, interfaceC5985X2, interfaceC5985X3, i10, list, null);
                    c6021p.m6537c0(c18383a2);
                    objM6514H2 = c18383a2;
                } else {
                    interfaceC7537b = interfaceC7537b2;
                    f11 = 0.0f;
                    Object c18383a3 = new C18383A(c13756d, interfaceC5985X2, interfaceC5985X3, i10, list, null);
                    c6021p.m6537c0(c18383a3);
                    objM6514H2 = c18383a3;
                }
                c6021p.m6553p(false);
                C5997d.m6451g(numValueOf2, fValueOf2, (InterfaceC1439n) objM6514H2, c6021p);
                List list4 = (List) interfaceC5985X2.getValue();
                c6021p.m6553p(false);
                list2 = list4;
            }
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(m19863c(list2) ? 1.0f : f11, null, "Waveform line to bar transition", c6021p, 3072, 22);
            float f13 = 2;
            InterfaceC7537b interfaceC7537b3 = interfaceC7537b;
            float fMo7864b0 = interfaceC7537b3.mo7864b0(f13);
            float fMo7864b1 = interfaceC7537b3.mo7864b0(f13);
            float f14 = fMo7864b0 / 2.0f;
            float fMo7864b2 = interfaceC7537b3.mo7864b0(f13);
            c6021p.m6524S(-708640870);
            boolean zM6536c = c6021p.m6536c(f10) | c6021p.m6540e(j10) | c6021p.m6540e(jM15774b);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6536c) {
                obj = c5975s;
            } else {
                obj = c5975s;
                if (objM6514H9 == obj) {
                }
                abstractC14360p = (AbstractC14360p) objM6514H9;
                c6021p.m6553p(false);
                c6021p.m6524S(-708629959);
                boolean zM6536c2 = c6021p.m6536c(fMo7864b1) | c6021p.m6536c(fMo7864b0);
                if ((57344 & i14) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zM6536c2 | z10;
                objM6514H3 = c6021p.m6514H();
                if (!z11 || objM6514H3 == obj) {
                    interfaceC5985X4 = interfaceC5985X6;
                    objM6514H3 = new C10467d(fMo7864b1, fMo7864b0, interfaceC1436k2, interfaceC5985X4);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    interfaceC5985X4 = interfaceC5985X6;
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11319e = AbstractC10868a.m11319e(interfaceC10459q, (InterfaceC1436k) objM6514H3);
                c6021p.m6524S(-708621610);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C6194i(interfaceC5985X4, 25);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11319e2 = AbstractC10868a.m11319e(interfaceC10459qM11319e, (InterfaceC1436k) objM6514H4);
                C7545j c7545j = new C7545j(((C7545j) interfaceC5985X4.getValue()).f23903a);
                c6021p.m6524S(-708619301);
                if ((i14 & 7168) == 2048) {
                    z12 = false;
                }
                zM6542f2 = z12 | c6021p.m6542f(interfaceC5985X);
                objM6514H5 = c6021p.m6514H();
                if (zM6542f2 || objM6514H5 == obj) {
                    objM6514H5 = new C18409y(interfaceC1436k, interfaceC5985X4, interfaceC5985X5, interfaceC5985X, null);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM11319e2, c7545j, (InterfaceC1439n) objM6514H5);
                c6021p.m6524S(-708591762);
                zM6545h = c6021p.m6545h(list2) | c6021p.m6536c(fMo7864b0) | c6021p.m6536c(fMo7864b1) | c6021p.m6536c(fMo7864b2) | c6021p.m6536c(f14) | c6021p.m6542f(abstractC14360p) | c6021p.m6542f(interfaceC5982V0M15261b);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h || objM6514H6 == obj) {
                    objM6514H6 = new C18410z(list2, abstractC14360p, fMo7864b2, fMo7864b0, fMo7864b1, f14, interfaceC5985X4, interfaceC5982V0M15261b);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H6, c6021p, interfaceC10459qM20694b);
            }
            C17309l[] c17309lArr = (C17309l[]) Arrays.copyOf(new C17309l[]{new C17309l(Float.valueOf(f11), new C14365u(j10)), new C17309l(Float.valueOf(f10), new C14365u(j10)), new C17309l(Float.valueOf(f10), new C14365u(jM15774b)), new C17309l(Float.valueOf(1.0f), new C14365u(jM15774b))}, 4);
            float f15 = f11;
            long jM8536b = AbstractC8088f6.m8536b(f15, f15);
            long jM8536b2 = AbstractC8088f6.m8536b(Float.POSITIVE_INFINITY, f15);
            ArrayList arrayList2 = new ArrayList(c17309lArr.length);
            for (C17309l c17309l : c17309lArr) {
                arrayList2.add(new C14365u(((C14365u) c17309l.f55137Z).f45062a));
            }
            ArrayList arrayList3 = new ArrayList(c17309lArr.length);
            for (C17309l c17309l2 : c17309lArr) {
                arrayList3.add(Float.valueOf(((Number) c17309l2.f55136Y).floatValue()));
            }
            objM6514H9 = new C14327E(arrayList2, arrayList3, jM8536b, jM8536b2, 0);
            c6021p.m6537c0(objM6514H9);
            abstractC14360p = (AbstractC14360p) objM6514H9;
            c6021p.m6553p(false);
            c6021p.m6524S(-708629959);
            boolean zM6536c3 = c6021p.m6536c(fMo7864b1) | c6021p.m6536c(fMo7864b0);
            if ((57344 & i14) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zM6536c3 | z10;
            objM6514H3 = c6021p.m6514H();
            if (z11) {
                interfaceC5985X4 = interfaceC5985X6;
                objM6514H3 = new C10467d(fMo7864b1, fMo7864b0, interfaceC1436k2, interfaceC5985X4);
                c6021p.m6537c0(objM6514H3);
            } else {
                interfaceC5985X4 = interfaceC5985X6;
                objM6514H3 = new C10467d(fMo7864b1, fMo7864b0, interfaceC1436k2, interfaceC5985X4);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11319e3 = AbstractC10868a.m11319e(interfaceC10459q, (InterfaceC1436k) objM6514H3);
            c6021p.m6524S(-708621610);
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C6194i(interfaceC5985X4, 25);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11319e4 = AbstractC10868a.m11319e(interfaceC10459qM11319e3, (InterfaceC1436k) objM6514H4);
            C7545j c7545j2 = new C7545j(((C7545j) interfaceC5985X4.getValue()).f23903a);
            c6021p.m6524S(-708619301);
            if ((i14 & 7168) == 2048) {
                z12 = false;
            }
            zM6542f2 = z12 | c6021p.m6542f(interfaceC5985X);
            objM6514H5 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H5 = new C18409y(interfaceC1436k, interfaceC5985X4, interfaceC5985X5, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H5);
            } else {
                objM6514H5 = new C18409y(interfaceC1436k, interfaceC5985X4, interfaceC5985X5, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM20694b2 = AbstractC19744u.m20694b(interfaceC10459qM11319e4, c7545j2, (InterfaceC1439n) objM6514H5);
            c6021p.m6524S(-708591762);
            zM6545h = c6021p.m6545h(list2) | c6021p.m6536c(fMo7864b0) | c6021p.m6536c(fMo7864b1) | c6021p.m6536c(fMo7864b2) | c6021p.m6536c(f14) | c6021p.m6542f(abstractC14360p) | c6021p.m6542f(interfaceC5982V0M15261b);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H6 = new C18410z(list2, abstractC14360p, fMo7864b2, fMo7864b0, fMo7864b1, f14, interfaceC5985X4, interfaceC5982V0M15261b);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C18410z(list2, abstractC14360p, fMo7864b2, fMo7864b0, fMo7864b1, f14, interfaceC5985X4, interfaceC5982V0M15261b);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H6, c6021p, interfaceC10459qM20694b2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8758B(list, interfaceC2184i, i10, interfaceC1436k, interfaceC1436k2, interfaceC10459q, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m19863c(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(((Number) it.next()).floatValue() == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final float m19864d(float f10, List list) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        float size = list.size() * f10;
        double d10 = size;
        int iFloor = (int) Math.floor(d10);
        return AbstractC9930m3.m10589c(((Number) list.get(iFloor)).floatValue(), ((Number) list.get((int) Math.floor(d10))).floatValue(), size - iFloor);
    }
}
