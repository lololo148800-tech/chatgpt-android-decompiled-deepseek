package p523V9;

import af.AbstractC10578f;
import af.C10552H;
import af.C10553I;
import af.C10557M;
import af.C10558N;
import af.C10559O;
import af.C10560P;
import af.C10561Q;
import af.C10562S;
import af.C10565V;
import af.C10566W;
import af.C10571a0;
import af.C10573b0;
import af.C10575c0;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11349D;
import bf.C11363S;
import bf.C11364T;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import com.openai.feature.gizmos.impl.store.GizmoStoreViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p003A1.C0257i0;
import p006A4.C0362w;
import p017Af.AbstractC0479j;
import p017Af.C0478i;
import p017Af.C0492w;
import p017Af.EnumC0474e;
import p025An.C0644w;
import p039Bc.C0885s;
import p040Bd.C0965N;
import p040Bd.C0971O;
import p042Bf.C1269k;
import p042Bf.C1276r;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p069Cf.C1648g;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p124Ei.C2446D;
import p124Ei.C2509g;
import p193Hf.C3371i0;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3590f;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3943L0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4031c1;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4073j1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4105o3;
import p229J0.C4135t3;
import p229J0.C4165y3;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p328N1.C5609y;
import p339Nf.AbstractC5741w;
import p349O0.AbstractC6012k0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p437Rn.C6959q;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p482Tg.C7445b0;
import p525Vb.C8258a;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8473F;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8519M3;
import p544W9.AbstractC8662k3;
import p547Wc.C8807q;
import p547Wc.C8816z;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9262b4;
import p594Y9.AbstractC9715D3;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9818V;
import p623Zf.C10312h;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import ph.C18416d;
import re.AbstractC18967t;
import re.C18951d;
import re.C18952e;

/* JADX INFO: renamed from: V9.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8090g0 {
    /* JADX INFO: renamed from: a */
    public static final void m8542a(C11364T c11364t, C11349D c11349d, InterfaceC1436k interfaceC1436k, C11363S c11363s, int i10, boolean z6, C6021p c6021p, int i11) {
        int i12;
        String strValueOf;
        c6021p.m6526U(1081134301);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(c11364t) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(c11349d) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6542f(c11363s) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c6021p.m6538d(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            float f10 = AbstractC7312p.f23188e;
            C11364T c11364t2 = c11363s.f34359a;
            if (c11364t2.f34368e) {
                strValueOf = String.valueOf(i10 + 1);
            } else {
                strValueOf = !c11364t2.f34367d ? "" : null;
            }
            m8546e(c11364t, c11349d, interfaceC1436k, null, f10, strValueOf, z6, false, c6021p, ((i12 << 3) & 3670016) | (i12 & 1022), 136);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10552H(c11364t, c11349d, interfaceC1436k, c11363s, i10, z6, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8543b(C11364T c11364t, C11349D c11349d, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-276102696);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c11364t) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c11349d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC7313q.f23201f, AbstractC7313q.f23198c), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c);
            c6021p.m6524S(-439915446);
            boolean z6 = ((i11 & 14) == 4) | ((i11 & 896) == 256) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4687f(AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7), null, null, null, null, AbstractC8411c.m8969c(483263562, c6021p, new C0885s(c11364t, 20, c11349d)), c6021p, 196608, 30);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c11364t, c11349d, interfaceC1436k, i10, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8544c(C0971O contentReference, InterfaceC1436k onLinkClick, InterfaceC1439n trackClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(contentReference, "contentReference");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC16544l.m18094g(trackClick, "trackClick");
        c6021p.m6526U(1428677490);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(contentReference) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(trackClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8098h0.m8569a(null, 0, AbstractC0479j.f1556b - AbstractC7313q.f23201f, AbstractC8411c.m8969c(346075104, c6021p, new C0148y(contentReference, onLinkClick, trackClick, 2)), c6021p, 3120, 1);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(contentReference, onLinkClick, trackClick, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8545d(C8410b c8410b, C8410b c8410b2, C8410b c8410b3, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(188698313);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459q, 0.0f, f10, AbstractC7313q.f23201f, f10, 1);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f10), C10444b.f30944w0, c6021p, 48);
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
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c8410b.invoke(c6021p, Integer.valueOf(i11 & 14));
            InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(c10456n, 1.0f, true);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19513a);
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
            c8410b2.invoke(c6021p, Integer.valueOf((i11 >> 3) & 14));
            c8410b3.invoke(c6021p, Integer.valueOf((i11 >> 6) & 14));
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 17, c8410b, c8410b2, c8410b3, interfaceC10459q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0171  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x018d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0191  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c A[PHI: r4 r12 r13 r14 r15
      0x010c: PHI (r4v26 int) = (r4v15 int), (r4v27 int) binds: [B:106:0x012b, B:91:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r12v9 a1.q) = (r12v7 a1.q), (r12v10 a1.q) binds: [B:106:0x012b, B:91:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r13v3 float) = (r13v1 float), (r13v4 float) binds: [B:106:0x012b, B:91:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r14v7 java.lang.String) = (r14v4 java.lang.String), (r14v3 java.lang.String) binds: [B:106:0x012b, B:91:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r15v7 boolean) = (r15v5 boolean), (r15v8 boolean) binds: [B:106:0x012b, B:91:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x00ec, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static final void m8546e(C11364T c11364t, C11349D c11349d, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, float f10, String str, boolean z6, boolean z10, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        float f11;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        InterfaceC10459q interfaceC10459q3;
        float f12;
        boolean z11;
        InterfaceC10459q interfaceC10459q4;
        float f13;
        boolean z12;
        boolean z13;
        InterfaceC10459q interfaceC10459qM9836a;
        InterfaceC10459q interfaceC10459qM11237o;
        InterfaceC10459q interfaceC10459q5;
        float f14;
        String str3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-352526691);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c11364t) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(c11349d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    f11 = f10;
                    int i20 = c6021p.m6536c(f11) ? 16384 : 8192;
                    i12 |= i20;
                } else {
                    f11 = f10;
                }
                i12 |= i20;
            } else {
                f11 = f10;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c6021p.m6542f(str2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c6021p.m6544g(z6)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c6021p.m6544g(z10)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i12 & 4793491) == 4793490 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0 || c6021p.m6561x()) {
                        if (i19 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if ((i11 & 16) != 0) {
                            f12 = AbstractC7312p.f23189f;
                            i12 &= -57345;
                        } else {
                            f12 = f11;
                        }
                        if (i13 != 0) {
                            str2 = null;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z6;
                        }
                        interfaceC10459q4 = interfaceC10459q3;
                        f13 = f12;
                        z12 = z11;
                        if (i17 != 0) {
                            z13 = true;
                        }
                        c6021p.m6554q();
                        C8410b c8410bM8969c = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                        C8410b c8410bM8969c2 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                        C8410b c8410bM8969c3 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                        interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                        if (interfaceC1436k != null) {
                            c6021p.m6524S(289928910);
                            if ((i12 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17 | ((i12 & 112) == 32);
                            objM6514H = c6021p.m6514H();
                            if (z18 || objM6514H == C6013l.f19514a) {
                                objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                                c6021p.m6537c0(objM6514H);
                            }
                            c6021p.m6553p(false);
                            interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                        }
                        interfaceC10459qM11237o = interfaceC10459qM9836a;
                        if (str2 == null) {
                            interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                        }
                        m8545d(c8410bM8969c, c8410bM8969c2, c8410bM8969c3, interfaceC10459qM11237o, c6021p, 438);
                        interfaceC10459q5 = interfaceC10459q4;
                        f14 = f13;
                        str3 = str2;
                        z14 = z12;
                        z15 = z13;
                    } else {
                        c6021p.m6517L();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        z12 = z6;
                        f13 = f11;
                        interfaceC10459q4 = interfaceC10459q2;
                    }
                    z13 = z10;
                    c6021p.m6554q();
                    C8410b c8410bM8969c4 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                    C8410b c8410bM8969c5 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                    C8410b c8410bM8969c6 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                    interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                    if (interfaceC1436k != null) {
                        c6021p.m6524S(289928910);
                        if ((i12 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17 | ((i12 & 112) == 32);
                        objM6514H = c6021p.m6514H();
                        if (z18) {
                            objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                            c6021p.m6537c0(objM6514H);
                        } else {
                            objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                    }
                    interfaceC10459qM11237o = interfaceC10459qM9836a;
                    if (str2 == null) {
                        interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    m8545d(c8410bM8969c4, c8410bM8969c5, c8410bM8969c6, interfaceC10459qM11237o, c6021p, 438);
                    interfaceC10459q5 = interfaceC10459q4;
                    f14 = f13;
                    str3 = str2;
                    z14 = z12;
                    z15 = z13;
                } else {
                    c6021p.m6517L();
                    z14 = z6;
                    z15 = z10;
                    interfaceC10459q5 = interfaceC10459q2;
                    f14 = f11;
                    str3 = str2;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10560P(c11364t, c11349d, interfaceC1436k, interfaceC10459q5, f14, str3, z14, z15, i10, i11);
                }
            }
            i12 |= 196608;
            str2 = str;
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c6021p.m6544g(z6)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c6021p.m6544g(z10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i12 & 4793491) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                }
                c6021p.m6554q();
                C8410b c8410bM8969c7 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                C8410b c8410bM8969c8 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                C8410b c8410bM8969c9 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                if (interfaceC1436k != null) {
                    c6021p.m6524S(289928910);
                    if ((i12 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17 | ((i12 & 112) == 32);
                    objM6514H = c6021p.m6514H();
                    if (z18) {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                }
                interfaceC10459qM11237o = interfaceC10459qM9836a;
                if (str2 == null) {
                    interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                }
                m8545d(c8410bM8969c7, c8410bM8969c8, c8410bM8969c9, interfaceC10459qM11237o, c6021p, 438);
                interfaceC10459q5 = interfaceC10459q4;
                f14 = f13;
                str3 = str2;
                z14 = z12;
                z15 = z13;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                }
                c6021p.m6554q();
                C8410b c8410bM8969c10 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                C8410b c8410bM8969c11 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                C8410b c8410bM8969c12 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                if (interfaceC1436k != null) {
                    c6021p.m6524S(289928910);
                    if ((i12 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17 | ((i12 & 112) == 32);
                    objM6514H = c6021p.m6514H();
                    if (z18) {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                }
                interfaceC10459qM11237o = interfaceC10459qM9836a;
                if (str2 == null) {
                    interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                }
                m8545d(c8410bM8969c10, c8410bM8969c11, c8410bM8969c12, interfaceC10459qM11237o, c6021p, 438);
                interfaceC10459q5 = interfaceC10459q4;
                f14 = f13;
                str3 = str2;
                z14 = z12;
                z15 = z13;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10560P(c11364t, c11349d, interfaceC1436k, interfaceC10459q5, f14, str3, z14, z15, i10, i11);
            }
        }
        i12 |= 3072;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                f11 = f10;
                if (c6021p.m6536c(f11)) {
                }
                i12 |= i20;
            } else {
                f11 = f10;
            }
            i12 |= i20;
        } else {
            f11 = f10;
        }
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                str2 = str;
                if (c6021p.m6542f(str2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c6021p.m6544g(z6)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c6021p.m6544g(z10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i12 & 4793491) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                }
                c6021p.m6554q();
                C8410b c8410bM8969c13 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                C8410b c8410bM8969c14 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                C8410b c8410bM8969c15 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                if (interfaceC1436k != null) {
                    c6021p.m6524S(289928910);
                    if ((i12 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17 | ((i12 & 112) == 32);
                    objM6514H = c6021p.m6514H();
                    if (z18) {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                }
                interfaceC10459qM11237o = interfaceC10459qM9836a;
                if (str2 == null) {
                    interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                }
                m8545d(c8410bM8969c13, c8410bM8969c14, c8410bM8969c15, interfaceC10459qM11237o, c6021p, 438);
                interfaceC10459q5 = interfaceC10459q4;
                f14 = f13;
                str3 = str2;
                z14 = z12;
                z15 = z13;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 16) != 0) {
                        f12 = AbstractC7312p.f23189f;
                        i12 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    f13 = f12;
                    z12 = z11;
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                }
                c6021p.m6554q();
                C8410b c8410bM8969c16 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
                C8410b c8410bM8969c17 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
                C8410b c8410bM8969c18 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
                if (interfaceC1436k != null) {
                    c6021p.m6524S(289928910);
                    if ((i12 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17 | ((i12 & 112) == 32);
                    objM6514H = c6021p.m6514H();
                    if (z18) {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
                }
                interfaceC10459qM11237o = interfaceC10459qM9836a;
                if (str2 == null) {
                    interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
                }
                m8545d(c8410bM8969c16, c8410bM8969c17, c8410bM8969c18, interfaceC10459qM11237o, c6021p, 438);
                interfaceC10459q5 = interfaceC10459q4;
                f14 = f13;
                str3 = str2;
                z14 = z12;
                z15 = z13;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10560P(c11364t, c11349d, interfaceC1436k, interfaceC10459q5, f14, str3, z14, z15, i10, i11);
            }
        }
        i12 |= 196608;
        str2 = str;
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c6021p.m6544g(z6)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i12 |= i16;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c6021p.m6544g(z10)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i12 & 4793491) == 4793490) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 16) != 0) {
                    f12 = AbstractC7312p.f23189f;
                    i12 &= -57345;
                } else {
                    f12 = f11;
                }
                if (i13 != 0) {
                    str2 = null;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                interfaceC10459q4 = interfaceC10459q3;
                f13 = f12;
                z12 = z11;
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
            } else {
                if (i19 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 16) != 0) {
                    f12 = AbstractC7312p.f23189f;
                    i12 &= -57345;
                } else {
                    f12 = f11;
                }
                if (i13 != 0) {
                    str2 = null;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                interfaceC10459q4 = interfaceC10459q3;
                f13 = f12;
                z12 = z11;
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
            }
            c6021p.m6554q();
            C8410b c8410bM8969c19 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
            C8410b c8410bM8969c110 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
            C8410b c8410bM8969c111 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
            if (interfaceC1436k != null) {
                c6021p.m6524S(289928910);
                if ((i12 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i12 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17 | ((i12 & 112) == 32);
                objM6514H = c6021p.m6514H();
                if (z18) {
                    objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            interfaceC10459qM11237o = interfaceC10459qM9836a;
            if (str2 == null) {
                interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
            }
            m8545d(c8410bM8969c19, c8410bM8969c110, c8410bM8969c111, interfaceC10459qM11237o, c6021p, 438);
            interfaceC10459q5 = interfaceC10459q4;
            f14 = f13;
            str3 = str2;
            z14 = z12;
            z15 = z13;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 16) != 0) {
                    f12 = AbstractC7312p.f23189f;
                    i12 &= -57345;
                } else {
                    f12 = f11;
                }
                if (i13 != 0) {
                    str2 = null;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                interfaceC10459q4 = interfaceC10459q3;
                f13 = f12;
                z12 = z11;
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
            } else {
                if (i19 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 16) != 0) {
                    f12 = AbstractC7312p.f23189f;
                    i12 &= -57345;
                } else {
                    f12 = f11;
                }
                if (i13 != 0) {
                    str2 = null;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                interfaceC10459q4 = interfaceC10459q3;
                f13 = f12;
                z12 = z11;
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
            }
            c6021p.m6554q();
            C8410b c8410bM8969c112 = AbstractC8411c.m8969c(1527673976, c6021p, new C10558N(str2, c11349d, f13));
            C8410b c8410bM8969c113 = AbstractC8411c.m8969c(490557399, c6021p, new C10559O(c11349d, 0));
            C8410b c8410bM8969c114 = AbstractC8411c.m8969c(-546559178, c6021p, new C8807q(z13, c11349d, z12, 1));
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(interfaceC10459q4, c11349d.f34333p);
            if (interfaceC1436k != null) {
                c6021p.m6524S(289928910);
                if ((i12 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i12 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17 | ((i12 & 112) == 32);
                objM6514H = c6021p.m6514H();
                if (z18) {
                    objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C10553I(interfaceC1436k, c11364t, c11349d, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            interfaceC10459qM11237o = interfaceC10459qM9836a;
            if (str2 == null) {
                interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11237o, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14);
            }
            m8545d(c8410bM8969c112, c8410bM8969c113, c8410bM8969c114, interfaceC10459qM11237o, c6021p, 438);
            interfaceC10459q5 = interfaceC10459q4;
            f14 = f13;
            str3 = str2;
            z14 = z12;
            z15 = z13;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10560P(c11364t, c11349d, interfaceC1436k, interfaceC10459q5, f14, str3, z14, z15, i10, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8547f(InterfaceC10459q interfaceC10459q, GizmoStoreViewModel gizmoStoreViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        GizmoStoreViewModel gizmoStoreViewModel2;
        c6021p.m6526U(-1153324433);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            gizmoStoreViewModel2 = gizmoStoreViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10573b0.class));
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
                Object objMo5693b = c16527d.mo5693b(GizmoStoreViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10573b0.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10573b0.class), c16527d.mo5693b(GizmoStoreViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(GizmoStoreViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                    objM6514H = objM14398a;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                gizmoStoreViewModel2 = (GizmoStoreViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                gizmoStoreViewModel2 = gizmoStoreViewModel;
            }
            c6021p.m6554q();
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-487622849);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C10562S(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C10573b0 c10573b0 = (C10573b0) AbstractC9112C3.m9642d(gizmoStoreViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-487616584);
            boolean zM6542f2 = c6021p.m6542f(gizmoStoreViewModel2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                objM6514H3 = new C7445b0(1, gizmoStoreViewModel2, GizmoStoreViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 13);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H3;
            c6021p.m6553p(false);
            int i14 = (i11 & 14) | 199680;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(-1881186920, c6021p, new C0148y(interfaceC3759g, c8870f, interfaceC20904w, 19)), false, AbstractC8411c.m8969c(-1746605133, c6021p, new C0885s(c10573b0, 21, interfaceC3759g)), c6021p, i14, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, gizmoStoreViewModel2, i10, 11);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8548g(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        c6021p.m6526U(-1486520597);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            AbstractC17758g.m19482b(c6021p, AbstractC9818V.m10458b(AbstractC10842a.m11237o(AbstractC10844c.m11253m(interfaceC10459q, AbstractC7313q.f23207l, AbstractC7313q.f23204i), 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), true, false, 0.0f, 14));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1648g(interfaceC10459q, i10, i11, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0063  */
    /* JADX WARN: Code duplicated, block: B:46:0x0073 A[PHI: r0 r1
      0x0073: PHI (r0v13 int) = (r0v7 int), (r0v6 int), (r0v14 int) binds: [B:50:0x007e, B:44:0x006f, B:45:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r1v8 float) = (r1v3 float), (r1v2 float), (r1v2 float) binds: [B:50:0x007e, B:44:0x006f, B:45:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m8549h(InterfaceC10459q interfaceC10459q, float f10, boolean z6, C6021p c6021p, int i10, int i11) {
        int i12;
        float f11;
        float f12;
        boolean z10;
        float f13;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(206278915);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                int i13 = c6021p.m6536c(f10) ? 32 : 16;
                i12 |= i13;
            } else {
                f11 = f10;
            }
            i12 |= i13;
        } else {
            f11 = f10;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c6021p.m6544g(z6) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if ((i11 & 2) != 0) {
                        f11 = AbstractC7312p.f23189f;
                        i12 &= -113;
                    }
                    if (i14 != 0) {
                        f12 = f11;
                        z10 = true;
                    }
                    c6021p.m6554q();
                    m8545d(AbstractC8411c.m8969c(-1291331426, c6021p, new C10565V(f12)), AbstractC10578f.f31422g, AbstractC8411c.m8969c(1680456924, c6021p, new C2509g(z10, 2)), interfaceC10459q, c6021p, ((i12 << 9) & 7168) | 438);
                    f13 = f12;
                    z6 = z10;
                } else {
                    c6021p.m6517L();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                }
                f12 = f11;
                z10 = z6;
                c6021p.m6554q();
                m8545d(AbstractC8411c.m8969c(-1291331426, c6021p, new C10565V(f12)), AbstractC10578f.f31422g, AbstractC8411c.m8969c(1680456924, c6021p, new C2509g(z10, 2)), interfaceC10459q, c6021p, ((i12 << 9) & 7168) | 438);
                f13 = f12;
                z6 = z10;
            } else {
                c6021p.m6517L();
                f13 = f11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10566W(interfaceC10459q, f13, z6, i10, i11);
            }
        }
        i12 |= 384;
        if ((i12 & 147) == 146) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if ((i11 & 2) != 0) {
                    f11 = AbstractC7312p.f23189f;
                    i12 &= -113;
                }
                if (i14 != 0) {
                    f12 = f11;
                    z10 = true;
                } else {
                    f12 = f11;
                    z10 = z6;
                }
            } else {
                if ((i11 & 2) != 0) {
                    f11 = AbstractC7312p.f23189f;
                    i12 &= -113;
                }
                if (i14 != 0) {
                    f12 = f11;
                    z10 = true;
                } else {
                    f12 = f11;
                    z10 = z6;
                }
            }
            c6021p.m6554q();
            m8545d(AbstractC8411c.m8969c(-1291331426, c6021p, new C10565V(f12)), AbstractC10578f.f31422g, AbstractC8411c.m8969c(1680456924, c6021p, new C2509g(z10, 2)), interfaceC10459q, c6021p, ((i12 << 9) & 7168) | 438);
            f13 = f12;
            z6 = z10;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if ((i11 & 2) != 0) {
                    f11 = AbstractC7312p.f23189f;
                    i12 &= -113;
                }
                if (i14 != 0) {
                    f12 = f11;
                    z10 = true;
                } else {
                    f12 = f11;
                    z10 = z6;
                }
            } else {
                if ((i11 & 2) != 0) {
                    f11 = AbstractC7312p.f23189f;
                    i12 &= -113;
                }
                if (i14 != 0) {
                    f12 = f11;
                    z10 = true;
                } else {
                    f12 = f11;
                    z10 = z6;
                }
            }
            c6021p.m6554q();
            m8545d(AbstractC8411c.m8969c(-1291331426, c6021p, new C10565V(f12)), AbstractC10578f.f31422g, AbstractC8411c.m8969c(1680456924, c6021p, new C2509g(z10, 2)), interfaceC10459q, c6021p, ((i12 << 9) & 7168) | 438);
            f13 = f12;
            z6 = z10;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10566W(interfaceC10459q, f13, z6, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m8550i(String str, String str2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        C5984W0 c5984w0;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1230262531);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12;
            if ((i13 & 147) == 146 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23199d).mo428M(interfaceC10459q3);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                c5984w0 = AbstractC3947L4.f12183a;
                InterfaceC10459q interfaceC10459q4 = interfaceC10459q3;
                AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, i13 & 14, 0, 65534);
                c6021p.m6524S(-2119031956);
                if (!AbstractC21322p.m21681O(str2)) {
                    AbstractC4124r4.m4768b(str2, null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, (i13 >> 3) & 14, 0, 65530);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC10459q2 = interfaceC10459q4;
            } else {
                c6021p.m6517L();
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) str, (Object) str2, interfaceC10459q2, i10, i11, 8);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12;
        if ((i13 & 147) == 146) {
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC10459q interfaceC10459qMo428M2 = AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23199d).mo428M(interfaceC10459q3);
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            c5984w0 = AbstractC3947L4.f12183a;
            InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
            AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, i13 & 14, 0, 65534);
            c6021p.m6524S(-2119031956);
            if (!AbstractC21322p.m21681O(str2)) {
                AbstractC4124r4.m4768b(str2, null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, (i13 >> 3) & 14, 0, 65530);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = interfaceC10459q5;
        } else {
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC10459q interfaceC10459qMo428M3 = AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23199d).mo428M(interfaceC10459q3);
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
            c5984w0 = AbstractC3947L4.f12183a;
            InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
            AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, i13 & 14, 0, 65534);
            c6021p.m6524S(-2119031956);
            if (!AbstractC21322p.m21681O(str2)) {
                AbstractC4124r4.m4768b(str2, null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, (i13 >> 3) & 14, 0, 65530);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = interfaceC10459q6;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) str, (Object) str2, interfaceC10459q2, i10, i11, 8);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8551j(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-1071817225);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
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
            AbstractC18967t abstractC18967t = (AbstractC18967t) AbstractC9112C3.m9642d(voiceEndedViewModel.f40343c, c6021p).getValue();
            InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11233k(AbstractC17758g.m19488j(AbstractC17758g.m19490l(c10456n)), AbstractC7313q.f23201f).mo428M(AbstractC10844c.f32512c);
            c6021p.m6524S(-1197365525);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-1197363751);
            boolean zM6542f2 = c6021p.m6542f(voiceEndedViewModel);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                objM6514H3 = new C18951d(voiceEndedViewModel, 0);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qMo428M, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H3, 28);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11208c);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
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
            interfaceC10459q = c10456n;
            AbstractC4034c4.m4725a(AbstractC10833a.m11209d(c10456n, false, null, C18952e.f60507Y, 6), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c, 0L, 0L, AbstractC7306j.f23143a, AbstractC7306j.f23145c, null, AbstractC8411c.m8969c(386912344, c6021p, new C18416d(abstractC18967t, 6, voiceEndedViewModel)), c6021p, 12582912, 76);
            c6021p.m6553p(true);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 18);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8552k(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1397171535);
        if (((i10 | 48) & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            for (int i11 = 0; i11 < 6; i11++) {
                AbstractC3984T1.m4687f(AbstractC9818V.m10458b(AbstractC10842a.m11234l(interfaceC10459q2, AbstractC7313q.f23201f, AbstractC7313q.f23198c), true, false, 0.0f, 14), null, null, null, null, AbstractC10578f.f31420e, c6021p, 196608, 30);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 29);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8553l(C0965N c0965n, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C14356l c14356l;
        Object next;
        int i12 = 0;
        c6021p.m6526U(-504768342);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c0965n) : c6021p.m6545h(c0965n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            long jM4722a = AbstractC4031c1.m4722a(c6021p);
            c6021p.m6524S(2114752437);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                C5551u.Companion.getClass();
                objM6514H = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c6021p.m6537c0(objM6514H);
            }
            C5551u c5551u = (C5551u) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(2114754122);
            boolean zM6542f = c6021p.m6542f(c5551u);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                C5525F.Companion.getClass();
                objM6514H2 = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a());
                c6021p.m6537c0(objM6514H2);
            }
            C5521B c5521b = (C5521B) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(2114757653);
            boolean zM6542f2 = c6021p.m6542f(c5551u);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                C21554a c21554a = C21555b.f68260Z;
                long jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.DAYS);
                c5551u.getClass();
                C5551u c5551uM5947c = c5551u.m5947c(C21555b.m21843m(jM8644j));
                C5525F.Companion.getClass();
                objM6514H3 = AbstractC8519M3.m9187a(c5551uM5947c, C5524E.m5924a());
                c6021p.m6537c0(objM6514H3);
            }
            C5521B c5521b2 = (C5521B) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(2114762797);
            boolean zM6540e = c6021p.m6540e(jM4722a);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6540e || objM6514H4 == obj) {
                objM6514H4 = new C0478i(jM4722a, i12);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10842a.m11237o(AbstractC10861a.m11295a(interfaceC10459q, (InterfaceC1436k) objM6514H4), AbstractC7313q.f23200e, 0.0f, 0.0f, 0.0f, 14), 0.0f, AbstractC7313q.f23197b, 1);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(6), C10444b.f30944w0, c6021p, 54);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C8258a c8258a = EnumC0474e.f1538p0;
            String url = c0965n.f2740c;
            c8258a.getClass();
            AbstractC16544l.m18094g(url, "url");
            Iterator it = EnumC0474e.f1541s0.iterator();
            while (true) {
                c14356l = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = ((EnumC0474e) next).f1542Y;
                if (str != null && AbstractC21322p.m21667A(url, str, false)) {
                    break;
                }
            }
            EnumC0474e enumC0474e = (EnumC0474e) next;
            if (enumC0474e == null) {
                enumC0474e = EnumC0474e.Other;
            }
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(enumC0474e.f1543Z, c6021p, 0);
            c6021p.m6524S(-2027816768);
            if (enumC0474e.f1544o0) {
                long j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                c14356l = new C14356l(j10, 5, Build.VERSION.SDK_INT >= 29 ? C14358n.f45047a.m15769a(j10, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5)));
            }
            c6021p.m6553p(false);
            AbstractC8473F.m9106a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), null, null, 0.0f, c14356l, c6021p, 48, 56);
            AbstractC4124r4.m4768b(c0965n.f2738a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, new C3582M(0L, AbstractC9119D4.m9650c(15), C5609y.f18152o0, 0L, 0, 0L, 16777209), c6021p, 0, 1575984, 55294);
            c6021p.m6553p(true);
            c6021p.m6524S(400947092);
            C3587c c3587c = new C3587c();
            c6021p.m6524S(400948246);
            int iM4296h = c3587c.m4296h(new C3573D(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                c3587c.m4291c(AbstractC5741w.m6165h(c0965n.f2741d, c5521b, c5521b2, c6021p));
                c3587c.m4291c(" • ");
                c3587c.m4293e(iM4296h);
                c6021p.m6553p(false);
                c3587c.m4291c(c0965n.f2739b);
                C3590f c3590fM4297i = c3587c.m4297i();
                c6021p.m6553p(false);
                AbstractC4124r4.m4769c(c3590fM4297i, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 131070);
                c6021p.m6553p(true);
            } catch (Throwable th2) {
                c3587c.m4293e(iM4296h);
                throw th2;
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(c0965n, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8554m(C11363S c11363s, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-2123711228);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c11363s) ? 4 : 2) | i10;
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
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-636396529);
            boolean z11 = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objM6514H = c6021p.m6514H();
            if (z11 || objM6514H == C6013l.f19514a) {
                objM6514H = new C4165y3(c11363s, z10, interfaceC1436k, z6);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(null, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 255);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3371i0(c11363s, z6, z10, interfaceC1436k, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r21v0, types: [O0.p] */
    /* JADX INFO: renamed from: n */
    public static final void m8555n(C10575c0 c10575c0, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        boolean z6;
        C11363S c11363s;
        c6021p.m6526U(1968056916);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6545h(c10575c0) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C11363S c11363s2 = c10575c0.f31411c;
            if (c11363s2 == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10557M(c10575c0, interfaceC1436k, i10, 1);
                    return;
                }
                return;
            }
            m8550i(c11363s2.f34362d, c11363s2.f34363e, null, c6021p, 0, 4);
            C11364T c11364t = c11363s2.f34359a;
            boolean z10 = c11364t.f34367d;
            boolean z11 = false;
            List list = c11363s2.f34360b;
            if (z10) {
                c6021p.m6524S(-100662762);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m8543b(c11364t, (C11349D) it.next(), interfaceC1436k, c6021p, (i12 << 3) & 896);
                }
                c6021p.m6553p(false);
                z6 = false;
                c11363s = c11363s2;
            } else {
                c6021p.m6524S(-100537584);
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    m8542a(c11363s2.f34359a, (C11349D) obj, interfaceC1436k, c11363s2, i13, false, c6021p, ((i12 << 3) & 896) | 196608);
                    z11 = z11;
                    c11363s2 = c11363s2;
                    i13 = i14;
                }
                z6 = z11;
                c11363s = c11363s2;
                c6021p.m6553p(z6);
            }
            boolean z12 = c10575c0.f31410b instanceof C21917G1;
            C10456n c10456n = C10456n.f30959Y;
            if (z12) {
                c6021p.m6524S(-100313795);
                for (?? r13 = z6; r13 < 3; r13++) {
                    m8549h(AbstractC10842a.m11237o(c10456n, AbstractC7313q.f23203h, 0.0f, 0.0f, 0.0f, 14), 0.0f, false, c6021p, 0, 6);
                }
                c6021p.m6553p(z6);
            } else if (c11363s.f34361c != null) {
                c6021p.m6524S(-100097787);
                String strM8676d = AbstractC8142m4.m8676d(R.string.gizmos_store_see_more, c6021p);
                c6021p.m6524S(2074985586);
                boolean zM6545h = c6021p.m6545h(interfaceC20904w) | ((i12 & 112) == 32 ? true : z6) | c6021p.m6542f(c11363s);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C6959q(interfaceC20904w, interfaceC1436k, c11363s, 10);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(z6);
                AbstractC9715D3.m10307a(strM8676d, false, (InterfaceC1426a) objM6514H, AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23199d, 0.0f, 2), c6021p, 48);
                c6021p.m6553p(z6);
            } else {
                c6021p.m6524S(-99721075);
                c6021p.m6553p(z6);
            }
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C10557M(c10575c0, interfaceC1436k, i10, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m8556o(List list, C10575c0 c10575c0, C11364T c11364t, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        Object obj;
        int i11;
        boolean z6;
        String str;
        InterfaceC10459q interfaceC10459q2;
        List list2;
        c6021p.m6526U(-410935479);
        int i12 = (i10 & 6) == 0 ? (c6021p.m6545h(list) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(c10575c0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c11364t) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i13 = i12 | 24576;
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM9122c = AbstractC8479G.m9122c(c10456n, AbstractC8479G.m9124e(c6021p));
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23199d;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f10), C10444b.f30943v0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9122c);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, f10));
            C4105o3 c4105o3M4743a = AbstractC4073j1.m4743a(c6021p);
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            long j10 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12213a;
            long j11 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12215b;
            long j12 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12215b;
            long j13 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12217c;
            long j14 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12219d;
            long j15 = ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12219d;
            if (j13 == 16) {
                j13 = c4105o3M4743a.f13169a;
            }
            long j16 = j13;
            if (j14 == 16) {
                j14 = c4105o3M4743a.f13170b;
            }
            long j17 = j14;
            if (j15 == 16) {
                j15 = c4105o3M4743a.f13171c;
            }
            long j18 = j15;
            if (j10 == 16) {
                j10 = c4105o3M4743a.f13177i;
            }
            long j19 = j10;
            if (j11 == 16) {
                j11 = c4105o3M4743a.f13179k;
            }
            long j20 = j11;
            if (j12 == 16) {
                j12 = c4105o3M4743a.f13180l;
            }
            C4105o3 c4105o3 = new C4105o3(j16, j17, j18, c4105o3M4743a.f13172d, c4105o3M4743a.f13173e, c4105o3M4743a.f13174f, c4105o3M4743a.f13175g, c4105o3M4743a.f13176h, j19, c4105o3M4743a.f13178j, j20, j12, c4105o3M4743a.f13181m);
            boolean z10 = c11364t == null;
            c6021p.m6524S(-530128441);
            int i15 = i13 & 7168;
            boolean z11 = i15 == 2048;
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (z11 || objM6514H == obj2) {
                objM6514H = new C10312h(2, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3943L0.m4645c(z10, (InterfaceC1426a) objM6514H, AbstractC10578f.f31417b, null, false, null, null, null, c4105o3, null, null, null, c6021p, 384, 6, 2808);
            if (c10575c0.f31409a instanceof C21921H1) {
                c6021p.m6524S(746195655);
                C11363S c11363s = c10575c0.f31411c;
                if (c11363s == null || (list2 = c11363s.f34360b) == null || !(!list2.isEmpty())) {
                    obj = obj2;
                    i11 = i15;
                    z6 = false;
                } else {
                    boolean zM18089b = AbstractC16544l.m18089b(c11364t != null ? c11364t.f34364a : null, ((C11363S) ((C21921H1) c10575c0.f31409a).f69472a).f34359a.f34364a);
                    c6021p.m6524S(-530112511);
                    boolean zM6545h = (i15 == 2048) | c6021p.m6545h(c10575c0);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == obj2) {
                        objM6514H2 = new C8816z(interfaceC1436k, 12, c10575c0);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    z6 = false;
                    obj = obj2;
                    i11 = i15;
                    AbstractC3943L0.m4645c(zM18089b, (InterfaceC1426a) objM6514H2, AbstractC10578f.f31418c, null, false, AbstractC10578f.f31419d, null, null, c4105o3, null, null, null, c6021p, 196992, 6, 2776);
                }
                c6021p.m6553p(z6);
                str = null;
            } else {
                obj = obj2;
                i11 = i15;
                z6 = false;
                c6021p.m6524S(-530092763);
                str = null;
                m8548g(0, 1, c6021p, null);
                c6021p.m6553p(false);
            }
            c6021p.m6524S(-530091253);
            ArrayList<C11363S> arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C11363S c11363s2 = ((C10575c0) it.next()).f31411c;
                if (c11363s2 != null) {
                    arrayList.add(c11363s2);
                }
            }
            for (C11363S c11363s3 : arrayList) {
                boolean zM18089b2 = AbstractC16544l.m18089b(c11364t != null ? c11364t.f34364a : str, c11363s3.f34359a.f34364a);
                c6021p.m6524S(-530085781);
                int i16 = i11;
                boolean zM6542f = c6021p.m6542f(c11363s3) | (i16 == 2048 ? true : z6);
                Object objM6514H3 = c6021p.m6514H();
                Object obj3 = obj;
                if (zM6542f || objM6514H3 == obj3) {
                    objM6514H3 = new C8816z(interfaceC1436k, 13, c11363s3);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(z6);
                AbstractC3943L0.m4645c(zM18089b2, (InterfaceC1426a) objM6514H3, AbstractC8411c.m8969c(1968738800, c6021p, new C7443a0(c11363s3, 8)), null, false, null, null, null, c4105o3, null, null, null, c6021p, 384, 6, 2808);
                obj = obj3;
                i11 = i16;
                str = str;
            }
            c6021p.m6553p(z6);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23199d));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(list, c10575c0, c11364t, interfaceC1436k, interfaceC10459q2, i10, 10);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m8557p(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11 = 0;
        c6021p.m6526U(-614854334);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(interfaceC10459q, AbstractC7313q.f23201f, 0.0f, 2);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(830749044);
            for (int i13 = 0; i13 < 4; i13++) {
                m8548g(0, 0, c6021p, c17785t0.m19513a(interfaceC10459q, 1.0f, true));
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, i11);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m8558q(int i10, C6021p c6021p) {
        c6021p.m6526U(-144477937);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m8550i("category title", "description of the category", AbstractC9818V.m10458b(C10456n.f30959Y, true, true, 0.0f, 12), c6021p, 54, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 17);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m8559r(C10571a0 c10571a0, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(585997896);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c10571a0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object obj = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C10575c0 c10575c0 = c10571a0.f31387b;
            Object obj2 = c10575c0.f31411c;
            c6021p.m6524S(1535426980);
            boolean zM6542f = c6021p.m6542f(obj2) | c6021p.m6545h(c10575c0) | c6021p.m6545h(obj) | c6021p.m6545h(c10571a0) | ((i12 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                Object c0362w = new C0362w(obj2, (Object) c10575c0, obj, (Object) c10571a0, interfaceC1436k, 5);
                c6021p.m6537c0(c0362w);
                objM6514H = c0362w;
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(interfaceC10459q, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, (i12 >> 6) & 14, 254);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c10571a0, interfaceC1436k, interfaceC10459q, i10, 7);
        }
    }
}
