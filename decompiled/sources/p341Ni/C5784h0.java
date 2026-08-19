package p341Ni;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.javax.sip.C10808o;
import android.media.AudioAttributes;
import android.media.session.MediaSession;
import android.os.Build;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import gd.C13863I1;
import gd.C13969n2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import io.livekit.android.room.C15102a;
import io.sentry.AbstractC15152P0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.RTCStats;
import livekit.org.webrtc.RTCStatsReport;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import ni.C17627a;
import ni.C17628b;
import p016Ae.C0453o;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0631p0;
import p025An.C0644w;
import p046Bk.C1342O;
import p049Bm.InterfaceC1436k;
import p075Cl.C1718a;
import p075Cl.C1719b;
import p075Cl.C1720c;
import p075Cl.C1721d;
import p075Cl.C1722e;
import p086D6.C1970n;
import p092Dc.C1989f;
import p092Dc.C1992i;
import p092Dc.C1993j;
import p101Dl.InterfaceC2101b;
import p101Dl.InterfaceC2110k;
import p101Dl.InterfaceC2112m;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2133G0;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2215x0;
import p103Dn.C2217y0;
import p1061vb.C20513d;
import p1081wc.C20860F;
import p1081wc.C20862H;
import p1081wc.InterfaceC20904w;
import p1113xn.C21307a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.C22031m0;
import p1155zi.EnumC21895B;
import p1155zi.EnumC22033m2;
import p1155zi.InterfaceC21915G;
import p1160zp.AbstractC22225a;
import p124Ei.C2499c1;
import p124Ei.C2502d1;
import p129En.C2604o;
import p148Fi.AbstractC2792U0;
import p148Fi.C2752A;
import p148Fi.C2761E0;
import p148Fi.C2763F0;
import p148Fi.C2769I0;
import p148Fi.C2770J;
import p148Fi.C2791U;
import p148Fi.C2797X;
import p148Fi.C2807b0;
import p148Fi.C2809c;
import p148Fi.C2812d;
import p148Fi.C2816e0;
import p148Fi.C2853t;
import p148Fi.C2854t0;
import p148Fi.C2855u;
import p148Fi.C2864y0;
import p148Fi.C2866z0;
import p148Fi.EnumC2753A0;
import p148Fi.EnumC2779N0;
import p148Fi.EnumC2821g;
import p151Fl.AbstractC2897c;
import p151Fl.C2896b;
import p151Fl.C2900f;
import p151Fl.C2901g;
import p151Fl.C2902h;
import p151Fl.C2903i;
import p151Fl.C2912r;
import p151Fl.C2913s;
import p151Fl.C2914t;
import p151Fl.C2915u;
import p151Fl.C2916v;
import p151Fl.C2917w;
import p151Fl.C2918x;
import p172Gi.C3061C;
import p172Gi.C3071d;
import p172Gi.EnumC3062D;
import p172Gi.EnumC3064F;
import p172Gi.EnumC3068a;
import p175Gl.C3104c;
import p195Hh.C3430e;
import p197Hj.C3457c;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p224Il.C3741a;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p229J0.C4171z3;
import p248Jk.C4471b;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.C4480k;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p273Kl.AbstractC4764c;
import p273Kl.C4708A;
import p273Kl.C4713C0;
import p273Kl.C4727J0;
import p273Kl.C4729K0;
import p273Kl.C4731L0;
import p273Kl.C4762b;
import p273Kl.C4803v0;
import p273Kl.C4805w0;
import p273Kl.C4810z;
import p310M9.C5311e;
import p313Mc.C5317a;
import p317Mg.C5350a;
import p324Mn.C5551u;
import p344Nl.AbstractC5821C;
import p344Nl.C5827I;
import p344Nl.C5842n;
import p344Nl.C5844p;
import p344Nl.C5845q;
import p365Oi.C6256d;
import p365Oi.C6257e;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6471S;
import p387Pl.C6474V;
import p387Pl.C6489i;
import p387Pl.C6494n;
import p387Pl.C6495o;
import p387Pl.C6496p;
import p387Pl.C6502v;
import p387Pl.C6503w;
import p387Pl.EnumC6464K;
import p387Pl.EnumC6476X;
import p387Pl.EnumC6481b;
import p427Rc.C6844a;
import p427Rc.C6852i;
import p479Td.C7351f0;
import p486Tl.C7507f;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8202u0;
import p525Vb.C8258a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8446A2;
import p544W9.AbstractC8452B2;
import p571X9.AbstractC9150J;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p576Xe.C9501z;
import p594Y9.AbstractC9873d3;
import p620Zc.InterfaceC10277b;
import p625Zh.C10396b;
import p658b5.C11241l;
import p720e6.C13287b;
import p728ei.C13406b;
import p793ho.EnumC14781l2;
import p813ij.C15026j;
import p867l8.C16831c;
import p873lh.C16961l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p929oi.AbstractC18201b;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5784h0 {

    /* JADX INFO: renamed from: W */
    public static final boolean f18826W;

    /* JADX INFO: renamed from: A */
    public final C2153Q0 f18827A;

    /* JADX INFO: renamed from: B */
    public final C2127D0 f18828B;

    /* JADX INFO: renamed from: C */
    public final C2127D0 f18829C;

    /* JADX INFO: renamed from: D */
    public final C2153Q0 f18830D;

    /* JADX INFO: renamed from: E */
    public final C2153Q0 f18831E;

    /* JADX INFO: renamed from: F */
    public final C2153Q0 f18832F;

    /* JADX INFO: renamed from: G */
    public final C2153Q0 f18833G;

    /* JADX INFO: renamed from: H */
    public final C2127D0 f18834H;

    /* JADX INFO: renamed from: I */
    public final C2127D0 f18835I;

    /* JADX INFO: renamed from: J */
    public final C2127D0 f18836J;

    /* JADX INFO: renamed from: K */
    public final C2127D0 f18837K;

    /* JADX INFO: renamed from: L */
    public final C2153Q0 f18838L;

    /* JADX INFO: renamed from: M */
    public final C2217y0 f18839M;

    /* JADX INFO: renamed from: N */
    public final C6256d f18840N;

    /* JADX INFO: renamed from: O */
    public final C6257e f18841O;

    /* JADX INFO: renamed from: P */
    public final C2499c1 f18842P;

    /* JADX INFO: renamed from: Q */
    public final C2499c1 f18843Q;

    /* JADX INFO: renamed from: R */
    public final C2127D0 f18844R;

    /* JADX INFO: renamed from: S */
    public final C2215x0 f18845S;

    /* JADX INFO: renamed from: T */
    public final C6844a f18846T;

    /* JADX INFO: renamed from: U */
    public C0631p0 f18847U;

    /* JADX INFO: renamed from: V */
    public final MediaSession f18848V;

    /* JADX INFO: renamed from: a */
    public final C17627a f18849a;

    /* JADX INFO: renamed from: b */
    public final Application f18850b;

    /* JADX INFO: renamed from: c */
    public final C2854t0 f18851c;

    /* JADX INFO: renamed from: d */
    public final C2761E0 f18852d;

    /* JADX INFO: renamed from: e */
    public final C16961l f18853e;

    /* JADX INFO: renamed from: f */
    public final C20513d f18854f;

    /* JADX INFO: renamed from: g */
    public final C13406b f18855g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC13849E f18856h;

    /* JADX INFO: renamed from: i */
    public final C13969n2 f18857i;

    /* JADX INFO: renamed from: j */
    public final C10396b f18858j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC10277b f18859k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f18860l;

    /* JADX INFO: renamed from: m */
    public final C2217y0 f18861m;

    /* JADX INFO: renamed from: n */
    public final C2153Q0 f18862n;

    /* JADX INFO: renamed from: o */
    public final C2217y0 f18863o;

    /* JADX INFO: renamed from: p */
    public final C2604o f18864p;

    /* JADX INFO: renamed from: q */
    public final C2604o f18865q;

    /* JADX INFO: renamed from: r */
    public final C2153Q0 f18866r;

    /* JADX INFO: renamed from: s */
    public final C2217y0 f18867s;

    /* JADX INFO: renamed from: t */
    public final boolean f18868t;

    /* JADX INFO: renamed from: u */
    public final JavaAudioDeviceModule f18869u;

    /* JADX INFO: renamed from: v */
    public final C5801u f18870v;

    /* JADX INFO: renamed from: w */
    public final C4727J0 f18871w;

    /* JADX INFO: renamed from: x */
    public final C2864y0 f18872x;

    /* JADX INFO: renamed from: y */
    public final C17314q f18873y;

    /* JADX INFO: renamed from: z */
    public final C2153Q0 f18874z;

    static {
        f18826W = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    public C5784h0(C17628b releaseCompletable, EnumC21895B appType, C5350a developerSettings, C17627a coroutineScope, Application application, C2854t0 api, C2761E0 broadcastReceiver, C16961l settingsRepository, C20513d dispatcherProvider, C13406b foregroundDetector, InterfaceC13849E experimentManager, C13969n2 configurationManager, C10396b connectivityChecker, InterfaceC10277b hapticEngine, InterfaceC20904w analyticsService) {
        boolean z6;
        C1719b c1719b;
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        AbstractC16544l.m18094g(appType, "appType");
        AbstractC16544l.m18094g(developerSettings, "developerSettings");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(broadcastReceiver, "broadcastReceiver");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(dispatcherProvider, "dispatcherProvider");
        AbstractC16544l.m18094g(foregroundDetector, "foregroundDetector");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(connectivityChecker, "connectivityChecker");
        AbstractC16544l.m18094g(hapticEngine, "hapticEngine");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        int i10 = 7;
        this.f18849a = coroutineScope;
        this.f18850b = application;
        this.f18851c = api;
        this.f18852d = broadcastReceiver;
        this.f18853e = settingsRepository;
        this.f18854f = dispatcherProvider;
        this.f18855g = foregroundDetector;
        this.f18856h = experimentManager;
        this.f18857i = configurationManager;
        this.f18858j = connectivityChecker;
        this.f18859k = hapticEngine;
        this.f18860l = analyticsService;
        InterfaceC18770c interfaceC18770c = null;
        this.f18861m = AbstractC2124C.m3198B(new C9501z(settingsRepository.f54438Z.f64176f, 1), coroutineScope, C2133G0.f6536a, null);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
        this.f18862n = c2153q0M3204c;
        this.f18863o = new C2217y0(c2153q0M3204c);
        int i11 = 3;
        this.f18864p = AbstractC2124C.m3201E(c2153q0M3204c, new C5772b0(i11, interfaceC18770c, 0));
        this.f18865q = AbstractC2124C.m3201E(c2153q0M3204c, new C5772b0(i11, interfaceC18770c, 1));
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(Boolean.FALSE);
        this.f18866r = c2153q0M3204c2;
        this.f18867s = new C2217y0(c2153q0M3204c2);
        if (appType != EnumC21895B.f69419Z) {
            if (((Boolean) AbstractC0575H.m1161I(C18777j.f59682Y, new C5782g0(developerSettings, null))).booleanValue()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f18868t = z6;
        if (z6) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(0).build();
            AbstractC16544l.m18093f(audioAttributesBuild, "build(...)");
            c1719b = new C1719b(0, audioAttributesBuild, 3);
        } else {
            c1719b = new C1719b();
        }
        JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(application);
        boolean z10 = f18826W;
        JavaAudioDeviceModule javaAudioDeviceModuleCreateAudioDeviceModule = builder.setUseHardwareAcousticEchoCanceler(z10).setUseHardwareNoiseSuppressor(z10).setAudioAttributes(c1719b.f4934b).setSamplesReadyCallback(new C5805y(this)).setPlaybackSamplesReadyCallback(new C5805y(this)).createAudioDeviceModule();
        this.f18869u = javaAudioDeviceModuleCreateAudioDeviceModule;
        C5801u c5801u = new C5801u(application, c1719b);
        this.f18870v = c5801u;
        C1721d c1721d = new C1721d(new C1718a(c1719b, c5801u, javaAudioDeviceModuleCreateAudioDeviceModule));
        C1722e c1722eM6173n = m6173n(EnumC6481b.f21035Z);
        Context applicationContext = application.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        AbstractC16544l.m18091d(applicationContext);
        C2900f c2900f = new C2900f(c1721d);
        int i12 = 6;
        InterfaceC4478i interfaceC4478iM5205a = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(new C2901g(c2900f, 6), i10)));
        C0453o c0453o = new C0453o(interfaceC4478iM5205a, i12);
        InterfaceC4478i interfaceC4478iM5208a = C4480k.m5208a(AbstractC2897c.f8710c);
        C4474e c4474eM5206a = C4474e.m5206a(applicationContext);
        boolean z11 = false;
        InterfaceC4478i interfaceC4478iM5205a2 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1989f(c0453o, interfaceC4478iM5208a, interfaceC4478iM5205a, C4480k.m5208a(new C1993j(c4474eM5206a, i12, z11)))));
        InterfaceC4478i interfaceC4478iM5205a3 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1993j(c4474eM5206a, 4, z11)));
        C2901g c2901g = new C2901g(c2900f, 0);
        C2902h c2902h = new C2902h(c2900f);
        C1992i c1992i = new C1992i(new C2901g(c2900f, 2), 4);
        C1992i c1992i2 = new C1992i(c1992i, 3);
        InterfaceC4478i interfaceC4478iM5205a4 = C4472c.m5205a(AbstractC8452B2.m9063b(AbstractC2897c.f8711d));
        InterfaceC4478i interfaceC4478iM5205a5 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1989f(new C2901g(c2900f, 4), c1992i, interfaceC4478iM5205a4, C4472c.m5205a(AbstractC8452B2.m9063b(new C1342O(2))))));
        InterfaceC4478i interfaceC4478iM5205a6 = C4472c.m5205a(AbstractC8452B2.m9063b(AbstractC2897c.f8713f));
        InterfaceC4478i interfaceC4478iM5205a7 = C4472c.m5205a(AbstractC8452B2.m9063b(AbstractC2897c.f8712e));
        InterfaceC4478i interfaceC4478iM5205a8 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2912r(c2901g, c2902h, c1992i2, c4474eM5206a, interfaceC4478iM5205a4, interfaceC4478iM5205a5, interfaceC4478iM5205a6, interfaceC4478iM5205a7)));
        InterfaceC4478i interfaceC4478iM5205a9 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2913s(new C2901g(c2900f, 5), interfaceC4478iM5205a4, 1)));
        C2914t c2914t = new C2914t(interfaceC4478iM5205a9);
        C2918x c2918x = new C2918x(interfaceC4478iM5205a3, c2914t, new C2901g(c2900f, 8));
        C2917w c2917w = new C2917w(interfaceC4478iM5205a3, c2914t, new C2901g(c2900f, 7));
        C2903i c2903i = new C2903i(c2900f);
        InterfaceC4478i interfaceC4478iM5205a10 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2913s((Object) interfaceC4478iM5205a3, (InterfaceC4473d) new C2901g(c2900f, 3), 0)));
        InterfaceC4478i interfaceC4478iM5205a11 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2915u(interfaceC4478iM5205a3, interfaceC4478iM5205a8, c2918x, c2917w, c2903i, interfaceC4478iM5205a4, new C0453o(interfaceC4478iM5205a10, 5))));
        InterfaceC4478i interfaceC4478iM5205a12 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2763F0(interfaceC4478iM5205a2, C4474e.m5206a(new C4708A(new C4810z(interfaceC4478iM5205a11))))));
        InterfaceC4478i interfaceC4478iM5205a13 = C4472c.m5205a(AbstractC8452B2.m9063b(AbstractC4764c.f15545a));
        C4471b c4471b = new C4471b();
        InterfaceC4478i interfaceC4478iM9063b = AbstractC8452B2.m9063b(C4474e.m5206a(new C6503w(new C6495o(interfaceC4478iM5205a11, c4474eM5206a, interfaceC4478iM5205a9, interfaceC4478iM5205a13, c4471b))));
        if (c4471b.f14613a != null) {
            throw new IllegalStateException();
        }
        c4471b.f14613a = interfaceC4478iM9063b;
        C4474e c4474eM5206a2 = C4474e.m5206a(new C6496p(new C6495o(interfaceC4478iM5205a11, c4474eM5206a, interfaceC4478iM5205a9, interfaceC4478iM5205a13, c4471b)));
        C0453o c0453o2 = new C0453o(interfaceC4478iM5205a10, 4);
        C4729K0 c4729k0 = ((C4731L0) C4474e.m5206a(new C4731L0(new C4729K0(interfaceC4478iM5205a12, interfaceC4478iM5205a9, C4474e.m5206a(new C5845q(new C5844p(interfaceC4478iM5205a12, interfaceC4478iM5205a11, c4474eM5206a, interfaceC4478iM5205a9, c4474eM5206a2, c4471b, C4474e.m5206a(new C6489i(new C5311e(c0453o2, interfaceC4478iM5205a6, interfaceC4478iM5205a7, 9))), interfaceC4478iM5205a13, new C2916v(interfaceC4478iM5205a11)))), interfaceC4478iM5205a13, C4472c.m5205a(AbstractC8452B2.m9063b(new C2896b((Object) C4472c.m5205a(AbstractC8452B2.m9063b(new C1993j(c4474eM5206a, 3, false))), (InterfaceC4478i) new C2901g(c2900f, 1), (InterfaceC4473d) c1992i, (int) (0 == true ? 1 : 0)))), interfaceC4478iM5205a4, C4474e.m5206a(new C3104c(new C13287b(interfaceC4478iM5205a11, 10))), interfaceC4478iM5205a5, c0453o2, new C1342O(interfaceC4478iM5205a9, interfaceC4478iM5205a8, 19), C4480k.m5208a(new C2913s((Object) interfaceC4478iM5205a4, (InterfaceC4473d) new C1992i(new C1993j(c4474eM5206a, 5, false), 6), 2)), interfaceC4478iM5205a8, C4474e.m5206a(new C4803v0(new C11241l(interfaceC4478iM5205a, interfaceC4478iM5208a))), new C1992i(new C0453o(interfaceC4478iM5205a, 22), 5)))).f14617a).f15419a;
        C15102a c15102a = (C15102a) c4729k0.f15403a.get();
        EglBase eglBase = (EglBase) c4729k0.f15404b.get();
        C5845q c5845q = (C5845q) c4729k0.f15405c.f14617a;
        C4762b c4762b = (C4762b) c4729k0.f15406d.get();
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC8446A2.m9048a(c3516e);
        C4727J0 c4727j0 = new C4727J0(applicationContext, c15102a, eglBase, c5845q, c4762b, c3516e, (AbstractC0563B) AbstractC2897c.f8708a.get(), (InterfaceC2101b) c4729k0.f15407e.get(), (C3741a) c4729k0.f15408f.get(), (C3104c) c4729k0.f15409g.f14617a, (InterfaceC2112m) c4729k0.f15410h.get(), (InterfaceC2110k) c4729k0.f15411i.get(), new C8258a(), (InterfaceC1436k) c4729k0.f15412j.get(), (AudioDeviceModule) c4729k0.f15413k.get(), (C4803v0) c4729k0.f15414l.f14617a, (C7507f) c4729k0.f15415m.get());
        c4727j0.m5418m(c1722eM6173n);
        this.f18871w = c4727j0;
        this.f18872x = AbstractC2792U0.m3712c("VoiceModeService");
        this.f18873y = AbstractC9227W.m9800c(new C3457c(this, 21));
        C2153Q0 c2153q0M3204c3 = AbstractC2124C.m3204c(new C2770J(EnumC2779N0.Idle));
        this.f18874z = c2153q0M3204c3;
        this.f18827A = c2153q0M3204c3;
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f18828B = c2127d0M3203b;
        this.f18829C = c2127d0M3203b;
        C2153Q0 c2153q0M3204c4 = AbstractC2124C.m3204c("UNKNOWN");
        this.f18830D = c2153q0M3204c4;
        this.f18831E = c2153q0M3204c4;
        C2153Q0 c2153q0M3204c5 = AbstractC2124C.m3204c(C5791l.f18914a);
        this.f18832F = c2153q0M3204c5;
        this.f18833G = c2153q0M3204c5;
        C2127D0 c2127d0M3203b2 = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f18834H = c2127d0M3203b2;
        this.f18835I = c2127d0M3203b2;
        C2127D0 c2127d0M3203b3 = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f18836J = c2127d0M3203b3;
        this.f18837K = c2127d0M3203b3;
        C2153Q0 c2153q0M3204c6 = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f18838L = c2153q0M3204c6;
        C2217y0 c2217y0 = new C2217y0(c2153q0M3204c6);
        this.f18839M = c2217y0;
        this.f18840N = new C6256d(0.5f, false);
        this.f18841O = new C6257e();
        this.f18842P = new C2499c1(AbstractC9873d3.m10529c(new C2502d1(0, 5, C4727J0.class, c4727j0, "sid", "getSid-CC6JpwI()Ljava/lang/String;")), 3);
        this.f18843Q = new C2499c1(AbstractC9873d3.m10529c(new C2502d1(0, 4, C4727J0.class, c4727j0, "remoteParticipants", "getRemoteParticipants()Ljava/util/Map;")), 4);
        C2127D0 c2127d0M3203b4 = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f18844R = c2127d0M3203b4;
        this.f18845S = new C2215x0(c2127d0M3203b4);
        this.f18846T = new C6844a();
        this.f18847U = AbstractC0575H.m1175d();
        MediaSession mediaSession = new MediaSession(this.f18850b, "VoiceModeService");
        this.f18848V = mediaSession;
        AbstractC2124C.m3226y(new C1970n(new C2146N(this.f18861m, 2), 5, new C5806z(this, null)), this.f18849a);
        C17627a c17627a = this.f18849a;
        this.f18854f.getClass();
        C3516e c3516e2 = AbstractC0593T.f1824a;
        AbstractC0575H.m1156D(c17627a, ExecutorC3515d.f10633Z, null, new C5745B(this, null), 2);
        AbstractC2124C.m3226y(new C1970n((C2215x0) c4727j0.f15390o.f34082o0, 5, new C5746C(this, null)), this.f18849a);
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3215n(c2153q0M3204c5), 5, new C5747D(this, null)), this.f18849a);
        AbstractC2124C.m3226y(new C1970n(this.f18852d.f8464f, 5, new C5748E(this, null)), this.f18849a);
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3201E(c2217y0, new C5772b0(3, null, 2)), 5, new C5749F(this, null)), this.f18849a);
        releaseCompletable.m19237b(new C5750G(this, null));
        mediaSession.setCallback(new C5751H(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public static final Object m6167a(C5784h0 c5784h0, String str, String str2, String str3, AbstractC19687c abstractC19687c) throws Throwable {
        C5756M c5756m;
        C5784h0 c5784h1 = c5784h0;
        if (abstractC19687c instanceof C5756M) {
            c5756m = (C5756M) abstractC19687c;
            int i10 = c5756m.f18737p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5756m.f18737p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5756m = new C5756M(c5784h1, abstractC19687c);
            }
        } else {
            c5756m = new C5756M(c5784h1, abstractC19687c);
        }
        Object obj = c5756m.f18735Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5756m.f18737p0;
        C17296C c17296c = C17296C.f55119a;
        C17690x c17690x = C17690x.f56481Y;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c5784h1 = c5756m.f18734Y;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5784h0 c5784h2 = c5756m.f18734Y;
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            C5788j0 c5788j0 = (C5788j0) c5784h1.f18862n.getValue();
            if (c5788j0 != null) {
                c5788j0.m6189b(C20860F.f66386w, c17690x);
            }
            C4727J0 c4727j0 = c5784h1.f18871w;
            if (str3 != null) {
                C10808o c10808o = new C10808o(9);
                EnumC14781l2 enumC14781l2 = EnumC14781l2.GCM;
                C15026j c15026j = new C15026j();
                c15026j.f46724Y = c10808o;
                c15026j.f46725Z = enumC14781l2;
                AbstractC8040Z5.m8411g(c10808o, str3);
                c4727j0.f15399x = c15026j;
            }
            c5756m.f18734Y = c5784h1;
            c5756m.f18737p0 = 1;
            InterfaceC3776x[] interfaceC3776xArr = C4727J0.f15367I;
            C1720c c1720c = new C1720c();
            c4727j0.getClass();
            if (AbstractC0575H.m1183l(new C4713C0(c4727j0, c1720c, str, str2, null), c5756m) == enumC19250a) {
                return enumC19250a;
            }
            C2864y0 c2864y0 = c5784h1.f18872x;
            C4727J0 c4727j1 = c5784h1.f18871w;
            c4727j1.getClass();
            C4805w0 c4805w0 = (C4805w0) c4727j1.f15391p.m8943c(C4727J0.f15367I[0]);
            String str4 = c4805w0 != null ? c4805w0.f15669a : null;
            if (str4 == null) {
                str4 = null;
            }
            AbstractC8160o6.m8726a(c2864y0, "Connected to room " + str4, null, 6);
            AbstractC8160o6.m8726a(c5784h1.f18872x, "Setting microphone enabled", null, 6);
            C5842n c5842n = c4727j1.f15400y;
            c5756m.f18734Y = c5784h1;
            c5756m.f18737p0 = 2;
            c5842n.getClass();
            Object objM6254y = c5842n.m6254y(EnumC6464K.f20970Z, true, null, c5756m);
            if (objM6254y != enumC19250a) {
                objM6254y = c17296c;
            }
            if (objM6254y == enumC19250a) {
                return enumC19250a;
            }
        } catch (CancellationException e10) {
            AbstractC8160o6.m8726a(c5784h1.f18872x, "Connection cancelled", e10, 4);
        } catch (Exception e11) {
            C5788j0 c5788j1 = (C5788j0) c5784h1.f18862n.getValue();
            if (c5788j1 != null) {
                c5788j1.m6189b(C20860F.f66387x, c17690x);
            }
            AbstractC8160o6.m8726a(c5784h1.f18872x, "Failed to connect to webrtc", e11, 4);
            C5795o c5795o = new C5795o(true);
            C2153Q0 c2153q0 = c5784h1.f18832F;
            c2153q0.getClass();
            c2153q0.m3251l(null, c5795o);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: b */
    public static final Object m6168b(C5784h0 c5784h0, C5792l0 c5792l0, AbstractC19687c abstractC19687c) {
        C5760Q c5760q;
        C3071d c3071d;
        C5784h0 c5784h1 = c5784h0;
        if (abstractC19687c instanceof C5760Q) {
            c5760q = (C5760Q) abstractC19687c;
            int i10 = c5760q.f18755q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5760q.f18755q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5760q = new C5760Q(c5784h1, abstractC19687c);
            }
        } else {
            c5760q = new C5760Q(c5784h1, abstractC19687c);
        }
        C5760Q c5760q2 = c5760q;
        Object objM9699d = c5760q2.f18753o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5760q2.f18755q0;
        if (i11 != 0) {
            if (i11 == 1) {
                C3071d c3071d2 = c5760q2.f18752Z;
                C5784h0 c5784h2 = c5760q2.f18751Y;
                AbstractC9233X.m9807c(objM9699d);
                c3071d = c3071d2;
                c5784h1 = c5784h2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9699d);
            }
            return objM9699d;
        }
        AbstractC9233X.m9807c(objM9699d);
        String str = c5792l0.f18915a;
        String str2 = c5792l0.f18919e;
        C22031m0 c22031m0 = str2 != null ? new C22031m0(str2) : null;
        C5788j0 c5788j0 = (C5788j0) c5784h1.f18862n.getValue();
        String str3 = c5788j0 != null ? c5788j0.f18897a : null;
        c3071d = new C3071d(c5792l0.f18920f, c5792l0.f18917c, c5792l0.f18924j, str, c5792l0.f18916b, c5792l0.f18918d, str3, c22031m0, c5792l0.f18921g, c5792l0.f18925k, c5792l0.f18922h, c5792l0.f18923i, c5792l0.f18926l, c5792l0.f18927m);
        C2127D0 c2127d0 = c5784h1.f18836J;
        c5760q2.f18751Y = c5784h1;
        c5760q2.f18752Z = c3071d;
        c5760q2.f18755q0 = 1;
        if (c2127d0.mo395a(c3071d, c5760q2) == enumC19250a) {
            return enumC19250a;
        }
        C5788j0 c5788j1 = (C5788j0) c5784h1.f18862n.getValue();
        if (c5788j1 != null) {
            c5788j1.m6189b(C20862H.f66401i, C17690x.f56481Y);
        }
        C4171z3 c4171z3 = new C4171z3(c5784h1, 21);
        C5761S c5761s = new C5761S(c5784h1, c3071d, null);
        c5760q2.f18751Y = null;
        c5760q2.f18752Z = null;
        c5760q2.f18755q0 = 2;
        objM9699d = AbstractC9150J.m9699d(0, 0L, c4171z3, null, c5761s, c5760q2, 47);
        if (objM9699d == enumC19250a) {
            return enumC19250a;
        }
        return objM9699d;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:1: B:54:0x010b->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: c */
    public static final Object m6169c(C5784h0 c5784h0, C2855u c2855u, AbstractC19687c abstractC19687c) {
        C5763U c5763u;
        AbstractC6468O abstractC6468O;
        C5784h0 c5784h1;
        C2855u performance;
        RTCStatsReport rTCStatsReport;
        C5788j0 c5788j0;
        Iterator<T> it;
        Object obj;
        Object next;
        RTCStats rTCStats;
        Object obj2;
        Double d10;
        long jM8643i;
        C2853t c2853t;
        Map mapM19244f;
        C2153Q0 c2153q0;
        Object value;
        Map<String, Object> members;
        c5784h0.getClass();
        if (abstractC19687c instanceof C5763U) {
            c5763u = (C5763U) abstractC19687c;
            int i10 = c5763u.f18767q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5763u.f18767q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5763u = new C5763U(c5784h0, abstractC19687c);
            }
        } else {
            c5763u = new C5763U(c5784h0, abstractC19687c);
        }
        Object objM7050b = c5763u.f18765o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5763u.f18767q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c2855u = c5763u.f18764Z;
                c5784h0 = c5763u.f18763Y;
                AbstractC9233X.m9807c(objM7050b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                performance = c5763u.f18764Z;
                c5784h1 = c5763u.f18763Y;
                AbstractC9233X.m9807c(objM7050b);
            }
            rTCStatsReport = (RTCStatsReport) objM7050b;
            if (rTCStatsReport != null && (c5788j0 = (C5788j0) c5784h1.f18862n.getValue()) != null) {
                AbstractC16544l.m18094g(performance, "performance");
                if (((C5792l0) c5788j0.f18911o.f6797Y.getValue()).f18925k == EnumC22033m2.Advanced) {
                    it = rTCStatsReport.getStatsMap().values().iterator();
                    do {
                        obj = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC16544l.m18089b(((RTCStats) next).getType(), "remote-inbound-rtp"));
                    rTCStats = (RTCStats) next;
                    if (rTCStats != null || (members = rTCStats.getMembers()) == null) {
                        obj2 = null;
                    } else {
                        obj2 = members.get("roundTripTime");
                    }
                    if (obj2 instanceof Double) {
                        d10 = (Double) obj2;
                    } else {
                        d10 = null;
                    }
                    if (d10 != null) {
                        C21554a c21554a = C21555b.f68260Z;
                        jM8643i = AbstractC8128k6.m8643i(d10.doubleValue(), EnumC21557d.SECONDS);
                        for (Object obj3 : performance.f8619a) {
                            if (AbstractC16544l.m18089b(((C2853t) obj3).f8610a, "Time to audio output")) {
                                obj = obj3;
                                break;
                            }
                        }
                        c2853t = (C2853t) obj;
                        if (c2853t != null) {
                            C21554a c21554a2 = C21555b.f68260Z;
                            long jM8643i2 = AbstractC8128k6.m8643i(c2853t.f8611b, EnumC21557d.MILLISECONDS);
                            mapM19244f = AbstractC17659D.m19244f(new C17309l("time_to_audio_output_ms", Long.valueOf(C21555b.m21835e(jM8643i2))), new C17309l("current_rtt_ms", Long.valueOf(C21555b.m21835e(jM8643i))), new C17309l("total_latency_ms", Long.valueOf(C21555b.m21835e(C21555b.m21839i(jM8643i2, jM8643i)))));
                            do {
                                c2153q0 = c5788j0.f18908l;
                                value = c2153q0.getValue();
                            } while (!c2153q0.m3250k(value, AbstractC17659D.m19248j((Map) value, mapM19244f)));
                            c5788j0.m6189b(C20860F.f66372i, mapM19244f);
                        }
                    }
                }
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM7050b);
        C2127D0 c2127d0 = c5784h0.f18828B;
        c5763u.f18763Y = c5784h0;
        c5763u.f18764Z = c2855u;
        c5763u.f18767q0 = 1;
        if (c2127d0.mo395a(c2855u, c5763u) == enumC19250a) {
            return enumC19250a;
        }
        C5842n c5842n = c5784h0.f18871w.f15400y;
        c5842n.getClass();
        C17309l c17309l = (C17309l) AbstractC17680n.m19343S((List) c5842n.f19012s.m8945c(AbstractC5821C.f18993u[12]));
        if (c17309l != null && (abstractC6468O = (AbstractC6468O) c17309l.f55137Z) != null) {
            c5763u.f18763Y = c5784h0;
            c5763u.f18764Z = c2855u;
            c5763u.f18767q0 = 2;
            objM7050b = abstractC6468O.m7050b(c5763u);
            if (objM7050b == enumC19250a) {
                return enumC19250a;
            }
            C2855u c2855u2 = c2855u;
            c5784h1 = c5784h0;
            performance = c2855u2;
            rTCStatsReport = (RTCStatsReport) objM7050b;
            if (rTCStatsReport != null) {
                AbstractC16544l.m18094g(performance, "performance");
                if (((C5792l0) c5788j0.f18911o.f6797Y.getValue()).f18925k == EnumC22033m2.Advanced) {
                    it = rTCStatsReport.getStatsMap().values().iterator();
                    do {
                        obj = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC16544l.m18089b(((RTCStats) next).getType(), "remote-inbound-rtp"));
                    rTCStats = (RTCStats) next;
                    if (rTCStats != null) {
                        obj2 = null;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Double) {
                        d10 = (Double) obj2;
                    } else {
                        d10 = null;
                    }
                    if (d10 != null) {
                        C21554a c21554a3 = C21555b.f68260Z;
                        jM8643i = AbstractC8128k6.m8643i(d10.doubleValue(), EnumC21557d.SECONDS);
                        while (r11.hasNext()) {
                            if (AbstractC16544l.m18089b(((C2853t) obj3).f8610a, "Time to audio output")) {
                                obj = obj3;
                                break;
                            }
                        }
                        c2853t = (C2853t) obj;
                        if (c2853t != null) {
                            C21554a c21554a4 = C21555b.f68260Z;
                            long jM8643i3 = AbstractC8128k6.m8643i(c2853t.f8611b, EnumC21557d.MILLISECONDS);
                            mapM19244f = AbstractC17659D.m19244f(new C17309l("time_to_audio_output_ms", Long.valueOf(C21555b.m21835e(jM8643i3))), new C17309l("current_rtt_ms", Long.valueOf(C21555b.m21835e(jM8643i))), new C17309l("total_latency_ms", Long.valueOf(C21555b.m21835e(C21555b.m21839i(jM8643i3, jM8643i)))));
                            do {
                                c2153q0 = c5788j0.f18908l;
                                value = c2153q0.getValue();
                            } while (!c2153q0.m3250k(value, AbstractC17659D.m19248j((Map) value, mapM19244f)));
                            c5788j0.m6189b(C20860F.f66372i, mapM19244f);
                        }
                    }
                }
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m6170d(C5784h0 c5784h0, C2791U c2791u, C5762T c5762t) throws Throwable {
        Object objMo395a;
        c5784h0.getClass();
        int i10 = AbstractC5752I.f18712a[c2791u.f8516a.ordinal()];
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 1) {
            if (!((C14005w2) c5784h0.f18856h).m15481a(C13863I1.f43901c)) {
                return c17296c;
            }
            C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
            if (c5788j0 != null) {
                c5788j0.m6189b(C20860F.f66371h, C17690x.f56481Y);
            }
            objMo395a = c5784h0.m6176i(EnumC3068a.ToolHangUp, c5762t);
            if (objMo395a != EnumC19250a.f61036Y) {
                return c17296c;
            }
        } else {
            objMo395a = c5784h0.f18828B.mo395a(c2791u, c5762t);
            if (objMo395a != EnumC19250a.f61036Y) {
                return c17296c;
            }
        }
        return objMo395a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Object m6171e(C5784h0 c5784h0, C2807b0 c2807b0, AbstractC19687c abstractC19687c) {
        C5764V c5764v;
        C5784h0 c5784h1;
        C2807b0 c2807b1;
        C2816e0 c2816e0;
        AbstractC6470Q abstractC6470QMo6219c;
        c5784h0.getClass();
        if (abstractC19687c instanceof C5764V) {
            c5764v = (C5764V) abstractC19687c;
            int i10 = c5764v.f18772q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5764v.f18772q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5764v = new C5764V(c5784h0, abstractC19687c);
            }
        } else {
            c5764v = new C5764V(c5784h0, abstractC19687c);
        }
        Object obj = c5764v.f18770o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5764v.f18772q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c2807b0 = c5764v.f18769Z;
                c5784h0 = c5764v.f18768Y;
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                c2807b1 = c5764v.f18769Z;
                c5784h1 = c5764v.f18768Y;
                AbstractC9233X.m9807c(obj);
                C5784h0 c5784h2 = c5784h1;
                c2807b0 = c2807b1;
                c5784h0 = c5784h2;
                c2816e0 = c2807b0.f8533a;
                if (c2816e0 != null && c2816e0.f8551b) {
                    C5842n c5842n = c5784h0.f18871w.f15400y;
                    c5842n.getClass();
                    abstractC6470QMo6219c = c5842n.mo6219c(EnumC6464K.f20969Y);
                    if (!(abstractC6470QMo6219c != null ? abstractC6470QMo6219c.m7054a() : true)) {
                        AbstractC8160o6.m8726a(c5784h0.f18872x, "Usage limit reached, disable video", null, 6);
                        c5764v.f18768Y = null;
                        c5764v.f18769Z = null;
                        c5764v.f18772q0 = 3;
                        if (c5784h0.m6175h(c5764v) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C2127D0 c2127d0 = c5784h0.f18828B;
        c5764v.f18768Y = c5784h0;
        c5764v.f18769Z = c2807b0;
        c5764v.f18772q0 = 1;
        if (c2127d0.mo395a(c2807b0, c5764v) == enumC19250a) {
            return enumC19250a;
        }
        C2816e0 c2816e1 = c2807b0.f8533a;
        if (c2816e1 == null || !c2816e1.f8550a) {
            c2816e0 = c2807b0.f8533a;
            if (c2816e0 != null) {
                C5842n c5842n2 = c5784h0.f18871w.f15400y;
                c5842n2.getClass();
                abstractC6470QMo6219c = c5842n2.mo6219c(EnumC6464K.f20969Y);
                if (!(abstractC6470QMo6219c != null ? abstractC6470QMo6219c.m7054a() : true)) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "Usage limit reached, disable video", null, 6);
                    c5764v.f18768Y = null;
                    c5764v.f18769Z = null;
                    c5764v.f18772q0 = 3;
                    if (c5784h0.m6175h(c5764v) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        } else {
            AbstractC8160o6.m8726a(c5784h0.f18872x, "Usage limit reached, hang up", null, 6);
            EnumC3068a enumC3068a = EnumC3068a.LimitReached;
            c5764v.f18768Y = c5784h0;
            c5764v.f18769Z = c2807b0;
            c5764v.f18772q0 = 2;
            if (c5784h0.m6176i(enumC3068a, c5764v) == enumC19250a) {
                return enumC19250a;
            }
            C2807b0 c2807b2 = c2807b0;
            c5784h1 = c5784h0;
            c2807b1 = c2807b2;
            C5784h0 c5784h3 = c5784h1;
            c2807b0 = c2807b1;
            c5784h0 = c5784h3;
            c2816e0 = c2807b0.f8533a;
            if (c2816e0 != null) {
                C5842n c5842n3 = c5784h0.f18871w.f15400y;
                c5842n3.getClass();
                abstractC6470QMo6219c = c5842n3.mo6219c(EnumC6464K.f20969Y);
                if (!(abstractC6470QMo6219c != null ? abstractC6470QMo6219c.m7054a() : true)) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "Usage limit reached, disable video", null, 6);
                    c5764v.f18768Y = null;
                    c5764v.f18769Z = null;
                    c5764v.f18772q0 = 3;
                    if (c5784h0.m6175h(c5764v) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: f */
    public static final void m6172f(C5784h0 c5784h0, C2770J c2770j) {
        C2153Q0 c2153q0;
        Object value;
        C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j0 != null) {
            EnumC2779N0 state = c2770j.f8478a;
            AbstractC16544l.m18094g(state, "state");
            int iOrdinal = state.ordinal();
            if (iOrdinal != 3) {
                if (iOrdinal != 5) {
                    if (iOrdinal == 6) {
                        c5788j0.f18906j++;
                        C5551u c5551u = c5788j0.f18905i;
                        if (c5551u != null) {
                            c5788j0.f18905i = null;
                            C5551u.Companion.getClass();
                            c5788j0.m6189b(C20860F.f66384u, AbstractC17660E.m19258c(new C17309l("latency", Long.valueOf(C21555b.m21835e(new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(c5551u))))));
                        }
                    }
                } else if (c5788j0.f18905i == null) {
                    C5551u.Companion.getClass();
                    c5788j0.f18905i = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                }
            } else if (c5788j0.f18904h == null) {
                C5551u.Companion.getClass();
                C5551u c5551u2 = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c5788j0.f18904h = c5551u2;
                long jM5946b = c5551u2.m5946b(c5788j0.f18902f);
                c5788j0.m6189b(C20860F.f66383t, AbstractC17660E.m19258c(new C17309l("latency", Long.valueOf(C21555b.m21835e(jM5946b)))));
                long jM21835e = C21555b.m21835e(jM5946b);
                do {
                    c2153q0 = c5788j0.f18908l;
                    value = c2153q0.getValue();
                } while (!c2153q0.m3250k(value, AbstractC17659D.m19249k((Map) value, new C17309l("First Listening Latency", Long.valueOf(jM21835e)))));
            }
        }
        c5784h0.f18874z.setValue(c2770j);
    }

    /* JADX INFO: renamed from: n */
    public static C1722e m6173n(EnumC6481b enumC6481b) {
        EnumC6476X enumC6476X = EnumC6476X.H720;
        C6471S c6471s = enumC6476X.f21029Y;
        return new C1722e(new C6502v(false, enumC6481b, new C6471S(c6471s.f20999a, c6471s.f21000b, 12, c6471s.f21002d), 3), new C5827I(new C6474V(enumC6476X.f21030Z.f21005a, 12), RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION, 30), 431);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [An.G, java.lang.Object, qm.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public final Object m6174g(EnumC3062D enumC3062D, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EnumC22033m2 enumC22033m2, boolean z6, boolean z10, boolean z11, boolean z12, String str9, C5317a c5317a, AbstractC19687c abstractC19687c) {
        C5753J c5753j;
        EnumC3064F enumC3064F;
        C5792l0 c5792l0;
        String str10;
        EnumC22033m2 enumC22033m3;
        int i10;
        Object obj;
        EnumC3062D enumC3062D2;
        String str11;
        C5317a c5317a2;
        C5792l0 c5792l1;
        C5784h0 c5784h0;
        C2217y0 c2217y0;
        C5792l0 c5792l2;
        boolean zEquals;
        boolean z13;
        boolean zEquals2;
        boolean zEquals3;
        ?? r6;
        String str12 = str;
        if (abstractC19687c instanceof C5753J) {
            c5753j = (C5753J) abstractC19687c;
            int i11 = c5753j.f18722v0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5753j.f18722v0 = i11 - Integer.MIN_VALUE;
            } else {
                c5753j = new C5753J(this, abstractC19687c);
            }
        } else {
            c5753j = new C5753J(this, abstractC19687c);
        }
        C5753J c5753j2 = c5753j;
        Object obj2 = c5753j2.f18720t0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c5753j2.f18722v0;
        C17296C c17296c = C17296C.f55119a;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (z12) {
                enumC3064F = EnumC3064F.f9241o0;
            } else {
                if (z12) {
                    throw new C0644w();
                }
                enumC3064F = EnumC3064F.f9240Z;
            }
            EnumC3064F enumC3064F2 = enumC3064F;
            c5792l0 = c5792l0;
            C5792l0 c5792l3 = new C5792l0(str, str2, str4, str5, str6, str7, z6, z10, z11, str8, enumC22033m2, enumC3064F2, str9);
            InterfaceC5798r interfaceC5798r = (InterfaceC5798r) this.f18832F.getValue();
            if ((interfaceC5798r instanceof C5791l) || (interfaceC5798r instanceof C5789k)) {
                C5788j0 c5788j0 = (C5788j0) this.f18862n.getValue();
                boolean z14 = false;
                if (c5788j0 == null || (c2217y0 = c5788j0.f18911o) == null || (c5792l2 = (C5792l0) c2217y0.f6797Y.getValue()) == null) {
                    str10 = str7;
                    enumC22033m3 = enumC22033m2;
                    i10 = 1;
                } else {
                    String str13 = c5792l2.f18915a;
                    if (str13 == null) {
                        if (str12 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str12 == null) {
                        zEquals = false;
                    } else {
                        zEquals = str13.equals(str12);
                    }
                    if (zEquals) {
                        String str14 = c5792l2.f18916b;
                        if (str14 == null) {
                            if (str2 == null) {
                                zEquals2 = true;
                            } else {
                                zEquals2 = false;
                            }
                        } else if (str2 == null) {
                            zEquals2 = false;
                        } else {
                            zEquals2 = str14.equals(str2);
                        }
                        if (zEquals2 && AbstractC16544l.m18089b(c5792l2.f18917c, str4) && AbstractC16544l.m18089b(c5792l2.f18918d, str5)) {
                            String str15 = c5792l2.f18919e;
                            if (str15 == null) {
                                if (str6 == null) {
                                    zEquals3 = true;
                                } else {
                                    zEquals3 = false;
                                }
                            } else if (str6 == null) {
                                zEquals3 = false;
                            } else {
                                zEquals3 = str15.equals(str6);
                            }
                            if (zEquals3) {
                                str10 = str7;
                                if (AbstractC16544l.m18089b(c5792l2.f18920f, str10) && c5792l2.f18921g == z6 && c5792l2.f18922h == z10 && AbstractC16544l.m18089b(c5792l2.f18924j, str8)) {
                                    enumC22033m3 = enumC22033m2;
                                    if (c5792l2.f18925k == enumC22033m3 && c5792l2.f18926l == enumC3064F2) {
                                        z13 = true;
                                    }
                                }
                                z13 = false;
                            } else {
                                str10 = str7;
                            }
                            enumC22033m3 = enumC22033m2;
                            z13 = false;
                        } else {
                            str10 = str7;
                            enumC22033m3 = enumC22033m2;
                            z13 = false;
                        }
                    } else {
                        str10 = str7;
                        enumC22033m3 = enumC22033m2;
                        z13 = false;
                    }
                    i10 = 1;
                    if (z13) {
                        z14 = true;
                    }
                }
                C2864y0 c2864y0 = this.f18872x;
                if (z14) {
                    AbstractC8160o6.m8726a(c2864y0, "Already connected", null, 6);
                    return c17296c;
                }
                obj = null;
                AbstractC8160o6.m8726a(c2864y0, "Changing mode to " + enumC22033m3, null, 6);
                EnumC3068a enumC3068a = EnumC3068a.Reconnect;
                c5753j2.f18713Y = this;
                enumC3062D2 = enumC3062D;
                c5753j2.f18714Z = enumC3062D2;
                c5753j2.f18715o0 = str12;
                str11 = str3;
                c5753j2.f18716p0 = str11;
                c5753j2.f18717q0 = str10;
                c5317a2 = c5317a;
                c5753j2.f18718r0 = c5317a2;
                c5753j2.f18719s0 = c5792l0;
                c5753j2.f18722v0 = i10;
                if (m6176i(enumC3068a, c5753j2) == enumC19250a) {
                    return enumC19250a;
                }
                c5792l1 = c5792l0;
                c5784h0 = this;
            } else {
                enumC3062D2 = enumC3062D;
                str11 = str3;
                str10 = str7;
                c5317a2 = c5317a;
                c5784h0 = this;
                r6 = 0;
            }
            C2153Q0 c2153q0 = c5784h0.f18862n;
            C5788j0 c5788j1 = new C5788j0(str11, enumC3062D2, c5792l0, c5784h0.f18855g, c5784h0.f18860l);
            c2153q0.getClass();
            c2153q0.m3251l(r6, c5788j1);
            C5791l c5791l = C5791l.f18914a;
            C2153Q0 c2153q1 = c5784h0.f18832F;
            c2153q1.getClass();
            c2153q1.m3251l(r6, c5791l);
            C2770J c2770j = new C2770J(EnumC2779N0.Idle);
            C2153Q0 c2153q2 = c5784h0.f18874z;
            c2153q2.getClass();
            c2153q2.m3251l(r6, c2770j);
            c5784h0.f18847U = AbstractC0575H.m1175d();
            c5784h0.f18846T.m7281a(AbstractC0575H.m1156D(c5784h0.f18849a, r6, r6, new C5755L(c5317a2, c5784h0, c5792l0, str10, str12, null), 3));
            return c17296c;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c5792l1 = c5753j2.f18719s0;
        C5317a c5317a3 = c5753j2.f18718r0;
        String str16 = c5753j2.f18717q0;
        String str17 = c5753j2.f18716p0;
        String str18 = c5753j2.f18715o0;
        EnumC3062D enumC3062D3 = c5753j2.f18714Z;
        c5784h0 = c5753j2.f18713Y;
        AbstractC9233X.m9807c(obj2);
        str12 = str18;
        obj = null;
        c5317a2 = c5317a3;
        str10 = str16;
        str11 = str17;
        enumC3062D2 = enumC3062D3;
        c5792l0 = c5792l1;
        r6 = obj;
        C2153Q0 c2153q3 = c5784h0.f18862n;
        C5788j0 c5788j2 = new C5788j0(str11, enumC3062D2, c5792l0, c5784h0.f18855g, c5784h0.f18860l);
        c2153q3.getClass();
        c2153q3.m3251l(r6, c5788j2);
        C5791l c5791l2 = C5791l.f18914a;
        C2153Q0 c2153q4 = c5784h0.f18832F;
        c2153q4.getClass();
        c2153q4.m3251l(r6, c5791l2);
        C2770J c2770j2 = new C2770J(EnumC2779N0.Idle);
        C2153Q0 c2153q5 = c5784h0.f18874z;
        c2153q5.getClass();
        c2153q5.m3251l(r6, c2770j2);
        c5784h0.f18847U = AbstractC0575H.m1175d();
        c5784h0.f18846T.m7281a(AbstractC0575H.m1156D(c5784h0.f18849a, r6, r6, new C5755L(c5317a2, c5784h0, c5792l0, str10, str12, null), 3));
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m6175h(AbstractC19687c abstractC19687c) throws Throwable {
        C5757N c5757n;
        C5784h0 c5784h0;
        if (abstractC19687c instanceof C5757N) {
            c5757n = (C5757N) abstractC19687c;
            int i10 = c5757n.f18741p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5757n.f18741p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5757n = new C5757N(this, abstractC19687c);
            }
        } else {
            c5757n = new C5757N(this, abstractC19687c);
        }
        Object obj = c5757n.f18739Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5757n.f18741p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C4727J0 c4727j0 = this.f18871w;
            C5842n c5842n = c4727j0.f15400y;
            c5842n.getClass();
            EnumC6464K enumC6464K = EnumC6464K.f20969Y;
            AbstractC6470Q abstractC6470QMo6219c = c5842n.mo6219c(enumC6464K);
            if (!(abstractC6470QMo6219c != null ? abstractC6470QMo6219c.m7054a() : true)) {
                c5757n.f18738Y = this;
                c5757n.f18741p0 = 1;
                C5842n c5842n2 = c4727j0.f15400y;
                c5842n2.getClass();
                Object objM6254y = c5842n2.m6254y(enumC6464K, false, null, c5757n);
                if (objM6254y != enumC19250a) {
                    objM6254y = c17296c;
                }
                if (objM6254y == enumC19250a) {
                    return enumC19250a;
                }
                c5784h0 = this;
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c5784h0 = c5757n.f18738Y;
        AbstractC9233X.m9807c(obj);
        C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(C20862H.f66395c, C17690x.f56481Y);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: i */
    public final Object m6176i(EnumC3068a enumC3068a, AbstractC19687c abstractC19687c) throws Throwable {
        C5758O c5758o;
        C3061C c3061c;
        C5784h0 c5784h0;
        EnumC3068a enumC3068a2;
        C21555b c21555b;
        C5551u c5551u;
        if (abstractC19687c instanceof C5758O) {
            c5758o = (C5758O) abstractC19687c;
            int i10 = c5758o.f18746q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5758o.f18746q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5758o = new C5758O(this, abstractC19687c);
            }
        } else {
            c5758o = new C5758O(this, abstractC19687c);
        }
        Object obj = c5758o.f18744o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5758o.f18746q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            m6186t();
            C0564B0 c0564b0 = this.f18846T.f21949a;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            this.f18847U.mo1275e(null);
            int iOrdinal = enumC3068a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                C2127D0 c2127d0 = this.f18844R;
                C5788j0 c5788j0 = (C5788j0) this.f18862n.getValue();
                if (c5788j0 != null) {
                    C5551u c5551u2 = c5788j0.f18903g;
                    if (c5551u2 != null) {
                        C5551u.Companion.getClass();
                        c21555b = new C21555b(new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(c5551u2));
                    } else {
                        c21555b = null;
                    }
                    EnumC22033m2 mode = ((C5792l0) c5788j0.f18911o.f6797Y.getValue()).f18925k;
                    boolean z6 = c5788j0.f18907k;
                    String voiceSessionId = c5788j0.f18897a;
                    AbstractC16544l.m18094g(voiceSessionId, "voiceSessionId");
                    EnumC3062D surface = c5788j0.f18898b;
                    AbstractC16544l.m18094g(surface, "surface");
                    AbstractC16544l.m18094g(mode, "mode");
                    c3061c = new C3061C(c21555b, voiceSessionId, surface, mode, enumC3068a, z6);
                } else {
                    c3061c = null;
                }
                c5758o.f18742Y = this;
                c5758o.f18743Z = enumC3068a;
                c5758o.f18746q0 = 1;
                if (c2127d0.mo395a(c3061c, c5758o) == enumC19250a) {
                    return enumC19250a;
                }
                c5784h0 = this;
                enumC3068a2 = enumC3068a;
            } else {
                enumC3068a2 = enumC3068a;
                c5784h0 = this;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC3068a2 = c5758o.f18743Z;
            c5784h0 = c5758o.f18742Y;
            AbstractC9233X.m9807c(obj);
        }
        AbstractC8160o6.m8726a(c5784h0.f18872x, "Disconnecting from room: " + enumC3068a2, null, 6);
        C5788j0 c5788j1 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j1 != null && (c5551u = c5788j1.f18903g) != null) {
            C5551u.Companion.getClass();
            long jM5946b = new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(c5551u);
            C20862H c20862h = C20862H.f66407o;
            C17309l c17309l = new C17309l("session_length_seconds", Long.valueOf(C21555b.m21841k(jM5946b, EnumC21557d.SECONDS)));
            String str = enumC3068a2 != null ? enumC3068a2.f9255Y : null;
            if (str == null) {
                str = "";
            }
            c5788j1.m6189b(c20862h, AbstractC17659D.m19244f(c17309l, new C17309l("reason", str)));
        }
        int iOrdinal2 = enumC3068a2.ordinal();
        Object c5795o = C5794n.f18929a;
        Object c5796p = C5797q.f18932a;
        switch (iOrdinal2) {
            case 0:
            case 1:
            case 5:
                break;
            case 2:
                c5795o = new C5795o(false);
                break;
            case 3:
            case 6:
                c5795o = c5796p;
                break;
            case 4:
                c5795o = new C5795o(true);
                break;
            default:
                throw new C0644w();
        }
        C2153Q0 c2153q0 = c5784h0.f18832F;
        c2153q0.getClass();
        c2153q0.m3251l(null, c5795o);
        try {
            c5784h0.f18871w.m5408c();
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(c5784h0.f18872x, "Failed to disconnect", e10, null, 4);
        }
        switch (enumC3068a2.ordinal()) {
            case 0:
                c5796p = new C5796p();
                break;
            case 1:
                c5796p = new C5796p();
                break;
            case 2:
                c5796p = new C5795o(false);
                break;
            case 3:
            case 6:
                break;
            case 4:
                c5796p = new C5795o(true);
                break;
            case 5:
                c5796p = new C5796p();
                break;
            default:
                throw new C0644w();
        }
        c2153q0.getClass();
        c2153q0.m3251l(null, c5796p);
        C2770J c2770j = new C2770J(EnumC2779N0.Idle);
        C2153Q0 c2153q1 = c5784h0.f18874z;
        c2153q1.getClass();
        c2153q1.m3251l(null, c2770j);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m6177j(AbstractC19687c abstractC19687c) throws Throwable {
        C5759P c5759p;
        C5784h0 c5784h0;
        if (abstractC19687c instanceof C5759P) {
            c5759p = (C5759P) abstractC19687c;
            int i10 = c5759p.f18750p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5759p.f18750p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5759p = new C5759P(this, abstractC19687c);
            }
        } else {
            c5759p = new C5759P(this, abstractC19687c);
        }
        Object obj = c5759p.f18748Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5759p.f18750p0;
        C17296C c17296c = C17296C.f55119a;
        String strM3713a = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C5842n c5842n = this.f18871w.f15400y;
            c5759p.f18747Y = this;
            c5759p.f18750p0 = 1;
            c5842n.getClass();
            Object objM6254y = c5842n.m6254y(EnumC6464K.f20969Y, true, null, c5759p);
            if (objM6254y != enumC19250a) {
                objM6254y = c17296c;
            }
            if (objM6254y == enumC19250a) {
                return enumC19250a;
            }
            c5784h0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5784h0 = c5759p.f18747Y;
            AbstractC9233X.m9807c(obj);
        }
        EnumC6481b enumC6481b = (EnumC6481b) c5784h0.f18861m.f6797Y.getValue();
        if (enumC6481b != null) {
            C2812d c2812d = C2812d.f8540a;
            strM3713a = C2812d.m3713a(enumC6481b);
        }
        if (strM3713a == null) {
            strM3713a = "";
        }
        C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(C20860F.f66365F, AbstractC17660E.m19258c(new C17309l("camera", strM3713a)));
            c5788j0.f18907k = true;
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: k */
    public final void m6178k() {
        AbstractC8160o6.m8726a(this.f18872x, "Muting microphone", null, 6);
        Boolean bool = Boolean.TRUE;
        C2153Q0 c2153q0 = this.f18866r;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
        this.f18869u.setMicrophoneMute(true);
        C5788j0 c5788j0 = (C5788j0) this.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(C20860F.f66389z, C17690x.f56481Y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m6179l(C2769I0 c2769i0, InterfaceC18770c interfaceC18770c) {
        C5768Z c5768z;
        C5784h0 c5784h0;
        String strM12905d;
        C5784h0 c5784h1;
        if (interfaceC18770c instanceof C5768Z) {
            c5768z = (C5768Z) interfaceC18770c;
            int i10 = c5768z.f18788q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5768z.f18788q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5768z = new C5768Z(this, interfaceC18770c);
            }
        } else {
            c5768z = new C5768Z(this, interfaceC18770c);
        }
        Object obj = c5768z.f18786o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5768z.f18788q0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c2769i0 = c5768z.f18785Z;
                    c5784h0 = c5768z.f18784Y;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5784h1 = c5768z.f18784Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                    } catch (Exception e10) {
                        e = e10;
                        AbstractC8160o6.m8726a(c5784h1.f18872x, "Failed to publish message", e, 4);
                    }
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C2127D0 c2127d0 = this.f18834H;
            c5768z.f18784Y = this;
            c5768z.f18785Z = c2769i0;
            c5768z.f18788q0 = 1;
            if (c2127d0.mo395a(c2769i0, c5768z) == enumC19250a) {
                return enumC19250a;
            }
            c5784h0 = this;
            C5842n c5842n = c5784h0.f18871w.f15400y;
            byte[] bytes = strM12905d.getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            c5768z.f18784Y = c5784h0;
            c5768z.f18785Z = null;
            c5768z.f18788q0 = 2;
            if (C5842n.m6246t(c5842n, bytes, c5768z) == enumC19250a) {
                return enumC19250a;
            }
        } catch (Exception e11) {
            e = e11;
            c5784h1 = c5784h0;
            AbstractC8160o6.m8726a(c5784h1.f18872x, "Failed to publish message", e, 4);
        }
        strM12905d = AbstractC18201b.f58034a.m12905d(C2769I0.Companion.serializer(), c2769i0);
        AbstractC8160o6.m8726a(c5784h0.f18872x, "Publishing message: ".concat(strM12905d), null, 6);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m6180m(C7351f0 c7351f0, AbstractC19694j abstractC19694j) {
        AbstractC8160o6.m8726a(this.f18872x, "relayMessage", null, 6);
        EnumC2821g enumC2821g = EnumC2821g.RelayMessage;
        C2866z0 c2866z0 = EnumC2753A0.Companion;
        Object objM6179l = m6179l(new C2769I0(enumC2821g, new C2752A(AbstractC8202u0.m8818d(c7351f0))), abstractC19694j);
        return objM6179l == EnumC19250a.f61036Y ? objM6179l : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m6181o(InterfaceC21915G interfaceC21915G, AbstractC19687c abstractC19687c) {
        C5770a0 c5770a0;
        C5784h0 c5784h0;
        if (abstractC19687c instanceof C5770a0) {
            c5770a0 = (C5770a0) abstractC19687c;
            int i10 = c5770a0.f18793p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5770a0.f18793p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5770a0 = new C5770a0(this, abstractC19687c);
            }
        } else {
            c5770a0 = new C5770a0(this, abstractC19687c);
        }
        Object obj = c5770a0.f18791Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5770a0.f18793p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC8160o6.m8726a(this.f18872x, "sendImage", null, 6);
            C2769I0 c2769i0 = new C2769I0(EnumC2821g.TurnContext, new C2797X(AbstractC17660E.m19258c(new C17309l("image", interfaceC21915G))));
            c5770a0.f18790Y = this;
            c5770a0.f18793p0 = 1;
            if (m6179l(c2769i0, c5770a0) == enumC19250a) {
                return enumC19250a;
            }
            c5784h0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5784h0 = c5770a0.f18790Y;
            AbstractC9233X.m9807c(obj);
        }
        C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.f18907k = true;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m6182p(Intent intent, AbstractC19687c abstractC19687c) {
        C5778e0 c5778e0;
        C5784h0 c5784h0;
        C6494n c6494nM6243o;
        C5784h0 c5784h1;
        C5788j0 c5788j0;
        if (abstractC19687c instanceof C5778e0) {
            c5778e0 = (C5778e0) abstractC19687c;
            int i10 = c5778e0.f18816r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5778e0.f18816r0 = i10 - Integer.MIN_VALUE;
            } else {
                c5778e0 = new C5778e0(this, abstractC19687c);
            }
        } else {
            c5778e0 = new C5778e0(this, abstractC19687c);
        }
        Object obj = c5778e0.f18814p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5778e0.f18816r0;
        if (i11 != 0) {
            if (i11 == 1) {
                intent = (Intent) c5778e0.f18812Z;
                c5784h0 = c5778e0.f18811Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6494nM6243o = c5778e0.f18813o0;
                c5784h1 = c5778e0.f18811Y;
                AbstractC9233X.m9807c(obj);
            }
            c6494nM6243o.mo7059o();
            c5788j0 = (C5788j0) c5784h1.f18862n.getValue();
            if (c5788j0 != null) {
                c5788j0.m6189b(C20860F.f66361B, C17690x.f56481Y);
                c5788j0.f18907k = true;
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C6852i c6852i = this.f18855g.f42470d;
        C5780f0 c5780f0 = new C5780f0(2, null);
        c5778e0.f18811Y = this;
        c5778e0.f18812Z = intent;
        c5778e0.f18816r0 = 1;
        if (AbstractC2124C.m3220s(c6852i, c5780f0, c5778e0) == enumC19250a) {
            return enumC19250a;
        }
        c5784h0 = this;
        c6494nM6243o = C5842n.m6243o(c5784h0.f18871w.f15400y, intent);
        C5842n c5842n = c5784h0.f18871w.f15400y;
        c5778e0.f18811Y = c5784h0;
        c5778e0.f18812Z = c6494nM6243o;
        c5778e0.f18813o0 = c6494nM6243o;
        c5778e0.f18816r0 = 2;
        if (C5842n.m6247w(c5842n, c6494nM6243o, null, c5778e0, 6) == enumC19250a) {
            return enumC19250a;
        }
        c5784h1 = c5784h0;
        c6494nM6243o.mo7059o();
        c5788j0 = (C5788j0) c5784h1.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(C20860F.f66361B, C17690x.f56481Y);
            c5788j0.f18907k = true;
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: q */
    public final Object m6183q(AbstractC19694j abstractC19694j) {
        AbstractC8160o6.m8726a(this.f18872x, "Manually stopping listening intently", null, 6);
        Object objM6179l = m6179l(new C2769I0(EnumC2821g.ActionRequest, new C2809c(EnumC2753A0.StopListeningIntently)), abstractC19694j);
        return objM6179l == EnumC19250a.f61036Y ? objM6179l : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: r */
    public final Object m6184r(AbstractC19694j abstractC19694j) throws Throwable {
        C4727J0 c4727j0 = this.f18871w;
        C5842n c5842n = c4727j0.f15400y;
        c5842n.getClass();
        EnumC6464K enumC6464K = EnumC6464K.f20971o0;
        AbstractC6470Q abstractC6470QMo6219c = c5842n.mo6219c(enumC6464K);
        boolean zM7054a = abstractC6470QMo6219c != null ? abstractC6470QMo6219c.m7054a() : true;
        C17296C c17296c = C17296C.f55119a;
        if (!zM7054a) {
            C5788j0 c5788j0 = (C5788j0) this.f18862n.getValue();
            if (c5788j0 != null) {
                c5788j0.m6189b(C20860F.f66362C, C17690x.f56481Y);
            }
            C5842n c5842n2 = c4727j0.f15400y;
            c5842n2.getClass();
            Object objM6254y = c5842n2.m6254y(enumC6464K, false, null, abstractC19694j);
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (objM6254y != enumC19250a) {
                objM6254y = c17296c;
            }
            if (objM6254y == enumC19250a) {
                return objM6254y;
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: s */
    public final void m6185s() {
        AbstractC8160o6.m8726a(this.f18872x, "Unmuting microphone", null, 6);
        Boolean bool = Boolean.FALSE;
        C2153Q0 c2153q0 = this.f18866r;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
        this.f18869u.setMicrophoneMute(false);
        C5788j0 c5788j0 = (C5788j0) this.f18862n.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(C20860F.f66363D, C17690x.f56481Y);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6186t() {
        if (((Boolean) this.f18855g.f42470d.getValue()).booleanValue()) {
            AbstractC8160o6.m8726a(this.f18872x, "Stopping voice mode foreground service", null, 6);
            C3430e c3430e = VoiceModeForegroundService.f40396o0;
            Application context = this.f18850b;
            AbstractC16544l.m18094g(context, "context");
            AbstractC15152P0.m16327a("VoiceModeForegroundService.stopService");
            Intent intent = new Intent(context, (Class<?>) VoiceModeForegroundService.class);
            intent.setAction("stop");
            context.startService(intent);
        }
        C2761E0 c2761e0 = this.f18852d;
        if (c2761e0.f8463e) {
            c2761e0.f8463e = false;
            c2761e0.f8459a.unregisterReceiver(c2761e0);
        }
    }
}
