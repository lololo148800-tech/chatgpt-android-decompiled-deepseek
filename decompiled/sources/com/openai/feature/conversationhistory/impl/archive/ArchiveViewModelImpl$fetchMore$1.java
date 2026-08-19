package com.openai.feature.conversationhistory.impl.archive;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl", m20656f = "ArchiveViewModel.kt", m20657l = {95}, m20658m = "fetchMore")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ArchiveViewModelImpl$fetchMore$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ArchiveViewModelImpl f37348Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37349Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArchiveViewModelImpl f37350o0;

    /* JADX INFO: renamed from: p0 */
    public int f37351p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveViewModelImpl$fetchMore$1(ArchiveViewModelImpl archiveViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37350o0 = archiveViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37349Z = obj;
        this.f37351p0 |= Integer.MIN_VALUE;
        return ArchiveViewModelImpl.m14235n(this.f37350o0, this);
    }
}
