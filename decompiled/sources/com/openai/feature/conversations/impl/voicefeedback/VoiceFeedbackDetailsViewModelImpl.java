package com.openai.feature.conversations.impl.voicefeedback;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2053b;
import p148Fi.C2854t0;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p594Y9.AbstractC9752J4;
import p625Zh.C10396b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.C18971x;
import re.C18973z;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceFeedbackDetailsViewModelImpl;", "Lcom/openai/feature/conversations/impl/voicefeedback/VoiceFeedbackDetailsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceFeedbackDetailsViewModelImpl extends VoiceFeedbackDetailsViewModel {

    /* JADX INFO: renamed from: i */
    public final C2854t0 f38092i;

    /* JADX INFO: renamed from: j */
    public final C10396b f38093j;

    /* JADX INFO: renamed from: k */
    public final C3430e f38094k;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceFeedbackDetailsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceFeedbackDetailsViewModelImpl$1", m20656f = "VoiceFeedbackDetailsViewModel.kt", m20657l = {43}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123571 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38095Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceFeedbackDetailsViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/z;", "invoke", "(Lre/z;)Lre/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ AbstractC6224C f38097Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC6224C abstractC6224C) {
                super(1);
                this.f38097Y = abstractC6224C;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C18973z setState = (C18973z) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C18973z(this.f38097Y);
            }
        }

        public C123571(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return VoiceFeedbackDetailsViewModelImpl.this.new C123571(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123571) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38095Y;
            VoiceFeedbackDetailsViewModelImpl voiceFeedbackDetailsViewModelImpl = VoiceFeedbackDetailsViewModelImpl.this;
            try {
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C10396b c10396b = voiceFeedbackDetailsViewModelImpl.f38093j;
                    VoiceFeedbackDetailsViewModelImpl$1$response$1 voiceFeedbackDetailsViewModelImpl$1$response$1 = new VoiceFeedbackDetailsViewModelImpl$1$response$1(voiceFeedbackDetailsViewModelImpl, null);
                    this.f38095Y = 1;
                    obj = AbstractC9752J4.m10353b(c10396b, 0, 0L, null, voiceFeedbackDetailsViewModelImpl$1$response$1, this, 31);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                voiceFeedbackDetailsViewModelImpl.m14397m(new AnonymousClass1((AbstractC6224C) obj));
            } catch (Exception e10) {
                AbstractC8160o6.m8731f(voiceFeedbackDetailsViewModelImpl.f38094k, "Failed to load feedback options", e10, null, 4);
                voiceFeedbackDetailsViewModelImpl.m14392g(C18971x.f60526a);
            }
            return C17296C.f55119a;
        }
    }

    public VoiceFeedbackDetailsViewModelImpl(C2854t0 c2854t0, C10396b c10396b) {
        super(new C18973z(null));
        this.f38092i = c2854t0;
        this.f38093j = c10396b;
        this.f38094k = AbstractC8168p6.m8749b("VoiceFeedbackDetailsViewModel", null);
        m14394i(new C123571(null));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }
}
