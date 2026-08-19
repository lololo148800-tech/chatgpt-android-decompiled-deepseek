package com.openai.feature.onboarding.impl.viewmodel;

import bg.C11422v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p046Bk.C1342O;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.EnumC21895B;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CreateAccountViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/CreateAccountViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateAccountViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: e */
    public static final Companion f39103e = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39104a;

    /* JADX INFO: renamed from: b */
    public final C4471b f39105b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39106c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39107d;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CreateAccountViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public CreateAccountViewModelImpl_Factory(InterfaceC17068a onboardingRepo, C4471b auth, InterfaceC17068a resolver, C1342O c1342o, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(onboardingRepo, "onboardingRepo");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39104a = onboardingRepo;
        this.f39105b = auth;
        this.f39106c = resolver;
        this.f39107d = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39104a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C11422v c11422v = (C11422v) obj;
        Object obj2 = this.f39105b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj2;
        Object obj3 = this.f39106c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C1991h c1991h = (C1991h) obj3;
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        Object obj4 = this.f39107d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
        f39103e.getClass();
        return new CreateAccountViewModelImpl(c11422v, abstractC21864z, c1991h, enumC21895B, interfaceC20904w);
    }
}
