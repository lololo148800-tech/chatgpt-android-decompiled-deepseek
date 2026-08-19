package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p168Gd.C3034b;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6615V;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.C21514c;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$4", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LQd/F;", "m", "Lye/c;", "<anonymous>", "(LQd/F;)Lye/c;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$updatedOnNativeSideIds$4 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38933Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        CanmoreViewModelImpl$updatedOnNativeSideIds$4 canmoreViewModelImpl$updatedOnNativeSideIds$4 = new CanmoreViewModelImpl$updatedOnNativeSideIds$4(2, interfaceC18770c);
        canmoreViewModelImpl$updatedOnNativeSideIds$4.f38933Y = obj;
        return canmoreViewModelImpl$updatedOnNativeSideIds$4;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((CanmoreViewModelImpl$updatedOnNativeSideIds$4) create((C6600F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3034b c3034b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC6653q0 abstractC6653q0 = ((C6600F) this.f38933Y).f21314f;
        if (!(abstractC6653q0 instanceof C6615V)) {
            abstractC6653q0 = null;
        }
        C6615V c6615v = (C6615V) abstractC6653q0;
        String str = (c6615v == null || (c3034b = c6615v.f21342b) == null) ? null : c3034b.f9128a;
        if (str != null) {
            return new C21514c(str);
        }
        return null;
    }
}
