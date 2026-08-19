package com.openai.feature.messages.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1081wc.C20857C;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p926of.C18149L;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$2", m20656f = "MessagesViewModelImpl.kt", m20657l = {104}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38582Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18159W f38583o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$2(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38582Z = messagesViewModelImpl;
        this.f38583o0 = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$2(this.f38582Z, this.f38583o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38581Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18149L c18149l = (C18149L) this.f38583o0;
            C7351f0 c7351f0 = c18149l.f57895a;
            String str = c18149l.f57896b;
            EnumC21517f enumC21517f = c18149l.f57897c;
            this.f38581Y = 1;
            C20857C c20857c = C20857C.f66340v;
            MessagesViewModelImpl messagesViewModelImpl = this.f38582Z;
            messagesViewModelImpl.f38500v.mo21447a(c20857c, C17690x.f56481Y);
            Object objM15984m = messagesViewModelImpl.f38487i.m15984m(c7351f0, str, enumC21517f, null, this);
            if (objM15984m != enumC19250a) {
                objM15984m = c17296c;
            }
            if (objM15984m == enumC19250a) {
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
