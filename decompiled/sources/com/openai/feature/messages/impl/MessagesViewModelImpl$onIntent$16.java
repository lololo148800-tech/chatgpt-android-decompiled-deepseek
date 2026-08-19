package com.openai.feature.messages.impl;

import android.content.Intent;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p926of.C18187x;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$16", m20656f = "MessagesViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$16 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18159W f38570Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38571Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$16(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38570Y = interfaceC18159W;
        this.f38571Z = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$16(this.f38571Z, this.f38570Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MessagesViewModelImpl$onIntent$16 messagesViewModelImpl$onIntent$16 = (MessagesViewModelImpl$onIntent$16) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        messagesViewModelImpl$onIntent$16.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        String str = ((C18187x) this.f38570Y).f58003a.f20091a.f28481c;
        if (str != null) {
            Intent intent = new Intent();
            AbstractC9186P.m9748b(intent, str);
            this.f38571Z.m14393h(new C2055d(intent));
        }
        return C17296C.f55119a;
    }
}
