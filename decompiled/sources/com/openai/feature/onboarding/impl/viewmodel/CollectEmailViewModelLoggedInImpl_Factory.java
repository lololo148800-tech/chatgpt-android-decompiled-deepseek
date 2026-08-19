package com.openai.feature.onboarding.impl.viewmodel;

import bg.C11399A;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p046Bk.C1342O;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21895B;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CollectEmailViewModelLoggedInImpl_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/CollectEmailViewModelLoggedInImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CollectEmailViewModelLoggedInImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f39058d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39059a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39060b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39061c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CollectEmailViewModelLoggedInImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public CollectEmailViewModelLoggedInImpl_Factory(C1342O c1342o, InterfaceC17068a onboardingService, InterfaceC17068a resolver, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(onboardingService, "onboardingService");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39059a = onboardingService;
        this.f39060b = resolver;
        this.f39061c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39059a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        Object obj2 = this.f39060b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39061c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f39058d.getClass();
        return new CollectEmailViewModelLoggedInImpl((C11399A) obj, enumC21895B, (C1991h) obj2, (InterfaceC20904w) obj3);
    }
}
