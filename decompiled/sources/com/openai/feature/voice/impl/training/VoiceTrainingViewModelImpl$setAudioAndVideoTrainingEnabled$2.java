package com.openai.feature.voice.impl.training;

import kotlin.Metadata;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0581K;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2", m20656f = "VoiceTrainingViewModelImpl.kt", m20657l = {64, 65}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LAn/F;", "Lzi/Q1;", "Lmm/C;", "<anonymous>", "(LAn/F;)Lzi/Q1;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40309Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f40310Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceTrainingViewModelImpl f40311o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2(VoiceTrainingViewModelImpl voiceTrainingViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40311o0 = voiceTrainingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2 voiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2 = new VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2(this.f40311o0, interfaceC18770c);
        voiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2.f40310Z = obj;
        return voiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceTrainingViewModelImpl$setAudioAndVideoTrainingEnabled$2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0581K interfaceC0581K;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21955Q1 abstractC21955Q2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40309Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0581K = (InterfaceC0581K) this.f40310Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) this.f40310Z;
                AbstractC9233X.m9807c(obj);
            }
            abstractC21955Q2 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                return abstractC21955Q1;
            }
            return abstractC21955Q2 instanceof AbstractC21933K1 ? abstractC21955Q2 : new C21952P1(C17296C.f55119a);
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f40310Z;
        VoiceTrainingViewModelImpl voiceTrainingViewModelImpl = this.f40311o0;
        C0583L c0583lM1177f = AbstractC0575H.m1177f(interfaceC0571F, null, new C12580x8612bd0f(voiceTrainingViewModelImpl, null), 3);
        C0583L c0583lM1177f2 = AbstractC0575H.m1177f(interfaceC0571F, null, new C12581x2fe66b74(voiceTrainingViewModelImpl, null), 3);
        this.f40310Z = c0583lM1177f2;
        this.f40309Y = 1;
        Object objM1309u = c0583lM1177f.m1309u(this);
        if (objM1309u == enumC19250a) {
            return enumC19250a;
        }
        interfaceC0581K = c0583lM1177f2;
        obj = objM1309u;
        AbstractC21955Q1 abstractC21955Q3 = (AbstractC21955Q1) obj;
        this.f40310Z = abstractC21955Q3;
        this.f40309Y = 2;
        Object objMo1204J0 = interfaceC0581K.mo1204J0(this);
        if (objMo1204J0 == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q3;
        obj = objMo1204J0;
        abstractC21955Q2 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            return abstractC21955Q1;
        }
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
        }
    }
}
