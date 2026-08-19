package mh;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.feature.whisper.WhisperPanelKt$WhisperPanel$$inlined$injectViewModel$1;
import com.openai.feature.whisper.WhisperViewModel;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14089m0;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2452G;
import p124Ei.C2463L0;
import p124Ei.C2476S0;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3930J;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p229J0.C3991U3;
import p257K3.C4535c;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p492U1.C7540e;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p544W9.AbstractC8542Q2;
import p547Wc.C8758B;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9930m3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p774h1.C14365u;
import p789hg.C14505d;
import p870le.C16863U;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: mh.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17270r {

    /* JADX INFO: renamed from: a */
    public static final float f55074a = 64;

    /* JADX INFO: renamed from: b */
    public static final float f55075b = 256;

    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m18971a(String str, String str2, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        int i15;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1952232748);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
        }
        int i16 = i11 & 16;
        if (i16 == 0) {
            if ((i10 & 24576) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 16384 : 8192;
            }
            i13 = i12;
            if ((i13 & 9363) == 9362 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C21694h c21694h4 = C21698j.f68871d;
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                C10843b c10843b = C10843b.f32509a;
                InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(c10456n, C10444b.f30938q0);
                C17756f c17756f = AbstractC17770m.f56724a;
                float f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f10), C10444b.f30947z0, c6021p, 48);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11240a);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i13 & 14, 0, 131070);
                AbstractC3984T1.m4685d(interfaceC1426a, null, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-206194496, c6021p, new C3991U3(str2, 11)), c6021p, ((i13 >> 6) & 14) | 805306368, 510);
                c6021p.m6553p(true);
                AbstractC3984T1.m4693l(interfaceC1426a2, AbstractC10842a.m11233k(c10843b.m11240a(c10456n, C10444b.f30936o0), f10), false, null, null, AbstractC17256d.f55052b, c6021p, ((i13 >> 9) & 14) | 196608, 28);
                c6021p.m6553p(true);
                interfaceC10459q4 = interfaceC10459q5;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8758B(str, str2, interfaceC1426a, interfaceC1426a2, interfaceC10459q4, i10, i11);
            }
        }
        i12 |= 24576;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12;
        if ((i13 & 9363) == 9362) {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h5 = C21698j.f68873f;
            C5997d.m6439Z(c21694h5, c6021p, interfaceC21057KM19511e2);
            C21694h c21694h6 = C21698j.f68872e;
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C21694h c21694h7 = C21698j.f68871d;
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d3);
            C10843b c10843b2 = C10843b.f32509a;
            InterfaceC10459q interfaceC10459qM11240a2 = c10843b2.m11240a(c10456n, C10444b.f30938q0);
            C17756f c17756f2 = AbstractC17770m.f56724a;
            float f11 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f11), C10444b.f30947z0, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11240a2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h5, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m4);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d4);
            AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i13 & 14, 0, 131070);
            AbstractC3984T1.m4685d(interfaceC1426a, null, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-206194496, c6021p, new C3991U3(str2, 11)), c6021p, ((i13 >> 6) & 14) | 805306368, 510);
            c6021p.m6553p(true);
            AbstractC3984T1.m4693l(interfaceC1426a2, AbstractC10842a.m11233k(c10843b2.m11240a(c10456n, C10444b.f30936o0), f11), false, null, null, AbstractC17256d.f55052b, c6021p, ((i13 >> 9) & 14) | 196608, 28);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q6;
        } else {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h8 = C21698j.f68873f;
            C5997d.m6439Z(c21694h8, c6021p, interfaceC21057KM19511e3);
            C21694h c21694h9 = C21698j.f68872e;
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m5);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C21694h c21694h10 = C21698j.f68871d;
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d5);
            C10843b c10843b3 = C10843b.f32509a;
            InterfaceC10459q interfaceC10459qM11240a3 = c10843b3.m11240a(c10456n, C10444b.f30938q0);
            C17756f c17756f3 = AbstractC17770m.f56724a;
            float f12 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f12), C10444b.f30947z0, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11240a3);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a3);
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m6);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d6);
            AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i13 & 14, 0, 131070);
            AbstractC3984T1.m4685d(interfaceC1426a, null, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-206194496, c6021p, new C3991U3(str2, 11)), c6021p, ((i13 >> 6) & 14) | 805306368, 510);
            c6021p.m6553p(true);
            AbstractC3984T1.m4693l(interfaceC1426a2, AbstractC10842a.m11233k(c10843b3.m11240a(c10456n, C10444b.f30936o0), f12), false, null, null, AbstractC17256d.f55052b, c6021p, ((i13 >> 9) & 14) | 196608, 28);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8758B(str, str2, interfaceC1426a, interfaceC1426a2, interfaceC10459q4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18973c(C17274v c17274v, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1262568093);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c17274v) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(AbstractC10844c.f32512c);
            c6021p.m6524S(-445998589);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z6 || objM6514H == obj) {
                objM6514H = new C14505d(9, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qMo428M, false, null, (InterfaceC1426a) objM6514H, 7);
            C10451i c10451i = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11209d);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
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
            C10843b c10843b = C10843b.f32509a;
            Object obj2 = c17274v.f55081a;
            c6021p.m6524S(-702740659);
            boolean zM6542f = c6021p.m6542f(obj2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                C21554a c21554a = C21555b.f68260Z;
                objM6514H2 = C5997d.m6430Q(new C21555b(AbstractC8128k6.m8644j(0, EnumC21557d.SECONDS)), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-702737494);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X) | c6021p.m6545h(c17274v);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                objM6514H3 = new C17268p(c17274v, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17274v.f55081a);
            String elapsedTime = DateUtils.formatElapsedTime(C21555b.m21841k(((C21555b) interfaceC5985X.getValue()).f68263Y, EnumC21557d.SECONDS));
            AbstractC16544l.m18093f(elapsedTime, "formatElapsedTime(...)");
            AbstractC4124r4.m4768b(elapsedTime, AbstractC10842a.m11233k(c10843b.m11240a(c10456n, c10451i), AbstractC7313q.f23201f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131068);
            InterfaceC5982V0 interfaceC5982V0M15260a = AbstractC13764h.m15260a(AbstractC9930m3.m10589c(f55074a, f55075b, c17274v.f55082b / 32767.0f), AbstractC13758e.m15255t(0, 0, null, 7), "AmplitudeAnimation", c6021p, 432, 8);
            C10451i c10451i2 = C10444b.f30938q0;
            AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10843b.m11240a(c10456n, c10451i2), ((C7540e) interfaceC5982V0M15260a.getValue()).f23894Y), AbstractC20417e.f64539a), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12230l, AbstractC14334L.f44973a), c6021p, 0);
            InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(c10456n, c10451i2);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11240a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C17425e c17425eM19122b = AbstractC8542Q2.f26367a;
            if (c17425eM19122b == null) {
                C17424d c17424d = new C17424d("Outlined.StopCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i14 = AbstractC17418F.f55636a;
                C14341T c14341t = new C14341T(C14365u.f45052b);
                C4535c c4535c = new C4535c(3);
                c4535c.m5290p(12.0f, 2.0f);
                c4535c.m5283i(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                c4535c.m5284j(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
                c4535c.m5292r(10.0f, -4.48f, 10.0f, -10.0f);
                c4535c.m5283i(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
                c4535c.m5282h();
                c4535c.m5290p(12.0f, 20.0f);
                c4535c.m5284j(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                c4535c.m5292r(3.58f, -8.0f, 8.0f, -8.0f);
                c4535c.m5292r(8.0f, 3.58f, 8.0f, 8.0f);
                c4535c.m5291q(16.42f, 20.0f, 12.0f, 20.0f);
                c4535c.m5282h();
                c4535c.m5290p(16.0f, 16.0f);
                c4535c.m5286l(8.0f);
                c4535c.m5293s(8.0f);
                c4535c.m5287m(8.0f);
                c4535c.m5293s(16.0f);
                c4535c.m5282h();
                C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                c17425eM19122b = c17424d.m19122b();
                AbstractC8542Q2.f26367a = c17425eM19122b;
            }
            AbstractC3878A1.m4597b(c17425eM19122b, null, null, 0L, c6021p, 48, 12);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.whisper_tap_to_stop, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c17274v, interfaceC1426a, interfaceC10459q, i10, 16);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m18974d(C17278z c17278z, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-543105192);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c17278z) : c6021p.m6545h(c17278z) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a4) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n2 = C10456n.f30959Y;
            C17272t c17272t = C17272t.f55079c;
            InterfaceC17277y interfaceC17277y = c17278z.f55085a;
            if (AbstractC16544l.m18089b(interfaceC17277y, c17272t)) {
                c6021p.m6524S(834966601);
                c6021p.m6553p(false);
            } else if (interfaceC17277y instanceof C17274v) {
                c6021p.m6524S(835009629);
                m18973c((C17274v) interfaceC17277y, interfaceC1426a, c10456n2, c6021p, ((i12 >> 9) & 896) | (i12 & 112));
                c6021p.m6553p(false);
            } else if (interfaceC17277y instanceof C17276x) {
                c6021p.m6524S(835138155);
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30944w0, c6021p, 54);
                int i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n2);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC1426a interfaceC1426a5 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a5);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                AbstractC3980S2.m4668b(null, 0L, 0.0f, 0L, 0, c6021p, 0, 31);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n2, AbstractC7313q.f23199d));
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.whisper_transcribing, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                if (interfaceC17277y instanceof C17275w) {
                    c6021p.m6524S(835547913);
                    c6021p.m6553p(false);
                } else {
                    if (interfaceC17277y instanceof C17273u ? true : interfaceC17277y instanceof C17271s) {
                        c6021p.m6524S(835637813);
                        c10456n = c10456n2;
                        m18971a(AbstractC8142m4.m8676d(AbstractC16544l.m18089b(interfaceC17277y, C17273u.f55080a) ? R.string.whisper_error_service : R.string.whisper_error_network, c6021p), AbstractC8142m4.m8676d(R.string.whisper_retry, c6021p), interfaceC1426a3, interfaceC1426a4, c10456n2, c6021p, 65408 & (i12 >> 3), 0);
                        c6021p.m6553p(false);
                    } else {
                        c10456n = c10456n2;
                        if (AbstractC16544l.m18089b(interfaceC17277y, C17272t.f55078b)) {
                            c6021p.m6524S(836194604);
                            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1426a4, c6021p);
                            C17296C c17296c = C17296C.f55119a;
                            c6021p.m6524S(-1497043606);
                            boolean zM6542f = c6021p.m6542f(interfaceC5985XM6435V);
                            Object objM6514H = c6021p.m6514H();
                            if (zM6542f || objM6514H == C6013l.f19514a) {
                                objM6514H = new C17269q(interfaceC5985XM6435V, null);
                                c6021p.m6537c0(objM6514H);
                            }
                            c6021p.m6553p(false);
                            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
                            c6021p.m6553p(false);
                        } else {
                            C17272t c17272t2 = C17272t.f55077a;
                            if (AbstractC16544l.m18089b(interfaceC17277y, c17272t2)) {
                                c6021p.m6524S(836372792);
                                int i14 = i12 & 896;
                                int i15 = i12 >> 3;
                                m18971a(AbstractC8142m4.m8676d(AbstractC16544l.m18089b(interfaceC17277y, c17272t2) ? R.string.whisper_no_speech : R.string.whisper_too_short, c6021p), AbstractC8142m4.m8676d(R.string.whisper_restart, c6021p), interfaceC1426a2, interfaceC1426a4, c10456n, c6021p, i14 | (i15 & 7168) | (i15 & 57344), 0);
                                c6021p.m6553p(false);
                            } else {
                                c6021p.m6524S(836889035);
                                c6021p.m6553p(false);
                            }
                        }
                    }
                }
                interfaceC10459q2 = c10456n;
            }
            c10456n = c10456n2;
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c17278z, interfaceC1426a, interfaceC1426a2, interfaceC1426a3, interfaceC1426a4, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m18972b(boolean z6, InterfaceC1436k onTranscribe, InterfaceC1426a onClose, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z10;
        long j10;
        AbstractC16544l.m18094g(onTranscribe, "onTranscribe");
        AbstractC16544l.m18094g(onClose, "onClose");
        c6021p.m6526U(-506402821);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onTranscribe) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onClose) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-41803442);
            boolean z11 = (i12 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z11 || objM6514H == obj) {
                objM6514H = new C14089m0(8, onTranscribe);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17278z.class));
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
            Object objMo5693b = c16527d.mo5693b(WhisperViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C17278z.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                z10 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17278z.class), c16527d.mo5693b(WhisperViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(WhisperViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            } else {
                z10 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new WhisperPanelKt$WhisperPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            WhisperViewModel whisperViewModel = (WhisperViewModel) baseViewModel;
            C17278z c17278z = (C17278z) AbstractC9112C3.m9642d(whisperViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-41796723);
            boolean zM6542f2 = c6021p.m6542f(whisperViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                objM6514H4 = new C16863U(1, whisperViewModel, WhisperViewModel.class, wNrQXvwLiB.QsJJFlJoRdhTro, "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 4);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-41795024);
            boolean zM6542f3 = c6021p.m6542f(interfaceC3759g) | ((i12 & 14) == 4 ? z10 : false);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f3 || objM6514H5 == obj) {
                objM6514H5 = new C17265m(z6, interfaceC3759g, null);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p, boolValueOf);
            if (c17278z.f55085a instanceof C17274v) {
                c6021p.m6524S(-41789595);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12217c;
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-41787705);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12226h;
                c6021p.m6553p(false);
            }
            AbstractC4034c4.m4725a(interfaceC10459q, null, j10, 0L, AbstractC3930J.f12088a, 0.0f, null, AbstractC8411c.m8969c(-88379968, c6021p, new C2476S0(interfaceC3759g, c17278z, z6, onClose, 3)), c6021p, ((i12 >> 9) & 14) | 12582912, 106);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(z6, onTranscribe, onClose, interfaceC10459q, i10);
        }
    }
}
