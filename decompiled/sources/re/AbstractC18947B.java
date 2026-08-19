package re;

import af.C10561Q;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.EnumC3898D3;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p544W9.AbstractC8467E;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9787P3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17790w;
import ph.C18416d;

/* JADX INFO: renamed from: re.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18947B {

    /* JADX INFO: renamed from: a */
    public static final long f60496a = C14365u.m15774b(0.13f, C14365u.f45055e);

    /* JADX INFO: renamed from: b */
    public static final long f60497b = C14365u.m15774b(0.06f, C14365u.f45052b);

    /* JADX INFO: renamed from: a */
    public static final void m20273a(long j10, C6021p c6021p, int i10) {
        int i11;
        String strM8677e;
        c6021p.m6526U(610115867);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C21554a c21554a = C21555b.f68260Z;
            long jM21841k = C21555b.m21841k(j10, EnumC21557d.SECONDS);
            long minutes = TimeUnit.SECONDS.toMinutes(jM21841k);
            long j11 = jM21841k % ((long) 60);
            if (minutes > 0) {
                c6021p.m6524S(-702045464);
                strM8677e = AbstractC8142m4.m8677e(R.string.voice_snackbar_duration_format, new Object[]{Long.valueOf(minutes), Long.valueOf(j11)}, c6021p);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-701951379);
                strM8677e = AbstractC8142m4.m8677e(R.string.voice_snackbar_duration_format_sec, new Object[]{Long.valueOf(j11)}, c6021p);
                c6021p.m6553p(false);
            }
            AbstractC4124r4.m4768b(strM8677e, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12156l, c6021p, 0, 0, 65534);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18946A(j10, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20274b(C21555b c21555b, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        c6021p.m6526U(-1815498832);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c21555b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
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
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.voice, c6021p, 0), "", AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c).mo428M(new VerticalAlignElement()), 0L, c6021p, 48, 8);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23199d));
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
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_snackbar_chat_ended, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            c6021p.m6524S(1616324517);
            if (c21555b == null) {
                z6 = false;
            } else {
                z6 = false;
                m20273a(c21555b.f68263Y, c6021p, 0);
            }
            AbstractC3794B0.m4471F(c6021p, z6, true, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(c21555b, i10, 28);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20275c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(951250679);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
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
            EnumC3898D3 enumC3898D3 = EnumC3898D3.f11878Z;
            c6021p.m6524S(-1168633103);
            boolean zM6542f2 = c6021p.m6542f(voiceEndedViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C18951d(voiceEndedViewModel, 4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9787P3.m10401a((InterfaceC1426a) objM6514H2, AbstractC8411c.m8969c(1824123109, c6021p, new C18968u(voiceEndedViewModel, 1)), interfaceC10459q2, null, enumC3898D3, AbstractC8411c.m8969c(-1794269087, c6021p, new C7443a0(abstractC18967t, 27)), c6021p, ((i11 << 6) & 896) | 221232, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 20);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20276d(InterfaceC1426a interfaceC1426a, C17425e c17425e, String str, C6021p c6021p, int i10) {
        int i11;
        long j10;
        c6021p.m6526U(1394209906);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c17425e) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM9097b = AbstractC8467E.m9097b(c6021p);
            if (zM9097b) {
                j10 = f60496a;
            } else {
                if (zM9097b) {
                    throw new C0644w();
                }
                j10 = f60497b;
            }
            AbstractC3984T1.m4690i(interfaceC1426a, null, false, null, AbstractC3984T1.m4675C(j10, 0L, c6021p, 0, 14), null, AbstractC8411c.m8969c(1273037138, c6021p, new C18416d(c17425e, 7, str)), c6021p, (i12 & 14) | 1572864, 46);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(interfaceC1426a, c17425e, str, i10, 28);
        }
    }
}
