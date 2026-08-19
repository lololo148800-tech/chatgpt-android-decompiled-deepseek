package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1081wc.C20907z;
import p403Qd.C6604J;
import p523V9.AbstractC8160o6;
import p552Wg.C8858t;
import p552Wg.InterfaceC8862x;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl$onIntent$1", m20656f = "ViewSharedConversationViewModelImpl.kt", m20657l = {134}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewSharedConversationViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39847Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ViewSharedConversationViewModelImpl f39848Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC8862x f39849o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSharedConversationViewModelImpl$onIntent$1(ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl, InterfaceC8862x interfaceC8862x, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39848Z = viewSharedConversationViewModelImpl;
        this.f39849o0 = interfaceC8862x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ViewSharedConversationViewModelImpl$onIntent$1(this.f39848Z, this.f39849o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ViewSharedConversationViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39847Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20907z c20907z = C20907z.f66639c;
            ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl = this.f39848Z;
            viewSharedConversationViewModelImpl.f39820i.mo21447a(c20907z, viewSharedConversationViewModelImpl.f39825n);
            C6604J c6604j = ((C8858t) this.f39849o0).f27122a;
            if (c6604j == null) {
                AbstractC8160o6.m8727b(viewSharedConversationViewModelImpl.f39823l, "Shared conversation is null", null, 6);
                return c17296c;
            }
            this.f39847Y = 1;
            if (ViewSharedConversationViewModelImpl.m14368n(viewSharedConversationViewModelImpl, c6604j, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
