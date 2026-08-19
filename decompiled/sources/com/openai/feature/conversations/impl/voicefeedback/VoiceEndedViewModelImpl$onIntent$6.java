package com.openai.feature.conversations.impl.voicefeedback;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p708dh.C13132J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.AbstractC18967t;
import re.C18958k;
import re.C18964q;
import re.InterfaceC18962o;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$6", m20656f = "VoiceEndedViewModel.kt", m20657l = {191}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceEndedViewModelImpl$onIntent$6 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38064Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceEndedViewModelImpl f38065Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18962o f38066o0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$6$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123552 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123552 f38068Y = new C123552();

        public C123552() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18964q.f60519a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEndedViewModelImpl$onIntent$6(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c, InterfaceC18962o interfaceC18962o) {
        super(1, interfaceC18770c);
        this.f38065Z = voiceEndedViewModelImpl;
        this.f38066o0 = interfaceC18962o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceEndedViewModelImpl$onIntent$6(this.f38065Z, interfaceC18770c, this.f38066o0);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceEndedViewModelImpl$onIntent$6) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38064Y;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38065Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13132J c13132j = voiceEndedViewModelImpl.f38036k;
            boolean z6 = ((C18958k) this.f38066o0).f60512a;
            this.f38064Y = 1;
            obj = c13132j.m14814k(z6, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            voiceEndedViewModelImpl.f38035j.m14817a(VoiceEndedViewModelImpl$onIntent$6$1$1.f38067Y);
        }
        voiceEndedViewModelImpl.m14397m(C123552.f38068Y);
        return C17296C.f55119a;
    }
}
