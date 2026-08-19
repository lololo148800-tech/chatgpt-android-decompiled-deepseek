package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl", m20656f = "ViewSharedConversationViewModelImpl.kt", m20657l = {114}, m20658m = "navigateToConversation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ViewSharedConversationViewModelImpl$navigateToConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ViewSharedConversationViewModelImpl f39843Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39844Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ViewSharedConversationViewModelImpl f39845o0;

    /* JADX INFO: renamed from: p0 */
    public int f39846p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSharedConversationViewModelImpl$navigateToConversation$1(ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39845o0 = viewSharedConversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39844Z = obj;
        this.f39846p0 |= Integer.MIN_VALUE;
        return ViewSharedConversationViewModelImpl.m14368n(this.f39845o0, null, this);
    }
}
