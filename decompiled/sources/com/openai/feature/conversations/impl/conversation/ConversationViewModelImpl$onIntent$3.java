package com.openai.feature.conversations.impl.conversation;

import gd.C13875M1;
import gd.C13878N1;
import gd.C14005w2;
import ge.C14050S;
import ge.C14111x0;
import ge.InterfaceC14052T;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1025te.C19863N;
import p204I1.C3581L;
import p204I1.C3590f;
import p350O1.C6045C;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$3", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ConversationViewModelImpl f37759Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC14052T f37760Z;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$3$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123061 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ ConversationViewModelImpl f37761Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ InterfaceC14052T f37762Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123061(ConversationViewModelImpl conversationViewModelImpl, InterfaceC14052T interfaceC14052T) {
            super(1);
            this.f37761Y = conversationViewModelImpl;
            this.f37762Z = interfaceC14052T;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            long jM9365b;
            C6045C c6045cM6613b;
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            ConversationViewModelImpl conversationViewModelImpl = this.f37761Y;
            boolean zM15481a = ((C14005w2) conversationViewModelImpl.f37585j).m15481a(C13875M1.f43913c);
            InterfaceC14052T interfaceC14052T = this.f37762Z;
            if (!zM15481a) {
                boolean zM15481a2 = ((C14005w2) conversationViewModelImpl.f37585j).m15481a(C13878N1.f43916c);
                if (zM15481a2) {
                    jM9365b = C3581L.f10906b;
                } else {
                    if (zM15481a2) {
                        throw new C0644w();
                    }
                    jM9365b = AbstractC8676n.m9365b(0, ((C14050S) interfaceC14052T).f44166a.length());
                }
                return C19863N.m20780a(update, new C6045C(jM9365b, ((C14050S) interfaceC14052T).f44166a, 4), true, null, null, false, null, null, null, 252);
            }
            String str = ((C14050S) interfaceC14052T).f44166a;
            C6045C c6045c = update.f62954a;
            AbstractC16544l.m18094g(c6045c, "<this>");
            if (str == null || str.length() == 0) {
                c6045cM6613b = c6045c;
            } else {
                long j10 = C3581L.f10906b;
                long jM9365b2 = c6045c.f19683b;
                boolean zM4266b = C3581L.m4266b(jM9365b2, j10);
                C3590f c3590f = c6045c.f19682a;
                if (zM4266b) {
                    int length = c3590f.f10934Y.length();
                    jM9365b2 = AbstractC8676n.m9365b(length, length);
                }
                int iM8921l = AbstractC8301I.m8921l(C3581L.m4270f(jM9365b2), 0, c3590f.f10934Y.length());
                int iM4269e = C3581L.m4269e(jM9365b2);
                String str2 = c3590f.f10934Y;
                int iM8921l2 = AbstractC8301I.m8921l(iM4269e, 0, str2.length());
                String strSubstring = str2.substring(0, iM8921l);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iM8921l2);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                String strM9890i = AbstractC9306j0.m9890i(strSubstring, str, strSubstring2);
                int length2 = str.length() + iM8921l;
                c6045cM6613b = C6045C.m6613b(c6045c, strM9890i, AbstractC8676n.m9365b(length2, length2), 4);
            }
            return C19863N.m20780a(update, c6045cM6613b, true, null, null, false, null, null, null, 252);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$onIntent$3$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123072 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123072 f37763Y = new C123072();

        public C123072() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C14111x0 setState = (C14111x0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -131073, 8388607);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$onIntent$3(ConversationViewModelImpl conversationViewModelImpl, InterfaceC14052T interfaceC14052T, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37759Y = conversationViewModelImpl;
        this.f37760Z = interfaceC14052T;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ConversationViewModelImpl$onIntent$3(this.f37759Y, this.f37760Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ConversationViewModelImpl$onIntent$3 conversationViewModelImpl$onIntent$3 = (ConversationViewModelImpl$onIntent$3) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        conversationViewModelImpl$onIntent$3.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ConversationViewModelImpl conversationViewModelImpl = this.f37759Y;
        conversationViewModelImpl.f37594s.m20781a(new C123061(conversationViewModelImpl, this.f37760Z));
        conversationViewModelImpl.m14397m(C123072.f37763Y);
        return C17296C.f55119a;
    }
}
