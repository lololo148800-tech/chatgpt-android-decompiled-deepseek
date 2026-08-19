package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {261, 264}, m20658m = "playAudioUrl")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessageAudioViewModelImpl$playAudioUrl$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessageAudioViewModelImpl f38697Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38698Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessageAudioViewModelImpl f38699o0;

    /* JADX INFO: renamed from: p0 */
    public int f38700p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$playAudioUrl$1(MessageAudioViewModelImpl messageAudioViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38699o0 = messageAudioViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38698Z = obj;
        this.f38700p0 |= Integer.MIN_VALUE;
        int i10 = MessageAudioViewModelImpl.f38657s;
        return this.f38699o0.m14310o(null, false, this);
    }
}
