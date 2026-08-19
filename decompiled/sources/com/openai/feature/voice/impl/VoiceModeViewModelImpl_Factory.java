package com.openai.feature.voice.impl;

import android.app.Application;
import androidx.lifecycle.C11082S;
import be.C11345b;
import bh.C11434h;
import gd.C13969n2;
import gd.InterfaceC13849E;
import ge.C14053T0;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ne.C17600b;
import p092Dc.C1991h;
import p1025te.C19864O;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p148Fi.C2790T0;
import p148Fi.C2854t0;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p268Kf.C4666u;
import p317Mg.C5350a;
import p341Ni.C5784h0;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p708dh.C13166t;
import p728ei.C13406b;
import p787he.C14459O;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/VoiceModeViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/voice/impl/VoiceModeViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: z */
    public static final Companion f40232z = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f40233a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f40234b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f40235c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f40236d;

    /* JADX INFO: renamed from: e */
    public final C4471b f40237e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f40238f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f40239g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f40240h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f40241i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f40242j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f40243k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f40244l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC17068a f40245m;

    /* JADX INFO: renamed from: n */
    public final C4474e f40246n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC17068a f40247o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC17068a f40248p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC17068a f40249q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC17068a f40250r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC17068a f40251s;

    /* JADX INFO: renamed from: t */
    public final C4474e f40252t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC17068a f40253u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC17068a f40254v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC17068a f40255w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC17068a f40256x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC17068a f40257y;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/VoiceModeViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VoiceModeViewModelImpl_Factory(InterfaceC17068a conversationIdsProvider, InterfaceC17068a clientActionsCoordinator, InterfaceC17068a foregroundDetector, InterfaceC17068a developerSettingsStore, C4471b conversationCoordinator, InterfaceC17068a conversationModelProvider, InterfaceC17068a experimentManager, InterfaceC17068a voiceModeService, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a gizmosRepositoryProvider, InterfaceC17068a conversationGizmoProvider, InterfaceC17068a voiceApi, InterfaceC17068a stringResolver, C4474e context, InterfaceC17068a accountUserRepository, InterfaceC17068a settingsRepository, InterfaceC17068a userSettingsRepository, InterfaceC17068a configurationManager, InterfaceC17068a analytics, C4474e c4474e, InterfaceC17068a inputStateFlow, InterfaceC17068a announcementsRepository, InterfaceC17068a santaExperimentManager, InterfaceC17068a subscriptionNavigationService, InterfaceC17068a voiceSessionObserver) {
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(clientActionsCoordinator, "clientActionsCoordinator");
        AbstractC16544l.m18094g(foregroundDetector, "foregroundDetector");
        AbstractC16544l.m18094g(developerSettingsStore, "developerSettingsStore");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(conversationModelProvider, "conversationModelProvider");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(voiceModeService, "voiceModeService");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(gizmosRepositoryProvider, "gizmosRepositoryProvider");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(voiceApi, "voiceApi");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(userSettingsRepository, "userSettingsRepository");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(announcementsRepository, "announcementsRepository");
        AbstractC16544l.m18094g(santaExperimentManager, "santaExperimentManager");
        AbstractC16544l.m18094g(subscriptionNavigationService, "subscriptionNavigationService");
        AbstractC16544l.m18094g(voiceSessionObserver, "voiceSessionObserver");
        this.f40233a = conversationIdsProvider;
        this.f40234b = clientActionsCoordinator;
        this.f40235c = foregroundDetector;
        this.f40236d = developerSettingsStore;
        this.f40237e = conversationCoordinator;
        this.f40238f = conversationModelProvider;
        this.f40239g = experimentManager;
        this.f40240h = voiceModeService;
        this.f40241i = remoteUserSettingsRepository;
        this.f40242j = gizmosRepositoryProvider;
        this.f40243k = conversationGizmoProvider;
        this.f40244l = voiceApi;
        this.f40245m = stringResolver;
        this.f40246n = context;
        this.f40247o = accountUserRepository;
        this.f40248p = settingsRepository;
        this.f40249q = userSettingsRepository;
        this.f40250r = configurationManager;
        this.f40251s = analytics;
        this.f40252t = c4474e;
        this.f40253u = inputStateFlow;
        this.f40254v = announcementsRepository;
        this.f40255w = santaExperimentManager;
        this.f40256x = subscriptionNavigationService;
        this.f40257y = voiceSessionObserver;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f40233a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C11345b c11345b = (C11345b) obj;
        Object obj2 = this.f40234b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C4666u c4666u = (C4666u) obj2;
        Object obj3 = this.f40235c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13406b c13406b = (C13406b) obj3;
        C20513d c20513d = new C20513d();
        Object obj4 = this.f40236d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C5350a c5350a = (C5350a) obj4;
        Object obj5 = this.f40237e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C14459O c14459o = (C14459O) obj5;
        Object obj6 = this.f40238f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C17600b c17600b = (C17600b) obj6;
        Object obj7 = this.f40239g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj7;
        Object obj8 = this.f40240h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C5784h0 c5784h0 = (C5784h0) obj8;
        Object obj9 = this.f40241i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C13132J c13132j = (C13132J) obj9;
        Object obj10 = this.f40243k.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C16382j c16382j = (C16382j) obj10;
        Object obj11 = this.f40244l.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        C2854t0 c2854t0 = (C2854t0) obj11;
        Object obj12 = this.f40245m.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        C1991h c1991h = (C1991h) obj12;
        Object obj13 = this.f40246n.f14617a;
        AbstractC16544l.m18093f(obj13, "get(...)");
        Application application = (Application) obj13;
        Object obj14 = this.f40247o.get();
        AbstractC16544l.m18093f(obj14, "get(...)");
        C13166t c13166t = (C13166t) obj14;
        Object obj15 = this.f40248p.get();
        AbstractC16544l.m18093f(obj15, "get(...)");
        C16961l c16961l = (C16961l) obj15;
        Object obj16 = this.f40249q.get();
        AbstractC16544l.m18093f(obj16, "get(...)");
        C13133K c13133k = (C13133K) obj16;
        Object obj17 = this.f40250r.get();
        AbstractC16544l.m18093f(obj17, "get(...)");
        C13969n2 c13969n2 = (C13969n2) obj17;
        Object obj18 = this.f40251s.get();
        AbstractC16544l.m18093f(obj18, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj18;
        Object obj19 = this.f40252t.f14617a;
        AbstractC16544l.m18093f(obj19, "get(...)");
        C11082S c11082s = (C11082S) obj19;
        Object obj20 = this.f40253u.get();
        AbstractC16544l.m18093f(obj20, "get(...)");
        C19864O c19864o = (C19864O) obj20;
        Object obj21 = this.f40254v.get();
        AbstractC16544l.m18093f(obj21, "get(...)");
        C13141T c13141t = (C13141T) obj21;
        Object obj22 = this.f40255w.get();
        AbstractC16544l.m18093f(obj22, "get(...)");
        C14053T0 c14053t0 = (C14053T0) obj22;
        Object obj23 = this.f40256x.get();
        AbstractC16544l.m18093f(obj23, "get(...)");
        C11434h c11434h = (C11434h) obj23;
        Object obj24 = this.f40257y.get();
        AbstractC16544l.m18093f(obj24, "get(...)");
        C2790T0 c2790t0 = (C2790T0) obj24;
        f40232z.getClass();
        InterfaceC17068a gizmosRepositoryProvider = this.f40242j;
        AbstractC16544l.m18094g(gizmosRepositoryProvider, "gizmosRepositoryProvider");
        return new VoiceModeViewModelImpl(c11345b, c4666u, c13406b, c20513d, c5350a, c14459o, c17600b, interfaceC13849E, c5784h0, c13132j, gizmosRepositoryProvider, c16382j, c2854t0, c1991h, application, c13166t, c16961l, c13133k, c13969n2, interfaceC20904w, c11082s, c19864o, c13141t, c14053t0, c11434h, c2790t0);
    }
}
