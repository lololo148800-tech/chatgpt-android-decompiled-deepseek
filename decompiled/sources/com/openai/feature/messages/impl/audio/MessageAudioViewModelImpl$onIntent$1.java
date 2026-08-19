package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import pf.C18387c;
import pf.C18398n;
import pf.InterfaceC18393i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18393i f38678Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$onIntent$1(InterfaceC18393i interfaceC18393i) {
        super(1);
        this.f38678Y = interfaceC18393i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18398n setState = (C18398n) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C18398n.m19867e(setState, false, null, 0L, false, false, null, ((C18387c) this.f38678Y).f58667a, false, null, 1919);
    }
}
