package p523V9;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import cd.C11709i;
import com.openai.chatgpt.R;
import ge.C14089m0;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p039Bc.C0886t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p1062vd.AbstractC20554e;
import p1062vd.C20541V;
import p1062vd.C20549b0;
import p1062vd.C20567q;
import p1062vd.C20569s;
import p1062vd.C20571u;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21891A;
import p1155zi.C22013h2;
import p1155zi.C22038o;
import p1155zi.C22050r;
import p1155zi.C22062u;
import p124Ei.C2466N;
import p124Ei.C2473Q0;
import p169Gf.C3047k;
import p179H0.AbstractC3189g;
import p179H0.C3196n;
import p193Hf.C3363f1;
import p194Hg.C3425e;
import p204I1.C3582M;
import p204I1.C3590f;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3890C1;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p246Ji.C4368h;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p406Qg.C6728x;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p482Tg.C7444b;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9262b4;
import p594Y9.AbstractC9745I3;
import p594Y9.AbstractC9746I4;
import p620Zc.InterfaceC10277b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p705dd.C13071d;
import p706df.C13101u;
import p736f0.AbstractC13508z;
import p773h0.InterfaceC14267W;
import p842k0.C16299h;
import p870le.C16886i0;
import p895n1.C17425e;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17790w;
import p951pp.AbstractC18539i;

/* JADX INFO: renamed from: V9.c5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8063c5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25374a;

    /* JADX INFO: renamed from: a */
    public static final void m8458a(C20549b0 c20549b0, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, float f10, C6021p c6021p, int i10) {
        int i11;
        int i12;
        boolean z6;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(1520405503);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c20549b0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6536c(f10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-388581541);
            int i13 = i11 & 112;
            boolean z10 = i13 == 32;
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (z10 || objM6514H == c5975s) {
                objM6514H = new C16886i0(16, onIntent);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C3196n c3196nM8541g = AbstractC8088f6.m8541g(c20549b0.f65210b, (InterfaceC1426a) objM6514H, c6021p);
            InterfaceC10459q interfaceC10459qM8507b = AbstractC8080e6.m8507b(interfaceC10459q, c3196nM8541g);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM8507b);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            FillElement fillElement = AbstractC10844c.f32512c;
            c6021p.m6524S(-1252029042);
            if ((i11 & 14) == 4) {
                i12 = 32;
                z6 = true;
            } else {
                i12 = 32;
                z6 = false;
            }
            boolean z11 = ((i11 & 7168) == 2048) | (i13 == i12) | z6;
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == c5975s) {
                objM6514H2 = new C3363f1(c20549b0, onIntent, f10, 4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(fillElement, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H2, c6021p, 6, 254);
            AbstractC3189g.m4035a(c20549b0.f65210b, c3196nM8541g, c10843b.m11240a(c10456n, C10444b.f30935Z), 0L, 0L, false, c6021p, 64);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4368h(c20549b0, onIntent, interfaceC10459q, f10, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8459b(C20571u item, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        int i12;
        int i13;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(item, "item");
        c6021p.m6526U(1002724735);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(item) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if (((i11 | 384) & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1926877668);
            if (!z6) {
                AbstractC3984T1.m4692k(AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0.0f, 0L, c6021p, 0, 6);
            }
            c6021p.m6553p(false);
            int iOrdinal = item.f65298a.ordinal();
            if (iOrdinal == 0) {
                i12 = 1926887843;
                i13 = R.string.conversations_history_label;
            } else if (iOrdinal == 1) {
                i12 = 1926891104;
                i13 = R.string.conversations_gpts_label;
            } else {
                if (iOrdinal != 2) {
                    c6021p.m6524S(1926526639);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                i12 = 1926894313;
                i13 = R.string.conversations_snorlax_label;
            }
            AbstractC9745I3.m10335a(AbstractC17792x.m19533p(c6021p, i12, i13, c6021p, false), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, c6021p, 0, 2);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(item, z6, interfaceC10459q2, i10, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x0206  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    /* JADX INFO: renamed from: c */
    public static final void m8460c(C20541V item, InterfaceC1436k onClick, InterfaceC1436k onLongPress, InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, boolean z11, boolean z12, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM6514H;
        C5975S c5975s;
        C8410b c8410bM8969c;
        boolean z20;
        InterfaceC10459q interfaceC10459qM9836a;
        InterfaceC10459q interfaceC10459qM11210e;
        boolean z21;
        boolean z22;
        boolean z23;
        InterfaceC10459q interfaceC10459q2;
        boolean z24;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(item, "item");
        AbstractC16544l.m18094g(onClick, "onClick");
        AbstractC16544l.m18094g(onLongPress, "onLongPress");
        c6021p.m6526U(-234939171);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(item) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(onLongPress) ? 256 : 128;
        }
        int i19 = i12 | 3072;
        int i20 = i11 & 16;
        if (i20 == 0) {
            if ((i10 & 24576) == 0) {
                i19 |= c6021p.m6544g(z6) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z10;
                    if (c6021p.m6544g(z13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i19 |= i14;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z11;
                        if (c6021p.m6544g(z14)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i19 |= i16;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i19 |= 12582912;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i10 & 12582912) == 0) {
                            if (c6021p.m6544g(z15)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i19 |= i18;
                        }
                    }
                    if ((i19 & 4793491) == 4793490 || !c6021p.m6562y()) {
                        C10456n c10456n = C10456n.f30959Y;
                        if (i20 != 0) {
                            z16 = false;
                        } else {
                            z16 = z6;
                        }
                        if (i13 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if (i15 != 0) {
                            z18 = false;
                        } else {
                            z18 = z14;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z15;
                        }
                        InterfaceC10277b interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
                        c6021p.m6524S(-1182518326);
                        objM6514H = c6021p.m6514H();
                        c5975s = C6013l.f19514a;
                        if (objM6514H == c5975s) {
                            objM6514H = new C7299c();
                            c6021p.m6537c0(objM6514H);
                        }
                        C7299c c7299c = (C7299c) objM6514H;
                        c6021p.m6553p(false);
                        C3890C1 c3890c1M8469l = m8469l(item.f65172d, c6021p);
                        c6021p.m6524S(-1182442249);
                        if (z19) {
                            c8410bM8969c = null;
                        } else {
                            c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                        }
                        c6021p.m6553p(false);
                        c6021p.m6524S(-1182434439);
                        if (!z17 || z18) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n, z20);
                        if (!z16 || z17 || z18) {
                            interfaceC10459qM11210e = interfaceC10459qM9836a;
                        } else {
                            InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p.m6548k(AbstractC10839g.f32446a);
                            c6021p.m6524S(2102248612);
                            boolean zM6545h = ((i19 & 896) == 256) | c6021p.m6545h(interfaceC10277bM19906b);
                            Object objM6514H2 = c6021p.m6514H();
                            if (zM6545h || objM6514H2 == c5975s) {
                                objM6514H2 = new C15272c(c7299c, interfaceC10277bM19906b, onLongPress, 26);
                                c6021p.m6537c0(objM6514H2);
                            }
                            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                            c6021p.m6553p(false);
                            c6021p.m6524S(2102243853);
                            boolean z25 = (i19 & 112) == 32;
                            Object objM6514H3 = c6021p.m6514H();
                            if (z25 || objM6514H3 == c5975s) {
                                objM6514H3 = new C2466N(onClick, c7299c, 1);
                                c6021p.m6537c0(objM6514H3);
                            }
                            c6021p.m6553p(false);
                            interfaceC10459qM11210e = AbstractC10833a.m11210e(interfaceC10459qM9836a, c7299c, interfaceC14267W, false, interfaceC1426a, (InterfaceC1426a) objM6514H3, 188);
                        }
                        c6021p.m6553p(false);
                        boolean z26 = z16;
                        AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l, 0.0f, 0.0f, c6021p, 6, 436);
                        z21 = z17;
                        z22 = z18;
                        z23 = z19;
                        interfaceC10459q2 = c10456n;
                        z24 = z26;
                    } else {
                        c6021p.m6517L();
                        interfaceC10459q2 = interfaceC10459q;
                        z24 = z6;
                        z23 = z15;
                        z21 = z13;
                        z22 = z14;
                    }
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
                    }
                }
                i19 |= 1572864;
                z14 = z11;
                i17 = i11 & 128;
                if (i17 != 0) {
                    i19 |= 12582912;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 12582912) == 0) {
                        if (c6021p.m6544g(z15)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i19 |= i18;
                    }
                }
                if ((i19 & 4793491) == 4793490) {
                    C10456n c10456n2 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b2 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c2 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l2 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n2, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z27 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l2, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n2;
                    z24 = z27;
                } else {
                    C10456n c10456n3 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b3 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c3 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l3 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n3, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z28 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l3, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n3;
                    z24 = z28;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
                }
            }
            i19 |= 196608;
            z13 = z10;
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z11;
                    if (c6021p.m6544g(z14)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i19 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i19 |= 12582912;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 12582912) == 0) {
                        if (c6021p.m6544g(z15)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i19 |= i18;
                    }
                }
                if ((i19 & 4793491) == 4793490) {
                    C10456n c10456n4 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b4 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c4 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l4 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n4, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z29 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l4, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n4;
                    z24 = z29;
                } else {
                    C10456n c10456n5 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b5 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c5 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l5 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n5, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z210 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l5, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n5;
                    z24 = z210;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
                }
            }
            i19 |= 1572864;
            z14 = z11;
            i17 = i11 & 128;
            if (i17 != 0) {
                i19 |= 12582912;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 12582912) == 0) {
                    if (c6021p.m6544g(z15)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i19 |= i18;
                }
            }
            if ((i19 & 4793491) == 4793490) {
                C10456n c10456n6 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b6 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c6 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l6 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n6, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z211 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l6, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n6;
                z24 = z211;
            } else {
                C10456n c10456n7 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b7 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c7 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l7 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n7, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z212 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l7, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n7;
                z24 = z212;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
            }
        }
        i19 = i12 | 27648;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                z13 = z10;
                if (c6021p.m6544g(z13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i19 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z11;
                    if (c6021p.m6544g(z14)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i19 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i19 |= 12582912;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 12582912) == 0) {
                        if (c6021p.m6544g(z15)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i19 |= i18;
                    }
                }
                if ((i19 & 4793491) == 4793490) {
                    C10456n c10456n8 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b8 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c8 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l8 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n8, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z213 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l8, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n8;
                    z24 = z213;
                } else {
                    C10456n c10456n9 = C10456n.f30959Y;
                    if (i20 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i13 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if (i15 != 0) {
                        z18 = false;
                    } else {
                        z18 = z14;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z15;
                    }
                    InterfaceC10277b interfaceC10277bM19906b9 = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1182518326);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = new C7299c();
                        c6021p.m6537c0(objM6514H);
                    }
                    C7299c c7299c9 = (C7299c) objM6514H;
                    c6021p.m6553p(false);
                    C3890C1 c3890c1M8469l9 = m8469l(item.f65172d, c6021p);
                    c6021p.m6524S(-1182442249);
                    if (z19) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                    }
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1182434439);
                    if (z17) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n9, z20);
                    if (z16) {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    } else {
                        interfaceC10459qM11210e = interfaceC10459qM9836a;
                    }
                    c6021p.m6553p(false);
                    boolean z214 = z16;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l9, 0.0f, 0.0f, c6021p, 6, 436);
                    z21 = z17;
                    z22 = z18;
                    z23 = z19;
                    interfaceC10459q2 = c10456n9;
                    z24 = z214;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
                }
            }
            i19 |= 1572864;
            z14 = z11;
            i17 = i11 & 128;
            if (i17 != 0) {
                i19 |= 12582912;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 12582912) == 0) {
                    if (c6021p.m6544g(z15)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i19 |= i18;
                }
            }
            if ((i19 & 4793491) == 4793490) {
                C10456n c10456n10 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b10 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c10 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l10 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n10, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z215 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l10, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n10;
                z24 = z215;
            } else {
                C10456n c10456n11 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b11 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c11 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l11 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n11, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z216 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l11, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n11;
                z24 = z216;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
            }
        }
        i19 |= 196608;
        z13 = z10;
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((1572864 & i10) == 0) {
                z14 = z11;
                if (c6021p.m6544g(z14)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i19 |= i16;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i19 |= 12582912;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 12582912) == 0) {
                    if (c6021p.m6544g(z15)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i19 |= i18;
                }
            }
            if ((i19 & 4793491) == 4793490) {
                C10456n c10456n12 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b12 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c12 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l12 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n12, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z217 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l12, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n12;
                z24 = z217;
            } else {
                C10456n c10456n13 = C10456n.f30959Y;
                if (i20 != 0) {
                    z16 = false;
                } else {
                    z16 = z6;
                }
                if (i13 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i15 != 0) {
                    z18 = false;
                } else {
                    z18 = z14;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z15;
                }
                InterfaceC10277b interfaceC10277bM19906b13 = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1182518326);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C7299c();
                    c6021p.m6537c0(objM6514H);
                }
                C7299c c7299c13 = (C7299c) objM6514H;
                c6021p.m6553p(false);
                C3890C1 c3890c1M8469l13 = m8469l(item.f65172d, c6021p);
                c6021p.m6524S(-1182442249);
                if (z19) {
                    c8410bM8969c = null;
                } else {
                    c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1182434439);
                if (z17) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n13, z20);
                if (z16) {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                } else {
                    interfaceC10459qM11210e = interfaceC10459qM9836a;
                }
                c6021p.m6553p(false);
                boolean z218 = z16;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l13, 0.0f, 0.0f, c6021p, 6, 436);
                z21 = z17;
                z22 = z18;
                z23 = z19;
                interfaceC10459q2 = c10456n13;
                z24 = z218;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
            }
        }
        i19 |= 1572864;
        z14 = z11;
        i17 = i11 & 128;
        if (i17 != 0) {
            i19 |= 12582912;
            z15 = z12;
        } else {
            z15 = z12;
            if ((i10 & 12582912) == 0) {
                if (c6021p.m6544g(z15)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i19 |= i18;
            }
        }
        if ((i19 & 4793491) == 4793490) {
            C10456n c10456n14 = C10456n.f30959Y;
            if (i20 != 0) {
                z16 = false;
            } else {
                z16 = z6;
            }
            if (i13 != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if (i15 != 0) {
                z18 = false;
            } else {
                z18 = z14;
            }
            if (i17 != 0) {
                z19 = false;
            } else {
                z19 = z15;
            }
            InterfaceC10277b interfaceC10277bM19906b14 = AbstractC18539i.m19906b(c6021p);
            c6021p.m6524S(-1182518326);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C7299c();
                c6021p.m6537c0(objM6514H);
            }
            C7299c c7299c14 = (C7299c) objM6514H;
            c6021p.m6553p(false);
            C3890C1 c3890c1M8469l14 = m8469l(item.f65172d, c6021p);
            c6021p.m6524S(-1182442249);
            if (z19) {
                c8410bM8969c = null;
            } else {
                c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1182434439);
            if (z17) {
                z20 = true;
            } else {
                z20 = true;
            }
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n14, z20);
            if (z16) {
                interfaceC10459qM11210e = interfaceC10459qM9836a;
            } else {
                interfaceC10459qM11210e = interfaceC10459qM9836a;
            }
            c6021p.m6553p(false);
            boolean z219 = z16;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l14, 0.0f, 0.0f, c6021p, 6, 436);
            z21 = z17;
            z22 = z18;
            z23 = z19;
            interfaceC10459q2 = c10456n14;
            z24 = z219;
        } else {
            C10456n c10456n15 = C10456n.f30959Y;
            if (i20 != 0) {
                z16 = false;
            } else {
                z16 = z6;
            }
            if (i13 != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if (i15 != 0) {
                z18 = false;
            } else {
                z18 = z14;
            }
            if (i17 != 0) {
                z19 = false;
            } else {
                z19 = z15;
            }
            InterfaceC10277b interfaceC10277bM19906b15 = AbstractC18539i.m19906b(c6021p);
            c6021p.m6524S(-1182518326);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C7299c();
                c6021p.m6537c0(objM6514H);
            }
            C7299c c7299c15 = (C7299c) objM6514H;
            c6021p.m6553p(false);
            C3890C1 c3890c1M8469l15 = m8469l(item.f65172d, c6021p);
            c6021p.m6524S(-1182442249);
            if (z19) {
                c8410bM8969c = null;
            } else {
                c8410bM8969c = AbstractC8411c.m8969c(1025811750, c6021p, new C20567q(item, 0));
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1182434439);
            if (z17) {
                z20 = true;
            } else {
                z20 = true;
            }
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(c10456n15, z20);
            if (z16) {
                interfaceC10459qM11210e = interfaceC10459qM9836a;
            } else {
                interfaceC10459qM11210e = interfaceC10459qM9836a;
            }
            c6021p.m6553p(false);
            boolean z2110 = z16;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1053806271, c6021p, new C3425e(item, z16, 2)), interfaceC10459qM11210e, null, c8410bM8969c, null, null, c3890c1M8469l15, 0.0f, 0.0f, c6021p, 6, 436);
            z21 = z17;
            z22 = z18;
            z23 = z19;
            interfaceC10459q2 = c10456n15;
            z24 = z2110;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20569s(item, onClick, onLongPress, interfaceC10459q2, z24, z21, z22, z23, i10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8461d(int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q, boolean z6) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1842568458);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C3890C1 c3890c1M8469l = m8469l(z6, c6021p);
            c6021p.m6524S(1866041976);
            boolean z10 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C16886i0(13, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC20554e.f65250h, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC20554e.f65251i, null, c3890c1M8469l, 0.0f, 0.0f, c6021p, 24582, 428);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6728x(interfaceC1436k, z6, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8462e(int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1157670747);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(1324097865);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C16886i0(14, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC20554e.f65252j, AbstractC10833a.m11209d(interfaceC10459q2, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC20554e.f65253k, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(interfaceC1436k, interfaceC10459q2, i10, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX INFO: renamed from: f */
    public static final void m8463f(C20263a0 c20263a0, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C5975S c5975s;
        boolean z11;
        Object objM6514H;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-602524593);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c20263a0) : c6021p.m6545h(c20263a0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-450713629);
            Object objM6514H2 = c6021p.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            if (objM6514H2 == c5975s2) {
                objM6514H2 = new C11709i(null, 3);
                c6021p.m6537c0(objM6514H2);
            }
            C11709i c11709i = (C11709i) objM6514H2;
            Object objM530s = AbstractC0168G.m530s(-450711633, c6021p, false);
            if (objM530s == c5975s2) {
                objM530s = new C7299c();
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(false);
            AbstractC10831a.m11201d(z10, null, AbstractC13508z.m15013e(null, 3).m14995a(AbstractC13508z.m15012d(null, 15)), AbstractC13508z.m15014f(null, 3).m14996a(AbstractC13508z.m15020l(null, 15)), null, AbstractC8411c.m8969c(1658791597, c6021p, new C16299h(z6, (C7299c) objM530s, c11709i, interfaceC1436k, c20263a0)), c6021p, ((i12 >> 6) & 14) | 200064, 18);
            c6021p.m6524S(-450666354);
            int i14 = i12 & 7168;
            boolean z12 = i14 == 2048;
            Object objM6514H3 = c6021p.m6514H();
            if (z12) {
                c5975s = c5975s2;
            } else {
                c5975s = c5975s2;
                if (objM6514H3 == c5975s) {
                }
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-450664304);
                if (i14 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z11 || objM6514H == c5975s) {
                    objM6514H = new C14089m0(13, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC8055b5.m8448a(c11709i, c20263a0, interfaceC1436k2, (InterfaceC1436k) objM6514H, null, c6021p, 64 | ((i12 << 3) & 112));
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n;
            }
            objM6514H3 = new C14089m0(12, interfaceC1436k);
            c6021p.m6537c0(objM6514H3);
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-450664304);
            if (i14 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z11) {
                objM6514H = new C14089m0(13, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C14089m0(13, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8055b5.m8448a(c11709i, c20263a0, interfaceC1436k3, (InterfaceC1436k) objM6514H, null, c6021p, 64 | ((i12 << 3) & 112));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13101u(c20263a0, z6, z10, interfaceC1436k, interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8464g(String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1151758966);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (!AbstractC21322p.m21681O(str)) {
                AbstractC4124r4.m4768b(str, AbstractC10844c.m11244d(c10456n, 1.0f), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, C3582M.m4274b((C3582M) c6021p.m6548k(AbstractC4124r4.f13310a), 0L, 0L, null, null, 0L, null, 0, 3, 0L, null, null, 16711679), c6021p, i12 & 14, 3072, 57336);
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7444b(str, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8465h(int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-2063687241);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(2144874859);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C16886i0(17, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC20554e.f65254l, AbstractC10833a.m11209d(interfaceC10459q2, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC20554e.f65255m, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(interfaceC1436k, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m8466i(int i10, int i11, int i12, int i13, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        InterfaceC10459q interfaceC10459q2;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(67115025);
        if ((i12 & 6) == 0) {
            i14 = (c6021p.m6542f(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i21 = i14 | 48;
        int i22 = i13 & 4;
        if (i22 == 0) {
            if ((i12 & 384) == 0) {
                i15 = i10;
                i21 |= c6021p.m6538d(i15) ? 256 : 128;
            }
            i16 = i13 & 8;
            if (i16 != 0) {
                if ((i12 & 3072) == 0) {
                    i17 = i11;
                    if (c6021p.m6538d(i17)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i21 |= i18;
                }
                if ((i21 & 1171) == 1170 || !c6021p.m6562y()) {
                    C10456n c10456n = C10456n.f30959Y;
                    if (i22 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i16 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i17;
                    }
                    AbstractC4124r4.m4768b(str, c10456n, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
                    i20 = i15;
                    interfaceC10459q2 = c10456n;
                } else {
                    c6021p.m6517L();
                    i20 = i15;
                    i19 = i17;
                    interfaceC10459q2 = interfaceC10459q;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3047k(str, interfaceC10459q2, i20, i19, i12, i13);
                }
            }
            i21 |= 3072;
            i17 = i11;
            if ((i21 & 1171) == 1170) {
                C10456n c10456n2 = C10456n.f30959Y;
                if (i22 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i16 != 0) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                AbstractC4124r4.m4768b(str, c10456n2, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
                i20 = i15;
                interfaceC10459q2 = c10456n2;
            } else {
                C10456n c10456n3 = C10456n.f30959Y;
                if (i22 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i16 != 0) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                AbstractC4124r4.m4768b(str, c10456n3, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
                i20 = i15;
                interfaceC10459q2 = c10456n3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3047k(str, interfaceC10459q2, i20, i19, i12, i13);
            }
        }
        i21 = i14 | 432;
        i15 = i10;
        i16 = i13 & 8;
        if (i16 != 0) {
            if ((i12 & 3072) == 0) {
                i17 = i11;
                if (c6021p.m6538d(i17)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i21 |= i18;
            }
            if ((i21 & 1171) == 1170) {
                C10456n c10456n4 = C10456n.f30959Y;
                if (i22 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i16 != 0) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                AbstractC4124r4.m4768b(str, c10456n4, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
                i20 = i15;
                interfaceC10459q2 = c10456n4;
            } else {
                C10456n c10456n5 = C10456n.f30959Y;
                if (i22 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i16 != 0) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                AbstractC4124r4.m4768b(str, c10456n5, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
                i20 = i15;
                interfaceC10459q2 = c10456n5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3047k(str, interfaceC10459q2, i20, i19, i12, i13);
            }
        }
        i21 |= 3072;
        i17 = i11;
        if ((i21 & 1171) == 1170) {
            C10456n c10456n6 = C10456n.f30959Y;
            if (i22 != 0) {
                i15 = Integer.MAX_VALUE;
            }
            if (i16 != 0) {
                i19 = 1;
            } else {
                i19 = i17;
            }
            AbstractC4124r4.m4768b(str, c10456n6, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
            i20 = i15;
            interfaceC10459q2 = c10456n6;
        } else {
            C10456n c10456n7 = C10456n.f30959Y;
            if (i22 != 0) {
                i15 = Integer.MAX_VALUE;
            }
            if (i16 != 0) {
                i19 = 1;
            } else {
                i19 = i17;
            }
            AbstractC4124r4.m4768b(str, c10456n7, 0L, 0L, null, null, null, 0L, null, null, 0L, i19, false, i15, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, i21 & 126, ((i21 >> 6) & 112) | ((i21 << 3) & 7168), 55292);
            i20 = i15;
            interfaceC10459q2 = c10456n7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3047k(str, interfaceC10459q2, i20, i19, i12, i13);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8467j(C3590f c3590f, InterfaceC10459q interfaceC10459q, int i10, int i11, boolean z6, C6021p c6021p, int i12) {
        int i13;
        boolean z10;
        c6021p.m6526U(-688637469);
        if ((i12 & 6) == 0) {
            i13 = (c6021p.m6542f(c3590f) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c6021p.m6538d(i10) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c6021p.m6538d(i11) ? 2048 : 1024;
        }
        int i14 = i13 | 24576;
        if ((i14 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            z10 = z6;
        } else {
            C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i;
            c6021p.m6524S(764936078);
            c6021p.m6553p(false);
            AbstractC4124r4.m4769c(c3590f, interfaceC10459q, 0L, 0L, null, null, null, 0L, null, null, 0L, i11, false, i10, 0, null, null, C3582M.m4273a(c3582m, null), c6021p, i14 & 126, ((i14 >> 6) & 112) | ((i14 << 3) & 7168), 120828);
            z10 = false;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13071d(c3590f, interfaceC10459q, i10, i11, z10, i12);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final ArrayList m8468k(C22013h2 c22013h2, C22062u c22062u) {
        List list = c22062u.f69763b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22038o c22038o = (C22038o) c22062u.f69762a.get(new C22050r(((C22050r) it.next()).f69739a));
            if (c22038o != null) {
                arrayList.add(c22038o);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C21891A((C22038o) it2.next(), c22013h2));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public static final C3890C1 m8469l(boolean z6, C6021p c6021p) {
        long j10;
        c6021p.m6524S(-704218931);
        float f10 = AbstractC3896D1.f11851a;
        if (z6) {
            c6021p.m6524S(-291346648);
            j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12236r;
        } else {
            c6021p.m6524S(-291345183);
            j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p;
        }
        c6021p.m6553p(false);
        C3890C1 c3890c1M4607a = AbstractC3896D1.m4607a(j10, 0L, 0L, 0L, c6021p, 510);
        c6021p.m6553p(false);
        return c3890c1M4607a;
    }
}
