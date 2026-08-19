package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p623Zf.C10330z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModelImpl$1$config$1", m20656f = "OnboardingLoadingViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LZf/z;", "it", "", "<anonymous>", "(LZf/z;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
final class OnboardingLoadingViewModelImpl$1$config$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f39211Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        OnboardingLoadingViewModelImpl$1$config$1 onboardingLoadingViewModelImpl$1$config$1 = new OnboardingLoadingViewModelImpl$1$config$1(2, interfaceC18770c);
        onboardingLoadingViewModelImpl$1$config$1.f39211Y = obj;
        return onboardingLoadingViewModelImpl$1$config$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingLoadingViewModelImpl$1$config$1) create((C10330z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((C10330z) this.f39211Y).f30661e != null);
    }
}
