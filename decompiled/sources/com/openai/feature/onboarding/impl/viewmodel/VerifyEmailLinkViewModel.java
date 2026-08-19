package com.openai.feature.onboarding.impl.viewmodel;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11422v;
import com.openai.chatgpt.R;
import com.openai.viewmodel.BaseViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kg.C16406l;
import kg.C16407m;
import kg.C16408n;
import kg.C16410p;
import kg.InterfaceC16409o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17314q;
import p014Ac.C0425b;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21895B;
import p115E9.AbstractC2359a;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p623Zf.EnumC10304F;
import p905nd.C17589q;
import p909nm.AbstractC17665J;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailLinkViewModel;", "Lcom/openai/viewmodel/BaseViewModel;", "Lkg/p;", "Lkg/o;", "", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailLinkViewModel extends BaseViewModel<C16410p, InterfaceC16409o, Object> {

    /* JADX INFO: renamed from: n */
    public static final Companion f39280n = new Companion(0);

    /* JADX INFO: renamed from: o */
    public static final C17314q f39281o = AbstractC9227W.m9800c(VerifyEmailLinkViewModel$Companion$emailIntent$2.f39291Y);

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f39282i;

    /* JADX INFO: renamed from: j */
    public final C1991h f39283j;

    /* JADX INFO: renamed from: k */
    public final C11422v f39284k;

    /* JADX INFO: renamed from: l */
    public final AbstractC21864z f39285l;

    /* JADX INFO: renamed from: m */
    public final EnumC21895B f39286m;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel$1", m20656f = "VerifyEmailLinkViewModel.kt", m20657l = {62, 64}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124661 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39287Y;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/p;", "invoke", "(Lkg/p;)Lkg/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C10330z f39289Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C10330z c10330z) {
                super(1);
                this.f39289Y = c10330z;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C16410p setState = (C16410p) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C16410p.m18006e(setState, this.f39289Y.f30657a, null, null, 12);
            }
        }

        public C124661(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VerifyEmailLinkViewModel.this.new C124661(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124661) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39287Y;
            VerifyEmailLinkViewModel verifyEmailLinkViewModel = VerifyEmailLinkViewModel.this;
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
            C1970n c1970n = verifyEmailLinkViewModel.f39284k.f34496h;
            VerifyEmailLinkViewModel$1$state$1 verifyEmailLinkViewModel$1$state$1 = new VerifyEmailLinkViewModel$1$state$1(2, null);
            this.f39287Y = 1;
            obj = AbstractC2124C.m3220s(c1970n, verifyEmailLinkViewModel$1$state$1, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((C10330z) obj);
            Companion companion = VerifyEmailLinkViewModel.f39280n;
            verifyEmailLinkViewModel.m14397m(anonymousClass1);
            this.f39287Y = 2;
            if (VerifyEmailLinkViewModel.m14334n(verifyEmailLinkViewModel, false, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailLinkViewModel$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VerifyEmailLinkViewModel(C11082S c11082s, InterfaceC20904w interfaceC20904w, C1991h c1991h, C11422v c11422v, AbstractC21864z abstractC21864z, EnumC21895B enumC21895B) {
        super(new C16410p(null, true, null, null));
        this.f39282i = interfaceC20904w;
        this.f39283j = c1991h;
        this.f39284k = c11422v;
        this.f39285l = abstractC21864z;
        this.f39286m = enumC21895B;
        C20877X c20877x = C20877X.f66470g;
        C17690x c17690x = C17690x.f56481Y;
        interfaceC20904w.mo21447a(c20877x, c17690x);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124661(null), 3);
        if (AbstractC17665J.m19266f(AbstractC17665J.m19266f(c11082s.f33411a.keySet(), c11082s.f33412b.keySet()), c11082s.f33413c.keySet()).isEmpty()) {
            return;
        }
        interfaceC20904w.mo21447a(C20877X.f66472i, c17690x);
    }

    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14334n(VerifyEmailLinkViewModel verifyEmailLinkViewModel, boolean z6, AbstractC19687c abstractC19687c) {
        VerifyEmailLinkViewModel$checkVerification$1 verifyEmailLinkViewModel$checkVerification$1;
        EnumC10304F enumC10304F;
        verifyEmailLinkViewModel.getClass();
        if (abstractC19687c instanceof VerifyEmailLinkViewModel$checkVerification$1) {
            verifyEmailLinkViewModel$checkVerification$1 = (VerifyEmailLinkViewModel$checkVerification$1) abstractC19687c;
            int i10 = verifyEmailLinkViewModel$checkVerification$1.f39297r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyEmailLinkViewModel$checkVerification$1.f39297r0 = i10 - Integer.MIN_VALUE;
            } else {
                verifyEmailLinkViewModel$checkVerification$1 = new VerifyEmailLinkViewModel$checkVerification$1(verifyEmailLinkViewModel, abstractC19687c);
            }
        } else {
            verifyEmailLinkViewModel$checkVerification$1 = new VerifyEmailLinkViewModel$checkVerification$1(verifyEmailLinkViewModel, abstractC19687c);
        }
        Object objM19221g = verifyEmailLinkViewModel$checkVerification$1.f39295p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = verifyEmailLinkViewModel$checkVerification$1.f39297r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19221g);
            if (!(((C16410p) verifyEmailLinkViewModel.m14391f()).f50937d instanceof C21917G1)) {
                if (z6) {
                    verifyEmailLinkViewModel.f39282i.mo21447a(C20877X.f66471h, C17690x.f56481Y);
                }
                verifyEmailLinkViewModel.m14397m(VerifyEmailLinkViewModel$checkVerification$2.f39298Y);
                verifyEmailLinkViewModel$checkVerification$1.f39292Y = verifyEmailLinkViewModel;
                verifyEmailLinkViewModel$checkVerification$1.f39294o0 = z6;
                verifyEmailLinkViewModel$checkVerification$1.f39297r0 = 1;
                objM19221g = ((C17589q) verifyEmailLinkViewModel.f39285l).m19221g(verifyEmailLinkViewModel$checkVerification$1);
                if (objM19221g == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 == 1) {
            z6 = verifyEmailLinkViewModel$checkVerification$1.f39294o0;
            verifyEmailLinkViewModel = (VerifyEmailLinkViewModel) verifyEmailLinkViewModel$checkVerification$1.f39292Y;
            AbstractC9233X.m9807c(objM19221g);
        } else if (i11 == 2) {
            verifyEmailLinkViewModel = (VerifyEmailLinkViewModel) verifyEmailLinkViewModel$checkVerification$1.f39292Y;
            AbstractC9233X.m9807c(objM19221g);
            enumC10304F = EnumC10304F.f30592p0;
            C11422v c11422v = verifyEmailLinkViewModel.f39284k;
            verifyEmailLinkViewModel$checkVerification$1.f39292Y = enumC10304F;
            verifyEmailLinkViewModel$checkVerification$1.f39293Z = verifyEmailLinkViewModel;
            verifyEmailLinkViewModel$checkVerification$1.f39297r0 = 3;
            objM19221g = c11422v.m12787b(verifyEmailLinkViewModel$checkVerification$1);
            if (objM19221g == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            verifyEmailLinkViewModel = verifyEmailLinkViewModel$checkVerification$1.f39293Z;
            enumC10304F = (EnumC10304F) verifyEmailLinkViewModel$checkVerification$1.f39292Y;
            AbstractC9233X.m9807c(objM19221g);
        }
        verifyEmailLinkViewModel.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F, (C10327w) objM19221g), true));
        return c17296c;
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19221g;
        if (abstractC21955Q1 instanceof C21952P1) {
            C0425b c0425b = (C0425b) ((C21952P1) abstractC21955Q1).f69511a;
            verifyEmailLinkViewModel.m14397m(new VerifyEmailLinkViewModel$checkVerification$3$1(c0425b));
            if (AbstractC16544l.m18089b(c0425b.f1400c, Boolean.TRUE)) {
                VerifyEmailLinkViewModel$checkVerification$3$2 verifyEmailLinkViewModel$checkVerification$3$2 = new VerifyEmailLinkViewModel$checkVerification$3$2(c0425b);
                verifyEmailLinkViewModel$checkVerification$1.f39292Y = verifyEmailLinkViewModel;
                verifyEmailLinkViewModel$checkVerification$1.f39297r0 = 2;
                if (verifyEmailLinkViewModel.f39284k.m12791f(verifyEmailLinkViewModel$checkVerification$3$2, verifyEmailLinkViewModel$checkVerification$1) == enumC19250a) {
                    return enumC19250a;
                }
                enumC10304F = EnumC10304F.f30592p0;
                C11422v c11422v2 = verifyEmailLinkViewModel.f39284k;
                verifyEmailLinkViewModel$checkVerification$1.f39292Y = enumC10304F;
                verifyEmailLinkViewModel$checkVerification$1.f39293Z = verifyEmailLinkViewModel;
                verifyEmailLinkViewModel$checkVerification$1.f39297r0 = 3;
                objM19221g = c11422v2.m12787b(verifyEmailLinkViewModel$checkVerification$1);
                if (objM19221g == enumC19250a) {
                    return enumC19250a;
                }
                verifyEmailLinkViewModel.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F, (C10327w) objM19221g), true));
            } else if (z6) {
                verifyEmailLinkViewModel.m14393h(new C2059h(verifyEmailLinkViewModel.f39283j.m3160b(R.string.onboarding_email_not_verified)));
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            verifyEmailLinkViewModel.m14397m(new VerifyEmailLinkViewModel$checkVerification$4$1(abstractC21933K1));
            verifyEmailLinkViewModel.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, verifyEmailLinkViewModel.f39283j, verifyEmailLinkViewModel.f39286m, null)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            verifyEmailLinkViewModel.m14397m(VerifyEmailLinkViewModel$checkVerification$5$1.f39302Y);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14335o(VerifyEmailLinkViewModel verifyEmailLinkViewModel, AbstractC19687c abstractC19687c) {
        VerifyEmailLinkViewModel$resendVerificationEmail$1 verifyEmailLinkViewModel$resendVerificationEmail$1;
        verifyEmailLinkViewModel.getClass();
        if (abstractC19687c instanceof VerifyEmailLinkViewModel$resendVerificationEmail$1) {
            verifyEmailLinkViewModel$resendVerificationEmail$1 = (VerifyEmailLinkViewModel$resendVerificationEmail$1) abstractC19687c;
            int i10 = verifyEmailLinkViewModel$resendVerificationEmail$1.f39313p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyEmailLinkViewModel$resendVerificationEmail$1.f39313p0 = i10 - Integer.MIN_VALUE;
            } else {
                verifyEmailLinkViewModel$resendVerificationEmail$1 = new VerifyEmailLinkViewModel$resendVerificationEmail$1(verifyEmailLinkViewModel, abstractC19687c);
            }
        } else {
            verifyEmailLinkViewModel$resendVerificationEmail$1 = new VerifyEmailLinkViewModel$resendVerificationEmail$1(verifyEmailLinkViewModel, abstractC19687c);
        }
        Object objM12790e = verifyEmailLinkViewModel$resendVerificationEmail$1.f39311Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = verifyEmailLinkViewModel$resendVerificationEmail$1.f39313p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM12790e);
            if (!(((C16410p) verifyEmailLinkViewModel.m14391f()).f50936c instanceof C21917G1)) {
                verifyEmailLinkViewModel.f39282i.mo21447a(C20877X.f66473j, C17690x.f56481Y);
                verifyEmailLinkViewModel.m14397m(VerifyEmailLinkViewModel$resendVerificationEmail$2.f39314Y);
                verifyEmailLinkViewModel$resendVerificationEmail$1.f39310Y = verifyEmailLinkViewModel;
                verifyEmailLinkViewModel$resendVerificationEmail$1.f39313p0 = 1;
                objM12790e = verifyEmailLinkViewModel.f39284k.m12790e(null, verifyEmailLinkViewModel$resendVerificationEmail$1);
                if (objM12790e == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        verifyEmailLinkViewModel = verifyEmailLinkViewModel$resendVerificationEmail$1.f39310Y;
        AbstractC9233X.m9807c(objM12790e);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM12790e;
        if (abstractC21955Q1 instanceof C21952P1) {
            verifyEmailLinkViewModel.m14397m(VerifyEmailLinkViewModel$resendVerificationEmail$3$1.f39315Y);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            verifyEmailLinkViewModel.m14397m(new VerifyEmailLinkViewModel$resendVerificationEmail$4$1(abstractC21933K1));
            verifyEmailLinkViewModel.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, verifyEmailLinkViewModel.f39283j, verifyEmailLinkViewModel.f39286m, null)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            verifyEmailLinkViewModel.m14397m(VerifyEmailLinkViewModel$resendVerificationEmail$5$1.f39317Y);
        }
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC16409o intent = (InterfaceC16409o) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C16408n) {
            m14394i(new VerifyEmailLinkViewModel$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C16407m) {
            m14394i(new VerifyEmailLinkViewModel$onIntent$2(this, null));
        } else if (intent instanceof C16406l) {
            this.f39282i.mo21447a(C20877X.f66480q, C17690x.f56481Y);
            f39280n.getClass();
            m14393h(new C2055d((Intent) f39281o.getValue()));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14336p(Context activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.f39282i.mo21447a(C20877X.f66489z, C17690x.f56481Y);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new VerifyEmailLinkViewModel$logout$1(this, activity, null), 3);
    }
}
