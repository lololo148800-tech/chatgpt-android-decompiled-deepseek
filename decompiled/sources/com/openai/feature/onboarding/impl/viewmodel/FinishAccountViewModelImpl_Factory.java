package com.openai.feature.onboarding.impl.viewmodel;

import bg.C11422v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p092Dc.C1992i;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p324Mn.C5531a;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FinishAccountViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f39152f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39153a;

    /* JADX INFO: renamed from: b */
    public final C4471b f39154b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39155c;

    /* JADX INFO: renamed from: d */
    public final C1992i f39156d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39157e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public FinishAccountViewModelImpl_Factory(InterfaceC17068a onboardingRepo, C4471b auth, InterfaceC17068a resolver, C1992i clock, InterfaceC17068a analytics) {
        AbstractC16544l.m18094g(onboardingRepo, "onboardingRepo");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(clock, "clock");
        AbstractC16544l.m18094g(analytics, "analytics");
        this.f39153a = onboardingRepo;
        this.f39154b = auth;
        this.f39155c = resolver;
        this.f39156d = clock;
        this.f39157e = analytics;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39153a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C11422v c11422v = (C11422v) obj;
        Object obj2 = this.f39154b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj2;
        Object obj3 = this.f39155c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C1991h c1991h = (C1991h) obj3;
        this.f39156d.get();
        C5531a c5531a = C5531a.f17986a;
        Object obj4 = this.f39157e.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
        f39152f.getClass();
        return new FinishAccountViewModelImpl(c11422v, abstractC21864z, c1991h, c5531a, interfaceC20904w);
    }
}
