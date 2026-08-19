package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import pf.C18398n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lpf/n;", "Lmm/l;", "", "", "<name for destructuring parameter 0>", "invoke", "(Lpf/n;Lmm/l;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$observeAudioProgress$2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final MessageAudioViewModelImpl$observeAudioProgress$2 f38676Y = new MessageAudioViewModelImpl$observeAudioProgress$2();

    public MessageAudioViewModelImpl$observeAudioProgress$2() {
        super(2);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18398n setOnEach = (C18398n) obj;
        C17309l c17309l = (C17309l) obj2;
        AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
        AbstractC16544l.m18094g(c17309l, "<name for destructuring parameter 0>");
        return C18398n.m19867e(setOnEach, false, (String) c17309l.f55136Y, ((Number) c17309l.f55137Z).longValue(), false, false, null, false, false, null, 2041);
    }
}
