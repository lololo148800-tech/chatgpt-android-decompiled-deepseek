package com.openai.feature.messages.impl;

import android.content.Intent;
import bf.AbstractC11372a0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p098Di.C2059h;
import p103Dn.AbstractC2124C;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p129En.C2604o;
import p360Od.C6172d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p550We.C8833n;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p575Xd.InterfaceC9461t;
import p594Y9.AbstractC9985v4;
import p787he.C14459O;
import p926of.C18186w;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15", m20656f = "MessagesViewModelImpl.kt", m20657l = {163, 166}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$15 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38561Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38562Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18159W f38563o0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "it", "Lmm/C;", "invoke", "(LTd/f0;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123911 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ MessagesViewModelImpl f38564Y;

        /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15$1$1", m20656f = "MessagesViewModelImpl.kt", m20657l = {174}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public int f38565Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ MessagesViewModelImpl f38566Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C7351f0 f38567o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MessagesViewModelImpl messagesViewModelImpl, C7351f0 c7351f0, InterfaceC18770c interfaceC18770c) {
                super(1, interfaceC18770c);
                this.f38566Z = messagesViewModelImpl;
                this.f38567o0 = c7351f0;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
                return new AnonymousClass1(this.f38566Z, this.f38567o0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                return ((AnonymousClass1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f38565Y;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C14459O c14459o = this.f38566Z.f38487i;
                    this.f38565Y = 1;
                    if (c14459o.m15987p(this.f38567o0, this) == enumC19250a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123911(MessagesViewModelImpl messagesViewModelImpl) {
            super(1);
            this.f38564Y = messagesViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C7351f0 it = (C7351f0) obj;
            AbstractC16544l.m18094g(it, "it");
            MessagesViewModelImpl messagesViewModelImpl = this.f38564Y;
            messagesViewModelImpl.m14394i(new AnonymousClass1(messagesViewModelImpl, it, null));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LWe/n;", "it", "Lmm/C;", "invoke", "(LWe/n;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123922 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ MessagesViewModelImpl f38568Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123922(MessagesViewModelImpl messagesViewModelImpl) {
            super(1);
            this.f38568Y = messagesViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C8833n it = (C8833n) obj;
            AbstractC16544l.m18094g(it, "it");
            Intent intent = new Intent();
            AbstractC9186P.m9748b(intent, it.f27023a);
            this.f38568Y.m14393h(new C2055d(intent));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$15$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOh/w;", "it", "Lmm/C;", "invoke", "(LOh/w;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123933 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ MessagesViewModelImpl f38569Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123933(MessagesViewModelImpl messagesViewModelImpl) {
            super(1);
            this.f38569Y = messagesViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC6249w it = (AbstractC6249w) obj;
            AbstractC16544l.m18094g(it, "it");
            this.f38569Y.m14393h(new C2059h(AbstractC6224C.m6734a(it)));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$15(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38562Z = messagesViewModelImpl;
        this.f38563o0 = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$15(this.f38562Z, this.f38563o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$15) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM3221t;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38561Y;
        C17296C c17296c = C17296C.f55119a;
        MessagesViewModelImpl messagesViewModelImpl = this.f38562Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                objM3221t = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        C2604o c2604o = messagesViewModelImpl.f38487i.f45521t;
        this.f38561Y = 1;
        objM3221t = AbstractC2124C.m3221t(c2604o, this);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C6636i c6636i = (C6636i) objM3221t;
        if (c6636i == null) {
            return c17296c;
        }
        C20908a c20908a = (C20908a) messagesViewModelImpl.f38495q.f50876c.getValue();
        C18186w c18186w = (C18186w) this.f38563o0;
        C6172d c6172d = c18186w.f58001a;
        InterfaceC9461t interfaceC9461t = c18186w.f58002b;
        C20263a0 c20263a0 = c20908a.f66645a;
        String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
        C123911 c123911 = new C123911(messagesViewModelImpl);
        C123922 c123922 = new C123922(messagesViewModelImpl);
        C123933 c123933 = new C123933(messagesViewModelImpl);
        this.f38561Y = 2;
        return AbstractC9985v4.m10624a(c6172d, interfaceC9461t, c6636i.f21379a, messagesViewModelImpl.f38491m, strM12782a, messagesViewModelImpl.f38500v, c123911, c123922, c123933, this) == enumC19250a ? enumC19250a : c17296c;
    }
}
