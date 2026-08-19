package com.openai.feature.conversations.impl.conversation;

import android.app.Application;
import android.content.Intent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import be.C11345b;
import bf.AbstractC11372a0;
import bh.C11434h;
import com.openai.feature.rootviewmodel.RootViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigClient;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13847D0;
import gd.C13861I;
import gd.C13864J;
import gd.C13872L1;
import gd.C13875M1;
import gd.C13888R0;
import gd.C13893T;
import gd.C13894T0;
import gd.C13898U1;
import gd.C13935f0;
import gd.C13941g2;
import gd.C13944h1;
import gd.C13950j;
import gd.C13952j1;
import gd.C13956k1;
import gd.C13959l0;
import gd.C13960l1;
import gd.C13961l2;
import gd.C13969n2;
import gd.C13975p0;
import gd.C13983r0;
import gd.C13987s0;
import gd.C13988s1;
import gd.C13993t2;
import gd.C14000v1;
import gd.C14005w2;
import gd.C14013z0;
import gd.EnumC13945h2;
import gd.InterfaceC13849E;
import ge.C14015A;
import ge.C14017B;
import ge.C14018B0;
import ge.C14019C;
import ge.C14021D;
import ge.C14023E;
import ge.C14025F;
import ge.C14027G;
import ge.C14029H;
import ge.C14031I;
import ge.C14033J;
import ge.C14035K;
import ge.C14037L;
import ge.C14039M;
import ge.C14041N;
import ge.C14043O;
import ge.C14045P;
import ge.C14047Q;
import ge.C14049R0;
import ge.C14050S;
import ge.C14053T0;
import ge.C14061X0;
import ge.C14076g;
import ge.C14078h;
import ge.C14080i;
import ge.C14082j;
import ge.C14084k;
import ge.C14086l;
import ge.C14088m;
import ge.C14090n;
import ge.C14092o;
import ge.C14094p;
import ge.C14096q;
import ge.C14098r;
import ge.C14100s;
import ge.C14102t;
import ge.C14104u;
import ge.C14106v;
import ge.C14108w;
import ge.C14110x;
import ge.C14111x0;
import ge.C14112y;
import ge.C14114z;
import ge.EnumC14040M0;
import ge.EnumC14097q0;
import ge.InterfaceC14052T;
import id.C14963b;
import id.C14966e;
import id.C14968g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import ne.C17600b;
import ni.C17627a;
import p003A1.AbstractC0168G;
import p017Af.C0491v;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p072Ci.C1699d;
import p072Ci.C1705j;
import p072Ci.EnumC1702g;
import p086D6.C1970n;
import p094De.C2025h;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1025te.C19863N;
import p1025te.C19864O;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p103Dn.C2215x0;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1042uh.C20263a0;
import p1081wc.C20855A;
import p1081wc.C20856B;
import p1081wc.C20857C;
import p1081wc.C20858D;
import p1081wc.C20887f;
import p1081wc.C20893l;
import p1081wc.C20897p;
import p1081wc.EnumC20898q;
import p1081wc.InterfaceC20904w;
import p1082wd.C20908a;
import p1082wd.C20909b;
import p1128yg.C21539c;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1139z0.C21585H;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21957R1;
import p1155zi.C21984a1;
import p1155zi.C21999e0;
import p1155zi.C22011h0;
import p1155zi.C22013h2;
import p1155zi.C22020j1;
import p1155zi.C22038o;
import p1155zi.EnumC21896B0;
import p1155zi.EnumC21974X0;
import p1155zi.EnumC22026l;
import p129En.C2604o;
import p148Fi.AbstractC2792U0;
import p148Fi.AbstractC2829i1;
import p148Fi.C2790T0;
import p193Hf.C3332T;
import p195Hh.C3430e;
import p216Id.C3694b;
import p216Id.C3696d;
import p216Id.C3697e;
import p216Id.C3699g;
import p216Id.C3700h;
import p216Id.C3701i;
import p216Id.InterfaceC3698f;
import p216Id.InterfaceC3702j;
import p217Ie.C3708d;
import p220Ih.InterfaceC3721c;
import p229J0.C4171z3;
import p248Jk.C4474e;
import p268Kf.C4666u;
import p269Kh.C4676c;
import p269Kh.C4688o;
import p318Mh.C5365H;
import p318Mh.C5370J0;
import p318Mh.C5374M;
import p318Mh.C5379S;
import p318Mh.C5391c;
import p318Mh.C5410l0;
import p318Mh.C5412m0;
import p318Mh.C5416o0;
import p318Mh.C5431w;
import p318Mh.C5438z0;
import p318Mh.EnumC5421r;
import p318Mh.EnumC5424s0;
import p318Mh.EnumC5425t;
import p361Oe.C6175b;
import p361Oe.C6177d;
import p361Oe.C6179f;
import p361Oe.C6181h;
import p361Oe.C6182i;
import p361Oe.C6183j;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p403Qd.C6636i;
import p405Qf.C6687b;
import p427Rc.C6852i;
import p456Sg.C7132c;
import p479Td.C7351f0;
import p506Ug.C7674i;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8095g5;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9212T2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p575Xd.C9436E;
import p576Xe.C9473F;
import p577Xf.C9504c;
import p594Y9.AbstractC10003y4;
import p620Zc.InterfaceC10277b;
import p658b5.C11248s;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p787he.C14445A;
import p787he.C14457M;
import p787he.C14459O;
import p811ih.C15000g;
import p834jd.C16194c;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p925oe.C18089N;
import p925oe.C18092Q;
import p948pi.C18418a;
import p948pi.C18422e;
import p956q3.C18621a;
import p972qm.InterfaceC18770c;
import p990rg.C18982i;
import p990rg.C18983j;
import p990rg.C18985l;
import p996rm.EnumC19250a;
import pg.C18412b;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ve.C20584h;
import ve.C20592p;
import ye.C21515d;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/conversation/ConversationViewModelImpl;", "Lcom/openai/feature/conversations/impl/conversation/ConversationViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationViewModelImpl extends ConversationViewModel {

    /* JADX INFO: renamed from: i */
    public final C15000g f37584i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC13849E f37585j;

    /* JADX INFO: renamed from: k */
    public final C13993t2 f37586k;

    /* JADX INFO: renamed from: l */
    public final C18412b f37587l;

    /* JADX INFO: renamed from: m */
    public final C14459O f37588m;

    /* JADX INFO: renamed from: n */
    public final C18089N f37589n;

    /* JADX INFO: renamed from: o */
    public final C13141T f37590o;

    /* JADX INFO: renamed from: p */
    public final C17627a f37591p;

    /* JADX INFO: renamed from: q */
    public final RootViewModel f37592q;

    /* JADX INFO: renamed from: r */
    public final C13133K f37593r;

    /* JADX INFO: renamed from: s */
    public final C19864O f37594s;

    /* JADX INFO: renamed from: t */
    public final C9473F f37595t;

    /* JADX INFO: renamed from: u */
    public final C2790T0 f37596u;

    /* JADX INFO: renamed from: v */
    public final C14968g f37597v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC20904w f37598w;

    /* JADX INFO: renamed from: x */
    public final AbstractC21864z f37599x;

    /* JADX INFO: renamed from: y */
    public final C11434h f37600y;

    /* JADX INFO: renamed from: z */
    public final C3430e f37601z;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$1", m20656f = "ConversationViewModel.kt", m20657l = {525, 525, 527}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122601 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public C9504c f37602Y;

        /* JADX INFO: renamed from: Z */
        public int f37603Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C11082S f37604o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ C9504c f37605p0;

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ ConversationViewModelImpl f37606q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122601(C11082S c11082s, C9504c c9504c, ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37604o0 = c11082s;
            this.f37605p0 = c9504c;
            this.f37606q0 = conversationViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C122601(this.f37604o0, this.f37605p0, this.f37606q0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122601) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C9504c c9504c;
            boolean zM3710a;
            AbstractC21955Q1 abstractC21955Q1;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37603Z;
            ConversationViewModelImpl conversationViewModelImpl = this.f37606q0;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C5431w.f17746g.getClass();
                if (((Boolean) C5431w.f17755p.m5892c(this.f37604o0)).booleanValue()) {
                    C2215x0 c2215x0 = conversationViewModelImpl.f37596u.f8514b;
                    c9504c = this.f37605p0;
                    this.f37602Y = c9504c;
                    this.f37603Z = 1;
                    obj = AbstractC2124C.m3221t(c2215x0, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    zM3710a = AbstractC2792U0.m3710a((AbstractC2829i1) obj);
                    this.f37602Y = null;
                    this.f37603Z = 2;
                    if (c9504c.m10024a(zM3710a, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    C14459O c14459o = conversationViewModelImpl.f37588m;
                    this.f37603Z = 3;
                    obj = c14459o.m15980i(this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q1 = (AbstractC21955Q1) obj;
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        AbstractC8160o6.m8731f(conversationViewModelImpl.f37601z, "Failed to refresh conversation", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
                    }
                }
            } else if (i10 == 1) {
                c9504c = this.f37602Y;
                AbstractC9233X.m9807c(obj);
                zM3710a = AbstractC2792U0.m3710a((AbstractC2829i1) obj);
                this.f37602Y = null;
                this.f37603Z = 2;
                if (c9504c.m10024a(zM3710a, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                abstractC21955Q1 = (AbstractC21955Q1) obj;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC8160o6.m8731f(conversationViewModelImpl.f37601z, "Failed to refresh conversation", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
                }
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$10 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "LKh/c;", "it", "invoke", "(Lge/x0;LKh/c;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226110 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1226110 f37607Y = new C1226110();

        public C1226110() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C4676c it = (C4676c) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, it, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -9, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$11 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "LCi/d;", "it", "invoke", "(Lge/x0;LCi/d;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226211 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1226211 f37608Y = new C1226211();

        public C1226211() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C1699d it = (C1699d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, it.f4827a, null, false, null, null, null, false, false, null, null, false, -1, 8388603);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$12 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lwd/b;", "it", "invoke", "(Lge/x0;Lwd/b;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226312 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1226312 f37609Y = new C1226312();

        public C1226312() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C20909b it = (C20909b) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, null, null, it, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -33, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$13 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lwd/a;", "it", "invoke", "(Lge/x0;Lwd/a;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226413 extends AbstractC16546n implements InterfaceC1439n {
        public C1226413() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0042  */
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            boolean zM15481a;
            boolean z6;
            C14111x0 setOnEach = (C14111x0) obj;
            C20908a it = (C20908a) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            C15000g c15000g = conversationViewModelImpl.f37584i;
            if (setOnEach.f44400c.f58779g) {
                zM15481a = c15000g.m16135b(EnumC22026l.WorkspaceShareLinks, C13944h1.f43994c);
            } else {
                zM15481a = ((C14005w2) conversationViewModelImpl.f37585j).m15481a(C13944h1.f43994c);
            }
            if (zM15481a) {
                z6 = true;
                C20263a0 c20263a0 = setOnEach.f44411h0;
                if (c20263a0 != null && AbstractC11372a0.m12784c(c20263a0)) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            return C14111x0.m15491e(setOnEach, null, null, null, it, null, null, null, null, null, null, false, z6, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -65601, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$14 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$14", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/K1;", "it", "Lmm/C;", "<anonymous>", "(Lzi/K1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226514 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37611Y;

        public C1226514(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1226514 c1226514 = ConversationViewModelImpl.this.new C1226514(interfaceC18770c);
            c1226514.f37611Y = obj;
            return c1226514;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1226514 c1226514 = (C1226514) create((AbstractC21933K1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1226514.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ConversationViewModelImpl.this.m14393h(new C2059h((AbstractC21933K1) this.f37611Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$15 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$15", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LCi/j;", "settings", "", "showAnnouncement", "Lmm/C;", "<anonymous>", "(LCi/j;Z)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226615 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ C1705j f37613Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ boolean f37614Z;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$15$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C1705j f37616Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ boolean f37617Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ ConversationViewModelImpl f37618o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1705j c1705j, boolean z6, ConversationViewModelImpl conversationViewModelImpl) {
                super(1);
                this.f37616Y = c1705j;
                this.f37617Z = z6;
                this.f37618o0 = conversationViewModelImpl;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0058  */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C1705j c1705j = this.f37616Y;
                boolean z6 = false;
                if (!c1705j.f4882o && this.f37617Z) {
                    ConversationViewModelImpl conversationViewModelImpl = this.f37618o0;
                    C14005w2 c14005w2 = (C14005w2) conversationViewModelImpl.f37585j;
                    C3430e c3430e = c14005w2.f44085c;
                    Boolean boolValueOf = Boolean.FALSE;
                    try {
                        boolValueOf = Boolean.valueOf(StatsigClient.getExperiment$default(c14005w2.f44083a.f44049e, "advanced_voice_ga_tooltip", false, 2, null).getBoolean("show_tooltip", false));
                    } catch (IllegalStateException e10) {
                        AbstractC8160o6.m8731f(c3430e, "Statsig not initialized", e10, null, 4);
                    }
                    AbstractC8168p6.m8748a(c14005w2.f44084b, "advanced_voice_ga_tooltip.show_tooltip", boolValueOf, c3430e);
                    if (boolValueOf.booleanValue()) {
                        z6 = true;
                    } else {
                        if (((C14005w2) conversationViewModelImpl.f37585j).m15481a(C13864J.f43902c)) {
                            z6 = true;
                        }
                    }
                }
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, c1705j, false, false, false, null, null, null, C14061X0.m15484a(setState.f44438z, false, null, false, z6, 7), false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -33816577, 8388607);
            }
        }

        public C1226615(InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            C1226615 c1226615 = ConversationViewModelImpl.this.new C1226615((InterfaceC18770c) obj3);
            c1226615.f37613Y = (C1705j) obj;
            c1226615.f37614Z = zBooleanValue;
            C17296C c17296c = C17296C.f55119a;
            c1226615.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C1705j c1705j = this.f37613Y;
            boolean z6 = this.f37614Z;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            conversationViewModelImpl.m14397m(new AnonymousClass1(c1705j, z6, conversationViewModelImpl));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$16 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$16", m20656f = "ConversationViewModel.kt", m20657l = {638}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226716 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37619Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$16$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$16$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "it"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37621Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37621Y = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37621Y);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$16$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ljd/c;", "invoke", "(Ljd/c;)Ljd/c;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f37622Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16194c update = (C16194c) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C16194c.m17803a(update, true, false, false, 0, null, 30);
            }
        }

        public C1226716(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1226716(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1226716) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37619Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C14968g c14968g = conversationViewModelImpl.f37597v;
                C14966e c14966e = new C14966e(c14968g.f46620Z.f64176f, c14968g, 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.f37619Y = 1;
                if (AbstractC2124C.m3220s(c14966e, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            conversationViewModelImpl.f37597v.mo15971c(AnonymousClass2.f37622Y);
            C5374M c5374m = C5374M.f17623g;
            EnumC21974X0 enumC21974X0 = EnumC21974X0.f69562v0;
            c5374m.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5374m.m5885a(new C4171z3(enumC21974X0, 14)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$17 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$17", m20656f = "ConversationViewModel.kt", m20657l = {646}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226817 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37623Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$17$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$17$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "it"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37625Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37625Y = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37625Y);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$17$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ljd/c;", "invoke", "(Ljd/c;)Ljd/c;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f37626Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16194c update = (C16194c) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C16194c.m17803a(update, true, false, false, 0, null, 30);
            }
        }

        public C1226817(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1226817(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1226817) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37623Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C14968g c14968g = conversationViewModelImpl.f37597v;
                C1970n c1970n = c14968g.f46620Z.f64176f;
                C2207t0 c2207t0 = new C2207t0(new C14966e(c1970n, c14968g, 1), c1970n, new C14963b(c14968g, null), 0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.f37623Y = 1;
                if (AbstractC2124C.m3220s(c2207t0, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            conversationViewModelImpl.f37597v.mo15971c(AnonymousClass2.f37626Y);
            C5365H c5365h = C5365H.f17604g;
            EnumC21896B0 enumC21896B0 = EnumC21896B0.Account;
            c5365h.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$18 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$18", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "<anonymous>", "(Z)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1226918 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ boolean f37627Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$18$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ljd/c;", "invoke", "(Ljd/c;)Ljd/c;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f37629Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16194c update = (C16194c) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C16194c.m17803a(update, false, true, false, 0, null, 29);
            }
        }

        public C1226918(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1226918 c1226918 = ConversationViewModelImpl.this.new C1226918(interfaceC18770c);
            c1226918.f37627Y = ((Boolean) obj).booleanValue();
            return c1226918;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C1226918 c1226918 = (C1226918) create(bool, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1226918.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            if (this.f37627Y) {
                ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
                conversationViewModelImpl.f37597v.mo15971c(AnonymousClass1.f37629Y);
                C5374M c5374m = C5374M.f17623g;
                EnumC21974X0 enumC21974X0 = EnumC21974X0.f69563w0;
                c5374m.getClass();
                conversationViewModelImpl.m14393h(new C2058g(c5374m.m5885a(new C4171z3(enumC21974X0, 14)), true));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$19 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "", "it", "invoke", "(Lge/x0;Z)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227019 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1227019 f37630Y = new C1227019();

        public C1227019() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, zBooleanValue, null, null, false, null, null, null, false, false, null, null, false, -1, 8388605);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$2", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lwd/b;", "it", "Lzi/j1;", "<anonymous>", "(Lwd/b;)Lzi/j1;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122712 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37631Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122712 c122712 = new C122712(2, interfaceC18770c);
            c122712.f37631Y = obj;
            return c122712;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122712) create((C20909b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C4688o c4688o = ((C20909b) this.f37631Y).f66654e;
            String str = c4688o != null ? c4688o.f15253b : null;
            if (str != null) {
                return new C22020j1(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$20 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "", "it", "invoke", "(Lge/x0;Z)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227220 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1227220 f37632Y = new C1227220();

        public C1227220() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, C14061X0.m15484a(setOnEach.f44438z, false, null, zBooleanValue, false, 11), false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -33554433, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21", m20656f = "ConversationViewModel.kt", m20657l = {673, 674}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227321 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37633Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "it", "", "<anonymous>", "(Lge/x0;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f37635Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37635Y = obj;
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((C14111x0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(((C14111x0) this.f37635Y).f44377H);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21$2, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$21$2", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass2 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37636Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, interfaceC18770c);
                anonymousClass2.f37636Y = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass2) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37636Y);
            }
        }

        public C1227321(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1227321(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1227321) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37633Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                C5365H c5365h = C5365H.f17604g;
                EnumC21896B0 enumC21896B0 = EnumC21896B0.Memory;
                c5365h.getClass();
                conversationViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = conversationViewModelImpl.f40343c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.f37633Y = 1;
            if (AbstractC2124C.m3220s(c2153q0, anonymousClass1, this) == enumC19250a) {
                return enumC19250a;
            }
            C13141T c13141t = conversationViewModelImpl.f37590o;
            C1970n c1970n = new C1970n(c13141t.f41721d, 21, EnumC1702g.MemoryOnboarding);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, null);
            this.f37633Y = 2;
            if (AbstractC2124C.m3220s(c1970n, anonymousClass2, this) == enumC19250a) {
                return enumC19250a;
            }
            C5365H c5365h2 = C5365H.f17604g;
            EnumC21896B0 enumC21896B1 = EnumC21896B0.Memory;
            c5365h2.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5365h2.m5885a(new C4171z3(enumC21896B1, 13)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$22 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$22", m20656f = "ConversationViewModel.kt", m20657l = {679}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227422 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37637Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$22$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$22$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37639Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37639Y = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37639Y);
            }
        }

        public C1227422(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1227422(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1227422) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37637Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C13141T c13141t = conversationViewModelImpl.f37590o;
                C1970n c1970n = new C1970n(c13141t.f41721d, 21, EnumC1702g.MemoryInSearch);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.f37637Y = 1;
                if (AbstractC2124C.m3220s(c1970n, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            C5365H c5365h = C5365H.f17604g;
            EnumC21896B0 enumC21896B0 = EnumC21896B0.MemoryInSearch;
            c5365h.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23", m20656f = "ConversationViewModel.kt", m20657l = {685, 688}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227523 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37640Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "it", "", "<anonymous>", "(Lge/x0;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f37642Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37642Y = obj;
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((C14111x0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(((C14111x0) this.f37642Y).f44380K);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23$2, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$23$2", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass2 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37643Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, interfaceC18770c);
                anonymousClass2.f37643Y = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass2) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37643Y);
            }
        }

        public C1227523(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1227523(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1227523) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:19:0x0060  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC21896B0 enumC21896B0;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37640Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                C5365H c5365h = C5365H.f17604g;
                if (((C14111x0) conversationViewModelImpl.f40343c.getValue()).f44377H) {
                    enumC21896B0 = EnumC21896B0.TemporaryConversation;
                } else {
                    enumC21896B0 = EnumC21896B0.NoMemoryTemporaryConversation;
                }
                c5365h.getClass();
                conversationViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = conversationViewModelImpl.f40343c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.f37640Y = 1;
            if (AbstractC2124C.m3220s(c2153q0, anonymousClass1, this) == enumC19250a) {
                return enumC19250a;
            }
            C13141T c13141t = conversationViewModelImpl.f37590o;
            C1970n c1970n = new C1970n(c13141t.f41721d, 21, EnumC1702g.TemporaryChatOnboarding);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, null);
            this.f37640Y = 2;
            if (AbstractC2124C.m3220s(c1970n, anonymousClass2, this) == enumC19250a) {
                return enumC19250a;
            }
            C5365H c5365h2 = C5365H.f17604g;
            if (((C14111x0) conversationViewModelImpl.f40343c.getValue()).f44377H) {
                enumC21896B0 = EnumC21896B0.TemporaryConversation;
            } else {
                enumC21896B0 = EnumC21896B0.NoMemoryTemporaryConversation;
            }
            c5365h2.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5365h2.m5885a(new C4171z3(enumC21896B0, 13)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$24 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$24", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "it", "LId/j;", "<anonymous>", "(LId/b;)LId/j;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227624 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37644Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1227624 c1227624 = new C1227624(2, interfaceC18770c);
            c1227624.f37644Y = obj;
            return c1227624;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1227624) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return ((C3694b) this.f37644Y).f11220e;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$25 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$25", m20656f = "ConversationViewModel.kt", m20657l = {705}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/j;", "it", "Lmm/C;", "<anonymous>", "(LId/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227725 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37645Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37646Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C7132c f37647o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ ConversationViewModelImpl f37648p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1227725(C7132c c7132c, ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37647o0 = c7132c;
            this.f37648p0 = conversationViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1227725 c1227725 = new C1227725(this.f37647o0, this.f37648p0, interfaceC18770c);
            c1227725.f37646Z = obj;
            return c1227725;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1227725) create((InterfaceC3702j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37645Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                if (((InterfaceC3702j) this.f37646Z) instanceof C3700h) {
                    this.f37645Y = 1;
                    obj = this.f37647o0.m7523b(null, false, this);
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
            boolean z6 = abstractC21955Q1 instanceof C21952P1;
            ConversationViewModelImpl conversationViewModelImpl = this.f37648p0;
            if (z6) {
                conversationViewModelImpl.m14397m(new ConversationViewModelImpl$25$1$1((C7674i) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8727b(conversationViewModelImpl.f37601z, "Error loading memory usage", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$26 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$26", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "conversationState", "Lmm/C;", "<anonymous>", "(LId/b;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227826 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37650Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$26$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$26$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ ConversationViewModelImpl f37652Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
                super(1, interfaceC18770c);
                this.f37652Y = conversationViewModelImpl;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
                return new AnonymousClass1(this.f37652Y, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((InterfaceC18770c) obj);
                C17296C c17296c = C17296C.f55119a;
                anonymousClass1.invokeSuspend(c17296c);
                return c17296c;
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                this.f37652Y.m14393h(new C2058g(C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15), true));
                return C17296C.f55119a;
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$26$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C3694b f37653Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C3694b c3694b) {
                super(1);
                this.f37653Y = c3694b;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C7351f0 c7351f0;
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C3694b c3694b = this.f37653Y;
                String str = c3694b.f11223h;
                InterfaceC3702j interfaceC3702j = c3694b.f11220e;
                boolean z6 = interfaceC3702j instanceof C3699g;
                C3696d c3696d = interfaceC3702j instanceof C3696d ? (C3696d) interfaceC3702j : null;
                AbstractC21933K1 abstractC21933K1 = c3696d != null ? c3696d.f11230a : null;
                C3699g c3699g = z6 ? (C3699g) interfaceC3702j : null;
                List list = c3699g != null ? c3699g.f11233b : false ? null : c3694b.f11224i;
                return C14111x0.m15491e(setState, null, null, null, null, null, str, list == null ? C17689w.f56480Y : list, null, null, null, false, false, false, null, false, (interfaceC3702j instanceof InterfaceC3698f) && !((c7351f0 = setState.f44409g0) != null && c7351f0.f23274J && c7351f0.f23280P), z6, abstractC21933K1, null, null, null, false, false, null, false, null, null, false, c3694b.f11216a, c3694b.f11226k, null, false, c3694b.f11217b != null, null, null, false, -7340801, 8371679);
            }
        }

        public C1227826(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1227826 c1227826 = ConversationViewModelImpl.this.new C1227826(interfaceC18770c);
            c1227826.f37650Y = obj;
            return c1227826;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1227826 c1227826 = (C1227826) create((C3694b) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1227826.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C3694b c3694b = (C3694b) this.f37650Y;
            InterfaceC3702j interfaceC3702j = c3694b.f11220e;
            boolean z6 = interfaceC3702j instanceof C3697e;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (z6) {
                conversationViewModelImpl.m14393h(new C2059h(((C3697e) interfaceC3702j).f11231a));
                conversationViewModelImpl.m14394i(new AnonymousClass1(conversationViewModelImpl, null));
            }
            conversationViewModelImpl.m14397m(new AnonymousClass2(c3694b));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$27 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lzi/h0;", "it", "invoke-mRA7E-s", "(Lge/x0;Ljava/lang/String;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1227927 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1227927 f37654Y = new C1227927();

        public C1227927() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            String it = ((C22011h0) obj2).f69652a;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, null, it, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -17, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$28 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$28", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LQd/i;", "conversation", "Lve/h;", "settingsInstructions", "Lmm/C;", "<anonymous>", "(LQd/i;Lve/h;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228028 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ C6636i f37655Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ C20584h f37656Z;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$28$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C20584h f37658Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20584h f37659Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C6636i f37660o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C20584h c20584h, C20584h c20584h2, C6636i c6636i) {
                super(1);
                this.f37658Y = c20584h;
                this.f37659Z = c20584h2;
                this.f37660o0 = c6636i;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0034  */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                boolean z6;
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                if (AbstractC8087f5.m8533b(this.f37660o0).isEmpty()) {
                    z6 = setState.f44437y.f44302d;
                } else {
                    C20584h c20584h = this.f37659Z;
                    boolean zM8565b = AbstractC8095g5.m8565b(c20584h);
                    C20584h c20584h2 = this.f37658Y;
                    z6 = false;
                    if (zM8565b == AbstractC8095g5.m8565b(c20584h2)) {
                        if (AbstractC8095g5.m8565b(c20584h) || AbstractC8095g5.m8565b(c20584h2)) {
                            if (AbstractC16544l.m18089b(c20584h != null ? c20584h.f65316b : null, c20584h2 != null ? c20584h2.f65316b : null)) {
                                if (AbstractC16544l.m18089b(c20584h != null ? c20584h.f65317c : null, c20584h2 != null ? c20584h2.f65317c : null)) {
                                    if (AbstractC16544l.m18089b(c20584h != null ? c20584h.f65318d : null, c20584h2 != null ? c20584h2.f65318d : null)) {
                                        z6 = true;
                                    }
                                }
                            }
                        } else {
                            z6 = true;
                        }
                    }
                }
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, C14076g.m15485a(setState.f44437y, this.f37658Y, this.f37659Z, z6, false, 17), null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -16777217, 8388607);
            }
        }

        public C1228028(InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C1228028 c1228028 = ConversationViewModelImpl.this.new C1228028((InterfaceC18770c) obj3);
            c1228028.f37655Y = (C6636i) obj;
            c1228028.f37656Z = (C20584h) obj2;
            C17296C c17296c = C17296C.f55119a;
            c1228028.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = this.f37655Y;
            ConversationViewModelImpl.this.m14397m(new AnonymousClass1(this.f37656Z, AbstractC8087f5.m8532a(c6636i), c6636i));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$29 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$29", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOe/b;", "it", "Lmm/C;", "<anonymous>", "(LOe/b;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228129 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37661Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$29$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C6175b f37663Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6175b c6175b) {
                super(1);
                this.f37663Y = c6175b;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, this.f37663Y.f20118a, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -4097, 8388607);
            }
        }

        public C1228129(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1228129 c1228129 = ConversationViewModelImpl.this.new C1228129(interfaceC18770c);
            c1228129.f37661Y = obj;
            return c1228129;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1228129 c1228129 = (C1228129) create((C6175b) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1228129.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ConversationViewModelImpl.this.m14397m(new AnonymousClass1((C6175b) this.f37661Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$3", m20656f = "ConversationViewModel.kt", m20657l = {538}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lzi/j1;", "modelSlug", "Lzi/Q1;", "Lrg/j;", "<anonymous>", "(Lzi/j1;)Lzi/Q1;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122823 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37664Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37665Z;

        public C122823(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122823 c122823 = ConversationViewModelImpl.this.new C122823(interfaceC18770c);
            c122823.f37665Z = obj;
            return c122823;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122823) create(new C22020j1(((C22020j1) obj).f69665a), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37664Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                String str = ((C22020j1) this.f37665Z).f69665a;
                ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
                C18412b c18412b = conversationViewModelImpl.f37587l;
                boolean zBooleanValue = ((Boolean) conversationViewModelImpl.f37586k.m15479a(C13898U1.f43947d)).booleanValue();
                this.f37664Y = 1;
                obj = c18412b.m19870a(str, zBooleanValue, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$30 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Landroid/content/Intent;", "it", "Lmm/C;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228330 extends AbstractC16546n implements InterfaceC1436k {
        public C1228330() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            Intent it = (Intent) obj;
            AbstractC16544l.m18094g(it, "it");
            ConversationViewModelImpl.this.m14393h(new C2055d(it));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$31 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$31", m20656f = "ConversationViewModel.kt", m20657l = {776}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "msg", "Lmm/C;", "<anonymous>", "(LTd/f0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228431 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37668Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37669Z;

        public C1228431(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1228431 c1228431 = ConversationViewModelImpl.this.new C1228431(interfaceC18770c);
            c1228431.f37669Z = obj;
            return c1228431;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1228431) create((C7351f0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37668Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C7351f0 c7351f0 = (C7351f0) this.f37669Z;
                if (c7351f0 != null) {
                    C14459O c14459o = ConversationViewModelImpl.this.f37588m;
                    this.f37668Y = 1;
                    if (c14459o.m15987p(c7351f0, this) == enumC19250a) {
                        return enumC19250a;
                    }
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

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$32 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "LFi/i1;", "voiceState", "invoke", "(Lge/x0;LFi/i1;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228532 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1228532 f37671Y = new C1228532();

        public C1228532() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            AbstractC2829i1 voiceState = (AbstractC2829i1) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(voiceState, "voiceState");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, C14061X0.m15484a(setOnEach.f44438z, false, voiceState, false, false, 13), false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -33554433, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$33 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$33", m20656f = "ConversationViewModel.kt", m20657l = {784}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228633 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f37672Y;

        public C1228633(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1228633(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C1228633) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37672Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f37672Y = 1;
                if (ConversationViewModelImpl.this.m14257t(this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$34 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$34", m20656f = "ConversationViewModel.kt", m20657l = {791}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228734 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37674Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$34$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$34$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "it", "", "<anonymous>", "(LId/b;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f37676Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37676Y = obj;
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(AbstractC16544l.m18089b(((C3694b) this.f37676Y).f11220e, C3701i.f11235a));
            }
        }

        public C1228734(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1228734(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1228734) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37674Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C2207t0 c2207t0 = conversationViewModelImpl.f37588m.f45526y;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.f37674Y = 1;
                if (AbstractC2124C.m3220s(c2207t0, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            conversationViewModelImpl.m14392g(C14078h.f44306a);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$35 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$35", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LQd/i;", "it", "", "<anonymous>", "(LQd/i;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228835 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37677Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1228835 c1228835 = new C1228835(2, interfaceC18770c);
            c1228835.f37677Y = obj;
            return c1228835;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1228835) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f37677Y;
            return Boolean.valueOf((c6636i != null ? c6636i.f21398t : null) != null);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$37 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$37", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "<anonymous>", "(Z)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1228937 extends AbstractC19694j implements InterfaceC1439n {
        public C1228937(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1228937(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C1228937 c1228937 = (C1228937) create(bool, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1228937.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C5438z0 c5438z0 = C5438z0.f17777g;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            String conversationId = ((C14111x0) conversationViewModelImpl.f40343c.getValue()).f44404e;
            c5438z0.getClass();
            AbstractC16544l.m18094g(conversationId, "conversationId");
            conversationViewModelImpl.m14393h(new C2058g(c5438z0.m5885a(new C0491v(conversationId, 29)), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$38 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$38", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lye/d;", "it", "", "<anonymous>", "(Lye/d;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229038 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37679Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1229038 c1229038 = new C1229038(2, interfaceC18770c);
            c1229038.f37679Y = obj;
            return c1229038;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1229038) create((C21515d) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(((C21515d) this.f37679Y).f68136e);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$39 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "", "it", "invoke", "(Lge/x0;Z)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229139 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1229139 f37680Y = new C1229139();

        public C1229139() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, zBooleanValue, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -67108865, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lge/x0;", "Lzi/P1;", "Lrg/j;", "it", "invoke", "(Lge/x0;Lzi/P1;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122924 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122924 f37681Y = new C122924();

        public C122924() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C21952P1 it = (C21952P1) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, (C18983j) it.f69511a, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -2049, 8388607);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$40 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "it", "", "invoke", "(Lge/x0;)Ljava/lang/Integer;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229340 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C1229340 f37682Y = new C1229340();

        public C1229340() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C14111x0 it = (C14111x0) obj;
            AbstractC16544l.m18094g(it, "it");
            return Integer.valueOf(it.m15498l().size());
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$41 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$41", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "it", "Lmm/C;", "<anonymous>", "(Lge/x0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229441 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$41$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f37684Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, EnumC14097q0.f44336Z, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -8388609, 8388607);
            }
        }

        public C1229441(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1229441(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1229441 c1229441 = (C1229441) create((C14111x0) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1229441.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ConversationViewModelImpl.this.m14397m(AnonymousClass1.f37684Y);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$42 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$42", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "it", "Lzi/a1;", "<anonymous>", "(LTd/f0;)Lzi/a1;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229542 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37685Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1229542 c1229542 = new C1229542(2, interfaceC18770c);
            c1229542.f37685Y = obj;
            return c1229542;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1229542) create((C7351f0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C7351f0 c7351f0 = (C7351f0) this.f37685Y;
            String str = c7351f0 != null ? c7351f0.f23286a : null;
            if (str != null) {
                return new C21984a1(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$43 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lzi/a1;", "it", "invoke-cvjGrow", "(Lge/x0;Ljava/lang/String;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229643 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1229643 f37686Y = new C1229643();

        public C1229643() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C21984a1 c21984a1 = (C21984a1) obj2;
            String str = c21984a1 != null ? c21984a1.f69607Y : null;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, str, false, false, null, null, false, -1, 8384511);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$44 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$44", m20656f = "ConversationViewModel.kt", m20657l = {810, 812}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229744 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public ConversationViewModelImpl f37687Y;

        /* JADX INFO: renamed from: Z */
        public C21999e0 f37688Z;

        /* JADX INFO: renamed from: o0 */
        public int f37689o0;

        public C1229744(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C1229744(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1229744) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        /* JADX WARN: Code duplicated, block: B:21:0x004f  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C21999e0 c21999e0;
            List list;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37689o0;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c21999e0 = this.f37688Z;
                    conversationViewModelImpl = this.f37687Y;
                    AbstractC9233X.m9807c(obj);
                }
                if (c21999e0 != null) {
                    list = c21999e0.f69628a;
                } else {
                    list = null;
                }
                conversationViewModelImpl.m14397m(new ConversationViewModelImpl$44$1$1$1(list));
                conversationViewModelImpl.f37594s.m20781a(new ConversationViewModelImpl$44$1$2(c21999e0));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C18089N c18089n = conversationViewModelImpl.f37589n;
            this.f37689o0 = 1;
            obj = c18089n.m19710a(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            AbstractC6224C abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                C21999e0 c21999e1 = (C21999e0) ((C6223B) abstractC6224C).f20258a;
                this.f37687Y = conversationViewModelImpl;
                this.f37688Z = c21999e1;
                this.f37689o0 = 2;
                if (ConversationViewModelImpl.m14255r(conversationViewModelImpl, c21999e1, this) == enumC19250a) {
                    return enumC19250a;
                }
                c21999e0 = c21999e1;
                if (c21999e0 != null) {
                    list = c21999e0.f69628a;
                } else {
                    list = null;
                }
                conversationViewModelImpl.m14397m(new ConversationViewModelImpl$44$1$1$1(list));
                conversationViewModelImpl.f37594s.m20781a(new ConversationViewModelImpl$44$1$2(c21999e0));
            } else if (abstractC6224C instanceof AbstractC6249w) {
                AbstractC8160o6.m8727b(conversationViewModelImpl.f37601z, "Failed to fetch init conversation", ((AbstractC6249w) abstractC6224C).f20328a, 4);
            } else if (!(abstractC6224C instanceof C6248v)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$45 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$45", m20656f = "ConversationViewModel.kt", m20657l = {825}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/e0;", "conversationDetails", "Lmm/C;", "<anonymous>", "(Lzi/e0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229845 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37693Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37694Z;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$45$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21999e0 f37697Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C21999e0 c21999e0) {
                super(1);
                this.f37697Y = c21999e0;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C19863N update = (C19863N) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C19863N.m20780a(update, null, false, null, null, false, null, null, this.f37697Y, 127);
            }
        }

        public C1229845(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1229845 c1229845 = ConversationViewModelImpl.this.new C1229845(interfaceC18770c);
            c1229845.f37694Z = obj;
            return c1229845;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1229845) create((C21999e0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C21999e0 c21999e0;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37693Y;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C21999e0 c21999e1 = (C21999e0) this.f37694Z;
                this.f37694Z = c21999e1;
                this.f37693Y = 1;
                if (ConversationViewModelImpl.m14255r(conversationViewModelImpl, c21999e1, this) == enumC19250a) {
                    return enumC19250a;
                }
                c21999e0 = c21999e1;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21999e0 = (C21999e0) this.f37694Z;
                AbstractC9233X.m9807c(obj);
            }
            Iterable iterable = c21999e0.f69628a;
            List listM15497k = ((C14111x0) conversationViewModelImpl.m14391f()).m15497k();
            if (iterable == null) {
                iterable = C17689w.f56480Y;
            }
            conversationViewModelImpl.m14397m(new ConversationViewModelImpl$45$1$1(AbstractC17680n.m19361k0(iterable, listM15497k)));
            AbstractC8160o6.m8726a(conversationViewModelImpl.f37601z, "ConversationDetailsTag receive conversation_detail from SSE " + c21999e0, null, 6);
            conversationViewModelImpl.f37594s.m20781a(new AnonymousClass2(c21999e0));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46", m20656f = "ConversationViewModel.kt", m20657l = {836, 837, 839}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1229946 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37698Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37699Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C14053T0 f37700o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ ConversationViewModelImpl f37701p0;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46$1", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f37702Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f37702Y = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f37702Y);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f37703Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, true, -1, 4194303);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ ConversationViewModelImpl f37704Y;

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$46$3$1, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
            final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

                /* JADX INFO: renamed from: Y */
                public static final AnonymousClass1 f37705Y = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj) {
                    C14111x0 setState = (C14111x0) obj;
                    AbstractC16544l.m18094g(setState, "$this$setState");
                    return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -1, 4194303);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ConversationViewModelImpl conversationViewModelImpl) {
                super(1);
                this.f37704Y = conversationViewModelImpl;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                this.f37704Y.m14397m(AnonymousClass1.f37705Y);
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1229946(C14053T0 c14053t0, ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37700o0 = c14053t0;
            this.f37701p0 = conversationViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1229946 c1229946 = new C1229946(this.f37700o0, this.f37701p0, interfaceC18770c);
            c1229946.f37699Z = obj;
            return c1229946;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1229946) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0080 A[RETURN] */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0571F interfaceC0571F;
            long jM8644j;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37698Y;
            ConversationViewModelImpl conversationViewModelImpl = this.f37701p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC0571F = (InterfaceC0571F) this.f37699Z;
                    AbstractC9233X.m9807c(obj);
                } else if (i10 == 2) {
                    interfaceC0571F = (InterfaceC0571F) this.f37699Z;
                    AbstractC9233X.m9807c(obj);
                    conversationViewModelImpl.m14397m(AnonymousClass2.f37703Y);
                    C21554a c21554a = C21555b.f68260Z;
                    jM8644j = AbstractC8128k6.m8644j(7, EnumC21557d.SECONDS);
                    this.f37699Z = interfaceC0571F;
                    this.f37698Y = 3;
                    if (AbstractC0575H.m1185n(jM8644j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0571F = (InterfaceC0571F) this.f37699Z;
                    AbstractC9233X.m9807c(obj);
                }
                AbstractC9212T2.m9779c(interfaceC0571F, new AnonymousClass3(conversationViewModelImpl));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F2 = (InterfaceC0571F) this.f37699Z;
            C14053T0 c14053t0 = this.f37700o0;
            C14049R0 c14049r0 = new C14049R0(c14053t0.f44172Y.f41697b, c14053t0, 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.f37699Z = interfaceC0571F2;
            this.f37698Y = 1;
            if (AbstractC2124C.m3220s(c14049r0, anonymousClass1, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC0571F = interfaceC0571F2;
            C21554a c21554a2 = C21555b.f68260Z;
            long jM8644j2 = AbstractC8128k6.m8644j(2, EnumC21557d.SECONDS);
            this.f37699Z = interfaceC0571F;
            this.f37698Y = 2;
            if (AbstractC0575H.m1185n(jM8644j2, this) == enumC19250a) {
                return enumC19250a;
            }
            conversationViewModelImpl.m14397m(AnonymousClass2.f37703Y);
            C21554a c21554a3 = C21555b.f68260Z;
            jM8644j = AbstractC8128k6.m8644j(7, EnumC21557d.SECONDS);
            this.f37699Z = interfaceC0571F;
            this.f37698Y = 3;
            if (AbstractC0575H.m1185n(jM8644j, this) == enumC19250a) {
                return enumC19250a;
            }
            AbstractC9212T2.m9779c(interfaceC0571F, new AnonymousClass3(conversationViewModelImpl));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$6", m20656f = "ConversationViewModel.kt", m20657l = {552}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lmm/C;", "it", "Lzi/h0;", "<anonymous>", "(V)Lcom/openai/types/ConversationId;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123006 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37706Y;

        public C123006(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ConversationViewModelImpl.this.new C123006(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123006) create((C17296C) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37706Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C2604o c2604o = ConversationViewModelImpl.this.f37588m.f45521t;
                this.f37706Y = 1;
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
            String str = c6636i != null ? c6636i.f21380b : null;
            if (str != null) {
                return new C22011h0(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$7 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$7", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/h0;", "remoteId", "Lmm/C;", "<anonymous>", "(Lzi/h0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123017 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37708Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$7$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f37710Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C14111x0 setState = (C14111x0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, true, false, null, null, false, -1, 8380415);
            }
        }

        public C123017(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123017 c123017 = ConversationViewModelImpl.this.new C123017(interfaceC18770c);
            c123017.f37708Y = obj;
            return c123017;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C123017 c123017 = (C123017) create(new C22011h0(((C22011h0) obj).f69652a), (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c123017.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            String str = ((C22011h0) this.f37708Y).f69652a;
            ConversationViewModelImpl conversationViewModelImpl = ConversationViewModelImpl.this;
            conversationViewModelImpl.f37598w.mo21447a(C20887f.f66538m, AbstractC17660E.m19258c(new C17309l("conversation_id", str)));
            int iOrdinal = ((EnumC13945h2) conversationViewModelImpl.f37586k.m15479a(C13941g2.f43991f)).ordinal();
            if (iOrdinal == 1) {
                conversationViewModelImpl.m14397m(AnonymousClass1.f37710Y);
            } else if (iOrdinal == 2) {
                ConversationViewModelImpl.m14253p(conversationViewModelImpl, str, EnumC20898q.f66614o0);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$8 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lte/N;", "inputState", "invoke", "(Lge/x0;Lte/N;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123028 extends AbstractC16546n implements InterfaceC1439n {
        public C123028() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            C19863N inputState = (C19863N) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(inputState, "inputState");
            List<C18985l> list = setOnEach.f44391V;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (C18985l c18985l : list) {
                List listM10642a = AbstractC10003y4.m10642a(ConversationViewModelImpl.this.f37587l, inputState.f62954a.f19682a.f10934Y, c18985l.f60554a);
                String oneliner = c18985l.f60554a;
                AbstractC16544l.m18094g(oneliner, "oneliner");
                String fullPrompt = c18985l.f60555b;
                AbstractC16544l.m18094g(fullPrompt, "fullPrompt");
                arrayList.add(new C18985l(oneliner, fullPrompt, listM10642a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((C18985l) obj3).f60556c.isEmpty()) {
                    arrayList2.add(obj3);
                }
            }
            return C14111x0.m15491e(setOnEach, null, null, null, null, null, null, null, inputState, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, arrayList2, null, false, -1025, 8355839);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$9 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/x0;", "Lye/f;", "it", "invoke", "(Lge/x0;Lye/f;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123039 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123039 f37712Y = new C123039();

        public C123039() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14111x0 setOnEach = (C14111x0) obj;
            EnumC21517f it = (EnumC21517f) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C14111x0.m15491e(setOnEach, null, null, null, null, it, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, -129, 8388607);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x0264  */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:108:0x026e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0275  */
    /* JADX WARN: Code duplicated, block: B:112:0x0278  */
    /* JADX WARN: Code duplicated, block: B:115:0x034c  */
    /* JADX WARN: Code duplicated, block: B:117:0x035d  */
    /* JADX WARN: Code duplicated, block: B:120:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:123:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x0549  */
    /* JADX WARN: Code duplicated, block: B:132:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0102  */
    /* JADX WARN: Code duplicated, block: B:29:0x015b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0162  */
    /* JADX WARN: Code duplicated, block: B:35:0x018b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0198  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x01af  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0203  */
    /* JADX WARN: Code duplicated, block: B:68:0x0206  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0215  */
    /* JADX WARN: Code duplicated, block: B:76:0x0218  */
    /* JADX WARN: Code duplicated, block: B:79:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0221  */
    /* JADX WARN: Code duplicated, block: B:83:0x0227  */
    /* JADX WARN: Code duplicated, block: B:84:0x022a  */
    /* JADX WARN: Code duplicated, block: B:87:0x023a  */
    /* JADX WARN: Code duplicated, block: B:88:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0243  */
    /* JADX WARN: Code duplicated, block: B:92:0x0246  */
    /* JADX WARN: Code duplicated, block: B:95:0x024d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0250  */
    /* JADX WARN: Code duplicated, block: B:99:0x0257  */
    public ConversationViewModelImpl(C15000g c15000g, C11082S c11082s, InterfaceC13849E interfaceC13849E, C13993t2 c13993t2, C13969n2 c13969n2, C14018B0 c14018b0, C20592p c20592p, C6183j c6183j, C17600b c17600b, C16382j c16382j, C9504c c9504c, InterfaceC3721c interfaceC3721c, C18412b c18412b, C14459O c14459o, C18089N c18089n, C13132J c13132j, C13141T c13141t, C17627a c17627a, RootViewModel rootViewModel, C13133K c13133k, C19864O c19864o, C9473F c9473f, C2790T0 c2790t0, C14968g c14968g, InterfaceC20904w interfaceC20904w, AbstractC21864z abstractC21864z, C11434h c11434h, C21539c c21539c, C18092Q c18092q, C4666u c4666u, C11345b c11345b, C18418a c18418a, C3708d c3708d, C7132c c7132c, C3332T c3332t, C14053T0 c14053t0) {
        InterfaceC2184i interfaceC2184i;
        boolean z6;
        boolean zM15481a;
        boolean z10;
        C14005w2 c14005w2;
        boolean zM15481a2;
        C14061X0 c14061x0;
        String str;
        boolean zM15481a3;
        boolean zM15481a4;
        boolean z11;
        boolean zM15481a5;
        boolean zM15481a6;
        boolean zM15481a7;
        boolean zM15481a8;
        boolean zM15481a9;
        boolean zM15481a10;
        boolean zM15481a11;
        boolean zBooleanValue;
        boolean z12;
        C19863N c19863n;
        boolean z13;
        boolean z14;
        boolean z15;
        C14076g c14076g;
        C14061X0 c14061x1;
        boolean z16;
        String str2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        List list;
        C17689w c17689w;
        C5370J0 c5370j0;
        Set set;
        C21891A c21891a = c18418a.f58774b;
        C22013h2 c22013h2 = c21891a.f69416b;
        C22038o c22038o = c21891a.f69415a;
        C14076g c14076g2 = new C14076g((c22038o == null || (set = c22038o.f69717g) == null) ? false : set.contains(EnumC22026l.ChatPreferencesAvailable), 30);
        C6852i c6852i = c11345b.f34301c;
        String str3 = ((C22011h0) c6852i.getValue()).f69652a;
        C5431w.f17746g.getClass();
        String key = C5431w.f17749j.f17614a;
        C22013h2 c22013h3 = c22013h2;
        AbstractC16544l.m18094g(key, "key");
        boolean z29 = !c11082s.f33411a.containsKey(key);
        boolean zBooleanValue2 = ((Boolean) C5431w.f17754o.m5892c(c11082s)).booleanValue();
        boolean z30 = z29;
        C2217y0 c2217y0 = ((C6687b) interfaceC3721c).f21507g;
        C4676c c4676c = (C4676c) c2217y0.f6797Y.getValue();
        if (!((Boolean) c13993t2.m15479a(C13961l2.f44014d)).booleanValue()) {
            interfaceC2184i = c2217y0;
            if (!((C14005w2) interfaceC13849E).m15481a(C13872L1.f43910c)) {
                z6 = false;
            }
            if (c18418a.f58779g) {
                zM15481a = c15000g.m16135b(EnumC22026l.WorkspaceShareLinks, C13944h1.f43994c);
            } else {
                zM15481a = ((C14005w2) interfaceC13849E).m15481a(C13944h1.f43994c);
            }
            z10 = zM15481a;
            c14005w2 = (C14005w2) interfaceC13849E;
            zM15481a2 = c14005w2.m15481a(C13983r0.f44043c);
            EnumC22026l enumC22026l = EnumC22026l.AdvancedVoice;
            C13861I c13861i = C13861I.f43899c;
            c14061x0 = new C14061X0(c15000g.m16135b(enumC22026l, c13861i), 11);
            str = (String) c13969n2.m15477a(C13950j.f44005d);
            zM15481a3 = c14005w2.m15481a(C13987s0.f44051c);
            zM15481a4 = c14005w2.m15481a(C14000v1.f44073c);
            if (!c14005w2.m15481a(C13952j1.f44006c) || c14005w2.m15481a(C13959l0.f44012c)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zM15481a5 = c14005w2.m15481a(C13960l1.f44013c);
            zM15481a6 = c14005w2.m15481a(C13956k1.f44010c);
            zM15481a7 = c14005w2.m15481a(C13875M1.f43913c);
            zM15481a8 = c14005w2.m15481a(C13975p0.f44033c);
            C18422e c18422e = c18418a.f58773a;
            zM15481a9 = c14005w2.m15481a(C13847D0.f43885c);
            zM15481a10 = c14005w2.m15481a(C14013z0.f44094c);
            zM15481a11 = c14005w2.m15481a(C13893T.f43942c);
            zBooleanValue = ((Boolean) c13993t2.m15479a(C13898U1.f43947d)).booleanValue();
            z12 = c18422e.f58783b;
            z30 = ((-453099552) & 1) != 0 ? true : z30;
            c22013h3 = ((-453099552) & 2) != 0 ? null : c22013h3;
            C20909b c20909b = new C20909b(null, null, null, null, 31);
            C20908a c20908a = new C20908a(null, 31);
            EnumC21517f enumC21517f = EnumC21517f.f68138Z;
            C17689w c17689w2 = C17689w.f56480Y;
            if (((-453099552) & 1024) != 0) {
                c19863n = new C19863N(null, null, null, 255);
            } else {
                c19863n = null;
            }
            if (((-453099552) & 16384) != 0) {
                z13 = false;
            } else {
                z13 = z6;
            }
            if ((32768 & (-453099552)) != 0) {
                z14 = false;
            } else {
                z14 = zM15481a11;
            }
            if ((65536 & (-453099552)) != 0) {
                z15 = false;
            } else {
                z15 = z10;
            }
            EnumC14097q0 enumC14097q0 = EnumC14097q0.f44336Z;
            if ((16777216 & (-453099552)) != 0) {
                c14076g = new C14076g(false, 31);
            } else {
                c14076g = c14076g2;
            }
            if ((33554432 & (-453099552)) != 0) {
                c14061x1 = new C14061X0(false, 15);
            } else {
                c14061x1 = c14061x0;
            }
            if ((134217728 & (-453099552)) != 0) {
                z16 = false;
            } else {
                z16 = zM15481a2;
            }
            if ((268435456 & (-453099552)) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((4321838 & 1) != 0) {
                z17 = false;
            } else {
                z17 = zM15481a3;
            }
            if ((4321838 & 16) != 0) {
                z18 = false;
            } else {
                z18 = zBooleanValue2;
            }
            if ((4321838 & 64) != 0) {
                z19 = false;
            } else {
                z19 = zM15481a4;
            }
            if ((4321838 & 128) != 0) {
                z20 = false;
            } else {
                z20 = zM15481a8;
            }
            if ((4321838 & 256) != 0) {
                z21 = false;
            } else {
                z21 = z12;
            }
            C9436E c9436e = new C9436E(3, (Set) null);
            if ((4321838 & 1024) != 0) {
                z22 = false;
            } else {
                z22 = zM15481a9;
            }
            if ((4321838 & 2048) != 0) {
                z23 = false;
            } else {
                z23 = zM15481a10;
            }
            if ((131072 & 4321838) != 0) {
                z24 = false;
            } else {
                z24 = z11;
            }
            if ((262144 & 4321838) != 0) {
                z25 = false;
            } else {
                z25 = zM15481a5;
            }
            if ((524288 & 4321838) != 0) {
                z26 = false;
            } else {
                z26 = zM15481a6;
            }
            if ((1048576 & 4321838) != 0) {
                z27 = false;
            } else {
                z27 = zM15481a7;
            }
            if ((4321838 & 2097152) != 0) {
                z28 = false;
            } else {
                z28 = zBooleanValue;
            }
            InterfaceC2184i interfaceC2184i2 = interfaceC2184i;
            super(new C14111x0(z30, c22013h3, c18418a, c4676c, str3, c20909b, c20908a, enumC21517f, null, c17689w2, c19863n, null, c17689w2, false, z13, z14, z15, false, null, false, false, false, null, enumC14097q0, c14076g, c14061x1, false, z16, str2, false, null, null, z17, false, null, null, z18, null, z19, z20, z21, c9436e, z22, z23, null, false, false, c17689w2, null, z24, z25, z26, z27, z28, false));
            this.f37584i = c15000g;
            this.f37585j = interfaceC13849E;
            this.f37586k = c13993t2;
            this.f37587l = c18412b;
            this.f37588m = c14459o;
            this.f37589n = c18089n;
            this.f37590o = c13141t;
            this.f37591p = c17627a;
            this.f37592q = rootViewModel;
            this.f37593r = c13133k;
            this.f37594s = c19864o;
            this.f37595t = c9473f;
            this.f37596u = c2790t0;
            this.f37597v = c14968g;
            this.f37598w = interfaceC20904w;
            this.f37599x = abstractC21864z;
            this.f37600y = c11434h;
            C3430e c3430eM8749b = AbstractC8168p6.m8749b("ConversationViewModel", null);
            this.f37601z = c3430eM8749b;
            AbstractC8160o6.m8726a(c3430eM8749b, "Starting new ConversationViewModel", null, 6);
            if (((C14111x0) this.f40343c.getValue()).f44396a) {
                final C2604o c2604oM3227z = AbstractC2124C.m3227z(new C122823(null), new C2146N(AbstractC9206S2.m9771b(new C122712(2, null), c17600b.f56349b), 2));
                m14396l(C122924.f37681Y, new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2 */
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class C123112<T> implements InterfaceC2186j {

                        /* JADX INFO: renamed from: Y */
                        public final /* synthetic */ InterfaceC2186j f37806Y;

                        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        public final class AnonymousClass1 extends AbstractC19687c {

                            /* JADX INFO: renamed from: Y */
                            public /* synthetic */ Object f37807Y;

                            /* JADX INFO: renamed from: Z */
                            public int f37808Z;

                            public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                                super(interfaceC18770c);
                            }

                            @Override // sm.AbstractC19685a
                            public final Object invokeSuspend(Object obj) {
                                this.f37807Y = obj;
                                this.f37808Z |= Integer.MIN_VALUE;
                                return C123112.this.mo395a(null, this);
                            }
                        }

                        public C123112(InterfaceC2186j interfaceC2186j) {
                            this.f37806Y = interfaceC2186j;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // p103Dn.InterfaceC2186j
                        /* JADX INFO: renamed from: a */
                        public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC18770c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                                int i10 = anonymousClass1.f37808Z;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f37808Z = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                            Object obj2 = anonymousClass1.f37807Y;
                            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                            int i11 = anonymousClass1.f37808Z;
                            if (i11 == 0) {
                                AbstractC9233X.m9807c(obj2);
                                if (obj instanceof C21952P1) {
                                    anonymousClass1.f37808Z = 1;
                                    if (this.f37806Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                        return enumC19250a;
                                    }
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
                        Object objMo3141d = c2604oM3227z.mo3141d(new C123112(interfaceC2186j), interfaceC18770c);
                        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                    }
                });
            } else {
                AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C122601(c11082s, c9504c, this, null), 3);
            }
            final C2127D0 c2127d0 = c21539c.f68225d;
            AbstractC2124C.m3226y(new C1970n(new C2146N(AbstractC2124C.m3227z(new C123006(null), new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C123092<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f37795Y;

                    /* JADX INFO: renamed from: Z */
                    public final /* synthetic */ ConversationViewModelImpl f37796Z;

                    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f37797Y;

                        /* JADX INFO: renamed from: Z */
                        public int f37798Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f37797Y = obj;
                            this.f37798Z |= Integer.MIN_VALUE;
                            return C123092.this.mo395a(null, this);
                        }
                    }

                    public C123092(InterfaceC2186j interfaceC2186j, ConversationViewModelImpl conversationViewModelImpl) {
                        this.f37795Y = interfaceC2186j;
                        this.f37796Z = conversationViewModelImpl;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f37798Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f37798Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f37797Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f37798Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            if (((C14111x0) this.f37796Z.m14391f()).f44428q) {
                                anonymousClass1.f37798Z = 1;
                                if (this.f37795Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                    return enumC19250a;
                                }
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
                    c2127d0.mo3141d(new C123092(interfaceC2186j, this), interfaceC18770c);
                    return EnumC19250a.f61036Y;
                }
            }), 2), 5, new C123017(null)), ViewModelKt.m12143a(this));
            m14396l(new C123028(), c19864o.f62964c);
            list = (List) C5431w.f17759t.m5892c(c11082s);
            c17689w = C17689w.f56480Y;
            if ((list == null ? c17689w : list).contains(EnumC5425t.Search)) {
                c18092q.m19711b(EnumC21517f.f68139o0);
            }
            m14396l(C123039.f37712Y, c18092q.f57723b);
            m14396l(C1226110.f37607Y, interfaceC2184i2);
            m14396l(C1226211.f37608Y, c13132j.f41695r0);
            m14396l(C1226312.f37609Y, c17600b.f56349b);
            m14396l(new C1226413(), c16382j.f50876c);
            AbstractC2124C.m3226y(new C1970n(c16382j.f50878e, 5, new C1226514(null)), ViewModelKt.m12143a(this));
            AbstractC2124C.m3226y(new C2207t0(c13133k.f41697b, new C1970n(this.f37590o.f41721d, 21, EnumC1702g.AdvancedVoice), new C1226615(null), 0), ViewModelKt.m12143a(this));
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1226716(null), 3);
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1226817(null), 3);
            C14968g c14968g2 = this.f37597v;
            AbstractC2124C.m3226y(new C1970n(new C14966e(c14968g2.f46620Z.f64176f, c14968g2, 0), 5, new C1226918(null)), ViewModelKt.m12143a(this));
            m14396l(C1227019.f37630Y, this.f37584i.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
            m14396l(C1227220.f37632Y, this.f37584i.m16134a(enumC22026l, c13861i));
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227321(null), 3);
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227422(null), 3);
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227523(null), 3);
            if (((C14005w2) this.f37585j).m15481a(C13894T0.f43943c)) {
                AbstractC2124C.m3226y(new C1970n(AbstractC9206S2.m9771b(new C1227624(2, null), this.f37588m.f45526y), 5, new C1227725(c7132c, this, null)), ViewModelKt.m12143a(this));
            }
            AbstractC2124C.m3226y(new C1970n(this.f37588m.f45526y, 5, new C1227826(null)), ViewModelKt.m12143a(this));
            C14459O conversationCoordinator = this.f37588m;
            C18621a c18621aM12143a = ViewModelKt.m12143a(this);
            AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
            C11248s c11248s = c14018b0.f44101a;
            Object obj = ((InterfaceC17068a) c11248s.f34081Z).get();
            AbstractC16544l.m18093f(obj, "get(...)");
            Object obj2 = ((C4474e) c11248s.f34082o0).f14617a;
            AbstractC16544l.m18093f(obj2, "get(...)");
            new C21585H(conversationCoordinator, c18621aM12143a, (InterfaceC10277b) obj, (Application) obj2);
            m14396l(C1227927.f37654Y, c6852i);
            AbstractC2124C.m3226y(new C2207t0(new C2146N(this.f37588m.f45521t, 2), c20592p.f65348r0, new C1228028(null), 0), ViewModelKt.m12143a(this));
            if (((C14005w2) this.f37585j).m15481a(C13988s1.f44052c)) {
                C14459O conversationCoordinator2 = this.f37588m;
                C18621a c18621aM12143a2 = ViewModelKt.m12143a(this);
                AbstractC16544l.m18094g(conversationCoordinator2, "conversationCoordinator");
                C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C6175b(c17689w));
                AbstractC2124C.m3226y(AbstractC2124C.m3227z(new C6182i(c6183j, c2153q0M3204c, null), new C6179f(new C1970n(AbstractC2124C.m3215n(new C2025h(new C6177d(conversationCoordinator2.f45526y, 0), 7)), 5, new C6181h(c2153q0M3204c, null)), 0)), c18621aM12143a2);
                AbstractC2124C.m3226y(new C1970n(c2153q0M3204c, 5, new C1228129(null)), ViewModelKt.m12143a(this));
            }
            if (((C14005w2) this.f37585j).m15481a(C13935f0.f43985c)) {
                C1228330 c1228330 = new C1228330();
                AbstractC8160o6.m8728c(c4666u.f15200f, "Binding interceptClientSideCommands", null, null, 6);
                AbstractC2124C.m3226y(new C1970n(new C2207t0(c4666u.m5378c(), c4666u, c1228330), 5, new C1228431(null)), ViewModelKt.m12143a(this));
            }
            m14396l(C1228532.f37671Y, this.f37596u.f8514b);
            c5370j0 = C5431w.f17758s;
            if (((EnumC5421r) c5370j0.m5892c(c11082s)) == EnumC5421r.f17710Z) {
                m14394i(new C1228633(null));
            }
            if (((EnumC5421r) c5370j0.m5892c(c11082s)) == EnumC5421r.f17713q0) {
                this.f37598w.mo21447a(C20855A.f66298d, C17690x.f56481Y);
                m14397m(ConversationViewModelImpl$activateWhisper$1.f37713Y);
            }
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1228734(null), 3);
            final InterfaceC2184i interfaceC2184iM9771b = AbstractC9206S2.m9771b(new C1228835(2, null), this.f37588m.f45521t);
            AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C123102<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f37801Y;

                    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f37802Y;

                        /* JADX INFO: renamed from: Z */
                        public int f37803Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f37802Y = obj;
                            this.f37803Z |= Integer.MIN_VALUE;
                            return C123102.this.mo395a(null, this);
                        }
                    }

                    public C123102(InterfaceC2186j interfaceC2186j) {
                        this.f37801Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f37803Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f37803Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f37802Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f37803Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            if (((Boolean) obj).booleanValue()) {
                                anonymousClass1.f37803Z = 1;
                                if (this.f37801Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                    return enumC19250a;
                                }
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
                    Object objMo3141d = interfaceC2184iM9771b.mo3141d(new C123102(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            }, 5, new C1228937(null)), ViewModelKt.m12143a(this));
            m14396l(C1229139.f37680Y, AbstractC9206S2.m9771b(new C1229038(2, null), c3332t.f10182a));
            AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3216o(this.f40343c, C1229340.f37682Y, AbstractC2124C.f6495b), 5, new C1229441(null)), ViewModelKt.m12143a(this));
            m14396l(C1229643.f37686Y, AbstractC9206S2.m9771b(new C1229542(2, null), c3708d.f11251f));
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1229744(null), 3);
            AbstractC2124C.m3226y(new C1970n(new C2146N(this.f37588m.f45523v, 2), 5, new C1229845(null)), ViewModelKt.m12143a(this));
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1229946(c14053t0, this, null), 3);
        }
        interfaceC2184i = c2217y0;
        z6 = true;
        if (c18418a.f58779g) {
            zM15481a = c15000g.m16135b(EnumC22026l.WorkspaceShareLinks, C13944h1.f43994c);
        } else {
            zM15481a = ((C14005w2) interfaceC13849E).m15481a(C13944h1.f43994c);
        }
        z10 = zM15481a;
        c14005w2 = (C14005w2) interfaceC13849E;
        zM15481a2 = c14005w2.m15481a(C13983r0.f44043c);
        EnumC22026l enumC22026l2 = EnumC22026l.AdvancedVoice;
        C13861I c13861i2 = C13861I.f43899c;
        c14061x0 = new C14061X0(c15000g.m16135b(enumC22026l2, c13861i2), 11);
        str = (String) c13969n2.m15477a(C13950j.f44005d);
        zM15481a3 = c14005w2.m15481a(C13987s0.f44051c);
        zM15481a4 = c14005w2.m15481a(C14000v1.f44073c);
        if (c14005w2.m15481a(C13952j1.f44006c)) {
            z11 = true;
        } else {
            z11 = true;
        }
        zM15481a5 = c14005w2.m15481a(C13960l1.f44013c);
        zM15481a6 = c14005w2.m15481a(C13956k1.f44010c);
        zM15481a7 = c14005w2.m15481a(C13875M1.f43913c);
        zM15481a8 = c14005w2.m15481a(C13975p0.f44033c);
        C18422e c18422e2 = c18418a.f58773a;
        zM15481a9 = c14005w2.m15481a(C13847D0.f43885c);
        zM15481a10 = c14005w2.m15481a(C14013z0.f44094c);
        zM15481a11 = c14005w2.m15481a(C13893T.f43942c);
        zBooleanValue = ((Boolean) c13993t2.m15479a(C13898U1.f43947d)).booleanValue();
        z12 = c18422e2.f58783b;
        if (((-453099552) & 1) != 0) {
        }
        if (((-453099552) & 2) != 0) {
        }
        C20909b c20909b2 = new C20909b(null, null, null, null, 31);
        C20908a c20908a2 = new C20908a(null, 31);
        EnumC21517f enumC21517f2 = EnumC21517f.f68138Z;
        C17689w c17689w3 = C17689w.f56480Y;
        if (((-453099552) & 1024) != 0) {
            c19863n = new C19863N(null, null, null, 255);
        } else {
            c19863n = null;
        }
        if (((-453099552) & 16384) != 0) {
            z13 = false;
        } else {
            z13 = z6;
        }
        if ((32768 & (-453099552)) != 0) {
            z14 = false;
        } else {
            z14 = zM15481a11;
        }
        if ((65536 & (-453099552)) != 0) {
            z15 = false;
        } else {
            z15 = z10;
        }
        EnumC14097q0 enumC14097q1 = EnumC14097q0.f44336Z;
        if ((16777216 & (-453099552)) != 0) {
            c14076g = new C14076g(false, 31);
        } else {
            c14076g = c14076g2;
        }
        if ((33554432 & (-453099552)) != 0) {
            c14061x1 = new C14061X0(false, 15);
        } else {
            c14061x1 = c14061x0;
        }
        if ((134217728 & (-453099552)) != 0) {
            z16 = false;
        } else {
            z16 = zM15481a2;
        }
        if ((268435456 & (-453099552)) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((4321838 & 1) != 0) {
            z17 = false;
        } else {
            z17 = zM15481a3;
        }
        if ((4321838 & 16) != 0) {
            z18 = false;
        } else {
            z18 = zBooleanValue2;
        }
        if ((4321838 & 64) != 0) {
            z19 = false;
        } else {
            z19 = zM15481a4;
        }
        if ((4321838 & 128) != 0) {
            z20 = false;
        } else {
            z20 = zM15481a8;
        }
        if ((4321838 & 256) != 0) {
            z21 = false;
        } else {
            z21 = z12;
        }
        C9436E c9436e2 = new C9436E(3, (Set) null);
        if ((4321838 & 1024) != 0) {
            z22 = false;
        } else {
            z22 = zM15481a9;
        }
        if ((4321838 & 2048) != 0) {
            z23 = false;
        } else {
            z23 = zM15481a10;
        }
        if ((131072 & 4321838) != 0) {
            z24 = false;
        } else {
            z24 = z11;
        }
        if ((262144 & 4321838) != 0) {
            z25 = false;
        } else {
            z25 = zM15481a5;
        }
        if ((524288 & 4321838) != 0) {
            z26 = false;
        } else {
            z26 = zM15481a6;
        }
        if ((1048576 & 4321838) != 0) {
            z27 = false;
        } else {
            z27 = zM15481a7;
        }
        if ((4321838 & 2097152) != 0) {
            z28 = false;
        } else {
            z28 = zBooleanValue;
        }
        InterfaceC2184i interfaceC2184i3 = interfaceC2184i;
        super(new C14111x0(z30, c22013h3, c18418a, c4676c, str3, c20909b2, c20908a2, enumC21517f2, null, c17689w3, c19863n, null, c17689w3, false, z13, z14, z15, false, null, false, false, false, null, enumC14097q1, c14076g, c14061x1, false, z16, str2, false, null, null, z17, false, null, null, z18, null, z19, z20, z21, c9436e2, z22, z23, null, false, false, c17689w3, null, z24, z25, z26, z27, z28, false));
        this.f37584i = c15000g;
        this.f37585j = interfaceC13849E;
        this.f37586k = c13993t2;
        this.f37587l = c18412b;
        this.f37588m = c14459o;
        this.f37589n = c18089n;
        this.f37590o = c13141t;
        this.f37591p = c17627a;
        this.f37592q = rootViewModel;
        this.f37593r = c13133k;
        this.f37594s = c19864o;
        this.f37595t = c9473f;
        this.f37596u = c2790t0;
        this.f37597v = c14968g;
        this.f37598w = interfaceC20904w;
        this.f37599x = abstractC21864z;
        this.f37600y = c11434h;
        C3430e c3430eM8749b2 = AbstractC8168p6.m8749b("ConversationViewModel", null);
        this.f37601z = c3430eM8749b2;
        AbstractC8160o6.m8726a(c3430eM8749b2, "Starting new ConversationViewModel", null, 6);
        if (((C14111x0) this.f40343c.getValue()).f44396a) {
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C122601(c11082s, c9504c, this, null), 3);
        } else {
            final C2604o c2604oM3227z2 = AbstractC2124C.m3227z(new C122823(null), new C2146N(AbstractC9206S2.m9771b(new C122712(2, null), c17600b.f56349b), 2));
            m14396l(C122924.f37681Y, new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C123112<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f37806Y;

                    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filterIsInstance$1$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f37807Y;

                        /* JADX INFO: renamed from: Z */
                        public int f37808Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f37807Y = obj;
                            this.f37808Z |= Integer.MIN_VALUE;
                            return C123112.this.mo395a(null, this);
                        }
                    }

                    public C123112(InterfaceC2186j interfaceC2186j) {
                        this.f37806Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f37808Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f37808Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f37807Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f37808Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            if (obj instanceof C21952P1) {
                                anonymousClass1.f37808Z = 1;
                                if (this.f37806Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                    return enumC19250a;
                                }
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
                    Object objMo3141d = c2604oM3227z2.mo3141d(new C123112(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            });
        }
        final C2127D0 c2127d1 = c21539c.f68225d;
        AbstractC2124C.m3226y(new C1970n(new C2146N(AbstractC2124C.m3227z(new C123006(null), new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123092<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37795Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ ConversationViewModelImpl f37796Z;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$1$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37797Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37798Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37797Y = obj;
                        this.f37798Z |= Integer.MIN_VALUE;
                        return C123092.this.mo395a(null, this);
                    }
                }

                public C123092(InterfaceC2186j interfaceC2186j, ConversationViewModelImpl conversationViewModelImpl) {
                    this.f37795Y = interfaceC2186j;
                    this.f37796Z = conversationViewModelImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37798Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37798Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37797Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37798Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (((C14111x0) this.f37796Z.m14391f()).f44428q) {
                            anonymousClass1.f37798Z = 1;
                            if (this.f37795Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
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
                c2127d1.mo3141d(new C123092(interfaceC2186j, this), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }), 2), 5, new C123017(null)), ViewModelKt.m12143a(this));
        m14396l(new C123028(), c19864o.f62964c);
        list = (List) C5431w.f17759t.m5892c(c11082s);
        c17689w = C17689w.f56480Y;
        if ((list == null ? c17689w : list).contains(EnumC5425t.Search)) {
            c18092q.m19711b(EnumC21517f.f68139o0);
        }
        m14396l(C123039.f37712Y, c18092q.f57723b);
        m14396l(C1226110.f37607Y, interfaceC2184i3);
        m14396l(C1226211.f37608Y, c13132j.f41695r0);
        m14396l(C1226312.f37609Y, c17600b.f56349b);
        m14396l(new C1226413(), c16382j.f50876c);
        AbstractC2124C.m3226y(new C1970n(c16382j.f50878e, 5, new C1226514(null)), ViewModelKt.m12143a(this));
        AbstractC2124C.m3226y(new C2207t0(c13133k.f41697b, new C1970n(this.f37590o.f41721d, 21, EnumC1702g.AdvancedVoice), new C1226615(null), 0), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1226716(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1226817(null), 3);
        C14968g c14968g3 = this.f37597v;
        AbstractC2124C.m3226y(new C1970n(new C14966e(c14968g3.f46620Z.f64176f, c14968g3, 0), 5, new C1226918(null)), ViewModelKt.m12143a(this));
        m14396l(C1227019.f37630Y, this.f37584i.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
        m14396l(C1227220.f37632Y, this.f37584i.m16134a(enumC22026l2, c13861i2));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227321(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227422(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1227523(null), 3);
        if (((C14005w2) this.f37585j).m15481a(C13894T0.f43943c)) {
            AbstractC2124C.m3226y(new C1970n(AbstractC9206S2.m9771b(new C1227624(2, null), this.f37588m.f45526y), 5, new C1227725(c7132c, this, null)), ViewModelKt.m12143a(this));
        }
        AbstractC2124C.m3226y(new C1970n(this.f37588m.f45526y, 5, new C1227826(null)), ViewModelKt.m12143a(this));
        C14459O conversationCoordinator3 = this.f37588m;
        C18621a c18621aM12143a3 = ViewModelKt.m12143a(this);
        AbstractC16544l.m18094g(conversationCoordinator3, "conversationCoordinator");
        C11248s c11248s2 = c14018b0.f44101a;
        Object obj3 = ((InterfaceC17068a) c11248s2.f34081Z).get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        Object obj4 = ((C4474e) c11248s2.f34082o0).f14617a;
        AbstractC16544l.m18093f(obj4, "get(...)");
        new C21585H(conversationCoordinator3, c18621aM12143a3, (InterfaceC10277b) obj3, (Application) obj4);
        m14396l(C1227927.f37654Y, c6852i);
        AbstractC2124C.m3226y(new C2207t0(new C2146N(this.f37588m.f45521t, 2), c20592p.f65348r0, new C1228028(null), 0), ViewModelKt.m12143a(this));
        if (((C14005w2) this.f37585j).m15481a(C13988s1.f44052c)) {
            C14459O conversationCoordinator4 = this.f37588m;
            C18621a c18621aM12143a4 = ViewModelKt.m12143a(this);
            AbstractC16544l.m18094g(conversationCoordinator4, "conversationCoordinator");
            C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(new C6175b(c17689w));
            AbstractC2124C.m3226y(AbstractC2124C.m3227z(new C6182i(c6183j, c2153q0M3204c2, null), new C6179f(new C1970n(AbstractC2124C.m3215n(new C2025h(new C6177d(conversationCoordinator4.f45526y, 0), 7)), 5, new C6181h(c2153q0M3204c2, null)), 0)), c18621aM12143a4);
            AbstractC2124C.m3226y(new C1970n(c2153q0M3204c2, 5, new C1228129(null)), ViewModelKt.m12143a(this));
        }
        if (((C14005w2) this.f37585j).m15481a(C13935f0.f43985c)) {
            C1228330 c1228331 = new C1228330();
            AbstractC8160o6.m8728c(c4666u.f15200f, "Binding interceptClientSideCommands", null, null, 6);
            AbstractC2124C.m3226y(new C1970n(new C2207t0(c4666u.m5378c(), c4666u, c1228331), 5, new C1228431(null)), ViewModelKt.m12143a(this));
        }
        m14396l(C1228532.f37671Y, this.f37596u.f8514b);
        c5370j0 = C5431w.f17758s;
        if (((EnumC5421r) c5370j0.m5892c(c11082s)) == EnumC5421r.f17710Z) {
            m14394i(new C1228633(null));
        }
        if (((EnumC5421r) c5370j0.m5892c(c11082s)) == EnumC5421r.f17713q0) {
            this.f37598w.mo21447a(C20855A.f66298d, C17690x.f56481Y);
            m14397m(ConversationViewModelImpl$activateWhisper$1.f37713Y);
        }
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1228734(null), 3);
        final InterfaceC2184i interfaceC2184iM9771b2 = AbstractC9206S2.m9771b(new C1228835(2, null), this.f37588m.f45521t);
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123102<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37801Y;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$special$$inlined$filter$2$2", m20656f = "ConversationViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37802Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37803Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37802Y = obj;
                        this.f37803Z |= Integer.MIN_VALUE;
                        return C123102.this.mo395a(null, this);
                    }
                }

                public C123102(InterfaceC2186j interfaceC2186j) {
                    this.f37801Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37803Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37803Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37802Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37803Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.f37803Z = 1;
                            if (this.f37801Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
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
                Object objMo3141d = interfaceC2184iM9771b2.mo3141d(new C123102(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, new C1228937(null)), ViewModelKt.m12143a(this));
        m14396l(C1229139.f37680Y, AbstractC9206S2.m9771b(new C1229038(2, null), c3332t.f10182a));
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3216o(this.f40343c, C1229340.f37682Y, AbstractC2124C.f6495b), 5, new C1229441(null)), ViewModelKt.m12143a(this));
        m14396l(C1229643.f37686Y, AbstractC9206S2.m9771b(new C1229542(2, null), c3708d.f11251f));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1229744(null), 3);
        AbstractC2124C.m3226y(new C1970n(new C2146N(this.f37588m.f45523v, 2), 5, new C1229845(null)), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C1229946(c14053t0, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14251n(ConversationViewModelImpl conversationViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        ConversationViewModelImpl$pinGizmo$1 conversationViewModelImpl$pinGizmo$1;
        conversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationViewModelImpl$pinGizmo$1) {
            conversationViewModelImpl$pinGizmo$1 = (ConversationViewModelImpl$pinGizmo$1) abstractC19687c;
            int i10 = conversationViewModelImpl$pinGizmo$1.f37780p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationViewModelImpl$pinGizmo$1.f37780p0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationViewModelImpl$pinGizmo$1 = new ConversationViewModelImpl$pinGizmo$1(conversationViewModelImpl, abstractC19687c);
            }
        } else {
            conversationViewModelImpl$pinGizmo$1 = new ConversationViewModelImpl$pinGizmo$1(conversationViewModelImpl, abstractC19687c);
        }
        Object objM10015n = conversationViewModelImpl$pinGizmo$1.f37778Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationViewModelImpl$pinGizmo$1.f37780p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10015n);
            conversationViewModelImpl.f37598w.mo21448b(C20893l.f66572j, str, C17690x.f56481Y);
            conversationViewModelImpl$pinGizmo$1.f37777Y = conversationViewModelImpl;
            conversationViewModelImpl$pinGizmo$1.f37780p0 = 1;
            objM10015n = conversationViewModelImpl.f37595t.m10015n(str, conversationViewModelImpl$pinGizmo$1);
            if (objM10015n == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversationViewModelImpl = conversationViewModelImpl$pinGizmo$1.f37777Y;
            AbstractC9233X.m9807c(objM10015n);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10015n;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14252o(ConversationViewModelImpl conversationViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        ConversationViewModelImpl$renameConversation$1 conversationViewModelImpl$renameConversation$1;
        conversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationViewModelImpl$renameConversation$1) {
            conversationViewModelImpl$renameConversation$1 = (ConversationViewModelImpl$renameConversation$1) abstractC19687c;
            int i10 = conversationViewModelImpl$renameConversation$1.f37784p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationViewModelImpl$renameConversation$1.f37784p0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationViewModelImpl$renameConversation$1 = new ConversationViewModelImpl$renameConversation$1(conversationViewModelImpl, abstractC19687c);
            }
        } else {
            conversationViewModelImpl$renameConversation$1 = new ConversationViewModelImpl$renameConversation$1(conversationViewModelImpl, abstractC19687c);
        }
        Object objM15992u = conversationViewModelImpl$renameConversation$1.f37782Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationViewModelImpl$renameConversation$1.f37784p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM15992u);
            conversationViewModelImpl.m14397m(ConversationViewModelImpl$renameConversation$2.f37785Y);
            conversationViewModelImpl$renameConversation$1.f37781Y = conversationViewModelImpl;
            conversationViewModelImpl$renameConversation$1.f37784p0 = 1;
            C14459O c14459o = conversationViewModelImpl.f37588m;
            c14459o.getClass();
            objM15992u = c14459o.m15992u(new C14457M(c14459o, str, null), conversationViewModelImpl$renameConversation$1);
            if (objM15992u == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversationViewModelImpl = conversationViewModelImpl$renameConversation$1.f37781Y;
            AbstractC9233X.m9807c(objM15992u);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM15992u;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        conversationViewModelImpl.m14397m(ConversationViewModelImpl$renameConversation$4.f37786Y);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m14253p(ConversationViewModelImpl conversationViewModelImpl, String conversationId, EnumC20898q enumC20898q) {
        conversationViewModelImpl.getClass();
        conversationViewModelImpl.f37598w.mo21447a(C20897p.f66609i, AbstractC0168G.m535x("entry_point", enumC20898q.name()));
        C5412m0 c5412m0 = C5412m0.f17690g;
        c5412m0.getClass();
        AbstractC16544l.m18094g(conversationId, "conversationId");
        conversationViewModelImpl.m14393h(new C2058g(c5412m0.m5885a(new C0491v(conversationId, 26)), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: q */
    public static final Object m14254q(ConversationViewModelImpl conversationViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        ConversationViewModelImpl$unpinGizmo$1 conversationViewModelImpl$unpinGizmo$1;
        conversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationViewModelImpl$unpinGizmo$1) {
            conversationViewModelImpl$unpinGizmo$1 = (ConversationViewModelImpl$unpinGizmo$1) abstractC19687c;
            int i10 = conversationViewModelImpl$unpinGizmo$1.f37814p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationViewModelImpl$unpinGizmo$1.f37814p0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationViewModelImpl$unpinGizmo$1 = new ConversationViewModelImpl$unpinGizmo$1(conversationViewModelImpl, abstractC19687c);
            }
        } else {
            conversationViewModelImpl$unpinGizmo$1 = new ConversationViewModelImpl$unpinGizmo$1(conversationViewModelImpl, abstractC19687c);
        }
        Object objM10021t = conversationViewModelImpl$unpinGizmo$1.f37812Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationViewModelImpl$unpinGizmo$1.f37814p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10021t);
            conversationViewModelImpl.f37598w.mo21448b(C20893l.f66588z, str, C17690x.f56481Y);
            conversationViewModelImpl$unpinGizmo$1.f37811Y = conversationViewModelImpl;
            conversationViewModelImpl$unpinGizmo$1.f37814p0 = 1;
            objM10021t = conversationViewModelImpl.f37595t.m10021t(str, conversationViewModelImpl$unpinGizmo$1);
            if (objM10021t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversationViewModelImpl = conversationViewModelImpl$unpinGizmo$1.f37811Y;
            AbstractC9233X.m9807c(objM10021t);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10021t;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m14255r(ConversationViewModelImpl conversationViewModelImpl, C21999e0 c21999e0, AbstractC19694j abstractC19694j) throws Throwable {
        String str;
        conversationViewModelImpl.getClass();
        C17296C c17296c = C17296C.f55119a;
        if (c21999e0 == null || (str = c21999e0.f69631d) == null) {
            return c17296c;
        }
        C4688o c4688oM5394a = ((C14111x0) conversationViewModelImpl.m14391f()).f44402d.m5394a(str);
        if (c4688oM5394a == null) {
            AbstractC8160o6.m8727b(conversationViewModelImpl.f37601z, AbstractC10763a.m11054l("Model ", str, " not found in available models"), null, 6);
            return c17296c;
        }
        Object objM15990s = conversationViewModelImpl.f37588m.m15990s(c4688oM5394a.f15253b, ((C14111x0) conversationViewModelImpl.m14391f()).f44380K, abstractC19694j);
        return objM15990s == EnumC19250a.f61036Y ? objM15990s : c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: s */
    public static final Object m14256s(ConversationViewModelImpl conversationViewModelImpl, C14043O c14043o, AbstractC19687c abstractC19687c) {
        ConversationViewModelImpl$upsell$1 conversationViewModelImpl$upsell$1;
        String strName;
        Object objM12798c;
        conversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ConversationViewModelImpl$upsell$1) {
            conversationViewModelImpl$upsell$1 = (ConversationViewModelImpl$upsell$1) abstractC19687c;
            int i10 = conversationViewModelImpl$upsell$1.f37818p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationViewModelImpl$upsell$1.f37818p0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationViewModelImpl$upsell$1 = new ConversationViewModelImpl$upsell$1(conversationViewModelImpl, abstractC19687c);
            }
        } else {
            conversationViewModelImpl$upsell$1 = new ConversationViewModelImpl$upsell$1(conversationViewModelImpl, abstractC19687c);
        }
        Object obj = conversationViewModelImpl$upsell$1.f37816Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationViewModelImpl$upsell$1.f37818p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            int iOrdinal = c14043o.f44148a.ordinal();
            EnumC5424s0 enumC5424s0 = c14043o.f44148a;
            if (iOrdinal != 5) {
                strName = iOrdinal != 6 ? enumC5424s0.name() : "Gizmo Text";
            } else {
                strName = "Top Bar";
            }
            conversationViewModelImpl.f37598w.mo21447a(C20856B.f66300c, AbstractC0168G.m535x("location", strName));
            conversationViewModelImpl$upsell$1.f37815Y = conversationViewModelImpl;
            conversationViewModelImpl$upsell$1.f37818p0 = 1;
            objM12798c = conversationViewModelImpl.f37600y.m12798c(enumC5424s0, conversationViewModelImpl$upsell$1);
            if (objM12798c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversationViewModelImpl = conversationViewModelImpl$upsell$1.f37815Y;
            AbstractC9233X.m9807c(obj);
            objM12798c = ((C21957R1) obj).f69517a;
        }
        conversationViewModelImpl.m14393h(new C2058g((String) objM12798c, true));
        return C17296C.f55119a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        ?? arrayList;
        Map map;
        List<C18982i> list;
        Map map2;
        Set setKeySet;
        List list2;
        InterfaceC14052T intent = (InterfaceC14052T) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C14110x) {
            m14258u(true, ((C14110x) intent).f44369a);
            return;
        }
        if (intent instanceof C14035K) {
            boolean z6 = ((C14035K) intent).f44123a;
            if (!z6 || ((C14111x0) m14391f()).f44414j.isEmpty()) {
                m14397m(new ConversationViewModelImpl$toggleTemporaryChat$1(z6));
                return;
            } else {
                m14393h(new C2058g(C5431w.m5902f(C5431w.f17746g, null, null, false, true, 7), true));
                return;
            }
        }
        if (intent instanceof C14027G) {
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new ConversationViewModelImpl$send$1(this, ((C14111x0) this.f40343c.getValue()).f44403d0.f19682a.f10934Y, EnumC14040M0.f44139Y, null), 3);
            return;
        }
        if (intent instanceof C14100s) {
            m14397m(new ConversationViewModelImpl$onIntent$1(intent));
            return;
        }
        boolean z10 = intent instanceof C14045P;
        InterfaceC20904w interfaceC20904w = this.f37598w;
        if (z10) {
            interfaceC20904w.mo21447a(C20855A.f66298d, C17690x.f56481Y);
            m14397m(ConversationViewModelImpl$activateWhisper$1.f37713Y);
            return;
        }
        if (intent instanceof C14047Q) {
            m14397m(ConversationViewModelImpl$onIntent$2.f37751Y);
            return;
        }
        if (intent instanceof C14050S) {
            m14394i(new ConversationViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C14106v) {
            m14394i(new ConversationViewModelImpl$onIntent$4(this, null));
            return;
        }
        if (intent instanceof C14108w) {
            if (((C14111x0) m14391f()).f44391V.isEmpty()) {
                return;
            }
            m14397m(ConversationViewModelImpl$onIntent$5.f37766Y);
            return;
        }
        if (intent instanceof C14017B) {
            m14394i(new ConversationViewModelImpl$onIntent$6(this, intent, null));
            return;
        }
        if (intent instanceof C14080i) {
            m14394i(new ConversationViewModelImpl$onIntent$7(this, null));
            return;
        }
        if (intent instanceof C14082j) {
            m14394i(new ConversationViewModelImpl$onIntent$8(this, null));
            return;
        }
        if (intent instanceof C14025F) {
            m14393h(new C2058g(C5431w.f17746g.m5903d(((C14025F) intent).f44112a), false));
            return;
        }
        if (intent instanceof C14094p) {
            C5416o0 c5416o0 = C5416o0.f17699g;
            c5416o0.getClass();
            m14393h(new C2058g(c5416o0.m5885a(new C0491v(((C14094p) intent).f44331a, 27)), true));
            return;
        }
        if (intent instanceof C14029H) {
            m14394i(new ConversationViewModelImpl$onIntent$9(this, intent, null));
            return;
        }
        if (intent instanceof C14041N) {
            m14397m(new ConversationViewModelImpl$onIntent$10(intent));
            return;
        }
        int iM19345U = -1;
        if (intent instanceof C14114z) {
            C18983j c18983j = ((C14111x0) m14391f()).f44418l;
            if (c18983j != null && (list2 = c18983j.f60549a) != null) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C18982i) it.next()).f60545d);
                }
                iM19345U = arrayList2.indexOf(((C14114z) intent).f44442a);
            }
            C14114z c14114z = (C14114z) intent;
            String str = c14114z.f44442a;
            Map mapM19244f = AbstractC17659D.m19244f(new C17309l(SDPKeywords.PROMPT, str), new C17309l("index", Integer.valueOf(iM19345U)));
            int iOrdinal = c14114z.f44443b.ordinal();
            if (iOrdinal == 1) {
                interfaceC20904w.mo21447a(C20857C.f66317C, mapM19244f);
            } else if (iOrdinal == 2) {
                interfaceC20904w.mo21447a(C20857C.f66344z, mapM19244f);
            }
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new ConversationViewModelImpl$send$1(this, str, EnumC14040M0.f44140Z, null), 3);
            return;
        }
        if (intent instanceof C14015A) {
            C18982i c18982i = ((C14015A) intent).f44096a;
            String str2 = c18982i.f60547f;
            C18983j c18983j2 = ((C14111x0) m14391f()).f44418l;
            if (c18983j2 != null && (map2 = c18983j2.f60550b) != null && (setKeySet = map2.keySet()) != null) {
                iM19345U = AbstractC17680n.m19345U(setKeySet, c18982i.f60547f);
            }
            interfaceC20904w.mo21447a(C20857C.f66318D, AbstractC17659D.m19244f(new C17309l("theme", str2), new C17309l("category", c18982i.f60546e.f60537Y), new C17309l("index", Integer.valueOf(iM19345U))));
            String str3 = c18982i.f60542a;
            this.f37594s.m20781a(new ConversationViewModelImpl$handlePromptThemeSelected$1(str3, c18982i));
            C18983j c18983j3 = ((C14111x0) m14391f()).f44418l;
            if (c18983j3 == null || (map = c18983j3.f60550b) == null || (list = (List) map.get(str2)) == null) {
                arrayList = C17689w.f56480Y;
            } else {
                arrayList = new ArrayList();
                for (C18982i c18982i2 : list) {
                    List listM10642a = AbstractC10003y4.m10642a(this.f37587l, str3, c18982i2.f60544c);
                    C18985l c18985l = listM10642a.isEmpty() ? null : new C18985l(c18982i2.f60544c, c18982i2.f60545d, listM10642a);
                    if (c18985l != null) {
                        arrayList.add(c18985l);
                    }
                }
            }
            m14397m(new ConversationViewModelImpl$handlePromptThemeSelected$2(arrayList));
            return;
        }
        if (intent instanceof C14033J) {
            C5410l0 c5410l0 = C5410l0.f17684g;
            c5410l0.getClass();
            m14393h(new C2058g(c5410l0.m5885a(C5391c.f17646Z), true));
            return;
        }
        if (intent instanceof C14098r) {
            m14394i(new ConversationViewModelImpl$onIntent$11(this, null));
            return;
        }
        if (intent instanceof C14023E) {
            m14394i(new ConversationViewModelImpl$onIntent$12(this, null));
            return;
        }
        if (intent instanceof C14096q) {
            m14394i(new ConversationViewModelImpl$onIntent$13(this, null));
            return;
        }
        if (intent instanceof C14092o) {
            m14397m(ConversationViewModelImpl$dismissVoiceNotice$1.f37718Y);
            return;
        }
        if (intent instanceof C14043O) {
            m14394i(new ConversationViewModelImpl$onIntent$14(this, intent, null));
            return;
        }
        if (intent instanceof C14031I) {
            C14031I c14031i = (C14031I) intent;
            interfaceC20904w.mo21447a(C20857C.f66330l, AbstractC17660E.m19258c(new C17309l("gizmo_id", c14031i.f44119a.f34318a)));
            String str4 = c14031i.f44120b.f34403c;
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, str4);
            m14393h(new C2055d(intent2));
            return;
        }
        if (intent instanceof C14019C) {
            m14397m(new ConversationViewModelImpl$onIntent$15(intent));
            return;
        }
        if (intent instanceof C14112y) {
            m14394i(new ConversationViewModelImpl$onIntent$16(this, intent, null));
            return;
        }
        if (intent instanceof C14037L) {
            m14394i(new ConversationViewModelImpl$onIntent$17(this, intent, null));
            return;
        }
        if (intent instanceof C14102t) {
            m14397m(new ConversationViewModelImpl$onIntent$18(intent));
            return;
        }
        boolean z11 = intent instanceof C14084k;
        C13133K c13133k = this.f37593r;
        if (z11) {
            c13133k.m14817a(new ConversationViewModelImpl$onIntent$19(this));
            return;
        }
        if (intent instanceof C14090n) {
            c13133k.m14817a(ConversationViewModelImpl$onIntent$20.f37752Y);
            return;
        }
        if (intent instanceof C14086l) {
            c13133k.m14817a(ConversationViewModelImpl$onIntent$21.f37753Y);
            return;
        }
        if (intent instanceof C14021D) {
            m14393h(new C2058g(C5379S.f17631i.m5898d(((C14021D) intent).f44106a), true));
            return;
        }
        if (intent instanceof C14039M) {
            C14111x0 c14111x0 = (C14111x0) m14391f();
            C20263a0 c20263a0 = c14111x0.f44411h0;
            if ((c20263a0 == null || AbstractC11372a0.m12784c(c20263a0)) && c14111x0.m15494h()) {
                m14394i(new ConversationViewModelImpl$onIntent$22(this, intent, c14111x0, null));
                return;
            } else {
                m14258u(true, ((C14039M) intent).f44138a);
                return;
            }
        }
        if (!(intent instanceof C14104u)) {
            if (intent instanceof C14088m) {
                m14397m(ConversationViewModelImpl$onIntent$23.f37758Y);
            }
        } else {
            C14459O c14459o = this.f37588m;
            boolean z12 = ((C14104u) intent).f44356a;
            c14459o.f45524w = z12;
            if (z12) {
                AbstractC0575H.m1156D(c14459o.f45506e, null, null, new C14445A(c14459o, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m14257t(AbstractC19687c abstractC19687c) {
        ConversationViewModelImpl$enterVoiceMode$1 conversationViewModelImpl$enterVoiceMode$1;
        C14111x0 c14111x0;
        ConversationViewModelImpl conversationViewModelImpl;
        ConversationViewModelImpl conversationViewModelImpl2;
        if (abstractC19687c instanceof ConversationViewModelImpl$enterVoiceMode$1) {
            conversationViewModelImpl$enterVoiceMode$1 = (ConversationViewModelImpl$enterVoiceMode$1) abstractC19687c;
            int i10 = conversationViewModelImpl$enterVoiceMode$1.f37723q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                conversationViewModelImpl$enterVoiceMode$1.f37723q0 = i10 - Integer.MIN_VALUE;
            } else {
                conversationViewModelImpl$enterVoiceMode$1 = new ConversationViewModelImpl$enterVoiceMode$1(this, abstractC19687c);
            }
        } else {
            conversationViewModelImpl$enterVoiceMode$1 = new ConversationViewModelImpl$enterVoiceMode$1(this, abstractC19687c);
        }
        Object objM3221t = conversationViewModelImpl$enterVoiceMode$1.f37721o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = conversationViewModelImpl$enterVoiceMode$1.f37723q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c14111x0 = conversationViewModelImpl$enterVoiceMode$1.f37720Z;
                conversationViewModelImpl = conversationViewModelImpl$enterVoiceMode$1.f37719Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                conversationViewModelImpl2 = conversationViewModelImpl$enterVoiceMode$1.f37719Y;
                AbstractC9233X.m9807c(objM3221t);
                conversationViewModelImpl$enterVoiceMode$1.f37719Y = null;
                conversationViewModelImpl$enterVoiceMode$1.f37723q0 = 3;
                if (conversationViewModelImpl2.m14257t(conversationViewModelImpl$enterVoiceMode$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM3221t);
        c14111x0 = (C14111x0) this.f40343c.getValue();
        C1970n c1970n = this.f37593r.f41697b;
        conversationViewModelImpl$enterVoiceMode$1.f37719Y = this;
        conversationViewModelImpl$enterVoiceMode$1.f37720Z = c14111x0;
        conversationViewModelImpl$enterVoiceMode$1.f37723q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c1970n, conversationViewModelImpl$enterVoiceMode$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        conversationViewModelImpl = this;
        C1705j c1705j = (C1705j) objM3221t;
        if (c14111x0.f44380K) {
            conversationViewModelImpl.m14397m(ConversationViewModelImpl$enterVoiceMode$2.f37724Y);
        } else if (!c14111x0.f44438z.f44210c || c1705j.f4878k) {
            conversationViewModelImpl.m14397m(ConversationViewModelImpl$enterVoiceMode$5.f37726Y);
        } else {
            C5365H c5365h = C5365H.f17604g;
            EnumC21896B0 enumC21896B0 = EnumC21896B0.f69423p0;
            c5365h.getClass();
            conversationViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
            C1970n c1970n2 = conversationViewModelImpl.f37593r.f41697b;
            ConversationViewModelImpl$enterVoiceMode$3 conversationViewModelImpl$enterVoiceMode$3 = new ConversationViewModelImpl$enterVoiceMode$3(2, null);
            conversationViewModelImpl$enterVoiceMode$1.f37719Y = conversationViewModelImpl;
            conversationViewModelImpl$enterVoiceMode$1.f37720Z = null;
            conversationViewModelImpl$enterVoiceMode$1.f37723q0 = 2;
            objM3221t = AbstractC2124C.m3220s(c1970n2, conversationViewModelImpl$enterVoiceMode$3, conversationViewModelImpl$enterVoiceMode$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            conversationViewModelImpl2 = conversationViewModelImpl;
            conversationViewModelImpl$enterVoiceMode$1.f37719Y = null;
            conversationViewModelImpl$enterVoiceMode$1.f37723q0 = 3;
            if (conversationViewModelImpl2.m14257t(conversationViewModelImpl$enterVoiceMode$1) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: u */
    public final void m14258u(boolean z6, C4688o c4688o) {
        String strM5901e;
        InterfaceC20904w interfaceC20904w = this.f37598w;
        if (z6) {
            interfaceC20904w.mo21447a(C20858D.f66346d, C17690x.f56481Y);
        }
        C14111x0 c14111x0 = (C14111x0) this.f40343c.getValue();
        interfaceC20904w.mo21447a(C20857C.f66327i, AbstractC17660E.m19258c(new C17309l("is_auto_created", Boolean.valueOf(!z6))));
        if (c4688o != null) {
            C5431w c5431w = C5431w.f17746g;
            c5431w.getClass();
            String model = c4688o.f15253b;
            AbstractC16544l.m18094g(model, "model");
            strM5901e = c5431w.m5885a(new C0491v(model, 21));
        } else {
            C20263a0 c20263a0 = c14111x0.f44411h0;
            strM5901e = c20263a0 != null ? C5431w.m5901e(C5431w.f17746g, AbstractC11372a0.m12782a(c20263a0), null, null, 6) : C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15);
        }
        m14393h(new C2058g(strM5901e, true));
    }
}
