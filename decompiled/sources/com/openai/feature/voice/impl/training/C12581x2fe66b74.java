package com.openai.feature.voice.impl.training;

import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: renamed from: com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2$videoDeferred$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2$videoDeferred$1", m20656f = "VoiceTrainingViewModelImpl.kt", m20657l = {62}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LAn/F;", "Lzi/Q1;", "Lmm/C;", "<anonymous>", "(LAn/F;)Lzi/Q1;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class C12581x2fe66b74 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40314Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceTrainingViewModelImpl f40315Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12581x2fe66b74(VoiceTrainingViewModelImpl voiceTrainingViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40315Z = voiceTrainingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C12581x2fe66b74(this.f40315Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12581x2fe66b74) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40314Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f40314Y = 1;
            obj = VoiceTrainingViewModelImpl.m14388o(this.f40315Z, true, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
