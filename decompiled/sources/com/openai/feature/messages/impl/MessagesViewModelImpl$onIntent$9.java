package com.openai.feature.messages.impl;

import android.content.Intent;
import kotlin.Metadata;
import mm.C17296C;
import p040Bd.C0937I1;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p1081wc.C20890i;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p926of.C18147J;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$9", m20656f = "MessagesViewModelImpl.kt", m20657l = {131}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$9 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38614Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38615Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18159W f38616o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$9(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38615Z = messagesViewModelImpl;
        this.f38616o0 = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$9(this.f38615Z, this.f38616o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$9) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38614Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18147J c18147j = (C18147J) this.f38616o0;
            String str = c18147j.f57892a;
            C0937I1 c0937i1 = c18147j.f57893b;
            this.f38614Y = 1;
            MessagesViewModelImpl messagesViewModelImpl = this.f38615Z;
            messagesViewModelImpl.getClass();
            Intent intent = new Intent();
            AbstractC9186P.m9748b(intent, c0937i1.f2687c);
            messagesViewModelImpl.m14393h(new C2055d(intent));
            if (messagesViewModelImpl.m14304x(str, c0937i1, C20890i.f66559e, this) == enumC19250a) {
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
