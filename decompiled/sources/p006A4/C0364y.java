package p006A4;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import bf.InterfaceC11374b0;
import cd.C11709i;
import ge.C14089m0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p1039ud.C20194k;
import p1039ud.C20199p;
import p1039ud.C20200q;
import p1062vd.C20541V;
import p1062vd.C20549b0;
import p1062vd.C20551c0;
import p1062vd.C20553d0;
import p1062vd.C20555e0;
import p1062vd.C20558h;
import p1062vd.C20559i;
import p1062vd.C20561k;
import p1062vd.C20562l;
import p1062vd.C20564n;
import p1062vd.C20565o;
import p1062vd.C20571u;
import p1062vd.InterfaceC20563m;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1127yf.C21535j;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22011h0;
import p229J0.AbstractC3984T1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p403Qd.C6636i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7949N4;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8082f0;
import p594Y9.AbstractC9839Y2;
import p594Y9.AbstractC9961r4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p870le.C16886i0;
import p911o0.AbstractC17780r;
import p928oh.C18194a;
import p989rd.EnumC18945g;

/* JADX INFO: renamed from: A4.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0364y extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1246Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1247Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1248o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364y(Object obj, int i10, Object obj2) {
        super(4);
        this.f1246Y = i10;
        this.f1247Z = obj;
        this.f1248o0 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6  */
    /* JADX INFO: renamed from: a */
    private final Object m996a(Object obj, Object obj2, Object obj3, Object obj4) {
        C5975S c5975s;
        boolean zM6542f;
        Object objM6514H;
        boolean zM6542f2;
        Object objM6514H2;
        C10845a items = (C10845a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6021p c6021p = (C6021p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C20194k c20194k = (C20194k) this.f1247Z;
            InterfaceC20563m interfaceC20563m = (InterfaceC20563m) c20194k.f63951f.get(iIntValue);
            if (interfaceC20563m instanceof C20571u) {
                c6021p.m6524S(697559246);
                AbstractC8063c5.m8459b((C20571u) interfaceC20563m, iIntValue == 0, null, c6021p, 0);
                c6021p.m6553p(false);
            } else if (interfaceC20563m instanceof C20541V) {
                c6021p.m6524S(697719764);
                c6021p.m6524S(992338932);
                Object objM6514H3 = c6021p.m6514H();
                C5975S c5975s2 = C6013l.f19514a;
                if (objM6514H3 == c5975s2) {
                    objM6514H3 = new C11709i(null, 3);
                    c6021p.m6537c0(objM6514H3);
                }
                C11709i c11709i = (C11709i) objM6514H3;
                c6021p.m6553p(false);
                C10456n c10456n = C10456n.f30959Y;
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i10 = c6021p.f19564P;
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
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                C20541V c20541v = (C20541V) interfaceC20563m;
                c6021p.m6524S(684962673);
                boolean zM6545h = c6021p.m6545h(c11709i);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6545h || objM6514H4 == c5975s2) {
                    objM6514H4 = new C20199p(c11709i, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H4;
                c6021p.m6553p(false);
                c6021p.m6524S(684965073);
                boolean zM6545h2 = c6021p.m6545h(c11709i);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6545h2 || objM6514H5 == c5975s2) {
                    objM6514H5 = new C20199p(c11709i, 1);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                AbstractC8063c5.m8460c(c20541v, interfaceC1436k, (InterfaceC1436k) objM6514H5, null, false, false, false, false, c6021p, 0, 248);
                c6021p.m6524S(684976538);
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f1248o0;
                boolean zM6542f3 = c6021p.m6542f(interfaceC1436k2) | c6021p.m6545h(interfaceC20563m);
                Object objM6514H6 = c6021p.m6514H();
                if (zM6542f3) {
                    c5975s = c5975s2;
                } else {
                    c5975s = c5975s2;
                    if (objM6514H6 == c5975s) {
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H6;
                    c6021p.m6553p(false);
                    c6021p.m6524S(684980151);
                    zM6542f = c6021p.m6542f(interfaceC1436k2) | c6021p.m6545h(interfaceC20563m);
                    objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C20200q(interfaceC1436k2, (C20541V) interfaceC20563m, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H;
                    c6021p.m6553p(false);
                    c6021p.m6524S(684983710);
                    zM6542f2 = c6021p.m6542f(interfaceC1436k2);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C16886i0(12, interfaceC1436k2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC7949N4.m8236a(c11709i, c20541v.f65169a, c20194k.f63950e, interfaceC1426a, interfaceC1426a2, (InterfaceC1426a) objM6514H2, null, c6021p, 0);
                    c6021p.m6553p(true);
                    c6021p.m6553p(false);
                }
                objM6514H6 = new C20200q(interfaceC1436k2, (C20541V) interfaceC20563m, 0);
                c6021p.m6537c0(objM6514H6);
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H6;
                c6021p.m6553p(false);
                c6021p.m6524S(684980151);
                zM6542f = c6021p.m6542f(interfaceC1436k2) | c6021p.m6545h(interfaceC20563m);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    objM6514H = new C20200q(interfaceC1436k2, (C20541V) interfaceC20563m, 1);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C20200q(interfaceC1436k2, (C20541V) interfaceC20563m, 1);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(684983710);
                zM6542f2 = c6021p.m6542f(interfaceC1436k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H2 = new C16886i0(12, interfaceC1436k2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C16886i0(12, interfaceC1436k2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC7949N4.m8236a(c11709i, c20541v.f65169a, c20194k.f63950e, interfaceC1426a3, interfaceC1426a4, (InterfaceC1426a) objM6514H2, null, c6021p, 0);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(698725001);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0203  */
    /* JADX WARN: Code duplicated, block: B:72:0x022c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0255  */
    /* JADX WARN: Code duplicated, block: B:80:0x0279  */
    /* JADX INFO: renamed from: b */
    private final Object m997b(Object obj, Object obj2, Object obj3, Object obj4) {
        C6636i c6636i;
        EnumC18945g enumC18945g;
        boolean zM6542f;
        Object objM6514H;
        boolean zM6542f2;
        Object objM6514H2;
        boolean zM6542f3;
        Object objM6514H3;
        boolean zM6542f4;
        Object objM6514H4;
        C10845a items = (C10845a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6021p c6021p = (C6021p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 32 : 16;
        }
        int i10 = iIntValue2 & 145;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 144 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C20549b0 c20549b0 = (C20549b0) this.f1247Z;
            InterfaceC20563m interfaceC20563m = (InterfaceC20563m) c20549b0.f65208E.get(iIntValue);
            if (interfaceC20563m instanceof C20571u) {
                c6021p.m6524S(-487691503);
                AbstractC8063c5.m8459b((C20571u) interfaceC20563m, iIntValue == 0, null, c6021p, 0);
                c6021p.m6553p(false);
            } else {
                if (!(interfaceC20563m instanceof C20551c0)) {
                    boolean z6 = interfaceC20563m instanceof C20541V;
                    C10456n c10456n = C10456n.f30959Y;
                    C5975S c5975s = C6013l.f19514a;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f1248o0;
                    if (!z6) {
                        if (interfaceC20563m instanceof C20562l) {
                            c6021p.m6524S(-484804721);
                            C20562l c20562l = (C20562l) interfaceC20563m;
                            AbstractC8063c5.m8463f(c20562l.f65270a, c20562l.f65271b, c20562l.f65272c, (InterfaceC1436k) this.f1248o0, null, c6021p, 8);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        if (interfaceC20563m instanceof C20555e0) {
                            c6021p.m6524S(-484509477);
                            C20555e0 c20555e0 = (C20555e0) interfaceC20563m;
                            InterfaceC11374b0 interfaceC11374b0 = c20555e0.f65256a;
                            c6021p.m6524S(1092752659);
                            boolean zM6542f5 = c6021p.m6542f(interfaceC1436k);
                            Object objM6514H5 = c6021p.m6514H();
                            if (zM6542f5 || objM6514H5 == c5975s) {
                                objM6514H5 = new C14089m0(14, interfaceC1436k);
                                c6021p.m6537c0(objM6514H5);
                            }
                            c6021p.m6553p(false);
                            AbstractC9839Y2.m10485b(interfaceC11374b0, (InterfaceC1436k) objM6514H5, null, c20555e0.f65257b, c20555e0.f65258c, false, null, null, null, c6021p, 0, 484);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        if (interfaceC20563m instanceof C20553d0) {
                            c6021p.m6524S(-483926429);
                            AbstractC8063c5.m8465h(0, interfaceC1436k, c6021p, null);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        if (interfaceC20563m instanceof C20558h) {
                            c6021p.m6524S(-483745389);
                            AbstractC8063c5.m8461d(0, interfaceC1436k, c6021p, null, ((C20558h) interfaceC20563m).f65263a);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        if (interfaceC20563m instanceof C20561k) {
                            c6021p.m6524S(-483429437);
                            float f10 = AbstractC7312p.f23186c;
                            float f11 = AbstractC7313q.f23201f;
                            AbstractC3984T1.m4692k(AbstractC10842a.m11237o(AbstractC10844c.m11256p(c10456n, f10 + f11), f11, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0L, c6021p, 0, 6);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        if (!(interfaceC20563m instanceof C20559i)) {
                            c6021p.m6524S(-482969490);
                            c6021p.m6553p(false);
                            return c17296c;
                        }
                        c6021p.m6524S(-483122847);
                        AbstractC8063c5.m8462e(0, interfaceC1436k, c6021p, null);
                        c6021p.m6553p(false);
                        return c17296c;
                    }
                    c6021p.m6524S(-487371025);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p.f19564P;
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
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
                    c6021p.m6524S(1691074037);
                    boolean zM6542f6 = c6021p.m6542f(interfaceC5985XM6435V) | c6021p.m6545h(interfaceC20563m);
                    Object objM6514H6 = c6021p.m6514H();
                    if (zM6542f6 || objM6514H6 == c5975s) {
                        objM6514H6 = new C20564n((C20541V) interfaceC20563m, interfaceC5985XM6435V, null);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c17296c);
                    c6021p.m6524S(1691079696);
                    Object objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == c5975s) {
                        objM6514H7 = new C11709i(null, 3);
                        c6021p.m6537c0(objM6514H7);
                    }
                    C11709i c11709i = (C11709i) objM6514H7;
                    c6021p.m6553p(false);
                    C20541V c20541v = (C20541V) interfaceC20563m;
                    c6021p.m6524S(1691085331);
                    boolean zM6545h = c6021p.m6545h(interfaceC20563m) | c6021p.m6542f(interfaceC1436k);
                    Object objM6514H8 = c6021p.m6514H();
                    if (zM6545h || objM6514H8 == c5975s) {
                        objM6514H8 = new C20565o((C20541V) interfaceC20563m, interfaceC1436k);
                        c6021p.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H8;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1691094081);
                    boolean zM6545h2 = c6021p.m6545h(interfaceC20563m) | c6021p.m6545h(c11709i);
                    Object objM6514H9 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H9 == c5975s) {
                        objM6514H9 = new C18194a((C20541V) interfaceC20563m, 20, c11709i);
                        c6021p.m6537c0(objM6514H9);
                    }
                    c6021p.m6553p(false);
                    boolean zContains = c20549b0.f65225q.contains(new C22011h0(c20541v.f65169a.f21379a));
                    C6636i c6636i2 = c20541v.f65169a;
                    String str = c6636i2.f21379a;
                    AbstractC8063c5.m8460c(c20541v, interfaceC1436k2, (InterfaceC1436k) objM6514H9, null, zContains, c20549b0.f65226r.contains(new C22011h0(str)), c20549b0.f65227s.contains(new C22011h0(str)), AbstractC21322p.m21681O(c20549b0.f65219k), c6021p, 0, 8);
                    if (c20549b0.f65204A) {
                        c6636i = c6636i2;
                        String str2 = c6636i.f21390l;
                        if (!AbstractC16544l.m18089b(str2, "gpt") && (c6636i.f21389k == null || AbstractC16544l.m18089b(str2, "snorlax"))) {
                            enumC18945g = EnumC18945g.f60490Y;
                        }
                        EnumC18945g enumC18945g2 = enumC18945g;
                        c6021p.m6524S(1691136828);
                        zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                        objM6514H = c6021p.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C20565o(interfaceC1436k, (C20541V) interfaceC20563m);
                            c6021p.m6537c0(objM6514H);
                        }
                        InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H;
                        c6021p.m6553p(false);
                        c6021p.m6524S(1691142600);
                        zM6542f2 = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2 || objM6514H2 == c5975s) {
                            objM6514H2 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 2);
                            c6021p.m6537c0(objM6514H2);
                        }
                        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                        c6021p.m6553p(false);
                        c6021p.m6524S(1691145735);
                        zM6542f3 = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                        objM6514H3 = c6021p.m6514H();
                        if (zM6542f3 || objM6514H3 == c5975s) {
                            objM6514H3 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 3);
                            c6021p.m6537c0(objM6514H3);
                        }
                        InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H3;
                        c6021p.m6553p(false);
                        c6021p.m6524S(1691148891);
                        zM6542f4 = c6021p.m6542f(interfaceC1436k);
                        objM6514H4 = c6021p.m6514H();
                        if (zM6542f4 || objM6514H4 == c5975s) {
                            objM6514H4 = new C16886i0(15, interfaceC1436k);
                            c6021p.m6537c0(objM6514H4);
                        }
                        c6021p.m6553p(false);
                        AbstractC8082f0.m8512d(c11709i, c6636i.f21379a, c6636i.f21384f, c20549b0.f65228t, enumC18945g2, interfaceC1436k3, interfaceC1426a, interfaceC1426a2, (InterfaceC1426a) objM6514H4, null, false, c6021p, 0, 0);
                        c6021p.m6553p(true);
                        c6021p.m6553p(false);
                        return c17296c;
                    }
                    c6636i = c6636i2;
                    enumC18945g = EnumC18945g.f60492o0;
                    EnumC18945g enumC18945g3 = enumC18945g;
                    c6021p.m6524S(1691136828);
                    zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                    objM6514H = c6021p.m6514H();
                    if (zM6542f) {
                        objM6514H = new C20565o(interfaceC1436k, (C20541V) interfaceC20563m);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C20565o(interfaceC1436k, (C20541V) interfaceC20563m);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1691142600);
                    zM6542f2 = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        objM6514H2 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 2);
                        c6021p.m6537c0(objM6514H2);
                    } else {
                        objM6514H2 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H2;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1691145735);
                    zM6542f3 = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(interfaceC20563m);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6542f3) {
                        objM6514H3 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 3);
                        c6021p.m6537c0(objM6514H3);
                    } else {
                        objM6514H3 = new C20200q(interfaceC1436k, (C20541V) interfaceC20563m, 3);
                        c6021p.m6537c0(objM6514H3);
                    }
                    InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H3;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1691148891);
                    zM6542f4 = c6021p.m6542f(interfaceC1436k);
                    objM6514H4 = c6021p.m6514H();
                    if (zM6542f4) {
                        objM6514H4 = new C16886i0(15, interfaceC1436k);
                        c6021p.m6537c0(objM6514H4);
                    } else {
                        objM6514H4 = new C16886i0(15, interfaceC1436k);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    AbstractC8082f0.m8512d(c11709i, c6636i.f21379a, c6636i.f21384f, c20549b0.f65228t, enumC18945g3, interfaceC1436k4, interfaceC1426a3, interfaceC1426a4, (InterfaceC1426a) objM6514H4, null, false, c6021p, 0, 0);
                    c6021p.m6553p(true);
                    c6021p.m6553p(false);
                    return c17296c;
                }
                c6021p.m6524S(-487560249);
                AbstractC8071d5.m8482a(0, 1, c6021p, null);
                c6021p.m6553p(false);
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: c */
    private final Object m998c(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC7537b appendInlineContent = (InterfaceC7537b) obj;
        String it = (String) obj2;
        C6021p c6021p = (C6021p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(appendInlineContent, "$this$appendInlineContent");
        AbstractC16544l.m18094g(it, "it");
        int i10 = iIntValue & 129;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 128 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1595587083);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) this.f1247Z;
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            AbstractC9961r4 abstractC9961r4 = (AbstractC9961r4) this.f1248o0;
            boolean zM6545h2 = zM6545h | c6021p.m6545h(abstractC9961r4);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h2 || objM6514H == C6013l.f19514a) {
                objM6514H = new C21535j(interfaceC20904w, abstractC9961r4, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:363:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:405:0x0cc8  */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 java.lang.Object, still in use, count: 2, list:
          (r5v5 java.lang.Object) from 0x0cc3: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v5 java.lang.Object) binds: [B:401:0x0cc2, B:412:0x0cc3] A[DONT_GENERATE, DONT_INLINE]
          (r5v5 java.lang.Object) from 0x0cb9: CHECK_CAST (z4.h) (r5v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final java.lang.Object mo985d(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006A4.C0364y.mo985d(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
