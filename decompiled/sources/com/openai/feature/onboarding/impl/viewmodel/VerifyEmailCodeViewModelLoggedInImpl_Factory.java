package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.C11082S;
import bg.C11399A;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p046Bk.C1342O;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.EnumC21895B;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p708dh.C13145X;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailCodeViewModelLoggedInImpl_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailCodeViewModelLoggedInImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailCodeViewModelLoggedInImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: g */
    public static final Companion f39246g = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39247a;

    /* JADX INFO: renamed from: b */
    public final C4471b f39248b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39249c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39250d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39251e;

    /* JADX INFO: renamed from: f */
    public final C4474e f39252f;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailCodeViewModelLoggedInImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VerifyEmailCodeViewModelLoggedInImpl_Factory(InterfaceC17068a onboardingService, C4471b auth, InterfaceC17068a userRepository, InterfaceC17068a analyticsService, InterfaceC17068a resolver, C1342O c1342o, C4474e c4474e) {
        AbstractC16544l.m18094g(onboardingService, "onboardingService");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(userRepository, "userRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(resolver, "resolver");
        this.f39247a = onboardingService;
        this.f39248b = auth;
        this.f39249c = userRepository;
        this.f39250d = analyticsService;
        this.f39251e = resolver;
        this.f39252f = c4474e;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39247a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C11399A c11399a = (C11399A) obj;
        Object obj2 = this.f39248b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj2;
        Object obj3 = this.f39249c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13145X c13145x = (C13145X) obj3;
        Object obj4 = this.f39250d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
        Object obj5 = this.f39251e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C1991h c1991h = (C1991h) obj5;
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        Object obj6 = this.f39252f.f14617a;
        AbstractC16544l.m18093f(obj6, "get(...)");
        C11082S c11082s = (C11082S) obj6;
        f39246g.getClass();
        return new VerifyEmailCodeViewModelLoggedInImpl(c11399a, abstractC21864z, c13145x, interfaceC20904w, c1991h, enumC21895B, c11082s);
    }
}
