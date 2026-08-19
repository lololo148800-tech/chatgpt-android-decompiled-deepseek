package com.openai.feature.conversationhistory.impl.history;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p103Dn.InterfaceC2186j;
import p1062vd.C20549b0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {221}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LDn/j;", "Lmm/C;", "<anonymous>", "(LDn/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37425Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f37426Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37427o0;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122461 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C122461 f37428Y = new C122461();

        public C122461() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C20549b0 setState = (C20549b0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C20549b0.m21187e(setState, false, false, false, null, null, null, null, false, null, null, false, null, null, null, null, null, null, false, 2096639);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122472 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C122472 f37429Y = new C122472();

        public C122472() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C20549b0 setState = (C20549b0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C20549b0.m21187e(setState, false, false, false, null, null, null, null, false, C21917G1.f69468a, null, false, null, null, null, null, null, null, false, 2096639);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1(String str, GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37426Z = str;
        this.f37427o0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1(this.f37426Z, this.f37427o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37425Y;
        GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl = this.f37427o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = this.f37426Z;
            if (str.length() == 0) {
                C122461 c122461 = C122461.f37428Y;
                int i11 = GizmosAndHistoryViewModelImpl.f37368r;
                gizmosAndHistoryViewModelImpl.m14397m(c122461);
            } else {
                C122472 c122472 = C122472.f37429Y;
                int i12 = GizmosAndHistoryViewModelImpl.f37368r;
                gizmosAndHistoryViewModelImpl.m14397m(c122472);
                this.f37425Y = 1;
                obj = gizmosAndHistoryViewModelImpl.f37369i.f57695a.m1103k(str, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$3$1 gizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$3$1 = new GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$3$1((List) ((C21952P1) abstractC21955Q1).f69511a);
            int i13 = GizmosAndHistoryViewModelImpl.f37368r;
            gizmosAndHistoryViewModelImpl.m14397m(gizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$3$1);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$4$1 gizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$4$1 = new GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$4$1(abstractC21933K1);
            int i14 = GizmosAndHistoryViewModelImpl.f37368r;
            gizmosAndHistoryViewModelImpl.m14397m(gizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1$4$1);
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
