package com.openai.feature.messages.impl;

import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p1081wc.C20856B;
import p1155zi.C21957R1;
import p318Mh.EnumC5424s0;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$21", m20656f = "MessagesViewModelImpl.kt", m20657l = {221}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$21 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38585Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38586Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$21(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38586Z = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$21(this.f38586Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$21) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM12798c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38585Y;
        MessagesViewModelImpl messagesViewModelImpl = this.f38586Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            messagesViewModelImpl.f38500v.mo21447a(C20856B.f66300c, AbstractC17660E.m19258c(new C17309l("location", "Model Switcher")));
            EnumC5424s0 enumC5424s0 = EnumC5424s0.UpgradedMessage;
            this.f38585Y = 1;
            objM12798c = messagesViewModelImpl.f38501w.m12798c(enumC5424s0, this);
            if (objM12798c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objM12798c = ((C21957R1) obj).f69517a;
        }
        messagesViewModelImpl.m14393h(new C2058g((String) objM12798c, true));
        return C17296C.f55119a;
    }
}
