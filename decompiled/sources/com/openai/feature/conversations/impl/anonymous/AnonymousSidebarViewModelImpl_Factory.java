package com.openai.feature.conversations.impl.anonymous;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/anonymous/AnonymousSidebarViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/anonymous/AnonymousSidebarViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AnonymousSidebarViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f37546c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4471b f37547a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37548b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/anonymous/AnonymousSidebarViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AnonymousSidebarViewModelImpl_Factory(C4471b auth, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f37547a = auth;
        this.f37548b = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37547a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f37548b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f37546c.getClass();
        return new AnonymousSidebarViewModelImpl((AbstractC21864z) obj, (InterfaceC20904w) obj2);
    }
}
