package p530Vi;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.layout.AbstractC10868a;
import bf.AbstractC11372a0;
import cf.AbstractC11728d;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import gd.C13873M;
import ge.C14054U;
import ge.C14056V;
import ge.C14058W;
import ge.C14065a0;
import ge.C14067b0;
import ge.C14071d0;
import ge.C14073e0;
import ge.C14075f0;
import ge.C14077g0;
import ge.C14111x0;
import ge.EnumC14097q0;
import gf.C14127l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0102A;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0280q;
import p017Af.C0470a;
import p017Af.C0492w;
import p021Aj.C0537v;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p039Bc.C0884r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2213w0;
import p1042uh.C20263a0;
import p1095x1.InterfaceC21057K;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21776f;
import p1155zi.C21936L0;
import p1155zi.C22013h2;
import p1155zi.C22020j1;
import p200Hm.C3505d;
import p200Hm.C3506e;
import p200Hm.C3508g;
import p200Hm.C3511j;
import p229J0.C4144v0;
import p269Kh.C4676c;
import p269Kh.C4684k;
import p291Lf.AbstractC5023t;
import p292Lg.C5033e;
import p315Me.Myis.CxcULo;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.C6638j;
import p403Qd.C6642l;
import p403Qd.C6644m;
import p403Qd.C6650p;
import p403Qd.C6658t;
import p403Qd.C6664z;
import p478Tc.AbstractC7313q;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p492U1.C7540e;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p547Wc.C8761E;
import p547Wc.C8816z;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9245Z;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9991w4;
import p621Zd.C10281b;
import p621Zd.C10282c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;
import p911o0.C17767k0;
import p936p0.AbstractC18283w;
import p936p0.C18273m;
import p936p0.C18280t;
import p948pi.C18418a;

/* JADX INFO: renamed from: Vi.I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8301I {
    /* JADX WARN: Code duplicated, block: B:185:0x054c  */
    /* JADX INFO: renamed from: b */
    public static final void m8911b(C14111x0 c14111x0, InterfaceC1436k onIntent, InterfaceC1436k onMessagesIntent, InterfaceC1436k onMessageAudioIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        float fM9819a;
        C14054U c14054u;
        InterfaceC1436k interfaceC1436k;
        boolean z6;
        boolean zMo5258d;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(onMessagesIntent, "onMessagesIntent");
        AbstractC16544l.m18094g(onMessageAudioIntent, "onMessageAudioIntent");
        c6021p.m6526U(-881782131);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c14111x0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onMessagesIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onMessageAudioIntent) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C18280t c18280tM19827a = AbstractC18283w.m19827a(0, c6021p, 0, 3);
            c6021p.m6524S(-1399412543);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H;
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C14065a0.f44248Z, c6021p, 3072, 6);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onIntent, c6021p);
            int i13 = i12 & 14;
            InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(c14111x0, c6021p);
            Boolean boolValueOf = Boolean.valueOf(c18280tM19827a.mo5258d());
            c6021p.m6524S(-1399403180);
            boolean zM6542f = c6021p.m6542f(c18280tM19827a) | c6021p.m6542f(interfaceC5985XM6435V2) | c6021p.m6542f(interfaceC5985XM6435V);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                objM6514H2 = new C14056V(c18280tM19827a, interfaceC5985XM6435V2, interfaceC5985XM6435V, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, boolValueOf);
            c6021p.m6524S(-1399390623);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H3);
            }
            C5996c0 c5996c1 = (C5996c0) objM6514H3;
            c6021p.m6553p(false);
            List list = c14111x0.f44414j;
            Object objM19353c0 = AbstractC17680n.m19353c0(list);
            Integer numValueOf = Integer.valueOf(c5996c0.m6412g());
            c6021p.m6524S(-1399385096);
            boolean zM6542f2 = (i13 == 4) | c6021p.m6542f(interfaceC5985X) | c6021p.m6542f(c18280tM19827a);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                Object c14058w = new C14058W(c14111x0, c18280tM19827a, interfaceC5985X, c5996c1, null);
                c6021p.m6537c0(c14058w);
                objM6514H4 = c14058w;
            }
            c6021p.m6553p(false);
            C6638j c6638j = AbstractC6601G.Companion;
            EnumC14097q0 enumC14097q0 = c14111x0.f44436x;
            C5997d.m6452h(objM19353c0, enumC14097q0, numValueOf, (InterfaceC1439n) objM6514H4, c6021p);
            c6021p.m6524S(-1399326399);
            Object objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H5);
            }
            C5996c0 c5996c2 = (C5996c0) objM6514H5;
            c6021p.m6553p(false);
            int iM6412g = c5996c1.m6412g();
            int iM6412g2 = c5996c2.m6412g();
            c6021p.m6524S(-2057354538);
            c6021p.m6524S(-4217806);
            boolean z10 = c14111x0.f44390U || !AbstractC8160o6.m8729d(C13873M.f43911c, c6021p);
            c6021p.m6553p(false);
            if (z10) {
                C14054U c14054u2 = new C14054U(0, iM6412g, false);
                c6021p.m6553p(false);
                c14054u = c14054u2;
            } else {
                C21554a c21554a = C21555b.f68260Z;
                long jM8644j = AbstractC8128k6.m8644j(RCHTTPStatusCodes.UNSUCCESSFUL, EnumC21557d.MILLISECONDS);
                InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(-4206783);
                Object objM6514H6 = c6021p.m6514H();
                if (objM6514H6 == obj) {
                    objM6514H6 = C5997d.m6428O(0.0f);
                    c6021p.m6537c0(objM6514H6);
                }
                C5994b0 c5994b0 = (C5994b0) objM6514H6;
                Object objM530s = AbstractC0168G.m530s(-4204225, c6021p, false);
                if (objM530s == obj) {
                    objM530s = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM530s);
                }
                InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s;
                c6021p.m6553p(false);
                AbstractC6601G abstractC6601G = (AbstractC6601G) AbstractC17680n.m19353c0(c14111x0.m15498l());
                boolean zM8926q = m8926q(abstractC6601G, ((Boolean) interfaceC5985X2.getValue()).booleanValue());
                boolean z11 = (abstractC6601G instanceof C6664z) || (abstractC6601G instanceof C6644m);
                Boolean boolValueOf2 = Boolean.valueOf(zM8926q);
                c6021p.m6524S(-4193409);
                boolean zM6544g = c6021p.m6544g(zM8926q) | c6021p.m6540e(jM8644j);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6544g || objM6514H7 == obj) {
                    objM6514H7 = new C14073e0(zM8926q, jM8644j, interfaceC5985X2, c5994b0, null);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H7, c6021p, boolValueOf2);
                Boolean boolValueOf3 = Boolean.valueOf(z11);
                Boolean boolValueOf4 = Boolean.valueOf(zM8926q);
                c6021p.m6524S(-4186588);
                boolean zM6544g2 = c6021p.m6544g(z11) | c6021p.m6544g(zM8926q) | c6021p.m6540e(jM8644j);
                Object objM6514H8 = c6021p.m6514H();
                if (zM6544g2 || objM6514H8 == obj) {
                    objM6514H8 = new C14075f0(z11, zM8926q, jM8644j, c5994b0, null);
                    c6021p.m6537c0(objM6514H8);
                }
                c6021p.m6553p(false);
                C5997d.m6451g(boolValueOf3, boolValueOf4, (InterfaceC1439n) objM6514H8, c6021p);
                c6021p.m6524S(-4177970);
                Object objM6514H9 = c6021p.m6514H();
                if (objM6514H9 == obj) {
                    objM6514H9 = AbstractC2124C.m3204c(Integer.valueOf(iM6412g));
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC2213w0 interfaceC2213w0 = (InterfaceC2213w0) objM6514H9;
                Object objM530s2 = AbstractC0168G.m530s(-4175092, c6021p, false);
                if (objM530s2 == obj) {
                    objM530s2 = AbstractC2124C.m3214m(interfaceC2213w0, AbstractC0575H.m1165M(jM8644j));
                    c6021p.m6537c0(objM530s2);
                }
                c6021p.m6553p(false);
                InterfaceC5985X interfaceC5985XM9640b = AbstractC9112C3.m9640b((InterfaceC2184i) objM530s2, Integer.valueOf(iM6412g), c6021p, 0);
                Integer numValueOf2 = Integer.valueOf(iM6412g);
                c6021p.m6524S(-4169753);
                boolean zM6545h = c6021p.m6545h(interfaceC2213w0) | c6021p.m6538d(iM6412g);
                Object objM6514H10 = c6021p.m6514H();
                if (zM6545h || objM6514H10 == obj) {
                    objM6514H10 = new C14077g0(interfaceC2213w0, iM6412g, null);
                    c6021p.m6537c0(objM6514H10);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H10, c6021p, numValueOf2);
                if (zM8926q) {
                    int iIntValue = ((Number) interfaceC5985XM9640b.getValue()).intValue();
                    if (iIntValue <= iM6412g) {
                        iM6412g = iIntValue;
                    }
                    fM9819a = AbstractC9245Z.m9819a(iM6412g, interfaceC7537b);
                } else {
                    fM9819a = AbstractC9245Z.m9819a(iM6412g, interfaceC7537b);
                }
                C14054U c14054u3 = new C14054U(m8915f(((c5994b0.m6409g() * fM9819a) - m8917h(AbstractC9245Z.m9819a(iM6412g2, interfaceC7537b), 120)) - AbstractC7313q.f23199d, 0), fM9819a, zM8926q);
                c6021p.m6553p(false);
                c14054u = c14054u3;
            }
            c6021p.m6524S(-1399319641);
            Object objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = new C0884r(c5996c1, 5);
                c6021p.m6537c0(objM6514H11);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(interfaceC10459q, (InterfaceC1436k) objM6514H11);
            C10451i c10451i = C10444b.f30935Z;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11318d);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            float f10 = 0;
            float f11 = c14054u.f44177b;
            if (C7540e.m7873a(f11, f10)) {
                interfaceC10459qM11244d = AbstractC10844c.m11243c(interfaceC10459qM11244d, 1.0f);
            }
            if (!C7540e.m7873a(f11, f10)) {
                interfaceC10459qM11244d = AbstractC10844c.m11245e(interfaceC10459qM11244d, f11);
            }
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            m8912c(c18280tM19827a, m8926q((AbstractC6601G) AbstractC17680n.m19353c0(list), c14054u.f44178c), c6021p, 6);
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(AbstractC10844c.m11244d(c10456n, 1.0f), 1.0f);
            c6021p.m6524S(221200798);
            boolean z12 = (r6 & 112) == 32;
            Object objM6514H12 = c6021p.m6514H();
            if (z12 || objM6514H12 == obj) {
                interfaceC1436k = onIntent;
                objM6514H12 = new C0537v(26, interfaceC1436k);
                c6021p.m6537c0(objM6514H12);
            } else {
                interfaceC1436k = onIntent;
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM11243c, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H12, 12, null));
            C17767k0 c17767k0M11225c = AbstractC10842a.m11225c(0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7);
            c6021p.m6524S(221214647);
            boolean zM6542f3 = (i13 == 4) | c6021p.m6542f(c14054u) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object objM6514H13 = c6021p.m6514H();
            if (zM6542f3 || objM6514H13 == obj) {
                z6 = false;
                Object c4144v0 = new C4144v0(c14111x0, c14054u, onMessagesIntent, onMessageAudioIntent, c5996c0, c5996c2, 4);
                c6021p.m6537c0(c4144v0);
                objM6514H13 = c4144v0;
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            int i16 = 1;
            AbstractC9746I4.m10337a(interfaceC10459qM10921b, c18280tM19827a, c17767k0M11225c, false, null, null, null, false, (InterfaceC1436k) objM6514H13, c6021p, 0, 248);
            c6021p.m6553p(true);
            int iOrdinal = enumC14097q0.ordinal();
            if (iOrdinal == 0) {
                zMo5258d = z6;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                zMo5258d = c18280tM19827a.mo5258d();
            } else if (!c18280tM19827a.mo5258d() || c18280tM19827a.f58353i.mo5255a()) {
                zMo5258d = z6;
            } else {
                zMo5258d = true;
            }
            AbstractC10831a.m11201d(zMo5258d, c10843b.m11240a(c10456n, C10444b.f30941t0), AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC8411c.m8969c(-1023711249, c6021p, new C5033e(i16, interfaceC1436k)), c6021p, 200064, 16);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c14111x0, onIntent, onMessagesIntent, onMessageAudioIntent, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8912c(C18280t c18280t, boolean z6, C6021p c6021p, int i10) {
        int i11;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(-176124401);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c18280t) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            Object obj2 = ((C6035w) objM6514H).f19668Y;
            c6021p.m6524S(-1322881789);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6429P(-1);
                c6021p.m6537c0(objM6514H2);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H2;
            Object objM530s = AbstractC0168G.m530s(-1322879860, c6021p, false);
            if (objM530s == obj) {
                objM530s = AbstractC2124C.m3204c(Boolean.valueOf(z6));
                c6021p.m6537c0(objM530s);
            }
            InterfaceC2213w0 interfaceC2213w0 = (InterfaceC2213w0) objM530s;
            c6021p.m6553p(false);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-1322877388);
            int i12 = i11 & 896;
            boolean zM6545h = c6021p.m6545h(interfaceC2213w0) | (i12 == 256);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C14067b0(interfaceC2213w0, z6, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, boolValueOf);
            c6021p.m6524S(-1322874785);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                Object c1970n = new C1970n(interfaceC2213w0, 5, new C14071d0(2, null));
                c6021p.m6537c0(c1970n);
                objM6514H4 = c1970n;
            }
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985XM9640b = AbstractC9112C3.m9640b((InterfaceC2184i) objM6514H4, Boolean.FALSE, c6021p, 48);
            InterfaceC10459q interfaceC10459qMo428M = c10843b.m11240a(C10456n.f30959Y, C10444b.f30941t0).mo428M(AbstractC10844c.f32512c);
            c6021p.m6524S(-1322866205);
            boolean zM6542f = (i12 == 256) | c6021p.m6542f(interfaceC5985XM9640b) | c6021p.m6545h(obj2) | ((i11 & 112) == 32);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f || objM6514H5 == obj) {
                Object c0102a = new C0102A(z6, obj2, interfaceC5985XM9640b, c5996c0, c18280t, 3);
                c6021p.m6537c0(c0102a);
                objM6514H5 = c0102a;
            }
            c6021p.m6553p(false);
            AbstractC17780r.m19507a(AbstractC10868a.m11318d(interfaceC10459qMo428M, (InterfaceC1436k) objM6514H5), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8761E(c18280t, z6, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C18273m m8913d(C18280t c18280t, String str) {
        Object next;
        Iterator it = ((Iterable) c18280t.m19824g().f58296j).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C18273m) next).f58315l.equals(str)) {
                return (C18273m) next;
            }
        }
        next = null;
        return (C18273m) next;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8914e(boolean z6, Number number) {
        if (z6) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX INFO: renamed from: f */
    public static float m8915f(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: g */
    public static long m8916g(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: h */
    public static float m8917h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: i */
    public static long m8918i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: j */
    public static double m8919j(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* JADX INFO: renamed from: k */
    public static float m8920k(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    /* JADX INFO: renamed from: l */
    public static int m8921l(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* JADX INFO: renamed from: m */
    public static long m8922m(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Cannot coerce value to an empty range: maximum ", j12, " is less than minimum ");
        sbM9894m.append(j11);
        sbM9894m.append('.');
        throw new IllegalArgumentException(sbM9894m.toString());
    }

    /* JADX INFO: renamed from: n */
    public static long m8923n(long j10, C3511j c3511j) {
        if (c3511j.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c3511j + '.');
        }
        long j11 = c3511j.f10599Y;
        if (j10 < Long.valueOf(j11).longValue()) {
            return Long.valueOf(j11).longValue();
        }
        long j12 = c3511j.f10600Z;
        return j10 > Long.valueOf(j12).longValue() ? Long.valueOf(j12).longValue() : j10;
    }

    /* JADX INFO: renamed from: o */
    public static Comparable m8924o(Comparable comparable, C3505d c3505d) {
        if (c3505d.m4197c()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c3505d + '.');
        }
        float f10 = c3505d.f10589a;
        if (C3505d.m4194d(comparable, Float.valueOf(f10)) && !C3505d.m4194d(Float.valueOf(f10), comparable)) {
            return Float.valueOf(f10);
        }
        float f11 = c3505d.f10590b;
        return (!C3505d.m4194d(Float.valueOf(f11), comparable) || C3505d.m4194d(comparable, Float.valueOf(f11))) ? comparable : Float.valueOf(f11);
    }

    /* JADX INFO: renamed from: p */
    public static Comparable m8925p(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + '.');
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m8926q(AbstractC6601G abstractC6601G, boolean z6) {
        if (!(abstractC6601G instanceof C6664z)) {
            if (abstractC6601G instanceof C6644m) {
                return z6;
            }
            if (!(abstractC6601G instanceof AbstractC6659u) || ((AbstractC6659u) abstractC6601G).m7175g()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final ArrayList m8927r(LinkedHashMap linkedHashMap, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C21776f c21776f = (C21776f) entry.getValue();
            if (c21776f != null && !c21776f.f69068b && !c21776f.f69069c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) interfaceC1436k.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static C3506e m8928s(C3508g c3508g, int i10) {
        AbstractC16544l.m18094g(c3508g, "<this>");
        m8914e(i10 > 0, Integer.valueOf(i10));
        if (c3508g.f10593o0 <= 0) {
            i10 = -i10;
        }
        return new C3506e(c3508g.f10591Y, c3508g.f10592Z, i10);
    }

    /* JADX INFO: renamed from: t */
    public static C3508g m8929t(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new C3508g(i10, i11 - 1, 1);
        }
        C3508g c3508g = C3508g.f10598p0;
        return C3508g.f10598p0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x0202  */
    /* JADX INFO: renamed from: a */
    public static final void m8910a(C14111x0 c14111x0, InterfaceC1436k onMessagesIntent, InterfaceC1436k onMessageAudioIntent, AbstractC6601G item, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        C6021p c6021p2;
        boolean z11;
        C10282c c10282c;
        C10282c c10282cM10879a;
        C10282c c10282c2;
        C4684k c4684kM5397d;
        boolean zEquals;
        AbstractC16544l.m18094g(onMessagesIntent, "onMessagesIntent");
        AbstractC16544l.m18094g(onMessageAudioIntent, "onMessageAudioIntent");
        AbstractC16544l.m18094g(item, "item");
        c6021p.m6526U(637535015);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c14111x0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onMessagesIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onMessageAudioIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c6021p.m6542f(item) : c6021p.m6545h(item) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            z11 = z6;
        } else {
            if (item instanceof AbstractC6659u) {
                c6021p.m6524S(1142336580);
                AbstractC6659u abstractC6659u = (AbstractC6659u) item;
                EnumC7359j0 enumC7359j0M7174f = abstractC6659u.m7174f();
                EnumC7359j0 enumC7359j0 = EnumC7359j0.f23343Z;
                Map map = c14111x0.f44415j0;
                C20263a0 c20263a0 = c14111x0.f44411h0;
                if (enumC7359j0M7174f == enumC7359j0) {
                    c10282c = null;
                } else {
                    if (abstractC6659u.m7173e().f23295j != null) {
                        c10282cM10879a = abstractC6659u.m7173e().f23295j;
                    } else if (abstractC6659u.m7173e().f23272H == null) {
                        C10282c.Companion.getClass();
                        c10282cM10879a = C10281b.m10879a(c20263a0);
                    } else if (abstractC6659u.m7173e().f23272H != null) {
                        C10281b c10281b = C10282c.Companion;
                        String str = abstractC6659u.m7173e().f23272H;
                        C20263a0 c20263a1 = (C20263a0) map.get(str != null ? new C21936L0(str) : null);
                        c10281b.getClass();
                        c10282c = C10281b.m10879a(c20263a1);
                        if (c10282c == null) {
                            c10282c = new C10282c((String) null, true, false, (String) null, true, 12);
                        }
                    } else {
                        C10282c.Companion.getClass();
                        c10282c = new C10282c((String) null, true, false, (String) null, true, 12);
                    }
                    c10282c = c10282cM10879a;
                }
                C10282c c10282c3 = abstractC6659u.m7172d().f23295j;
                if (c10282c3 == null) {
                    C10281b c10281b2 = C10282c.Companion;
                    boolean z12 = abstractC6659u.m7172d().f23306u != null;
                    c10281b2.getClass();
                    C22013h2 c22013h2 = c14111x0.f44398b;
                    c10282c2 = c22013h2 != null ? new C10282c(c22013h2.f69658d, false, z12, c22013h2.f69659e, false, 18) : null;
                } else {
                    c10282c2 = c10282c3;
                }
                C7351f0 c7351f0M7172d = abstractC6659u.m7172d();
                boolean z13 = !(c7351f0M7172d.f23282R || c7351f0M7172d.f23283S);
                boolean z14 = c14111x0.f44384O;
                C18418a c18418a = c14111x0.f44400c;
                boolean z15 = (z14 || c18418a.f58779g) ? false : true;
                C7351f0 message = abstractC6659u.m7172d();
                AbstractC16544l.m18094g(message, "message");
                if (c20263a0 == null && c14111x0.f44395Z && message.f23290e != enumC7359j0 && message.f23281Q == null) {
                    boolean zM22325d = c18418a.f58774b.m22325d();
                    C4676c c4676c = c14111x0.f44402d;
                    if (!zM22325d) {
                        C22020j1.Companion.getClass();
                        if (c4676c.m5397d(CxcULo.Qnjiz) == null) {
                            c4684kM5397d = null;
                        }
                    }
                    c4684kM5397d = c4676c.m5397d(message.f23292g);
                } else {
                    c4684kM5397d = null;
                }
                boolean z16 = c14111x0.f44426p && !c14111x0.f44438z.f44212e;
                String str2 = abstractC6659u.m7172d().f23272H;
                Object obj = map.get(str2 != null ? new C21936L0(str2) : null);
                String str3 = abstractC6659u.m7172d().f23272H;
                C20263a0 c20263a2 = c14111x0.f44408g.f66645a;
                String strM12782a = c20263a2 != null ? AbstractC11372a0.m12782a(c20263a2) : null;
                if (str3 == null) {
                    if (strM12782a == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (strM12782a == null) {
                    zEquals = false;
                } else {
                    zEquals = str3.equals(strM12782a);
                }
                C20263a0 c20263a3 = (C20263a0) (!zEquals ? obj : null);
                C6658t c6658t = AbstractC6659u.Companion;
                int i13 = (i12 << 12) & 458752;
                int i14 = i12 << 6;
                z10 = false;
                AbstractC5023t.m5650a(c10282c, c10282c2, abstractC6659u, c14111x0.f44386Q, c14111x0.f44385P, onMessagesIntent, interfaceC10459q, c4684kM5397d, z15, z13, c14111x0.f44382M, z16, c14111x0.f44425o0, c20263a3, onMessageAudioIntent, c6021p, i13 | (3670016 & i14), 4096 | (i14 & 57344), 0);
                c6021p.m6553p(false);
            } else {
                z10 = false;
                boolean z17 = item instanceof C6650p;
                C5975S c5975s = C6013l.f19514a;
                if (z17) {
                    c6021p.m6524S(1143864446);
                    C6650p c6650p = (C6650p) item;
                    c6021p.m6524S(-1071476033);
                    boolean z18 = (i12 & 112) == 32;
                    Object objM6514H = c6021p.m6514H();
                    if (z18 || objM6514H == c5975s) {
                        c6021p2 = c6021p;
                        objM6514H = new C0537v(25, onMessagesIntent);
                        c6021p2.m6537c0(objM6514H);
                    } else {
                        c6021p2 = c6021p;
                    }
                    c6021p2.m6553p(false);
                    AbstractC11728d.m13033a(c6650p.f21413c, (InterfaceC1436k) objM6514H, interfaceC10459q, c6021p, (i12 >> 6) & 896, 0);
                    c6021p2.m6553p(false);
                } else if (item instanceof C6644m) {
                    c6021p.m6524S(-1071471964);
                    C6644m c6644m = (C6644m) item;
                    c6021p.m6524S(-1071468100);
                    boolean z19 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048 || ((4096 & i12) != 0 && c6021p.m6545h(item)));
                    Object objM6514H2 = c6021p.m6514H();
                    if (z19 || objM6514H2 == c5975s) {
                        objM6514H2 = new C8816z(onMessagesIntent, 24, item);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    C6642l c6642l = C6644m.Companion;
                    AbstractC9991w4.m10632a(c6644m, (InterfaceC1426a) objM6514H2, interfaceC10459q, c6021p, (i12 >> 6) & 896);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1144304677);
                    c6021p.m6553p(false);
                }
            }
            z11 = z10;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(c14111x0, onMessagesIntent, onMessageAudioIntent, item, interfaceC10459q, z11, i10);
        }
    }
}
