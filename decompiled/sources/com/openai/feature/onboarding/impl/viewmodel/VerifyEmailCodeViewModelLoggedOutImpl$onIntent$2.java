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
import p115E9.AbstractC2359a;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p623Zf.C10327w;
import p623Zf.EnumC10304F;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {77, 85}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public EnumC10304F f39268Y;

    /* JADX INFO: renamed from: Z */
    public int f39269Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VerifyEmailCodeViewModelLoggedOutImpl f39270o0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124651 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124651 f39271Y = new C124651();

        public C124651() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17618i setState = (C17618i) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17618i.m19228e(setState, null, null, false, C21917G1.f69468a, null, 23);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2(VerifyEmailCodeViewModelLoggedOutImpl verifyEmailCodeViewModelLoggedOutImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39270o0 = verifyEmailCodeViewModelLoggedOutImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2(this.f39270o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC10304F enumC10304F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39269Z;
        C17296C c17296c = C17296C.f55119a;
        VerifyEmailCodeViewModelLoggedOutImpl verifyEmailCodeViewModelLoggedOutImpl = this.f39270o0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC10304F = this.f39268Y;
                AbstractC9233X.m9807c(obj);
            }
            AbstractC2359a.m3444c(enumC10304F, (C10327w) obj);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        verifyEmailCodeViewModelLoggedOutImpl.f39254j.mo21447a(C20877X.f66465E, C17690x.f56481Y);
        String str = ((C17618i) verifyEmailCodeViewModelLoggedOutImpl.m14391f()).f56375a;
        if (str == null) {
            return c17296c;
        }
        verifyEmailCodeViewModelLoggedOutImpl.m14397m(C124651.f39271Y);
        String str2 = ((C17618i) verifyEmailCodeViewModelLoggedOutImpl.m14391f()).f56376b;
        this.f39269Z = 1;
        obj = verifyEmailCodeViewModelLoggedOutImpl.f39253i.m12792g(str, str2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            verifyEmailCodeViewModelLoggedOutImpl.m14397m(VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2$2$1.f39272Y);
            EnumC10304F enumC10304F2 = EnumC10304F.f30592p0;
            this.f39268Y = enumC10304F2;
            this.f39269Z = 2;
            Object objM12787b = verifyEmailCodeViewModelLoggedOutImpl.f39253i.m12787b(this);
            if (objM12787b == enumC19250a) {
                return enumC19250a;
            }
            enumC10304F = enumC10304F2;
            obj = objM12787b;
            AbstractC2359a.m3444c(enumC10304F, (C10327w) obj);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(verifyEmailCodeViewModelLoggedOutImpl.f39257m, "Failed to verify email code", abstractC21933K1.f69485a, 4);
            verifyEmailCodeViewModelLoggedOutImpl.m14397m(new VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2$3$1(abstractC21933K1));
            verifyEmailCodeViewModelLoggedOutImpl.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, verifyEmailCodeViewModelLoggedOutImpl.f39255k, verifyEmailCodeViewModelLoggedOutImpl.f39256l, null)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            verifyEmailCodeViewModelLoggedOutImpl.m14397m(VerifyEmailCodeViewModelLoggedOutImpl$onIntent$2$4$1.f39274Y);
        }
        return c17296c;
    }
}
