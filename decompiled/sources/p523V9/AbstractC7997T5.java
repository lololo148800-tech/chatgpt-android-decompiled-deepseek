package p523V9;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17319v;
import mm.C17321x;
import p003A1.AbstractC0168G;
import p021Aj.C0537v;
import p025An.C0644w;
import p039Bc.C0884r;
import p049Bm.InterfaceC1436k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22071w0;
import p168Gd.C3034b;
import p169Gf.AbstractC3051o;
import p169Gf.C3052p;
import p193Hf.AbstractC3349b;
import p193Hf.AbstractC3365g0;
import p291Lf.AbstractC5028y;
import p291Lf.C5026w;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p362Of.AbstractC6196k;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6609O;
import p403Qd.C6612S;
import p403Qd.C6615V;
import p403Qd.C6617X;
import p403Qd.C6621a0;
import p403Qd.C6627d0;
import p403Qd.C6633g0;
import p403Qd.C6639j0;
import p403Qd.C6645m0;
import p403Qd.C6651p0;
import p478Tc.AbstractC7313q;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p479Td.C7364o;
import p479Td.EnumC7359j0;
import p505Uf.C7638A;
import p505Uf.C7665z;
import p571X9.AbstractC9168M;
import p575Xd.C9436E;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17766k;

/* JADX INFO: renamed from: V9.T5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7997T5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25277a;

    /* JADX WARN: Code duplicated, block: B:104:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8301a(C6600F c6600f, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1205561162);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c6600f) : c6021p.m6545h(c6600f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c9436e) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C6600F c6600f2 = c6600f instanceof C6600F ? c6600f : null;
            if (c6600f2 == null) {
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C3052p(c6600f, c9436e, interfaceC1436k, interfaceC10459q, i10, 1);
                    return;
                }
                return;
            }
            AbstractC6653q0 abstractC6653q0 = c6600f2.f21314f;
            if (!(abstractC6653q0 instanceof C6627d0)) {
                if (abstractC6653q0 instanceof C6633g0) {
                    c6021p.m6524S(-284570056);
                    C6633g0 c6633g0 = (C6633g0) abstractC6653q0;
                    String str = c6633g0.f21370b;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459q, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7);
                    C7665z c7665z = C7638A.Companion;
                    AbstractC9168M.m9719a(str, c6633g0.f21371c, interfaceC10459qM11237o, c6633g0.f21372d, null, null, c6021p, 0, 48);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6609O) {
                    c6021p.m6524S(-284303704);
                    C6609O c6609o = (C6609O) abstractC6653q0;
                    int i12 = (i11 << 12) & 458752;
                    int i13 = i11 << 15;
                    AbstractC3349b.m4173a(c6600f.m7172d().f23288c, c6600f.m7172d().f23286a, c6600f2.f21311c, c6609o.f21333b, c6609o.f21334c, c9436e, c6609o.f21335d, interfaceC1436k, interfaceC10459q, c6609o.f21336e, c6021p, (29360128 & i13) | i12 | (i13 & 234881024), 0);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6612S) {
                    c6021p.m6524S(1376318999);
                    AbstractC7966P5.m8253a(c6600f2, interfaceC10459q, c6021p, (i11 >> 6) & 112);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6651p0) {
                    c6021p.m6524S(1376324851);
                    AbstractC3051o.m3924b(c6600f.m7172d().f23288c, c6600f.m7172d().f23286a, c6600f2.f21311c, (C6651p0) abstractC6653q0, interfaceC1436k, interfaceC10459q, c6021p, (i11 << 6) & 516096);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6621a0) {
                    c6021p.m6524S(1376335345);
                    AbstractC7974Q5.m8274a(c6600f2, interfaceC10459q, c6021p, (i11 >> 6) & 112);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6645m0) {
                    c6021p.m6524S(-283106360);
                    AbstractC7981R5.m8284a(c6600f2.f21311c, interfaceC10459q, ((C6645m0) abstractC6653q0).f21409b, false, c6021p, (i11 >> 6) & 112, 8);
                    c6021p.m6553p(false);
                } else if (abstractC6653q0 instanceof C6639j0) {
                    c6021p.m6524S(1376346663);
                    AbstractC7989S5.m8292a((C6639j0) abstractC6653q0, c6600f2.f21311c, interfaceC1436k, interfaceC10459q, c6021p, i11 & 8064);
                    c6021p.m6553p(false);
                } else {
                    if (abstractC6653q0 instanceof C6617X) {
                        c6021p.m6524S(1376353291);
                        C6172d c6172d = ((C6617X) abstractC6653q0).f21344b;
                        c6021p.m6524S(1376357899);
                        boolean z6 = (i11 & 896) == 256;
                        Object objM6514H = c6021p.m6514H();
                        if (z6 || objM6514H == C6013l.f19514a) {
                            objM6514H = new C0537v(7, interfaceC1436k);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(r15);
                        AbstractC6196k.m6724a(c6172d, interfaceC1436k, interfaceC10459q, (InterfaceC1436k) objM6514H, c6021p, (i11 >> 3) & 1008);
                        c6021p.m6553p(false);
                    } else if (abstractC6653q0 instanceof C6615V) {
                        c6021p.m6524S(1376362769);
                        String str2 = c6600f.m7172d().f23288c;
                        String str3 = c6600f2.m7172d().f23286a;
                        C6615V c6615v = (C6615V) abstractC6653q0;
                        C3034b c3034b = c6615v.f21342b;
                        C6615V c6615v2 = abstractC6653q0 instanceof C6615V ? c6615v : null;
                        AbstractC3365g0.m4181a(str2, str3, c3034b, c6615v2 != null && c6615v2.f21343c, interfaceC1436k, interfaceC10459q, c6021p, (i11 << 6) & 516096);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-282139594);
                        c6021p.m6553p(false);
                    }
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3052p(c6600f, c9436e, interfaceC1436k, interfaceC10459q, i10, 0);
                }
            }
            c6021p.m6524S(1376278376);
            C6627d0 c6627d0 = (C6627d0) abstractC6653q0;
            int i14 = (i11 << 6) & 7168;
            int i15 = i11 << 15;
            AbstractC7981R5.m8285b(c6600f.m7172d().f23288c, c6600f.m7172d().f23286a, c6600f2.f21311c, c9436e, c6627d0.f21362b, c6627d0.f21363c, c6627d0.f21364d, interfaceC1436k, interfaceC10459q, c6021p, (29360128 & i15) | i14 | (i15 & 234881024), 0);
            c6021p.m6553p(false);
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3052p(c6600f, c9436e, interfaceC1436k, interfaceC10459q, i10, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX INFO: renamed from: b */
    public static final void m8302b(C6600F toolItem, C9436E safeUrls, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC17766k interfaceC17766k;
        boolean z6;
        boolean z10;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(toolItem, "toolItem");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-946857557);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(toolItem) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(safeUrls) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C5026w c5026w = (C5026w) c6021p.m6548k(AbstractC5028y.f16440a);
            c6021p.m6524S(4152592);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H;
            c6021p.m6553p(false);
            boolean z11 = c5996c0.m6412g() > 0;
            if (z11) {
                interfaceC17766k = c5026w.f16438f;
            } else {
                if (z11) {
                    throw new C0644w();
                }
                interfaceC17766k = AbstractC17770m.f56726c;
            }
            C17790w c17790wM19515a = AbstractC17788v.m19515a(interfaceC17766k, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1508687518);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C0884r(c5996c0, 4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            m8301a(toolItem, safeUrls, onIntent, AbstractC10868a.m11318d(c10456n, (InterfaceC1436k) objM6514H2), c6021p, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896));
            c6021p.m6524S(1508690765);
            AbstractC7343b0 abstractC7343b0 = toolItem.f21313e;
            if (abstractC7343b0 == null) {
                z10 = true;
            } else {
                String str = toolItem.m7172d().f23288c;
                EnumC7359j0 enumC7359j0 = toolItem.m7172d().f23290e;
                String str2 = toolItem.m7172d().f23286a;
                C22071w0 c22071w0 = toolItem.m7172d().f23265A;
                if (toolItem.f21311c.m7161a()) {
                    C7351f0 c7351f0M7172d = toolItem.m7172d();
                    c7351f0M7172d.getClass();
                    if (c7351f0M7172d.f23290e != EnumC7359j0.f23344o0 || c7351f0M7172d.f23280P) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else {
                    z6 = true;
                }
                C7364o c7364o = AbstractC7343b0.Companion;
                z10 = true;
                AbstractC8064c6.m8470a(str, enumC7359j0, c22071w0, str2, abstractC7343b0, safeUrls, onIntent, null, z6, c6021p, (i12 << 12) & 4128768, 128);
            }
            r13.m6553p(false);
            c6021p.m6553p(z10);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3052p(toolItem, safeUrls, onIntent, interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C17319v m8303c(String str) {
        int i10;
        AbstractC7966P5.m8254b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC16544l.m18096i(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int i12 = 119304647;
        int i13 = 119304647;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            int i14 = i11 ^ Integer.MIN_VALUE;
            if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 == i12) {
                    i13 = (int) ((((long) (-1)) & 4294967295L) / (((long) 10) & 4294967295L));
                    if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int i15 = i11 * 10;
            int i16 = i15 + iDigit;
            if (Integer.compare(i16 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i11 = i16;
            i12 = 119304647;
        }
        return new C17319v(i11);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e A[PHI: r16
      0x008e: PHI (r16v2 long) = (r16v1 long), (r16v9 long) binds: [B:19:0x0051, B:35:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[LOOP:0: B:14:0x0038->B:40:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0012 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final C17321x m8304d(String str) {
        int i10;
        long j10;
        long j11;
        long j12;
        AbstractC16544l.m18094g(str, "<this>");
        int i11 = 10;
        AbstractC7966P5.m8254b(10);
        int length = str.length();
        if (length != 0) {
            char cCharAt = str.charAt(0);
            int i12 = 1;
            if (AbstractC16544l.m18096i(cCharAt, 48) >= 0) {
                i10 = 0;
            } else if (length != 1 && cCharAt == '+') {
                i10 = 1;
            }
            long j13 = 10;
            long j14 = 0;
            long j15 = 0;
            long j16 = 512409557603043100L;
            while (i10 < length) {
                int iDigit = Character.digit((int) str.charAt(i10), i11);
                if (iDigit >= 0) {
                    int i13 = length;
                    long j17 = j15 ^ Long.MIN_VALUE;
                    if (Long.compare(j17, j16 ^ Long.MIN_VALUE) <= 0) {
                        j10 = j15 * j13;
                        j11 = (((long) iDigit) & 4294967295L) + j10;
                        if (Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) >= 0) {
                            i10++;
                            j15 = j11;
                            length = i13;
                            i11 = 10;
                            i12 = 1;
                            j14 = 0;
                        }
                    } else if (j16 == 512409557603043100L) {
                        if (j13 < j14) {
                            if (Long.MAX_VALUE < (j13 ^ Long.MIN_VALUE)) {
                                j16 = j14;
                            } else {
                                j12 = 1;
                            }
                            if (Long.compare(j17, j16 ^ Long.MIN_VALUE) > 0) {
                                j10 = j15 * j13;
                                j11 = (((long) iDigit) & 4294967295L) + j10;
                                if (Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) >= 0) {
                                    i10++;
                                    j15 = j11;
                                    length = i13;
                                    i11 = 10;
                                    i12 = 1;
                                    j14 = 0;
                                }
                            }
                        } else {
                            long j18 = (Long.MAX_VALUE / j13) << i12;
                            if ((((-1) - (j18 * j13)) ^ Long.MIN_VALUE) < (j13 ^ Long.MIN_VALUE)) {
                                i12 = 0;
                            }
                            j12 = j18 + ((long) i12);
                        }
                        j16 = j12;
                        if (Long.compare(j17, j16 ^ Long.MIN_VALUE) > 0) {
                            j10 = j15 * j13;
                            j11 = (((long) iDigit) & 4294967295L) + j10;
                            if (Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) >= 0) {
                                i10++;
                                j15 = j11;
                                length = i13;
                                i11 = 10;
                                i12 = 1;
                                j14 = 0;
                            }
                        }
                    }
                }
            }
            return new C17321x(j15);
        }
        return null;
    }
}
