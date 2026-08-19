package com.openai.feature.messages.impl.audio;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$observeAudioProgress$1", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lmm/l;", "", "<name for destructuring parameter 0>", "", "<anonymous>", "(Lmm/l;)Lmm/l;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$observeAudioProgress$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38674Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessageAudioViewModelImpl f38675Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$observeAudioProgress$1(MessageAudioViewModelImpl messageAudioViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38675Z = messageAudioViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        MessageAudioViewModelImpl$observeAudioProgress$1 messageAudioViewModelImpl$observeAudioProgress$1 = new MessageAudioViewModelImpl$observeAudioProgress$1(this.f38675Z, interfaceC18770c);
        messageAudioViewModelImpl$observeAudioProgress$1.f38674Y = obj;
        return messageAudioViewModelImpl$observeAudioProgress$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageAudioViewModelImpl$observeAudioProgress$1) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17309l c17309l = (C17309l) this.f38674Y;
        long jLongValue = ((Number) c17309l.f55136Y).longValue();
        long jLongValue2 = ((Number) c17309l.f55137Z).longValue();
        int i10 = MessageAudioViewModelImpl.f38657s;
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38675Z;
        messageAudioViewModelImpl.getClass();
        C21554a c21554a = C21555b.f68260Z;
        long jM21841k = C21555b.m21841k(AbstractC8128k6.m8645k(jLongValue, EnumC21557d.MILLISECONDS), EnumC21557d.SECONDS);
        long j10 = 60;
        return new C17309l(messageAudioViewModelImpl.f38660k.m3161c(R.string.message_audio_counter, Long.valueOf(jM21841k / j10), Long.valueOf(jM21841k % j10)), new Long(jLongValue2));
    }
}
