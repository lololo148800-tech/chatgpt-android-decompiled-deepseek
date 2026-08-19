package com.openai.feature.voice.impl.assistant;

import androidx.lifecycle.ViewModel;
import com.openai.voice.assistant.AssistantViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13882P;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import md.C17236j;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p098Di.InterfaceC2053b;
import p196Hi.C3438h;
import p196Hi.C3439i;
import p196Hi.C3441k;
import p196Hi.C3442l;
import p196Hi.C3443m;
import p196Hi.C3450t;
import p196Hi.InterfaceC3444n;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13133K;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/voice/impl/assistant/AssistantViewModelImpl;", "Lcom/openai/voice/assistant/AssistantViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AssistantViewModelImpl extends AssistantViewModel {

    /* JADX INFO: renamed from: i */
    public final C17236j f40258i;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.assistant.AssistantViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.assistant.AssistantViewModelImpl$1", m20656f = "AssistantViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LCi/j;", "it", "", "<anonymous>", "(LCi/j;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125731 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40259Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125731 c125731 = new C125731(2, interfaceC18770c);
            c125731.f40259Y = obj;
            return c125731;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125731) create((C1705j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(((C1705j) this.f40259Y).f4878k);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.assistant.AssistantViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LHi/t;", "", "it", "invoke", "(LHi/t;Z)LHi/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125742 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125742 f40260Y = new C125742();

        public C125742() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C3450t setOnEach = (C3450t) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C3450t.m4192e(setOnEach, Boolean.valueOf(!zBooleanValue), false, false, 29);
        }
    }

    public AssistantViewModelImpl(C17236j c17236j, C13133K c13133k, InterfaceC13849E interfaceC13849E) {
        super(new C3450t(null, null, false, false, ((C14005w2) interfaceC13849E).m15481a(C13882P.f43921c)));
        this.f40258i = c17236j;
        m14396l(C125742.f40260Y, AbstractC9206S2.m9771b(new C125731(2, null), c13133k.f41697b));
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        this.f40258i.getClass();
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC3444n intent = (InterfaceC3444n) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C3441k) {
            m14397m(AssistantViewModelImpl$onIntent$1.f40261Y);
            return;
        }
        if (!(intent instanceof C3442l)) {
            if (intent instanceof C3443m) {
                m14392g(C3439i.f10468a);
            }
        } else {
            m14397m(new AssistantViewModelImpl$onIntent$2(intent));
            if (((C3442l) intent).f10470a) {
                m14392g(C3438h.f10467a);
            }
        }
    }
}
