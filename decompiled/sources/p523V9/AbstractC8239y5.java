package p523V9;

import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p017Af.C0492w;
import p042Bf.C1268j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p547Wc.C8758B;
import p586Y0.C9566r;
import p586Y0.C9572x;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p692d0.AbstractC12957J;
import p692d0.C12951D;
import p736f0.C13485c;
import p736f0.C13503u;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13779o0;
import p758g0.C13771k0;
import p758g0.InterfaceC13726B;
import p895n1.C17425e;
import p909nm.AbstractC17686t;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: V9.y5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8239y5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25715a;

    /* JADX INFO: renamed from: a */
    public static final void m8885a(C13771k0 c13771k0, InterfaceC10459q interfaceC10459q, InterfaceC13726B interfaceC13726B, InterfaceC1436k interfaceC1436k, C8410b c8410b, C6021p c6021p, int i10) {
        int iHashCode;
        int i11;
        int iNumberOfTrailingZeros;
        C12951D c12951d;
        boolean z6;
        InterfaceC1436k interfaceC1436k2;
        boolean z10;
        int i12;
        int i13 = 0;
        c6021p.m6526U(679005231);
        int i14 = (i10 & 6) == 0 ? (c6021p.m6542f(c13771k0) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i14 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i14 |= c6021p.m6545h(interfaceC13726B) ? 256 : 128;
        }
        int i15 = i14 | 3072;
        if ((i10 & 24576) == 0) {
            i15 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        if ((i15 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC1436k2 = interfaceC1436k;
        } else {
            C13485c c13485c = C13485c.f42689w0;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            Object obj2 = objM6514H;
            if (objM6514H == obj) {
                C9566r c9566r = new C9566r();
                c9566r.add(c13771k0.m15272c());
                c6021p.m6537c0(c9566r);
                obj2 = c9566r;
            }
            C9566r c9566r2 = (C9566r) obj2;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                long[] jArr = AbstractC12957J.f41150a;
                objM6514H2 = new C12951D();
                c6021p.m6537c0(objM6514H2);
            }
            C12951D c12951d2 = (C12951D) objM6514H2;
            Object objM15272c = c13771k0.m15272c();
            C6002f0 c6002f0 = c13771k0.f43492d;
            if (AbstractC16544l.m18089b(objM15272c, c6002f0.getValue())) {
                c6021p.m6524S(860660313);
                if (c9566r2.size() == 1 && AbstractC16544l.m18089b(c9566r2.get(0), c6002f0.getValue())) {
                    c6021p.m6524S(860984945);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(860794667);
                    boolean z11 = (i15 & 14) == 4;
                    Object objM6514H3 = c6021p.m6514H();
                    if (z11 || objM6514H3 == obj) {
                        objM6514H3 = new C13503u(c13771k0, i13);
                        c6021p.m6537c0(objM6514H3);
                    }
                    AbstractC17686t.m19393A(c9566r2, (InterfaceC1436k) objM6514H3);
                    c12951d2.m14615a();
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(860990897);
                c6021p.m6553p(false);
            }
            Object value = c6002f0.getValue();
            if (value != null) {
                c12951d2.getClass();
                iHashCode = value.hashCode();
            } else {
                iHashCode = 0;
            }
            int i16 = iHashCode * (-862048943);
            int i17 = i16 ^ (i16 << 16);
            int i18 = i17 & 127;
            int i19 = c12951d2.f41126d;
            int i20 = (i17 >>> 7) & i19;
            int i21 = 0;
            loop0: while (true) {
                long[] jArr2 = c12951d2.f41123a;
                int i22 = i20 >> 3;
                int i23 = (i20 & 7) << 3;
                long j10 = (jArr2[i22] >>> i23) | ((jArr2[i22 + 1] << (64 - i23)) & ((-i23) >> 63));
                long j11 = (((long) i18) * 72340172838076673L) ^ j10;
                long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
                while (true) {
                    i11 = i18;
                    if (j12 != 0) {
                        iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j12) >> 3)) & i19;
                        if (AbstractC16544l.m18089b(c12951d2.f41124b[iNumberOfTrailingZeros], value)) {
                            break loop0;
                        }
                        j12 &= j12 - 1;
                        i18 = i11;
                    }
                }
                if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i21 += 8;
                i20 = (i20 + i21) & i19;
                i18 = i11;
                c12951d2 = c12951d2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c12951d = c12951d2;
                z6 = false;
                c6021p.m6524S(861812273);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(861052122);
                ListIterator listIterator = c9566r2.listIterator();
                int i24 = 0;
                while (true) {
                    C9572x c9572x = (C9572x) listIterator;
                    if (!c9572x.hasNext()) {
                        i12 = -1;
                        i24 = -1;
                        break;
                    } else {
                        if (AbstractC16544l.m18089b(c9572x.next(), c6002f0.getValue())) {
                            i12 = -1;
                            break;
                        }
                        i24++;
                    }
                }
                if (i24 == i12) {
                    c9566r2.add(c6002f0.getValue());
                } else {
                    c9566r2.set(i24, c6002f0.getValue());
                }
                c12951d2.m14615a();
                int size = c9566r2.size();
                int i25 = 0;
                while (i25 < size) {
                    Object obj3 = c9566r2.get(i25);
                    C12951D c12951d3 = c12951d2;
                    c12951d3.m14623i(obj3, AbstractC8411c.m8969c(-1426421288, c6021p, new C1268j(c13771k0, interfaceC13726B, obj3, c8410b, 16)));
                    i25++;
                    c12951d2 = c12951d3;
                }
                c12951d = c12951d2;
                z6 = false;
                c6021p.m6553p(false);
            }
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, z6);
            int i26 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i26))) {
                AbstractC0168G.m537z(i26, c6021p, i26, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-187482432);
            int size2 = c9566r2.size();
            for (int i27 = 0; i27 < size2; i27++) {
                Object obj4 = c9566r2.get(i27);
                c6021p.m6521P(-1081873445, obj4);
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c12951d.m14619e(obj4);
                if (interfaceC1439n == null) {
                    c6021p.m6524S(821713034);
                    z10 = false;
                } else {
                    z10 = false;
                    c6021p.m6524S(-1081871785);
                    interfaceC1439n.invoke(c6021p, 0);
                }
                c6021p.m6553p(z10);
                c6021p.m6553p(z10);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC1436k2 = c13485c;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c13771k0, interfaceC10459q, interfaceC13726B, interfaceC1436k2, c8410b, i10, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m8886b(Object obj, InterfaceC10459q interfaceC10459q, InterfaceC13726B interfaceC13726B, String str, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC13726B interfaceC13726BM15255t;
        int i13;
        String str2;
        int i14;
        String str3;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC13726B interfaceC13726B2;
        String str4;
        C6018n0 c6018n0M6555r;
        int i15;
        c6021p.m6526U(-310686752);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(obj) : c6021p.m6545h(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i12 | 48;
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC13726BM15255t = interfaceC13726B;
                i16 |= c6021p.m6545h(interfaceC13726BM15255t) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    str2 = str;
                    if (c6021p.m6542f(str2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i16 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i16 |= i15;
                }
                if ((i16 & 9363) == 9362 || !c6021p.m6562y()) {
                    C10456n c10456n = C10456n.f30959Y;
                    if (i17 != 0) {
                        interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
                    }
                    InterfaceC13726B interfaceC13726B3 = interfaceC13726BM15255t;
                    if (i13 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n, interfaceC13726B3, null, c8410b, c6021p, i16 & 58352);
                    interfaceC10459q2 = c10456n;
                    interfaceC13726B2 = interfaceC13726B3;
                    str4 = str3;
                } else {
                    c6021p.m6517L();
                    interfaceC13726B2 = interfaceC13726BM15255t;
                    str4 = str2;
                    interfaceC10459q2 = interfaceC10459q;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C8758B(obj, interfaceC10459q2, interfaceC13726B2, str4, c8410b, i10, i11);
                }
            }
            i16 |= 3072;
            str2 = str;
            if ((i10 & 24576) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i16 |= i15;
            }
            if ((i16 & 9363) == 9362) {
                C10456n c10456n2 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
                }
                InterfaceC13726B interfaceC13726B4 = interfaceC13726BM15255t;
                if (i13 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n2, interfaceC13726B4, null, c8410b, c6021p, i16 & 58352);
                interfaceC10459q2 = c10456n2;
                interfaceC13726B2 = interfaceC13726B4;
                str4 = str3;
            } else {
                C10456n c10456n3 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
                }
                InterfaceC13726B interfaceC13726B5 = interfaceC13726BM15255t;
                if (i13 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n3, interfaceC13726B5, null, c8410b, c6021p, i16 & 58352);
                interfaceC10459q2 = c10456n3;
                interfaceC13726B2 = interfaceC13726B5;
                str4 = str3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8758B(obj, interfaceC10459q2, interfaceC13726B2, str4, c8410b, i10, i11);
            }
        }
        i16 = i12 | 432;
        interfaceC13726BM15255t = interfaceC13726B;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                str2 = str;
                if (c6021p.m6542f(str2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i16 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i16 |= i15;
            }
            if ((i16 & 9363) == 9362) {
                C10456n c10456n4 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
                }
                InterfaceC13726B interfaceC13726B6 = interfaceC13726BM15255t;
                if (i13 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n4, interfaceC13726B6, null, c8410b, c6021p, i16 & 58352);
                interfaceC10459q2 = c10456n4;
                interfaceC13726B2 = interfaceC13726B6;
                str4 = str3;
            } else {
                C10456n c10456n5 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
                }
                InterfaceC13726B interfaceC13726B7 = interfaceC13726BM15255t;
                if (i13 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n5, interfaceC13726B7, null, c8410b, c6021p, i16 & 58352);
                interfaceC10459q2 = c10456n5;
                interfaceC13726B2 = interfaceC13726B7;
                str4 = str3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8758B(obj, interfaceC10459q2, interfaceC13726B2, str4, c8410b, i10, i11);
            }
        }
        i16 |= 3072;
        str2 = str;
        if ((i10 & 24576) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i16 |= i15;
        }
        if ((i16 & 9363) == 9362) {
            C10456n c10456n6 = C10456n.f30959Y;
            if (i17 != 0) {
                interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
            }
            InterfaceC13726B interfaceC13726B8 = interfaceC13726BM15255t;
            if (i13 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n6, interfaceC13726B8, null, c8410b, c6021p, i16 & 58352);
            interfaceC10459q2 = c10456n6;
            interfaceC13726B2 = interfaceC13726B8;
            str4 = str3;
        } else {
            C10456n c10456n7 = C10456n.f30959Y;
            if (i17 != 0) {
                interfaceC13726BM15255t = AbstractC13758e.m15255t(0, 0, null, 7);
            }
            InterfaceC13726B interfaceC13726B9 = interfaceC13726BM15255t;
            if (i13 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            m8885a(AbstractC13779o0.m15291d(obj, str3, c6021p, (i16 & 14) | ((i16 >> 6) & 112), 0), c10456n7, interfaceC13726B9, null, c8410b, c6021p, i16 & 58352);
            interfaceC10459q2 = c10456n7;
            interfaceC13726B2 = interfaceC13726B9;
            str4 = str3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8758B(obj, interfaceC10459q2, interfaceC13726B2, str4, c8410b, i10, i11);
        }
    }
}
