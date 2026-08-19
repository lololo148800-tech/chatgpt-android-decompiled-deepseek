package com.openai.feature.conversations.impl.voicefeedback;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1081wc.C20860F;
import p172Gi.C3061C;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.AbstractC18967t;
import re.C18963p;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$3", m20656f = "VoiceEndedViewModel.kt", m20657l = {163}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceEndedViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public C3061C f38054Y;

    /* JADX INFO: renamed from: Z */
    public int f38055Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceEndedViewModelImpl f38056o0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$3$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123521 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C3061C f38057Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123521(C3061C c3061c) {
            super(1);
            this.f38057Y = c3061c;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return new C18963p(this.f38057Y, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEndedViewModelImpl$onIntent$3(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38056o0 = voiceEndedViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceEndedViewModelImpl$onIntent$3(this.f38056o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceEndedViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3061C c3061c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38055Z;
        C17296C c17296c = C17296C.f55119a;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38056o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3061C c3061cMo20277e = ((AbstractC18967t) voiceEndedViewModelImpl.m14391f()).mo20277e();
            if (c3061cMo20277e == null) {
                return c17296c;
            }
            C20860F c20860f = C20860F.f66381r;
            this.f38054Y = c3061cMo20277e;
            this.f38055Z = 1;
            if (voiceEndedViewModelImpl.m14273n(c3061cMo20277e, c20860f, C17690x.f56481Y, this) == enumC19250a) {
                return enumC19250a;
            }
            c3061c = c3061cMo20277e;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3061c = this.f38054Y;
            AbstractC9233X.m9807c(obj);
        }
        voiceEndedViewModelImpl.m14397m(new C123521(c3061c));
        return c17296c;
    }
}
