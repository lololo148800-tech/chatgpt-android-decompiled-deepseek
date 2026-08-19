package com.openai.feature.onboarding.impl.viewmodel;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11422v;
import com.openai.chatgpt.R;
import com.openai.viewmodel.BaseViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import io.sentry.util.C15504i;
import kg.C16411q;
import kg.C16412r;
import kg.C16414t;
import kg.C16415u;
import kg.C16416v;
import kg.C16417w;
import kg.C16419y;
import kg.InterfaceC16413s;
import kg.InterfaceC16418x;
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
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1009s9.C19501d;
import p1022t9.C19820e;
import p1022t9.InterfaceC19817b;
import p103Dn.AbstractC2124C;
import p103Dn.C2172c;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1113xn.C21319m;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21895B;
import p115E9.AbstractC2359a;
import p140Fa.C2685e;
import p166Ga.C3029c;
import p195Hh.C3430e;
import p318Mh.C5391c;
import p318Mh.C5392c0;
import p318Mh.C5402h0;
import p356O9.AbstractC6144b;
import p356O9.C6143a;
import p457Sh.C7137e;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10307c;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p623Zf.EnumC10304F;
import p746fa.AbstractC13600i;
import p746fa.C13606o;
import p835jg.AbstractC16208c;
import p835jg.C16207b;
import p909nm.C17690x;
import p920o9.AbstractC18031a;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyPhoneViewModel;", "Lcom/openai/viewmodel/BaseViewModel;", "Lkg/y;", "Lkg/x;", "Lkg/s;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyPhoneViewModel extends BaseViewModel<C16419y, InterfaceC16418x, InterfaceC16413s> {

    /* JADX INFO: renamed from: i */
    public final C11422v f39324i;

    /* JADX INFO: renamed from: j */
    public final C1991h f39325j;

    /* JADX INFO: renamed from: k */
    public final EnumC21895B f39326k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f39327l;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$1", m20656f = "VerifyPhoneViewModel.kt", m20657l = {64, 66}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124671 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39328Y;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/y;", "invoke", "(Lkg/y;)Lkg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ String f39330Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str) {
                super(1);
                this.f39330Y = str;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16419y setState = (C16419y) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C16419y.m18007e(setState, this.f39330Y, null, null, false, 14);
            }
        }

        public C124671(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VerifyPhoneViewModel.this.new C124671(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124671) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39328Y;
            VerifyPhoneViewModel verifyPhoneViewModel = VerifyPhoneViewModel.this;
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
            C1970n c1970n = verifyPhoneViewModel.f39324i.f34496h;
            this.f39328Y = 1;
            obj = AbstractC2124C.m3221t(c1970n, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            C10307c c10307c = ((C10330z) obj).f30658b;
            verifyPhoneViewModel.m14397m(new AnonymousClass1(c10307c != null ? c10307c.f30601c : null));
            this.f39328Y = 2;
            if (VerifyPhoneViewModel.m14337n(verifyPhoneViewModel, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$2", m20656f = "VerifyPhoneViewModel.kt", m20657l = {70}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124682 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39331Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ Application f39332Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ VerifyPhoneViewModel f39333o0;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$2$1", m20656f = "VerifyPhoneViewModel.kt", m20657l = {72}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "code", "Lmm/C;", "<anonymous>", "(Ljava/lang/String;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public int f39334Y;

            /* JADX INFO: renamed from: Z */
            public /* synthetic */ Object f39335Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ VerifyPhoneViewModel f39336o0;

            /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/y;", "invoke", "(Lkg/y;)Lkg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
            final class C222261 extends AbstractC16546n implements InterfaceC1436k {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ String f39337Y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222261(String str) {
                    super(1);
                    this.f39337Y = str;
                }

                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj) {
                    C16419y setState = (C16419y) obj;
                    AbstractC16544l.m18094g(setState, "$this$setState");
                    return C16419y.m18007e(setState, null, this.f39337Y, null, false, 13);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VerifyPhoneViewModel verifyPhoneViewModel, InterfaceC18770c interfaceC18770c) {
                super(2, interfaceC18770c);
                this.f39336o0 = verifyPhoneViewModel;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39336o0, interfaceC18770c);
                anonymousClass1.f39335Z = obj;
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((String) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f39334Y;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C222261 c222261 = new C222261((String) this.f39335Z);
                    VerifyPhoneViewModel verifyPhoneViewModel = this.f39336o0;
                    verifyPhoneViewModel.m14397m(c222261);
                    this.f39334Y = 1;
                    if (VerifyPhoneViewModel.m14338o(verifyPhoneViewModel, this) == enumC19250a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124682(Application application, VerifyPhoneViewModel verifyPhoneViewModel, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39332Z = application;
            this.f39333o0 = verifyPhoneViewModel;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C124682(this.f39332Z, this.f39333o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124682) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            int i10 = 1;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i11 = this.f39331Y;
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C21319m c21319m = AbstractC16208c.f50291a;
                Application application = this.f39332Z;
                C3430e c3430eM8749b = AbstractC8168p6.m8749b("otpRetrieverFlow", null);
                C6143a c6143a = new C6143a(application, null, AbstractC18031a.f57556k, InterfaceC19817b.f62869l0, C19820e.f62871c);
                C3029c c3029cM3900d = C3029c.m3900d();
                c3029cM3900d.f9119d = new C2685e();
                c3029cM3900d.f9120e = new C19501d[]{AbstractC6144b.f20028a};
                c3029cM3900d.f9117b = 1567;
                C13606o c13606oM20770b = c6143a.m20770b(1, c3029cM3900d.m3904c());
                C15504i c15504i = new C15504i(new C7137e(c3430eM8749b, i10), 2);
                c13606oM20770b.getClass();
                c13606oM20770b.m15126e(AbstractC13600i.f42962a, c15504i);
                c13606oM20770b.m15124c(new C15504i(c3430eM8749b, 3));
                C2172c c2172c = new C2172c(new C16207b(application, c3430eM8749b, null), C18777j.f59682Y, -2, EnumC1733a.f4961Y);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39333o0, null);
                this.f39331Y = 1;
                if (AbstractC2124C.m3212k(c2172c, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    public VerifyPhoneViewModel(Application application, C11422v c11422v, C1991h c1991h, EnumC21895B enumC21895B, InterfaceC20904w interfaceC20904w) {
        super(new C16419y(null, "", null, false));
        this.f39324i = c11422v;
        this.f39325j = c1991h;
        this.f39326k = enumC21895B;
        this.f39327l = interfaceC20904w;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124671(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124682(application, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14337n(VerifyPhoneViewModel verifyPhoneViewModel, AbstractC19687c abstractC19687c) {
        VerifyPhoneViewModel$requestOtpCode$1 verifyPhoneViewModel$requestOtpCode$1;
        verifyPhoneViewModel.getClass();
        if (abstractC19687c instanceof VerifyPhoneViewModel$requestOtpCode$1) {
            verifyPhoneViewModel$requestOtpCode$1 = (VerifyPhoneViewModel$requestOtpCode$1) abstractC19687c;
            int i10 = verifyPhoneViewModel$requestOtpCode$1.f39344p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyPhoneViewModel$requestOtpCode$1.f39344p0 = i10 - Integer.MIN_VALUE;
            } else {
                verifyPhoneViewModel$requestOtpCode$1 = new VerifyPhoneViewModel$requestOtpCode$1(verifyPhoneViewModel, abstractC19687c);
            }
        } else {
            verifyPhoneViewModel$requestOtpCode$1 = new VerifyPhoneViewModel$requestOtpCode$1(verifyPhoneViewModel, abstractC19687c);
        }
        Object objM12788c = verifyPhoneViewModel$requestOtpCode$1.f39342Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = verifyPhoneViewModel$requestOtpCode$1.f39344p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM12788c);
            if (!(((C16419y) verifyPhoneViewModel.m14391f()).f50947c instanceof C21917G1)) {
                verifyPhoneViewModel$requestOtpCode$1.f39341Y = verifyPhoneViewModel;
                verifyPhoneViewModel$requestOtpCode$1.f39344p0 = 1;
                objM12788c = verifyPhoneViewModel.f39324i.m12788c(verifyPhoneViewModel$requestOtpCode$1);
                if (objM12788c == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        verifyPhoneViewModel = verifyPhoneViewModel$requestOtpCode$1.f39341Y;
        AbstractC9233X.m9807c(objM12788c);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM12788c;
        if (abstractC21955Q1 instanceof C21952P1) {
            verifyPhoneViewModel.m14392g(C16412r.f50940a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            verifyPhoneViewModel.f39327l.mo21447a(C20877X.f66481r, C17690x.f56481Y);
            verifyPhoneViewModel.m14397m(VerifyPhoneViewModel$requestOtpCode$3$1.f39345Y);
            C1991h c1991h = verifyPhoneViewModel.f39325j;
            verifyPhoneViewModel.m14393h(new C2059h(AbstractC8458C2.m9074b((AbstractC21933K1) abstractC21955Q1, c1991h, verifyPhoneViewModel.f39326k, c1991h.m3160b(R.string.onboarding_verify_phone_error))));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14338o(VerifyPhoneViewModel verifyPhoneViewModel, AbstractC19687c abstractC19687c) {
        VerifyPhoneViewModel$submitCode$1 verifyPhoneViewModel$submitCode$1;
        EnumC10304F enumC10304F;
        verifyPhoneViewModel.getClass();
        if (abstractC19687c instanceof VerifyPhoneViewModel$submitCode$1) {
            verifyPhoneViewModel$submitCode$1 = (VerifyPhoneViewModel$submitCode$1) abstractC19687c;
            int i10 = verifyPhoneViewModel$submitCode$1.f39350q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyPhoneViewModel$submitCode$1.f39350q0 = i10 - Integer.MIN_VALUE;
            } else {
                verifyPhoneViewModel$submitCode$1 = new VerifyPhoneViewModel$submitCode$1(verifyPhoneViewModel, abstractC19687c);
            }
        } else {
            verifyPhoneViewModel$submitCode$1 = new VerifyPhoneViewModel$submitCode$1(verifyPhoneViewModel, abstractC19687c);
        }
        Object objM12793h = verifyPhoneViewModel$submitCode$1.f39348o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = verifyPhoneViewModel$submitCode$1.f39350q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                verifyPhoneViewModel = (VerifyPhoneViewModel) verifyPhoneViewModel$submitCode$1.f39346Y;
                AbstractC9233X.m9807c(objM12793h);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                verifyPhoneViewModel = verifyPhoneViewModel$submitCode$1.f39347Z;
                enumC10304F = (EnumC10304F) verifyPhoneViewModel$submitCode$1.f39346Y;
                AbstractC9233X.m9807c(objM12793h);
            }
            verifyPhoneViewModel.m14392g(new C16411q(AbstractC2359a.m3444c(enumC10304F, (C10327w) objM12793h), false));
            return c17296c;
        }
        AbstractC9233X.m9807c(objM12793h);
        C16419y c16419y = (C16419y) verifyPhoneViewModel.m14391f();
        if (!(c16419y.f50947c instanceof C21917G1)) {
            verifyPhoneViewModel.f39327l.mo21447a(C20877X.f66483t, C17690x.f56481Y);
            verifyPhoneViewModel.m14397m(VerifyPhoneViewModel$submitCode$2.f39351Y);
            verifyPhoneViewModel$submitCode$1.f39346Y = verifyPhoneViewModel;
            verifyPhoneViewModel$submitCode$1.f39350q0 = 1;
            objM12793h = verifyPhoneViewModel.f39324i.m12793h(c16419y.f50946b, verifyPhoneViewModel$submitCode$1);
            if (objM12793h == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM12793h;
        if (abstractC21955Q1 instanceof C21952P1) {
            EnumC10304F enumC10304F2 = EnumC10304F.f30596t0;
            C11422v c11422v = verifyPhoneViewModel.f39324i;
            verifyPhoneViewModel$submitCode$1.f39346Y = enumC10304F2;
            verifyPhoneViewModel$submitCode$1.f39347Z = verifyPhoneViewModel;
            verifyPhoneViewModel$submitCode$1.f39350q0 = 2;
            Object objM12787b = c11422v.m12787b(verifyPhoneViewModel$submitCode$1);
            if (objM12787b == enumC19250a) {
                return enumC19250a;
            }
            enumC10304F = enumC10304F2;
            objM12793h = objM12787b;
            verifyPhoneViewModel.m14392g(new C16411q(AbstractC2359a.m3444c(enumC10304F, (C10327w) objM12793h), false));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            verifyPhoneViewModel.m14397m(new VerifyPhoneViewModel$submitCode$4$1(abstractC21933K1));
            verifyPhoneViewModel.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, verifyPhoneViewModel.f39325j, verifyPhoneViewModel.f39326k, null)));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC16418x intent = (InterfaceC16418x) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C16417w) {
            m14397m(new VerifyPhoneViewModel$onIntent$1(intent));
            return;
        }
        if (intent instanceof C16416v) {
            m14394i(new VerifyPhoneViewModel$onIntent$2(this, null));
            return;
        }
        boolean z6 = intent instanceof C16415u;
        C5391c c5391c = C5391c.f17646Z;
        if (z6) {
            this.f39327l.mo21447a(C20877X.f66485v, C17690x.f56481Y);
            C5402h0 c5402h0 = C5402h0.f17667h;
            c5402h0.getClass();
            m14392g(new C16411q(c5402h0.m5885a(c5391c), true));
            return;
        }
        if (intent instanceof C16414t) {
            C5392c0 c5392c0 = C5392c0.f17654h;
            c5392c0.getClass();
            m14392g(new C16411q(c5392c0.m5885a(c5391c), true));
        }
    }
}
