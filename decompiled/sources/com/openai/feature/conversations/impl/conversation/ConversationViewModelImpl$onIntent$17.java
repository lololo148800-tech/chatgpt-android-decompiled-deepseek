package com.openai.feature.conversations.impl.conversation;

import ge.C14037L;
import ge.InterfaceC14052T;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$17", m20656f = "ConversationViewModel.kt", m20657l = {962}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$onIntent$17 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37746Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationViewModelImpl f37747Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC14052T f37748o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$onIntent$17(ConversationViewModelImpl conversationViewModelImpl, InterfaceC14052T interfaceC14052T, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37747Z = conversationViewModelImpl;
        this.f37748o0 = interfaceC14052T;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ConversationViewModelImpl$onIntent$17(this.f37747Z, this.f37748o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ConversationViewModelImpl$onIntent$17) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37746Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = ((C14037L) this.f37748o0).f44127a;
            this.f37746Y = 1;
            if (ConversationViewModelImpl.m14254q(this.f37747Z, str, this) == enumC19250a) {
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
