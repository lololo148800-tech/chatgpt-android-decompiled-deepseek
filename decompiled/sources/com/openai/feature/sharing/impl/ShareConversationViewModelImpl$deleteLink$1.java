package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {139}, m20658m = "deleteLink")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ShareConversationViewModelImpl$deleteLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ShareConversationViewModelImpl f39788Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39789Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ShareConversationViewModelImpl f39790o0;

    /* JADX INFO: renamed from: p0 */
    public int f39791p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareConversationViewModelImpl$deleteLink$1(ShareConversationViewModelImpl shareConversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39790o0 = shareConversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39789Z = obj;
        this.f39791p0 |= Integer.MIN_VALUE;
        return ShareConversationViewModelImpl.m14365n(this.f39790o0, null, this);
    }
}
