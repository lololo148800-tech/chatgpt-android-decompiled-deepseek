package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17618i;
import p049Bm.InterfaceC1436k;
import p098Di.C2057f;
import p1081wc.C20877X;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21921H1;
import p318Mh.C5388a0;
import p318Mh.C5391c;
import p571X9.AbstractC9233X;
import p708dh.C13145X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {178, 179}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public VerifyEmailCodeViewModelLoggedInImpl f39226Y;

    /* JADX INFO: renamed from: Z */
    public int f39227Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39228o0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2$1", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124581 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39229Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124581(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f39229Y = verifyEmailCodeViewModelLoggedInImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124581(this.f39229Y, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C124581 c124581 = (C124581) create((InterfaceC18770c) obj);
            C17296C c17296c = C17296C.f55119a;
            c124581.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl = this.f39229Y;
            verifyEmailCodeViewModelLoggedInImpl.f39217l.mo21447a(C20877X.f66477n, C17690x.f56481Y);
            C5388a0 c5388a0 = C5388a0.f17642h;
            c5388a0.getClass();
            verifyEmailCodeViewModelLoggedInImpl.m14393h(new C2057f(c5388a0.m5885a(C5391c.f17646Z), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124592 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124592 f39230Y = new C124592();

        public C124592() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17618i setState = (C17618i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17618i.m19228e(setState, null, null, false, new C21921H1(C17296C.f55119a), null, 23);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39228o0 = verifyEmailCodeViewModelLoggedInImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2(this.f39228o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39227Z;
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl2 = this.f39228o0;
        if (i10 != 0) {
            if (i10 == 1) {
                verifyEmailCodeViewModelLoggedInImpl = this.f39226Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            verifyEmailCodeViewModelLoggedInImpl2.m14397m(C124592.f39230Y);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C13145X c13145x = verifyEmailCodeViewModelLoggedInImpl2.f39216k;
        this.f39226Y = verifyEmailCodeViewModelLoggedInImpl2;
        this.f39227Z = 1;
        obj = c13145x.m14819a(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        verifyEmailCodeViewModelLoggedInImpl = verifyEmailCodeViewModelLoggedInImpl2;
        C124581 c124581 = new C124581(verifyEmailCodeViewModelLoggedInImpl2, null);
        this.f39226Y = null;
        this.f39227Z = 2;
        if (verifyEmailCodeViewModelLoggedInImpl.m14333o((AbstractC21955Q1) obj, c124581, this) == enumC19250a) {
            return enumC19250a;
        }
        verifyEmailCodeViewModelLoggedInImpl2.m14397m(C124592.f39230Y);
        return C17296C.f55119a;
    }
}
