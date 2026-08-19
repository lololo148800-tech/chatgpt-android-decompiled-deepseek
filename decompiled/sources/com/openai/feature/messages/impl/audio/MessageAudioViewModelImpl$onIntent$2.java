package com.openai.feature.messages.impl.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p1061vb.C20513d;
import p1063vf.C20602j;
import p1063vf.C20603k;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import pf.C18398n;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$onIntent$2", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MessageAudioViewModelImpl f38679Y;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123981 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123981 f38680Y = new C123981();

        public C123981() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18398n setState = (C18398n) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18398n.m19867e(setState, false, null, 0L, false, false, null, false, false, null, 2046);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$onIntent$2(MessageAudioViewModelImpl messageAudioViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38679Y = messageAudioViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessageAudioViewModelImpl$onIntent$2(this.f38679Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MessageAudioViewModelImpl$onIntent$2 messageAudioViewModelImpl$onIntent$2 = (MessageAudioViewModelImpl$onIntent$2) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        messageAudioViewModelImpl$onIntent$2.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        int i10 = MessageAudioViewModelImpl.f38657s;
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38679Y;
        C20603k c20603kM14309n = messageAudioViewModelImpl.m14309n();
        C20513d c20513d = c20603kM14309n.f65367a;
        C3516e c3516e = AbstractC0593T.f1824a;
        c20603kM14309n.f65376j.m7281a(AbstractC0575H.m1156D(c20603kM14309n.f65368b, AbstractC2935m.f8797a, null, new C20602j(c20603kM14309n, null), 2));
        messageAudioViewModelImpl.m14397m(C123981.f38680Y);
        return C17296C.f55119a;
    }
}
