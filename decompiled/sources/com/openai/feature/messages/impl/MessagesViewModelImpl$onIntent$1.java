package com.openai.feature.messages.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p926of.C18183t;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$1", m20656f = "MessagesViewModelImpl.kt", m20657l = {97}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38553Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38554Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18159W f38555o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$1(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38554Z = messagesViewModelImpl;
        this.f38555o0 = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$1(this.f38554Z, this.f38555o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38553Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C7351f0 c7351f0 = ((C18183t) this.f38555o0).f57997a;
            this.f38553Y = 1;
            if (MessagesViewModelImpl.m14294n(this.f38554Z, c7351f0, this) == enumC19250a) {
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
