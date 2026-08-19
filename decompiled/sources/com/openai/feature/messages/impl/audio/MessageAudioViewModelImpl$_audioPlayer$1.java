package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1063vf.C20603k;
import p571X9.AbstractC9206S2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lvf/k;", "kotlin.jvm.PlatformType", "invoke", "()Lvf/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$_audioPlayer$1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MessageAudioViewModelImpl f38673Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$_audioPlayer$1(MessageAudioViewModelImpl messageAudioViewModelImpl) {
        super(0);
        this.f38673Y = messageAudioViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38673Y;
        C20603k c20603k = (C20603k) messageAudioViewModelImpl.f38661l.get();
        AbstractC16544l.m18091d(c20603k);
        messageAudioViewModelImpl.m14396l(MessageAudioViewModelImpl$observeAudioProgress$2.f38676Y, AbstractC9206S2.m9771b(new MessageAudioViewModelImpl$observeAudioProgress$1(messageAudioViewModelImpl, null), c20603k.f65374h));
        messageAudioViewModelImpl.m14396l(new MessageAudioViewModelImpl$observePlayerEvents$1(messageAudioViewModelImpl), c20603k.f65372f);
        return c20603k;
    }
}
