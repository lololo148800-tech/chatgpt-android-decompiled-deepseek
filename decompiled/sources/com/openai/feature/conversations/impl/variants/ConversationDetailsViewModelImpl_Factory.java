package com.openai.feature.conversations.impl.variants;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p015Ad.C0431f;
import p1081wc.InterfaceC20904w;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p787he.C14459O;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/variants/ConversationDetailsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/variants/ConversationDetailsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationDetailsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f38024d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4471b f38025a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38026b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38027c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/variants/ConversationDetailsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationDetailsViewModelImpl_Factory(C4471b conversationCoordinator, InterfaceC17068a conversationItemMapper, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(conversationItemMapper, "conversationItemMapper");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f38025a = conversationCoordinator;
        this.f38026b = conversationItemMapper;
        this.f38027c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38025a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38026b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f38027c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f38024d.getClass();
        return new ConversationDetailsViewModelImpl((C14459O) obj, (C0431f) obj2, (InterfaceC20904w) obj3);
    }
}
