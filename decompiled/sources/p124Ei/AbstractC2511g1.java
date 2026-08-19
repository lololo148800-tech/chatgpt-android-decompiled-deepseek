package p124Ei;

import android.app.Activity;
import android.content.Context;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import androidx.compose.animation.AbstractC10832b;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.feature.voice.impl.VoiceModeViewModelImpl;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.VoiceModeScreenKt$VoiceModeScreen$$inlined$injectViewModel$1;
import com.openai.voice.VoiceModeViewModel;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p000.C17122m;
import p002A0.C0122V;
import p002A0.C0136m;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0184L0;
import p003A1.C0248f0;
import p003A1.C0257i0;
import p003A1.C0286s;
import p003A1.C0292u;
import p006A4.C0339D;
import p017Af.C0459F;
import p017Af.C0494y;
import p021Aj.C0537v;
import p025An.C0644w;
import p042Bf.C1269k;
import p042Bf.C1282x;
import p045Bj.C1307e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1789X;
import p098Di.InterfaceC2062k;
import p1025te.C19866Q;
import p103Dn.InterfaceC2184i;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21902C2;
import p1155zi.C22025k2;
import p1155zi.C22069v2;
import p1155zi.C22081y2;
import p148Fi.AbstractC2792U0;
import p148Fi.C2816e0;
import p148Fi.C2825h0;
import p148Fi.C2834k0;
import p148Fi.C2861x;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4033c3;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3911F4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p273Kl.C4727J0;
import p327N0.C5571a;
import p327N0.C5572b;
import p344Nl.C5842n;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p365Oi.C6256d;
import p385Pj.C6427b;
import p387Pl.C6501u;
import p429Re.C6877k;
import p478Tc.AbstractC7308l;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC7925K4;
import p523V9.AbstractC7941M4;
import p523V9.AbstractC7949N4;
import p523V9.AbstractC7957O4;
import p523V9.AbstractC7965P4;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8198t4;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8467E;
import p544W9.AbstractC8531O3;
import p544W9.AbstractC8571V2;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8745y2;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9236X2;
import p571X9.AbstractC9243Y3;
import p571X9.AbstractC9245Z;
import p571X9.AbstractC9274d4;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9830X;
import p594Y9.AbstractC9856b0;
import p594Y9.AbstractC9873d3;
import p594Y9.AbstractC9997x4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14327E;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17725F;
import p911o0.C17781r0;
import p911o0.C17790w;
import p926of.C18160X;

/* JADX INFO: renamed from: Ei.g1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2511g1 {

    /* JADX INFO: renamed from: a */
    public static final float f7806a;

    /* JADX INFO: renamed from: b */
    public static final float f7807b;

    /* JADX INFO: renamed from: c */
    public static final float f7808c;

    /* JADX INFO: renamed from: d */
    public static final float f7809d;

    /* JADX INFO: renamed from: e */
    public static final long f7810e;

    static {
        float f10 = AbstractC7313q.f23196a;
        f7806a = AbstractC7313q.f23201f;
        f7807b = AbstractC7313q.f23203h;
        f7808c = 252;
        f7809d = AbstractC7313q.f23198c;
        f7810e = AbstractC14334L.m15625c(1714434096);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x020a  */
    /* JADX WARN: Code duplicated, block: B:126:0x021e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0232  */
    /* JADX WARN: Code duplicated, block: B:130:0x0236  */
    /* JADX WARN: Code duplicated, block: B:132:0x023b  */
    /* JADX WARN: Code duplicated, block: B:133:0x023f  */
    /* JADX WARN: Code duplicated, block: B:136:0x024d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0251  */
    /* JADX WARN: Code duplicated, block: B:139:0x0256  */
    /* JADX WARN: Code duplicated, block: B:140:0x0258  */
    /* JADX WARN: Code duplicated, block: B:143:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0267  */
    /* JADX WARN: Code duplicated, block: B:147:0x0292  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:163:0x0307  */
    /* JADX WARN: Code duplicated, block: B:164:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0312  */
    /* JADX WARN: Code duplicated, block: B:171:0x034d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0359  */
    /* JADX WARN: Code duplicated, block: B:175:0x0371  */
    /* JADX WARN: Code duplicated, block: B:179:0x038a  */
    /* JADX WARN: Code duplicated, block: B:180:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0395  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX INFO: renamed from: a */
    public static final void m3589a(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        C5975S c5975s;
        C5975S c5975s2;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        Object objM6514H;
        C11709i c11709i;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        int i17;
        boolean z13;
        boolean zM6545h;
        Object objM6514H2;
        InterfaceC7678d interfaceC7678dM10507b;
        InterfaceC7678d interfaceC7678d;
        Object objM6514H3;
        InterfaceC5985X interfaceC5985X;
        boolean z14;
        boolean z15;
        Object objM6514H4;
        boolean z16;
        Object objM6514H5;
        int i18;
        C5975S c5975s3;
        C6021p c6021p2;
        boolean z17;
        int i19;
        Object objM6514H6;
        int i20;
        Object objM6514H7;
        C22069v2 c22069v2;
        boolean z18;
        C2825h0 c2825h0;
        C2861x c2861x;
        c6021p.m6526U(-1161906548);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
        }
        int i21 = i11;
        if ((i21 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i22 = i21 & 14;
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(c2532n1, c6021p);
            c6021p.m6524S(1627320190);
            C5975S c5975s4 = C6013l.f19514a;
            if (c2532n1.f7887S) {
                C2816e0 c2816e0 = c2532n1.f7870B;
                if (c2816e0 == null || !c2816e0.f8551b) {
                    C21902C2 c21902c2 = c2532n1.f7897d;
                    if (c21902c2 != null) {
                        C22081y2 c22081y2M22334b = c21902c2.m22334b();
                        z18 = (c22081y2M22334b == null || (c22069v2 = c22081y2M22334b.f69809h) == null) ? false : AbstractC16544l.m18089b(c22069v2.f69770a, Boolean.TRUE) ? false : true;
                    }
                }
                C2834k0 c2834k0 = c2532n1.f7869A;
                C22025k2 c22025k2 = (c2834k0 == null || (c2825h0 = c2834k0.f8573c) == null || (c2861x = c2825h0.f8564b) == null) ? null : c2861x.f8631c;
                EnumC2470P enumC2470P = EnumC2470P.f7698Y;
                c6021p.m6524S(1627330555);
                boolean zM6544g = ((i21 & 112) == 32) | c6021p.m6544g(z18) | c6021p.m6542f(c22025k2) | (i22 == 4);
                Object objM6514H8 = c6021p.m6514H();
                if (zM6544g || objM6514H8 == c5975s4) {
                    objM6514H8 = new C2457I0(z18, c22025k2, c2532n1, interfaceC1436k, 0);
                    c6021p.m6537c0(objM6514H8);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H8;
                c6021p.m6553p(false);
                boolean z19 = c2532n1.f7902i;
                boolean z20 = c2532n1.f7900g;
                boolean z21 = z19 || z20;
                z6 = true;
                z10 = false;
                AbstractC7957O4.m8242b(interfaceC1426a3, null, z20, z21, false, z18, c6021p, 390, 0);
            } else {
                interfaceC5985XM6435V = interfaceC5985XM6435V;
                i22 = i22;
                i21 = i21;
                c5975s4 = c5975s4;
                z6 = true;
                z10 = false;
            }
            c6021p.m6553p(z10);
            EnumC2470P enumC2470P2 = EnumC2470P.f7699Z;
            boolean z22 = c2532n1.f7899f;
            if (z22 == z6) {
                i12 = R.drawable.mic_filled_off;
            } else {
                if (z22) {
                    throw new C0644w();
                }
                i12 = R.drawable.mic_filled;
            }
            int i23 = i12;
            boolean z23 = !z22;
            if (z22 == z6) {
                i13 = R.string.voice_state_hint_unmute_microphone;
            } else {
                if (z22) {
                    throw new C0644w();
                }
                i13 = R.string.voice_state_hint_mute_microphone;
            }
            int i24 = i13;
            c6021p.m6524S(1627378594);
            int i25 = i21;
            int i26 = i25 & 112;
            boolean z24 = i26 == 32 ? z6 : z10;
            InterfaceC5985X interfaceC5985X2 = interfaceC5985XM6435V;
            boolean zM6542f = z24 | c6021p.m6542f(interfaceC5985X2);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6542f) {
                c5975s = c5975s4;
            } else {
                c5975s = c5975s4;
                if (objM6514H9 == c5975s) {
                }
                c6021p.m6553p(z10);
                c5975s2 = c5975s;
                AbstractC7957O4.m8243c(enumC2470P2, i23, i24, null, null, (InterfaceC1439n) objM6514H9, z23, false, false, false, c6021p, 6, 920);
                c6021p.m6524S(1627401764);
                if (!c2532n1.f7889U || c2532n1.f7888T) {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, z10);
                    i14 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(661678648);
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == c5975s2) {
                        objM6514H = new C11709i(r15, 3);
                        c6021p.m6537c0(objM6514H);
                    }
                    c11709i = (C11709i) objM6514H;
                    c6021p.m6553p(z10);
                    EnumC2470P enumC2470P3 = EnumC2470P.f7698Y;
                    z11 = c2532n1.f7918y;
                    if (z11) {
                        i15 = R.drawable.share_screen_filled;
                    } else {
                        i15 = R.drawable.dots_horizontal;
                    }
                    if (z11) {
                        i16 = R.string.stop_sharing_screen;
                    } else {
                        i16 = R.string.voice_state_hint_attach_other;
                    }
                    c6021p.m6524S(661699006);
                    if (i22 == 4) {
                        i17 = 32;
                        z12 = true;
                    } else {
                        z12 = z10;
                        i17 = 32;
                    }
                    if (i26 == i17) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    zM6545h = z13 | z12 | c6021p.m6545h(c11709i);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == c5975s2) {
                        objM6514H2 = new C0146w(c2532n1, interfaceC1436k, c11709i, 13);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(z10);
                    AbstractC7957O4.m8243c(enumC2470P3, i15, i16, null, (InterfaceC1436k) objM6514H2, null, z11, false, false, false, c6021p, 6, 936);
                    if (Build.VERSION.SDK_INT >= 33) {
                        c6021p.m6524S(-961717637);
                        interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                        c6021p.m6553p(z10);
                    } else {
                        c6021p.m6524S(-961605789);
                        interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                        c6021p.m6553p(z10);
                    }
                    interfaceC7678d = interfaceC7678dM10507b;
                    c6021p.m6524S(661720861);
                    objM6514H3 = c6021p.m6514H();
                    if (objM6514H3 == c5975s2) {
                        objM6514H3 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H3);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H3;
                    c6021p.m6553p(z10);
                    c6021p.m6524S(661729163);
                    boolean zM6542f2 = c6021p.m6542f(interfaceC7678d);
                    if ((i25 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    z15 = zM6542f2 | z14;
                    objM6514H4 = c6021p.m6514H();
                    if (z15 || objM6514H4 == c5975s2) {
                        objM6514H4 = new C0155B1(interfaceC7678d, interfaceC1426a, interfaceC5985X, 11);
                        c6021p.m6537c0(objM6514H4);
                    }
                    InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H4;
                    c6021p.m6553p(z10);
                    c6021p.m6524S(661747848);
                    if (i26 == 32) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    objM6514H5 = c6021p.m6514H();
                    if (z16 || objM6514H5 == c5975s2) {
                        objM6514H5 = new C0459F(5, interfaceC1436k);
                        c6021p.m6537c0(objM6514H5);
                    }
                    c6021p.m6553p(z10);
                    i18 = i26;
                    c5975s3 = c5975s2;
                    c6021p2 = c6021p;
                    m3590b(c2532n1, c11709i, interfaceC1426a4, interfaceC1426a2, (InterfaceC1426a) objM6514H5, null, c6021p, i25 & 7182);
                    c6021p2.m6524S(661751460);
                    if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                        c6021p2.m6524S(661759332);
                        objM6514H6 = c6021p.m6514H();
                        if (objM6514H6 == c5975s3) {
                            objM6514H6 = new C0339D(interfaceC5985X, 7);
                            c6021p2.m6537c0(objM6514H6);
                        }
                        z17 = false;
                        c6021p2.m6553p(false);
                        AbstractC9830X.m10473b(interfaceC7678d, R.string.voice_permission_rationale, (InterfaceC1426a) objM6514H6, c6021p2, 384);
                    } else {
                        z17 = false;
                    }
                    c6021p2.m6553p(z17);
                    i19 = 1;
                    c6021p2.m6553p(true);
                } else {
                    z17 = z10;
                    i18 = i26;
                    c5975s3 = c5975s2;
                    c6021p2 = c6021p;
                    i19 = 1;
                }
                c6021p2.m6553p(z17);
                EnumC2470P enumC2470P4 = EnumC2470P.f7698Y;
                c6021p2.m6524S(1627494464);
                if (i18 == 32) {
                    i20 = i19;
                } else {
                    i20 = 0;
                }
                objM6514H7 = c6021p.m6514H();
                if (i20 == 0 || objM6514H7 == c5975s3) {
                    objM6514H7 = new C0537v(i19, interfaceC1436k);
                    c6021p2.m6537c0(objM6514H7);
                }
                c6021p2.m6553p(false);
                AbstractC7957O4.m8243c(enumC2470P4, R.drawable.close_bold, R.string.voice_state_end_description, null, (InterfaceC1436k) objM6514H7, null, false, c2532n1.f7901h, false, false, c6021p, 6, 872);
            }
            objM6514H9 = new C2459J0(interfaceC1436k, interfaceC5985X2, 0);
            c6021p.m6537c0(objM6514H9);
            c6021p.m6553p(z10);
            c5975s2 = c5975s;
            AbstractC7957O4.m8243c(enumC2470P2, i23, i24, null, null, (InterfaceC1439n) objM6514H9, z23, false, false, false, c6021p, 6, 920);
            c6021p.m6524S(1627401764);
            if (c2532n1.f7889U) {
                C10456n c10456n2 = C10456n.f30959Y;
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, z10);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                } else {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                c6021p.m6524S(661678648);
                objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s2) {
                    objM6514H = new C11709i(r15, 3);
                    c6021p.m6537c0(objM6514H);
                }
                c11709i = (C11709i) objM6514H;
                c6021p.m6553p(z10);
                EnumC2470P enumC2470P5 = EnumC2470P.f7698Y;
                z11 = c2532n1.f7918y;
                if (z11) {
                    i15 = R.drawable.share_screen_filled;
                } else {
                    i15 = R.drawable.dots_horizontal;
                }
                if (z11) {
                    i16 = R.string.stop_sharing_screen;
                } else {
                    i16 = R.string.voice_state_hint_attach_other;
                }
                c6021p.m6524S(661699006);
                if (i22 == 4) {
                    i17 = 32;
                    z12 = true;
                } else {
                    z12 = z10;
                    i17 = 32;
                }
                if (i26 == i17) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                zM6545h = z13 | z12 | c6021p.m6545h(c11709i);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H2 = new C0146w(c2532n1, interfaceC1436k, c11709i, 13);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C0146w(c2532n1, interfaceC1436k, c11709i, 13);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(z10);
                AbstractC7957O4.m8243c(enumC2470P5, i15, i16, null, (InterfaceC1436k) objM6514H2, null, z11, false, false, false, c6021p, 6, 936);
                if (Build.VERSION.SDK_INT >= 33) {
                    c6021p.m6524S(-961717637);
                    interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                    c6021p.m6553p(z10);
                } else {
                    c6021p.m6524S(-961605789);
                    interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                    c6021p.m6553p(z10);
                }
                interfaceC7678d = interfaceC7678dM10507b;
                c6021p.m6524S(661720861);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s2) {
                    objM6514H3 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H3;
                c6021p.m6553p(z10);
                c6021p.m6524S(661729163);
                boolean zM6542f3 = c6021p.m6542f(interfaceC7678d);
                if ((i25 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                z15 = zM6542f3 | z14;
                objM6514H4 = c6021p.m6514H();
                if (z15) {
                    objM6514H4 = new C0155B1(interfaceC7678d, interfaceC1426a, interfaceC5985X, 11);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C0155B1(interfaceC7678d, interfaceC1426a, interfaceC5985X, 11);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H4;
                c6021p.m6553p(z10);
                c6021p.m6524S(661747848);
                if (i26 == 32) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                objM6514H5 = c6021p.m6514H();
                if (z16) {
                    objM6514H5 = new C0459F(5, interfaceC1436k);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C0459F(5, interfaceC1436k);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(z10);
                i18 = i26;
                c5975s3 = c5975s2;
                c6021p2 = c6021p;
                m3590b(c2532n1, c11709i, interfaceC1426a5, interfaceC1426a2, (InterfaceC1426a) objM6514H5, null, c6021p, i25 & 7182);
                c6021p2.m6524S(661751460);
                if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    c6021p2.m6524S(661759332);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == c5975s3) {
                        objM6514H6 = new C0339D(interfaceC5985X, 7);
                        c6021p2.m6537c0(objM6514H6);
                    }
                    z17 = false;
                    c6021p2.m6553p(false);
                    AbstractC9830X.m10473b(interfaceC7678d, R.string.voice_permission_rationale, (InterfaceC1426a) objM6514H6, c6021p2, 384);
                } else {
                    z17 = false;
                }
                c6021p2.m6553p(z17);
                i19 = 1;
                c6021p2.m6553p(true);
            } else {
                C10456n c10456n3 = C10456n.f30959Y;
                InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, z10);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                } else {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(661678648);
                objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s2) {
                    objM6514H = new C11709i(r15, 3);
                    c6021p.m6537c0(objM6514H);
                }
                c11709i = (C11709i) objM6514H;
                c6021p.m6553p(z10);
                EnumC2470P enumC2470P6 = EnumC2470P.f7698Y;
                z11 = c2532n1.f7918y;
                if (z11) {
                    i15 = R.drawable.share_screen_filled;
                } else {
                    i15 = R.drawable.dots_horizontal;
                }
                if (z11) {
                    i16 = R.string.stop_sharing_screen;
                } else {
                    i16 = R.string.voice_state_hint_attach_other;
                }
                c6021p.m6524S(661699006);
                if (i22 == 4) {
                    i17 = 32;
                    z12 = true;
                } else {
                    z12 = z10;
                    i17 = 32;
                }
                if (i26 == i17) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                zM6545h = z13 | z12 | c6021p.m6545h(c11709i);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H2 = new C0146w(c2532n1, interfaceC1436k, c11709i, 13);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C0146w(c2532n1, interfaceC1436k, c11709i, 13);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(z10);
                AbstractC7957O4.m8243c(enumC2470P6, i15, i16, null, (InterfaceC1436k) objM6514H2, null, z11, false, false, false, c6021p, 6, 936);
                if (Build.VERSION.SDK_INT >= 33) {
                    c6021p.m6524S(-961717637);
                    interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                    c6021p.m6553p(z10);
                } else {
                    c6021p.m6524S(-961605789);
                    interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                    c6021p.m6553p(z10);
                }
                interfaceC7678d = interfaceC7678dM10507b;
                c6021p.m6524S(661720861);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s2) {
                    objM6514H3 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H3;
                c6021p.m6553p(z10);
                c6021p.m6524S(661729163);
                boolean zM6542f4 = c6021p.m6542f(interfaceC7678d);
                if ((i25 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                z15 = zM6542f4 | z14;
                objM6514H4 = c6021p.m6514H();
                if (z15) {
                    objM6514H4 = new C0155B1(interfaceC7678d, interfaceC1426a, interfaceC5985X, 11);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C0155B1(interfaceC7678d, interfaceC1426a, interfaceC5985X, 11);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H4;
                c6021p.m6553p(z10);
                c6021p.m6524S(661747848);
                if (i26 == 32) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                objM6514H5 = c6021p.m6514H();
                if (z16) {
                    objM6514H5 = new C0459F(5, interfaceC1436k);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C0459F(5, interfaceC1436k);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(z10);
                i18 = i26;
                c5975s3 = c5975s2;
                c6021p2 = c6021p;
                m3590b(c2532n1, c11709i, interfaceC1426a6, interfaceC1426a2, (InterfaceC1426a) objM6514H5, null, c6021p, i25 & 7182);
                c6021p2.m6524S(661751460);
                if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    c6021p2.m6524S(661759332);
                    objM6514H6 = c6021p.m6514H();
                    if (objM6514H6 == c5975s3) {
                        objM6514H6 = new C0339D(interfaceC5985X, 7);
                        c6021p2.m6537c0(objM6514H6);
                    }
                    z17 = false;
                    c6021p2.m6553p(false);
                    AbstractC9830X.m10473b(interfaceC7678d, R.string.voice_permission_rationale, (InterfaceC1426a) objM6514H6, c6021p2, 384);
                } else {
                    z17 = false;
                }
                c6021p2.m6553p(z17);
                i19 = 1;
                c6021p2.m6553p(true);
            }
            c6021p2.m6553p(z17);
            EnumC2470P enumC2470P7 = EnumC2470P.f7698Y;
            c6021p2.m6524S(1627494464);
            if (i18 == 32) {
                i20 = i19;
            } else {
                i20 = 0;
            }
            objM6514H7 = c6021p.m6514H();
            if (i20 == 0) {
                objM6514H7 = new C0537v(i19, interfaceC1436k);
                c6021p2.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new C0537v(i19, interfaceC1436k);
                c6021p2.m6537c0(objM6514H7);
            }
            c6021p2.m6553p(false);
            AbstractC7957O4.m8243c(enumC2470P7, R.drawable.close_bold, R.string.voice_state_end_description, null, (InterfaceC1436k) objM6514H7, null, false, c2532n1.f7901h, false, false, c6021p, 6, 872);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 3, c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3590b(C2532n1 c2532n1, C11709i popupMenuState, InterfaceC1426a onRequestScreenShare, InterfaceC1426a onRequestUploadPhoto, InterfaceC1426a onRequestTakePhoto, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(onRequestScreenShare, "onRequestScreenShare");
        AbstractC16544l.m18094g(onRequestUploadPhoto, "onRequestUploadPhoto");
        AbstractC16544l.m18094g(onRequestTakePhoto, "onRequestTakePhoto");
        c6021p.m6526U(-1623905704);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onRequestScreenShare) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onRequestUploadPhoto) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onRequestTakePhoto) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            AbstractC8198t4.m8798a(popupMenuState, interfaceC10459q2, AbstractC8411c.m8969c(244564315, c6021p, new C2494b(c2532n1, onRequestScreenShare, popupMenuState, onRequestUploadPhoto, onRequestTakePhoto)), c6021p, ((i12 >> 3) & 14) | 384 | ((i12 >> 12) & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c2532n1, popupMenuState, onRequestScreenShare, onRequestUploadPhoto, onRequestTakePhoto, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3591c(InterfaceC1426a onRequestTakePhoto, C11709i popupMenuState, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        C6021p c6021p2;
        boolean z11;
        AbstractC16544l.m18094g(onRequestTakePhoto, "onRequestTakePhoto");
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        c6021p.m6526U(-1287174430);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onRequestTakePhoto) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            z11 = z6;
        } else {
            c6021p.m6524S(-92575828);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-92570697);
            int i13 = i12 & 14;
            int i14 = i12 & 112;
            boolean z12 = (i13 == 4) | (i14 == 32 || ((i12 & 64) != 0 && c6021p.m6545h(popupMenuState)));
            Object objM6514H2 = c6021p.m6514H();
            if (z12 || objM6514H2 == c5975s) {
                objM6514H2 = new C0122V(onRequestTakePhoto, 26, popupMenuState);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC7678d interfaceC7678dM10508c = AbstractC9856b0.m10508c("android.permission.CAMERA", (InterfaceC1436k) objM6514H2, c6021p, 6, 0);
            c6021p.m6524S(-92565565);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(-92563224);
                Object objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C0248f0(interfaceC5985X, 10);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-92561411);
                boolean zM6542f = c6021p.m6542f(interfaceC7678dM10508c);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6542f || objM6514H4 == c5975s) {
                    objM6514H4 = new C2462L(1, interfaceC7678dM10508c);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H4, AbstractC8142m4.m8676d(R.string.camera_permission_rationale, c6021p), "camera_permission_request", 0L, null, false, null, c6021p, 3078, 240);
                z10 = false;
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            C8410b c8410b = AbstractC2547v.f7952e;
            c6021p.m6524S(-92551088);
            boolean zM6542f2 = c6021p.m6542f(interfaceC7678dM10508c) | (i13 == 4 ? true : z10) | ((i14 == 32 || ((i12 & 64) != 0 && c6021p.m6545h(popupMenuState))) ? true : z10);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f2 || objM6514H5 == c5975s) {
                c6021p2 = c6021p;
                objM6514H5 = new C0494y(interfaceC7678dM10508c, onRequestTakePhoto, popupMenuState, interfaceC5985X, 4);
                c6021p2.m6537c0(objM6514H5);
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(z10);
            AbstractC4101o.m4761b(c8410b, (InterfaceC1426a) objM6514H5, interfaceC10459q, AbstractC2547v.f7953f, null, true, null, null, null, c6021p, (i12 & 896) | 3078 | (458752 & (i12 << 6)), 464);
            z11 = true;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(onRequestTakePhoto, popupMenuState, interfaceC10459q, z11, i10, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m3592d(InterfaceC5982V0 interfaceC5982V0) {
        return ((Number) interfaceC5982V0.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: e */
    public static final void m3593e(int i10, InterfaceC1436k onDismiss, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        InterfaceC1436k interfaceC1436k;
        InterfaceC10459q interfaceC10459q2;
        boolean z6;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(1018202333);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            interfaceC1436k = onDismiss;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            c6021p.m6524S(-843121123);
            int i13 = i12 & 14;
            boolean z10 = i13 == 4;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z10 || objM6514H == obj) {
                objM6514H = new C0537v(2, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
            AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
            List list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
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
            Object objMo5693b = c16527d.mo5693b(VoiceModeViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C2532n1.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context2, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM14398a);
                objM6514H2 = objM14398a;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k2, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new VoiceModeScreenKt$VoiceModeScreen$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            VoiceModeViewModel voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
            c6021p.m6524S(-1020152108);
            Context context3 = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            List list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            Object objMo5693b3 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b4 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f2 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H4 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H4);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H4;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            c6021p.m6553p(false);
            Object obj2 = (MessagesViewModel) baseViewModel2;
            Object systemService = context.getSystemService("media_projection");
            AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Object obj3 = (MediaProjectionManager) systemService;
            C6427b c6427b = new C6427b(7);
            c6021p.m6524S(-843107201);
            boolean zM6545h2 = c6021p.m6545h(context) | c6021p.m6545h(voiceModeViewModel);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h2 || objM6514H5 == obj) {
                objM6514H5 = new C0122V(context, 27, voiceModeViewModel);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            Object objM9235b = AbstractC8571V2.m9235b(c6427b, (InterfaceC1436k) objM6514H5, c6021p, 0);
            C2532n1 c2532n1 = (C2532n1) AbstractC9112C3.m9642d(voiceModeViewModel.f40343c, c6021p).getValue();
            AbstractC7965P4.m8250a(0, c6021p, c2532n1.f7917x);
            AbstractC9243Y3.m9817a(0, c6021p);
            c6021p.m6524S(-843087142);
            boolean zM6545h3 = c6021p.m6545h(voiceModeViewModel);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6545h3 || objM6514H6 == obj) {
                objM6514H6 = new C2469O0(voiceModeViewModel, 0);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H6;
            c6021p.m6553p(false);
            c6021p.m6524S(-843084343);
            boolean z11 = i13 == 4;
            Object objM6514H7 = c6021p.m6514H();
            if (z11 || objM6514H7 == obj) {
                interfaceC1436k = onDismiss;
                objM6514H7 = new C0459F(6, interfaceC1436k);
                c6021p.m6537c0(objM6514H7);
            } else {
                interfaceC1436k = onDismiss;
            }
            c6021p.m6553p(false);
            AbstractC8011V4.m8326b(c2532n1.f7916w, interfaceC1426a, (InterfaceC1426a) objM6514H7, c6021p, 0);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            interfaceC10459q2 = c10456n;
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
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
            c6021p.m6524S(-130712307);
            boolean zM6545h4 = c6021p.m6545h(voiceModeViewModel);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h4 || objM6514H8 == obj) {
                objM6514H8 = new C0292u(1, voiceModeViewModel, VoiceModeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                c6021p.m6537c0(objM6514H8);
            }
            c6021p.m6553p(false);
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) ((InterfaceC3759g) objM6514H8);
            c6021p.m6524S(-130710302);
            boolean zM6545h5 = c6021p.m6545h(objM9235b) | c6021p.m6545h(obj3);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6545h5 || objM6514H9 == obj) {
                objM6514H9 = new C0286s(objM9235b, 21, obj3);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            m3594f(0, (InterfaceC1426a) objM6514H9, interfaceC1436k3, c6021p, null);
            c6021p.m6524S(-130707172);
            if (c2532n1.f7915v) {
                AbstractC8745y2.m9487b(null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-130704296);
            if (c2532n1.f7910q) {
                c6021p.m6524S(-130699678);
                boolean zM6545h6 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H10 = c6021p.m6514H();
                if (zM6545h6 || objM6514H10 == obj) {
                    objM6514H10 = new C2469O0(voiceModeViewModel, 2);
                    c6021p.m6537c0(objM6514H10);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H10;
                c6021p.m6553p(false);
                c6021p.m6524S(-130695083);
                boolean zM6545h7 = c6021p.m6545h(obj2);
                Object objM6514H11 = c6021p.m6514H();
                if (zM6545h7 || objM6514H11 == obj) {
                    objM6514H11 = new C0292u(1, obj2, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 4);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(false);
                AbstractC7949N4.m8237b(c2532n1, interfaceC1426a3, (InterfaceC1436k) ((InterfaceC3759g) objM6514H11), null, null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-130692280);
            if (c2532n1.f7911r) {
                c6021p.m6524S(-130689468);
                boolean zM6545h8 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H12 = c6021p.m6514H();
                if (zM6545h8 || objM6514H12 == obj) {
                    objM6514H12 = new C2469O0(voiceModeViewModel, 3);
                    c6021p.m6537c0(objM6514H12);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H12;
                c6021p.m6553p(false);
                c6021p.m6524S(-130684811);
                boolean zM6545h9 = c6021p.m6545h(obj2);
                Object objM6514H13 = c6021p.m6514H();
                if (zM6545h9 || objM6514H13 == obj) {
                    objM6514H13 = new C0292u(1, obj2, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 5);
                    c6021p.m6537c0(objM6514H13);
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) ((InterfaceC3759g) objM6514H13);
                c6021p.m6524S(-130682405);
                boolean zM6545h10 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H14 = c6021p.m6514H();
                if (zM6545h10 || objM6514H14 == obj) {
                    objM6514H14 = new C2471P0(voiceModeViewModel, 1);
                    c6021p.m6537c0(objM6514H14);
                }
                c6021p.m6553p(false);
                AbstractC2454H.m3583a(interfaceC1426a4, interfaceC1436k4, (InterfaceC1436k) objM6514H14, null, c2532n1.f7914u, null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-130669349);
            C2529m1 c2529m1 = c2532n1.f7871C;
            if (c2529m1 != null) {
                c6021p.m6524S(-130664941);
                boolean zM6545h11 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H15 = c6021p.m6514H();
                if (zM6545h11 || objM6514H15 == obj) {
                    objM6514H15 = new C2469O0(voiceModeViewModel, 4);
                    c6021p.m6537c0(objM6514H15);
                }
                z6 = false;
                c6021p.m6553p(false);
                AbstractC8018W4.m8345e(c2529m1, (InterfaceC1426a) objM6514H15, 0, c6021p, 0);
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            c6021p.m6524S(-130661663);
            C6877k c6877k = c2532n1.f7912s;
            if (c6877k != null) {
                c6021p.m6524S(-130656945);
                boolean zM6545h12 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H16 = c6021p.m6514H();
                if (zM6545h12 || objM6514H16 == obj) {
                    objM6514H16 = new C2469O0(voiceModeViewModel, 5);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                AbstractC9236X2.m9809b(c6877k, (InterfaceC1426a) objM6514H16, null, null, c6021p, 0, 12);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-130653672);
            C2500d c2500d = c2532n1.f7882N;
            if (c2500d.f7789b) {
                c6021p.m6524S(-130648963);
                boolean zM6545h13 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H17 = c6021p.m6514H();
                if (zM6545h13 || objM6514H17 == obj) {
                    objM6514H17 = new C2469O0(voiceModeViewModel, 1);
                    c6021p.m6537c0(objM6514H17);
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H17;
                c6021p.m6553p(false);
                c6021p.m6524S(-130645389);
                boolean zM6545h14 = c6021p.m6545h(voiceModeViewModel);
                Object objM6514H18 = c6021p.m6514H();
                if (zM6545h14 || objM6514H18 == obj) {
                    objM6514H18 = new C2471P0(voiceModeViewModel, 0);
                    c6021p.m6537c0(objM6514H18);
                }
                c6021p.m6553p(false);
                AbstractC7925K4.m8213a(c2500d, interfaceC1426a5, (InterfaceC1436k) objM6514H18, null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(interfaceC1436k, interfaceC10459q2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3594f(int i10, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        EnumC2444C enumC2444C;
        C6501u c6501u;
        InterfaceC2062k interfaceC2062k2;
        InterfaceC10459q interfaceC10459q2;
        Object obj;
        Serializable serializable;
        Object objM9771b;
        c6021p.m6526U(-195981026);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
            List list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
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
            Object objMo5693b = c16527d.mo5693b(VoiceModeViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C2532n1.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (zM6542f || objM6514H == obj2) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            VoiceModeViewModel voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
            C2532n1 c2532n1 = (C2532n1) AbstractC9112C3.m9642d(voiceModeViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(243078146);
            if (((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue()) {
                enumC2444C = EnumC2444C.f7593Y;
                z6 = false;
            } else {
                C5572b c5572bM9193a = AbstractC8531O3.m9193a((Activity) c6021p.m6548k(AbstractC7308l.f23151a), c6021p);
                Set set = C5571a.f18067Z;
                z6 = false;
                enumC2444C = C5571a.m5978a(c5572bM9193a.f18071b, 0) ? EnumC2444C.f7594Z : EnumC2444C.f7593Y;
            }
            c6021p.m6553p(z6);
            c6021p.m6524S(-1144312543);
            C4727J0 c4727j0 = ((VoiceModeViewModelImpl) voiceModeViewModel).f39974H;
            if (c4727j0 == null || (obj = c4727j0.f15400y) == null) {
                c6021p.m6553p(false);
                c6501u = null;
            } else {
                c6021p.m6524S(-1272857884);
                boolean zM6542f2 = c6021p.m6542f(obj);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj2) {
                    serializable = null;
                    objM9771b = AbstractC9206S2.m9771b(new C2505e1(2, null), new C2499c1(AbstractC9873d3.m10529c(new C2502d1(0, 0, C5842n.class, obj, "trackPublications", "getTrackPublications()Ljava/util/Map;")), 0));
                    c6021p.m6537c0(objM9771b);
                } else {
                    objM9771b = objM6514H2;
                    serializable = null;
                }
                c6021p.m6553p(false);
                C6501u c6501u2 = (C6501u) AbstractC9112C3.m9640b((InterfaceC2184i) objM9771b, serializable, c6021p, 48).getValue();
                c6021p.m6553p(false);
                c6501u = c6501u2;
            }
            boolean z10 = c2532n1.f7886R;
            c6021p.m6524S(243094082);
            boolean zM6544g = c6021p.m6544g(z10);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6544g || objM6514H3 == obj2) {
                objM6514H3 = new C6256d(0.75f, c2532n1.f7886R);
                c6021p.m6537c0(objM6514H3);
            }
            C6256d c6256d = (C6256d) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            List list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
            Object objMo5693b3 = c16527d.mo5693b(InputViewModel.class);
            C6501u c6501u3 = c6501u;
            Object objMo5693b4 = c16527d.mo5693b(C19866Q.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f3 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == obj2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H4 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H4);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H4;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            c6021p.m6553p(false);
            InputViewModel inputViewModel = (InputViewModel) baseViewModel2;
            C19866Q c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
            boolean z11 = c2532n1.f7890V || !c19866q.f62975f.isEmpty();
            c6021p.m6524S(243106328);
            int i13 = i12 & 14;
            boolean zM6545h = c6021p.m6545h(inputViewModel) | (i13 == 4);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj2) {
                objM6514H5 = new C0286s(inputViewModel, 22, interfaceC1436k);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(243112559);
            boolean z12 = i13 == 4;
            Object objM6514H6 = c6021p.m6514H();
            if (z12 || objM6514H6 == obj2) {
                objM6514H6 = new C0459F(7, interfaceC1436k);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 1, (InterfaceC1426a) objM6514H6, c6021p, false);
            AbstractC4033c3.m4723a(c10456n, AbstractC8411c.m8969c(-559877662, c6021p, new C2476S0(enumC2444C, c2532n1, z11, interfaceC1436k, 0)), null, null, null, 0, 0L, 0L, new C17725F(0, 0, 0, 0), AbstractC8411c.m8969c(-795098707, c6021p, new C2488Y0(c2532n1, enumC2444C, interfaceC1436k, z11, interfaceC1426a, interfaceC1426a2, voiceModeViewModel, c6256d, c6501u3, inputViewModel, c19866q)), c6021p, ((i12 >> 6) & 14) | 805306416, 252);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2490Z0(interfaceC1436k, interfaceC1426a, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m3595g(C2532n1 c2532n1, EnumC2444C enumC2444C, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-115757642);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC2444C) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 16384 : 8192;
        }
        if (((i11 | 196608) & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11205a = AbstractC10832b.m11205a(c10456n, null, 3);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11205a);
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
            interfaceC10459q2 = c10456n;
            AbstractC8223w5.m8850b(Boolean.valueOf(c2532n1.f7873E), null, C2527m.f7852t0, null, "bottom row", null, AbstractC8411c.m8969c(-1383747891, c6021p, new C2451F0(c2532n1, interfaceC1436k, enumC2444C, interfaceC1426a, interfaceC1426a2, 0)), c6021p, 1597824, 42);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c2532n1, enumC2444C, interfaceC1436k, interfaceC1426a, interfaceC1426a2, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m3596h(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(549096640);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11247g(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23202g, 0.0f, 2), AbstractC7313q.f23203h, 0.0f, 2);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30943v0, c6021p, 6);
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
            c6021p.m6524S(-1941691680);
            List list = c2532n1.f7913t;
            if (!list.isEmpty()) {
                InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23198c, 0.0f, 2), AbstractC7312p.f23188e);
                c6021p.m6524S(-1941682622);
                boolean z6 = (i11 & 112) == 32;
                Object objM6514H = c6021p.m6514H();
                if (z6 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C0459F(4, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9997x4.m10639b(0, c6021p, AbstractC10833a.m11209d(interfaceC10459qM11252l, false, null, (InterfaceC1426a) objM6514H, 7), list);
            }
            c6021p.m6553p(false);
            AbstractC7941M4.m8229a(c2532n1, interfaceC1436k, AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2), c6021p, i11 & 126);
            c6021p.m6524S(-1941677104);
            if (!list.isEmpty()) {
                AbstractC17758g.m19482b(c6021p, AbstractC10842a.m11235m(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23188e), AbstractC7313q.f23198c, 0.0f, 2));
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(c2532n1, interfaceC1436k, i10, 14);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m3597i(InterfaceC1426a interfaceC1426a, C2532n1 c2532n1, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1981559042);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(interfaceC1426a) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c2532n1) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC3984T1.m4693l(interfaceC1426a, AbstractC8071d5.m8483b(c10456n, 0.5f), AbstractC2792U0.m3711b(c2532n1.f7895b), null, null, AbstractC8411c.m8969c(1587077637, c6021p, new C2453G0(c2532n1, 0)), c6021p, (i12 & 14) | 196608, 24);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(interfaceC1426a, c2532n1, interfaceC10459q2, i10, 13);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m3598j(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1268148656);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C10449g c10449g = C10444b.f30947z0;
            C0136m c0136m = AbstractC17770m.f56729f;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10844c.m11243c(c10456n, 1.0f), AbstractC7313q.f23203h);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c0136m, c10449g, c6021p, 54);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            m3589a(c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2, c6021p, i12 & 8190);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2455H0(c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2, interfaceC10459q2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m3599k(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(92708148);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C10450h c10450h = C10444b.f30944w0;
            C0136m c0136m = AbstractC17770m.f56729f;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC10844c.m11244d(AbstractC10844c.m11257q(c10456n, 0.0f, 600, 1), 1.0f), f7807b, f7806a);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p, 54);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            m3589a(c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2, c6021p, i12 & 8190);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2455H0(c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m3600l(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(932897135);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            boolean zM9097b = AbstractC8467E.m9097b(c6021p);
            c6021p.m6524S(-1885810531);
            c6021p.m6524S(-1885817018);
            FillElement fillElement = AbstractC10844c.f32512c;
            float f10 = 1;
            long jM15774b = zM9097b ? C14365u.m15774b(0.24f, C14365u.f45055e) : C14365u.m15774b(0.08f, C14365u.f45052b);
            C5984W0 c5984w0 = AbstractC4141u3.f13417a;
            InterfaceC10459q interfaceC10459qM9045a = AbstractC8443A.m9045a(fillElement, f10, jM15774b, ((C4135t3) c6021p.m6548k(c5984w0)).f13381e);
            if (zM9097b) {
                interfaceC10459qM9045a = AbstractC10833a.m11207b(interfaceC10459qM9045a, C14365u.m15774b(0.08f, C14365u.f45055e), ((C4135t3) c6021p.m6548k(c5984w0)).f13381e);
            }
            c6021p.m6553p(false);
            if (!zM9097b) {
                long j10 = C14365u.f45052b;
                interfaceC10459qM9045a = AbstractC10833a.m11206a(interfaceC10459qM9045a, new C14327E(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.0f, j10)), new C14365u(C14365u.m15774b(0.04f, j10))), null, 0L, 9187343241974906880L, 0), ((C4135t3) c6021p.m6548k(c5984w0)).f13381e, 4);
            }
            c6021p.m6553p(false);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56728e, C10444b.f30947z0, c6021p, 54);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9045a);
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
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.share_screen, c6021p, 0);
            C5984W0 c5984w1 = AbstractC3959O0.f12302a;
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(c10456n, 84), ((C3949M0) c6021p.m6548k(c5984w1)).f12187A, c6021p, 432, 0);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.sharing_screen, c6021p), null, ((C3949M0) c6021p.m6548k(c5984w1)).f12187A, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 0, 0, 65530);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 5);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m3601m(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        c6021p.m6526U(-27377993);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            AbstractC3984T1.m4693l(interfaceC1426a, AbstractC8071d5.m8483b(interfaceC10459q, 0.5f), false, null, null, AbstractC2547v.f7955h, c6021p, (i12 & 14) | 196608, 28);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(interfaceC1426a, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m3602n(EnumC2444C enumC2444C, boolean z6, C8410b c8410b, C8410b c8410b2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        C21694h c21694h;
        boolean z11;
        c6021p.m6526U(2126121329);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC2444C) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(z6 ? 1.0f : 0.0f, AbstractC13758e.m15254s(1.0f, 200.0f, null, 4), "Content animation", c6021p, 3120, 20);
            float fM3592d = m3592d(interfaceC5982V0M15261b);
            c6021p.m6524S(-1480234103);
            boolean zM6536c = c6021p.m6536c(fM3592d);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6536c || objM6514H == c5975s) {
                objM6514H = C5997d.m6421H(new C1789X(interfaceC5982V0M15261b, 1));
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-1480230010, c6021p, false);
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM530s == c5975s) {
                objM530s = C5997d.m6430Q(new C7545j(AbstractC9113C4.m9643a(0, 0)), c5975s2);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM530s;
            c6021p.m6553p(false);
            float fM9819a = AbstractC9245Z.m9819a((int) (((C7545j) interfaceC5985X.getValue()).f23903a & 4294967295L), interfaceC7537b);
            c6021p.m6524S(-1480226266);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6430Q(new C7545j(AbstractC9113C4.m9643a(0, 0)), c5975s2);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            C10451i c10451i = C10444b.f30938q0;
            c6021p.m6524S(-1480221812);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = new C0248f0(interfaceC5985X, 11);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11319e = AbstractC10868a.m11319e(interfaceC10459q, (InterfaceC1436k) objM6514H3);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11319e);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h4);
            }
            C21694h c21694h5 = C21698j.f68871d;
            C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            c6021p.m6524S(-2006351009);
            boolean zM6542f = ((i12 & 14) == 4) | c6021p.m6542f(interfaceC7537b) | c6021p.m6542f(interfaceC5982V0M15261b);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f || objM6514H4 == c5975s) {
                z10 = false;
                Object c1307e = new C1307e(enumC2444C, interfaceC5985X2, interfaceC7537b, interfaceC5982V0M15261b, 5);
                c6021p.m6537c0(c1307e);
                objM6514H4 = c1307e;
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(c10456n, (InterfaceC1436k) objM6514H4);
            C10451i c10451i2 = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i2, z10);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11305a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(r21, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                c21694h = c21694h4;
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                c21694h = c21694h4;
            }
            C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
            c8410b.invoke(c6021p, Integer.valueOf((i12 >> 6) & 14));
            c6021p.m6553p(true);
            c6021p.m6524S(-2006322884);
            if (((Boolean) interfaceC5982V0.getValue()).booleanValue()) {
                EnumC2444C enumC2444C2 = EnumC2444C.f7593Y;
                InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(c10456n, enumC2444C == enumC2444C2 ? C10444b.f30941t0 : c10451i);
                if (enumC2444C == enumC2444C2) {
                    interfaceC10459qM11240a = AbstractC10844c.m11247g(interfaceC10459qM11240a, 0.0f, fM9819a - ((f7808c * 0.33f) + f7809d), 1);
                }
                c6021p.m6524S(-2006307857);
                Object objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == c5975s) {
                    objM6514H5 = new C0248f0(interfaceC5985X2, 12);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11319e2 = AbstractC10868a.m11319e(interfaceC10459qM11240a, (InterfaceC1436k) objM6514H5);
                c6021p.m6524S(-2006305502);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5982V0M15261b);
                Object objM6514H6 = c6021p.m6514H();
                if (zM6542f2 || objM6514H6 == c5975s) {
                    objM6514H6 = new C17122m(interfaceC5982V0M15261b, 1);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11305a2 = AbstractC10864a.m11305a(interfaceC10459qM11319e2, (InterfaceC1436k) objM6514H6);
                InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i2, false);
                int i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11305a2);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e3);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m3);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d3);
                AbstractC17792x.m19538u((i12 >> 9) & 14, c8410b2, c6021p, true);
                z11 = false;
            } else {
                z11 = z10;
            }
            c6021p.m6553p(z11);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(enumC2444C, z6, c8410b, c8410b2, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m3603o(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        int i12 = 2;
        c6021p.m6526U(-2055728826);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(c2532n1) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC3917G4.f12036a;
            long j10 = C14365u.f45059i;
            long j11 = C14365u.f45060j;
            C3911F4 c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
            if (j10 == 16) {
                j10 = c3911f4M4616b.f11995a;
            }
            long j12 = j10;
            long j13 = j11 != 16 ? j11 : c3911f4M4616b.f11996b;
            long j14 = j11 != 16 ? j11 : c3911f4M4616b.f11997c;
            long j15 = j11 != 16 ? j11 : c3911f4M4616b.f11998d;
            if (j11 == 16) {
                j11 = c3911f4M4616b.f11999e;
            }
            AbstractC9274d4.m9842a(AbstractC8411c.m8969c(-1243760374, c6021p, new C2453G0(c2532n1, 1)), c10456n, null, AbstractC8411c.m8969c(1675117749, c6021p, new C2458J(c2532n1, interfaceC1436k, i12)), true, new C3911F4(j12, j13, j14, j15, j11), c6021p, ((i13 >> 3) & 112) | 27654, 4);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2440A(c2532n1, interfaceC1436k, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m3604p(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1513904771);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(c2532n1) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if (((i11 | 384) & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC8223w5.m8850b(Boolean.valueOf(c2532n1.f7880L), null, null, null, "snowflake", null, AbstractC8411c.m8969c(675272064, c6021p, new C2456I(c10456n, (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a), interfaceC1436k, ((C8870f) c6021p.m6548k(AbstractC8873i.f27157a)).f27148a, 3)), c6021p, 1597440, 46);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2440A(c2532n1, interfaceC1436k, interfaceC10459q2, i10, 5);
        }
    }
}
