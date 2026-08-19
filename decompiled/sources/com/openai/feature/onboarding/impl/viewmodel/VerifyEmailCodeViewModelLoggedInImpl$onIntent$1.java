package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17618i;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2059h;
import p1081wc.C20877X;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p364Oh.AbstractC6224C;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$1", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {133}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailCodeViewModelLoggedInImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39231Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39232Z;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124601 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124601 f39233Y = new C124601();

        public C124601() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17618i setState = (C17618i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17618i.m19228e(setState, null, null, false, null, C21917G1.f69468a, 15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl$onIntent$1(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39232Z = verifyEmailCodeViewModelLoggedInImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VerifyEmailCodeViewModelLoggedInImpl$onIntent$1(this.f39232Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VerifyEmailCodeViewModelLoggedInImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39231Y;
        C17296C c17296c = C17296C.f55119a;
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl = this.f39232Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            verifyEmailCodeViewModelLoggedInImpl.f39217l.mo21447a(C20877X.f66484u, C17690x.f56481Y);
            String str = ((C17618i) verifyEmailCodeViewModelLoggedInImpl.m14391f()).f56375a;
            if (str == null) {
                return c17296c;
            }
            verifyEmailCodeViewModelLoggedInImpl.m14397m(C124601.f39233Y);
            this.f39231Y = 1;
            obj = verifyEmailCodeViewModelLoggedInImpl.f39214i.f34429a.m13041g(str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) obj).m6735b();
        if (abstractC21955Q1M6735b instanceof C21952P1) {
            verifyEmailCodeViewModelLoggedInImpl.m14397m(VerifyEmailCodeViewModelLoggedInImpl$onIntent$1$2$1.f39234Y);
        } else if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6735b;
            AbstractC8160o6.m8727b(verifyEmailCodeViewModelLoggedInImpl.f39220o, "Failed to resend email code", abstractC21933K1.f69485a, 4);
            verifyEmailCodeViewModelLoggedInImpl.m14397m(new VerifyEmailCodeViewModelLoggedInImpl$onIntent$1$3$1(abstractC21933K1));
            verifyEmailCodeViewModelLoggedInImpl.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, verifyEmailCodeViewModelLoggedInImpl.f39218m, verifyEmailCodeViewModelLoggedInImpl.f39219n, null)));
        } else {
            if (!(abstractC21955Q1M6735b instanceof C21929J1)) {
                throw new C0644w();
            }
            verifyEmailCodeViewModelLoggedInImpl.m14397m(VerifyEmailCodeViewModelLoggedInImpl$onIntent$1$4$1.f39236Y);
        }
        return c17296c;
    }
}
