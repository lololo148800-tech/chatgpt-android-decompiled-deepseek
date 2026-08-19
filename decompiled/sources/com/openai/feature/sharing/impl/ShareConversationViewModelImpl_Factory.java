package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p338Ne.C5718f;
import p708dh.C13145X;
import p787he.C14459O;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ShareConversationViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/sharing/impl/ShareConversationViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ShareConversationViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: e */
    public static final Companion f39815e = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39816a;

    /* JADX INFO: renamed from: b */
    public final C4471b f39817b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39818c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39819d;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ShareConversationViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ShareConversationViewModelImpl_Factory(C4471b conversationCoordinator, InterfaceC17068a userRepository, InterfaceC17068a sharingService, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(userRepository, "userRepository");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(sharingService, "sharingService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39816a = userRepository;
        this.f39817b = conversationCoordinator;
        this.f39818c = sharingService;
        this.f39819d = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39816a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39817b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39818c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        Object obj4 = this.f39819d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        f39815e.getClass();
        return new ShareConversationViewModelImpl((C13145X) obj, (C14459O) obj2, (C5718f) obj3, (InterfaceC20904w) obj4);
    }
}
