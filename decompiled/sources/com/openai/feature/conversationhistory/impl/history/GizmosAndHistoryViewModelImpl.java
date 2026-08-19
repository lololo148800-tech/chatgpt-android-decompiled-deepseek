package com.openai.feature.conversationhistory.impl.history;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import be.C11345b;
import com.openai.chatgpt.R;
import com.openai.chatgpt.app.RootViewModelImpl;
import com.openai.feature.rootviewmodel.RootViewModel;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13888R0;
import gd.C13928d1;
import gd.C13964m1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p086D6.C1970n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1062vd.AbstractC20526F;
import p1062vd.AbstractC20527G;
import p1062vd.C20521A;
import p1062vd.C20522B;
import p1062vd.C20523C;
import p1062vd.C20524D;
import p1062vd.C20525E;
import p1062vd.C20528H;
import p1062vd.C20529I;
import p1062vd.C20530J;
import p1062vd.C20531K;
import p1062vd.C20532L;
import p1062vd.C20533M;
import p1062vd.C20534N;
import p1062vd.C20535O;
import p1062vd.C20536P;
import p1062vd.C20537Q;
import p1062vd.C20538S;
import p1062vd.C20541V;
import p1062vd.C20549b0;
import p1062vd.C20573w;
import p1062vd.C20574x;
import p1062vd.C20575y;
import p1062vd.InterfaceC20539T;
import p1081wc.C20857C;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21897B1;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p1155zi.EnumC22026l;
import p195Hh.C3430e;
import p318Mh.C5380T;
import p318Mh.C5391c;
import p318Mh.C5410l0;
import p318Mh.C5418p0;
import p318Mh.C5431w;
import p324Mn.C5551u;
import p403Qd.C6636i;
import p427Rc.C6852i;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p576Xe.C9473F;
import p594Y9.AbstractC9827W2;
import p708dh.C13133K;
import p811ih.C15000g;
import p909nm.AbstractC17660E;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17691y;
import p925oe.C18077B;
import p925oe.C18086K;
import p925oe.C18114g0;
import p925oe.C18127p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModelImpl;", "Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmosAndHistoryViewModelImpl extends GizmosAndHistoryViewModel {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f37368r = 0;

    /* JADX INFO: renamed from: i */
    public final C18086K f37369i;

    /* JADX INFO: renamed from: j */
    public final C18077B f37370j;

    /* JADX INFO: renamed from: k */
    public final C9473F f37371k;

    /* JADX INFO: renamed from: l */
    public final C9473F f37372l;

    /* JADX INFO: renamed from: m */
    public final RootViewModel f37373m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC20904w f37374n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC13849E f37375o;

    /* JADX INFO: renamed from: p */
    public final C3430e f37376p;

    /* JADX INFO: renamed from: q */
    public boolean f37377q;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lvd/b0;", "", "LQd/i;", "it", "invoke", "(Lvd/b0;Ljava/util/List;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122362 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122362 f37378Y = new C122362();

        public C122362() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            List it = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C20549b0.m21187e(setOnEach, false, false, false, null, it, null, null, false, null, null, false, null, null, null, null, null, null, false, 2097119);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/b0;", "LCi/j;", "it", "invoke", "(Lvd/b0;LCi/j;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122373 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122373 f37379Y = new C122373();

        public C122373() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            C1705j it = (C1705j) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C20549b0.m21187e(setOnEach, false, false, false, null, null, null, null, false, null, null, false, it, null, null, null, null, null, false, 2088959);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/b0;", "", "it", "invoke", "(Lvd/b0;Z)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122384 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122384 f37380Y = new C122384();

        public C122384() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C20549b0.m21187e(setOnEach, false, false, false, null, null, null, null, false, null, null, false, null, null, null, null, null, null, zBooleanValue, 1572863);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$5 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/b0;", "Lzi/h0;", "it", "invoke-mRA7E-s", "(Lvd/b0;Ljava/lang/String;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122395 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122395 f37381Y = new C122395();

        public C122395() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            String it = ((C22011h0) obj2).f69652a;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C20549b0.m21187e(setOnEach, false, false, false, it, null, null, null, false, null, null, false, null, null, null, null, null, null, false, 2097143);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$6", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lzi/Q1;", "", "Luh/a0;", "result", "Lmm/C;", "<anonymous>", "(Lzi/Q1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122406 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37382Y;

        public C122406(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122406 c122406 = GizmosAndHistoryViewModelImpl.this.new C122406(interfaceC18770c);
            c122406.f37382Y = obj;
            return c122406;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C122406 c122406 = (C122406) create((AbstractC21955Q1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c122406.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) this.f37382Y;
            if (abstractC21955Q1 instanceof C21952P1) {
                GizmosAndHistoryViewModelImpl$6$1$1 gizmosAndHistoryViewModelImpl$6$1$1 = new GizmosAndHistoryViewModelImpl$6$1$1((List) ((C21952P1) abstractC21955Q1).f69511a);
                int i10 = GizmosAndHistoryViewModelImpl.f37368r;
                GizmosAndHistoryViewModelImpl.this.m14397m(gizmosAndHistoryViewModelImpl$6$1$1);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$7 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$7", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lzi/B1;", "Lbf/b0;", "it", "Lmm/C;", "<anonymous>", "(Lzi/B1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122417 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37385Y;

        /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$7$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21897B1 f37387Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21897B1 c21897b1) {
                super(1);
                this.f37387Y = c21897b1;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C20549b0 setState = (C20549b0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C20549b0.m21187e(setState, false, false, false, null, null, null, this.f37387Y.f69431a, false, null, null, false, null, null, null, null, null, null, false, 2097023);
            }
        }

        public C122417(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122417 c122417 = GizmosAndHistoryViewModelImpl.this.new C122417(interfaceC18770c);
            c122417.f37385Y = obj;
            return c122417;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C122417 c122417 = (C122417) create((C21897B1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c122417.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((C21897B1) this.f37385Y);
            int i10 = GizmosAndHistoryViewModelImpl.f37368r;
            GizmosAndHistoryViewModelImpl.this.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$8 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lvd/b0;", "", "Lzi/h0;", "it", "invoke", "(Lvd/b0;Ljava/util/Set;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122428 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122428 f37388Y = new C122428();

        public C122428() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            Set it = (Set) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C20549b0.m21187e(setOnEach, false, false, false, null, null, null, null, false, null, null, false, null, null, it, null, null, null, false, 2064383);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$9 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lvd/b0;", "", "Lzi/h0;", "streamingConversations", "invoke", "(Lvd/b0;Ljava/util/Set;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122439 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122439 f37389Y = new C122439();

        public C122439() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20549b0 setOnEach = (C20549b0) obj;
            Set streamingConversations = (Set) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(streamingConversations, "streamingConversations");
            return C20549b0.m21187e(setOnEach, false, false, false, null, null, null, null, false, null, null, false, null, streamingConversations, null, null, null, null, false, 2080767);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModelImpl$Companion;", "", "()V", "TitlesToGenerate", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GizmosAndHistoryViewModelImpl(C18086K c18086k, C18077B c18077b, C13133K c13133k, C9473F c9473f, C9473F c9473f2, RootViewModel rootViewModel, InterfaceC20904w interfaceC20904w, C11082S c11082s, InterfaceC13849E interfaceC13849E, C15000g c15000g, C11345b c11345b, C18114g0 c18114g0, C18127p c18127p) {
        boolean z6;
        C6852i c6852i = c11345b.f34301c;
        String str = ((C22011h0) c6852i.getValue()).f69652a;
        C5431w.f17746g.getClass();
        C21936L0 c21936l0 = (C21936L0) C5431w.f17751l.m5892c(c11082s);
        String str2 = c21936l0 != null ? c21936l0.f69488a : null;
        C13928d1 c13928d1 = C13928d1.f43978c;
        C14005w2 c14005w2 = (C14005w2) interfaceC13849E;
        boolean zM15481a = c14005w2.m15481a(c13928d1);
        if (c11082s != null) {
            String key = C5431w.f17749j.f17614a;
            AbstractC16544l.m18094g(key, "key");
            z6 = !c11082s.f33411a.containsKey(key);
        } else {
            z6 = false;
        }
        boolean z10 = z6;
        C17689w c17689w = C17689w.f56480Y;
        C17691y c17691y = C17691y.f56482Y;
        super(new C20549b0(true, false, false, str, str2, c17689w, null, null, true, null, "", false, z10, null, c17691y, c17691y, c17691y, c17691y, c17691y, false, zM15481a));
        this.f37369i = c18086k;
        this.f37370j = c18077b;
        this.f37371k = c9473f;
        this.f37372l = c9473f2;
        this.f37373m = rootViewModel;
        this.f37374n = interfaceC20904w;
        this.f37375o = interfaceC13849E;
        this.f37376p = AbstractC8168p6.m8749b("GizmosAndHistoryViewModel", null);
        this.f37377q = true;
        m14396l(C122362.f37378Y, c18086k.f57700f);
        m14396l(C122373.f37379Y, c13133k.f41697b);
        m14396l(C122384.f37380Y, c15000g.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
        m14396l(C122395.f37381Y, c6852i);
        if (c14005w2.m15481a(c13928d1)) {
            final C2153Q0 c2153q0 = this.f40343c;
            InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$map$1

                /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$map$1$2, reason: invalid class name */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass2<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f37421Y;

                    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$map$1$2", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f37422Y;

                        /* JADX INFO: renamed from: Z */
                        public int f37423Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f37422Y = obj;
                            this.f37423Z |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo395a(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2186j interfaceC2186j) {
                        this.f37421Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f37423Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f37423Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f37422Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f37423Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            String str = ((C20549b0) obj).f65219k;
                            anonymousClass1.f37423Z = 1;
                            if (this.f37421Y.mo395a(str, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9233X.m9807c(obj2);
                        }
                        return C17296C.f55119a;
                    }
                }

                @Override // p103Dn.InterfaceC2184i
                /* JADX INFO: renamed from: d */
                public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
                    c2153q0.mo3141d(new AnonymousClass2(interfaceC2186j), interfaceC18770c);
                    return EnumC19250a.f61036Y;
                }
            });
            C21554a c21554a = C21555b.f68260Z;
            AbstractC2124C.m3226y(AbstractC2124C.m3201E(AbstractC2124C.m3214m(interfaceC2184iM3215n, AbstractC0575H.m1165M(AbstractC8128k6.m8644j(RCHTTPStatusCodes.UNSUCCESSFUL, EnumC21557d.MILLISECONDS))), new C12244x2ca04c6c(this, null)), ViewModelKt.m12143a(this));
        }
        AbstractC2124C.m3226y(new C1970n(AbstractC9827W2.m10468a(c9473f, true, 1), 5, new C122406(null)), ViewModelKt.m12143a(this));
        if (c14005w2.m15481a(C13964m1.f44016c)) {
            AbstractC2124C.m3226y(new C1970n(c9473f2.m10020s(), 5, new C122417(null)), ViewModelKt.m12143a(this));
        }
        m14396l(C122428.f37388Y, c18114g0.f57785c);
        m14396l(C122439.f37389Y, c18127p.f57824g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14237n(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, C20541V c20541v, AbstractC19687c abstractC19687c) {
        GizmosAndHistoryViewModelImpl$archiveConversation$1 gizmosAndHistoryViewModelImpl$archiveConversation$1;
        C6636i c6636i;
        Object objM8405a;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$archiveConversation$1) {
            gizmosAndHistoryViewModelImpl$archiveConversation$1 = (GizmosAndHistoryViewModelImpl$archiveConversation$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37395r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$archiveConversation$1.f37395r0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$archiveConversation$1 = new GizmosAndHistoryViewModelImpl$archiveConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$archiveConversation$1 = new GizmosAndHistoryViewModelImpl$archiveConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object obj = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37393p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37395r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c6636i = c20541v.f65169a;
            gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$archiveConversation$2(c6636i));
            gizmosAndHistoryViewModelImpl$archiveConversation$1.f37390Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$archiveConversation$1.f37391Z = c20541v;
            gizmosAndHistoryViewModelImpl$archiveConversation$1.f37392o0 = c6636i;
            gizmosAndHistoryViewModelImpl$archiveConversation$1.f37395r0 = 1;
            objM8405a = AbstractC8040Z5.m8405a(gizmosAndHistoryViewModelImpl.f37370j, c6636i, true, gizmosAndHistoryViewModelImpl$archiveConversation$1);
            if (objM8405a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6636i c6636i2 = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37392o0;
            c20541v = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37391Z;
            GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl2 = gizmosAndHistoryViewModelImpl$archiveConversation$1.f37390Y;
            AbstractC9233X.m9807c(obj);
            c6636i = c6636i2;
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl2;
            objM8405a = obj;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM8405a;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            RootViewModel rootViewModel = gizmosAndHistoryViewModelImpl.f37373m;
            C2060i c2060i = new C2060i(R.string.conversation_archived);
            RootViewModelImpl rootViewModelImpl = (RootViewModelImpl) rootViewModel;
            rootViewModelImpl.getClass();
            rootViewModelImpl.m14393h(c2060i);
            if (c20541v.f65172d) {
                gizmosAndHistoryViewModelImpl.m14392g(C20574x.f65302a);
            }
        }
        gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$archiveConversation$5(c6636i));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14238o(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, C20541V c20541v, AbstractC19687c abstractC19687c) {
        GizmosAndHistoryViewModelImpl$deleteConversation$1 gizmosAndHistoryViewModelImpl$deleteConversation$1;
        C6636i c6636i;
        Object objM8407c;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$deleteConversation$1) {
            gizmosAndHistoryViewModelImpl$deleteConversation$1 = (GizmosAndHistoryViewModelImpl$deleteConversation$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37403r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$deleteConversation$1.f37403r0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$deleteConversation$1 = new GizmosAndHistoryViewModelImpl$deleteConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$deleteConversation$1 = new GizmosAndHistoryViewModelImpl$deleteConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object obj = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37401p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37403r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c6636i = c20541v.f65169a;
            gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$deleteConversation$2(c6636i));
            gizmosAndHistoryViewModelImpl$deleteConversation$1.f37398Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$deleteConversation$1.f37399Z = c20541v;
            gizmosAndHistoryViewModelImpl$deleteConversation$1.f37400o0 = c6636i;
            gizmosAndHistoryViewModelImpl$deleteConversation$1.f37403r0 = 1;
            objM8407c = AbstractC8040Z5.m8407c(gizmosAndHistoryViewModelImpl.f37370j, c6636i, gizmosAndHistoryViewModelImpl$deleteConversation$1);
            if (objM8407c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6636i c6636i2 = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37400o0;
            c20541v = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37399Z;
            GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl2 = gizmosAndHistoryViewModelImpl$deleteConversation$1.f37398Y;
            AbstractC9233X.m9807c(obj);
            c6636i = c6636i2;
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl2;
            objM8407c = obj;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM8407c;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            RootViewModel rootViewModel = gizmosAndHistoryViewModelImpl.f37373m;
            C2060i c2060i = new C2060i(R.string.conversation_deleted);
            RootViewModelImpl rootViewModelImpl = (RootViewModelImpl) rootViewModel;
            rootViewModelImpl.getClass();
            rootViewModelImpl.m14393h(c2060i);
            if (c20541v.f65172d) {
                gizmosAndHistoryViewModelImpl.m14392g(C20574x.f65302a);
            }
        }
        gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$deleteConversation$5(c6636i));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14239p(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        GizmosAndHistoryViewModelImpl$pinGizmo$1 gizmosAndHistoryViewModelImpl$pinGizmo$1;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$pinGizmo$1) {
            gizmosAndHistoryViewModelImpl$pinGizmo$1 = (GizmosAndHistoryViewModelImpl$pinGizmo$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$pinGizmo$1.f37458p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$pinGizmo$1.f37458p0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$pinGizmo$1 = new GizmosAndHistoryViewModelImpl$pinGizmo$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$pinGizmo$1 = new GizmosAndHistoryViewModelImpl$pinGizmo$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object objM10015n = gizmosAndHistoryViewModelImpl$pinGizmo$1.f37456Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$pinGizmo$1.f37458p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10015n);
            gizmosAndHistoryViewModelImpl.f37374n.mo21448b(C20893l.f66572j, str, C17690x.f56481Y);
            gizmosAndHistoryViewModelImpl$pinGizmo$1.f37455Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$pinGizmo$1.f37458p0 = 1;
            objM10015n = gizmosAndHistoryViewModelImpl.f37371k.m10015n(str, gizmosAndHistoryViewModelImpl$pinGizmo$1);
            if (objM10015n == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl$pinGizmo$1.f37455Y;
            AbstractC9233X.m9807c(objM10015n);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10015n;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: q */
    public static final Object m14240q(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, AbstractC19687c abstractC19687c) throws Throwable {
        GizmosAndHistoryViewModelImpl$refresh$1 gizmosAndHistoryViewModelImpl$refresh$1;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$refresh$1) {
            gizmosAndHistoryViewModelImpl$refresh$1 = (GizmosAndHistoryViewModelImpl$refresh$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$refresh$1.f37462p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$refresh$1.f37462p0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$refresh$1 = new GizmosAndHistoryViewModelImpl$refresh$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$refresh$1 = new GizmosAndHistoryViewModelImpl$refresh$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object objM19707c = gizmosAndHistoryViewModelImpl$refresh$1.f37460Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$refresh$1.f37462p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19707c);
            gizmosAndHistoryViewModelImpl.m14397m(GizmosAndHistoryViewModelImpl$refresh$2.f37463Y);
            gizmosAndHistoryViewModelImpl$refresh$1.f37459Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$refresh$1.f37462p0 = 1;
            objM19707c = gizmosAndHistoryViewModelImpl.f37369i.m19707c(gizmosAndHistoryViewModelImpl$refresh$1);
            if (objM19707c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl$refresh$1.f37459Y;
            AbstractC9233X.m9807c(objM19707c);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19707c;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        AbstractC0575H.m1156D(ViewModelKt.m12143a(gizmosAndHistoryViewModelImpl), null, null, new GizmosAndHistoryViewModelImpl$refresh$4(gizmosAndHistoryViewModelImpl, null), 3);
        if (((C14005w2) gizmosAndHistoryViewModelImpl.f37375o).m15481a(C13964m1.f44016c)) {
            AbstractC0575H.m1156D(ViewModelKt.m12143a(gizmosAndHistoryViewModelImpl), null, null, new GizmosAndHistoryViewModelImpl$refresh$5(gizmosAndHistoryViewModelImpl, null), 3);
        }
        gizmosAndHistoryViewModelImpl.m14397m(GizmosAndHistoryViewModelImpl$refresh$6.f37468Y);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: r */
    public static final Object m14241r(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, C6636i c6636i, String str, AbstractC19687c abstractC19687c) throws Throwable {
        GizmosAndHistoryViewModelImpl$renameConversation$1 gizmosAndHistoryViewModelImpl$renameConversation$1;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$renameConversation$1) {
            gizmosAndHistoryViewModelImpl$renameConversation$1 = (GizmosAndHistoryViewModelImpl$renameConversation$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$renameConversation$1.f37473q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$renameConversation$1.f37473q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$renameConversation$1 = new GizmosAndHistoryViewModelImpl$renameConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$renameConversation$1 = new GizmosAndHistoryViewModelImpl$renameConversation$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object objM19704i = gizmosAndHistoryViewModelImpl$renameConversation$1.f37471o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$renameConversation$1.f37473q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19704i);
            gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$renameConversation$2(c6636i));
            String str2 = c6636i.f21380b;
            gizmosAndHistoryViewModelImpl$renameConversation$1.f37469Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$renameConversation$1.f37470Z = c6636i;
            gizmosAndHistoryViewModelImpl$renameConversation$1.f37473q0 = 1;
            objM19704i = gizmosAndHistoryViewModelImpl.f37370j.m19704i(str2, str, gizmosAndHistoryViewModelImpl$renameConversation$1);
            if (objM19704i == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6636i = gizmosAndHistoryViewModelImpl$renameConversation$1.f37470Z;
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl$renameConversation$1.f37469Y;
            AbstractC9233X.m9807c(objM19704i);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19704i;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$renameConversation$4(c6636i));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: s */
    public static final Object m14242s(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        GizmosAndHistoryViewModelImpl$unpinGizmo$1 gizmosAndHistoryViewModelImpl$unpinGizmo$1;
        gizmosAndHistoryViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$unpinGizmo$1) {
            gizmosAndHistoryViewModelImpl$unpinGizmo$1 = (GizmosAndHistoryViewModelImpl$unpinGizmo$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37490p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37490p0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$unpinGizmo$1 = new GizmosAndHistoryViewModelImpl$unpinGizmo$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$unpinGizmo$1 = new GizmosAndHistoryViewModelImpl$unpinGizmo$1(gizmosAndHistoryViewModelImpl, abstractC19687c);
        }
        Object objM10021t = gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37488Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37490p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10021t);
            gizmosAndHistoryViewModelImpl.f37374n.mo21448b(C20893l.f66588z, str, C17690x.f56481Y);
            gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37487Y = gizmosAndHistoryViewModelImpl;
            gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37490p0 = 1;
            objM10021t = gizmosAndHistoryViewModelImpl.f37371k.m10021t(str, gizmosAndHistoryViewModelImpl$unpinGizmo$1);
            if (objM10021t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl$unpinGizmo$1.f37487Y;
            AbstractC9233X.m9807c(objM10021t);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10021t;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC20539T intent = (InterfaceC20539T) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C20534N) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C20530J) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C20523C) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C20535O) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$4(this, intent, null));
            return;
        }
        if (intent instanceof C20521A) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$5(this, intent, null));
            return;
        }
        if (intent instanceof C20531K) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$6(this, intent, null));
            return;
        }
        boolean z6 = intent instanceof C20536P;
        InterfaceC20904w interfaceC20904w = this.f37374n;
        if (z6) {
            int length = ((C20549b0) this.f40343c.getValue()).f65219k.length();
            String str = ((C20536P) intent).f65162a;
            if (length == 0 && str.length() == 1) {
                interfaceC20904w.mo21447a(C20857C.f66322d, C17690x.f56481Y);
            }
            m14397m(new GizmosAndHistoryViewModelImpl$search$1(str));
            return;
        }
        boolean z10 = intent instanceof C20525E;
        C20857C c20857c = C20857C.f66343y;
        if (z10) {
            String str2 = ((C20525E) intent).f65152a;
            interfaceC20904w.mo21447a(c20857c, AbstractC17660E.m19258c(new C17309l("gizmo_id", str2)));
            m14392g(new C20573w(str2));
            return;
        }
        if (intent instanceof C20529I) {
            m14392g(new C20575y(((C20529I) intent).f65154a));
            return;
        }
        if (intent instanceof C20522B) {
            interfaceC20904w.mo21447a(c20857c, AbstractC17660E.m19258c(new C17309l("gizmo_id", "default")));
            m14392g(C20574x.f65302a);
            return;
        }
        if (intent instanceof AbstractC20527G) {
            interfaceC20904w.mo21447a(C20857C.f66315A, C17690x.f56481Y);
            m14397m(GizmosAndHistoryViewModelImpl$openMoreGizmos$1.f37454Y);
            return;
        }
        if (intent instanceof AbstractC20526F) {
            interfaceC20904w.mo21447a(C20857C.f66319E, C17690x.f56481Y);
            m14397m(GizmosAndHistoryViewModelImpl$showLessGizmos$1.f37486Y);
            return;
        }
        boolean z11 = intent instanceof C20524D;
        C5391c c5391c = C5391c.f17646Z;
        if (z11) {
            C5380T c5380t = C5380T.f17632h;
            c5380t.getClass();
            m14393h(new C2058g(c5380t.m5885a(c5391c), true));
            return;
        }
        if (intent instanceof C20532L) {
            if (((C20532L) intent).f65157a && this.f37377q) {
                this.f37377q = false;
                AbstractC8160o6.m8726a(this.f37376p, "First load of history screen", null, 6);
                AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1(this, null), 3);
                AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2(this, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof C20533M) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$7(this, intent, null));
            return;
        }
        if (intent instanceof C20538S) {
            m14394i(new GizmosAndHistoryViewModelImpl$onIntent$8(this, intent, null));
            return;
        }
        if (intent instanceof C20537Q) {
            C5410l0 c5410l0 = C5410l0.f17684g;
            c5410l0.getClass();
            m14393h(new C2058g(c5410l0.m5885a(c5391c), true));
        } else if (intent instanceof C20528H) {
            C5418p0 c5418p0 = C5418p0.f17707h;
            c5418p0.getClass();
            m14393h(new C2058g(c5418p0.m5885a(c5391c), true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m14243t(C6636i c6636i, AbstractC19687c abstractC19687c) {
        GizmosAndHistoryViewModelImpl$fetchMore$1 gizmosAndHistoryViewModelImpl$fetchMore$1;
        GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl;
        if (abstractC19687c instanceof GizmosAndHistoryViewModelImpl$fetchMore$1) {
            gizmosAndHistoryViewModelImpl$fetchMore$1 = (GizmosAndHistoryViewModelImpl$fetchMore$1) abstractC19687c;
            int i10 = gizmosAndHistoryViewModelImpl$fetchMore$1.f37409p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmosAndHistoryViewModelImpl$fetchMore$1.f37409p0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmosAndHistoryViewModelImpl$fetchMore$1 = new GizmosAndHistoryViewModelImpl$fetchMore$1(this, abstractC19687c);
            }
        } else {
            gizmosAndHistoryViewModelImpl$fetchMore$1 = new GizmosAndHistoryViewModelImpl$fetchMore$1(this, abstractC19687c);
        }
        Object objM19709e = gizmosAndHistoryViewModelImpl$fetchMore$1.f37407Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmosAndHistoryViewModelImpl$fetchMore$1.f37409p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19709e);
            if (!this.f37377q) {
                C20549b0 c20549b0 = (C20549b0) this.f40343c.getValue();
                if (!c20549b0.f65211c && c20549b0.f65217i) {
                    m14397m(GizmosAndHistoryViewModelImpl$fetchMore$3.f37410Y);
                    if (c6636i == null) {
                        if (((C14005w2) this.f37375o).m15481a(C13964m1.f44016c)) {
                            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new GizmosAndHistoryViewModelImpl$fetchMore$4(this, null), 3);
                        }
                    }
                    C5551u c5551u = c6636i != null ? c6636i.f21382d : null;
                    gizmosAndHistoryViewModelImpl$fetchMore$1.f37406Y = this;
                    gizmosAndHistoryViewModelImpl$fetchMore$1.f37409p0 = 1;
                    objM19709e = this.f37369i.m19709e(c5551u, gizmosAndHistoryViewModelImpl$fetchMore$1);
                    if (objM19709e == enumC19250a) {
                        return enumC19250a;
                    }
                    gizmosAndHistoryViewModelImpl = this;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gizmosAndHistoryViewModelImpl = gizmosAndHistoryViewModelImpl$fetchMore$1.f37406Y;
        AbstractC9233X.m9807c(objM19709e);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19709e;
        if (abstractC21955Q1 instanceof C21952P1) {
            gizmosAndHistoryViewModelImpl.m14397m(new GizmosAndHistoryViewModelImpl$fetchMore$5$1(((Boolean) ((C21952P1) abstractC21955Q1).f69511a).booleanValue()));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmosAndHistoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            gizmosAndHistoryViewModelImpl.m14397m(GizmosAndHistoryViewModelImpl$fetchMore$6$1.f37414Y);
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        gizmosAndHistoryViewModelImpl.m14397m(GizmosAndHistoryViewModelImpl$fetchMore$7.f37415Y);
        return c17296c;
    }
}
