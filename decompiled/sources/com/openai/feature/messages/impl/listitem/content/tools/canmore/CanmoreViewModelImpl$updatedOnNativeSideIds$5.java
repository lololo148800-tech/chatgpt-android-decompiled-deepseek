package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1081wc.C20864J;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.C21514c;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$5", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lye/c;", "it", "Lmm/C;", "<anonymous>", "(Lye/c;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$updatedOnNativeSideIds$5 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f38934Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$updatedOnNativeSideIds$5(InterfaceC20904w interfaceC20904w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38934Y = interfaceC20904w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new CanmoreViewModelImpl$updatedOnNativeSideIds$5(this.f38934Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String str = ((C21514c) obj).f68131a;
        CanmoreViewModelImpl$updatedOnNativeSideIds$5 canmoreViewModelImpl$updatedOnNativeSideIds$5 = new CanmoreViewModelImpl$updatedOnNativeSideIds$5(this.f38934Y, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        canmoreViewModelImpl$updatedOnNativeSideIds$5.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f38934Y.mo21447a(C20864J.f66424c, C17690x.f56481Y);
        return C17296C.f55119a;
    }
}
