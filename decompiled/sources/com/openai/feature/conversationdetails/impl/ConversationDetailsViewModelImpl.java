package com.openai.feature.conversationdetails.impl;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.C11349D;
import bf.InterfaceC11374b0;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13987s0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import ne.C17600b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p086D6.C1970n;
import p098Di.C2055d;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1042uh.C20263a0;
import p1081wc.C20857C;
import p1081wc.C20907z;
import p1081wc.InterfaceC20904w;
import p1082wd.C20908a;
import p1082wd.C20909b;
import p1155zi.EnumC22026l;
import p337Nd.C5710c;
import p403Qd.C6636i;
import p523V9.AbstractC8087f5;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p576Xe.C9473F;
import p787he.C14459O;
import p811ih.C15000g;
import p885m4.C17155e;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p963qd.C18674c;
import p963qd.C18675d;
import p963qd.C18676e;
import p963qd.C18686o;
import p963qd.InterfaceC18677f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ve.C20584h;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModelImpl;", "Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationDetailsViewModelImpl extends ConversationDetailsViewModel {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f37299j = 0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f37300i;

    /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqd/o;", "Lwd/a;", "it", "invoke", "(Lqd/o;Lwd/a;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122251 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122251 f37301Y = new C122251();

        public C122251() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C18686o setOnEach = (C18686o) obj;
            C20908a it = (C20908a) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C18686o.m20040e(setOnEach, null, null, it.f66646b, null, null, false, null, false, 507);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqd/o;", "Lbf/b0;", "it", "invoke", "(Lqd/o;Lbf/b0;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122262 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122262 f37302Y = new C122262();

        public C122262() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C18686o setOnEach = (C18686o) obj;
            InterfaceC11374b0 it = (InterfaceC11374b0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C18686o.m20040e(setOnEach, null, null, null, it, null, false, null, false, 503);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqd/o;", "Lwd/b;", "it", "invoke", "(Lqd/o;Lwd/b;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122273 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122273 f37303Y = new C122273();

        public C122273() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C18686o setOnEach = (C18686o) obj;
            C20909b it = (C20909b) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C18686o.m20040e(setOnEach, null, it.m21453a(), null, null, null, false, null, false, 509);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqd/o;", "", "it", "invoke", "(Lqd/o;Z)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122284 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122284 f37304Y = new C122284();

        public C122284() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C18686o setOnEach = (C18686o) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C18686o.m20040e(setOnEach, null, null, null, null, null, false, null, zBooleanValue, 255);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$6", m20656f = "ConversationDetailsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"LQd/i;", "conversation", "Lve/h;", "settingsInstructions", "Luh/a0;", "gizmo", "Lmm/C;", "<anonymous>", "(LQd/i;Lve/h;Luh/a0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122296 extends AbstractC19694j implements InterfaceC1441p {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ C6636i f37305Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ C20584h f37306Z;

        /* JADX INFO: renamed from: o0 */
        public /* synthetic */ C20263a0 f37307o0;

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ C5710c f37309q0;

        /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$6$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lqd/o;", "invoke", "(Lqd/o;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C6636i f37310Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C5710c f37311Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C20263a0 f37312o0;

            /* JADX INFO: renamed from: p0 */
            public final /* synthetic */ C20584h f37313p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6636i c6636i, C5710c c5710c, C20263a0 c20263a0, C20584h c20584h) {
                super(1);
                this.f37310Y = c6636i;
                this.f37311Z = c5710c;
                this.f37312o0 = c20263a0;
                this.f37313p0 = c20584h;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C20584h c20584hM8532a;
                C18686o setState = (C18686o) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C6636i c6636i = this.f37310Y;
                if (c6636i != null) {
                    c20584hM8532a = AbstractC8087f5.m8532a(c6636i);
                } else {
                    c20584hM8532a = (this.f37311Z.f18500c == null && this.f37312o0 == null) ? this.f37313p0 : null;
                }
                return C18686o.m20040e(setState, null, null, null, null, c20584hM8532a, false, null, false, 495);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122296(C5710c c5710c, InterfaceC18770c interfaceC18770c) {
            super(4, interfaceC18770c);
            this.f37309q0 = c5710c;
        }

        @Override // p049Bm.InterfaceC1441p
        /* JADX INFO: renamed from: d */
        public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
            C5710c c5710c = this.f37309q0;
            C122296 c122296 = ConversationDetailsViewModelImpl.this.new C122296(c5710c, (InterfaceC18770c) obj4);
            c122296.f37305Y = (C6636i) obj;
            c122296.f37306Z = (C20584h) obj2;
            c122296.f37307o0 = (C20263a0) obj3;
            C17296C c17296c = C17296C.f55119a;
            c122296.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = this.f37305Y;
            C20584h c20584h = this.f37306Z;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6636i, this.f37309q0, this.f37307o0, c20584h);
            int i10 = ConversationDetailsViewModelImpl.f37299j;
            ConversationDetailsViewModelImpl.this.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModelImpl$Companion;", "", "()V", "HelpUrl", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
    public ConversationDetailsViewModelImpl(C5710c c5710c, C20592p c20592p, C14459O c14459o, C17600b c17600b, C16382j c16382j, InterfaceC13849E interfaceC13849E, C15000g c15000g, C9473F c9473f, InterfaceC20904w interfaceC20904w) {
        final C2153Q0 c2153q0 = c16382j.f50876c;
        super(new C18686o(null, null, ((C20908a) c2153q0.getValue()).f66646b, null, null, false, ((C14005w2) interfaceC13849E).m15481a(C13987s0.f44051c), null, false));
        this.f37300i = interfaceC20904w;
        m14396l(C122251.f37301Y, c2153q0);
        String str = c5710c.f18501d;
        if (str != null && AbstractC16544l.m18089b(c5710c.f18502e, "snorlax")) {
            m14396l(C122262.f37302Y, new C1970n(c9473f.m10020s(), 17, str));
        }
        m14396l(C122273.f37303Y, c17600b.f56349b);
        C17155e c17155e = EnumC22026l.f69677Z;
        m14396l(C122284.f37304Y, c15000g.m16134a(EnumC22026l.SearchTool, null));
        InterfaceC2184i interfaceC2184i = new InterfaceC2184i() { // from class: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$special$$inlined$map$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C122302<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37317Y;

                /* JADX INFO: renamed from: com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversationdetails.impl.ConversationDetailsViewModelImpl$special$$inlined$map$1$2", m20656f = "ConversationDetailsViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37318Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37319Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37318Y = obj;
                        this.f37319Z |= Integer.MIN_VALUE;
                        return C122302.this.mo395a(null, this);
                    }
                }

                public C122302(InterfaceC2186j interfaceC2186j) {
                    this.f37317Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37319Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37319Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37318Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37319Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        C20263a0 c20263a0 = ((C20908a) obj).f66645a;
                        anonymousClass1.f37319Z = 1;
                        if (this.f37317Y.mo395a(c20263a0, anonymousClass1) == enumC19250a) {
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
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                Object objMo3141d = c2153q0.mo3141d(new C122302(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        };
        C122296 c122296 = new C122296(c5710c, null);
        C1970n c1970n = c20592p.f65348r0;
        InterfaceC2184i interfaceC2184i2 = c14459o.f45521t;
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i[]{interfaceC2184i2, c1970n, interfaceC2184i}, 7, c122296), ViewModelKt.m12143a(this));
        String str2 = c5710c.f18500c;
        if (str2 != null) {
            m14396l(new ConversationDetailsViewModelImpl$7$1(str2), interfaceC2184i2);
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        String str;
        InterfaceC18677f intent = (InterfaceC18677f) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C18676e) {
            m14397m(new ConversationDetailsViewModelImpl$onIntent$1(intent));
            return;
        }
        boolean z6 = intent instanceof C18674c;
        InterfaceC20904w interfaceC20904w = this.f37300i;
        if (!z6) {
            if (intent.equals(C18675d.f59455a)) {
                interfaceC20904w.mo21447a(C20907z.f66641e, C17690x.f56481Y);
                Intent intent2 = new Intent();
                AbstractC9186P.m9748b(intent2, "https://help.openai.com/en/articles/7925741-chatgpt-shared-links-faq");
                m14393h(new C2055d(intent2));
                return;
            }
            return;
        }
        C11349D c11349d = ((C18686o) this.f40343c.getValue()).f59489c;
        if (c11349d == null || (str = c11349d.f34323f) == null) {
            return;
        }
        interfaceC20904w.mo21447a(C20857C.f66330l, AbstractC17660E.m19258c(new C17309l("gizmo_id", c11349d.f34318a)));
        Intent intent3 = new Intent();
        AbstractC9186P.m9748b(intent3, str);
        m14393h(new C2055d(intent3));
    }
}
