package com.openai.feature.conversations.impl.compliance;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import ee.AbstractC13371f;
import ee.C13366a;
import ee.C13367b;
import ee.C13369d;
import ee.C13370e;
import ee.InterfaceC13368c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import ni.C17641o;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2055d;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1081wc.C20891j;
import p1081wc.InterfaceC20904w;
import p359Oc.C6165a;
import p359Oc.C6166b;
import p359Oc.C6168d;
import p359Oc.EnumC6167c;
import p544W9.AbstractC8472E4;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p909nm.C17690x;
import p924od.C18075e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/compliance/ComplianceViewModelImpl;", "Lcom/openai/feature/conversations/impl/compliance/ComplianceViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ComplianceViewModelImpl extends ComplianceViewModel {

    /* JADX INFO: renamed from: i */
    public final C18075e f37549i;

    /* JADX INFO: renamed from: j */
    public final C17641o f37550j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC20904w f37551k;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.compliance.ComplianceViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.compliance.ComplianceViewModelImpl$2", m20656f = "ComplianceViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOc/d;", "complianceState", "Lmm/C;", "<anonymous>", "(LOc/d;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122552 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37552Y;

        /* JADX INFO: renamed from: com.openai.feature.conversations.impl.compliance.ComplianceViewModelImpl$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lee/f;", "invoke", "(Lee/f;)Lee/f;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ AbstractC13371f f37554Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC13371f abstractC13371f) {
                super(1);
                this.f37554Y = abstractC13371f;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                AbstractC13371f setState = (AbstractC13371f) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return this.f37554Y;
            }
        }

        public C122552(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122552 c122552 = ComplianceViewModelImpl.this.new C122552(interfaceC18770c);
            c122552.f37552Y = obj;
            return c122552;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C122552 c122552 = (C122552) create((C6168d) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c122552.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C6168d c6168d = (C6168d) this.f37552Y;
            AbstractC13371f c13370e = c6168d == null ? C13369d.f42407a : new C13370e(c6168d, false, false);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c13370e);
            ComplianceViewModelImpl complianceViewModelImpl = ComplianceViewModelImpl.this;
            complianceViewModelImpl.m14397m(anonymousClass1);
            if (c6168d != null) {
                complianceViewModelImpl.f37551k.mo21447a(C20891j.f66561c, ComplianceViewModelImpl.m14247n(c13370e));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ComplianceViewModelImpl(C18075e c18075e, C17641o c17641o, InterfaceC20904w interfaceC20904w) {
        C2153Q0 c2153q0 = c18075e.f57648e;
        C6168d c6168d = (C6168d) c2153q0.getValue();
        super(c6168d == null ? C13369d.f42407a : new C13370e(c6168d, false, false));
        this.f37549i = c18075e;
        this.f37550j = c17641o;
        this.f37551k = interfaceC20904w;
        AbstractC2124C.m3226y(new C1970n(c2153q0, 5, new C122552(null)), c17641o);
    }

    /* JADX INFO: renamed from: n */
    public static Map m14247n(AbstractC13371f abstractC13371f) {
        if (abstractC13371f instanceof C13369d) {
            return C17690x.f56481Y;
        }
        if (!(abstractC13371f instanceof C13370e)) {
            throw new C0644w();
        }
        ((C13370e) abstractC13371f).f42408a.getClass();
        EnumC6167c enumC6167c = EnumC6167c.f20076Y;
        return AbstractC0168G.m535x("type", "terms_of_use");
    }

    /* JADX INFO: renamed from: q */
    public static void m14248q(ComplianceViewModelImpl complianceViewModelImpl, Boolean bool, Boolean bool2, int i10) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        complianceViewModelImpl.getClass();
        complianceViewModelImpl.m14397m(new ComplianceViewModelImpl$updateNonComplianceState$1(bool, bool2, null));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C6166b c6166b;
        InterfaceC13368c intent = (InterfaceC13368c) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean zEquals = intent.equals(C13366a.f42405a);
        C2153Q0 c2153q0 = this.f40343c;
        InterfaceC20904w interfaceC20904w = this.f37551k;
        if (zEquals) {
            interfaceC20904w.mo21447a(C20891j.f66562d, m14247n((AbstractC13371f) c2153q0.getValue()));
            C6168d c6168dM14249o = m14249o();
            if (c6168dM14249o != null) {
                m14250p(c6168dM14249o.f20080c);
                return;
            }
            return;
        }
        if (intent.equals(C13367b.f42406a)) {
            interfaceC20904w.mo21447a(C20891j.f66563e, m14247n((AbstractC13371f) c2153q0.getValue()));
            C6168d c6168dM14249o2 = m14249o();
            if (c6168dM14249o2 != null && (c6166b = c6168dM14249o2.f20082e) != null) {
                m14250p(c6166b);
            }
            C6168d c6168dM14249o3 = m14249o();
            if (c6168dM14249o3 == null || !c6168dM14249o3.f20083f) {
                return;
            }
            this.f37549i.f57647d.setValue(null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final C6168d m14249o() {
        Object value = this.f40343c.getValue();
        C13370e c13370e = value instanceof C13370e ? (C13370e) value : null;
        if (c13370e != null) {
            return c13370e.f42408a;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m14250p(AbstractC8472E4 abstractC8472E4) {
        if (abstractC8472E4 instanceof C6165a) {
            ((C6165a) abstractC8472E4).getClass();
            EnumC6167c enumC6167c = EnumC6167c.f20076Y;
            AbstractC0575H.m1156D(this.f37550j, null, null, new ComplianceViewModelImpl$logCompliance$1(this, null), 3);
            return;
        }
        if (abstractC8472E4 instanceof C6166b) {
            String str = ((C6166b) abstractC8472E4).f20075a;
            Intent intent = new Intent();
            AbstractC9186P.m9748b(intent, str);
            m14393h(new C2055d(intent));
        }
    }
}
