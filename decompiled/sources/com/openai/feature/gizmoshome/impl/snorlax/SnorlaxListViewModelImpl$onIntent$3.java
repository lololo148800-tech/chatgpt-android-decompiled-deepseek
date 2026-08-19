package com.openai.feature.gizmoshome.impl.snorlax;

import bf.C11349D;
import bf.InterfaceC11374b0;
import gf.C14121f;
import gf.C14130o;
import gf.InterfaceC14124i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p098Di.C2059h;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p318Mh.C5431w;
import p571X9.AbstractC9233X;
import p576Xe.C9473F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl$onIntent$3", m20656f = "SnorlaxListViewModel.kt", m20657l = {65}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxListViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38422Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SnorlaxListViewModelImpl f38423Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC14124i f38424o0;

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl$onIntent$3$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lgf/o;", "invoke", "(Lgf/o;)Lgf/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123853 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123853 f38425Y = new C123853();

        public C123853() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C14130o setState = (C14130o) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C14130o.m15500e(setState, null, false, null, false, 7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxListViewModelImpl$onIntent$3(SnorlaxListViewModelImpl snorlaxListViewModelImpl, InterfaceC14124i interfaceC14124i, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38423Z = snorlaxListViewModelImpl;
        this.f38424o0 = interfaceC14124i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SnorlaxListViewModelImpl$onIntent$3(this.f38423Z, this.f38424o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SnorlaxListViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38422Y;
        SnorlaxListViewModelImpl snorlaxListViewModelImpl = this.f38423Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C9473F c9473f = snorlaxListViewModelImpl.f38409i;
            String str = ((C14121f) this.f38424o0).f44456a;
            this.f38422Y = 1;
            obj = c9473f.m10002a(str, this);
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
            InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) ((C21952P1) abstractC21955Q1).f69511a;
            if (interfaceC11374b0 != null) {
                snorlaxListViewModelImpl.getClass();
                snorlaxListViewModelImpl.m14393h(new C2058g(C5431w.m5901e(C5431w.f17746g, ((C11349D) interfaceC11374b0).f34318a, null, "snorlax", 2), false));
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            snorlaxListViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        snorlaxListViewModelImpl.m14397m(C123853.f38425Y);
        return C17296C.f55119a;
    }
}
