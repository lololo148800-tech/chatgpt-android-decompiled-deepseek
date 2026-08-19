package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p168Gd.C3034b;
import p216Id.C3694b;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6615V;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$getStreamingMessagesForWeb$1", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "state", "LQd/G;", "<anonymous>", "(LId/b;)LQd/G;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$getStreamingMessagesForWeb$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38890Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f38891Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$getStreamingMessagesForWeb$1(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38891Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        CanmoreViewModelImpl$getStreamingMessagesForWeb$1 canmoreViewModelImpl$getStreamingMessagesForWeb$1 = new CanmoreViewModelImpl$getStreamingMessagesForWeb$1(this.f38891Z, interfaceC18770c);
        canmoreViewModelImpl$getStreamingMessagesForWeb$1.f38890Y = obj;
        return canmoreViewModelImpl$getStreamingMessagesForWeb$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((CanmoreViewModelImpl$getStreamingMessagesForWeb$1) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objPrevious;
        boolean z6;
        C3034b c3034b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        List list = ((C3694b) this.f38890Y).f11224i;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            String str = null;
            if (!listIterator.hasPrevious()) {
                return null;
            }
            objPrevious = listIterator.previous();
            AbstractC6601G abstractC6601G = (AbstractC6601G) objPrevious;
            z6 = false;
            if (abstractC6601G instanceof C6600F) {
                AbstractC6653q0 abstractC6653q0 = ((C6600F) abstractC6601G).f21314f;
                if (!(abstractC6653q0 instanceof C6615V)) {
                    abstractC6653q0 = null;
                }
                C6615V c6615v = (C6615V) abstractC6653q0;
                if (c6615v != null && (c3034b = c6615v.f21342b) != null) {
                    str = c3034b.f9128a;
                }
                if (str == null ? false : AbstractC16544l.m18089b(str, this.f38891Z)) {
                    z6 = true;
                }
            }
        } while (!z6);
        return objPrevious;
    }
}
