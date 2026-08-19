package com.openai.feature.messages.impl.listitem;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p103Dn.C2217y0;
import p1106xf.C21206n;
import p220Ih.InterfaceC3721c;
import p248Jk.InterfaceC4473d;
import p269Kh.C4676c;
import p405Qf.C6687b;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/MessageListItemContextMenuViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/listitem/MessageListItemContextMenuViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageListItemContextMenuViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final Companion f38823b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38824a;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/MessageListItemContextMenuViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MessageListItemContextMenuViewModelImpl_Factory(InterfaceC17068a modelsRepository) {
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        this.f38824a = modelsRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38824a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        f38823b.getClass();
        C2217y0 c2217y0 = ((C6687b) ((InterfaceC3721c) obj)).f21507g;
        MessageListItemContextMenuViewModelImpl messageListItemContextMenuViewModelImpl = new MessageListItemContextMenuViewModelImpl(new C21206n((C4676c) c2217y0.f6797Y.getValue()));
        messageListItemContextMenuViewModelImpl.m14396l(MessageListItemContextMenuViewModelImpl.C124221.f38822Y, c2217y0);
        return messageListItemContextMenuViewModelImpl;
    }
}
