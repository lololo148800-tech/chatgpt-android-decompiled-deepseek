package com.openai.feature.gizmos.impl.store;

import af.C10545A;
import af.C10590r;
import af.C10591s;
import af.C10593u;
import af.C10594v;
import af.C10595w;
import af.C10596x;
import af.InterfaceC10597y;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.C11349D;
import bf.C11367W;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21949O1;
import p1155zi.C21952P1;
import p318Mh.C5379S;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p708dh.C13166t;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoRatingViewModelImpl;", "Lcom/openai/feature/gizmos/impl/store/GizmoRatingViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoRatingViewModelImpl extends GizmoRatingViewModel {

    /* JADX INFO: renamed from: i */
    public final C9473F f38201i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f38202j;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$1", m20656f = "GizmoRatingViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/A;", "accountUser", "Lmm/C;", "<anonymous>", "(Lzi/A;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123631 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38203Y;

        /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/A;", "invoke", "(Laf/A;)Laf/A;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21891A f38205Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21891A c21891a) {
                super(1);
                this.f38205Y = c21891a;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C10545A setState = (C10545A) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C10545A.m10981e(setState, null, null, null, null, false, this.f38205Y.f69416b.f69656b, false, false, 447);
            }
        }

        public C123631(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123631 c123631 = GizmoRatingViewModelImpl.this.new C123631(interfaceC18770c);
            c123631.f38203Y = obj;
            return c123631;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C123631 c123631 = (C123631) create((C21891A) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c123631.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            GizmoRatingViewModelImpl.this.m14397m(new AnonymousClass1((C21891A) this.f38203Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$2", m20656f = "GizmoRatingViewModel.kt", m20657l = {72}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123642 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38206Y;

        public C123642(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return GizmoRatingViewModelImpl.this.new C123642(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123642) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38206Y;
            GizmoRatingViewModelImpl gizmoRatingViewModelImpl = GizmoRatingViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C9473F c9473f = gizmoRatingViewModelImpl.f38201i;
                String str = ((C10545A) gizmoRatingViewModelImpl.f40343c.getValue()).f31301a;
                this.f38206Y = 1;
                obj = c9473f.m10005d(str, false, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                gizmoRatingViewModelImpl.m14397m(new GizmoRatingViewModelImpl$2$1$1((C11349D) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                gizmoRatingViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl$3", m20656f = "GizmoRatingViewModel.kt", m20657l = {79, 97}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123653 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public GizmoRatingViewModelImpl f38209Y;

        /* JADX INFO: renamed from: Z */
        public int f38210Z;

        public C123653(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return GizmoRatingViewModelImpl.this.new C123653(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123653) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0091  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            AbstractC21955Q1 abstractC21955Q1;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38210Z;
            GizmoRatingViewModelImpl gizmoRatingViewModelImpl = GizmoRatingViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gizmoRatingViewModelImpl = this.f38209Y;
                    AbstractC9233X.m9807c(obj);
                }
                abstractC21955Q1 = (AbstractC21955Q1) obj;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    gizmoRatingViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C9473F c9473f = gizmoRatingViewModelImpl.f38201i;
            String str = ((C10545A) gizmoRatingViewModelImpl.f40343c.getValue()).f31301a;
            this.f38210Z = 1;
            obj = c9473f.m10009h(str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) obj;
            if (abstractC21955Q2 instanceof C21952P1) {
                gizmoRatingViewModelImpl.m14397m(new GizmoRatingViewModelImpl$3$1$1((C11367W) ((C21952P1) abstractC21955Q2).f69511a));
            } else if (abstractC21955Q2 instanceof AbstractC21933K1) {
                AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q2;
                if ((abstractC21933K1 instanceof C21949O1) && (num = ((C21949O1) abstractC21933K1).f69506b) != null && num.intValue() == 404) {
                    gizmoRatingViewModelImpl.m14397m(GizmoRatingViewModelImpl$3$2$1.f38213Y);
                    String str2 = ((C10545A) gizmoRatingViewModelImpl.f40343c.getValue()).f31301a;
                    C11367W c11367w = new C11367W(7, null);
                    this.f38209Y = gizmoRatingViewModelImpl;
                    this.f38210Z = 2;
                    obj = gizmoRatingViewModelImpl.f38201i.m10016o(str2, c11367w, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q1 = (AbstractC21955Q1) obj;
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        gizmoRatingViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                    }
                } else {
                    gizmoRatingViewModelImpl.m14393h(new C2059h(abstractC21933K1));
                }
            } else if (!(abstractC21955Q2 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    public GizmoRatingViewModelImpl(C11082S c11082s, C9473F c9473f, C13166t c13166t, InterfaceC20904w interfaceC20904w) {
        super(new C10545A(((C21936L0) C5379S.f17631i.f17628g.m5892c(c11082s)).f69488a, null, null, null, null, false, null, false, false));
        this.f38201i = c9473f;
        this.f38202j = interfaceC20904w;
        AbstractC2124C.m3226y(new C1970n(c13166t.f41802f, 5, new C123631(null)), ViewModelKt.m12143a(this));
        m14394i(new C123642(null));
        m14394i(new C123653(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: n */
    public static final Object m14280n(GizmoRatingViewModelImpl gizmoRatingViewModelImpl, AbstractC19687c abstractC19687c) {
        GizmoRatingViewModelImpl$submitRating$1 gizmoRatingViewModelImpl$submitRating$1;
        C11367W c11367w;
        gizmoRatingViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoRatingViewModelImpl$submitRating$1) {
            gizmoRatingViewModelImpl$submitRating$1 = (GizmoRatingViewModelImpl$submitRating$1) abstractC19687c;
            int i10 = gizmoRatingViewModelImpl$submitRating$1.f38223q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoRatingViewModelImpl$submitRating$1.f38223q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoRatingViewModelImpl$submitRating$1 = new GizmoRatingViewModelImpl$submitRating$1(gizmoRatingViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoRatingViewModelImpl$submitRating$1 = new GizmoRatingViewModelImpl$submitRating$1(gizmoRatingViewModelImpl, abstractC19687c);
        }
        Object objM10016o = gizmoRatingViewModelImpl$submitRating$1.f38221o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoRatingViewModelImpl$submitRating$1.f38223q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10016o);
            C10545A c10545a = (C10545A) gizmoRatingViewModelImpl.f40343c.getValue();
            Integer num = c10545a.f31303c;
            if (num != null) {
                Integer num2 = new Integer(num.intValue());
                c11367w = new C11367W(num2, c10545a.f31305e, Boolean.valueOf(c10545a.f31306f));
                gizmoRatingViewModelImpl.m14397m(GizmoRatingViewModelImpl$submitRating$2.f38224Y);
                C20893l c20893l = C20893l.f66587y;
                String str = c10545a.f31301a;
                gizmoRatingViewModelImpl.f38202j.mo21447a(c20893l, AbstractC17659D.m19244f(new C17309l("gizmo_id", str), new C17309l("rating", String.valueOf(num2))));
                gizmoRatingViewModelImpl$submitRating$1.f38219Y = gizmoRatingViewModelImpl;
                gizmoRatingViewModelImpl$submitRating$1.f38220Z = c11367w;
                gizmoRatingViewModelImpl$submitRating$1.f38223q0 = 1;
                objM10016o = gizmoRatingViewModelImpl.f38201i.m10016o(str, c11367w, gizmoRatingViewModelImpl$submitRating$1);
                if (objM10016o == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11367W c11367w2 = gizmoRatingViewModelImpl$submitRating$1.f38220Z;
        GizmoRatingViewModelImpl gizmoRatingViewModelImpl2 = gizmoRatingViewModelImpl$submitRating$1.f38219Y;
        AbstractC9233X.m9807c(objM10016o);
        c11367w = c11367w2;
        gizmoRatingViewModelImpl = gizmoRatingViewModelImpl2;
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10016o;
        if (abstractC21955Q1 instanceof C21952P1) {
            gizmoRatingViewModelImpl.m14392g(C10591s.f31443a);
            Integer num3 = c11367w.f34370a;
            gizmoRatingViewModelImpl.m14392g(new C10590r(num3 != null ? num3.intValue() : 0));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmoRatingViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        gizmoRatingViewModelImpl.m14397m(GizmoRatingViewModelImpl$submitRating$5.f38225Y);
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC10597y intent = (InterfaceC10597y) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C10594v.f31445a)) {
            m14394i(new GizmoRatingViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C10593u) {
            m14397m(new GizmoRatingViewModelImpl$onIntent$2(intent));
        } else if (intent instanceof C10595w) {
            m14397m(new GizmoRatingViewModelImpl$onIntent$3(intent));
        } else if (intent instanceof C10596x) {
            m14397m(new GizmoRatingViewModelImpl$onIntent$4(intent));
        }
    }
}
