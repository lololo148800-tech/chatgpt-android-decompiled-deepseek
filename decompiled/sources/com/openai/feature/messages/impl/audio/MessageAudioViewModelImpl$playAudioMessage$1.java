package com.openai.feature.messages.impl.audio;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1708m;
import p1113xn.AbstractC21322p;
import p148Fi.EnumC2836l;
import p479Td.C7351f0;
import p544W9.AbstractC8699q4;
import p571X9.AbstractC9233X;
import p604Yk.C10077b;
import p857kl.C16447N;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import pf.C18398n;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioMessage$1", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {253, 255}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$playAudioMessage$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public String f38691Y;

    /* JADX INFO: renamed from: Z */
    public String f38692Z;

    /* JADX INFO: renamed from: o0 */
    public int f38693o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ MessageAudioViewModelImpl f38694p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C7351f0 f38695q0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioMessage$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124021 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C7351f0 f38696Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124021(C7351f0 c7351f0) {
            super(1);
            this.f38696Y = c7351f0;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18398n setState = (C18398n) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            String str = this.f38696Y.f23286a;
            return C18398n.m19867e(setState, true, null, 0L, false, true, str, true, false, AbstractC16544l.m18089b(setState.f58691f, str) ? setState.f58696k : C18398n.f58685l, 838);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$playAudioMessage$1(MessageAudioViewModelImpl messageAudioViewModelImpl, C7351f0 c7351f0, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38694p0 = messageAudioViewModelImpl;
        this.f38695q0 = c7351f0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessageAudioViewModelImpl$playAudioMessage$1(this.f38694p0, this.f38695q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessageAudioViewModelImpl$playAudioMessage$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        String messageId;
        Object objM18593d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38693o0;
        C17296C c17296c = C17296C.f55119a;
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38694p0;
        if (i10 != 0) {
            if (i10 == 1) {
                messageId = this.f38692Z;
                conversationId = this.f38691Y;
                AbstractC9233X.m9807c(obj);
                C1708m c1708m = (C1708m) obj;
                objM18593d = c1708m != null ? c1708m.f4890a : null;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        C7351f0 c7351f0 = this.f38695q0;
        C124021 c124021 = new C124021(c7351f0);
        int i11 = MessageAudioViewModelImpl.f38657s;
        messageAudioViewModelImpl.m14397m(c124021);
        conversationId = c7351f0.f23288c;
        if (conversationId == null) {
            return c17296c;
        }
        this.f38691Y = conversationId;
        messageId = c7351f0.f23286a;
        this.f38692Z = messageId;
        this.f38693o0 = 1;
        objM18593d = messageAudioViewModelImpl.f38662m.m18593d(this);
        if (objM18593d == enumC19250a) {
            return enumC19250a;
        }
        String str = (String) objM18593d;
        if (str == null) {
            str = null;
        }
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(messageId, "messageId");
        C16447N c16447nM9401a = AbstractC8699q4.m9401a(AbstractC21322p.m21713u0("https://android.chat.openai.com/backend-api/", '/'));
        c16447nM9401a.f51025h = AbstractC17680n.m19362l0(c16447nM9401a.f51025h, "synthesize");
        C10077b c10077b = c16447nM9401a.f51027j;
        c10077b.m10672u("conversation_id", conversationId);
        c10077b.m10672u("message_id", messageId);
        if (str != null) {
            c10077b.m10672u("voice", str);
        }
        EnumC2836l[] enumC2836lArr = EnumC2836l.f8574Y;
        c10077b.m10672u("format", "opus");
        Uri uri = Uri.parse(c16447nM9401a.m18022c());
        AbstractC16544l.m18091d(uri);
        this.f38691Y = null;
        this.f38692Z = null;
        this.f38693o0 = 2;
        int i12 = MessageAudioViewModelImpl.f38657s;
        return messageAudioViewModelImpl.m14310o(uri, false, this) == enumC19250a ? enumC19250a : c17296c;
    }
}
