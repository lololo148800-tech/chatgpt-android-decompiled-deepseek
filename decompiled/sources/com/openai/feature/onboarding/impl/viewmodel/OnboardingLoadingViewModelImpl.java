package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.ViewModel;
import bg.C11422v;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p115E9.AbstractC2359a;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p623Zf.EnumC10304F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/OnboardingLoadingViewModelImpl;", "Lcom/openai/feature/onboarding/impl/viewmodel/OnboardingLoadingViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OnboardingLoadingViewModelImpl extends OnboardingLoadingViewModel {

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModelImpl$1", m20656f = "OnboardingLoadingViewModel.kt", m20657l = {43}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124571 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39208Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C11422v f39209Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ OnboardingLoadingViewModelImpl f39210o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124571(C11422v c11422v, OnboardingLoadingViewModelImpl onboardingLoadingViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39209Z = c11422v;
            this.f39210o0 = onboardingLoadingViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C124571(this.f39209Z, this.f39210o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124571) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39208Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C11422v c11422v = this.f39209Z;
                OnboardingLoadingViewModelImpl$1$config$1 onboardingLoadingViewModelImpl$1$config$1 = new OnboardingLoadingViewModelImpl$1$config$1(2, null);
                this.f39208Y = 1;
                obj = AbstractC2124C.m3222u(c11422v.f34496h, onboardingLoadingViewModelImpl$1$config$1, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            C10330z c10330z = (C10330z) obj;
            C10327w c10327w = c10330z != null ? c10330z.f30661e : null;
            if (c10327w != null) {
                this.f39210o0.m14393h(new C2058g(AbstractC2359a.m3444c(EnumC10304F.f30590Z, c10327w), true));
            }
            return C17296C.f55119a;
        }
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
