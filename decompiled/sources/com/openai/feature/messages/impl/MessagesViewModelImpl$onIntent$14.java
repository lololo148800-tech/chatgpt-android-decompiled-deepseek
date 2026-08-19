package com.openai.feature.messages.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p1081wc.C20894m;
import p318Mh.C5354B0;
import p318Mh.C5391c;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$14", m20656f = "MessagesViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$14 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MessagesViewModelImpl f38560Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$14(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38560Y = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$14(this.f38560Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MessagesViewModelImpl$onIntent$14 messagesViewModelImpl$onIntent$14 = (MessagesViewModelImpl$onIntent$14) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        messagesViewModelImpl$onIntent$14.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        MessagesViewModelImpl messagesViewModelImpl = this.f38560Y;
        messagesViewModelImpl.f38500v.mo21447a(C20894m.f66589c, C17690x.f56481Y);
        C5354B0 c5354b0 = C5354B0.f17582h;
        c5354b0.getClass();
        messagesViewModelImpl.m14393h(new C2058g(c5354b0.m5885a(C5391c.f17646Z), true));
        return C17296C.f55119a;
    }
}
