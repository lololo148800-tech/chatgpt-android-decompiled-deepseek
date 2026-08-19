package com.openai.feature.conversations.impl.input;

import android.app.Application;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.AbstractC11372a0;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.files.ChatFileProvider;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13842B1;
import gd.C13844C0;
import gd.C13859H0;
import gd.C13885Q;
import gd.C13930e;
import gd.C13969n2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import me.C17238a;
import mm.C17296C;
import mm.C17309l;
import ne.C17600b;
import p003A1.AbstractC0168G;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p086D6.C1970n;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p098Di.InterfaceC2061j;
import p1025te.C19850A;
import p1025te.C19851B;
import p1025te.C19852C;
import p1025te.C19853D;
import p1025te.C19854E;
import p1025te.C19855F;
import p1025te.C19856G;
import p1025te.C19857H;
import p1025te.C19858I;
import p1025te.C19859J;
import p1025te.C19860K;
import p1025te.C19861L;
import p1025te.C19863N;
import p1025te.C19864O;
import p1025te.C19866Q;
import p1025te.C19869U;
import p1025te.C19874e;
import p1025te.C19884o;
import p1025te.C19885p;
import p1025te.C19886q;
import p1025te.C19887r;
import p1025te.C19889t;
import p1025te.C19890u;
import p1025te.C19891v;
import p1025te.C19892w;
import p1025te.C19893x;
import p1025te.C19894y;
import p1025te.C19895z;
import p1025te.EnumC19873d;
import p1025te.InterfaceC19862M;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1040ue.InterfaceC20204b;
import p1040ue.InterfaceC20207e;
import p1042uh.C20261Z;
import p1042uh.C20263a0;
import p1081wc.C20857C;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p1082wd.C20908a;
import p1082wd.C20909b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21965U0;
import p1155zi.C21995d0;
import p1155zi.C21999e0;
import p1155zi.C22071w0;
import p1155zi.EnumC21896B0;
import p1155zi.EnumC21964U;
import p1155zi.EnumC21968V0;
import p1155zi.EnumC21974X0;
import p1155zi.InterfaceC21915G;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p204I1.C3581L;
import p216Id.C3694b;
import p217Ie.C3708d;
import p220Ih.InterfaceC3721c;
import p229J0.C4171z3;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p269Kh.C4697x;
import p269Kh.C4699z;
import p269Kh.EnumC4694u;
import p318Mh.C5365H;
import p318Mh.C5370J0;
import p318Mh.C5374M;
import p318Mh.C5381U;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p337Nd.C5710c;
import p350O1.C6045C;
import p405Qf.C6687b;
import p454Se.C7111e;
import p454Se.C7112f;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8614c3;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p571X9.AbstractC9393x3;
import p576Xe.C9473F;
import p594Y9.AbstractC9827W2;
import p708dh.C13133K;
import p787he.C14459O;
import p846k4.C16340i;
import p870le.C16916z;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p913o2.AbstractC17806g;
import p925oe.C18092Q;
import p925oe.C18095U;
import p926of.C18173j;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19909N;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/input/InputViewModelImpl;", "Lcom/openai/feature/conversations/input/InputViewModel;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InputViewModelImpl extends InputViewModel {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f37880t = 0;

    /* JADX INFO: renamed from: i */
    public final C18418a f37881i;

    /* JADX INFO: renamed from: j */
    public final C7112f f37882j;

    /* JADX INFO: renamed from: k */
    public final C19864O f37883k;

    /* JADX INFO: renamed from: l */
    public final C13133K f37884l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC13849E f37885m;

    /* JADX INFO: renamed from: n */
    public final C17238a f37886n;

    /* JADX INFO: renamed from: o */
    public final C19909N f37887o;

    /* JADX INFO: renamed from: p */
    public final C5710c f37888p;

    /* JADX INFO: renamed from: q */
    public final C18092Q f37889q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC20904w f37890r;

    /* JADX INFO: renamed from: s */
    public final C3430e f37891s;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$1", m20656f = "InputViewModelImpl.kt", m20657l = {126}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123151 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f37892Y;

        public C123151(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return InputViewModelImpl.this.new C123151(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123151) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37892Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                EnumC19873d enumC19873d = EnumC19873d.f63010Y;
                this.f37892Y = 1;
                int i11 = InputViewModelImpl.f37880t;
                if (InputViewModelImpl.this.m14262n(enumC19873d, false, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$13 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$13", m20656f = "InputViewModelImpl.kt", m20657l = {196, 197}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "<anonymous>", "(Z)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1231613 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37895Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C14459O f37896Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C16916z f37897o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1231613(C14459O c14459o, C16916z c16916z, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37896Z = c14459o;
            this.f37897o0 = c16916z;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C1231613(this.f37896Z, this.f37897o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((C1231613) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37895Y;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C14459O c14459o = this.f37896Z;
            this.f37895Y = 1;
            obj = AbstractC2124C.m3221t(c14459o.f45526y, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            C3694b c3694b = (C3694b) obj;
            String str = c3694b.f11216a;
            this.f37895Y = 2;
            if (this.f37897o0.m18589d(str, c3694b.f11218c, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$15 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$15", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/N;", "inputState", "", "<anonymous>", "(Lte/N;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1231715 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37898Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1231715 c1231715 = new C1231715(2, interfaceC18770c);
            c1231715.f37898Y = obj;
            return c1231715;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1231715) create((C19863N) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            Map map = ((C19863N) this.f37898Y).f62956c;
            boolean z6 = false;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((C19874e) ((Map.Entry) it.next()).getValue()).f63014b != null) {
                        z6 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$16 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "", "dalleAttachmentAdded", "invoke", "(Lte/Q;Z)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1231816 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1231816 f37899Y = new C1231816();

        public C1231816() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C19866Q.m20782e(setOnEach, null, null, null, null, false, null, null, null, false, null, null, null, false, false, null, zBooleanValue, null, false, false, false, 8126463);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$17 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lte/Q;", "", "Lue/d;", "it", "invoke", "(Lte/Q;Ljava/util/List;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1231917 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1231917 f37900Y = new C1231917();

        public C1231917() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            List it = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C19866Q.m20782e(setOnEach, null, null, null, null, false, null, it, null, false, null, null, null, false, false, null, false, null, false, false, false, 8388543);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$18 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "LTd/f0;", "it", "invoke", "(Lte/Q;LTd/f0;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1232018 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1232018 f37901Y = new C1232018();

        public C1232018() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            C7351f0 it = (C7351f0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C19866Q.m20782e(setOnEach, null, null, null, null, false, null, null, null, false, null, null, null, false, false, null, true, null, false, false, false, 8126463);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$19 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$19", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/N;", "input", "Lzi/e0;", "<anonymous>", "(Lte/N;)Lzi/e0;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1232119 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37902Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1232119 c1232119 = new C1232119(2, interfaceC18770c);
            c1232119.f37902Y = obj;
            return c1232119;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1232119) create((C19863N) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return ((C19863N) this.f37902Y).f62961h;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$2", m20656f = "InputViewModelImpl.kt", m20657l = {138}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123222 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f37903Y;

        public C123222(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return InputViewModelImpl.this.new C123222(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123222) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37903Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                EnumC19873d enumC19873d = EnumC19873d.f63011Z;
                this.f37903Y = 1;
                int i11 = InputViewModelImpl.f37880t;
                if (InputViewModelImpl.this.m14262n(enumC19873d, false, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$20 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$20", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/e0;", "it", "Lmm/C;", "<anonymous>", "(Lzi/e0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1232320 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37905Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$20$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/Q;", "invoke", "(Lte/Q;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21999e0 f37907Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21999e0 c21999e0) {
                super(1);
                this.f37907Y = c21999e0;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C19866Q setState = (C19866Q) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C19866Q.m20782e(setState, null, null, null, null, false, null, null, null, false, null, null, null, false, false, null, false, this.f37907Y, false, false, true, 3670015);
            }
        }

        public C1232320(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1232320 c1232320 = InputViewModelImpl.this.new C1232320(interfaceC18770c);
            c1232320.f37905Y = obj;
            return c1232320;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1232320 c1232320 = (C1232320) create((C21999e0) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1232320.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((C21999e0) this.f37905Y);
            int i10 = InputViewModelImpl.f37880t;
            InputViewModelImpl.this.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$21 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "Lye/f;", "it", "invoke", "(Lte/Q;Lye/f;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1232421 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1232421 f37908Y = new C1232421();

        public C1232421() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            EnumC21517f it = (EnumC21517f) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C19866Q.m20782e(setOnEach, null, null, null, null, false, null, null, it, false, null, null, null, false, false, null, false, null, false, false, false, 8388479);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "LId/b;", "it", "invoke", "(Lte/Q;LId/b;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123253 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123253 f37909Y = new C123253();

        public C123253() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            C3694b it = (C3694b) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C19866Q.m20782e(setOnEach, null, null, null, null, it.f11224i.isEmpty(), null, null, null, false, null, null, null, false, false, null, false, null, false, false, false, 8388591);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "Lwd/b;", "it", "invoke", "(Lte/Q;Lwd/b;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123264 extends AbstractC16546n implements InterfaceC1439n {
        public C123264() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            C20909b it = (C20909b) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            C19866Q c19866qM20782e = C19866Q.m20782e(setOnEach, null, it, null, null, false, null, null, null, false, null, null, null, false, false, null, false, null, false, false, false, 8388605);
            if (!c19866qM20782e.f62994y && setOnEach.f62994y) {
                InputViewModelImpl.this.f37889q.m19711b(EnumC21517f.f68138Z);
            }
            return c19866qM20782e;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$5 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "LKh/c;", "it", "invoke", "(Lte/Q;LKh/c;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123275 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123275 f37911Y = new C123275();

        public C123275() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19866Q setOnEach = (C19866Q) obj;
            C4676c it = (C4676c) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            InputViewModelImpl$5$searchAvailable$1 check = InputViewModelImpl$5$searchAvailable$1.f37912Y;
            AbstractC16544l.m18094g(check, "check");
            Iterator it2 = it.f15224a.iterator();
            loop0: while (true) {
                if (!it2.hasNext()) {
                    c4688o = null;
                    break;
                }
                for (C4688o c4688o : ((C4679f) it2.next()).f15229b) {
                    if (((Boolean) check.invoke(c4688o)).booleanValue()) {
                        break loop0;
                    }
                }
            }
            return C19866Q.m20782e(setOnEach, null, null, null, null, false, null, null, null, c4688o != null, null, null, null, false, false, null, false, null, false, false, false, 8388095);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$6 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "Lwd/a;", "it", "invoke", "(Lte/Q;Lwd/a;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123286 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123286 f37913Y = new C123286();

        public C123286() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            boolean z6;
            C19866Q setOnEach = (C19866Q) obj;
            C20908a it = (C20908a) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            if (setOnEach.f62985p) {
                z6 = true;
                C20263a0 c20263a0 = it.f66645a;
                if (c20263a0 != null && AbstractC11372a0.m12784c(c20263a0)) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            return C19866Q.m20782e(setOnEach, null, null, it, null, false, null, null, null, false, null, null, null, false, z6, null, false, null, false, false, false, 8355835);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$7 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$7", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lzi/Q1;", "", "Luh/a0;", "result", "Lmm/C;", "<anonymous>", "(Lzi/Q1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123297 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37914Y;

        public C123297(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123297 c123297 = InputViewModelImpl.this.new C123297(interfaceC18770c);
            c123297.f37914Y = obj;
            return c123297;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C123297 c123297 = (C123297) create((AbstractC21955Q1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c123297.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) this.f37914Y;
            if (abstractC21955Q1 instanceof C21952P1) {
                InputViewModelImpl$7$1$1 inputViewModelImpl$7$1$1 = new InputViewModelImpl$7$1$1((List) ((C21952P1) abstractC21955Q1).f69511a);
                int i10 = InputViewModelImpl.f37880t;
                InputViewModelImpl.this.m14397m(inputViewModelImpl$7$1$1);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$8 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/Q;", "Lte/N;", "input", "invoke", "(Lte/Q;Lte/N;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123308 extends AbstractC16546n implements InterfaceC1439n {
        public C123308() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r22v0 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v2 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            ?? arrayList;
            ?? r22;
            C19866Q setOnEach = (C19866Q) obj;
            C19863N input = (C19863N) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(input, "input");
            int i10 = InputViewModelImpl.f37880t;
            InputViewModelImpl inputViewModelImpl = InputViewModelImpl.this;
            C2153Q0 c2153q0 = inputViewModelImpl.f40343c;
            boolean z6 = ((C19866Q) c2153q0.getValue()).f62985p;
            C17689w c17689w = C17689w.f56480Y;
            C6045C c6045c = input.f62954a;
            if (z6) {
                AbstractC16544l.m18094g(c6045c, "<this>");
                List gizmos = setOnEach.f62981l;
                AbstractC16544l.m18094g(gizmos, "gizmos");
                String str = c6045c.f19682a.f10934Y;
                int iM4270f = C3581L.m4270f(c6045c.f19683b);
                if (iM4270f == 0 || str.length() == 0) {
                    arrayList = c17689w;
                } else {
                    String strSubstring = str.substring(0, iM4270f);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    int iM21683Q = AbstractC21322p.m21683Q(strSubstring, ' ', 0, 6);
                    Integer numValueOf = Integer.valueOf(iM21683Q);
                    if (iM21683Q == -1) {
                        numValueOf = null;
                    }
                    String strSubstring2 = strSubstring.substring(numValueOf != null ? numValueOf.intValue() + 1 : 0);
                    AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                    if (AbstractC21329w.m21734u(strSubstring2, Separators.f31989AT, false)) {
                        String strM21702j0 = AbstractC21322p.m21702j0(strSubstring2, Separators.f31989AT);
                        Locale locale = Locale.ROOT;
                        String strM534w = AbstractC0168G.m534w(locale, "ROOT", strM21702j0, locale, "toLowerCase(...)");
                        arrayList = new ArrayList();
                        for (Object obj3 : gizmos) {
                            C20261Z c20261z = ((C20263a0) obj3).f64086c;
                            Locale ROOT = Locale.ROOT;
                            AbstractC16544l.m18093f(ROOT, "ROOT");
                            String lowerCase = c20261z.f64081a.toLowerCase(ROOT);
                            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                            if (AbstractC21322p.m21667A(lowerCase, strM534w, false)) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = c17689w;
                    }
                }
                if (!((Collection) arrayList).isEmpty()) {
                    C19866Q c19866q = (C19866Q) c2153q0.getValue();
                    c19866q.getClass();
                    C21995d0 c21995d0 = C21999e0.Companion;
                    EnumC21964U enumC21964U = EnumC21964U.GizmoTag;
                    c21995d0.getClass();
                    if (C21995d0.m22341a(c19866q.f62989t, enumC21964U) != null) {
                        inputViewModelImpl.m14397m(InputViewModelImpl$checkFilterMentions$1.f37921Y);
                        r22 = c17689w;
                    }
                }
                r22 = arrayList;
            } else {
                r22 = c17689w;
            }
            return C19866Q.m20782e(setOnEach, c6045c, null, null, null, false, input.f62956c, null, null, false, input.f62957d, null, r22, false, false, null, false, null, false, false, false, 8383454);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$9 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$9", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/N;", "input", "Luh/a0;", "<anonymous>", "(Lte/N;)Luh/a0;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123319 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37918Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123319 c123319 = new C123319(2, interfaceC18770c);
            c123319.f37918Y = obj;
            return c123319;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123319) create((C19863N) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C19863N c19863n = (C19863N) this.f37918Y;
            C20263a0 c20263a0 = c19863n.f62957d;
            C6045C c6045c = c19863n.f62954a;
            AbstractC16544l.m18094g(c6045c, "<this>");
            if (AbstractC21322p.m21698f0(c6045c.f19682a.f10934Y, (char) 8203)) {
                return c20263a0;
            }
            return null;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/input/InputViewModelImpl$Companion;", "", "()V", "PASTE_MINIMUM_DIFF_LENGTH", "", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37919a;

        static {
            int[] iArr = new int[EnumC19873d.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC19873d enumC19873d = EnumC19873d.f63010Y;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC21968V0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                C16340i c16340i = EnumC21968V0.f69543Z;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[EnumC4694u.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f37919a = iArr3;
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0063  */
    public InputViewModelImpl(C17600b c17600b, C16382j c16382j, C13969n2 c13969n2, C16916z c16916z, C14459O c14459o, C18418a c18418a, C7112f c7112f, C19864O c19864o, C13133K c13133k, C9473F c9473f, InterfaceC13849E interfaceC13849E, C11082S c11082s, C17238a c17238a, C19909N c19909n, C5710c c5710c, C18095U c18095u, C3708d c3708d, InterfaceC3721c interfaceC3721c, C18092Q c18092q, InterfaceC20904w interfaceC20904w) {
        boolean z6;
        int iIntValue = ((Number) c13969n2.m15477a(C13930e.f43980d)).intValue();
        C14005w2 c14005w2 = (C14005w2) interfaceC13849E;
        boolean zM15481a = c14005w2.m15481a(C13859H0.f43897c);
        boolean zM15481a2 = c14005w2.m15481a(C13844C0.f43880c);
        boolean zM15481a3 = c14005w2.m15481a(C13885Q.f43933c);
        C5431w.f17746g.getClass();
        String key = C5431w.f17749j.f17614a;
        AbstractC16544l.m18094g(key, "key");
        LinkedHashMap linkedHashMap = c11082s.f33411a;
        if (linkedHashMap.containsKey(key) || ((EnumC5421r) C5431w.f17758s.m5892c(c11082s)) == EnumC5421r.f17710Z) {
            z6 = false;
        } else {
            String key2 = C5431w.f17751l.f17614a;
            AbstractC16544l.m18094g(key2, "key");
            if (linkedHashMap.containsKey(key2)) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        C6045C c6045c = null;
        if ((8019711 & 1) != 0) {
            c6045c = new C6045C(0L, "", 6);
        }
        C6045C c6045c2 = c6045c;
        C20909b c20909b = (8019711 & 2) != 0 ? new C20909b(null, null, null, null, 31) : null;
        C20908a c20908a = new C20908a(null, 31);
        C17690x c17690x = C17690x.f56481Y;
        int i10 = 8019711 & 64;
        C17689w c17689w = C17689w.f56480Y;
        super(new C19866Q(c6045c2, c20909b, c20908a, null, false, c17690x, i10 != 0 ? c17689w : null, (8019711 & 128) != 0 ? EnumC21517f.f68138Z : null, (8019711 & 256) != 0 ? false : zM15481a2, false, null, c17689w, c17689w, (8019711 & 8192) != 0 ? 0 : iIntValue, false, (32768 & 8019711) != 0 ? false : zM15481a3, zM15481a, C19869U.f62999a, (262144 & 8019711) != 0 ? false : z6, null, false, false, true));
        this.f37881i = c18418a;
        this.f37882j = c7112f;
        this.f37883k = c19864o;
        this.f37884l = c13133k;
        this.f37885m = interfaceC13849E;
        this.f37886n = c17238a;
        this.f37887o = c19909n;
        this.f37888p = c5710c;
        this.f37889q = c18092q;
        this.f37890r = interfaceC20904w;
        this.f37891s = AbstractC8168p6.m8749b("InputViewModel", null);
        m12139a(c7112f);
        C5370J0 c5370j0 = C5431w.f17758s;
        EnumC5421r enumC5421r = (EnumC5421r) c5370j0.m5892c(c11082s);
        EnumC5421r enumC5421r2 = EnumC5421r.f17711o0;
        boolean z10 = c18418a.f58773a.f58783b;
        if (enumC5421r == enumC5421r2) {
            if (z10) {
                C5374M c5374m = C5374M.f17623g;
                EnumC21974X0 enumC21974X0 = EnumC21974X0.f69558r0;
                c5374m.getClass();
                m14393h(new C2058g(c5374m.m5885a(new C4171z3(enumC21974X0, 14)), true));
            } else {
                m14394i(new C123151(null));
            }
        }
        if (((EnumC5421r) c5370j0.m5892c(c11082s)) == EnumC5421r.f17712p0) {
            if (z10) {
                C5374M c5374m2 = C5374M.f17623g;
                EnumC21974X0 enumC21974X1 = EnumC21974X0.f69558r0;
                c5374m2.getClass();
                m14393h(new C2058g(c5374m2.m5885a(new C4171z3(enumC21974X1, 14)), true));
            } else {
                m14394i(new C123222(null));
            }
        }
        m14396l(C123253.f37909Y, c14459o.f45526y);
        m14396l(new C123264(), c17600b.f56349b);
        m14396l(C123275.f37911Y, ((C6687b) interfaceC3721c).f21507g);
        m14396l(C123286.f37913Y, c16382j.f50876c);
        if (!z10) {
            AbstractC2124C.m3226y(new C1970n(AbstractC9827W2.m10468a(c9473f, false, 3), 5, new C123297(null)), ViewModelKt.m12143a(this));
        }
        String str = (String) C5431w.f17757r.m5892c(c11082s);
        String str2 = c18095u.f57735e;
        c18095u.f57735e = null;
        str = str2 != null ? str2 : str;
        if (str != null && !AbstractC21322p.m21681O(str)) {
            m14394i(new InputViewModelImpl$handleShareSheetData$1(this, str, null));
        }
        ArrayList arrayList = c18095u.f57733c;
        List listM19373w0 = AbstractC17680n.m19373w0(AbstractC17680n.m19322C0(arrayList), 4);
        arrayList.clear();
        Iterator it = listM19373w0.iterator();
        while (it.hasNext()) {
            AbstractC8614c3.m9263b(c18418a, EnumC21974X0.f69558r0, new InputViewModelImpl$handleShareSheetData$2$1(1, 0, InputViewModelImpl.class, this, "emitEffect", "emitEffect(Lcom/openai/viewmodel/StandardEffect;)V"), new InputViewModelImpl$handleShareSheetData$2$2(this, (Uri) it.next()));
        }
        ArrayList arrayList2 = c18095u.f57734d;
        List listM19373w1 = AbstractC17680n.m19373w0(AbstractC17680n.m19322C0(arrayList2), 10);
        arrayList2.clear();
        Iterator it2 = listM19373w1.iterator();
        while (it2.hasNext()) {
            AbstractC8614c3.m9263b(c18418a, EnumC21974X0.f69560t0, new InputViewModelImpl$handleShareSheetData$3$1(1, 0, InputViewModelImpl.class, this, "emitEffect", "emitEffect(Lcom/openai/viewmodel/StandardEffect;)V"), new InputViewModelImpl$handleShareSheetData$3$2(this, (Uri) it2.next()));
        }
        m14396l(new C123308(), this.f37883k.f62964c);
        final InterfaceC2184i interfaceC2184iM9771b = AbstractC9206S2.m9771b(new C123319(2, null), this.f37883k.f62964c);
        AbstractC2124C.m3226y(new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123382<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37975Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ InputViewModelImpl f37976Z;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$1$2", m20656f = "InputViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37977Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37978Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37977Y = obj;
                        this.f37978Z |= Integer.MIN_VALUE;
                        return C123382.this.mo395a(null, this);
                    }
                }

                public C123382(InterfaceC2186j interfaceC2186j, InputViewModelImpl inputViewModelImpl) {
                    this.f37975Y = interfaceC2186j;
                    this.f37976Z = inputViewModelImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37978Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37978Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37977Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37978Z;
                    C17296C c17296c = C17296C.f55119a;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        this.f37976Z.f37883k.m20781a(new InputViewModelImpl$10$1((C20263a0) obj));
                        anonymousClass1.f37978Z = 1;
                        if (this.f37975Y.mo395a(c17296c, anonymousClass1) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return c17296c;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                Object objMo3141d = interfaceC2184iM9771b.mo3141d(new C123382(interfaceC2186j, this), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, ViewModelKt.m12143a(this));
        AbstractC2124C.m3226y(new C1970n(this.f37883k.f62964c, 5, new InputViewModelImpl$observeDrawnImage$1(this, null)), ViewModelKt.m12143a(this));
        final C2153Q0 c2153q0 = this.f37883k.f62964c;
        final InterfaceC2184i interfaceC2184iM3214m = AbstractC2124C.m3214m(AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$2$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123392<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37981Y;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$map$2$2", m20656f = "InputViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37982Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37983Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37982Y = obj;
                        this.f37983Z |= Integer.MIN_VALUE;
                        return C123392.this.mo395a(null, this);
                    }
                }

                public C123392(InterfaceC2186j interfaceC2186j) {
                    this.f37981Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37983Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37983Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37982Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37983Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        C19863N c19863n = (C19863N) obj;
                        Boolean boolValueOf = Boolean.valueOf(c19863n.f62954a.f19682a.f10934Y.length() > 0 || !c19863n.f62956c.isEmpty());
                        anonymousClass1.f37983Z = 1;
                        if (this.f37981Y.mo395a(boolValueOf, anonymousClass1) == enumC19250a) {
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
                c2153q0.mo3141d(new C123392(interfaceC2186j), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }), 500L);
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123362<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37964Y;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$1$2", m20656f = "InputViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37965Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37966Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37965Y = obj;
                        this.f37966Z |= Integer.MIN_VALUE;
                        return C123362.this.mo395a(null, this);
                    }
                }

                public C123362(InterfaceC2186j interfaceC2186j) {
                    this.f37964Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37966Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37966Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37965Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37966Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.f37966Z = 1;
                            if (this.f37964Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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
                Object objMo3141d = interfaceC2184iM3214m.mo3141d(new C123362(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, new C1231613(c14459o, c16916z, null)), ViewModelKt.m12143a(this));
        final C2153Q0 c2153q1 = this.f37883k.f62964c;
        m14396l(C1231816.f37899Y, AbstractC9206S2.m9771b(new C1231715(2, null), new InterfaceC2184i() { // from class: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$2$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123372<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37969Y;

                /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$special$$inlined$filter$2$2", m20656f = "InputViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37970Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37971Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37970Y = obj;
                        this.f37971Z |= Integer.MIN_VALUE;
                        return C123372.this.mo395a(null, this);
                    }
                }

                public C123372(InterfaceC2186j interfaceC2186j) {
                    this.f37969Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37971Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37971Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37970Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37971Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (!((C19863N) obj).f62956c.isEmpty()) {
                            anonymousClass1.f37971Z = 1;
                            if (this.f37969Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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
                c2153q1.mo3141d(new C123372(interfaceC2186j), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }));
        m14396l(C1231917.f37900Y, this.f37886n.f54996c);
        m14396l(C1232018.f37901Y, new C2146N(c3708d.f11251f, 2));
        AbstractC2124C.m3226y(new C1970n(new C2146N(AbstractC9206S2.m9771b(new C1232119(2, null), this.f37883k.f62964c), 2), 5, new C1232320(null)), ViewModelKt.m12143a(this));
        m14396l(C1232421.f37908Y, this.f37889q.f57723b);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14261p(InputViewModelImpl inputViewModelImpl, Uri uri, EnumC18991F enumC18991F, EnumC21968V0 enumC21968V0, int i10) {
        if ((i10 & 4) != 0) {
            enumC21968V0 = null;
        }
        inputViewModelImpl.m14263o(uri, enumC18991F, enumC21968V0, null, null, null);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        ArrayList arrayList;
        C4697x c4697x;
        InterfaceC19862M intent = (InterfaceC19862M) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C19860K) {
            C6045C c6045c = ((C19860K) intent).f62952a;
            String str = c6045c.f19682a.f10934Y;
            C19864O c19864o = this.f37883k;
            if (str.length() > ((C19863N) c19864o.f62964c.getValue()).f62954a.f19682a.f10934Y.length() + 3) {
                this.f37890r.mo21447a(C20857C.f66337s, AbstractC17660E.m19258c(new C17309l("length", Integer.valueOf(str.length()))));
            }
            c19864o.m20781a(new InputViewModelImpl$updateInput$1(c6045c));
            return;
        }
        if (intent instanceof C19852C) {
            m14394i(new InputViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C19855F) {
            InterfaceC21915G interfaceC21915G = ((C19855F) intent).f62947a;
            boolean z6 = interfaceC21915G instanceof C22071w0;
            C5710c c5710c = this.f37888p;
            if (!z6) {
                if (interfaceC21915G instanceof C21965U0) {
                    String value = ((C21965U0) interfaceC21915G).f69534a;
                    AbstractC16544l.m18094g(value, "value");
                    C19909N.m20798a(this.f37887o, AbstractC9393x3.m9974d(new C18173j(value, null, null, null, null, null, null, null, null, 510)), 0, true, false, false, 26);
                    m14393h(new C2058g(C5381U.f17633g.m5899d(c5710c.f18498a), true));
                    return;
                }
                AbstractC8160o6.m8728c(this.f37891s, "Invalid attachment image type => " + interfaceC21915G, null, null, 6);
                return;
            }
            C22071w0 c22071w0 = (C22071w0) interfaceC21915G;
            String str2 = c22071w0.f69775b;
            if (str2 == null) {
                return;
            }
            int iOrdinal = c22071w0.f69774a.ordinal();
            if (iOrdinal == 0) {
                str2 = c22071w0.f69779f;
                if (str2 == null) {
                    return;
                }
            } else if (iOrdinal != 1) {
                throw new C0644w();
            }
            C19909N.m20798a(this.f37887o, AbstractC9393x3.m9974d(new C18173j(str2, c22071w0.f69777d, c22071w0.f69778e, c22071w0.f69781h, c22071w0.f69780g, c22071w0.f69774a.f69547Y, null, null, null, 448)), 0, false, c22071w0.f69774a != EnumC21968V0.Inpainting, false, 22);
            m14393h(new C2058g(C5381U.f17633g.m5899d(c5710c.f18498a), true));
            return;
        }
        if (intent instanceof C19859J) {
            m14397m(new InputViewModelImpl$onIntent$2(intent));
            return;
        }
        if (intent instanceof C19861L) {
            Iterator it = AbstractC17680n.m19339O(((C19861L) intent).f62953a).iterator();
            while (it.hasNext()) {
                m14261p(this, (Uri) it.next(), EnumC18991F.f60566p0, null, 60);
            }
            return;
        }
        if (intent instanceof C19850A) {
            Uri uri = ((C19850A) intent).f62941a;
            if (uri != null) {
                C4699z c4699z = ((C19866Q) this.f40343c.getValue()).f62971b.m21453a().f15259h;
                EnumC4694u enumC4694u = (c4699z == null || (c4697x = c4699z.f15278a) == null) ? null : c4697x.f15275a;
                m14261p(this, uri, (enumC4694u == null ? -1 : WhenMappings.f37919a[enumC4694u.ordinal()]) == 1 ? EnumC18991F.f60564Z : EnumC18991F.f60565o0, null, 60);
                return;
            }
            return;
        }
        if (intent instanceof C19894y) {
            this.f37890r.mo21447a(C20859E.f66358l, C17690x.f56481Y);
            C19894y c19894y = (C19894y) intent;
            C19874e c19874e = (C19874e) ((C19866Q) m14391f()).f62975f.get(c19894y.f63040a);
            if (c19874e == null) {
                return;
            }
            m14261p(this, c19894y.f63040a, c19874e.f63013a, c19874e.f63014b, 56);
            return;
        }
        if (intent instanceof C19856G) {
            m14394i(new InputViewModelImpl$onIntent$5(this, intent, null));
            return;
        }
        if (intent.equals(C19895z.f63041a)) {
            m14392g(C19885p.f63031a);
            return;
        }
        if (intent instanceof C19857H) {
            C19857H c19857h = (C19857H) intent;
            this.f37889q.m19711b(c19857h.f62949a);
            if (c19857h.f62949a == EnumC21517f.f68139o0) {
                this.f37883k.m20781a(InputViewModelImpl$onIntent$6.f37951Y);
                m14397m(InputViewModelImpl$onIntent$7.f37952Y);
                m14394i(new InputViewModelImpl$selectGizmo$1(this, new C19851B(null), null));
                return;
            }
            return;
        }
        if (intent.equals(C19893x.f63039a)) {
            if (!((C19866Q) m14391f()).m20785h() || this.f37881i.f58773a.f58783b) {
                return;
            }
            m14392g(C19884o.f63030a);
            m14397m(InputViewModelImpl$blockFileUploadFeatureIfRateLimited$1.f37920Y);
            return;
        }
        if (intent.equals(C19892w.f63038a)) {
            this.f37890r.mo21447a(C20859E.f66356j, C17690x.f56481Y);
            m14397m(InputViewModelImpl$dismissPopoverBottomSheet$1.f37922Y);
            return;
        }
        if (intent instanceof C19851B) {
            m14394i(new InputViewModelImpl$selectGizmo$1(this, (C19851B) intent, null));
            return;
        }
        if (!(intent instanceof C19890u)) {
            if (intent instanceof C19858I) {
                m14393h(new C2060i(((C19858I) intent).f62950a));
                return;
            }
            if (intent instanceof C19889t) {
                m14394i(new InputViewModelImpl$onIntent$9(this, intent, null));
                return;
            }
            if (intent instanceof C19853D) {
                m14397m(InputViewModelImpl$onIntent$10.f37945Y);
                return;
            }
            if (intent instanceof C19891v) {
                m14397m(new InputViewModelImpl$onIntent$11(intent));
                return;
            } else {
                if (intent instanceof C19854E) {
                    Intent intent2 = new Intent();
                    AbstractC9186P.m9748b(intent2, ((C19854E) intent).f62946a);
                    m14393h(new C2055d(intent2));
                    return;
                }
                return;
            }
        }
        C17238a c17238a = this.f37886n;
        C19890u c19890u = (C19890u) intent;
        String decorationId = c19890u.f63035a;
        InterfaceC20204b action = c19890u.f63036b;
        synchronized (c17238a) {
            AbstractC16544l.m18094g(decorationId, "decorationId");
            AbstractC16544l.m18094g(action, "action");
            Object obj = c17238a.f54994a.get();
            AbstractC16544l.m18093f(obj, "get(...)");
            arrayList = new ArrayList();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                InterfaceC2061j interfaceC2061jMo4411a = ((InterfaceC20207e) it2.next()).mo4411a(action);
                if (interfaceC2061jMo4411a != null) {
                    arrayList.add(interfaceC2061jMo4411a);
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m14393h((InterfaceC2061j) it3.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e9, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public final Object m14262n(EnumC19873d enumC19873d, boolean z6, AbstractC19687c abstractC19687c) {
        InputViewModelImpl$imageSelect$1 inputViewModelImpl$imageSelect$1;
        InputViewModelImpl inputViewModelImpl;
        boolean z10;
        int iOrdinal;
        C7112f c7112f;
        AbstractC21955Q1 abstractC21955Q1M7520k;
        if (abstractC19687c instanceof InputViewModelImpl$imageSelect$1) {
            inputViewModelImpl$imageSelect$1 = (InputViewModelImpl$imageSelect$1) abstractC19687c;
            int i10 = inputViewModelImpl$imageSelect$1.f37934q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                inputViewModelImpl$imageSelect$1.f37934q0 = i10 - Integer.MIN_VALUE;
            } else {
                inputViewModelImpl$imageSelect$1 = new InputViewModelImpl$imageSelect$1(this, abstractC19687c);
            }
        } else {
            inputViewModelImpl$imageSelect$1 = new InputViewModelImpl$imageSelect$1(this, abstractC19687c);
        }
        Object objM3221t = inputViewModelImpl$imageSelect$1.f37932o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = inputViewModelImpl$imageSelect$1.f37934q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                enumC19873d = inputViewModelImpl$imageSelect$1.f37931Z;
                inputViewModelImpl = inputViewModelImpl$imageSelect$1.f37930Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                enumC19873d = inputViewModelImpl$imageSelect$1.f37931Z;
                inputViewModelImpl = inputViewModelImpl$imageSelect$1.f37930Y;
                AbstractC9233X.m9807c(objM3221t);
                inputViewModelImpl$imageSelect$1.f37930Y = null;
                inputViewModelImpl$imageSelect$1.f37931Z = null;
                inputViewModelImpl$imageSelect$1.f37934q0 = 3;
                if (inputViewModelImpl.m14262n(enumC19873d, false, inputViewModelImpl$imageSelect$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        if (((C19866Q) m14391f()).m20785h()) {
            m14392g(C19884o.f63030a);
            m14397m(InputViewModelImpl$imageSelect$2.f37935Y);
            return c17296c;
        }
        if (z6) {
            if (!((C14005w2) this.f37885m).m15481a(C13842B1.f43878c)) {
                C1970n c1970n = this.f37884l.f41697b;
                inputViewModelImpl$imageSelect$1.f37930Y = this;
                inputViewModelImpl$imageSelect$1.f37931Z = enumC19873d;
                inputViewModelImpl$imageSelect$1.f37934q0 = 1;
                objM3221t = AbstractC2124C.m3221t(c1970n, inputViewModelImpl$imageSelect$1);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                inputViewModelImpl = this;
            }
            if (z10) {
                C5365H c5365h = C5365H.f17604g;
                EnumC21896B0 enumC21896B0 = EnumC21896B0.Vision;
                c5365h.getClass();
                inputViewModelImpl.m14393h(new C2058g(c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true));
                C1970n c1970n2 = inputViewModelImpl.f37884l.f41697b;
                InputViewModelImpl$imageSelect$3 inputViewModelImpl$imageSelect$3 = new InputViewModelImpl$imageSelect$3(2, null);
                inputViewModelImpl$imageSelect$1.f37930Y = inputViewModelImpl;
                inputViewModelImpl$imageSelect$1.f37931Z = enumC19873d;
                inputViewModelImpl$imageSelect$1.f37934q0 = 2;
                objM3221t = AbstractC2124C.m3220s(c1970n2, inputViewModelImpl$imageSelect$3, inputViewModelImpl$imageSelect$1);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                inputViewModelImpl$imageSelect$1.f37930Y = null;
                inputViewModelImpl$imageSelect$1.f37931Z = null;
                inputViewModelImpl$imageSelect$1.f37934q0 = 3;
                if (inputViewModelImpl.m14262n(enumC19873d, false, inputViewModelImpl$imageSelect$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                iOrdinal = enumC19873d.ordinal();
                if (iOrdinal == 0) {
                    c7112f = inputViewModelImpl.f37882j;
                    abstractC21955Q1M7520k = c7112f.m7520k();
                    if (abstractC21955Q1M7520k instanceof C21952P1) {
                        File file = (File) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                        int i12 = ChatFileProvider.f40341Y;
                        Application application = c7112f.f22641Y;
                        abstractC21955Q1M7520k = new C21952P1(AbstractC17806g.getUriForFile(application, application.getPackageName() + ".files", file));
                    } else if (!(abstractC21955Q1M7520k instanceof C21929J1) && !(abstractC21955Q1M7520k instanceof AbstractC21933K1)) {
                        throw new C0644w();
                    }
                    if (abstractC21955Q1M7520k instanceof C21952P1) {
                        Uri uri = (Uri) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                        inputViewModelImpl.m14397m(new InputViewModelImpl$imageSelect$5(uri));
                        inputViewModelImpl.m14392g(new C19887r(uri));
                    }
                } else if (iOrdinal == 1) {
                    inputViewModelImpl.m14392g(C19886q.f63032a);
                }
            }
            return c17296c;
        }
        inputViewModelImpl = this;
        if (z10) {
            C5365H c5365h2 = C5365H.f17604g;
            EnumC21896B0 enumC21896B1 = EnumC21896B0.Vision;
            c5365h2.getClass();
            inputViewModelImpl.m14393h(new C2058g(c5365h2.m5885a(new C4171z3(enumC21896B1, 13)), true));
            C1970n c1970n3 = inputViewModelImpl.f37884l.f41697b;
            InputViewModelImpl$imageSelect$3 inputViewModelImpl$imageSelect$4 = new InputViewModelImpl$imageSelect$3(2, null);
            inputViewModelImpl$imageSelect$1.f37930Y = inputViewModelImpl;
            inputViewModelImpl$imageSelect$1.f37931Z = enumC19873d;
            inputViewModelImpl$imageSelect$1.f37934q0 = 2;
            objM3221t = AbstractC2124C.m3220s(c1970n3, inputViewModelImpl$imageSelect$4, inputViewModelImpl$imageSelect$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            inputViewModelImpl$imageSelect$1.f37930Y = null;
            inputViewModelImpl$imageSelect$1.f37931Z = null;
            inputViewModelImpl$imageSelect$1.f37934q0 = 3;
            if (inputViewModelImpl.m14262n(enumC19873d, false, inputViewModelImpl$imageSelect$1) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            iOrdinal = enumC19873d.ordinal();
            if (iOrdinal == 0) {
                c7112f = inputViewModelImpl.f37882j;
                abstractC21955Q1M7520k = c7112f.m7520k();
                if (abstractC21955Q1M7520k instanceof C21952P1) {
                    File file2 = (File) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                    int i13 = ChatFileProvider.f40341Y;
                    Application application2 = c7112f.f22641Y;
                    abstractC21955Q1M7520k = new C21952P1(AbstractC17806g.getUriForFile(application2, application2.getPackageName() + ".files", file2));
                } else if (!(abstractC21955Q1M7520k instanceof C21929J1)) {
                    throw new C0644w();
                }
                if (abstractC21955Q1M7520k instanceof C21952P1) {
                    Uri uri2 = (Uri) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                    inputViewModelImpl.m14397m(new InputViewModelImpl$imageSelect$5(uri2));
                    inputViewModelImpl.m14392g(new C19887r(uri2));
                }
            } else if (iOrdinal == 1) {
                inputViewModelImpl.m14392g(C19886q.f63032a);
            }
        }
        return c17296c;
        z10 = !((C1705j) objM3221t).f4873f;
        if (z10) {
            C5365H c5365h3 = C5365H.f17604g;
            EnumC21896B0 enumC21896B2 = EnumC21896B0.Vision;
            c5365h3.getClass();
            inputViewModelImpl.m14393h(new C2058g(c5365h3.m5885a(new C4171z3(enumC21896B2, 13)), true));
            C1970n c1970n4 = inputViewModelImpl.f37884l.f41697b;
            InputViewModelImpl$imageSelect$3 inputViewModelImpl$imageSelect$5 = new InputViewModelImpl$imageSelect$3(2, null);
            inputViewModelImpl$imageSelect$1.f37930Y = inputViewModelImpl;
            inputViewModelImpl$imageSelect$1.f37931Z = enumC19873d;
            inputViewModelImpl$imageSelect$1.f37934q0 = 2;
            objM3221t = AbstractC2124C.m3220s(c1970n4, inputViewModelImpl$imageSelect$5, inputViewModelImpl$imageSelect$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            inputViewModelImpl$imageSelect$1.f37930Y = null;
            inputViewModelImpl$imageSelect$1.f37931Z = null;
            inputViewModelImpl$imageSelect$1.f37934q0 = 3;
            if (inputViewModelImpl.m14262n(enumC19873d, false, inputViewModelImpl$imageSelect$1) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            iOrdinal = enumC19873d.ordinal();
            if (iOrdinal == 0) {
                c7112f = inputViewModelImpl.f37882j;
                abstractC21955Q1M7520k = c7112f.m7520k();
                if (abstractC21955Q1M7520k instanceof C21952P1) {
                    File file3 = (File) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                    int i14 = ChatFileProvider.f40341Y;
                    Application application3 = c7112f.f22641Y;
                    abstractC21955Q1M7520k = new C21952P1(AbstractC17806g.getUriForFile(application3, application3.getPackageName() + ".files", file3));
                } else if (!(abstractC21955Q1M7520k instanceof C21929J1)) {
                    throw new C0644w();
                }
                if (abstractC21955Q1M7520k instanceof C21952P1) {
                    Uri uri3 = (Uri) ((C21952P1) abstractC21955Q1M7520k).f69511a;
                    inputViewModelImpl.m14397m(new InputViewModelImpl$imageSelect$5(uri3));
                    inputViewModelImpl.m14392g(new C19887r(uri3));
                }
            } else if (iOrdinal == 1) {
                inputViewModelImpl.m14392g(C19886q.f63032a);
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: o */
    public final void m14263o(Uri file, EnumC18991F enumC18991F, EnumC21968V0 enumC21968V0, String str, String str2, Uri uri) {
        C7112f c7112f = this.f37882j;
        c7112f.getClass();
        AbstractC16544l.m18094g(file, "file");
        C2219z0 c2219z0 = new C2219z0(new C7111e(enumC18991F, c7112f, file, uri, str2, str, null));
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3224w(c2219z0, ExecutorC3515d.f10633Z), 5, new InputViewModelImpl$uploadFile$1(enumC18991F, enumC21968V0, this, file, null)), ViewModelKt.m12143a(this));
    }
}
