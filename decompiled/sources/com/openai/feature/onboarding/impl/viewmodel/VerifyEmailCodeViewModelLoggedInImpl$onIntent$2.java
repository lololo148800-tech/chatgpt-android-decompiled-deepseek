package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17618i;
import p049Bm.InterfaceC1436k;
import p1081wc.C20877X;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p364Oh.AbstractC6224C;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$2", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {152, 157}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailCodeViewModelLoggedInImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public VerifyEmailCodeViewModelLoggedInImpl f39237Y;

    /* JADX INFO: renamed from: Z */
    public int f39238Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39239o0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124611 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124611 f39240Y = new C124611();

        public C124611() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17618i setState = (C17618i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17618i.m19228e(setState, null, null, false, C21917G1.f69468a, null, 23);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$2$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$onIntent$2$2", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {158}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124622 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f39241Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39242Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124622(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f39242Z = verifyEmailCodeViewModelLoggedInImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124622(this.f39242Z, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C124622) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39241Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39241Y = 1;
                if (VerifyEmailCodeViewModelLoggedInImpl.m14332n(this.f39242Z, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl$onIntent$2(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39239o0 = verifyEmailCodeViewModelLoggedInImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VerifyEmailCodeViewModelLoggedInImpl$onIntent$2(this.f39239o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VerifyEmailCodeViewModelLoggedInImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39238Z;
        C17296C c17296c = C17296C.f55119a;
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl2 = this.f39239o0;
        if (i10 != 0) {
            if (i10 == 1) {
                verifyEmailCodeViewModelLoggedInImpl = this.f39237Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        verifyEmailCodeViewModelLoggedInImpl2.f39217l.mo21447a(C20877X.f66465E, C17690x.f56481Y);
        String str = ((C17618i) verifyEmailCodeViewModelLoggedInImpl2.m14391f()).f56375a;
        if (str == null) {
            return c17296c;
        }
        verifyEmailCodeViewModelLoggedInImpl2.m14397m(C124611.f39240Y);
        String str2 = ((C17618i) verifyEmailCodeViewModelLoggedInImpl2.m14391f()).f56376b;
        this.f39237Y = verifyEmailCodeViewModelLoggedInImpl2;
        this.f39238Z = 1;
        obj = verifyEmailCodeViewModelLoggedInImpl2.f39214i.f34429a.m13042h(str, str2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        verifyEmailCodeViewModelLoggedInImpl = verifyEmailCodeViewModelLoggedInImpl2;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) obj).m6735b();
        C124622 c124622 = new C124622(verifyEmailCodeViewModelLoggedInImpl2, null);
        this.f39237Y = null;
        this.f39238Z = 2;
        return verifyEmailCodeViewModelLoggedInImpl.m14333o(abstractC21955Q1M6735b, c124622, this) == enumC19250a ? enumC19250a : c17296c;
    }
}
