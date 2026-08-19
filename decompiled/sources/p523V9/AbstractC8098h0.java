package p523V9;

import af.C10552H;
import af.C10561Q;
import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.conversations.impl.voicefeedback.C12356xfdac84f0;
import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import com.openai.feature.conversations.impl.voicefeedback.VoiceFeedbackDetailsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14095p0;
import io.sentry.android.replay.capture.C15272c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0280q;
import p017Af.AbstractC0479j;
import p017Af.C0471b;
import p017Af.C0482m;
import p017Af.C0483n;
import p017Af.C0492w;
import p025An.C0644w;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2446D;
import p124Ei.C2463L0;
import p172Gi.C3080m;
import p193Hf.C3313J;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4152w2;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p362Of.C6186a;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p547Wc.C8794g;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p654b1.EnumC11216j;
import p774h1.AbstractC14334L;
import p789hg.C14505d;
import p870le.C16878e0;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17790w;
import p953q0.C18557O;
import re.AbstractC18967t;
import re.C18951d;
import re.C18968u;
import re.C18969v;
import re.C18973z;

/* JADX INFO: renamed from: V9.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8098h0 {
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8569a(InterfaceC10459q interfaceC10459q, float f10, float f11, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        float f12;
        int i14;
        InterfaceC10459q interfaceC10459q2;
        float f13;
        boolean z6;
        boolean z10;
        boolean z11;
        Object objM6514H;
        int i15;
        C21696i c21696i;
        C21694h c21694h;
        float f14;
        C6018n0 c6018n0M6555r;
        int i16;
        c6021p.m6526U(31034661);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c6021p.m6536c(f10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    f12 = f11;
                    if (c6021p.m6536c(f12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                    if (i17 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q2 = interfaceC10459q;
                    }
                    if (i18 != 0) {
                        f13 = AbstractC0479j.f1555a;
                    } else {
                        f13 = f10;
                    }
                    if (i13 != 0) {
                        f12 = AbstractC0479j.f1556b;
                    }
                    c6021p.m6524S(2067295379);
                    if ((i12 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i12 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z6 | z10;
                    objM6514H = c6021p.m6514H();
                    if (z11 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0482m(f13, f12);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
                    c6021p.m6553p(false);
                    i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    int i19 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    AbstractC17792x.m19538u((i19 >> 6) & 14, c8410b, c6021p, true);
                } else {
                    c6021p.m6517L();
                    interfaceC10459q2 = interfaceC10459q;
                    f13 = f10;
                }
                f14 = f12;
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C0483n(interfaceC10459q2, f13, f14, c8410b, i10, i11);
                }
            }
            i12 |= 384;
            f12 = f11;
            if ((i10 & 3072) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i12 & 1171) == 1170) {
                if (i17 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                if (i18 != 0) {
                    f13 = AbstractC0479j.f1555a;
                } else {
                    f13 = f10;
                }
                if (i13 != 0) {
                    f12 = AbstractC0479j.f1556b;
                }
                c6021p.m6524S(2067295379);
                if ((i12 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z6 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC21057K interfaceC21057K2 = (InterfaceC21057K) objM6514H;
                c6021p.m6553p(false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                int i110 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                AbstractC17792x.m19538u((i110 >> 6) & 14, c8410b, c6021p, true);
            } else {
                if (i17 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                if (i18 != 0) {
                    f13 = AbstractC0479j.f1555a;
                } else {
                    f13 = f10;
                }
                if (i13 != 0) {
                    f12 = AbstractC0479j.f1556b;
                }
                c6021p.m6524S(2067295379);
                if ((i12 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z6 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC21057K interfaceC21057K3 = (InterfaceC21057K) objM6514H;
                c6021p.m6553p(false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                int i111 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                AbstractC17792x.m19538u((i111 >> 6) & 14, c8410b, c6021p, true);
            }
            f14 = f12;
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C0483n(interfaceC10459q2, f13, f14, c8410b, i10, i11);
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                f12 = f11;
                if (c6021p.m6536c(f12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i12 & 1171) == 1170) {
                if (i17 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                if (i18 != 0) {
                    f13 = AbstractC0479j.f1555a;
                } else {
                    f13 = f10;
                }
                if (i13 != 0) {
                    f12 = AbstractC0479j.f1556b;
                }
                c6021p.m6524S(2067295379);
                if ((i12 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z6 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC21057K interfaceC21057K4 = (InterfaceC21057K) objM6514H;
                c6021p.m6553p(false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                int i112 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                AbstractC17792x.m19538u((i112 >> 6) & 14, c8410b, c6021p, true);
            } else {
                if (i17 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                if (i18 != 0) {
                    f13 = AbstractC0479j.f1555a;
                } else {
                    f13 = f10;
                }
                if (i13 != 0) {
                    f12 = AbstractC0479j.f1556b;
                }
                c6021p.m6524S(2067295379);
                if ((i12 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z6 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C0482m(f13, f12);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC21057K interfaceC21057K5 = (InterfaceC21057K) objM6514H;
                c6021p.m6553p(false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                int i113 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                AbstractC17792x.m19538u((i113 >> 6) & 14, c8410b, c6021p, true);
            }
            f14 = f12;
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C0483n(interfaceC10459q2, f13, f14, c8410b, i10, i11);
            }
        }
        i12 |= 384;
        f12 = f11;
        if ((i10 & 3072) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) == 1170) {
            if (i17 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            if (i18 != 0) {
                f13 = AbstractC0479j.f1555a;
            } else {
                f13 = f10;
            }
            if (i13 != 0) {
                f12 = AbstractC0479j.f1556b;
            }
            c6021p.m6524S(2067295379);
            if ((i12 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z6 | z10;
            objM6514H = c6021p.m6514H();
            if (z11) {
                objM6514H = new C0482m(f13, f12);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C0482m(f13, f12);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K6 = (InterfaceC21057K) objM6514H;
            c6021p.m6553p(false);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            int i114 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            AbstractC17792x.m19538u((i114 >> 6) & 14, c8410b, c6021p, true);
        } else {
            if (i17 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            if (i18 != 0) {
                f13 = AbstractC0479j.f1555a;
            } else {
                f13 = f10;
            }
            if (i13 != 0) {
                f12 = AbstractC0479j.f1556b;
            }
            c6021p.m6524S(2067295379);
            if ((i12 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z6 | z10;
            objM6514H = c6021p.m6514H();
            if (z11) {
                objM6514H = new C0482m(f13, f12);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C0482m(f13, f12);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K7 = (InterfaceC21057K) objM6514H;
            c6021p.m6553p(false);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            int i115 = (((((i12 << 3) & 112) | ((i12 >> 9) & 14)) << 6) & 896) | 6;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            AbstractC17792x.m19538u((i115 >> 6) & 14, c8410b, c6021p, true);
        }
        f14 = f12;
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0483n(interfaceC10459q2, f13, f14, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8570b(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1193972337);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-722108899);
            c6021p.m6524S(-722112905);
            c6021p.m6524S(-722117340);
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(interfaceC10459q, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13380d);
            if (z6) {
                interfaceC10459qM8501a = AbstractC10833a.m11206a(interfaceC10459qM8501a, AbstractC9818V.m10459c(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12193G, c6021p), null, 6);
            }
            c6021p.m6553p(false);
            if (!z6) {
                interfaceC10459qM8501a = AbstractC10833a.m11207b(interfaceC10459qM8501a, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12193G, AbstractC14334L.f44973a);
            }
            c6021p.m6553p(false);
            if (interfaceC1426a != null) {
                c6021p.m6524S(1574851918);
                boolean zM6542f = c6021p.m6542f(interfaceC1426a);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C14505d(24, interfaceC1426a);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM8501a = AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qM8501a, 0.0f, AbstractC7313q.f23198c, 1), AbstractC7313q.f23201f, 0.0f, AbstractC7313q.f23199d, 0.0f, 10);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17792x.m19538u((i11 >> 9) & 14, c8410b, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(z6, interfaceC1426a, interfaceC10459q, c8410b, i10, 10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8571c(String str, String str2, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1565455724);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
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
            c6021p.m6524S(1824307863);
            boolean z6 = ((i11 & 896) == 256) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C6186a(6, str2, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m8570b(false, (InterfaceC1426a) objM6514H, interfaceC10459q, AbstractC8411c.m8969c(-2044231941, c6021p, new C0471b(str2, str, interfaceC1436k)), c6021p, ((i11 >> 3) & 896) | 3078);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(str, str2, interfaceC1436k, interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8572d(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        c6021p.m6526U(1007984535);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
            List list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), AbstractC18967t.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            Object objMo5693b = c16527d.mo5693b(VoiceEndedViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(AbstractC18967t.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(AbstractC18967t.class), c16527d.mo5693b(VoiceEndedViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceEndedViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            VoiceEndedViewModel voiceEndedViewModel = (VoiceEndedViewModel) baseViewModel;
            c6021p.m6524S(1302867311);
            boolean zM6542f2 = c6021p.m6542f(voiceEndedViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C14095p0(voiceEndedViewModel, 1);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            List list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18973z.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b3 = c16527d.mo5693b(VoiceFeedbackDetailsViewModel.class);
            Object objMo5693b4 = c16527d.mo5693b(C18973z.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f3 = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18973z.class), c16527d.mo5693b(VoiceFeedbackDetailsViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceFeedbackDetailsViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H3);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H3;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                objM6514H4 = new C12356xfdac84f0(baseViewModel2, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, baseViewModel2);
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(voiceEndedViewModel.f40343c, C18969v.f60524Y, c6021p, 48);
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(((VoiceFeedbackDetailsViewModel) baseViewModel2).f40343c, c6021p);
            c6021p.m6524S(1302888131);
            boolean zM6542f4 = c6021p.m6542f(voiceEndedViewModel);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f4 || objM6514H5 == obj) {
                objM6514H5 = new C18968u(voiceEndedViewModel, 0);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(1302893672);
            boolean zM6542f5 = c6021p.m6542f(voiceEndedViewModel);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6542f5 || objM6514H6 == obj) {
                objM6514H6 = new C18951d(voiceEndedViewModel, 3);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            m8573e(interfaceC1439n, (InterfaceC1426a) objM6514H6, (C18973z) interfaceC5985XM9642d.getValue(), ((Boolean) interfaceC5985XM9805a.getValue()).booleanValue(), interfaceC10459q2, c6021p, (i11 << 12) & 57344, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m8573e(InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, C18973z c18973z, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1575603397);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1439n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c18973z) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        int i13 = i11 & 16;
        if (i13 == 0) {
            if ((i10 & 24576) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 16384 : 8192;
            }
            if ((i12 & 9363) == 9362 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                AbstractC4152w2.m4780a(interfaceC1426a, interfaceC10459q3, AbstractC4152w2.m4785f(6, 2, c6021p, true), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-44920056, c6021p, new C16878e0(z6, c18973z, interfaceC1439n, 2)), c6021p, ((i12 >> 3) & 14) | ((i12 >> 9) & 112), 384, 4088);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10552H(interfaceC1439n, interfaceC1426a, c18973z, z6, interfaceC10459q4, i10, i11);
            }
        }
        i12 |= 24576;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 9363) == 9362) {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            AbstractC4152w2.m4780a(interfaceC1426a, interfaceC10459q3, AbstractC4152w2.m4785f(6, 2, c6021p, true), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-44920056, c6021p, new C16878e0(z6, c18973z, interfaceC1439n, 2)), c6021p, ((i12 >> 3) & 14) | ((i12 >> 9) & 112), 384, 4088);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            AbstractC4152w2.m4780a(interfaceC1426a, interfaceC10459q3, AbstractC4152w2.m4785f(6, 2, c6021p, true), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-44920056, c6021p, new C16878e0(z6, c18973z, interfaceC1439n, 2)), c6021p, ((i12 >> 3) & 14) | ((i12 >> 9) & 112), 384, 4088);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10552H(interfaceC1439n, interfaceC1426a, c18973z, z6, interfaceC10459q4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8574f(String str, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(622130472);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = i11 >> 3;
            m8570b(str == null, interfaceC1426a, interfaceC10459q, AbstractC8411c.m8969c(-1656084191, c6021p, new C3313J(str, z6, interfaceC1426a, 3)), c6021p, (i12 & 112) | 3072 | (i12 & 896));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8794g(i10, 1, interfaceC1426a, interfaceC10459q, str, z6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8575g(List list, String str, Set set, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-520135324);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(set) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k2) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(c10456n, AbstractC8479G.m9124e(c6021p), 14);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-414878777);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3080m c3080m = (C3080m) it.next();
                if (AbstractC16544l.m18089b(c3080m.f9283a, "other")) {
                    c6021p.m6524S(-890636017);
                    m8571c(c3080m.f9284b, str, interfaceC1436k, AbstractC10844c.m11244d(c10456n, 1.0f), c6021p, (i11 & 112) | 3072 | ((i11 >> 3) & 896));
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-890346787);
                    boolean zContains = set.contains(c3080m);
                    c6021p.m6524S(1218210585);
                    boolean zM6545h = c6021p.m6545h(set) | c6021p.m6545h(c3080m) | ((57344 & i11) == 16384);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C15272c(set, c3080m, interfaceC1436k2, 19);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    m8574f(c3080m.f9284b, zContains, (InterfaceC1426a) objM6514H, AbstractC10844c.m11244d(c10456n, 1.0f), c6021p, 3072);
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(list, str, set, interfaceC1436k, interfaceC1436k2, i10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8576h(int i10, C6021p c6021p) {
        c6021p.m6526U(-988456775);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1210768024);
            for (int i12 = 0; i12 < 6; i12++) {
                m8574f(null, false, null, AbstractC10844c.m11244d(c10456n, 1.0f), c6021p, 3510);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 20);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC10459q m8577i(InterfaceC10459q interfaceC10459q, EnumC11216j enumC11216j, InterfaceC1436k onFill) {
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        AbstractC16544l.m18094g(onFill, "onFill");
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C0885s(enumC11216j, 23, onFill));
    }
}
