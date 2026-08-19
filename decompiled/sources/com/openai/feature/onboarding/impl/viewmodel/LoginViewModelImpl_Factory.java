package com.openai.feature.onboarding.impl.viewmodel;

import android.app.Application;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p014Ac.AbstractC0424a;
import p046Bk.C1342O;
import p071Ch.C1676g;
import p071Ch.C1692w;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21895B;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p364Oh.C6226E;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/LoginViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/LoginViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LoginViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: i */
    public static final Companion f39199i = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39200a;

    /* JADX INFO: renamed from: b */
    public final C4471b f39201b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39202c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39203d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39204e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f39205f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f39206g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f39207h;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/LoginViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public LoginViewModelImpl_Factory(C4474e application, C1342O c1342o, C4471b auth, InterfaceC17068a resolver, InterfaceC17068a playIntegrityService, InterfaceC17068a analyticsService, InterfaceC17068a devicePreferences, InterfaceC17068a experimentManager, InterfaceC17068a servicesConfig) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(playIntegrityService, "playIntegrityService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f39200a = application;
        this.f39201b = auth;
        this.f39202c = resolver;
        this.f39203d = playIntegrityService;
        this.f39204e = analyticsService;
        this.f39205f = devicePreferences;
        this.f39206g = experimentManager;
        this.f39207h = servicesConfig;
    }

    /* JADX INFO: renamed from: a */
    public static final LoginViewModelImpl_Factory m14330a(C4474e application, C1342O c1342o, C4471b auth, InterfaceC17068a resolver, InterfaceC17068a playIntegrityService, InterfaceC17068a analyticsService, InterfaceC17068a devicePreferences, InterfaceC17068a experimentManager, InterfaceC17068a servicesConfig) {
        f39199i.getClass();
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(playIntegrityService, "playIntegrityService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        return new LoginViewModelImpl_Factory(application, c1342o, auth, resolver, playIntegrityService, analyticsService, devicePreferences, experimentManager, servicesConfig);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39200a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Application application = (Application) obj;
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        Object obj2 = this.f39201b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        AbstractC0424a abstractC0424a = (AbstractC0424a) obj2;
        Object obj3 = this.f39202c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C1991h c1991h = (C1991h) obj3;
        Object obj4 = this.f39203d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C1692w c1692w = (C1692w) obj4;
        Object obj5 = this.f39204e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj5;
        Object obj6 = this.f39205f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C1676g c1676g = (C1676g) obj6;
        Object obj7 = this.f39206g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj7;
        Object obj8 = this.f39207h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C6226E c6226e = (C6226E) obj8;
        f39199i.getClass();
        return new LoginViewModelImpl(application, enumC21895B, abstractC0424a, c1991h, c1692w, interfaceC20904w, c1676g, interfaceC13849E, c6226e);
    }
}
