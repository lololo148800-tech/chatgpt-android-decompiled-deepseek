package com.openai.feature.gizmos.impl.store;

import af.C10579g;
import af.C10580h;
import af.C10589q;
import af.InterfaceC10581i;
import android.content.Intent;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import bf.C11352G;
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
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.C2153Q0;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p318Mh.C5378Q;
import p318Mh.C5431w;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p811ih.C15000g;
import p885m4.C17155e;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoPreviewViewModelImpl;", "Lcom/openai/feature/gizmos/impl/store/GizmoPreviewViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoPreviewViewModelImpl extends GizmoPreviewViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f38185i;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoPreviewViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoPreviewViewModelImpl$1", m20656f = "GizmoPreviewViewModel.kt", m20657l = {56}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123601 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38186Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C9473F f38187Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ GizmoPreviewViewModelImpl f38188o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123601(C9473F c9473f, GizmoPreviewViewModelImpl gizmoPreviewViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f38187Z = c9473f;
            this.f38188o0 = gizmoPreviewViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C123601(this.f38187Z, this.f38188o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123601) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38186Y;
            GizmoPreviewViewModelImpl gizmoPreviewViewModelImpl = this.f38188o0;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                String str = ((C10589q) gizmoPreviewViewModelImpl.f40343c.getValue()).f31439a;
                this.f38186Y = 1;
                obj = this.f38187Z.m10007f(str, this);
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
                gizmoPreviewViewModelImpl.m14397m(new GizmoPreviewViewModelImpl$1$1$1((C11352G) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                gizmoPreviewViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoPreviewViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Laf/q;", "", "it", "invoke", "(Laf/q;Z)Laf/q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123612 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123612 f38190Y = new C123612();

        public C123612() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C10589q setOnEach = (C10589q) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C10589q.m10984e(setOnEach, null, zBooleanValue, 3);
        }
    }

    public GizmoPreviewViewModelImpl(C11082S c11082s, C9473F c9473f, InterfaceC20904w interfaceC20904w, C15000g c15000g) {
        super(new C10589q(((C21936L0) C5378Q.f17630i.f17628g.m5892c(c11082s)).f69488a, null, false));
        this.f38185i = interfaceC20904w;
        m14394i(new C123601(c9473f, this, null));
        C17155e c17155e = EnumC22026l.f69677Z;
        m14396l(C123612.f38190Y, c15000g.m16134a(EnumC22026l.SearchTool, null));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC10581i intent = (InterfaceC10581i) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean z6 = intent instanceof C10580h;
        C2153Q0 c2153q0 = this.f40343c;
        if (z6) {
            m14393h(new C2058g(C5431w.m5901e(C5431w.f17746g, ((C10589q) c2153q0.getValue()).f31439a, ((C10580h) intent).f31424a, null, 4), false));
            return;
        }
        if (intent instanceof C10579g) {
            this.f38185i.mo21447a(C20857C.f66330l, AbstractC17660E.m19258c(new C17309l("gizmo_id", new C21936L0(((C10589q) c2153q0.getValue()).f31439a))));
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, ((C10579g) intent).f31423a.f34403c);
            m14393h(new C2055d(intent2));
        }
    }
}
