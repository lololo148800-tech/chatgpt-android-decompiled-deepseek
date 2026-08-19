package p911o0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.C0280q;
import p038Ba.AbstractC0865o;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p363Og.C6218v;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p547Wc.C8805o;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p979r2.C18862c;

/* JADX INFO: renamed from: o0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17758g {

    /* JADX INFO: renamed from: a */
    public static final C17756f f56698a = new C17756f(0);

    /* JADX INFO: renamed from: b */
    public static final C17756f f56699b = new C17756f(1);

    /* JADX INFO: renamed from: c */
    public static final int f56700c = 9;

    /* JADX INFO: renamed from: d */
    public static final int f56701d = 6;

    /* JADX INFO: renamed from: e */
    public static final int f56702e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f56703f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f56704g = 15;

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m19481a(InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, boolean z6, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC10446d interfaceC10446d2;
        InterfaceC21057K interfaceC21057KM19511e;
        boolean z10;
        boolean zM6542f;
        Object objM6514H;
        InterfaceC10446d interfaceC10446d3;
        boolean z11;
        C6018n0 c6018n0M6555r;
        int i14;
        c6021p.m6526U(1781813501);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c6021p.m6542f(interfaceC10446d) ? 32 : 16;
            }
            i13 = i12 | 384;
            if ((i10 & 3072) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) == 1170 || !c6021p.m6562y()) {
                if (i15 != 0) {
                    interfaceC10446d2 = C10444b.f30934Y;
                } else {
                    interfaceC10446d2 = interfaceC10446d;
                }
                interfaceC21057KM19511e = AbstractC17780r.m19511e(interfaceC10446d2, false);
                if ((i13 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zM6542f = z10 | c6021p.m6542f(interfaceC21057KM19511e);
                objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C8805o(interfaceC21057KM19511e, 26, c8410b);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC21075b0.m21562c(interfaceC10459q, (InterfaceC1439n) objM6514H, c6021p, i13 & 14, 0);
                interfaceC10446d3 = interfaceC10446d2;
                z11 = false;
            } else {
                c6021p.m6517L();
                z11 = z6;
                interfaceC10446d3 = interfaceC10446d;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(interfaceC10459q, interfaceC10446d3, z11, c8410b, i10, i11);
            }
        }
        i12 |= 48;
        i13 = i12 | 384;
        if ((i10 & 3072) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) == 1170) {
            if (i15 != 0) {
                interfaceC10446d2 = C10444b.f30934Y;
            } else {
                interfaceC10446d2 = interfaceC10446d;
            }
            interfaceC21057KM19511e = AbstractC17780r.m19511e(interfaceC10446d2, false);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            zM6542f = z10 | c6021p.m6542f(interfaceC21057KM19511e);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C8805o(interfaceC21057KM19511e, 26, c8410b);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C8805o(interfaceC21057KM19511e, 26, c8410b);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC21075b0.m21562c(interfaceC10459q, (InterfaceC1439n) objM6514H, c6021p, i13 & 14, 0);
            interfaceC10446d3 = interfaceC10446d2;
            z11 = false;
        } else {
            if (i15 != 0) {
                interfaceC10446d2 = C10444b.f30934Y;
            } else {
                interfaceC10446d2 = interfaceC10446d;
            }
            interfaceC21057KM19511e = AbstractC17780r.m19511e(interfaceC10446d2, false);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            zM6542f = z10 | c6021p.m6542f(interfaceC21057KM19511e);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C8805o(interfaceC21057KM19511e, 26, c8410b);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C8805o(interfaceC21057KM19511e, 26, c8410b);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC21075b0.m21562c(interfaceC10459q, (InterfaceC1439n) objM6514H, c6021p, i13 & 14, 0);
            interfaceC10446d3 = interfaceC10446d2;
            z11 = false;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6218v(interfaceC10459q, interfaceC10446d3, z11, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19482b(C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        C17778q c17778q = C17778q.f56745c;
        int i10 = c6021p.f19564P;
        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
        InterfaceC21700k.f68875m0.getClass();
        C21696i c21696i = C21698j.f68869b;
        AbstractC0865o abstractC0865o = c6021p.f19565a;
        c6021p.m6528W();
        if (c6021p.f19563O) {
            c6021p.m6549l(c21696i);
        } else {
            c6021p.m6543f0();
        }
        C5997d.m6439Z(C21698j.f68873f, c6021p, c17778q);
        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
        C21694h c21694h = C21698j.f68874g;
        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
            AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
        }
        c6021p.m6553p(true);
    }

    /* JADX INFO: renamed from: e */
    public static long m19483e(int i10, long j10) {
        return AbstractC9388w4.m9958a(i10 == 1 ? C7536a.m7856k(j10) : C7536a.m7855j(j10), i10 == 1 ? C7536a.m7854i(j10) : C7536a.m7853h(j10), i10 == 1 ? C7536a.m7855j(j10) : C7536a.m7856k(j10), i10 == 1 ? C7536a.m7853h(j10) : C7536a.m7854i(j10));
    }

    /* JADX INFO: renamed from: f */
    public static long m19484f(int i10, long j10) {
        return AbstractC9388w4.m9958a(0, C7536a.m7854i(j10), (i10 & 4) != 0 ? C7536a.m7855j(j10) : 0, C7536a.m7853h(j10));
    }

    /* JADX INFO: renamed from: g */
    public static final C17775o0 m19485g(InterfaceC21056J interfaceC21056J) {
        Object objMo21534t = interfaceC21056J.mo21534t();
        if (objMo21534t instanceof C17775o0) {
            return (C17775o0) objMo21534t;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final C17775o0 m19486h(AbstractC21069X abstractC21069X) {
        Object objMo21534t = abstractC21069X.mo21534t();
        if (objMo21534t instanceof C17775o0) {
            return (C17775o0) objMo21534t;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final float m19487i(C17775o0 c17775o0) {
        if (c17775o0 != null) {
            return c17775o0.f56734a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC10459q m19488j(InterfaceC10459q interfaceC10459q) {
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C17736P(3, 3));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC21058L m19489k(InterfaceC17773n0 interfaceC17773n0, int i10, int i11, int i12, int i13, int i14, InterfaceC21059M interfaceC21059M, List list, AbstractC21069X[] abstractC21069XArr, int i15, int i16, int[] iArr, int i17) throws Throwable {
        int[] iArr2;
        String str;
        float f10;
        String str2;
        long j10;
        String str3;
        int i18;
        InterfaceC17773n0 interfaceC17773n1;
        int iM8921l;
        int i19;
        String str4;
        long j11;
        int i20;
        long j12;
        boolean z6;
        int iMax;
        int i21;
        float f11;
        boolean z10;
        int i22;
        ?? r6;
        int i23 = i16;
        long j13 = i14;
        int i24 = i23 - i15;
        int[] iArr3 = new int[i24];
        int i25 = i15;
        int i26 = 0;
        int i27 = 0;
        boolean z11 = false;
        int i28 = 0;
        int i29 = 0;
        float f12 = 0.0f;
        while (i25 < i23) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i25);
            int i30 = i24;
            C17775o0 c17775o0M19485g = m19485g(interfaceC21056J);
            float fM19487i = m19487i(c17775o0M19485g);
            if (z11) {
                f11 = 0.0f;
                z10 = true;
            } else {
                AbstractC17758g abstractC17758g = c17775o0M19485g != null ? c17775o0M19485g.f56736c : null;
                if (abstractC17758g != null ? abstractC17758g instanceof C17715A : false) {
                    f11 = 0.0f;
                    z10 = true;
                } else {
                    f11 = 0.0f;
                    z10 = false;
                }
            }
            if (fM19487i > f11) {
                f12 += fM19487i;
                i27++;
                j13 = j13;
                z10 = z10;
            } else {
                float f13 = f12;
                int i31 = i12 - i26;
                AbstractC21069X abstractC21069XMo21533p = abstractC21069XArr[i25];
                if (abstractC21069XMo21533p == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        r6 = 0;
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i31 < 0 ? 0 : i31;
                        r6 = 0;
                    }
                    abstractC21069XMo21533p = interfaceC21056J.mo21533p(interfaceC17773n0.mo19465f(r6, i22, i13, r6));
                } else {
                    j13 = j13;
                }
                AbstractC21069X abstractC21069X = abstractC21069XMo21533p;
                int iMo19466g = interfaceC17773n0.mo19466g(abstractC21069X);
                int iMo19467h = interfaceC17773n0.mo19467h(abstractC21069X);
                iArr3[i25 - i15] = iMo19466g;
                int i32 = i31 - iMo19466g;
                if (i32 < 0) {
                    i32 = 0;
                }
                int iMin = Math.min(i14, i32);
                int iMax2 = Math.max(i29, iMo19467h);
                abstractC21069XArr[i25] = abstractC21069X;
                i26 = iMo19466g + iMin + i26;
                i29 = iMax2;
                i28 = iMin;
                f12 = f13;
            }
            i25++;
            z11 = z10;
            i24 = i30;
            j13 = j13;
        }
        long j14 = j13;
        int i33 = i24;
        int i34 = i29;
        float f14 = f12;
        if (i27 == 0) {
            i19 = i26 - i28;
            i18 = i10;
            interfaceC17773n1 = interfaceC17773n0;
            iArr2 = iArr3;
            iM8921l = 0;
        } else {
            int i35 = i12 != Integer.MAX_VALUE ? i12 : i10;
            long j15 = j14 * ((long) (i27 - 1));
            int[] iArr4 = iArr3;
            long jM8916g = AbstractC8301I.m8916g(((long) (i35 - i26)) - j15, 0L);
            float f15 = jM8916g / f14;
            int i36 = i15;
            long jRound = jM8916g;
            while (true) {
                iArr2 = iArr4;
                str = "weightedSize ";
                f10 = f14;
                str2 = "weightChildrenCount ";
                j10 = jM8916g;
                str3 = "remainingToTarget ";
                if (i36 >= i23) {
                    break;
                }
                float fM19487i2 = m19487i(m19485g((InterfaceC21056J) list.get(i36)));
                long j16 = j15;
                float f16 = f15 * fM19487i2;
                try {
                    jRound -= (long) Math.round(f16);
                    i36++;
                    iArr4 = iArr2;
                    i23 = i16;
                    f14 = f10;
                    jM8916g = j10;
                    j15 = j16;
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbM21e = AbstractC0010F.m21e("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i12, "mainAxisMin ", i10, "targetSpace ");
                    sbM21e.append(i35);
                    sbM21e.append("arrangementSpacingPx ");
                    sbM21e.append(j14);
                    sbM21e.append("weightChildrenCount ");
                    sbM21e.append(i27);
                    sbM21e.append("fixedSpace ");
                    sbM21e.append(i26);
                    sbM21e.append("arrangementSpacingTotal ");
                    sbM21e.append(j16);
                    sbM21e.append(str3);
                    sbM21e.append(j10);
                    sbM21e.append("totalWeight ");
                    sbM21e.append(f10);
                    sbM21e.append("weightUnitSpace ");
                    sbM21e.append(f15);
                    sbM21e.append("itemWeight ");
                    sbM21e.append(fM19487i2);
                    sbM21e.append(str);
                    sbM21e.append(f16);
                    throw new IllegalArgumentException(sbM21e.toString()).initCause(e10);
                }
            }
            long j17 = j15;
            long j18 = j14;
            String str5 = "weightUnitSpace ";
            String str6 = "totalWeight ";
            long j19 = j10;
            i18 = i10;
            String str7 = "fixedSpace ";
            int i37 = i26;
            int i38 = 0;
            int i39 = i15;
            String str8 = "arrangementSpacingTotal ";
            int i40 = i34;
            while (i39 < i16) {
                if (abstractC21069XArr[i39] == null) {
                    InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i39);
                    C17775o0 c17775o0M19485g2 = m19485g(interfaceC21056J2);
                    int i41 = i27;
                    float fM19487i3 = m19487i(c17775o0M19485g2);
                    if (!(fM19487i3 > 0.0f)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    String str9 = str2;
                    int iSignum = Long.signum(jRound);
                    long j20 = j18;
                    jRound -= (long) iSignum;
                    float f17 = f15 * fM19487i3;
                    int iMax3 = Math.max(0, Math.round(f17) + iSignum);
                    if (c17775o0M19485g2 != null) {
                        try {
                            z6 = c17775o0M19485g2.f56735b;
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            f15 = f15;
                            f17 = f17;
                            str6 = str6;
                            StringBuilder sbM21e2 = AbstractC0010F.m21e("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i12, "mainAxisMin ", i18, "targetSpace ");
                            sbM21e2.append(i35);
                            sbM21e2.append("arrangementSpacingPx ");
                            sbM21e2.append(j20);
                            sbM21e2.append(str9);
                            sbM21e2.append(i41);
                            sbM21e2.append(str7);
                            sbM21e2.append(i37);
                            sbM21e2.append(str8);
                            sbM21e2.append(j17);
                            sbM21e2.append(str3);
                            sbM21e2.append(j19);
                            sbM21e2.append(str6);
                            sbM21e2.append(f10);
                            sbM21e2.append(str5);
                            sbM21e2.append(f15);
                            sbM21e2.append("weight ");
                            sbM21e2.append(fM19487i3);
                            sbM21e2.append(str);
                            sbM21e2.append(f17);
                            sbM21e2.append("crossAxisDesiredSize nullremainderUnit ");
                            sbM21e2.append(iSignum);
                            sbM21e2.append("childMainAxisSize ");
                            sbM21e2.append(iMax3);
                            throw new IllegalArgumentException(sbM21e2.toString()).initCause(e);
                        }
                    } else {
                        z6 = true;
                    }
                    try {
                        AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J2.mo21533p(interfaceC17773n0.mo19465f((!z6 || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i13, true));
                        int iMo19466g2 = interfaceC17773n0.mo19466g(abstractC21069XMo21533p2);
                        int iMo19467h2 = interfaceC17773n0.mo19467h(abstractC21069XMo21533p2);
                        iArr2[i39 - i15] = iMo19466g2;
                        i38 += iMo19466g2;
                        int iMax4 = Math.max(i40, iMo19467h2);
                        abstractC21069XArr[i39] = abstractC21069XMo21533p2;
                        i40 = iMax4;
                        i20 = i41;
                        str4 = str9;
                        j11 = j20;
                        j12 = j17;
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        StringBuilder sbM21e3 = AbstractC0010F.m21e("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i12, "mainAxisMin ", i18, "targetSpace ");
                        sbM21e3.append(i35);
                        sbM21e3.append("arrangementSpacingPx ");
                        sbM21e3.append(j20);
                        sbM21e3.append(str9);
                        sbM21e3.append(i41);
                        sbM21e3.append(str7);
                        sbM21e3.append(i37);
                        sbM21e3.append(str8);
                        sbM21e3.append(j17);
                        sbM21e3.append(str3);
                        sbM21e3.append(j19);
                        sbM21e3.append(str6);
                        sbM21e3.append(f10);
                        sbM21e3.append(str5);
                        sbM21e3.append(f15);
                        sbM21e3.append("weight ");
                        sbM21e3.append(fM19487i3);
                        sbM21e3.append(str);
                        sbM21e3.append(f17);
                        sbM21e3.append("crossAxisDesiredSize nullremainderUnit ");
                        sbM21e3.append(iSignum);
                        sbM21e3.append("childMainAxisSize ");
                        sbM21e3.append(iMax3);
                        throw new IllegalArgumentException(sbM21e3.toString()).initCause(e);
                    }
                } else {
                    str4 = str2;
                    str6 = str6;
                    j11 = j18;
                    i20 = i27;
                    j12 = j17;
                }
                i39++;
                i27 = i20;
                str2 = str4;
                j18 = j11;
                j19 = j19;
                str5 = str5;
                str3 = str3;
                str6 = str6;
                i37 = i37;
                f10 = f10;
                f15 = f15;
                str8 = str8;
                long j21 = j12;
                str = str;
                str7 = str7;
                j17 = j21;
            }
            interfaceC17773n1 = interfaceC17773n0;
            int i42 = i37;
            iM8921l = AbstractC8301I.m8921l((int) (((long) i38) + j17), 0, i12 - i42);
            i34 = i40;
            i19 = i42;
        }
        if (z11) {
            int iMax5 = 0;
            iMax = 0;
            for (int i43 = i15; i43 < i16; i43++) {
                AbstractC21069X abstractC21069X2 = abstractC21069XArr[i43];
                AbstractC16544l.m18091d(abstractC21069X2);
                C17775o0 c17775o0M19486h = m19486h(abstractC21069X2);
                AbstractC17758g abstractC17758g2 = c17775o0M19486h != null ? c17775o0M19486h.f56736c : null;
                Integer numMo19457d = abstractC17758g2 != null ? abstractC17758g2.mo19457d(abstractC21069X2) : null;
                if (numMo19457d != null) {
                    int iIntValue = numMo19457d.intValue();
                    int iMo19467h3 = interfaceC17773n1.mo19467h(abstractC21069X2);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numMo19457d.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iMo19467h3;
                    }
                    iMax = Math.max(iMax, iMo19467h3 - iIntValue);
                }
            }
            i21 = iMax5;
        } else {
            iMax = 0;
            i21 = 0;
        }
        int i44 = iM8921l + i19;
        if (i44 < 0) {
            i44 = 0;
        }
        int iMax6 = Math.max(i44, i18);
        int iMax7 = Math.max(i34, Math.max(i11, iMax + i21));
        int[] iArr5 = new int[i33];
        for (int i45 = 0; i45 < i33; i45++) {
            iArr5[i45] = 0;
        }
        interfaceC17773n1.mo19468i(iMax6, interfaceC21059M, iArr2, iArr5);
        return interfaceC17773n0.mo19469j(abstractC21069XArr, interfaceC21059M, i21, iArr5, iMax6, iMax7, iArr, i17, i15, i16);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC10459q m19490l(InterfaceC10459q interfaceC10459q) {
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C17736P(3, 5));
    }

    /* JADX INFO: renamed from: m */
    public static final long m19491m(long j10) {
        return AbstractC9388w4.m9958a(C7536a.m7856k(j10), C7536a.m7854i(j10), C7536a.m7855j(j10), C7536a.m7853h(j10));
    }

    /* JADX INFO: renamed from: n */
    public static final C17747a0 m19492n(C18862c c18862c) {
        return new C17747a0(c18862c.f60086a, c18862c.f60087b, c18862c.f60088c, c18862c.f60089d);
    }

    /* JADX INFO: renamed from: o */
    public static final void m19493o(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo19456c(int i10, EnumC7546k enumC7546k, AbstractC21069X abstractC21069X, int i11);

    /* JADX INFO: renamed from: d */
    public Integer mo19457d(AbstractC21069X abstractC21069X) {
        return null;
    }
}
