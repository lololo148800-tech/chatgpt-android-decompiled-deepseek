package com.openai.feature.conversationhistory.impl.move;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import td.C19846i;
import td.InterfaceC19848k;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl$onIntent$2", m20656f = "ConversationMoveViewModelImpl.kt", m20657l = {47}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationMoveViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37534Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationMoveViewModelImpl f37535Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19848k f37536o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMoveViewModelImpl$onIntent$2(ConversationMoveViewModelImpl conversationMoveViewModelImpl, InterfaceC19848k interfaceC19848k, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37535Z = conversationMoveViewModelImpl;
        this.f37536o0 = interfaceC19848k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ConversationMoveViewModelImpl$onIntent$2(this.f37535Z, this.f37536o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ConversationMoveViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37534Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = ((C19846i) this.f37536o0).f62934a;
            this.f37534Y = 1;
            if (ConversationMoveViewModelImpl.m14246o(this.f37535Z, str, this) == enumC19250a) {
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
