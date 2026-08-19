package com.openai.feature.conversationhistory.impl.move;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.InterfaceC4473d;
import p576Xe.C9473F;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/move/ConversationMoveViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversationhistory/impl/move/ConversationMoveViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationMoveViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f37537c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37538a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37539b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/move/ConversationMoveViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationMoveViewModelImpl_Factory(InterfaceC17068a conversationRepository, InterfaceC17068a snorlaxRepository) {
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        AbstractC16544l.m18094g(snorlaxRepository, "snorlaxRepository");
        this.f37538a = conversationRepository;
        this.f37539b = snorlaxRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37538a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f37539b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f37537c.getClass();
        return new ConversationMoveViewModelImpl((C18077B) obj, (C9473F) obj2);
    }
}
