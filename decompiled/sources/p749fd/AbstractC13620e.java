package p749fd;

import af.C10564U;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import me.saket.telephoto.zoomable.AbstractC17239a;
import mm.C17296C;
import mm.C17311n;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0280q;
import p033B5.InterfaceC0832p;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19744u;
import p1051v0.AbstractC20417e;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21073a0;
import p1095x1.InterfaceC21057K;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p339Nf.C5736r;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p482Tg.C7448e;
import p492U1.EnumC7546k;
import p523V9.AbstractC7870D5;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8088f6;
import p525Vb.C8258a;
import p544W9.AbstractC8443A;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p579Xh.InterfaceC9514a;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p858ko.C16484C;
import p858ko.C16486E;
import p858ko.C16497P;
import p858ko.C16510m;
import p878lo.C17105n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17736P;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;

/* JADX INFO: renamed from: fd.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13620e {

    /* JADX INFO: renamed from: a */
    public static final long f43028a = C14365u.f45055e;

    /* JADX INFO: renamed from: b */
    public static final long f43029b = C14365u.m15774b(0.5f, AbstractC14334L.m15626d(4284584694L));

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f43030c = 0;

    /* JADX INFO: renamed from: a */
    public static final void m15141a(String str, String str2, String str3, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object objM9806b;
        String str4;
        C6021p c6021p2;
        boolean z6;
        c6021p.m6526U(-938050292);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23197b);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            long j10 = C14365u.f45052b;
            InterfaceC10459q interfaceC10459qM10921b = AbstractC10443a.m10921b(AbstractC10842a.m11234l(AbstractC10833a.m11206a(interfaceC10459qM11244d, C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.0f, j10)), new C14365u(C14365u.m15774b(0.1f, j10)))), null, 6), AbstractC7313q.f23200e, AbstractC7313q.f23199d), C0280q.f1030t0, new C17736P(3, 4));
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM10921b);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1454843698);
            if (str2 != null) {
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(6), C10444b.f30943v0, c6021p, 6);
                int i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                C17785t0 c17785t0 = C17785t0.f56761a;
                float f10 = 3;
                AbstractC7870D5.m8147a(str2, AbstractC8443A.m9045a(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n, 16), AbstractC20417e.m21079a(f10)), 1, AbstractC7302f.f23131g, AbstractC20417e.m21079a(f10)), c6021p, 0);
                if (str3 == null) {
                    try {
                        objM9806b = Uri.parse(AbstractC7870D5.m8149c(str2)).getHost();
                    } catch (Throwable th2) {
                        objM9806b = AbstractC9233X.m9806b(th2);
                    }
                    if (objM9806b instanceof C17311n) {
                        objM9806b = null;
                    }
                    String str5 = (String) objM9806b;
                    str4 = str5 == null ? str2 : str5;
                } else {
                    str4 = str3;
                }
                AbstractC4124r4.m4768b(str4, c17785t0.m19513a(c10456n, 1.0f, true), AbstractC7302f.f23131g, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 3120, 55288);
                c6021p.m6553p(true);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1454815371);
            if (str == null) {
                z6 = false;
                c6021p2 = c6021p;
            } else {
                AbstractC4124r4.m4768b(str, null, f43028a, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, 384, 3120, 55290);
                c6021p2 = c6021p;
                z6 = false;
            }
            c6021p2.m6553p(z6);
            c6021p2.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 19, str, str2, str3, interfaceC10459q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0255  */
    /* JADX WARN: Code duplicated, block: B:106:0x0289  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x0315  */
    /* JADX WARN: Code duplicated, block: B:121:0x0347  */
    /* JADX WARN: Code duplicated, block: B:122:0x034b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0368  */
    /* JADX WARN: Code duplicated, block: B:130:0x038a  */
    /* JADX WARN: Code duplicated, block: B:133:0x038f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0392  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:142:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x03df  */
    /* JADX WARN: Code duplicated, block: B:152:0x040e  */
    /* JADX WARN: Code duplicated, block: B:157:0x041a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0420  */
    /* JADX WARN: Code duplicated, block: B:161:0x042f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    /* JADX INFO: renamed from: b */
    public static final void m15142b(C13625j c13625j, String assetPointer, String str, String str2, String str3, EnumC13617b mode, InterfaceC1436k onUserInteractingChange, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C21694h c21694h;
        C10843b c10843b;
        Object objM6514H;
        InterfaceC10459q interfaceC10459qM11318d;
        boolean z6;
        int i12;
        boolean zM6545h;
        Object objM6514H2;
        Object obj;
        C5994b0 c5994b0;
        InterfaceC10459q interfaceC10459qM11318d2;
        boolean z10;
        boolean zM6545h2;
        Object objM6514H3;
        Iterator it;
        Object next;
        Object objM19235b;
        InterfaceC9514a interfaceC9514a;
        InterfaceC0832p interfaceC0832pMo3165c;
        boolean zM6542f;
        Object objM6514H4;
        InterfaceC20904w interfaceC20904w;
        InterfaceC20904w interfaceC20904w2;
        boolean z11;
        boolean z12;
        Object objM6514H5;
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        AbstractC16544l.m18094g(mode, "mode");
        AbstractC16544l.m18094g(onUserInteractingChange, "onUserInteractingChange");
        c6021p.m6526U(-1518326656);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c13625j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(assetPointer) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(str2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(str3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(mode) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(onUserInteractingChange) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((i13 & 4793491) != 4793490 || !c6021p.m6562y()) {
            C10456n c10456n = C10456n.f30959Y;
            C16486E c16486e = new C16486E(2, 3.0f);
            c6021p.m6525T(1456098696);
            C16510m c16510m = new C16510m(3);
            Object[] objArr = new Object[0];
            C21585H c21585h = C16484C.f51133q;
            c6021p.m6525T(-223794607);
            boolean zM6544g = c6021p.m6544g(true);
            Object objM6514H6 = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6544g || objM6514H6 == c5975s) {
                objM6514H6 = new C16497P(true);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            C16484C c16484c = (C16484C) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H6, c6021p, 72, 4);
            c16484c.getClass();
            c16484c.f51139f.setValue(c16486e);
            c16484c.f51140g.setValue(c16510m);
            EnumC7546k enumC7546k = (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l);
            AbstractC16544l.m18094g(enumC7546k, "<set-?>");
            c16484c.f51141h.setValue(enumC7546k);
            c6021p.m6553p(false);
            EnumC13617b enumC13617b = EnumC13617b.f43011p0;
            c16484c.f51135b.setValue(Boolean.valueOf(mode == enumC13617b));
            c6021p.m6524S(-858942323);
            Object objM6514H7 = c6021p.m6514H();
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H7 == c5975s) {
                objM6514H7 = C5997d.m6430Q(C13801c.f43585e, c5975s2);
                c6021p.m6537c0(objM6514H7);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H7;
            Object objM530s = AbstractC0168G.m530s(-858940245, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = C5997d.m6428O(0.0f);
                c6021p.m6537c0(objM530s);
            }
            C5994b0 c5994b1 = (C5994b0) objM530s;
            Object objM530s2 = AbstractC0168G.m530s(-858938165, c6021p, false);
            if (objM530s2 == c5975s) {
                objM530s2 = C5997d.m6428O(0.0f);
                c6021p.m6537c0(objM530s2);
            }
            C5994b0 c5994b2 = (C5994b0) objM530s2;
            Object objM530s3 = AbstractC0168G.m530s(-858935895, c6021p, false);
            if (objM530s3 == c5975s) {
                objM530s3 = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                c6021p.m6537c0(objM530s3);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s3;
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w3 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            Object resources = ((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources();
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(fillElement);
            Object obj2 = resources;
            C10451i c10451i = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i14 = c6021p.f19564P;
            C10451i c10451i2 = c10451i;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h2 = C21698j.f68873f;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e);
            C21694h c21694h3 = C21698j.f68872e;
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h4 = C21698j.f68874g;
            if (!c6021p.f19563O) {
                c21694h = c21694h3;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                }
                C21694h c21694h5 = C21698j.f68871d;
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
                c10843b = C10843b.f32509a;
                c6021p.m6524S(-1517163863);
                c6021p.m6524S(-1517170648);
                objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s) {
                    objM6514H = new C10564U(c5994b1, 29);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11318d = AbstractC10868a.m11318d(fillElement, (InterfaceC1436k) objM6514H);
                if (mode != enumC13617b) {
                    C17296C c17296c = C17296C.f55119a;
                    c6021p.m6524S(1213179595);
                    zM6542f = c6021p.m6542f(c16484c) | c6021p.m6545h(c13625j) | c6021p.m6545h(interfaceC20904w3);
                    objM6514H4 = c6021p.m6514H();
                    if (!zM6542f || objM6514H4 == c5975s) {
                        interfaceC20904w = interfaceC20904w3;
                        z6 = false;
                        objM6514H4 = new C13618c(c16484c, c13625j, interfaceC20904w, interfaceC5985X, null);
                        c6021p.m6537c0(objM6514H4);
                    } else {
                        interfaceC20904w = interfaceC20904w3;
                        z6 = false;
                    }
                    c6021p.m6553p(z6);
                    InterfaceC10459q interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM11318d, c17296c, (InterfaceC1439n) objM6514H4);
                    c6021p.m6524S(1213198800);
                    interfaceC20904w2 = interfaceC20904w;
                    boolean zM6542f2 = c6021p.m6542f(c16484c) | c6021p.m6545h(c13625j) | c6021p.m6545h(interfaceC20904w2);
                    if ((i13 & 3670016) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = z6;
                    }
                    z12 = zM6542f2 | z11;
                    objM6514H5 = c6021p.m6514H();
                    if (z12 || objM6514H5 == c5975s) {
                        Object c13619d = new C13619d(c16484c, c13625j, interfaceC20904w2, onUserInteractingChange, interfaceC5985X, interfaceC5985X2, null);
                        c6021p.m6537c0(c13619d);
                        objM6514H5 = c13619d;
                    }
                    c6021p.m6553p(z6);
                    interfaceC10459qM11318d = AbstractC19744u.m20694b(interfaceC10459qM20694b, c17296c, (InterfaceC1439n) objM6514H5);
                } else {
                    c5994b1 = c5994b1;
                    c21694h4 = c21694h4;
                    c16484c = c16484c;
                    c5975s = c5975s;
                    c5994b2 = c5994b2;
                    obj2 = obj2;
                    c10451i2 = c10451i2;
                    c10843b = c10843b;
                    z6 = false;
                }
                c6021p.m6553p(z6);
                InterfaceC10459q interfaceC10459qM18968a = AbstractC17239a.m18968a(interfaceC10459qM11318d, c16484c);
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i2, z6);
                i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM18968a);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e2);
                C5997d.m6439Z(c21694h, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                }
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
                C10843b c10843b2 = c10843b;
                InterfaceC10459q interfaceC10459qM11240a = c10843b2.m11240a(c10456n, C10444b.f30938q0);
                c6021p.m6524S(1213253331);
                zM6545h = c6021p.m6545h(c13625j);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    obj = c5975s;
                } else {
                    obj = c5975s;
                    if (objM6514H2 == obj) {
                        c5994b0 = c5994b2;
                    }
                    c6021p.m6553p(z6);
                    interfaceC10459qM11318d2 = AbstractC10868a.m11318d(interfaceC10459qM11240a, (InterfaceC1436k) objM6514H2);
                    if (c5994b0.m6409g() > c5994b1.m6409g()) {
                        interfaceC10459qM11318d2 = AbstractC10844c.m11244d(interfaceC10459qM11318d2, 1.0f);
                    }
                    c6021p.m6524S(1213272536);
                    if ((i13 & 458752) == 131072) {
                        z10 = true;
                    } else {
                        z10 = z6;
                    }
                    zM6545h2 = z10 | c6021p.m6545h(c13625j);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H3 == obj) {
                        objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(z6);
                    InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(interfaceC10459qM11318d2, (InterfaceC1436k) objM6514H3);
                    c6021p.m6524S(617413469);
                    it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(next instanceof InterfaceC9514a));
                    if (next != null) {
                        objM19235b = (InterfaceC9514a) next;
                        c6021p.m6553p(z6);
                    } else {
                        objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                        c6021p.m6553p(z6);
                    }
                    interfaceC9514a = (InterfaceC9514a) objM19235b;
                    if (interfaceC9514a != null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                        throw new IllegalStateException("No ImageLoader");
                    }
                    c6021p.m6524S(1213284646);
                    Object obj3 = obj2;
                    boolean zM6545h3 = c6021p.m6545h(c13625j) | c6021p.m6545h(obj3);
                    Object objM6514H8 = c6021p.m6514H();
                    if (zM6545h3 || objM6514H8 == obj) {
                        objM6514H8 = new C8847i(c13625j, 26, obj3);
                        c6021p.m6537c0(objM6514H8);
                    }
                    c6021p.m6553p(z6);
                    AbstractC7881F0.m8163b(assetPointer, null, interfaceC0832pMo3165c, interfaceC10459qM11297c, null, null, null, null, (InterfaceC1436k) objM6514H8, null, null, null, c6021p, 48, 0, 65264);
                    c6021p.m6553p(true);
                    m15141a(str, str2, str3, c10843b2.m11240a(c10456n, C10444b.f30941t0), c6021p, (i13 >> 6) & 1022);
                    c6021p.m6553p(true);
                }
                c5994b0 = c5994b2;
                objM6514H2 = new C7448e(c13625j, interfaceC5985X, c5994b0, 22);
                c6021p.m6537c0(objM6514H2);
                c6021p.m6553p(z6);
                interfaceC10459qM11318d2 = AbstractC10868a.m11318d(interfaceC10459qM11240a, (InterfaceC1436k) objM6514H2);
                if (c5994b0.m6409g() > c5994b1.m6409g()) {
                    interfaceC10459qM11318d2 = AbstractC10844c.m11244d(interfaceC10459qM11318d2, 1.0f);
                }
                c6021p.m6524S(1213272536);
                if ((i13 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = z6;
                }
                zM6545h2 = z10 | c6021p.m6545h(c13625j);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(z6);
                InterfaceC10459q interfaceC10459qM11297c2 = AbstractC10861a.m11297c(interfaceC10459qM11318d2, (InterfaceC1436k) objM6514H3);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(z6);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(z6);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null) {
                }
                throw new IllegalStateException("No ImageLoader");
            }
            c21694h = c21694h3;
            AbstractC0168G.m537z(i14, c6021p, i14, c21694h4);
            C21694h c21694h6 = C21698j.f68871d;
            C5997d.m6439Z(c21694h6, c6021p, interfaceC10459qM10923d);
            c10843b = C10843b.f32509a;
            c6021p.m6524S(-1517163863);
            c6021p.m6524S(-1517170648);
            objM6514H = c6021p.m6514H();
            if (objM6514H == c5975s) {
                objM6514H = new C10564U(c5994b1, 29);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            interfaceC10459qM11318d = AbstractC10868a.m11318d(fillElement, (InterfaceC1436k) objM6514H);
            if (mode != enumC13617b) {
                C17296C c17296c2 = C17296C.f55119a;
                c6021p.m6524S(1213179595);
                zM6542f = c6021p.m6542f(c16484c) | c6021p.m6545h(c13625j) | c6021p.m6545h(interfaceC20904w3);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f) {
                    interfaceC20904w = interfaceC20904w3;
                    z6 = false;
                    objM6514H4 = new C13618c(c16484c, c13625j, interfaceC20904w, interfaceC5985X, null);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    interfaceC20904w = interfaceC20904w3;
                    z6 = false;
                    objM6514H4 = new C13618c(c16484c, c13625j, interfaceC20904w, interfaceC5985X, null);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(z6);
                InterfaceC10459q interfaceC10459qM20694b2 = AbstractC19744u.m20694b(interfaceC10459qM11318d, c17296c2, (InterfaceC1439n) objM6514H4);
                c6021p.m6524S(1213198800);
                interfaceC20904w2 = interfaceC20904w;
                boolean zM6542f3 = c6021p.m6542f(c16484c) | c6021p.m6545h(c13625j) | c6021p.m6545h(interfaceC20904w2);
                if ((i13 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = z6;
                }
                z12 = zM6542f3 | z11;
                objM6514H5 = c6021p.m6514H();
                if (z12) {
                    Object c13619d2 = new C13619d(c16484c, c13625j, interfaceC20904w2, onUserInteractingChange, interfaceC5985X, interfaceC5985X2, null);
                    c6021p.m6537c0(c13619d2);
                    objM6514H5 = c13619d2;
                } else {
                    Object c13619d3 = new C13619d(c16484c, c13625j, interfaceC20904w2, onUserInteractingChange, interfaceC5985X, interfaceC5985X2, null);
                    c6021p.m6537c0(c13619d3);
                    objM6514H5 = c13619d3;
                }
                c6021p.m6553p(z6);
                interfaceC10459qM11318d = AbstractC19744u.m20694b(interfaceC10459qM20694b2, c17296c2, (InterfaceC1439n) objM6514H5);
            } else {
                c5994b1 = c5994b1;
                c21694h4 = c21694h4;
                c16484c = c16484c;
                c5975s = c5975s;
                c5994b2 = c5994b2;
                obj2 = obj2;
                c10451i2 = c10451i2;
                c10843b = c10843b;
                z6 = false;
            }
            c6021p.m6553p(z6);
            InterfaceC10459q interfaceC10459qM18968a2 = AbstractC17239a.m18968a(interfaceC10459qM11318d, c16484c);
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i2, z6);
            i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM18968a2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e3);
            C5997d.m6439Z(c21694h, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            } else {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            }
            C5997d.m6439Z(c21694h6, c6021p, interfaceC10459qM10923d3);
            C10843b c10843b3 = c10843b;
            InterfaceC10459q interfaceC10459qM11240a2 = c10843b3.m11240a(c10456n, C10444b.f30938q0);
            c6021p.m6524S(1213253331);
            zM6545h = c6021p.m6545h(c13625j);
            objM6514H2 = c6021p.m6514H();
            if (zM6545h) {
                obj = c5975s;
                if (objM6514H2 == obj) {
                    c5994b0 = c5994b2;
                }
                c6021p.m6553p(z6);
                interfaceC10459qM11318d2 = AbstractC10868a.m11318d(interfaceC10459qM11240a2, (InterfaceC1436k) objM6514H2);
                if (c5994b0.m6409g() > c5994b1.m6409g()) {
                    interfaceC10459qM11318d2 = AbstractC10844c.m11244d(interfaceC10459qM11318d2, 1.0f);
                }
                c6021p.m6524S(1213272536);
                if ((i13 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = z6;
                }
                zM6545h2 = z10 | c6021p.m6545h(c13625j);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(z6);
                InterfaceC10459q interfaceC10459qM11297c3 = AbstractC10861a.m11297c(interfaceC10459qM11318d2, (InterfaceC1436k) objM6514H3);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(z6);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(z6);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null) {
                }
                throw new IllegalStateException("No ImageLoader");
            }
            obj = c5975s;
            c5994b0 = c5994b2;
            objM6514H2 = new C7448e(c13625j, interfaceC5985X, c5994b0, 22);
            c6021p.m6537c0(objM6514H2);
            c6021p.m6553p(z6);
            interfaceC10459qM11318d2 = AbstractC10868a.m11318d(interfaceC10459qM11240a2, (InterfaceC1436k) objM6514H2);
            if (c5994b0.m6409g() > c5994b1.m6409g()) {
                interfaceC10459qM11318d2 = AbstractC10844c.m11244d(interfaceC10459qM11318d2, 1.0f);
            }
            c6021p.m6524S(1213272536);
            if ((i13 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = z6;
            }
            zM6545h2 = z10 | c6021p.m6545h(c13625j);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C7448e(mode, c13625j, interfaceC5985X2, 23);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(z6);
            InterfaceC10459q interfaceC10459qM11297c4 = AbstractC10861a.m11297c(interfaceC10459qM11318d2, (InterfaceC1436k) objM6514H3);
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(z6);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(z6);
            }
            interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a != null) {
            }
            throw new IllegalStateException("No ImageLoader");
        }
        c6021p.m6517L();
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5736r(c13625j, assetPointer, str, str2, str3, mode, onUserInteractingChange, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m15143c(long j10, C13801c c13801c, C16484C c16484c) {
        C17105n c17105n = c16484c.m18054g().f54661c;
        float fM15306g = C13800b.m15306g(j10);
        C5944C c5944c = c16484c.f51147n;
        float f10 = fM15306g - ((C13801c) c5944c.getValue()).f43586a;
        float f11 = c17105n.f54658b;
        return AbstractC8088f6.m8536b((f10 / f11) - c13801c.f43586a, ((C13800b.m15307h(j10) - ((C13801c) c5944c.getValue()).f43587b) / f11) - c13801c.f43587b);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15144d(long j10, C13801c c13801c, C16484C c16484c) {
        float fM21556b = AbstractC21073a0.m21556b(c16484c.m18054g().f54660b);
        float fM15306g = C13800b.m15306g(c16484c.m18054g().f54662d);
        float fM15307h = C13800b.m15307h(c16484c.m18054g().f54662d);
        float f10 = (c13801c.f43586a * fM21556b) + fM15306g;
        float f11 = (c13801c.f43587b * fM21556b) + fM15307h;
        float f12 = (c13801c.f43588c * fM21556b) + fM15306g;
        float f13 = (c13801c.f43589d * fM21556b) + fM15307h;
        float fM15306g2 = C13800b.m15306g(j10);
        return f10 <= fM15306g2 && fM15306g2 <= f12 && C13800b.m15307h(j10) >= f11 && C13800b.m15307h(j10) <= f13;
    }
}
