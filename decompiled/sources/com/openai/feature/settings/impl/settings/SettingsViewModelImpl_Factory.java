package com.openai.feature.settings.impl.settings;

import android.app.Application;
import bh.C11434h;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p620Zc.InterfaceC10277b;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13166t;
import p811ih.C15000g;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/settings/SettingsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/settings/SettingsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SettingsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: m */
    public static final Companion f39747m = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39748a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39749b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39750c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39751d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39752e;

    /* JADX INFO: renamed from: f */
    public final C4471b f39753f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f39754g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f39755h;

    /* JADX INFO: renamed from: i */
    public final C4474e f39756i;

    /* JADX INFO: renamed from: j */
    public final C4471b f39757j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f39758k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f39759l;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/settings/SettingsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SettingsViewModelImpl_Factory(InterfaceC17068a hapticEngine, InterfaceC17068a accountUserProvider, InterfaceC17068a experimentManager, InterfaceC17068a voiceSettingsRepository, InterfaceC17068a accountUserRepository, C4471b auth, InterfaceC17068a settingsRepository, InterfaceC17068a remoteUserSettingsRepository, C4474e context, C4471b authSessionProvider, InterfaceC17068a analyticsService, InterfaceC17068a subscriptionNavigationService) {
        AbstractC16544l.m18094g(hapticEngine, "hapticEngine");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(voiceSettingsRepository, "voiceSettingsRepository");
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(subscriptionNavigationService, "subscriptionNavigationService");
        this.f39748a = hapticEngine;
        this.f39749b = accountUserProvider;
        this.f39750c = experimentManager;
        this.f39751d = voiceSettingsRepository;
        this.f39752e = accountUserRepository;
        this.f39753f = auth;
        this.f39754g = settingsRepository;
        this.f39755h = remoteUserSettingsRepository;
        this.f39756i = context;
        this.f39757j = authSessionProvider;
        this.f39758k = analyticsService;
        this.f39759l = subscriptionNavigationService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39748a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        InterfaceC10277b interfaceC10277b = (InterfaceC10277b) obj;
        Object obj2 = this.f39749b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C15000g c15000g = (C15000g) obj2;
        Object obj3 = this.f39750c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj3;
        Object obj4 = this.f39751d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C16961l c16961l = (C16961l) obj4;
        Object obj5 = this.f39752e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13166t c13166t = (C13166t) obj5;
        Object obj6 = this.f39753f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj6;
        Object obj7 = this.f39754g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C13133K c13133k = (C13133K) obj7;
        Object obj8 = this.f39755h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C13132J c13132j = (C13132J) obj8;
        Object obj9 = this.f39756i.f14617a;
        AbstractC16544l.m18093f(obj9, "get(...)");
        Application application = (Application) obj9;
        Object obj10 = this.f39757j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        AbstractC21864z abstractC21864z2 = (AbstractC21864z) obj10;
        Object obj11 = this.f39758k.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj11;
        Object obj12 = this.f39759l.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        C11434h c11434h = (C11434h) obj12;
        f39747m.getClass();
        return new SettingsViewModelImpl(interfaceC10277b, c15000g, interfaceC13849E, c16961l, c13166t, abstractC21864z, c13133k, c13132j, application, abstractC21864z2, interfaceC20904w, c11434h);
    }
}
