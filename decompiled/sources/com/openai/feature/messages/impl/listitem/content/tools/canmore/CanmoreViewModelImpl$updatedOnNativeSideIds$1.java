package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p216Id.C3694b;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$1", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "it", "LQd/G;", "<anonymous>", "(LId/b;)LQd/G;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$updatedOnNativeSideIds$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38932Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        CanmoreViewModelImpl$updatedOnNativeSideIds$1 canmoreViewModelImpl$updatedOnNativeSideIds$1 = new CanmoreViewModelImpl$updatedOnNativeSideIds$1(2, interfaceC18770c);
        canmoreViewModelImpl$updatedOnNativeSideIds$1.f38932Y = obj;
        return canmoreViewModelImpl$updatedOnNativeSideIds$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((CanmoreViewModelImpl$updatedOnNativeSideIds$1) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return AbstractC17680n.m19353c0(((C3694b) this.f38932Y).f11224i);
    }
}
