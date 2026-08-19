package com.openai.feature.gizmoshome.impl.snorlax;

import androidx.lifecycle.ViewModel;
import bf.C11349D;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gf.C14119d;
import gf.C14120e;
import gf.C14121f;
import gf.C14122g;
import gf.C14123h;
import gf.C14130o;
import gf.InterfaceC14124i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21897B1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p318Mh.C5431w;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmoshome/impl/snorlax/SnorlaxListViewModelImpl;", "Lcom/openai/feature/gizmoshome/impl/snorlax/SnorlaxListViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SnorlaxListViewModelImpl extends SnorlaxListViewModel {

    /* JADX INFO: renamed from: i */
    public final C9473F f38409i;

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lgf/o;", "Lzi/B1;", "Lbf/b0;", "sidebar", "invoke", "(Lgf/o;Lzi/B1;)Lgf/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123831 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123831 f38410Y = new C123831();

        public C123831() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C14130o setOnEach = (C14130o) obj;
            C21897B1 sidebar = (C21897B1) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(sidebar, "sidebar");
            return C14130o.m15500e(setOnEach, sidebar.f69431a, false, sidebar.f69432b, false, 10);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl$2", m20656f = "SnorlaxListViewModel.kt", m20657l = {55}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123842 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38411Y;

        public C123842(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return SnorlaxListViewModelImpl.this.new C123842(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123842) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38411Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f38411Y = 1;
                if (SnorlaxListViewModelImpl.m14292n(SnorlaxListViewModelImpl.this, null, this) == enumC19250a) {
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

    public SnorlaxListViewModelImpl(C9473F c9473f) {
        super(new C14130o(null, C17689w.f56480Y, false, false));
        this.f38409i = c9473f;
        m14396l(C123831.f38410Y, c9473f.m10020s());
        m14394i(new C123842(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14292n(SnorlaxListViewModelImpl snorlaxListViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        SnorlaxListViewModelImpl$loadMore$1 snorlaxListViewModelImpl$loadMore$1;
        snorlaxListViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxListViewModelImpl$loadMore$1) {
            snorlaxListViewModelImpl$loadMore$1 = (SnorlaxListViewModelImpl$loadMore$1) abstractC19687c;
            int i10 = snorlaxListViewModelImpl$loadMore$1.f38416p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxListViewModelImpl$loadMore$1.f38416p0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxListViewModelImpl$loadMore$1 = new SnorlaxListViewModelImpl$loadMore$1(snorlaxListViewModelImpl, abstractC19687c);
            }
        } else {
            snorlaxListViewModelImpl$loadMore$1 = new SnorlaxListViewModelImpl$loadMore$1(snorlaxListViewModelImpl, abstractC19687c);
        }
        Object objM10006e = snorlaxListViewModelImpl$loadMore$1.f38414Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxListViewModelImpl$loadMore$1.f38416p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10006e);
            C14130o c14130o = (C14130o) snorlaxListViewModelImpl.f40343c.getValue();
            if (!c14130o.f44469b && (c14130o.f44470c != null || c14130o.f44468a.isEmpty())) {
                snorlaxListViewModelImpl.m14397m(SnorlaxListViewModelImpl$loadMore$2.f38417Y);
                snorlaxListViewModelImpl$loadMore$1.f38413Y = snorlaxListViewModelImpl;
                snorlaxListViewModelImpl$loadMore$1.f38416p0 = 1;
                objM10006e = snorlaxListViewModelImpl.f38409i.m10006e(str, snorlaxListViewModelImpl$loadMore$1);
                if (objM10006e == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snorlaxListViewModelImpl = snorlaxListViewModelImpl$loadMore$1.f38413Y;
        AbstractC9233X.m9807c(objM10006e);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10006e;
        if (!(abstractC21955Q1 instanceof C21952P1)) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                snorlaxListViewModelImpl.m14397m(SnorlaxListViewModelImpl$loadMore$4$1.f38419Y);
                snorlaxListViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return c17296c;
        }
        snorlaxListViewModelImpl.m14397m(SnorlaxListViewModelImpl$loadMore$3$1.f38418Y);
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC14124i intent = (InterfaceC14124i) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C14123h) {
            m14393h(new C2058g(C5431w.m5901e(C5431w.f17746g, ((C11349D) ((C14123h) intent).f44458a).f34318a, null, "snorlax", 2), false));
            return;
        }
        if (intent instanceof C14120e) {
            m14397m(SnorlaxListViewModelImpl$onIntent$1.f38420Y);
            return;
        }
        if (intent instanceof C14122g) {
            m14397m(SnorlaxListViewModelImpl$onIntent$2.f38421Y);
        } else if (intent instanceof C14121f) {
            m14394i(new SnorlaxListViewModelImpl$onIntent$3(this, intent, null));
        } else if (intent instanceof C14119d) {
            m14394i(new SnorlaxListViewModelImpl$onIntent$4(this, intent, null));
        }
    }
}
