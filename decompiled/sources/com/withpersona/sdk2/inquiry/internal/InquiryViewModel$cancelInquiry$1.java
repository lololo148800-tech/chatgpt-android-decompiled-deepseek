package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p839jk.C16244a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", m20656f = "InquiryViewModel.kt", m20657l = {168}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InquiryViewModel$cancelInquiry$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40728Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InquiryViewModel f40729Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryViewModel$cancelInquiry$1(InquiryViewModel inquiryViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40729Z = inquiryViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new InquiryViewModel$cancelInquiry$1(this.f40729Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((InquiryViewModel$cancelInquiry$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40728Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2127D0 c2127d0 = this.f40729Z.f40713g;
            C16244a c16244a = new C16244a();
            this.f40728Y = 1;
            if (c2127d0.mo395a(c16244a, this) == enumC19250a) {
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
