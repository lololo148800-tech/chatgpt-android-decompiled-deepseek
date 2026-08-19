package p547Wc;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.instructions.CustomInstructionsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gd.C13865J0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0257i0;
import p003A1.C0292u;
import p017Af.C0469P;
import p021Aj.C0537v;
import p025An.C0644w;
import p039Bc.C0886t;
import p042Bf.C1269k;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1073w3.InterfaceC20802d;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p117Eb.C2385o;
import p124Ei.C2446D;
import p124Ei.C2535p;
import p169Gf.C3046j;
import p196Hi.C3436f;
import p204I1.C3590f;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4150w0;
import p229J0.C3879A2;
import p229J0.C3941K4;
import p229J0.C4065i;
import p302M0.AbstractC5253e;
import p316Mf.C5335b;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p350O1.C6051I;
import p363Og.AbstractC6201e;
import p363Og.C6220x;
import p363Og.C6221y;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9225V3;
import p587Y1.C9588n;
import p594Y9.AbstractC9727F3;
import p594Y9.AbstractC9745I3;
import p594Y9.AbstractC9973t4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17790w;
import ve.C20584h;
import ve.EnumC20582f;

/* JADX INFO: renamed from: Wc.A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8757A {
    /* JADX WARN: Code duplicated, block: B:133:0x0323  */
    /* JADX WARN: Code duplicated, block: B:134:0x0325  */
    /* JADX WARN: Code duplicated, block: B:138:0x032e  */
    /* JADX WARN: Code duplicated, block: B:141:0x036a  */
    /* JADX WARN: Code duplicated, block: B:142:0x036c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0375  */
    /* JADX INFO: renamed from: a */
    public static final void m9520a(C20584h c20584h, boolean z6, InterfaceC1426a onUserMessageClick, InterfaceC1426a onModelMessageClick, InterfaceC1426a onMoreInfoClick, InterfaceC1436k onBrowsingToggle, InterfaceC1436k onDalleToggle, InterfaceC1436k onCodeToggle, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        int i12;
        int i13;
        C5975S c5975s;
        boolean z10;
        Object objM6514H;
        boolean z11;
        Object objM6514H2;
        AbstractC16544l.m18094g(onUserMessageClick, "onUserMessageClick");
        AbstractC16544l.m18094g(onModelMessageClick, "onModelMessageClick");
        AbstractC16544l.m18094g(onMoreInfoClick, "onMoreInfoClick");
        AbstractC16544l.m18094g(onBrowsingToggle, "onBrowsingToggle");
        AbstractC16544l.m18094g(onDalleToggle, "onDalleToggle");
        AbstractC16544l.m18094g(onCodeToggle, "onCodeToggle");
        c6021p.m6526U(-1383341136);
        int i14 = c6021p.f19563O ? -c6021p.f19556H.f19385v : c6021p.f19554F.f19334i;
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c20584h) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onUserMessageClick) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onModelMessageClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onMoreInfoClick) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onBrowsingToggle) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(onDalleToggle) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6545h(onCodeToggle) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 67108864 : 33554432;
        }
        int i15 = i11;
        if ((i15 & 38347923) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM8729d = AbstractC8160o6.m8729d(C13865J0.f43903c, c6021p);
            InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(interfaceC10459q, AbstractC8479G.m9124e(c6021p), 14);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-27981863);
            AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.custom_instructions_user_message, c6021p), null, 0L, c6021p, 0, 6);
            String str = c20584h != null ? c20584h.f65316b : null;
            if (str == null) {
                str = "";
            }
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23201f;
            m9521b((i15 >> 3) & 112, onUserMessageClick, c6021p, AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), str);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.custom_instructions_model_message, c6021p), null, 0L, c6021p, 0, 6);
            String str2 = c20584h != null ? c20584h.f65317c : null;
            if (str2 == null) {
                str2 = "";
            }
            m9521b((i15 >> 6) & 112, onModelMessageClick, c6021p, AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), str2);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
            C3590f c3590fM9795b = AbstractC9225V3.m9795b(R.string.custom_instructions_footer, null, c6021p, 2);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2);
            c6021p.m6524S(-1247803596);
            boolean z12 = (i15 & 57344) == 16384;
            Object objM6514H3 = c6021p.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            if (z12 || objM6514H3 == c5975s2) {
                objM6514H3 = new C2535p(15, onMoreInfoClick);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC4124r4.m4769c(c3590fM9795b, AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H3, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12156l, c6021p, 0, 0, 131068);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
            if (c20584h == null || !zM8729d) {
                c6021p.m6557t(i14);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C6220x(c20584h, z6, onUserMessageClick, onModelMessageClick, onMoreInfoClick, onBrowsingToggle, onDalleToggle, onCodeToggle, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.customization_gpt_tools_header, c6021p), null, 0L, c6021p, 0, 6);
            if (z6) {
                i12 = R.string.customization_gpt_tools_web_search;
            } else {
                if (z6) {
                    throw new C0644w();
                }
                i12 = R.string.customization_gpt_tools_browsing;
            }
            if (z6) {
                i13 = R.string.customization_gpt_tools_web_search_desc;
            } else {
                if (z6) {
                    throw new C0644w();
                }
                i13 = R.string.customization_gpt_tools_browsing_desc;
            }
            EnumC20582f enumC20582f = EnumC20582f.Browser;
            Set set = c20584h.f65318d;
            boolean z13 = !set.contains(enumC20582f);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-1247777317);
            boolean z14 = (i15 & 458752) == 131072;
            Object objM6514H4 = c6021p.m6514H();
            if (z14) {
                c5975s = c5975s2;
            } else {
                c5975s = c5975s2;
                if (objM6514H4 == c5975s) {
                }
                c6021p.m6553p(false);
                AbstractC9727F3.m10316a(z13, (InterfaceC1436k) objM6514H4, AbstractC8411c.m8969c(-1483931228, c6021p, new C2446D(i12, 7)), interfaceC10459qM11244d, null, null, AbstractC8411c.m8969c(1996989096, c6021p, new C2446D(i13, 8)), false, c6021p, 1576320, 176);
                boolean z15 = !set.contains(EnumC20582f.Dalle);
                InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                c6021p.m6524S(-1247766312);
                if ((i15 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z10 || objM6514H == c5975s) {
                    objM6514H = new C0537v(12, onDalleToggle);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9727F3.m10316a(z15, (InterfaceC1436k) objM6514H, AbstractC6201e.f20202a, interfaceC10459qM11244d2, null, null, AbstractC6201e.f20203b, false, c6021p, 1576320, 176);
                boolean z16 = !set.contains(EnumC20582f.Python);
                InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
                c6021p.m6524S(-1247753897);
                if ((i15 & 29360128) == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z11 || objM6514H2 == c5975s) {
                    objM6514H2 = new C0537v(13, onCodeToggle);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC9727F3.m10316a(z16, (InterfaceC1436k) objM6514H2, AbstractC6201e.f20204c, interfaceC10459qM11244d3, null, null, AbstractC6201e.f20205d, false, c6021p, 1576320, 176);
                c6021p.m6553p(false);
                c6021p.m6553p(true);
            }
            objM6514H4 = new C0537v(11, onBrowsingToggle);
            c6021p.m6537c0(objM6514H4);
            c6021p.m6553p(false);
            AbstractC9727F3.m10316a(z13, (InterfaceC1436k) objM6514H4, AbstractC8411c.m8969c(-1483931228, c6021p, new C2446D(i12, 7)), interfaceC10459qM11244d, null, null, AbstractC8411c.m8969c(1996989096, c6021p, new C2446D(i13, 8)), false, c6021p, 1576320, 176);
            boolean z17 = !set.contains(EnumC20582f.Dalle);
            InterfaceC10459q interfaceC10459qM11244d4 = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-1247766312);
            if ((i15 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z10) {
                objM6514H = new C0537v(12, onDalleToggle);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C0537v(12, onDalleToggle);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9727F3.m10316a(z17, (InterfaceC1436k) objM6514H, AbstractC6201e.f20202a, interfaceC10459qM11244d4, null, null, AbstractC6201e.f20203b, false, c6021p, 1576320, 176);
            boolean z18 = !set.contains(EnumC20582f.Python);
            InterfaceC10459q interfaceC10459qM11244d5 = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-1247753897);
            if ((i15 & 29360128) == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z11) {
                objM6514H2 = new C0537v(13, onCodeToggle);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C0537v(13, onCodeToggle);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9727F3.m10316a(z18, (InterfaceC1436k) objM6514H2, AbstractC6201e.f20204c, interfaceC10459qM11244d5, null, null, AbstractC6201e.f20205d, false, c6021p, 1576320, 176);
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C6220x(c20584h, z6, onUserMessageClick, onModelMessageClick, onMoreInfoClick, onBrowsingToggle, onDalleToggle, onCodeToggle, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9521b(int i10, InterfaceC1426a onClick, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-363861637);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(670683762);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (z6 || objM6514H == c5975s) {
                objM6514H = new C2535p(16, onClick);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459q, false, null, (InterfaceC1426a) objM6514H, 7);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11209d);
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
            C3879A2 c3879a2 = C3879A2.f11730a;
            C8410b c8410bM8969c = AbstractC8411c.m8969c(935714352, c6021p, new C3046j(str, 2));
            C2385o c2385o = C6051I.f19710a;
            c6021p.m6524S(645098027);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = AbstractC0168G.m536y(c6021p);
            }
            c6021p.m6553p(false);
            c3879a2.m4600b(str, c8410bM8969c, true, false, c2385o, (InterfaceC17406l) objM6514H2, false, null, null, null, null, null, null, null, null, null, null, c6021p, (i11 & 14) | 224688, 12582912, 131008);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0469P(str, onClick, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9522c(InterfaceC10459q interfaceC10459q, CustomInstructionsViewModel customInstructionsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        CustomInstructionsViewModel customInstructionsViewModel2;
        c6021p.m6526U(1826532664);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            customInstructionsViewModel2 = customInstructionsViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6221y.class));
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
                Object objMo5693b = c16527d.mo5693b(CustomInstructionsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6221y.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6221y.class), c16527d.mo5693b(CustomInstructionsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CustomInstructionsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                customInstructionsViewModel2 = (CustomInstructionsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                customInstructionsViewModel2 = customInstructionsViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C6221y c6221y = (C6221y) AbstractC9112C3.m9642d(customInstructionsViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-175551271);
            boolean zM6542f2 = c6021p.m6542f(customInstructionsViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0292u(1, customInstructionsViewModel2, CustomInstructionsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(1612301103, c6021p, new C0148y(c6221y, c8870f, interfaceC3759g, 15)), false, AbstractC8411c.m8969c(1037542516, c6021p, new C1281w(c6221y, interfaceC3759g, false, c8870f, 6)), c6021p, (i11 & 14) | 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, customInstructionsViewModel2, i10, 28);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9523d(InterfaceC1426a onDialogDismiss, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDialogDismiss, "onDialogDismiss");
        c6021p.m6526U(755355574);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDialogDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9973t4.m10617b(onDialogDismiss, new C9588n(3, false, true), AbstractC8411c.m8969c(-264178419, c6021p, new C4065i(interfaceC10459q, c8410b, 1)), c6021p, (i11 & 14) | 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3436f(onDialogDismiss, interfaceC10459q, c8410b, i10, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9524e(Object obj, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C5335b c5335b = C5335b.f17550o0;
        c6021p.m6526U(1021947310);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(obj) : c6021p.m6545h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c5335b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4150w0.m4775a(z6, null, null, false, null, null, c6021p, ((i12 >> 6) & 14) | 48, 60);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23199d));
            String str = (String) c5335b.invoke(obj, c6021p, Integer.valueOf(i12 & 126));
            float f10 = AbstractC4017a.f12601a;
            AbstractC4124r4.m4768b(str, null, AbstractC3959O0.m4662d(AbstractC5253e.f17198d, c6021p), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(obj, z6, interfaceC10459q, i10, 5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9525f(ArrayList arrayList, InterfaceC1436k isSelected, InterfaceC1436k onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C5335b c5335b = C5335b.f17550o0;
        AbstractC16544l.m18094g(isSelected, "isSelected");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-1075513239);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(arrayList) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c5335b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(isSelected) ? 256 : 128;
        }
        int i12 = 2048;
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30946y0, c6021p, 6);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
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
            c6021p.m6524S(-818315922);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                boolean zBooleanValue = ((Boolean) isSelected.invoke(next)).booleanValue();
                InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                c6021p.m6524S(1433506318);
                boolean zM6545h = ((i11 & 7168) == i12) | c6021p.m6545h(next);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C8816z(onClick, 0, next);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                m9524e(next, zBooleanValue, AbstractC10833a.m11209d(interfaceC10459qM11244d, false, null, (InterfaceC1426a) objM6514H, 7), c6021p, i11 & 112);
                i12 = 2048;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 16, arrayList, isSelected, onClick, interfaceC10459q);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9526g(InterfaceC17157g interfaceC17157g, int i10, InterfaceC20802d interfaceC20802d) {
        long jMo10557h = interfaceC17157g.mo10557h(i10);
        List listMo10558k = interfaceC17157g.mo10558k(jMo10557h);
        if (listMo10558k.isEmpty()) {
            return;
        }
        if (i10 == interfaceC17157g.mo10560p() - 1) {
            throw new IllegalStateException();
        }
        long jMo10557h2 = interfaceC17157g.mo10557h(i10 + 1) - interfaceC17157g.mo10557h(i10);
        if (jMo10557h2 > 0) {
            interfaceC20802d.accept(new C17153c(listMo10558k, jMo10557h, jMo10557h2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: h */
    public static void m9527h(InterfaceC17157g interfaceC17157g, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        int iMo10555e;
        boolean z6;
        long j10 = c17162l.f54834a;
        if (j10 == -9223372036854775807L) {
            iMo10555e = 0;
        } else {
            iMo10555e = interfaceC17157g.mo10555e(j10);
            if (iMo10555e == -1) {
                iMo10555e = interfaceC17157g.mo10560p();
            }
            if (iMo10555e > 0 && interfaceC17157g.mo10557h(iMo10555e - 1) == j10) {
                iMo10555e--;
            }
        }
        if (j10 == -9223372036854775807L || iMo10555e >= interfaceC17157g.mo10560p()) {
            z6 = false;
        } else {
            List listMo10558k = interfaceC17157g.mo10558k(j10);
            long jMo10557h = interfaceC17157g.mo10557h(iMo10555e);
            if (listMo10558k.isEmpty()) {
                z6 = false;
            } else {
                long j11 = c17162l.f54834a;
                if (j11 < jMo10557h) {
                    interfaceC20802d.accept(new C17153c(listMo10558k, j11, jMo10557h - j11));
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
        }
        for (int i10 = iMo10555e; i10 < interfaceC17157g.mo10560p(); i10++) {
            m9526g(interfaceC17157g, i10, interfaceC20802d);
        }
        if (c17162l.f54835b) {
            if (z6) {
                iMo10555e--;
            }
            for (int i11 = 0; i11 < iMo10555e; i11++) {
                m9526g(interfaceC17157g, i11, interfaceC20802d);
            }
            if (z6) {
                interfaceC20802d.accept(new C17153c(interfaceC17157g.mo10558k(j10), interfaceC17157g.mo10557h(iMo10555e), j10 - interfaceC17157g.mo10557h(iMo10555e)));
            }
        }
    }
}
