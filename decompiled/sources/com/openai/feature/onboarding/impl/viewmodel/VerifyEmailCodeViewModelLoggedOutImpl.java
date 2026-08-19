package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11422v;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import ng.C17614e;
import ng.C17615f;
import ng.C17616g;
import ng.C17618i;
import ng.InterfaceC17617h;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10330z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailCodeViewModelLoggedOutImpl;", "Lcom/openai/feature/onboarding/viewmodel/VerifyEmailCodeViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailCodeViewModelLoggedOutImpl extends VerifyEmailCodeViewModel {

    /* JADX INFO: renamed from: i */
    public final C11422v f39253i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f39254j;

    /* JADX INFO: renamed from: k */
    public final C1991h f39255k;

    /* JADX INFO: renamed from: l */
    public final EnumC21895B f39256l;

    /* JADX INFO: renamed from: m */
    public final C3430e f39257m;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl$1", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {47}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124631 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39258Y;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C10330z f39260Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C10330z c10330z) {
                super(1);
                this.f39260Y = c10330z;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C17618i setState = (C17618i) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C17618i.m19228e(setState, this.f39260Y.f30657a, null, false, null, null, 30);
            }
        }

        public C124631(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VerifyEmailCodeViewModelLoggedOutImpl.this.new C124631(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124631) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39258Y;
            VerifyEmailCodeViewModelLoggedOutImpl verifyEmailCodeViewModelLoggedOutImpl = VerifyEmailCodeViewModelLoggedOutImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C1970n c1970n = verifyEmailCodeViewModelLoggedOutImpl.f39253i.f34496h;
                VerifyEmailCodeViewModelLoggedOutImpl$1$state$1 verifyEmailCodeViewModelLoggedOutImpl$1$state$1 = new VerifyEmailCodeViewModelLoggedOutImpl$1$state$1(2, null);
                this.f39258Y = 1;
                obj = AbstractC2124C.m3220s(c1970n, verifyEmailCodeViewModelLoggedOutImpl$1$state$1, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            verifyEmailCodeViewModelLoggedOutImpl.m14397m(new AnonymousClass1((C10330z) obj));
            return C17296C.f55119a;
        }
    }

    public VerifyEmailCodeViewModelLoggedOutImpl(C1991h c1991h, C11422v c11422v, InterfaceC20904w interfaceC20904w, EnumC21895B enumC21895B) {
        super(new C17618i(null, 31));
        this.f39253i = c11422v;
        this.f39254j = interfaceC20904w;
        this.f39255k = c1991h;
        this.f39256l = enumC21895B;
        this.f39257m = AbstractC8168p6.m8749b("VerifyEmailCodeViewModel", null);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124631(null), 3);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC17617h intent = (InterfaceC17617h) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C17614e.f56372a)) {
            m14394i(new VerifyEmailCodeViewModelLoggedOutImpl$onIntent$1(this, null));
        } else if (intent.equals(C17615f.f56373a)) {
            m14394i(new VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2(this, null));
        } else if (intent instanceof C17616g) {
            m14397m(new VerifyEmailCodeViewModelLoggedOutImpl$onIntent$3(intent));
        }
    }
}
