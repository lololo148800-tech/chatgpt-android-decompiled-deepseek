package com.openai.feature.sanction.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p115E9.AbstractC2359a;
import p571X9.AbstractC9233X;
import p623Zf.EnumC10304F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl$onIntent$1", m20656f = "SanctionViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SanctionViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ SanctionViewModelImpl f39431Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SanctionViewModelImpl$onIntent$1(SanctionViewModelImpl sanctionViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39431Y = sanctionViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SanctionViewModelImpl$onIntent$1(this.f39431Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        SanctionViewModelImpl$onIntent$1 sanctionViewModelImpl$onIntent$1 = (SanctionViewModelImpl$onIntent$1) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        sanctionViewModelImpl$onIntent$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f39431Y.m14393h(AbstractC2359a.m3445d(EnumC10304F.f30594r0));
        return C17296C.f55119a;
    }
}
