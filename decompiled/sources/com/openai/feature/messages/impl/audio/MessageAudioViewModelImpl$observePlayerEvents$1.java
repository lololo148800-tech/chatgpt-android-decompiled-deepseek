package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1081wc.C20895n;
import p523V9.AbstractC8160o6;
import pf.AbstractC18404t;
import pf.C18398n;
import pf.C18399o;
import pf.C18400p;
import pf.C18401q;
import pf.C18402r;
import pf.C18403s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lpf/n;", "Lpf/t;", "event", "invoke", "(Lpf/n;Lpf/t;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$observePlayerEvents$1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MessageAudioViewModelImpl f38677Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$observePlayerEvents$1(MessageAudioViewModelImpl messageAudioViewModelImpl) {
        super(2);
        this.f38677Y = messageAudioViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18398n setOnEach = (C18398n) obj;
        AbstractC18404t event = (AbstractC18404t) obj2;
        AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
        AbstractC16544l.m18094g(event, "event");
        boolean z6 = event instanceof C18403s;
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38677Y;
        if (z6) {
            MessageAudioViewModelImpl.m14308q(messageAudioViewModelImpl, C20895n.f66596g, null, null, 14);
            return C18398n.m19867e(setOnEach, false, null, 0L, false, false, null, false, !((C18403s) event).f58701a, null, 1511);
        }
        if (event instanceof C18401q) {
            AbstractC8160o6.m8728c(messageAudioViewModelImpl.f38667r, "Download Audio Failed", null, null, 6);
            MessageAudioViewModelImpl.m14308q(messageAudioViewModelImpl, C20895n.f66595f, null, null, 14);
            return C18398n.m19867e(setOnEach, false, null, 0L, true, false, null, false, true, null, 1511);
        }
        if (event.equals(C18402r.f58700a) ? true : event.equals(C18399o.f58697a) ? true : event.equals(C18400p.f58698a)) {
            return C18398n.m19867e(setOnEach, false, null, 0L, false, false, null, false, true, null, 1535);
        }
        throw new C0644w();
    }
}
