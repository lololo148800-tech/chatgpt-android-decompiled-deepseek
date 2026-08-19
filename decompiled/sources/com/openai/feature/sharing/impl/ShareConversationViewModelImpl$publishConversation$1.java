package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {124}, m20658m = "publishConversation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ShareConversationViewModelImpl$publishConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ShareConversationViewModelImpl f39803Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39804Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ShareConversationViewModelImpl f39805o0;

    /* JADX INFO: renamed from: p0 */
    public int f39806p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareConversationViewModelImpl$publishConversation$1(ShareConversationViewModelImpl shareConversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39805o0 = shareConversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39804Z = obj;
        this.f39806p0 |= Integer.MIN_VALUE;
        return ShareConversationViewModelImpl.m14367p(this.f39805o0, null, false, null, this);
    }
}
