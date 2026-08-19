package com.openai.feature.sanction.impl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11422v;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import com.withpersona.sdk2.inquiry.Inquiry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p098Di.C2057f;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.AbstractC2173c0;
import p103Dn.C2146N;
import p103Dn.C2176e;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1081wc.C20877X;
import p1084wg.C20946a;
import p1084wg.C20947b;
import p1084wg.C20949d;
import p1084wg.C20952g;
import p1084wg.InterfaceC20948c;
import p115E9.AbstractC2359a;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p623Zf.EnumC10304F;
import p841k.C16288h;
import p872lg.C16948h;
import p872lg.EnumC16949i;
import p909nm.AbstractC17678l;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import vg.EnumC20615b;
import vg.InterfaceC20614a;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/sanction/impl/SanctionViewModelImpl;", "Lcom/openai/feature/sanction/impl/SanctionViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SanctionViewModelImpl extends SanctionViewModel {

    /* JADX INFO: renamed from: i */
    public final C11422v f39405i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20614a f39406j;

    /* JADX INFO: renamed from: k */
    public final C3430e f39407k;

    /* JADX INFO: renamed from: com.openai.feature.sanction.impl.SanctionViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl$1", m20656f = "SanctionViewModel.kt", m20657l = {60}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvg/b;", "status", "Lmm/C;", "<anonymous>", "(Lvg/b;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124711 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39408Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f39409Z;

        /* JADX INFO: renamed from: com.openai.feature.sanction.impl.SanctionViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lwg/g;", "invoke", "(Lwg/g;)Lwg/g;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ EnumC20615b f39411Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EnumC20615b enumC20615b) {
                super(1);
                this.f39411Y = enumC20615b;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C20952g setState = (C20952g) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                EnumC20615b sanctionStatus = this.f39411Y;
                AbstractC16544l.m18094g(sanctionStatus, "sanctionStatus");
                return new C20952g(sanctionStatus);
            }
        }

        public C124711(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124711 c124711 = SanctionViewModelImpl.this.new C124711(interfaceC18770c);
            c124711.f39409Z = obj;
            return c124711;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124711) create((EnumC20615b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39408Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                EnumC20615b enumC20615b = (EnumC20615b) this.f39409Z;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(enumC20615b);
                SanctionViewModelImpl sanctionViewModelImpl = SanctionViewModelImpl.this;
                sanctionViewModelImpl.m14397m(anonymousClass1);
                if (enumC20615b == EnumC20615b.f65427r0) {
                    this.f39408Y = 1;
                    if (SanctionViewModelImpl.m14344n(sanctionViewModelImpl, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.sanction.impl.SanctionViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl$2", m20656f = "SanctionViewModel.kt", m20657l = {63}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124722 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39412Y;

        public C124722(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return SanctionViewModelImpl.this.new C124722(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124722) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39412Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39412Y = 1;
                if (SanctionViewModelImpl.m14345o(SanctionViewModelImpl.this, this) == enumC19250a) {
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

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39414a;

        static {
            int[] iArr = new int[EnumC16949i.values().length];
            try {
                C16948h c16948h = EnumC16949i.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                C16948h c16948h2 = EnumC16949i.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                C16948h c16948h3 = EnumC16949i.Companion;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                C16948h c16948h4 = EnumC16949i.Companion;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                C16948h c16948h5 = EnumC16949i.Companion;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                C16948h c16948h6 = EnumC16949i.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                C16948h c16948h7 = EnumC16949i.Companion;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                C16948h c16948h8 = EnumC16949i.Companion;
                iArr[0] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f39414a = iArr;
        }
    }

    public SanctionViewModelImpl(C11422v c11422v, InterfaceC20614a interfaceC20614a) {
        super(new C20952g(EnumC20615b.f65422Y));
        this.f39405i = c11422v;
        this.f39406j = interfaceC20614a;
        this.f39407k = AbstractC8168p6.m8749b("SanctionViewModel", null);
        final C1970n c1970n = c11422v.f34496h;
        InterfaceC2184i[] interfaceC2184iArr = {new C2146N(new InterfaceC2184i() { // from class: com.openai.feature.sanction.impl.SanctionViewModelImpl$inquiryStatusToSanctionFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.openai.feature.sanction.impl.SanctionViewModelImpl$inquiryStatusToSanctionFlow$$inlined$map$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C124732<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f39426Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ SanctionViewModelImpl f39427Z;

                /* JADX INFO: renamed from: com.openai.feature.sanction.impl.SanctionViewModelImpl$inquiryStatusToSanctionFlow$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl$inquiryStatusToSanctionFlow$$inlined$map$1$2", m20656f = "SanctionViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f39428Y;

                    /* JADX INFO: renamed from: Z */
                    public int f39429Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f39428Y = obj;
                        this.f39429Z |= Integer.MIN_VALUE;
                        return C124732.this.mo395a(null, this);
                    }
                }

                public C124732(InterfaceC2186j interfaceC2186j, SanctionViewModelImpl sanctionViewModelImpl) {
                    this.f39426Y = interfaceC2186j;
                    this.f39427Z = sanctionViewModelImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    EnumC20615b enumC20615b;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f39429Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f39429Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f39428Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f39429Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        C10330z c10330z = (C10330z) obj;
                        C3430e c3430e = this.f39427Z.f39407k;
                        C10327w c10327w = c10330z.f30661e;
                        AbstractC8160o6.m8728c(c3430e, "Sanction screen state : " + (c10327w != null ? c10327w.f30655k : null), null, null, 6);
                        C10327w c10327w2 = c10330z.f30661e;
                        EnumC16949i enumC16949i = c10327w2 != null ? c10327w2.f30655k : null;
                        switch (enumC16949i == null ? -1 : SanctionViewModelImpl.WhenMappings.f39414a[enumC16949i.ordinal()]) {
                            case -1:
                            case 8:
                                enumC20615b = EnumC20615b.f65422Y;
                                break;
                            case 0:
                            default:
                                throw new C0644w();
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                enumC20615b = EnumC20615b.f65424o0;
                                break;
                            case 5:
                                enumC20615b = EnumC20615b.f65425p0;
                                break;
                            case 6:
                                enumC20615b = EnumC20615b.f65426q0;
                                break;
                            case 7:
                                enumC20615b = EnumC20615b.f65427r0;
                                break;
                        }
                        anonymousClass1.f39429Z = 1;
                        if (this.f39426Y.mo395a(enumC20615b, anonymousClass1) == enumC19250a) {
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
                Object objMo3141d = c1970n.mo3141d(new C124732(interfaceC2186j, this), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 1), new C2146N(((C20949d) interfaceC20614a).f66729q0, 0)};
        int i10 = AbstractC2173c0.f6659a;
        AbstractC2124C.m3226y(new C1970n(new C2176e(AbstractC17678l.m19295b(interfaceC2184iArr), C18777j.f59682Y, -2, EnumC1733a.f4961Y), 5, new C124711(null)), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124722(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14344n(SanctionViewModelImpl sanctionViewModelImpl, AbstractC19687c abstractC19687c) {
        SanctionViewModelImpl$createAccount$1 sanctionViewModelImpl$createAccount$1;
        EnumC10304F enumC10304F;
        Object objM12787b;
        sanctionViewModelImpl.getClass();
        if (abstractC19687c instanceof SanctionViewModelImpl$createAccount$1) {
            sanctionViewModelImpl$createAccount$1 = (SanctionViewModelImpl$createAccount$1) abstractC19687c;
            int i10 = sanctionViewModelImpl$createAccount$1.f39419q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sanctionViewModelImpl$createAccount$1.f39419q0 = i10 - Integer.MIN_VALUE;
            } else {
                sanctionViewModelImpl$createAccount$1 = new SanctionViewModelImpl$createAccount$1(sanctionViewModelImpl, abstractC19687c);
            }
        } else {
            sanctionViewModelImpl$createAccount$1 = new SanctionViewModelImpl$createAccount$1(sanctionViewModelImpl, abstractC19687c);
        }
        Object obj = sanctionViewModelImpl$createAccount$1.f39417o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = sanctionViewModelImpl$createAccount$1.f39419q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            enumC10304F = EnumC10304F.f30594r0;
            sanctionViewModelImpl$createAccount$1.f39415Y = sanctionViewModelImpl;
            sanctionViewModelImpl$createAccount$1.f39416Z = enumC10304F;
            sanctionViewModelImpl$createAccount$1.f39419q0 = 1;
            objM12787b = sanctionViewModelImpl.f39405i.m12787b(sanctionViewModelImpl$createAccount$1);
            if (objM12787b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EnumC10304F enumC10304F2 = sanctionViewModelImpl$createAccount$1.f39416Z;
            SanctionViewModelImpl sanctionViewModelImpl2 = sanctionViewModelImpl$createAccount$1.f39415Y;
            AbstractC9233X.m9807c(obj);
            enumC10304F = enumC10304F2;
            sanctionViewModelImpl = sanctionViewModelImpl2;
            objM12787b = obj;
        }
        sanctionViewModelImpl.m14393h(new C2057f(AbstractC2359a.m3444c(enumC10304F, (C10327w) objM12787b)));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14345o(SanctionViewModelImpl sanctionViewModelImpl, AbstractC19687c abstractC19687c) {
        SanctionViewModelImpl$handleInitialInquiryStatus$1 sanctionViewModelImpl$handleInitialInquiryStatus$1;
        sanctionViewModelImpl.getClass();
        if (abstractC19687c instanceof SanctionViewModelImpl$handleInitialInquiryStatus$1) {
            sanctionViewModelImpl$handleInitialInquiryStatus$1 = (SanctionViewModelImpl$handleInitialInquiryStatus$1) abstractC19687c;
            int i10 = sanctionViewModelImpl$handleInitialInquiryStatus$1.f39423p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sanctionViewModelImpl$handleInitialInquiryStatus$1.f39423p0 = i10 - Integer.MIN_VALUE;
            } else {
                sanctionViewModelImpl$handleInitialInquiryStatus$1 = new SanctionViewModelImpl$handleInitialInquiryStatus$1(sanctionViewModelImpl, abstractC19687c);
            }
        } else {
            sanctionViewModelImpl$handleInitialInquiryStatus$1 = new SanctionViewModelImpl$handleInitialInquiryStatus$1(sanctionViewModelImpl, abstractC19687c);
        }
        Object objM12787b = sanctionViewModelImpl$handleInitialInquiryStatus$1.f39421Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = sanctionViewModelImpl$handleInitialInquiryStatus$1.f39423p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                sanctionViewModelImpl = sanctionViewModelImpl$handleInitialInquiryStatus$1.f39420Y;
                AbstractC9233X.m9807c(objM12787b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM12787b);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM12787b);
        sanctionViewModelImpl$handleInitialInquiryStatus$1.f39420Y = sanctionViewModelImpl;
        sanctionViewModelImpl$handleInitialInquiryStatus$1.f39423p0 = 1;
        objM12787b = sanctionViewModelImpl.f39405i.m12787b(sanctionViewModelImpl$handleInitialInquiryStatus$1);
        if (objM12787b == enumC19250a) {
            return enumC19250a;
        }
        if (((C10327w) objM12787b).f30655k == EnumC16949i.f54400Z) {
            sanctionViewModelImpl$handleInitialInquiryStatus$1.f39420Y = null;
            sanctionViewModelImpl$handleInitialInquiryStatus$1.f39423p0 = 2;
            if (sanctionViewModelImpl.m14346p(sanctionViewModelImpl$handleInitialInquiryStatus$1) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC20948c intent = (InterfaceC20948c) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C20946a.f66723a)) {
            m14394i(new SanctionViewModelImpl$onIntent$1(this, null));
        } else if (intent.equals(C20947b.f66724a)) {
            m14394i(new SanctionViewModelImpl$onIntent$2(this, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m14346p(AbstractC19687c abstractC19687c) {
        SanctionViewModelImpl$startInquiry$1 sanctionViewModelImpl$startInquiry$1;
        SanctionViewModelImpl sanctionViewModelImpl;
        if (abstractC19687c instanceof SanctionViewModelImpl$startInquiry$1) {
            sanctionViewModelImpl$startInquiry$1 = (SanctionViewModelImpl$startInquiry$1) abstractC19687c;
            int i10 = sanctionViewModelImpl$startInquiry$1.f39437p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sanctionViewModelImpl$startInquiry$1.f39437p0 = i10 - Integer.MIN_VALUE;
            } else {
                sanctionViewModelImpl$startInquiry$1 = new SanctionViewModelImpl$startInquiry$1(this, abstractC19687c);
            }
        } else {
            sanctionViewModelImpl$startInquiry$1 = new SanctionViewModelImpl$startInquiry$1(this, abstractC19687c);
        }
        Object objM12787b = sanctionViewModelImpl$startInquiry$1.f39435Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = sanctionViewModelImpl$startInquiry$1.f39437p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM12787b);
            sanctionViewModelImpl$startInquiry$1.f39434Y = this;
            sanctionViewModelImpl$startInquiry$1.f39437p0 = 1;
            objM12787b = this.f39405i.m12787b(sanctionViewModelImpl$startInquiry$1);
            if (objM12787b == enumC19250a) {
                return enumC19250a;
            }
            sanctionViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sanctionViewModelImpl = sanctionViewModelImpl$startInquiry$1.f39434Y;
            AbstractC9233X.m9807c(objM12787b);
        }
        C10327w c10327w = (C10327w) objM12787b;
        C3430e c3430e = sanctionViewModelImpl.f39407k;
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Sanction inquiry started: [inquiryId=", c10327w.f30654j, "][inquiryStatus=");
        sbM11058p.append(c10327w.f30655k);
        sbM11058p.append("]");
        AbstractC8160o6.m8728c(c3430e, sbM11058p.toString(), null, null, 6);
        String str = c10327w.f30654j;
        if (str != null) {
            C20949d c20949d = (C20949d) sanctionViewModelImpl.f39406j;
            c20949d.getClass();
            c20949d.f66725Y.mo21447a(C20877X.f66488y, AbstractC0168G.m535x("inquiryId", str));
            C16288h c16288h = c20949d.f66727o0;
            if (c16288h == null) {
                AbstractC16544l.m18103p("inquiryResult");
                throw null;
            }
            c16288h.mo10188b(Inquiry.INSTANCE.fromInquiry(str).build());
        }
        return C17296C.f55119a;
    }
}
