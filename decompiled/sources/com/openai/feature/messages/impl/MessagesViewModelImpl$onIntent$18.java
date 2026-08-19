package com.openai.feature.messages.impl;

import android.content.Intent;
import gd.C13935f0;
import gd.C14005w2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$18", m20656f = "MessagesViewModelImpl.kt", m20657l = {194, 197}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$18 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38575Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38576Z;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$18$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Landroid/content/Intent;", "intent", "Lmm/C;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123941 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ MessagesViewModelImpl f38577Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123941(MessagesViewModelImpl messagesViewModelImpl) {
            super(1);
            this.f38577Y = messagesViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            AbstractC16544l.m18094g(intent, "intent");
            this.f38577Y.m14393h(new C2055d(intent));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$18(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38576Z = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$18(this.f38576Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$18) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38575Y;
        MessagesViewModelImpl messagesViewModelImpl = this.f38576Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        if (((C14005w2) messagesViewModelImpl.f38492n).m15481a(C13935f0.f43985c)) {
            C123941 c123941 = new C123941(messagesViewModelImpl);
            this.f38575Y = 1;
            obj = messagesViewModelImpl.f38493o.m5386l(c123941, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
        C7351f0 c7351f0 = (C7351f0) obj;
        if (c7351f0 != null) {
            C14459O c14459o = messagesViewModelImpl.f38487i;
            this.f38575Y = 2;
            obj = c14459o.m15987p(c7351f0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
