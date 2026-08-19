package com.openai.feature.conversations.impl.compliance;

import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p359Oc.EnumC6167c;
import p571X9.AbstractC9233X;
import p924od.C18075e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.compliance.ComplianceViewModelImpl$logCompliance$1", m20656f = "ComplianceViewModel.kt", m20657l = {116}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ComplianceViewModelImpl$logCompliance$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37555Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ComplianceViewModelImpl f37556Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceViewModelImpl$logCompliance$1(ComplianceViewModelImpl complianceViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        EnumC6167c enumC6167c = EnumC6167c.f20076Y;
        this.f37556Z = complianceViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        EnumC6167c enumC6167c = EnumC6167c.f20076Y;
        return new ComplianceViewModelImpl$logCompliance$1(this.f37556Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ComplianceViewModelImpl$logCompliance$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37555Y;
        ComplianceViewModelImpl complianceViewModelImpl = this.f37556Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ComplianceViewModelImpl.m14248q(complianceViewModelImpl, null, Boolean.TRUE, 5);
            C18075e c18075e = complianceViewModelImpl.f37549i;
            this.f37555Y = 1;
            obj = c18075e.m19694a(EnumC6167c.f20076Y, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 != null) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                ComplianceViewModelImpl.m14248q(complianceViewModelImpl, Boolean.TRUE, null, 6);
            }
            if (abstractC21955Q1 instanceof C21952P1) {
                ComplianceViewModelImpl.m14248q(complianceViewModelImpl, Boolean.FALSE, null, 6);
            }
        }
        ComplianceViewModelImpl.m14248q(complianceViewModelImpl, null, Boolean.FALSE, 5);
        return C17296C.f55119a;
    }
}
