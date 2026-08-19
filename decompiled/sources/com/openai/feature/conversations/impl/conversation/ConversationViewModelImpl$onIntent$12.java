package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$12", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$onIntent$12 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ConversationViewModelImpl f37734Y;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$12$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LCi/j;", "invoke", "(LCi/j;)LCi/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123041 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123041 f37735Y = new C123041();

        public C123041() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C1705j update = (C1705j) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C1705j.m2512a(update, false, null, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, true, 1048575);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$onIntent$12(ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37734Y = conversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ConversationViewModelImpl$onIntent$12(this.f37734Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ConversationViewModelImpl$onIntent$12 conversationViewModelImpl$onIntent$12 = (ConversationViewModelImpl$onIntent$12) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        conversationViewModelImpl$onIntent$12.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f37734Y.f37593r.m14817a(C123041.f37735Y);
        return C17296C.f55119a;
    }
}
