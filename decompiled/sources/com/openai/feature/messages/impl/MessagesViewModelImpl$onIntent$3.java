package com.openai.feature.messages.impl;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p103Dn.C2153Q0;
import p1040ue.C20206d;
import p1081wc.C20857C;
import p193Hf.C3350b0;
import p217Ie.C3705a;
import p217Ie.C3708d;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p909nm.C17690x;
import p926of.C18138A;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$3", m20656f = "MessagesViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MessagesViewModelImpl f38602Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC18159W f38603Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$3(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38602Y = messagesViewModelImpl;
        this.f38603Z = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$3(this.f38602Y, this.f38603Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MessagesViewModelImpl$onIntent$3 messagesViewModelImpl$onIntent$3 = (MessagesViewModelImpl$onIntent$3) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        messagesViewModelImpl$onIntent$3.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C7351f0 message = ((C18138A) this.f38603Z).f57875a;
        C20857C c20857c = C20857C.f66328j;
        MessagesViewModelImpl messagesViewModelImpl = this.f38602Y;
        messagesViewModelImpl.f38500v.mo21447a(c20857c, C17690x.f56481Y);
        C3708d c3708d = messagesViewModelImpl.f38497s;
        c3708d.getClass();
        AbstractC16544l.m18094g(message, "message");
        C2153Q0 c2153q0 = c3708d.f11250e;
        c2153q0.getClass();
        c2153q0.m3251l(null, message);
        c3708d.f11247b.m20781a(new C3350b0(c3708d, 4, message));
        Integer numValueOf = Integer.valueOf(R.drawable.pencil);
        String string = c3708d.f11246a.getResources().getString(R.string.input_decoration_editing_message);
        AbstractC16544l.m18093f(string, "getString(...)");
        c3708d.f11248c.m18966a(new C20206d("edit_message", numValueOf, string, AbstractC9393x3.m9974d(C3705a.f11242a)));
        return C17296C.f55119a;
    }
}
