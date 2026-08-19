package p523V9;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import com.openai.chatgpt.R;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0286s;
import p017Af.C0459F;
import p025An.C0644w;
import p035B7.C0846c;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1155zi.C22025k2;
import p1155zi.C22057s2;
import p124Ei.AbstractC2442B;
import p124Ei.AbstractC2541s;
import p124Ei.C2440A;
import p124Ei.C2532n1;
import p124Ei.C2549w;
import p124Ei.C2553y;
import p124Ei.C2555z;
import p148Fi.C2782P;
import p148Fi.C2791U;
import p148Fi.C2825h0;
import p148Fi.C2834k0;
import p148Fi.C2861x;
import p211I8.lPE.sRXLFOsOgS;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p544W9.AbstractC8712t;
import p635a1.InterfaceC10459q;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p700d8.C13044e;
import p774h1.C14365u;

/* JADX INFO: renamed from: V9.M4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7941M4 {
    /* JADX INFO: renamed from: b */
    public static C13044e m8230b(String str, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            C3676s c3676sM4390m = AbstractC8712t.m9423e(str).m4390m();
            String strMo4384r = c3676sM4390m.m4395w("type").mo4384r();
            if (!AbstractC16544l.m18089b(strMo4384r, "view")) {
                AbstractC7889G0.m8184b(internalLogger, 5, EnumC11255b.f34098Y, new C0846c(strMo4384r, 11), null, false, 56);
                return null;
            }
            String viewId = c3676sM4390m.m4395w("viewId").mo4384r();
            long jMo4382p = c3676sM4390m.m4395w("documentVersion").mo4382p();
            AbstractC16544l.m18093f(viewId, "viewId");
            return new C13044e(jMo4382p, viewId);
        } catch (ClassCastException e10) {
            throw new C3677t("Unable to parse json into RUM event meta", e10);
        } catch (IllegalStateException e11) {
            throw new C3677t("Unable to parse json into RUM event meta", e11);
        } catch (NullPointerException e12) {
            throw new C3677t("Unable to parse json into RUM event meta", e12);
        } catch (NumberFormatException e13) {
            throw new C3677t("Unable to parse json into RUM event meta", e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8231c(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0375  */
    /* JADX INFO: renamed from: a */
    public static final void m8229a(C2532n1 c2532n1, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C22057s2 c22057s2;
        String str;
        C2549w c2549w;
        C2549w c2549w2;
        String str2;
        C2861x c2861x;
        C2861x c2861x2;
        String str3;
        C2861x c2861x3;
        C2861x c2861x4;
        C2861x c2861x5;
        C2861x c2861x6;
        C22057s2 c22057s3;
        C2861x c2861x7;
        C2861x c2861x8;
        C22025k2 c22025k2M3714a;
        int i12;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-676919739);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(1767618134);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            C5975S c5975s = C5975S.f19448r0;
            String str4 = null;
            c22057s2 = null;
            C22057s2 c22057s4 = null;
            str4 = null;
            Object obj2 = objM6514H;
            if (objM6514H == obj) {
                Object objM6430Q = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM6430Q);
                obj2 = objM6430Q;
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj2;
            c6021p.m6553p(false);
            Map map = (Map) interfaceC5985X.getValue();
            c6021p.m6524S(1767621377);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H2 = c6021p.m6514H();
            Object obj3 = objM6514H2;
            if (zM6545h || objM6514H2 == obj) {
                Object c2553y = new C2553y(interfaceC5985X, interfaceC20904w, null);
                c6021p.m6537c0(c2553y);
                obj3 = c2553y;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) obj3, c6021p, map);
            c6021p.m6524S(1767625197);
            Object objM6514H3 = c6021p.m6514H();
            Object obj4 = objM6514H3;
            if (objM6514H3 == obj) {
                Object objM6430Q2 = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM6430Q2);
                obj4 = objM6430Q2;
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) obj4;
            c6021p.m6553p(false);
            c6021p.m6524S(1767627944);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H4 = c6021p.m6514H();
            Object obj5 = objM6514H4;
            if (z6 || objM6514H4 == obj) {
                Object c2555z = new C2555z(c2532n1, interfaceC5985X2, null);
                c6021p.m6537c0(c2555z);
                obj5 = c2555z;
            }
            c6021p.m6553p(false);
            C2782P c2782p = C2791U.Companion;
            C5997d.m6450f((InterfaceC1439n) obj5, c6021p, c2532n1.f7872D);
            if (((C2791U) interfaceC5985X2.getValue()) != null) {
                c6021p.m6524S(-1037946204);
                C2791U c2791u = (C2791U) interfaceC5985X2.getValue();
                if (c2791u == null) {
                    c6021p.m6553p(false);
                    C6018n0 c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C2440A(c2532n1, onIntent, interfaceC10459q, i10, 1);
                        return;
                    }
                    return;
                }
                c2549w2 = new C2549w(c2791u.f8517b, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, AbstractC2442B.f7590a[c2791u.f8516a.ordinal()] == 1 ? Integer.valueOf(R.drawable.notebook) : null, null, null, 24);
                c6021p.m6553p(false);
            } else if (c2532n1.f7907n) {
                c6021p.m6524S(-1037746285);
                boolean z10 = c2532n1.f7899f;
                if (z10) {
                    i12 = R.string.voice_state_hint_mute_button_pressed_muted;
                } else {
                    if (z10) {
                        throw new C0644w();
                    }
                    i12 = R.string.voice_state_hint_mute_button_pressed_unmuted;
                }
                c2549w2 = new C2549w(AbstractC8142m4.m8676d(i12, c6021p), C14365u.m15774b(0.5f, ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a), null, null, null, 28);
                c6021p.m6553p(false);
            } else {
                if (c2532n1.f7905l) {
                    c6021p.m6524S(1767651841);
                    c2549w = new C2549w(AbstractC8142m4.m8676d(R.string.voice_mode_poor_connection_quality, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, null, null, null, 28);
                    c6021p.m6553p(false);
                } else {
                    C2834k0 c2834k0 = c2532n1.f7869A;
                    if (((c2834k0 == null || (c22025k2M3714a = c2834k0.m3714a()) == null) ? null : c22025k2M3714a.f69673a) != null) {
                        c6021p.m6524S(-1037193462);
                        C22025k2 c22025k2M3714a2 = c2834k0.m3714a();
                        if (c22025k2M3714a2 == null) {
                            c6021p.m6553p(false);
                            C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                            if (c6018n0M6555r2 != null) {
                                c6018n0M6555r2.f19536d = new C2440A(c2532n1, onIntent, interfaceC10459q, i10, 2);
                                return;
                            }
                            return;
                        }
                        interfaceC5985X.setValue(c22025k2M3714a2.f69676d);
                        long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                        Integer numValueOf = Integer.valueOf(R.drawable.info);
                        c6021p.m6524S(1767665297);
                        boolean zM6542f = c6021p.m6542f(c22025k2M3714a2) | ((i11 & 112) == 32);
                        Object objM6514H5 = c6021p.m6514H();
                        Object obj6 = objM6514H5;
                        if (zM6542f || objM6514H5 == obj) {
                            Object c0286s = new C0286s(onIntent, 18, c22025k2M3714a2);
                            c6021p.m6537c0(c0286s);
                            obj6 = c0286s;
                        }
                        c6021p.m6553p(false);
                        c2549w2 = new C2549w(c22025k2M3714a2.f69673a, j10, null, numValueOf, (InterfaceC1426a) obj6, 4);
                        c6021p.m6553p(false);
                    } else {
                        C22057s2 c22057s5 = c2532n1.f7893Y;
                        if (c22057s5 != null) {
                            c6021p.m6524S(-1036801932);
                            interfaceC5985X.setValue(c22057s5.f69752f);
                            long j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                            Integer numValueOf2 = Integer.valueOf(R.drawable.info);
                            c6021p.m6524S(1767678702);
                            boolean z11 = (i11 & 112) == 32;
                            Object objM6514H6 = c6021p.m6514H();
                            Object obj7 = objM6514H6;
                            if (z11 || objM6514H6 == obj) {
                                Object c0459f = new C0459F(3, onIntent);
                                c6021p.m6537c0(c0459f);
                                obj7 = c0459f;
                            }
                            c6021p.m6553p(false);
                            c2549w = new C2549w(c22057s5.f69749c, j11, null, numValueOf2, (InterfaceC1426a) obj7, 4);
                            c6021p.m6553p(false);
                        } else {
                            if (c2834k0 == null) {
                                c22057s2 = null;
                            } else {
                                C2825h0 c2825h0 = c2834k0.f8572b;
                                if (c2825h0 == null || (c2861x8 = c2825h0.f8564b) == null || (c22057s2 = c2861x8.f8630b) == null) {
                                    C2825h0 c2825h1 = c2834k0.f8571a;
                                    if (c2825h1 == null || (c2861x7 = c2825h1.f8564b) == null) {
                                        c22057s2 = null;
                                    } else {
                                        c22057s2 = c2861x7.f8630b;
                                    }
                                }
                            }
                            if (c22057s2 != null) {
                                c6021p.m6524S(-1036363561);
                                C2825h0 c2825h2 = c2834k0.f8572b;
                                if (c2825h2 == null || (c2861x6 = c2825h2.f8564b) == null || (c22057s3 = c2861x6.f8630b) == null) {
                                    C2825h0 c2825h3 = c2834k0.f8571a;
                                    if (c2825h3 != null && (c2861x5 = c2825h3.f8564b) != null) {
                                        c22057s4 = c2861x5.f8630b;
                                    }
                                } else {
                                    c22057s4 = c22057s3;
                                }
                                if (c22057s4 == null) {
                                    c6021p.m6553p(false);
                                    C6018n0 c6018n0M6555r3 = c6021p.m6555r();
                                    if (c6018n0M6555r3 != null) {
                                        c6018n0M6555r3.f19536d = new C2440A(c2532n1, onIntent, interfaceC10459q, i10, 3);
                                        return;
                                    }
                                    return;
                                }
                                interfaceC5985X.setValue(c22057s4.f69752f);
                                long j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                                Integer numValueOf3 = Integer.valueOf(R.drawable.info);
                                c6021p.m6524S(1767692409);
                                boolean zM6542f2 = c6021p.m6542f(c22057s4) | ((i11 & 112) == 32);
                                Object objM6514H7 = c6021p.m6514H();
                                Object obj8 = objM6514H7;
                                if (zM6542f2 || objM6514H7 == obj) {
                                    Object c0286s2 = new C0286s(onIntent, 19, c22057s4);
                                    c6021p.m6537c0(c0286s2);
                                    obj8 = c0286s2;
                                }
                                c6021p.m6553p(false);
                                c2549w = new C2549w(c22057s4.f69749c, j12, null, numValueOf3, (InterfaceC1426a) obj8, 4);
                                c6021p.m6553p(false);
                            } else {
                                if (c2834k0 == null) {
                                    str = null;
                                } else {
                                    C2825h0 c2825h4 = c2834k0.f8572b;
                                    if (c2825h4 == null || (c2861x4 = c2825h4.f8564b) == null || (str = c2861x4.f8629a) == null) {
                                        C2825h0 c2825h5 = c2834k0.f8571a;
                                        if (c2825h5 == null || (c2861x3 = c2825h5.f8564b) == null) {
                                            str = null;
                                        } else {
                                            str = c2861x3.f8629a;
                                        }
                                    }
                                }
                                if (str != null) {
                                    c6021p.m6524S(1767698306);
                                    C2825h0 c2825h6 = c2834k0.f8572b;
                                    if (c2825h6 == null || (c2861x2 = c2825h6.f8564b) == null || (str3 = c2861x2.f8629a) == null) {
                                        C2825h0 c2825h7 = c2834k0.f8571a;
                                        if (c2825h7 != null && (c2861x = c2825h7.f8564b) != null) {
                                            str4 = c2861x.f8629a;
                                        }
                                        str2 = str4;
                                    } else {
                                        str2 = str3;
                                    }
                                    c2549w2 = new C2549w(str2, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, null, null, null, 28);
                                    c6021p.m6553p(false);
                                } else if (c2532n1.f7919z) {
                                    c6021p.m6524S(1767703229);
                                    c2549w = new C2549w(AbstractC8142m4.m8676d(R.string.data_used_for_evals, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, null, null, null, 28);
                                    c6021p.m6553p(false);
                                } else {
                                    c6021p.m6524S(-1035666434);
                                    c6021p.m6553p(false);
                                    c2549w = null;
                                }
                            }
                        }
                    }
                }
                AbstractC8223w5.m8850b(c2549w, interfaceC10459q, null, null, sRXLFOsOgS.bGBpbzcWXKAnE, null, AbstractC2541s.f7933a, c6021p, ((i11 >> 3) & 112) | 1597440, 44);
            }
            c2549w = c2549w2;
            AbstractC8223w5.m8850b(c2549w, interfaceC10459q, null, null, sRXLFOsOgS.bGBpbzcWXKAnE, null, AbstractC2541s.f7933a, c6021p, ((i11 >> 3) & 112) | 1597440, 44);
        }
        C6018n0 c6018n0M6555r4 = c6021p.m6555r();
        if (c6018n0M6555r4 != null) {
            c6018n0M6555r4.f19536d = new C2440A(c2532n1, onIntent, interfaceC10459q, i10, 0);
        }
    }
}
