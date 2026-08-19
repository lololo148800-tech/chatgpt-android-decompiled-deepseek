package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.C11082S;
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
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailLinkViewModel_Factory;", "LJk/d;", "Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailLinkViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailLinkViewModel_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f39318f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39319a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39320b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39321c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39322d;

    /* JADX INFO: renamed from: e */
    public final C4471b f39323e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailLinkViewModel_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VerifyEmailLinkViewModel_Factory(C4474e c4474e, InterfaceC17068a analytics, InterfaceC17068a resolver, InterfaceC17068a onboardingRepo, C4471b auth, C1342O c1342o) {
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(onboardingRepo, "onboardingRepo");
        AbstractC16544l.m18094g(auth, "auth");
        this.f39319a = c4474e;
        this.f39320b = analytics;
        this.f39321c = resolver;
        this.f39322d = onboardingRepo;
        this.f39323e = auth;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39319a.f14617a;
        String str = CsqksqyPE.tkNf;
        AbstractC16544l.m18093f(obj, str);
        C11082S c11082s = (C11082S) obj;
        Object obj2 = this.f39320b.get();
        AbstractC16544l.m18093f(obj2, str);
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj2;
        Object obj3 = this.f39321c.get();
        AbstractC16544l.m18093f(obj3, str);
        C1991h c1991h = (C1991h) obj3;
        Object obj4 = this.f39322d.get();
        AbstractC16544l.m18093f(obj4, str);
        C11422v c11422v = (C11422v) obj4;
        Object obj5 = this.f39323e.get();
        AbstractC16544l.m18093f(obj5, str);
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj5;
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        f39318f.getClass();
        return new VerifyEmailLinkViewModel(c11082s, interfaceC20904w, c1991h, c11422v, abstractC21864z, enumC21895B);
    }
}
