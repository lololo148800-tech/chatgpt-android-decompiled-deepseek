package p294Li;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.gestures.AbstractC10840a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.glance.appwidget.protobuf.C11043g0;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.settings.VoiceModeSettingsViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p006A4.C0364y;
import p025An.C0644w;
import p042Bf.C1267i;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p094De.C2025h;
import p098Di.InterfaceC2062k;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21913F1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.C22007g0;
import p1155zi.C22011h0;
import p1155zi.InterfaceC21925I1;
import p124Ei.AbstractC2511g1;
import p124Ei.C2532n1;
import p148Fi.AbstractC2792U0;
import p148Fi.C2786R0;
import p148Fi.C2823g1;
import p148Fi.C2864y0;
import p172Gi.C3077j;
import p225Im.InterfaceC3756d;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p229J0.C4163y1;
import p229J0.C4171z3;
import p243Jf.C4334d;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p365Oi.C6253a;
import p365Oi.C6254b;
import p365Oi.C6256d;
import p365Oi.InterfaceC6255c;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8033Y5;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8210v0;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8686o3;
import p544W9.AbstractC8748z;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9237X3;
import p571X9.AbstractC9274d4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17718B0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: Li.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5094p {

    /* JADX INFO: renamed from: a */
    public static final float f16663a = 8;

    /* JADX INFO: renamed from: b */
    public static final C2864y0 f16664b = AbstractC2792U0.m3712c("VoicePickerScreen");

    /* JADX INFO: renamed from: c */
    public static final long f16665c = AbstractC14334L.m15626d(4294923862L);

    /* JADX INFO: renamed from: a */
    public static final void m5659a(C19408d pagerState, InterfaceC10459q interfaceC10459q, long j10, long j11, C6021p c6021p, int i10) {
        int i11;
        long j12;
        long j13;
        long j14;
        long j15;
        AbstractC16544l.m18094g(pagerState, "pagerState");
        c6021p.m6526U(-163236958);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(pagerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            j14 = j10;
            j15 = j11;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            C10456n c10456n = C10456n.f30959Y;
            if (i12 == 0 || c6021p.m6561x()) {
                C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                j12 = ((C3949M0) c6021p.m6548k(c5984w0)).f12237s;
                j13 = ((C3949M0) c6021p.m6548k(c5984w0)).f12236r;
            } else {
                c6021p.m6517L();
                j12 = j10;
                j13 = j11;
            }
            c6021p.m6554q();
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30943v0, c6021p, 6);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1654411322);
            int iMo20500l = pagerState.mo20500l();
            int i14 = 0;
            while (i14 < iMo20500l) {
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23199d));
                AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC10844c.m11252l(c10456n, f16663a), pagerState.m20498j() == i14 ? j12 : j13, AbstractC20417e.f64539a), c6021p, 0);
                i14++;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            j14 = j12;
            j15 = j13;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5089k(pagerState, interfaceC10459q, j14, j15, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5660b(InterfaceC6255c amplitudeSource, boolean z6, C19408d pagerState, InterfaceC1436k onCurrentVoiceChange, InterfaceC10459q interfaceC10459q, VoiceModeSettingsViewModel voiceModeSettingsViewModel, C6021p c6021p, int i10, int i11) {
        int i12;
        VoiceModeSettingsViewModel voiceModeSettingsViewModel2;
        int i13;
        VoiceModeSettingsViewModel voiceModeSettingsViewModel3;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        boolean z10;
        C6021p c6021p2;
        boolean z11;
        List list;
        String str;
        char c9;
        boolean z12;
        InterfaceC10459q interfaceC10459q3;
        VoiceModeSettingsViewModel voiceModeSettingsViewModel4;
        AbstractC16544l.m18094g(amplitudeSource, "amplitudeSource");
        AbstractC16544l.m18094g(pagerState, "pagerState");
        AbstractC16544l.m18094g(onCurrentVoiceChange, "onCurrentVoiceChange");
        c6021p.m6526U(1326834747);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(amplitudeSource) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(pagerState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(onCurrentVoiceChange) ? 2048 : 1024;
        }
        int i14 = i12 | 24576;
        if ((i10 & 196608) == 0) {
            if ((i11 & 32) == 0) {
                voiceModeSettingsViewModel2 = voiceModeSettingsViewModel;
                int i15 = c6021p.m6542f(voiceModeSettingsViewModel2) ? 131072 : 65536;
                i14 |= i15;
            } else {
                voiceModeSettingsViewModel2 = voiceModeSettingsViewModel;
            }
            i14 |= i15;
        } else {
            voiceModeSettingsViewModel2 = voiceModeSettingsViewModel;
        }
        if ((74899 & i14) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            voiceModeSettingsViewModel4 = voiceModeSettingsViewModel2;
            interfaceC10459q3 = interfaceC10459q;
        } else {
            c6021p.m6519N();
            int i16 = i10 & 1;
            C10456n c10456n = C10456n.f30959Y;
            C5975S c5975s = C6013l.f19514a;
            if (i16 == 0 || c6021p.m6561x()) {
                if ((i11 & 32) != 0) {
                    c6021p.m6524S(-1020152108);
                    Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                    boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                    List list2 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue) {
                        interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C5100v.class));
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
                    InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(VoiceModeSettingsViewModel.class);
                    InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C5100v.class);
                    c6021p.m6524S(-1395498839);
                    boolean zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C5100v.class), c16527d.mo5693b(VoiceModeSettingsViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        BaseViewModel baseViewModelM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list2);
                        c6021p.m6537c0(baseViewModelM14398a);
                        objM6514H = baseViewModelM14398a;
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    voiceModeSettingsViewModel3 = (VoiceModeSettingsViewModel) baseViewModel;
                    i13 = i14 & (-458753);
                } else {
                    i13 = i14;
                    voiceModeSettingsViewModel3 = voiceModeSettingsViewModel2;
                }
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                if ((i11 & 32) != 0) {
                    i14 &= -458753;
                }
                interfaceC10459q2 = interfaceC10459q;
                i13 = i14;
                voiceModeSettingsViewModel3 = voiceModeSettingsViewModel2;
            }
            c6021p.m6554q();
            C5100v c5100v = (C5100v) AbstractC9112C3.m9642d(voiceModeSettingsViewModel3.f40343c, c6021p).getValue();
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q2, 1.0f);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            c6021p.m6524S(1295479411);
            InterfaceC21925I1 interfaceC21925I1 = c5100v.f16670a;
            boolean z13 = interfaceC21925I1 instanceof C21913F1;
            C10449g c10449g = C10444b.f30947z0;
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
            if (z13) {
                c6021p.m6524S(1295417162);
                InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                float f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(interfaceC10459qM11244d2, 0.0f, f10, 1);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56728e, c10449g, c6021p, 54);
                int i18 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i18))) {
                    AbstractC0168G.m537z(i18, c6021p, i18, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                z11 = true;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_options_error, c6021p), null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 130558);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
                c6021p.m6524S(2067742483);
                boolean z14 = (((i13 & 458752) ^ 196608) > 131072 && c6021p.m6542f(voiceModeSettingsViewModel3)) || (i13 & 196608) == 131072;
                Object objM6514H2 = c6021p.m6514H();
                if (z14 || objM6514H2 == c5975s) {
                    objM6514H2 = new C5090l(voiceModeSettingsViewModel3, 0);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H2, null, false, null, null, null, null, null, null, AbstractC5086h.f16644b, c6021p, 805306368, 510);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
                z10 = false;
                c6021p2 = c6021p;
            } else {
                if (interfaceC21925I1 instanceof C21917G1) {
                    c6021p.m6524S(1296350665);
                    AbstractC3980S2.m4668b(c10843b.m11240a(c10456n, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
                    c6021p.m6553p(false);
                    z10 = false;
                    c6021p2 = c6021p;
                    z11 = true;
                } else {
                    if (interfaceC21925I1 instanceof C21921H1) {
                        c6021p.m6524S(1296601548);
                        List list3 = ((C2786R0) ((C21921H1) c5100v.f16670a).f69472a).f8502a;
                        if (list3.isEmpty()) {
                            AbstractC8160o6.m8727b(f16664b, "No voices available", null, 6);
                            c6021p.m6553p(false);
                            c6021p.m6553p(false);
                            voiceModeSettingsViewModel3 = voiceModeSettingsViewModel3;
                            c6021p2 = c6021p;
                            z11 = true;
                        } else {
                            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onCurrentVoiceChange, c6021p);
                            c6021p.m6524S(1842948178);
                            int i19 = i13 & 896;
                            boolean zM6545h = (i19 == 256) | c6021p.m6545h(list3) | c6021p.m6542f(c5100v);
                            Object objM6514H3 = c6021p.m6514H();
                            if (zM6545h || objM6514H3 == c5975s) {
                                objM6514H3 = new C5091m(list3, pagerState, c5100v, null);
                                c6021p.m6537c0(objM6514H3);
                            }
                            c6021p.m6553p(false);
                            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, list3);
                            Integer numValueOf = Integer.valueOf(pagerState.m20498j());
                            c6021p.m6524S(1842960078);
                            boolean zM6545h2 = (i19 == 256) | c6021p.m6545h(list3) | ((((i13 & 458752) ^ 196608) > 131072 && c6021p.m6542f(voiceModeSettingsViewModel3)) || (196608 & i13) == 131072) | c6021p.m6542f(interfaceC5985XM6435V);
                            Object objM6514H4 = c6021p.m6514H();
                            if (zM6545h2 || objM6514H4 == c5975s) {
                                list = list3;
                                str = null;
                                c9 = 0;
                                C5092n c5092n = new C5092n(list3, pagerState, voiceModeSettingsViewModel3, interfaceC5985XM6435V, null);
                                c6021p.m6537c0(c5092n);
                                objM6514H4 = c5092n;
                            } else {
                                list = list3;
                                str = null;
                                c9 = 0;
                            }
                            c6021p.m6553p(false);
                            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, numValueOf);
                            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56728e, c10449g, c6021p, 54);
                            int i20 = c6021p.f19564P;
                            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n);
                            c6021p.m6528W();
                            if (c6021p.f19563O) {
                                c6021p.m6549l(c21696i);
                            } else {
                                c6021p.m6543f0();
                            }
                            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
                            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
                            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i20))) {
                                AbstractC0168G.m537z(i20, c6021p, i20, c21694h3);
                            }
                            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
                            C3077j c3077j = c5100v.f16672c;
                            String str2 = c3077j != null ? c3077j.f9280c : str;
                            c6021p.m6524S(2067807739);
                            if (str2 == null) {
                                z12 = false;
                            } else {
                                c6021p.m6524S(-1014736245);
                                boolean zM6545h3 = c6021p.m6545h(amplitudeSource);
                                Object objM6514H5 = c6021p.m6514H();
                                if (zM6545h3 || objM6514H5 == c5975s) {
                                    objM6514H5 = new C4171z3(amplitudeSource, 7);
                                    c6021p.m6537c0(objM6514H5);
                                }
                                c6021p.m6553p(false);
                                AbstractC8686o3.m9382a(str2, c5100v.f16673d, z6, (InterfaceC1436k) objM6514H5, c6021p, (i13 << 3) & 896);
                                z12 = false;
                            }
                            c6021p.m6553p(z12);
                            int i21 = (i13 >> 6) & 14;
                            AbstractC8210v0.m8835b(pagerState, null, null, null, 0, 0.0f, null, null, false, false, null, null, null, AbstractC8411c.m8969c(-673943651, c6021p, new C0364y(list, 6, voiceModeSettingsViewModel3)), c6021p, i21 | 100663296, 3072, 7934);
                            m5659a(pagerState, AbstractC10844c.m11244d(c10456n, 1.0f).mo428M(new HorizontalAlignElement(c10449g)), 0L, 0L, c6021p, i21);
                            c6021p2 = c6021p;
                            z11 = true;
                            c6021p2.m6553p(true);
                            z10 = false;
                            c6021p2.m6553p(false);
                        }
                    } else {
                        voiceModeSettingsViewModel3 = voiceModeSettingsViewModel3;
                        z10 = false;
                        c6021p2 = c6021p;
                        z11 = true;
                        c6021p2.m6524S(1300386276);
                        c6021p2.m6553p(false);
                    }
                    c6021p2.m6553p(z10);
                }
                c6021p2.m6553p(z11);
                interfaceC10459q3 = interfaceC10459q4;
                voiceModeSettingsViewModel4 = voiceModeSettingsViewModel3;
            }
            c6021p2.m6553p(z10);
            c6021p2.m6553p(z11);
            interfaceC10459q3 = interfaceC10459q4;
            voiceModeSettingsViewModel4 = voiceModeSettingsViewModel3;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4163y1(amplitudeSource, z6, pagerState, onCurrentVoiceChange, interfaceC10459q3, voiceModeSettingsViewModel4, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0231  */
    /* JADX WARN: Code duplicated, block: B:50:0x0237  */
    /* JADX WARN: Code duplicated, block: B:55:0x0255  */
    /* JADX WARN: Code duplicated, block: B:60:0x026e  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b5 A[LOOP:0: B:61:0x02a0->B:66:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0310  */
    /* JADX WARN: Code duplicated, block: B:77:0x0359  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b2 A[EDGE_INSN: B:91:0x02b2->B:65:0x02b2 BREAK  A[LOOP:0: B:61:0x02a0->B:66:0x02b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 O0.p, new type: O0.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX INFO: renamed from: c */
    public static final void m5661c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        int i11;
        C21694h c21694h;
        int i12;
        C19408d c19408d;
        boolean zM6542f;
        Object objM6514H;
        boolean zM6542f2;
        Object objM6514H2;
        Iterator it;
        int i13;
        c6021p.m6526U(-709675177);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            AbstractC9237X3.m9812a(0, c6021p);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C5100v.class));
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
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(VoiceModeSettingsViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C5100v.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f3 = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H3 = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f3 || objM6514H3 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C5100v.class), c16527d.mo5693b(VoiceModeSettingsViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H3);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H3;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            VoiceModeSettingsViewModel voiceModeSettingsViewModel = (VoiceModeSettingsViewModel) baseViewModel;
            C5100v c5100v = (C5100v) AbstractC9112C3.m9642d(voiceModeSettingsViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-1490945787);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C6256d(0.75f, c5100v.f16674e);
                c6021p.m6537c0(objM6514H4);
            }
            C6256d c6256d = (C6256d) objM6514H4;
            c6021p.m6553p(false);
            InterfaceC21925I1 interfaceC21925I1 = c5100v.f16670a;
            List list2 = interfaceC21925I1 instanceof C21921H1 ? ((C2786R0) ((C21921H1) interfaceC21925I1).f69472a).f8502a : C17689w.f56480Y;
            c6021p.m6521P(-1490936597, list2);
            c6021p.m6524S(-1490935205);
            boolean zM6545h = c6021p.m6545h(list2);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                i11 = 3;
                objM6514H5 = new C1267i(3, list2);
                c6021p.m6537c0(objM6514H5);
            } else {
                i11 = 3;
            }
            c6021p.m6553p(false);
            C19408d c19408dM20508b = AbstractC19402K.m20508b(0, (InterfaceC1426a) objM6514H5, c6021p, i11);
            c6021p.m6553p(false);
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(fillElement, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12232n, AbstractC14334L.f44973a);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h2 = C21698j.f68873f;
            C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
            C21694h c21694h3 = C21698j.f68872e;
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h4 = C21698j.f68874g;
            if (c6021p.f19563O) {
                c21694h = c21694h2;
            } else {
                c21694h = c21694h2;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                }
                C21694h c21694h5 = C21698j.f68871d;
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
                C17794y c17794y = C17794y.f56777a;
                C21694h c21694h6 = c21694h;
                AbstractC9274d4.m9842a(AbstractC5086h.f16643a, null, AbstractC8411c.m8969c(-1440662841, c6021p, new C4334d(c8870f, 4)), null, true, null, c6021p, 24966, 42);
                InterfaceC10459q interfaceC10459qM11222h = AbstractC10840a.m11222h(c17794y.m19544b(interfaceC10459q2, true).mo428M(fillElement), c19408dM20508b, EnumC16673F0.f53402Z, false, true, C11043g0.m12022d(c19408dM20508b, null, null, c6021p, 0, 30), null, 36);
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56728e, C10444b.f30947z0, c6021p, 54);
                i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11222h);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h6, c6021p, c17790wM19515a2);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                }
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
                c6021p.m6524S(-216223610);
                if (c5100v.f16670a instanceof C21921H1) {
                    C22011h0.Companion.getClass();
                    C2025h c2025h = new C2025h(new C2532n1(C22007g0.m22342a(), C2823g1.f8561a, null, false, false, null, false, false, false, -4, 2047), 3);
                    C6253a c6253a = C6254b.f20329a;
                    it = list2.iterator();
                    i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else if (AbstractC8033Y5.m8383a((C3077j) it.next())) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    c19408d = c19408dM20508b;
                    float fM5662d = m5662d(c19408d, i13);
                    float f10 = AbstractC2511g1.f7808c;
                    AbstractC8748z.m9500a(c2025h, c6253a, c6256d, AbstractC10844c.m11255o(interfaceC10459q2, 0.0f, 0.0f, f10, f10, 3), 0L, false, c5100v.f16674e, fM5662d, c6021p, 3584, 48);
                } else {
                    c19408d = c19408dM20508b;
                }
                c6021p.m6553p(r29);
                c6021p.m6524S(-216196150);
                zM6542f = c6021p.m6542f(voiceModeSettingsViewModel);
                objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C4171z3(voiceModeSettingsViewModel, 8);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(r29);
                m5660b(c6256d, false, c19408d, (InterfaceC1436k) objM6514H, null, voiceModeSettingsViewModel, c6021p, 56, 16);
                c6021p.m6553p(true);
                WeakHashMap weakHashMap = C17718B0.f56555v;
                InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC17724E0.m19459a(interfaceC10459q2, C17756f.m19480f(c6021p).f56562g), AbstractC7313q.f23201f, AbstractC7313q.f23199d);
                c6021p.m6524S(-233978424);
                zM6542f2 = c6021p.m6542f(voiceModeSettingsViewModel);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C5090l(voiceModeSettingsViewModel, 1);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC5088j.m5658a(c5100v.f16672c, interfaceC10459qM11234l, false, null, false, (InterfaceC1426a) objM6514H2, c6021p, 0, 28);
                c6021p.m6553p(true);
            }
            AbstractC0168G.m537z(i14, c6021p, i14, c21694h4);
            C21694h c21694h7 = C21698j.f68871d;
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d);
            C17794y c17794y2 = C17794y.f56777a;
            C21694h c21694h8 = c21694h;
            AbstractC9274d4.m9842a(AbstractC5086h.f16643a, null, AbstractC8411c.m8969c(-1440662841, c6021p, new C4334d(c8870f, 4)), null, true, null, c6021p, 24966, 42);
            InterfaceC10459q interfaceC10459qM11222h2 = AbstractC10840a.m11222h(c17794y2.m19544b(interfaceC10459q2, true).mo428M(fillElement), c19408dM20508b, EnumC16673F0.f53402Z, false, true, C11043g0.m12022d(c19408dM20508b, null, null, c6021p, 0, 30), null, 36);
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56728e, C10444b.f30947z0, c6021p, 54);
            i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11222h2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a3);
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            } else {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            }
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d3);
            c6021p.m6524S(-216223610);
            if (c5100v.f16670a instanceof C21921H1) {
                C22011h0.Companion.getClass();
                C2025h c2025h2 = new C2025h(new C2532n1(C22007g0.m22342a(), C2823g1.f8561a, null, false, false, null, false, false, false, -4, 2047), 3);
                C6253a c6253a2 = C6254b.f20329a;
                it = list2.iterator();
                i13 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (AbstractC8033Y5.m8383a((C3077j) it.next())) {
                            break;
                            break;
                        }
                        i13++;
                    }
                }
                c19408d = c19408dM20508b;
                float fM5662d2 = m5662d(c19408d, i13);
                float f11 = AbstractC2511g1.f7808c;
                AbstractC8748z.m9500a(c2025h2, c6253a2, c6256d, AbstractC10844c.m11255o(interfaceC10459q2, 0.0f, 0.0f, f11, f11, 3), 0L, false, c5100v.f16674e, fM5662d2, c6021p, 3584, 48);
            } else {
                c19408d = c19408dM20508b;
            }
            c6021p.m6553p(r29);
            c6021p.m6524S(-216196150);
            zM6542f = c6021p.m6542f(voiceModeSettingsViewModel);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C4171z3(voiceModeSettingsViewModel, 8);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C4171z3(voiceModeSettingsViewModel, 8);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(r29);
            m5660b(c6256d, false, c19408d, (InterfaceC1436k) objM6514H, null, voiceModeSettingsViewModel, c6021p, 56, 16);
            c6021p.m6553p(true);
            WeakHashMap weakHashMap2 = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM11234l2 = AbstractC10842a.m11234l(AbstractC17724E0.m19459a(interfaceC10459q2, C17756f.m19480f(c6021p).f56562g), AbstractC7313q.f23201f, AbstractC7313q.f23199d);
            c6021p.m6524S(-233978424);
            zM6542f2 = c6021p.m6542f(voiceModeSettingsViewModel);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = new C5090l(voiceModeSettingsViewModel, 1);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C5090l(voiceModeSettingsViewModel, 1);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC5088j.m5658a(c5100v.f16672c, interfaceC10459qM11234l2, false, null, false, (InterfaceC1426a) objM6514H2, c6021p, 0, 28);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m5662d(C19408d pagerState, int i10) {
        AbstractC16544l.m18094g(pagerState, "pagerState");
        if (pagerState.m20498j() == i10) {
            return 1.0f - Math.abs(((C5994b0) pagerState.f61440c.f207p0).m6409g() * 2);
        }
        return 0.0f;
    }
}
