package com.openai.feature.onboarding.impl.viewmodel;

import ai.AbstractC10620k;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11416p;
import bg.C11422v;
import com.openai.chatgpt.R;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.Iterator;
import java.util.List;
import kg.C16397c;
import kg.C16398d;
import kg.C16399e;
import kg.C16400f;
import kg.C16401g;
import kg.C16402h;
import kg.C16404j;
import kg.InterfaceC16403i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p115E9.AbstractC2359a;
import p171Gh.EnumC3058a;
import p200Hm.C3508g;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5531a;
import p324Mn.C5551u;
import p324Mn.C5554x;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8519M3;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10307c;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p623Zf.EnumC10304F;
import p817j$.time.chrono.ChronoLocalDate;
import p872lg.C16946f;
import p909nm.C17689w;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModelImpl;", "Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FinishAccountViewModelImpl extends FinishAccountViewModel {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f39108n = 0;

    /* JADX INFO: renamed from: i */
    public final C11422v f39109i;

    /* JADX INFO: renamed from: j */
    public final AbstractC21864z f39110j;

    /* JADX INFO: renamed from: k */
    public final C1991h f39111k;

    /* JADX INFO: renamed from: l */
    public final C5531a f39112l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC20904w f39113m;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$1", m20656f = "FinishAccountViewModel.kt", m20657l = {91}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124521 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39114Y;

        public C124521(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return FinishAccountViewModelImpl.this.new C124521(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124521) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39114Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39114Y = 1;
                if (FinishAccountViewModelImpl.m14326o(FinishAccountViewModelImpl.this, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$2", m20656f = "FinishAccountViewModel.kt", m20657l = {94}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124532 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39116Y;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/j;", "invoke", "(Lkg/j;)Lkg/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ FinishAccountViewModelImpl f39118Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C10330z f39119Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C10327w f39120o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FinishAccountViewModelImpl finishAccountViewModelImpl, C10330z c10330z, C10327w c10327w) {
                super(1);
                this.f39118Y = finishAccountViewModelImpl;
                this.f39119Z = c10330z;
                this.f39120o0 = c10327w;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x004a  */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                boolean z6;
                String str;
                String str2;
                C16946f c16946f;
                List list;
                Object next;
                List list2;
                C16946f c16946f2;
                C16404j setState = (C16404j) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                int i10 = FinishAccountViewModelImpl.f39108n;
                FinishAccountViewModelImpl finishAccountViewModelImpl = this.f39118Y;
                finishAccountViewModelImpl.getClass();
                C10330z c10330z = this.f39119Z;
                C5551u c5551u = c10330z.f30660d;
                if (c5551u != null) {
                    C5551u c5551uM5929a = finishAccountViewModelImpl.f39112l.m5929a();
                    int i11 = AbstractC10620k.f31511a;
                    C5525F.Companion.getClass();
                    if (AbstractC8519M3.m9187a(c5551uM5929a, C5524E.m5924a()).f17975Y.getHour() - AbstractC8519M3.m9187a(c5551u, C5524E.m5924a()).f17975Y.getHour() < 12) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                C10307c c10307c = c10330z.f30658b;
                C10327w c10327w = this.f39120o0;
                if (c10307c == null || (str = c10307c.f30599a) == null) {
                    str = c10327w != null ? c10327w.f30645a : null;
                }
                if (c10307c == null || (str2 = c10307c.f30600b) == null) {
                    str2 = c10327w != null ? c10327w.f30646b : null;
                }
                String str3 = c10307c != null ? c10307c.f30601c : null;
                if (c10307c != null && (c16946f2 = c10307c.f30602d) != null) {
                    c16946f = c16946f2;
                } else if (c10327w == null || (list = c10327w.f30653i) == null) {
                    c16946f = null;
                } else {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC16544l.m18089b(((C16946f) next).f54394a, c10327w.f30651g));
                    c16946f = (C16946f) next;
                }
                if (c10327w == null || (list2 = c10327w.f30653i) == null) {
                    list2 = setState.f50922g;
                }
                return C16404j.m18004e(setState, str, str2, null, str3, null, c16946f, list2, z6, false, false, AbstractC16544l.m18089b(c10327w != null ? c10327w.f30651g : null, EnumC3058a.KO_KR.f9226Y.getCountry()), c10327w != null && c10327w.f30650f, 788);
            }
        }

        public C124532(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return FinishAccountViewModelImpl.this.new C124532(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124532) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39116Y;
            FinishAccountViewModelImpl finishAccountViewModelImpl = FinishAccountViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C1970n c1970n = finishAccountViewModelImpl.f39109i.f34496h;
                this.f39116Y = 1;
                obj = AbstractC2124C.m3221t(c1970n, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            C10330z c10330z = (C10330z) obj;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(finishAccountViewModelImpl, c10330z, c10330z.f30661e);
            int i11 = FinishAccountViewModelImpl.f39108n;
            finishAccountViewModelImpl.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$3", m20656f = "FinishAccountViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lkg/j;", "it", "Lmm/C;", "<anonymous>", "(Lkg/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124543 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/j;", "invoke", "(Lkg/j;)Lkg/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ FinishAccountViewModelImpl f39122Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FinishAccountViewModelImpl finishAccountViewModelImpl) {
                super(1);
                this.f39122Y = finishAccountViewModelImpl;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16404j setState = (C16404j) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C3508g c3508gM8929t = AbstractC8301I.m8929t(2, 18);
                C5554x c5554x = setState.f50918c;
                Integer numValueOf = c5554x != null ? Integer.valueOf(AbstractC10620k.m10994j(c5554x, this.f39122Y.f39112l.m5929a())) : null;
                return C16404j.m18004e(setState, null, null, null, null, null, null, null, false, false, numValueOf != null && c3508gM8929t.m4200j(numValueOf.intValue()), false, false, 3583);
            }
        }

        public C124543(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return FinishAccountViewModelImpl.this.new C124543(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124543 c124543 = (C124543) create((C16404j) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124543.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            FinishAccountViewModelImpl finishAccountViewModelImpl = FinishAccountViewModelImpl.this;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(finishAccountViewModelImpl);
            int i10 = FinishAccountViewModelImpl.f39108n;
            finishAccountViewModelImpl.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/FinishAccountViewModelImpl$Companion;", "", "()V", "CONSENT_THRESHOLD", "", "INVALID_THRESHOLD", "MAX_NAME_LENGTH", "TOS_DATE_RETRY_HOURS", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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

    public FinishAccountViewModelImpl(C11422v c11422v, AbstractC21864z abstractC21864z, C1991h c1991h, C5531a c5531a, InterfaceC20904w interfaceC20904w) {
        super(new C16404j(null, null, null, null, null, null, C17689w.f56480Y, false, false, false, false, false));
        this.f39109i = c11422v;
        this.f39110j = abstractC21864z;
        this.f39111k = c1991h;
        this.f39112l = c5531a;
        this.f39113m = interfaceC20904w;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124521(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124532(null), 3);
        AbstractC2124C.m3226y(new C1970n(this.f40343c, 5, new C124543(null)), ViewModelKt.m12143a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14326o(FinishAccountViewModelImpl finishAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        FinishAccountViewModelImpl$fetchConfig$1 finishAccountViewModelImpl$fetchConfig$1;
        finishAccountViewModelImpl.getClass();
        if (abstractC19687c instanceof FinishAccountViewModelImpl$fetchConfig$1) {
            finishAccountViewModelImpl$fetchConfig$1 = (FinishAccountViewModelImpl$fetchConfig$1) abstractC19687c;
            int i10 = finishAccountViewModelImpl$fetchConfig$1.f39126p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                finishAccountViewModelImpl$fetchConfig$1.f39126p0 = i10 - Integer.MIN_VALUE;
            } else {
                finishAccountViewModelImpl$fetchConfig$1 = new FinishAccountViewModelImpl$fetchConfig$1(finishAccountViewModelImpl, abstractC19687c);
            }
        } else {
            finishAccountViewModelImpl$fetchConfig$1 = new FinishAccountViewModelImpl$fetchConfig$1(finishAccountViewModelImpl, abstractC19687c);
        }
        Object objM1183l = finishAccountViewModelImpl$fetchConfig$1.f39124Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = finishAccountViewModelImpl$fetchConfig$1.f39126p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1183l);
            finishAccountViewModelImpl$fetchConfig$1.f39123Y = finishAccountViewModelImpl;
            finishAccountViewModelImpl$fetchConfig$1.f39126p0 = 1;
            C11422v c11422v = finishAccountViewModelImpl.f39109i;
            c11422v.getClass();
            objM1183l = AbstractC0575H.m1183l(new C11416p(c11422v, null), finishAccountViewModelImpl$fetchConfig$1);
            if (objM1183l == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finishAccountViewModelImpl = finishAccountViewModelImpl$fetchConfig$1.f39123Y;
            AbstractC9233X.m9807c(objM1183l);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM1183l;
        if (abstractC21955Q1 instanceof C21952P1) {
            finishAccountViewModelImpl.m14397m(new FinishAccountViewModelImpl$fetchConfig$2$1((C10327w) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            finishAccountViewModelImpl.m14393h(new C2059h(finishAccountViewModelImpl.f39111k.m3160b(R.string.onboarding_fetch_error)));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14327p(FinishAccountViewModelImpl finishAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        FinishAccountViewModelImpl$submitInfo$1 finishAccountViewModelImpl$submitInfo$1;
        C5554x c5554x;
        FinishAccountViewModelImpl finishAccountViewModelImpl2;
        C5554x c5554x2;
        C16404j c16404j;
        int i10;
        C16404j c16404j2;
        FinishAccountViewModelImpl finishAccountViewModelImpl3;
        FinishAccountViewModelImpl finishAccountViewModelImpl4;
        EnumC10304F enumC10304F;
        Object objM12787b;
        FinishAccountViewModelImpl finishAccountViewModelImpl5;
        EnumC10304F enumC10304F2;
        finishAccountViewModelImpl.getClass();
        if (abstractC19687c instanceof FinishAccountViewModelImpl$submitInfo$1) {
            finishAccountViewModelImpl$submitInfo$1 = (FinishAccountViewModelImpl$submitInfo$1) abstractC19687c;
            int i11 = finishAccountViewModelImpl$submitInfo$1.f39145t0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                finishAccountViewModelImpl$submitInfo$1.f39145t0 = i11 - Integer.MIN_VALUE;
            } else {
                finishAccountViewModelImpl$submitInfo$1 = new FinishAccountViewModelImpl$submitInfo$1(finishAccountViewModelImpl, abstractC19687c);
            }
        } else {
            finishAccountViewModelImpl$submitInfo$1 = new FinishAccountViewModelImpl$submitInfo$1(finishAccountViewModelImpl, abstractC19687c);
        }
        Object obj = finishAccountViewModelImpl$submitInfo$1.f39143r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = finishAccountViewModelImpl$submitInfo$1.f39145t0;
        C17296C c17296c = C17296C.f55119a;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            C16404j c16404j3 = (C16404j) finishAccountViewModelImpl.m14391f();
            if (c16404j3.m18005f()) {
                finishAccountViewModelImpl.f39113m.mo21447a(C20877X.f66479p, C17690x.f56481Y);
                c5554x = c16404j3.f50918c;
                if (c5554x == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (AbstractC10620k.m10994j(c5554x, finishAccountViewModelImpl.f39112l.m5929a()) <= 1) {
                    finishAccountViewModelImpl.m14397m(new FinishAccountViewModelImpl$submitInfo$2(finishAccountViewModelImpl));
                } else {
                    finishAccountViewModelImpl$submitInfo$1.f39138Y = finishAccountViewModelImpl;
                    finishAccountViewModelImpl$submitInfo$1.f39139Z = c16404j3;
                    finishAccountViewModelImpl$submitInfo$1.f39140o0 = c5554x;
                    finishAccountViewModelImpl$submitInfo$1.f39141p0 = c5554x;
                    finishAccountViewModelImpl$submitInfo$1.f39145t0 = 1;
                    Object objM12787b2 = finishAccountViewModelImpl.f39109i.m12787b(finishAccountViewModelImpl$submitInfo$1);
                    if (objM12787b2 == enumC19250a) {
                        return enumC19250a;
                    }
                    finishAccountViewModelImpl2 = finishAccountViewModelImpl;
                    c5554x2 = c5554x;
                    c16404j = c16404j3;
                    obj = objM12787b2;
                }
            }
            return c17296c;
        }
        if (i12 == 1) {
            c5554x2 = finishAccountViewModelImpl$submitInfo$1.f39141p0;
            c5554x = finishAccountViewModelImpl$submitInfo$1.f39140o0;
            c16404j = (C16404j) finishAccountViewModelImpl$submitInfo$1.f39139Z;
            finishAccountViewModelImpl2 = finishAccountViewModelImpl$submitInfo$1.f39138Y;
            AbstractC9233X.m9807c(obj);
        } else {
            if (i12 == 2) {
                i10 = finishAccountViewModelImpl$submitInfo$1.f39142q0;
                c5554x = finishAccountViewModelImpl$submitInfo$1.f39140o0;
                c16404j2 = (C16404j) finishAccountViewModelImpl$submitInfo$1.f39139Z;
                finishAccountViewModelImpl3 = finishAccountViewModelImpl$submitInfo$1.f39138Y;
                AbstractC9233X.m9807c(obj);
                finishAccountViewModelImpl2 = finishAccountViewModelImpl3;
                c16404j = c16404j2;
                if (c16404j.f50923h && i10 == 0) {
                    C11422v c11422v = finishAccountViewModelImpl2.f39109i;
                    FinishAccountViewModelImpl$submitInfo$6 finishAccountViewModelImpl$submitInfo$6 = new FinishAccountViewModelImpl$submitInfo$6(c16404j, c5554x);
                    finishAccountViewModelImpl$submitInfo$1.f39138Y = finishAccountViewModelImpl2;
                    finishAccountViewModelImpl$submitInfo$1.f39139Z = null;
                    finishAccountViewModelImpl$submitInfo$1.f39140o0 = null;
                    finishAccountViewModelImpl$submitInfo$1.f39141p0 = null;
                    finishAccountViewModelImpl$submitInfo$1.f39145t0 = 3;
                    if (c11422v.m12791f(finishAccountViewModelImpl$submitInfo$6, finishAccountViewModelImpl$submitInfo$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    finishAccountViewModelImpl4 = finishAccountViewModelImpl2;
                    enumC10304F = EnumC10304F.f30593q0;
                    C11422v c11422v2 = finishAccountViewModelImpl4.f39109i;
                    finishAccountViewModelImpl$submitInfo$1.f39138Y = finishAccountViewModelImpl4;
                    finishAccountViewModelImpl$submitInfo$1.f39139Z = enumC10304F;
                    finishAccountViewModelImpl$submitInfo$1.f39145t0 = 4;
                    objM12787b = c11422v2.m12787b(finishAccountViewModelImpl$submitInfo$1);
                    if (objM12787b == enumC19250a) {
                        return enumC19250a;
                    }
                    finishAccountViewModelImpl5 = finishAccountViewModelImpl4;
                    enumC10304F2 = enumC10304F;
                    obj = objM12787b;
                } else {
                    finishAccountViewModelImpl2.m14393h(new C2059h(finishAccountViewModelImpl2.f39111k.m3160b(R.string.onboarding_invalid_date_tos)));
                }
                return c17296c;
            }
            if (i12 == 3) {
                finishAccountViewModelImpl4 = finishAccountViewModelImpl$submitInfo$1.f39138Y;
                AbstractC9233X.m9807c(obj);
                enumC10304F = EnumC10304F.f30593q0;
                C11422v c11422v3 = finishAccountViewModelImpl4.f39109i;
                finishAccountViewModelImpl$submitInfo$1.f39138Y = finishAccountViewModelImpl4;
                finishAccountViewModelImpl$submitInfo$1.f39139Z = enumC10304F;
                finishAccountViewModelImpl$submitInfo$1.f39145t0 = 4;
                objM12787b = c11422v3.m12787b(finishAccountViewModelImpl$submitInfo$1);
                if (objM12787b == enumC19250a) {
                    return enumC19250a;
                }
                finishAccountViewModelImpl5 = finishAccountViewModelImpl4;
                enumC10304F2 = enumC10304F;
                obj = objM12787b;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC10304F2 = (EnumC10304F) finishAccountViewModelImpl$submitInfo$1.f39139Z;
                finishAccountViewModelImpl5 = finishAccountViewModelImpl$submitInfo$1.f39138Y;
                AbstractC9233X.m9807c(obj);
            }
        }
        finishAccountViewModelImpl5.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F2, (C10327w) obj), true));
        return c17296c;
        C5554x other = ((C10327w) obj).f30652h;
        c5554x2.getClass();
        AbstractC16544l.m18094g(other, "other");
        i10 = c5554x2.f18006Y.compareTo((ChronoLocalDate) other.f18006Y) > 0 ? 1 : 0;
        if (i10 != 0) {
            finishAccountViewModelImpl2.f39113m.mo21447a(C20877X.f66464D, C17690x.f56481Y);
            if (c16404j.f50924i) {
                finishAccountViewModelImpl2.m14397m(FinishAccountViewModelImpl$submitInfo$3.f39147Y);
                FinishAccountViewModelImpl$submitInfo$4 finishAccountViewModelImpl$submitInfo$4 = new FinishAccountViewModelImpl$submitInfo$4(finishAccountViewModelImpl2);
                finishAccountViewModelImpl$submitInfo$1.f39138Y = finishAccountViewModelImpl2;
                finishAccountViewModelImpl$submitInfo$1.f39139Z = c16404j;
                finishAccountViewModelImpl$submitInfo$1.f39140o0 = c5554x;
                finishAccountViewModelImpl$submitInfo$1.f39141p0 = null;
                finishAccountViewModelImpl$submitInfo$1.f39142q0 = i10;
                finishAccountViewModelImpl$submitInfo$1.f39145t0 = 2;
                if (finishAccountViewModelImpl2.f39109i.m12791f(finishAccountViewModelImpl$submitInfo$4, finishAccountViewModelImpl$submitInfo$1) == enumC19250a) {
                    return enumC19250a;
                }
                c16404j2 = c16404j;
                finishAccountViewModelImpl3 = finishAccountViewModelImpl2;
                finishAccountViewModelImpl2 = finishAccountViewModelImpl3;
                c16404j = c16404j2;
            } else {
                finishAccountViewModelImpl2.m14397m(FinishAccountViewModelImpl$submitInfo$5.f39149Y);
            }
        }
        if (c16404j.f50923h) {
        }
        finishAccountViewModelImpl2.m14393h(new C2059h(finishAccountViewModelImpl2.f39111k.m3160b(R.string.onboarding_invalid_date_tos)));
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC16403i intent = (InterfaceC16403i) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean z6 = intent instanceof C16400f;
        InterfaceC20904w interfaceC20904w = this.f39113m;
        if (z6) {
            interfaceC20904w.mo21447a(C20877X.f66475l, C17690x.f56481Y);
            m14397m(new FinishAccountViewModelImpl$onIntent$1(intent));
            return;
        }
        if (intent instanceof C16401g) {
            interfaceC20904w.mo21447a(C20877X.f66476m, C17690x.f56481Y);
            m14397m(new FinishAccountViewModelImpl$onIntent$2(intent));
            return;
        }
        if (intent instanceof C16398d) {
            interfaceC20904w.mo21447a(C20877X.f66461A, C17690x.f56481Y);
            m14397m(new FinishAccountViewModelImpl$onIntent$3(intent));
        } else if (intent instanceof C16402h) {
            m14397m(new FinishAccountViewModelImpl$onIntent$4(intent));
        } else if (intent instanceof C16399e) {
            m14397m(new FinishAccountViewModelImpl$onIntent$5(intent));
        } else if (intent instanceof C16397c) {
            m14394i(new FinishAccountViewModelImpl$onIntent$6(this, null));
        }
    }

    @Override // com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel
    /* JADX INFO: renamed from: n */
    public final void mo14325n(Context activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.f39113m.mo21447a(C20877X.f66478o, C17690x.f56481Y);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new FinishAccountViewModelImpl$logout$1(this, activity, null), 3);
    }
}
