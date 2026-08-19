package com.openai.feature.gizmoshome.impl.details;

import androidx.lifecycle.ViewModel;
import bf.AbstractC11372a0;
import bf.C11349D;
import bf.C11380h;
import bf.InterfaceC11374b0;
import com.openai.chatgpt.R;
import com.openai.feature.gizmoshome.details.SnorlaxHomeViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.ArrayList;
import java.util.List;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p016Ae.C0452n;
import p017Af.C0491v;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p103Dn.C2146N;
import p1042uh.C20261Z;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p1107xh.EnumC21219I;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21897B1;
import p1155zi.C21921H1;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p318Mh.C5391c;
import p318Mh.C5410l0;
import p318Mh.C5433x;
import p337Nd.C5710c;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p576Xe.C9473F;
import p706df.C13087g;
import p706df.C13089i;
import p706df.C13090j;
import p706df.C13091k;
import p706df.C13092l;
import p706df.C13093m;
import p706df.C13094n;
import p706df.C13095o;
import p706df.C13104x;
import p706df.InterfaceC13096p;
import p726ef.C13374a;
import p726ef.C13377d;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmoshome/impl/details/SnorlaxHomeViewModelImpl;", "Lcom/openai/feature/gizmoshome/details/SnorlaxHomeViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SnorlaxHomeViewModelImpl extends SnorlaxHomeViewModel {

    /* JADX INFO: renamed from: i */
    public final C5710c f38311i;

    /* JADX INFO: renamed from: j */
    public final C0452n f38312j;

    /* JADX INFO: renamed from: k */
    public final C13374a f38313k;

    /* JADX INFO: renamed from: l */
    public final C18077B f38314l;

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ldf/x;", "Lwd/a;", "state", "invoke", "(Ldf/x;Lwd/a;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123781 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123781 f38315Y = new C123781();

        public C123781() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x0026  */
        /* JADX WARN: Code duplicated, block: B:16:0x0033  */
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20263a0 c20263a0;
            C11349D c11349d;
            C13104x setOnEach = (C13104x) obj;
            C20908a state = (C20908a) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(state, "state");
            C11349D c11349d2 = null;
            C11349D c11349d3 = state.f66646b;
            if (c11349d3 == null) {
                c20263a0 = state.f66645a;
                if (c20263a0 != null) {
                    int i10 = AbstractC11372a0.f34379a;
                    if (AbstractC16544l.m18089b(c20263a0.f64088e, "snorlax")) {
                        String strM12782a = AbstractC11372a0.m12782a(c20263a0);
                        C20261Z c20261z = c20263a0.f64086c;
                        c11349d2 = new C11349D(strM12782a, c20261z.f64081a, null, null, null, null, null, null, new C11380h(c20261z.f64082b, 2), null, c20263a0.f64087d.contains(EnumC21219I.REPORTABLE), false, null, false, false, false, false, null, false, false, null, null, null, null, c20263a0.f64088e, null, null, 469760764);
                    }
                }
                c11349d = c11349d2;
            } else {
                if (!c11349d3.f34317D) {
                    c11349d3 = null;
                }
                if (c11349d3 == null) {
                    c20263a0 = state.f66645a;
                    if (c20263a0 != null) {
                        int i11 = AbstractC11372a0.f34379a;
                        if (AbstractC16544l.m18089b(c20263a0.f64088e, "snorlax")) {
                            String strM12782a2 = AbstractC11372a0.m12782a(c20263a0);
                            C20261Z c20261z2 = c20263a0.f64086c;
                            c11349d2 = new C11349D(strM12782a2, c20261z2.f64081a, null, null, null, null, null, null, new C11380h(c20261z2.f64082b, 2), null, c20263a0.f64087d.contains(EnumC21219I.REPORTABLE), false, null, false, false, false, false, null, false, false, null, null, null, null, c20263a0.f64088e, null, null, 469760764);
                        }
                    }
                    c11349d = c11349d2;
                } else {
                    c11349d = c11349d3;
                }
            }
            return C13104x.m14805e(setOnEach, c11349d, null, null, false, null, 126);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ldf/x;", "Lbf/b0;", "snorlax", "invoke", "(Ldf/x;Lbf/b0;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123792 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123792 f38316Y = new C123792();

        public C123792() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C13104x setOnEach = (C13104x) obj;
            InterfaceC11374b0 snorlax = (InterfaceC11374b0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(snorlax, "snorlax");
            return C13104x.m14805e(setOnEach, snorlax, null, null, false, null, 126);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ldf/x;", "Lef/d;", "state", "invoke", "(Ldf/x;Lef/d;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123803 extends AbstractC16546n implements InterfaceC1439n {
        public C123803() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C13104x setOnEach = (C13104x) obj;
            C13377d state = (C13377d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(state, "state");
            String str = SnorlaxHomeViewModelImpl.this.f38311i.f18501d;
            List list = (List) state.f42416a.get(str != null ? new C21936L0(str) : null);
            if (list == null) {
                list = C17689w.f56480Y;
            }
            return C13104x.m14805e(setOnEach, null, list, null, true, null, 117);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$4", m20656f = "SnorlaxHomeViewModelImpl.kt", m20657l = {85}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123814 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38318Y;

        public C123814(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return SnorlaxHomeViewModelImpl.this.new C123814(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123814) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38318Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f38318Y = 1;
                if (SnorlaxHomeViewModelImpl.this.m14289q(null, false, this) == enumC19250a) {
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

    public SnorlaxHomeViewModelImpl(C16382j c16382j, C5710c c5710c, C0452n c0452n, C13374a c13374a, C18077B c18077b, C9473F c9473f) {
        super(new C13104x(null, C17689w.f56480Y, new C21921H1(null), true, c5710c.f18501d, C17691y.f56482Y, false));
        this.f38311i = c5710c;
        this.f38312j = c0452n;
        this.f38313k = c13374a;
        this.f38314l = c18077b;
        m14396l(C123781.f38315Y, c16382j.f50876c);
        String str = c5710c.f18501d;
        if (str != null) {
            m14396l(C123792.f38316Y, new C1970n(c9473f.m10020s(), 17, str));
        }
        m14396l(new C123803(), new C2146N(c13374a.f64176f, 1));
        m14394i(new C123814(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14286n(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, String str, AbstractC19687c abstractC19687c) throws Throwable {
        SnorlaxHomeViewModelImpl$archiveConversation$1 snorlaxHomeViewModelImpl$archiveConversation$1;
        snorlaxHomeViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxHomeViewModelImpl$archiveConversation$1) {
            snorlaxHomeViewModelImpl$archiveConversation$1 = (SnorlaxHomeViewModelImpl$archiveConversation$1) abstractC19687c;
            int i10 = snorlaxHomeViewModelImpl$archiveConversation$1.f38324q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxHomeViewModelImpl$archiveConversation$1.f38324q0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxHomeViewModelImpl$archiveConversation$1 = new SnorlaxHomeViewModelImpl$archiveConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
            }
        } else {
            snorlaxHomeViewModelImpl$archiveConversation$1 = new SnorlaxHomeViewModelImpl$archiveConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
        }
        Object objM19696a = snorlaxHomeViewModelImpl$archiveConversation$1.f38322o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxHomeViewModelImpl$archiveConversation$1.f38324q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19696a);
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$archiveConversation$2(str));
            snorlaxHomeViewModelImpl$archiveConversation$1.f38320Y = snorlaxHomeViewModelImpl;
            snorlaxHomeViewModelImpl$archiveConversation$1.f38321Z = str;
            snorlaxHomeViewModelImpl$archiveConversation$1.f38324q0 = 1;
            objM19696a = snorlaxHomeViewModelImpl.f38314l.m19696a(null, str, true, snorlaxHomeViewModelImpl$archiveConversation$1);
            if (objM19696a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = snorlaxHomeViewModelImpl$archiveConversation$1.f38321Z;
            snorlaxHomeViewModelImpl = snorlaxHomeViewModelImpl$archiveConversation$1.f38320Y;
            AbstractC9233X.m9807c(objM19696a);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19696a;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            snorlaxHomeViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            snorlaxHomeViewModelImpl.m14393h(new C2060i(R.string.conversation_archived));
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$archiveConversation$4$1(str));
        }
        snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$archiveConversation$5(str));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14287o(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        SnorlaxHomeViewModelImpl$deleteConversation$1 snorlaxHomeViewModelImpl$deleteConversation$1;
        snorlaxHomeViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxHomeViewModelImpl$deleteConversation$1) {
            snorlaxHomeViewModelImpl$deleteConversation$1 = (SnorlaxHomeViewModelImpl$deleteConversation$1) abstractC19687c;
            int i10 = snorlaxHomeViewModelImpl$deleteConversation$1.f38332q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxHomeViewModelImpl$deleteConversation$1.f38332q0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxHomeViewModelImpl$deleteConversation$1 = new SnorlaxHomeViewModelImpl$deleteConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
            }
        } else {
            snorlaxHomeViewModelImpl$deleteConversation$1 = new SnorlaxHomeViewModelImpl$deleteConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
        }
        Object objM19697b = snorlaxHomeViewModelImpl$deleteConversation$1.f38330o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxHomeViewModelImpl$deleteConversation$1.f38332q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19697b);
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$deleteConversation$2(str));
            snorlaxHomeViewModelImpl$deleteConversation$1.f38328Y = snorlaxHomeViewModelImpl;
            snorlaxHomeViewModelImpl$deleteConversation$1.f38329Z = str;
            snorlaxHomeViewModelImpl$deleteConversation$1.f38332q0 = 1;
            objM19697b = snorlaxHomeViewModelImpl.f38314l.m19697b(null, str, snorlaxHomeViewModelImpl$deleteConversation$1);
            if (objM19697b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = snorlaxHomeViewModelImpl$deleteConversation$1.f38329Z;
            snorlaxHomeViewModelImpl = snorlaxHomeViewModelImpl$deleteConversation$1.f38328Y;
            AbstractC9233X.m9807c(objM19697b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19697b;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            snorlaxHomeViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            snorlaxHomeViewModelImpl.m14393h(new C2060i(R.string.conversation_deleted));
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$deleteConversation$4$1(str));
        }
        snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$deleteConversation$5(str));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14288p(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, String str, String str2, AbstractC19687c abstractC19687c) throws Throwable {
        SnorlaxHomeViewModelImpl$renameConversation$1 snorlaxHomeViewModelImpl$renameConversation$1;
        snorlaxHomeViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxHomeViewModelImpl$renameConversation$1) {
            snorlaxHomeViewModelImpl$renameConversation$1 = (SnorlaxHomeViewModelImpl$renameConversation$1) abstractC19687c;
            int i10 = snorlaxHomeViewModelImpl$renameConversation$1.f38372r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxHomeViewModelImpl$renameConversation$1.f38372r0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxHomeViewModelImpl$renameConversation$1 = new SnorlaxHomeViewModelImpl$renameConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
            }
        } else {
            snorlaxHomeViewModelImpl$renameConversation$1 = new SnorlaxHomeViewModelImpl$renameConversation$1(snorlaxHomeViewModelImpl, abstractC19687c);
        }
        Object objM19704i = snorlaxHomeViewModelImpl$renameConversation$1.f38370p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxHomeViewModelImpl$renameConversation$1.f38372r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19704i);
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$renameConversation$2(str));
            snorlaxHomeViewModelImpl$renameConversation$1.f38367Y = snorlaxHomeViewModelImpl;
            snorlaxHomeViewModelImpl$renameConversation$1.f38368Z = str;
            snorlaxHomeViewModelImpl$renameConversation$1.f38369o0 = str2;
            snorlaxHomeViewModelImpl$renameConversation$1.f38372r0 = 1;
            objM19704i = snorlaxHomeViewModelImpl.f38314l.m19704i(str, str2, snorlaxHomeViewModelImpl$renameConversation$1);
            if (objM19704i == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = snorlaxHomeViewModelImpl$renameConversation$1.f38369o0;
            str = snorlaxHomeViewModelImpl$renameConversation$1.f38368Z;
            snorlaxHomeViewModelImpl = snorlaxHomeViewModelImpl$renameConversation$1.f38367Y;
            AbstractC9233X.m9807c(objM19704i);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19704i;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            snorlaxHomeViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$renameConversation$4$1(str, str2));
        }
        snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$renameConversation$5(str));
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC13096p intent = (InterfaceC13096p) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C13091k) {
            m14394i(new SnorlaxHomeViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C13092l) {
            C5433x c5433x = C5433x.f17766g;
            String conversationId = this.f38311i.f18498a;
            c5433x.getClass();
            AbstractC16544l.m18094g(conversationId, "conversationId");
            m14393h(new C2058g(c5433x.m5885a(new C0491v(conversationId, 23)), true));
            return;
        }
        if (intent instanceof C13093m) {
            m14394i(new SnorlaxHomeViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C13090j) {
            m14394i(new SnorlaxHomeViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C13089i) {
            m14394i(new SnorlaxHomeViewModelImpl$onIntent$4(this, intent, null));
            return;
        }
        if (intent instanceof C13095o) {
            C5410l0 c5410l0 = C5410l0.f17684g;
            c5410l0.getClass();
            m14393h(new C2058g(c5410l0.m5885a(C5391c.f17646Z), true));
        } else if (intent instanceof C13094n) {
            m14394i(new SnorlaxHomeViewModelImpl$onIntent$5(this, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m14289q(String str, boolean z6, AbstractC19687c abstractC19687c) {
        SnorlaxHomeViewModelImpl$loadMore$1 snorlaxHomeViewModelImpl$loadMore$1;
        String str2;
        Object objM1095c;
        SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl;
        SnorlaxHomeViewModelImpl$loadMore$3$1$2 snorlaxHomeViewModelImpl$loadMore$3$1$2;
        ArrayList arrayList;
        List list;
        if (abstractC19687c instanceof SnorlaxHomeViewModelImpl$loadMore$1) {
            snorlaxHomeViewModelImpl$loadMore$1 = (SnorlaxHomeViewModelImpl$loadMore$1) abstractC19687c;
            int i10 = snorlaxHomeViewModelImpl$loadMore$1.f38342s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxHomeViewModelImpl$loadMore$1.f38342s0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxHomeViewModelImpl$loadMore$1 = new SnorlaxHomeViewModelImpl$loadMore$1(this, abstractC19687c);
            }
        } else {
            snorlaxHomeViewModelImpl$loadMore$1 = new SnorlaxHomeViewModelImpl$loadMore$1(this, abstractC19687c);
        }
        Object obj = snorlaxHomeViewModelImpl$loadMore$1.f38340q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxHomeViewModelImpl$loadMore$1.f38342s0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            m14397m(SnorlaxHomeViewModelImpl$loadMore$2.f38343Y);
            str2 = ((C13104x) this.f40343c.getValue()).f41617e;
            if (str2 != null) {
                snorlaxHomeViewModelImpl$loadMore$1.f38336Y = this;
                snorlaxHomeViewModelImpl$loadMore$1.f38337Z = str;
                snorlaxHomeViewModelImpl$loadMore$1.f38338o0 = str2;
                snorlaxHomeViewModelImpl$loadMore$1.f38339p0 = z6;
                snorlaxHomeViewModelImpl$loadMore$1.f38342s0 = 1;
                objM1095c = this.f38312j.m1095c(str2, str, snorlaxHomeViewModelImpl$loadMore$1);
                if (objM1095c == enumC19250a) {
                    return enumC19250a;
                }
                snorlaxHomeViewModelImpl = this;
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z6 = snorlaxHomeViewModelImpl$loadMore$1.f38339p0;
        String str3 = snorlaxHomeViewModelImpl$loadMore$1.f38338o0;
        String str4 = snorlaxHomeViewModelImpl$loadMore$1.f38337Z;
        SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl2 = snorlaxHomeViewModelImpl$loadMore$1.f38336Y;
        AbstractC9233X.m9807c(obj);
        str2 = str3;
        str = str4;
        snorlaxHomeViewModelImpl = snorlaxHomeViewModelImpl2;
        objM1095c = obj;
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM1095c;
        boolean z10 = abstractC21955Q1 instanceof C21952P1;
        List list2 = C17689w.f56480Y;
        if (!z10) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                snorlaxHomeViewModelImpl.m14397m(new SnorlaxHomeViewModelImpl$loadMore$3$2$1(abstractC21933K1));
                snorlaxHomeViewModelImpl.m14393h(new C2059h(abstractC21933K1));
            } else {
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                if (((C13104x) snorlaxHomeViewModelImpl.f40343c.getValue()).f41616d || str == null) {
                    snorlaxHomeViewModelImpl.m14394i(new SnorlaxHomeViewModelImpl$loadMore$3$1$1(snorlaxHomeViewModelImpl, str2, list2, null));
                }
                snorlaxHomeViewModelImpl$loadMore$3$1$2 = new SnorlaxHomeViewModelImpl$loadMore$3$1$2(snorlaxHomeViewModelImpl, list2, z6, null);
            }
            return C17296C.f55119a;
        }
        C21897B1 c21897b1 = (C21897B1) ((C21952P1) abstractC21955Q1).f69511a;
        if (c21897b1 == null || (list = c21897b1.f69431a) == null) {
            arrayList = null;
        } else {
            List<C6636i> list3 = list;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list3, 10));
            for (C6636i c6636i : list3) {
                snorlaxHomeViewModelImpl.getClass();
                String str5 = c6636i.f21379a;
                String str6 = c6636i.f21384f;
                if (str6 == null) {
                    str6 = "";
                }
                arrayList.add(new C13087g(str5, str6, c6636i.f21394p));
            }
        }
        if (arrayList != null) {
            list2 = arrayList;
        }
        if (((C13104x) snorlaxHomeViewModelImpl.f40343c.getValue()).f41616d || str == null) {
            snorlaxHomeViewModelImpl.m14394i(new SnorlaxHomeViewModelImpl$loadMore$3$1$1(snorlaxHomeViewModelImpl, str2, list2, null));
        }
        snorlaxHomeViewModelImpl$loadMore$3$1$2 = new SnorlaxHomeViewModelImpl$loadMore$3$1$2(snorlaxHomeViewModelImpl, list2, z6, c21897b1);
        snorlaxHomeViewModelImpl.m14397m(snorlaxHomeViewModelImpl$loadMore$3$1$2);
        return C17296C.f55119a;
    }
}
