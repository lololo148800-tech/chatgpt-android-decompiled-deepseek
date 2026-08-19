package com.openai.feature.conversationhistory.impl.move;

import androidx.lifecycle.ViewModel;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21897B1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p318Mh.C5431w;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p576Xe.C9473F;
import p909nm.C17689w;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import td.C19844g;
import td.C19845h;
import td.C19846i;
import td.C19847j;
import td.C19849l;
import td.InterfaceC19848k;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/move/ConversationMoveViewModelImpl;", "Lcom/openai/feature/conversationhistory/dialogs/move/ConversationMoveViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationMoveViewModelImpl extends ConversationMoveViewModel {

    /* JADX INFO: renamed from: i */
    public final C18077B f37514i;

    /* JADX INFO: renamed from: j */
    public final C9473F f37515j;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl$1", m20656f = "ConversationMoveViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122541 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Ltd/l;", "Lzi/B1;", "Lbf/b0;", "sidebar", "invoke", "(Ltd/l;Lzi/B1;)Ltd/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f37517Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(2);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                C19849l setOnEach = (C19849l) obj;
                C21897B1 sidebar = (C21897B1) obj2;
                AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
                AbstractC16544l.m18094g(sidebar, "sidebar");
                return C19849l.m20779e(setOnEach, sidebar.f69431a, sidebar.f69432b, false, 9);
            }
        }

        public C122541(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return ConversationMoveViewModelImpl.this.new C122541(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C122541 c122541 = (C122541) create((InterfaceC18770c) obj);
            C17296C c17296c = C17296C.f55119a;
            c122541.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ConversationMoveViewModelImpl conversationMoveViewModelImpl = ConversationMoveViewModelImpl.this;
            conversationMoveViewModelImpl.m14396l(AnonymousClass1.f37517Y, conversationMoveViewModelImpl.f37515j.m10020s());
            return C17296C.f55119a;
        }
    }

    public ConversationMoveViewModelImpl(C18077B c18077b, C9473F c9473f) {
        super(new C19849l(null, C17689w.f56480Y, false, false));
        this.f37514i = c18077b;
        this.f37515j = c9473f;
        m14394i(new C122541(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14245n(ConversationMoveViewModelImpl conversationMoveViewModelImpl, String str, String str2, AbstractC19687c abstractC19687c) {
        ConversationMoveViewModelImpl$handleConfirmMove$1 conversationMoveViewModelImpl$handleConfirmMove$1;
        conversationMoveViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationMoveViewModelImpl$handleConfirmMove$1) {
            conversationMoveViewModelImpl$handleConfirmMove$1 = (ConversationMoveViewModelImpl$handleConfirmMove$1) abstractC19687c;
            int i10 = conversationMoveViewModelImpl$handleConfirmMove$1.f37522q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationMoveViewModelImpl$handleConfirmMove$1.f37522q0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationMoveViewModelImpl$handleConfirmMove$1 = new ConversationMoveViewModelImpl$handleConfirmMove$1(conversationMoveViewModelImpl, abstractC19687c);
            }
        } else {
            conversationMoveViewModelImpl$handleConfirmMove$1 = new ConversationMoveViewModelImpl$handleConfirmMove$1(conversationMoveViewModelImpl, abstractC19687c);
        }
        Object objM19701f = conversationMoveViewModelImpl$handleConfirmMove$1.f37520o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationMoveViewModelImpl$handleConfirmMove$1.f37522q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19701f);
            conversationMoveViewModelImpl.m14397m(ConversationMoveViewModelImpl$handleConfirmMove$2.f37523Y);
            conversationMoveViewModelImpl$handleConfirmMove$1.f37518Y = conversationMoveViewModelImpl;
            conversationMoveViewModelImpl$handleConfirmMove$1.f37519Z = str;
            conversationMoveViewModelImpl$handleConfirmMove$1.f37522q0 = 1;
            objM19701f = conversationMoveViewModelImpl.f37514i.m19701f(str, str2, conversationMoveViewModelImpl$handleConfirmMove$1);
            if (objM19701f == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = conversationMoveViewModelImpl$handleConfirmMove$1.f37519Z;
            conversationMoveViewModelImpl = conversationMoveViewModelImpl$handleConfirmMove$1.f37518Y;
            AbstractC9233X.m9807c(objM19701f);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19701f;
        if (abstractC21955Q1 instanceof C21952P1) {
            conversationMoveViewModelImpl.m14397m(ConversationMoveViewModelImpl$handleConfirmMove$3$1.f37524Y);
            conversationMoveViewModelImpl.m14393h(new C2058g(C5431w.f17746g.m5903d(str), true));
            conversationMoveViewModelImpl.m14392g(C19844g.f62932a);
        }
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationMoveViewModelImpl.m14397m(ConversationMoveViewModelImpl$handleConfirmMove$4$1.f37525Y);
            conversationMoveViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14246o(ConversationMoveViewModelImpl conversationMoveViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        ConversationMoveViewModelImpl$loadMoreProjects$1 conversationMoveViewModelImpl$loadMoreProjects$1;
        conversationMoveViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationMoveViewModelImpl$loadMoreProjects$1) {
            conversationMoveViewModelImpl$loadMoreProjects$1 = (ConversationMoveViewModelImpl$loadMoreProjects$1) abstractC19687c;
            int i10 = conversationMoveViewModelImpl$loadMoreProjects$1.f37529p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationMoveViewModelImpl$loadMoreProjects$1.f37529p0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationMoveViewModelImpl$loadMoreProjects$1 = new ConversationMoveViewModelImpl$loadMoreProjects$1(conversationMoveViewModelImpl, abstractC19687c);
            }
        } else {
            conversationMoveViewModelImpl$loadMoreProjects$1 = new ConversationMoveViewModelImpl$loadMoreProjects$1(conversationMoveViewModelImpl, abstractC19687c);
        }
        Object objM10006e = conversationMoveViewModelImpl$loadMoreProjects$1.f37527Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationMoveViewModelImpl$loadMoreProjects$1.f37529p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10006e);
            conversationMoveViewModelImpl$loadMoreProjects$1.f37526Y = conversationMoveViewModelImpl;
            conversationMoveViewModelImpl$loadMoreProjects$1.f37529p0 = 1;
            objM10006e = conversationMoveViewModelImpl.f37515j.m10006e(str, conversationMoveViewModelImpl$loadMoreProjects$1);
            if (objM10006e == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversationMoveViewModelImpl = conversationMoveViewModelImpl$loadMoreProjects$1.f37526Y;
            AbstractC9233X.m9807c(objM10006e);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10006e;
        if (abstractC21955Q1 instanceof C21952P1) {
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationMoveViewModelImpl.m14397m(ConversationMoveViewModelImpl$loadMoreProjects$3$1.f37530Y);
            conversationMoveViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC19848k intent = (InterfaceC19848k) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C19847j) {
            m14394i(new ConversationMoveViewModelImpl$onIntent$1(this, intent, null));
        } else if (intent instanceof C19846i) {
            m14394i(new ConversationMoveViewModelImpl$onIntent$2(this, intent, null));
        } else if (intent.equals(C19845h.f62933a)) {
            m14392g(C19844g.f62932a);
        }
    }
}
