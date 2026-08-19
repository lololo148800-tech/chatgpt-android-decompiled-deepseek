package com.openai.feature.voice.impl.training;

import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2056e;
import p098Di.C2059h;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p319Mi.C5447i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$onIntent$2", m20656f = "VoiceTrainingViewModelImpl.kt", m20657l = {LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER, LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER, StatsigLoggerKt.MAX_EVENTS}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceTrainingViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40305Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceTrainingViewModelImpl f40306Z;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LMi/i;", "invoke", "(LMi/i;)LMi/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125781 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C125781 f40307Y = new C125781();

        public C125781() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C5447i setState = (C5447i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C5447i.m5905e(setState, false, true, 3);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.training.VoiceTrainingViewModelImpl$onIntent$2$4 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LMi/i;", "invoke", "(LMi/i;)LMi/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125794 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C125794 f40308Y = new C125794();

        public C125794() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C5447i setState = (C5447i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C5447i.m5905e(setState, false, false, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceTrainingViewModelImpl$onIntent$2(VoiceTrainingViewModelImpl voiceTrainingViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40306Z = voiceTrainingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceTrainingViewModelImpl$onIntent$2(this.f40306Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceTrainingViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC21955Q1 abstractC21955Q1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40305Y;
        VoiceTrainingViewModelImpl voiceTrainingViewModelImpl = this.f40306Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            voiceTrainingViewModelImpl.m14397m(C125781.f40307Y);
            int iOrdinal = ((C5447i) voiceTrainingViewModelImpl.m14391f()).f17794a.ordinal();
            if (iOrdinal == 0) {
                this.f40305Y = 1;
                obj = VoiceTrainingViewModelImpl.m14387n(voiceTrainingViewModelImpl, false, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) obj;
            } else if (iOrdinal == 1) {
                this.f40305Y = 2;
                obj = VoiceTrainingViewModelImpl.m14388o(voiceTrainingViewModelImpl, false, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) obj;
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                this.f40305Y = 3;
                obj = VoiceTrainingViewModelImpl.m14387n(voiceTrainingViewModelImpl, false, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) obj;
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            abstractC21955Q1 = (AbstractC21955Q1) obj;
        } else if (i10 == 2) {
            AbstractC9233X.m9807c(obj);
            abstractC21955Q1 = (AbstractC21955Q1) obj;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            abstractC21955Q1 = (AbstractC21955Q1) obj;
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            voiceTrainingViewModelImpl.m14393h(C2056e.f6277a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            voiceTrainingViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        voiceTrainingViewModelImpl.m14397m(C125794.f40308Y);
        return C17296C.f55119a;
    }
}
