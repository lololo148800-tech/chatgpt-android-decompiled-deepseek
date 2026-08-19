package com.openai.feature.messages.impl;

import cn.UfGr.EhBykzn;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p403Qd.AbstractC6659u;
import p571X9.AbstractC9233X;
import p926of.C18156T;
import p926of.C18160X;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$28", m20656f = "MessagesViewModelImpl.kt", m20657l = {291}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$28 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38596Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC18159W f38597Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessagesViewModelImpl f38598o0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$28$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lof/X;", "invoke", "(Lof/X;)Lof/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123951 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ AbstractC6659u f38599Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123951(AbstractC6659u abstractC6659u) {
            super(1);
            this.f38599Y = abstractC6659u;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18160X setState = (C18160X) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18160X.m19717e(setState, false, null, null, false, null, null, null, this.f38599Y, 1023);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$28(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38597Z = interfaceC18159W;
        this.f38598o0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$28(this.f38598o0, this.f38597Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$28) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC6659u abstractC6659u;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38596Y;
        MessagesViewModelImpl messagesViewModelImpl = this.f38598o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = ((C18156T) this.f38597Z).f57907a;
            if (str != null) {
                this.f38596Y = 1;
                obj = messagesViewModelImpl.m14302v(str, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                abstractC6659u = null;
            }
            messagesViewModelImpl.m14397m(new C123951(abstractC6659u));
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException(EhBykzn.pjPqPwJdz);
        }
        AbstractC9233X.m9807c(obj);
        abstractC6659u = (AbstractC6659u) obj;
        messagesViewModelImpl.m14397m(new C123951(abstractC6659u));
        return C17296C.f55119a;
    }
}
