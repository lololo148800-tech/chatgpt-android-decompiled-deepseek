package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {101}, m20658m = "makeShareLink")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ShareConversationViewModelImpl$makeShareLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ShareConversationViewModelImpl f39792Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39793Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ShareConversationViewModelImpl f39794o0;

    /* JADX INFO: renamed from: p0 */
    public int f39795p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareConversationViewModelImpl$makeShareLink$1(ShareConversationViewModelImpl shareConversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39794o0 = shareConversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39793Z = obj;
        this.f39795p0 |= Integer.MIN_VALUE;
        return ShareConversationViewModelImpl.m14366o(this.f39794o0, null, false, this);
    }
}
