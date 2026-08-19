package p523V9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.VoiceModeViewModel;
import de.C13077e;
import de.C13078f;
import de.C13079g;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0184L0;
import p003A1.C0257i0;
import p006A4.C0349j;
import p006A4.C0350k;
import p017Af.C0468O;
import p017Af.C0470a;
import p017Af.C0492w;
import p021Aj.C0523h;
import p025An.C0644w;
import p039Bc.C0885s;
import p042Bf.C1276r;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1073w3.AbstractC20800b;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21938L2;
import p1155zi.C21987b0;
import p124Ei.AbstractC2526l1;
import p124Ei.C2514h1;
import p124Ei.C2529m1;
import p124Ei.C2532n1;
import p153Fn.C2925c;
import p204I1.C3582M;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC3996V3;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C3991U3;
import p229J0.C4027b3;
import p229J0.C4042e0;
import p302M0.AbstractC5264p;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.C6037x;
import p349O0.InterfaceC6008i0;
import p372P3.C6318J;
import p467T1.C7199i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p547Wc.C8805o;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9249Z3;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17731K;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17767k0;
import p911o0.C17790w;
import p962qc.AbstractC18671e;

/* JADX INFO: renamed from: V9.W4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8018W4 {
    /* JADX INFO: renamed from: b */
    public static final void m8342b(List actions, String name, boolean z6, InterfaceC1426a onUpsell, InterfaceC1426a onNewChat, InterfaceC1426a onAuthenticate, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(actions, "actions");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(onUpsell, "onUpsell");
        AbstractC16544l.m18094g(onNewChat, "onNewChat");
        AbstractC16544l.m18094g(onAuthenticate, "onAuthenticate");
        c6021p.m6526U(310755091);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(actions) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(name) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onUpsell) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onNewChat) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onAuthenticate) ? 131072 : 65536;
        }
        if ((i11 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23199d;
            AbstractC17731K.m19460a(AbstractC10842a.m11235m(c10456n, 0.0f, f10, 1), AbstractC17770m.m19500g(f10), null, 0, 0, null, AbstractC8411c.m8969c(-1674992648, c6021p, new C13077e(actions, name, z6, interfaceC20904w, onAuthenticate, onNewChat, onUpsell)), c6021p, 1572864, 60);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(actions, name, z6, onUpsell, onNewChat, onAuthenticate, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m8343c(C21987b0 banner, InterfaceC1426a onHideBanner, InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, C6021p c6021p, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        Object obj2;
        int i14;
        int i15;
        Object obj3;
        int i16;
        Object obj4;
        Object obj5;
        InterfaceC20904w interfaceC20904w;
        boolean zM6545h;
        Object objM6514H;
        int i17;
        InterfaceC1426a interfaceC1426a4;
        C21694h c21694h;
        InterfaceC10459q interfaceC10459q2;
        Object obj6;
        Object obj7;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(banner, "banner");
        AbstractC16544l.m18094g(onHideBanner, "onHideBanner");
        c6021p.m6526U(-1223981100);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(banner) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onHideBanner) ? 32 : 16;
        }
        int i18 = i12 | 384;
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 3072) == 0) {
                obj = interfaceC1426a;
                i18 |= c6021p.m6545h(obj) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    obj2 = interfaceC1426a2;
                    if (c6021p.m6545h(obj2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i18 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        obj3 = interfaceC1426a3;
                        if (c6021p.m6545h(obj3)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i18 |= i16;
                    }
                    if ((i18 & 74899) == 74898 || !c6021p.m6562y()) {
                        C10456n c10456n = C10456n.f30959Y;
                        if (i19 != 0) {
                            obj = C13078f.f41547Z;
                        }
                        Object obj8 = obj;
                        if (i13 != 0) {
                            obj4 = C13078f.f41548o0;
                        } else {
                            obj4 = obj2;
                        }
                        if (i15 != 0) {
                            obj5 = C13078f.f41549p0;
                        } else {
                            obj5 = obj3;
                        }
                        interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                        C17296C c17296c = C17296C.f55119a;
                        c6021p.m6524S(-1013452356);
                        zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                        objM6514H = c6021p.m6514H();
                        if (zM6545h || objM6514H == C6013l.f19514a) {
                            objM6514H = new C13079g(interfaceC20904w, banner, null);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
                        C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                        InterfaceC10459q interfaceC10459qM19490l = AbstractC17758g.m19490l(c10456n);
                        InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                        i17 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l);
                        InterfaceC21700k.f68875m0.getClass();
                        interfaceC1426a4 = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(interfaceC1426a4);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                        c21694h = C21698j.f68874g;
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                            AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                        AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f, obj8, obj5, obj4, 7)), c6021p, 805306416, 508);
                        c6021p.m6553p(true);
                        interfaceC10459q2 = c10456n;
                        obj6 = obj8;
                        obj7 = obj4;
                        obj3 = obj5;
                    } else {
                        c6021p.m6517L();
                        interfaceC10459q2 = interfaceC10459q;
                        obj7 = obj2;
                        obj6 = obj;
                    }
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
                    }
                }
                i18 |= 196608;
                obj3 = interfaceC1426a3;
                if ((i18 & 74899) == 74898) {
                    C10456n c10456n2 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj9 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c2 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c2);
                    C8870f c8870f2 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l2 = AbstractC17758g.m19490l(c10456n2);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l2);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f2, obj9, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n2;
                    obj6 = obj9;
                    obj7 = obj4;
                    obj3 = obj5;
                } else {
                    C10456n c10456n3 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj10 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c3 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c3);
                    C8870f c8870f3 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l3 = AbstractC17758g.m19490l(c10456n3);
                    InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l3);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e3);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n3, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f3, obj10, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n3;
                    obj6 = obj10;
                    obj7 = obj4;
                    obj3 = obj5;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
                }
            }
            i18 |= 24576;
            obj2 = interfaceC1426a2;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    obj3 = interfaceC1426a3;
                    if (c6021p.m6545h(obj3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i18 |= i16;
                }
                if ((i18 & 74899) == 74898) {
                    C10456n c10456n4 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj11 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c4 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c4);
                    C8870f c8870f4 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l4 = AbstractC17758g.m19490l(c10456n4);
                    InterfaceC21057K interfaceC21057KM19511e4 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l4);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e4);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n4, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f4, obj11, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n4;
                    obj6 = obj11;
                    obj7 = obj4;
                    obj3 = obj5;
                } else {
                    C10456n c10456n5 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj12 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c5 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c5);
                    C8870f c8870f5 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l5 = AbstractC17758g.m19490l(c10456n5);
                    InterfaceC21057K interfaceC21057KM19511e5 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l5);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e5);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n5, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f5, obj12, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n5;
                    obj6 = obj12;
                    obj7 = obj4;
                    obj3 = obj5;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
                }
            }
            i18 |= 196608;
            obj3 = interfaceC1426a3;
            if ((i18 & 74899) == 74898) {
                C10456n c10456n6 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj13 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c6 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c6);
                C8870f c8870f6 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l6 = AbstractC17758g.m19490l(c10456n6);
                InterfaceC21057K interfaceC21057KM19511e6 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l6);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e6);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n6, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f6, obj13, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n6;
                obj6 = obj13;
                obj7 = obj4;
                obj3 = obj5;
            } else {
                C10456n c10456n7 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj14 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c7 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c7);
                C8870f c8870f7 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l7 = AbstractC17758g.m19490l(c10456n7);
                InterfaceC21057K interfaceC21057KM19511e7 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l7);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e7);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n7, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f7, obj14, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n7;
                obj6 = obj14;
                obj7 = obj4;
                obj3 = obj5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
            }
        }
        i18 = i12 | 3456;
        obj = interfaceC1426a;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                obj2 = interfaceC1426a2;
                if (c6021p.m6545h(obj2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i18 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    obj3 = interfaceC1426a3;
                    if (c6021p.m6545h(obj3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i18 |= i16;
                }
                if ((i18 & 74899) == 74898) {
                    C10456n c10456n8 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj15 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c8 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c8);
                    C8870f c8870f8 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l8 = AbstractC17758g.m19490l(c10456n8);
                    InterfaceC21057K interfaceC21057KM19511e8 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l8);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e8);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m8);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d8);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n8, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f8, obj15, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n8;
                    obj6 = obj15;
                    obj7 = obj4;
                    obj3 = obj5;
                } else {
                    C10456n c10456n9 = C10456n.f30959Y;
                    if (i19 != 0) {
                        obj = C13078f.f41547Z;
                    }
                    Object obj16 = obj;
                    if (i13 != 0) {
                        obj4 = C13078f.f41548o0;
                    } else {
                        obj4 = obj2;
                    }
                    if (i15 != 0) {
                        obj5 = C13078f.f41549p0;
                    } else {
                        obj5 = obj3;
                    }
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17296C c17296c9 = C17296C.f55119a;
                    c6021p.m6524S(-1013452356);
                    zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C13079g(interfaceC20904w, banner, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c9);
                    C8870f c8870f9 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    InterfaceC10459q interfaceC10459qM19490l9 = AbstractC17758g.m19490l(c10456n9);
                    InterfaceC21057K interfaceC21057KM19511e9 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m9 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d9 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l9);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a4 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a4);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e9);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m9);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d9);
                    AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n9, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f9, obj16, obj5, obj4, 7)), c6021p, 805306416, 508);
                    c6021p.m6553p(true);
                    interfaceC10459q2 = c10456n9;
                    obj6 = obj16;
                    obj7 = obj4;
                    obj3 = obj5;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
                }
            }
            i18 |= 196608;
            obj3 = interfaceC1426a3;
            if ((i18 & 74899) == 74898) {
                C10456n c10456n10 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj17 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c10 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c10);
                C8870f c8870f10 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l10 = AbstractC17758g.m19490l(c10456n10);
                InterfaceC21057K interfaceC21057KM19511e10 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m10 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d10 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l10);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e10);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m10);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d10);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n10, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f10, obj17, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n10;
                obj6 = obj17;
                obj7 = obj4;
                obj3 = obj5;
            } else {
                C10456n c10456n11 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj18 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c11 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c11);
                C8870f c8870f11 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l11 = AbstractC17758g.m19490l(c10456n11);
                InterfaceC21057K interfaceC21057KM19511e11 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m11 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d11 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l11);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e11);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m11);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d11);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n11, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f11, obj18, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n11;
                obj6 = obj18;
                obj7 = obj4;
                obj3 = obj5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
            }
        }
        i18 |= 24576;
        obj2 = interfaceC1426a2;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                obj3 = interfaceC1426a3;
                if (c6021p.m6545h(obj3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i18 |= i16;
            }
            if ((i18 & 74899) == 74898) {
                C10456n c10456n12 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj19 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c12 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c12);
                C8870f c8870f12 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l12 = AbstractC17758g.m19490l(c10456n12);
                InterfaceC21057K interfaceC21057KM19511e12 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m12 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d12 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l12);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e12);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m12);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d12);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n12, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f12, obj19, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n12;
                obj6 = obj19;
                obj7 = obj4;
                obj3 = obj5;
            } else {
                C10456n c10456n13 = C10456n.f30959Y;
                if (i19 != 0) {
                    obj = C13078f.f41547Z;
                }
                Object obj110 = obj;
                if (i13 != 0) {
                    obj4 = C13078f.f41548o0;
                } else {
                    obj4 = obj2;
                }
                if (i15 != 0) {
                    obj5 = C13078f.f41549p0;
                } else {
                    obj5 = obj3;
                }
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17296C c17296c13 = C17296C.f55119a;
                c6021p.m6524S(-1013452356);
                zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13079g(interfaceC20904w, banner, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c13);
                C8870f c8870f13 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                InterfaceC10459q interfaceC10459qM19490l13 = AbstractC17758g.m19490l(c10456n13);
                InterfaceC21057K interfaceC21057KM19511e13 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m13 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d13 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l13);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a4 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a4);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e13);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m13);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d13);
                AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n13, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f13, obj110, obj5, obj4, 7)), c6021p, 805306416, 508);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n13;
                obj6 = obj110;
                obj7 = obj4;
                obj3 = obj5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
            }
        }
        i18 |= 196608;
        obj3 = interfaceC1426a3;
        if ((i18 & 74899) == 74898) {
            C10456n c10456n14 = C10456n.f30959Y;
            if (i19 != 0) {
                obj = C13078f.f41547Z;
            }
            Object obj111 = obj;
            if (i13 != 0) {
                obj4 = C13078f.f41548o0;
            } else {
                obj4 = obj2;
            }
            if (i15 != 0) {
                obj5 = C13078f.f41549p0;
            } else {
                obj5 = obj3;
            }
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c14 = C17296C.f55119a;
            c6021p.m6524S(-1013452356);
            zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
            objM6514H = c6021p.m6514H();
            if (zM6545h) {
                objM6514H = new C13079g(interfaceC20904w, banner, null);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C13079g(interfaceC20904w, banner, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c14);
            C8870f c8870f14 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC10459q interfaceC10459qM19490l14 = AbstractC17758g.m19490l(c10456n14);
            InterfaceC21057K interfaceC21057KM19511e14 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m14 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d14 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l14);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a4 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a4);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e14);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m14);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d14);
            AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n14, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f14, obj111, obj5, obj4, 7)), c6021p, 805306416, 508);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n14;
            obj6 = obj111;
            obj7 = obj4;
            obj3 = obj5;
        } else {
            C10456n c10456n15 = C10456n.f30959Y;
            if (i19 != 0) {
                obj = C13078f.f41547Z;
            }
            Object obj112 = obj;
            if (i13 != 0) {
                obj4 = C13078f.f41548o0;
            } else {
                obj4 = obj2;
            }
            if (i15 != 0) {
                obj5 = C13078f.f41549p0;
            } else {
                obj5 = obj3;
            }
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c15 = C17296C.f55119a;
            c6021p.m6524S(-1013452356);
            zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(banner);
            objM6514H = c6021p.m6514H();
            if (zM6545h) {
                objM6514H = new C13079g(interfaceC20904w, banner, null);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C13079g(interfaceC20904w, banner, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c15);
            C8870f c8870f15 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC10459q interfaceC10459qM19490l15 = AbstractC17758g.m19490l(c10456n15);
            InterfaceC21057K interfaceC21057KM19511e15 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m15 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d15 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19490l15);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a4 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a4);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e15);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m15);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d15);
            AbstractC3996V3.m4712a(AbstractC10842a.m11233k(c10456n15, AbstractC7313q.f23198c), AbstractC8411c.m8969c(-1242444883, c6021p, new C8805o(banner, 9, onHideBanner)), null, false, null, 0L, 0L, 0L, 0L, AbstractC8411c.m8969c(-1942934091, c6021p, new C0350k(banner, c8870f15, obj112, obj5, obj4, 7)), c6021p, 805306416, 508);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n15;
            obj6 = obj112;
            obj7 = obj4;
            obj3 = obj5;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4027b3(banner, onHideBanner, interfaceC10459q2, obj6, obj7, obj3, i10, i11, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8344d(String markdownText, C8870f appState, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(markdownText, "markdownText");
        AbstractC16544l.m18094g(appState, "appState");
        c6021p.m6526U(-131823308);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(markdownText) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(appState) : c6021p.m6545h(appState) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC18671e.m20038a(c10456n, AbstractC9249Z3.m9825b(), AbstractC8411c.m8969c(-1224880449, c6021p, new C0885s(markdownText, 24, appState)), c6021p, ((i12 >> 6) & 14) | 384, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(markdownText, appState, interfaceC10459q2, i10, 10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8345e(C2529m1 content, InterfaceC1426a onDismissRequest, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(-603777849);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(content) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C3880A3 c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(345406359);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | ((i12 & 14) == 4);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C2514h1(interfaceC20904w, content, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, content);
            AbstractC4152w2.m4780a(onDismissRequest, c10456n, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-1717540572, c6021p, new C1281w(content, c3880a3M4785f, onDismissRequest, 1)), c6021p, (i12 >> 3) & 126, 384, 4088);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(content, onDismissRequest, interfaceC10459q2, i10, 14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8346f(C2529m1 content, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        boolean z6;
        C4042e0 c4042e0;
        C8870f c8870f;
        VoiceModeViewModel voiceModeViewModel;
        C6021p c6021p2;
        C6021p c6021p3 = c6021p;
        int i12 = i10;
        AbstractC16544l.m18094g(content, "content");
        c6021p3.m6526U(-66003719);
        int i13 = (i12 & 6) == 0 ? (c6021p3.m6542f(content) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i13 |= c6021p3.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            i11 = i12;
        } else {
            c6021p3.m6524S(-1020152108);
            Context context = (Context) c6021p3.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p3.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p3.m6548k(AbstractC16421b.f50950a);
            c6021p3.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p3.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p3.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(VoiceModeViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C2532n1.class);
            c6021p3.m6524S(-1395498839);
            boolean zM6542f = c6021p3.m6542f(interfaceC3756dMo5693b) | c6021p3.m6542f(interfaceC3756dMo5693b2) | c6021p3.m6542f(list) | c6021p3.m6544g(zBooleanValue) | c6021p3.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p3.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p3.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p3, 0);
            c6021p3.m6553p(false);
            VoiceModeViewModel voiceModeViewModel2 = (VoiceModeViewModel) baseViewModel;
            C8870f c8870f2 = (C8870f) c6021p3.m6548k(AbstractC8873i.f27157a);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p3);
            }
            C2925c c2925c = ((C6035w) objM6514H2).f19668Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p3.m6548k(AbstractC20875V.f66456a);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23203h, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
            C10449g c10449g = C10444b.f30947z0;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), c10449g, c6021p3, 48);
            int i15 = c6021p3.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p3.f19563O) {
                c6021p3.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p3, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
            C5975S c5975s2 = c5975s;
            C10456n c10456n2 = c10456n;
            AbstractC4124r4.m4768b(content.f7860a, null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, C3582M.m4274b(((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12148d, ((C3949M0) c6021p3.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC9119D4.m9650c(28), null, null, 0L, null, 0, 0, 0L, null, null, 16777212), c6021p, 0, 0, 65022);
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5997d.m6440a(c6037x.mo6405a(C3582M.m4274b((C3582M) c6021p3.m6548k(c6037x), 0L, 0L, null, null, 0L, null, 3, 0, 0L, null, null, 16744447)), AbstractC8411c.m8969c(198445187, c6021p3, new C0349j(content, 9, interfaceC20904w)), c6021p3, 56);
            c6021p3.m6524S(-1361783128);
            for (C21938L2 c21938l2 : content.f7862c) {
                int i16 = AbstractC2526l1.f7845a[c21938l2.f69492c.ordinal()];
                if (i16 == 1) {
                    z6 = false;
                    c6021p3.m6524S(-184381430);
                    C4042e0 c4042e0M4732a = AbstractC4048f0.m4732a(c6021p);
                    c6021p3.m6553p(false);
                    c4042e0 = c4042e0M4732a;
                } else if (i16 == 2) {
                    z6 = false;
                    c6021p3.m6524S(-184378763);
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    C3949M0 c3949m0 = (C3949M0) c6021p3.m6548k(AbstractC3959O0.f12302a);
                    C4042e0 c4042e1 = c3949m0.f12198L;
                    if (c4042e1 == null) {
                        int i17 = AbstractC5264p.f17247a;
                        c4042e1 = new C4042e0(AbstractC3959O0.m4661c(c3949m0, 32), AbstractC3959O0.m4661c(c3949m0, AbstractC5264p.f17249c), C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, AbstractC5264p.f17247a)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, AbstractC5264p.f17248b)));
                        c3949m0.f12198L = c4042e1;
                    }
                    c6021p3.m6553p(false);
                    c4042e0 = c4042e1;
                } else {
                    if (i16 != 3) {
                        c6021p3.m6524S(-184552100);
                        c6021p3.m6553p(false);
                        throw new C0644w();
                    }
                    c6021p3.m6524S(-184375794);
                    C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                    C4042e0 c4042e0M4735d = AbstractC4048f0.m4735d((C3949M0) c6021p3.m6548k(AbstractC3959O0.f12302a));
                    z6 = false;
                    c6021p3.m6553p(false);
                    c4042e0 = c4042e0M4735d;
                }
                c6021p3.m6524S(-184372870);
                boolean zM6545h = c6021p3.m6545h(interfaceC20904w) | ((i14 & 14) == 4 ? true : z6) | c6021p3.m6545h(c21938l2) | c6021p3.m6545h(c8870f2) | c6021p3.m6545h(voiceModeViewModel2);
                Object objM6514H3 = c6021p.m6514H();
                C5975S c5975s3 = c5975s2;
                if (zM6545h || objM6514H3 == c5975s3) {
                    c8870f = c8870f2;
                    voiceModeViewModel = voiceModeViewModel2;
                    c6021p2 = c6021p3;
                    objM6514H3 = new C0523h(interfaceC20904w, content, c21938l2, c8870f, voiceModeViewModel, 2);
                    c6021p2.m6537c0(objM6514H3);
                } else {
                    c8870f = c8870f2;
                    voiceModeViewModel = voiceModeViewModel2;
                    c6021p2 = c6021p3;
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H3;
                c6021p2.m6553p(z6);
                C10456n c10456n3 = c10456n2;
                InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n3, 1.0f);
                c6021p2.m6524S(-184339566);
                boolean zM6545h2 = c6021p2.m6545h(c2925c) | c6021p2.m6545h(interfaceC1436k) | c6021p2.m6542f(interfaceC1426a);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6545h2 || objM6514H4 == c5975s3) {
                    objM6514H4 = new C0155B1(c2925c, interfaceC1436k, interfaceC1426a, 12);
                    c6021p2.m6537c0(objM6514H4);
                }
                c6021p2.m6553p(z6);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H4, interfaceC10459qM11244d, false, null, c4042e0, null, null, null, null, AbstractC8411c.m8969c(1211431284, c6021p2, new C0468O(c21938l2, 7)), c6021p, 805306416, 492);
                c10456n2 = c10456n3;
                c6021p3 = c6021p2;
                i12 = i10;
                interfaceC20904w = interfaceC20904w;
                c8870f2 = c8870f;
                voiceModeViewModel2 = voiceModeViewModel;
                c2925c = c2925c;
                c5975s2 = c5975s3;
            }
            i11 = i12;
            C6021p c6021p4 = c6021p3;
            c6021p4.m6553p(false);
            c6021p4.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(content, interfaceC1436k, i11, 15);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8347g(String str, InterfaceC1426a interfaceC1426a, C4042e0 c4042e0, C6021p c6021p, int i10, int i11) {
        int i12;
        C4042e0 c4042e0M4732a;
        C4042e0 c4042e1;
        c6021p.m6526U(-982319980);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                c4042e0M4732a = c4042e0;
                int i13 = c6021p.m6542f(c4042e0M4732a) ? 256 : 128;
                i12 |= i13;
            } else {
                c4042e0M4732a = c4042e0;
            }
            i12 |= i13;
        } else {
            c4042e0M4732a = c4042e0;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            c4042e1 = c4042e0M4732a;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                c4042e0M4732a = AbstractC4048f0.m4732a(c6021p);
                i12 &= -897;
            }
            C4042e0 c4042e2 = c4042e0M4732a;
            c6021p.m6554q();
            AbstractC3984T1.m4685d(interfaceC1426a, AbstractC10844c.m11257q(C10456n.f30959Y, 0.0f, AbstractC7312p.f23191h, 1), false, null, c4042e2, null, null, AbstractC10842a.m11223a(AbstractC7313q.f23201f, 0.0f, 2), null, AbstractC8411c.m8969c(-1648086908, c6021p, new C3991U3(str, 5)), c6021p, ((i12 >> 3) & 14) | 805306368 | ((i12 << 6) & 57344), 364);
            c4042e1 = c4042e2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(str, interfaceC1426a, c4042e1, i10, i11, 11);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m8348h(C6318J c6318j, int i10, int i11, int i12) {
        AbstractC20800b.m21316d(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        AbstractC7949N4.m8238c(AbstractC7949N4.m8238c(i13, i14), 1 << i12);
        if (c6318j.m6865b() < i10) {
            return -1;
        }
        int iM6872i = c6318j.m6872i(i10);
        if (iM6872i != i13) {
            return iM6872i;
        }
        if (c6318j.m6865b() < i11) {
            return -1;
        }
        int iM6872i2 = c6318j.m6872i(i11);
        int i15 = iM6872i + iM6872i2;
        if (iM6872i2 != i14) {
            return i15;
        }
        if (c6318j.m6865b() < i12) {
            return -1;
        }
        return i15 + c6318j.m6872i(i12);
    }

    /* JADX INFO: renamed from: i */
    public static void m8349i(C6318J c6318j) {
        c6318j.m6883t(3);
        c6318j.m6883t(8);
        boolean zM6871h = c6318j.m6871h();
        boolean zM6871h2 = c6318j.m6871h();
        if (zM6871h) {
            c6318j.m6883t(5);
        }
        if (zM6871h2) {
            c6318j.m6883t(6);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8350j(C6318J c6318j) {
        int iM6872i;
        int iM6872i2 = c6318j.m6872i(2);
        if (iM6872i2 == 0) {
            c6318j.m6883t(6);
            return;
        }
        int iM8348h = m8348h(c6318j, 5, 8, 16) + 1;
        if (iM6872i2 == 1) {
            c6318j.m6883t(iM8348h * 7);
            return;
        }
        if (iM6872i2 == 2) {
            boolean zM6871h = c6318j.m6871h();
            int i10 = zM6871h ? 1 : 5;
            int i11 = zM6871h ? 7 : 5;
            int i12 = zM6871h ? 8 : 6;
            int i13 = 0;
            while (i13 < iM8348h) {
                if (c6318j.m6871h()) {
                    c6318j.m6883t(7);
                    iM6872i = 0;
                } else {
                    if (c6318j.m6872i(2) == 3 && c6318j.m6872i(i11) * i10 != 0) {
                        c6318j.m6882s();
                    }
                    iM6872i = c6318j.m6872i(i12) * i10;
                    if (iM6872i != 0 && iM6872i != 180) {
                        c6318j.m6882s();
                    }
                    c6318j.m6882s();
                }
                if (iM6872i != 0 && iM6872i != 180 && c6318j.m6871h()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m8341a(C21987b0 banner, C8870f appState, InterfaceC1426a onNewChat, InterfaceC1426a onUpsell, InterfaceC1426a onAuthenticate, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        AbstractC16544l.m18094g(banner, "banner");
        AbstractC16544l.m18094g(appState, "appState");
        AbstractC16544l.m18094g(onNewChat, "onNewChat");
        AbstractC16544l.m18094g(onUpsell, "onUpsell");
        AbstractC16544l.m18094g(onAuthenticate, "onAuthenticate");
        c6021p.m6526U(164699090);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(banner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(appState) : c6021p.m6545h(appState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onNewChat) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onUpsell) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onAuthenticate) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
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
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b("", AbstractC8071d5.m8483b(c10456n, 0.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 54, 0, 131068);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            String str = banner.f69610b;
            boolean z10 = str == null || str.length() == 0;
            String strM9890i = banner.f69609a;
            if (!z10) {
                strM9890i = AbstractC9306j0.m9890i(str, bQBnquXS.UgloRUBhwZC, strM9890i);
            }
            m8344d(strM9890i, appState, null, c6021p, (i11 & 112) | 64);
            c6021p.m6524S(2035220026);
            List list = banner.f69612d;
            if (list == null) {
                z6 = false;
            } else {
                z6 = false;
                m8342b(list, banner.f69611c, AbstractC16544l.m18089b(banner.f69614f, Boolean.FALSE), onUpsell, onNewChat, onAuthenticate, c6021p, (i11 & 7168) | (57344 & (i11 << 6)) | ((i11 << 3) & 458752));
            }
            AbstractC3794B0.m4471F(c6021p, z6, true, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(banner, appState, onNewChat, onUpsell, onAuthenticate, i10, 11);
        }
    }
}
