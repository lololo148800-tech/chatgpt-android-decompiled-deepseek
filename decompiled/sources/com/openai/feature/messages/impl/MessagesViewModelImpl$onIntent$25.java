package com.openai.feature.messages.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$25", m20656f = "MessagesViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LDn/j;", "LDf/g;", "", "e", "Lmm/C;", "<anonymous>", "(LDn/j;Ljava/lang/Throwable;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$25 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Throwable f38590Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38591Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$25(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f38591Z = messagesViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MessagesViewModelImpl$onIntent$25 messagesViewModelImpl$onIntent$25 = new MessagesViewModelImpl$onIntent$25(this.f38591Z, (InterfaceC18770c) obj3);
        messagesViewModelImpl$onIntent$25.f38590Y = (Throwable) obj2;
        C17296C c17296c = C17296C.f55119a;
        messagesViewModelImpl$onIntent$25.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC8160o6.m8728c(this.f38591Z.f38502x, "Failed to fetch attributions", this.f38590Y, null, 4);
        return C17296C.f55119a;
    }
}
