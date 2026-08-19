package com.openai.feature.messages.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p040Bd.AbstractC0985Q1;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p1041uf.C20212a;
import p1081wc.C20903v;
import p1091wn.C21036q;
import p129En.C2604o;
import p403Qd.C6636i;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p926of.C18141D;
import p926of.InterfaceC18159W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl$onIntent$27", m20656f = "MessagesViewModelImpl.kt", m20657l = {268}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$27 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38593Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModelImpl f38594Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18159W f38595o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$onIntent$27(MessagesViewModelImpl messagesViewModelImpl, InterfaceC18159W interfaceC18159W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38594Z = messagesViewModelImpl;
        this.f38595o0 = interfaceC18159W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessagesViewModelImpl$onIntent$27(this.f38594Z, this.f38595o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessagesViewModelImpl$onIntent$27) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C7351f0 c7351f0;
        AbstractC7343b0 abstractC7343b0;
        Object objInvoke;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38593Y;
        MessagesViewModelImpl messagesViewModelImpl = this.f38594Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2604o c2604o = messagesViewModelImpl.f38487i.f45521t;
            this.f38593Y = 1;
            obj = AbstractC2124C.m3221t(c2604o, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C6636i c6636i = (C6636i) obj;
        InterfaceC18159W interfaceC18159W = this.f38595o0;
        List list = null;
        if (c6636i != null) {
            C21036q c21036qM7167f = c6636i.m7167f();
            Iterator it = c21036qM7167f.f66917a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = c21036qM7167f.f66918b.invoke(it.next());
            } while (!AbstractC16544l.m18089b(((C7351f0) objInvoke).f23286a, ((C18141D) interfaceC18159W).f57879b));
            c7351f0 = (C7351f0) objInvoke;
        } else {
            c7351f0 = null;
        }
        if (c7351f0 != null && (abstractC7343b0 = c7351f0.f23291f) != null) {
            if (!(abstractC7343b0 instanceof C7320F)) {
                abstractC7343b0 = null;
            }
            C7320F c7320f = (C7320F) abstractC7343b0;
            if (c7320f != null) {
                list = c7320f.f23221e;
            }
        }
        if (list == null) {
            list = C17689w.f56480Y;
        }
        C20212a c20212a = messagesViewModelImpl.f38498t;
        C18141D c18141d = (C18141D) interfaceC18159W;
        String str = c18141d.f57878a;
        String messageId = c18141d.f57879b;
        AbstractC0985Q1 reference = c18141d.f57880c;
        Integer num = c18141d.f57881d;
        c20212a.getClass();
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(reference, "reference");
        c20212a.m21013a(C20903v.f66626c, str, messageId, reference, num, list);
        return C17296C.f55119a;
    }
}
