package com.openai.feature.settings.impl.data;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13839A1;
import gd.C13869K1;
import gd.C13888R0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1699d;
import p086D6.C1970n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20885d;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p292Lg.C5037i;
import p292Lg.C5038j;
import p292Lg.C5039k;
import p292Lg.C5040l;
import p292Lg.C5041m;
import p292Lg.C5043o;
import p292Lg.C5044p;
import p292Lg.C5045q;
import p292Lg.C5046r;
import p292Lg.C5047s;
import p292Lg.C5048t;
import p292Lg.C5049u;
import p292Lg.C5050v;
import p292Lg.C5054z;
import p292Lg.InterfaceC5051w;
import p318Mh.C5391c;
import p318Mh.C5409l;
import p318Mh.C5431w;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13132J;
import p708dh.C13158l;
import p708dh.C13166t;
import p811ih.C15000g;
import p909nm.C17690x;
import p925oe.C18086K;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/data/DataControlsViewModelImpl;", "Lcom/openai/feature/settings/impl/data/DataControlsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DataControlsViewModelImpl extends DataControlsViewModel {

    /* JADX INFO: renamed from: i */
    public final AbstractC21864z f39493i;

    /* JADX INFO: renamed from: j */
    public final C18086K f39494j;

    /* JADX INFO: renamed from: k */
    public final C13132J f39495k;

    /* JADX INFO: renamed from: l */
    public final C13158l f39496l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC20904w f39497m;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.data.DataControlsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.data.DataControlsViewModelImpl$1", m20656f = "DataControlsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/A;", "it", "Lmm/C;", "<anonymous>", "(Lzi/A;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124801 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39498Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.data.DataControlsViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LLg/z;", "invoke", "(LLg/z;)LLg/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21891A f39500Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21891A c21891a) {
                super(1);
                this.f39500Y = c21891a;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C5054z setState = (C5054z) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C5054z.m5657e(setState, null, null, null, null, this.f39500Y.f69415a, false, null, null, null, 4063);
            }
        }

        public C124801(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124801 c124801 = DataControlsViewModelImpl.this.new C124801(interfaceC18770c);
            c124801.f39498Y = obj;
            return c124801;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124801 c124801 = (C124801) create((C21891A) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124801.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            DataControlsViewModelImpl.this.m14397m(new AnonymousClass1((C21891A) this.f39498Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.data.DataControlsViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LLg/z;", "", "it", "invoke", "(LLg/z;Z)LLg/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124812 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124812 f39501Y = new C124812();

        public C124812() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C5054z setOnEach = (C5054z) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C5054z.m5657e(setOnEach, null, null, null, null, null, zBooleanValue, null, null, null, 4031);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.data.DataControlsViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LLg/z;", "LCi/d;", "it", "invoke", "(LLg/z;LCi/d;)LLg/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124823 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124823 f39502Y = new C124823();

        public C124823() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C5054z setOnEach = (C5054z) obj;
            C1699d it = (C1699d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C5054z.m5657e(setOnEach, null, null, null, null, null, false, it.f4829c, it.f4830d, it.f4831e, 1407);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.data.DataControlsViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.data.DataControlsViewModelImpl$4", m20656f = "DataControlsViewModel.kt", m20657l = {119}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124834 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f39503Y;

        public C124834(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return DataControlsViewModelImpl.this.new C124834(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C124834) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39503Y;
            DataControlsViewModelImpl dataControlsViewModelImpl = DataControlsViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C13132J c13132j = dataControlsViewModelImpl.f39495k;
                this.f39503Y = 1;
                obj = c13132j.m14807d(this);
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
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                dataControlsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataControlsViewModelImpl(AbstractC21864z abstractC21864z, C18086K c18086k, C13132J c13132j, C13166t c13166t, C13158l c13158l, InterfaceC20904w interfaceC20904w, C15000g c15000g, InterfaceC13849E interfaceC13849E) {
        C14005w2 c14005w2 = (C14005w2) interfaceC13849E;
        super(new C5054z(null, null, null, null, null, null, false, null, c14005w2.m15481a(C13869K1.f43907c), null, c14005w2.m15481a(C13839A1.f43875c), null));
        this.f39493i = abstractC21864z;
        this.f39494j = c18086k;
        this.f39495k = c13132j;
        this.f39496l = c13158l;
        this.f39497m = interfaceC20904w;
        AbstractC2124C.m3226y(new C1970n(c13166t.f41802f, 5, new C124801(null)), ViewModelKt.m12143a(this));
        m14396l(C124812.f39501Y, c15000g.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
        m14396l(C124823.f39502Y, c13132j.f41695r0);
        m14394i(new C124834(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14352n(DataControlsViewModelImpl dataControlsViewModelImpl, AbstractC19687c abstractC19687c) throws Throwable {
        DataControlsViewModelImpl$archiveHistory$1 dataControlsViewModelImpl$archiveHistory$1;
        dataControlsViewModelImpl.getClass();
        if (abstractC19687c instanceof DataControlsViewModelImpl$archiveHistory$1) {
            dataControlsViewModelImpl$archiveHistory$1 = (DataControlsViewModelImpl$archiveHistory$1) abstractC19687c;
            int i10 = dataControlsViewModelImpl$archiveHistory$1.f39508p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataControlsViewModelImpl$archiveHistory$1.f39508p0 = i10 - Integer.MIN_VALUE;
            } else {
                dataControlsViewModelImpl$archiveHistory$1 = new DataControlsViewModelImpl$archiveHistory$1(dataControlsViewModelImpl, abstractC19687c);
            }
        } else {
            dataControlsViewModelImpl$archiveHistory$1 = new DataControlsViewModelImpl$archiveHistory$1(dataControlsViewModelImpl, abstractC19687c);
        }
        Object objM19705a = dataControlsViewModelImpl$archiveHistory$1.f39506Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = dataControlsViewModelImpl$archiveHistory$1.f39508p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19705a);
            dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$archiveHistory$2.f39509Y);
            dataControlsViewModelImpl$archiveHistory$1.f39505Y = dataControlsViewModelImpl;
            dataControlsViewModelImpl$archiveHistory$1.f39508p0 = 1;
            objM19705a = dataControlsViewModelImpl.f39494j.m19705a(dataControlsViewModelImpl$archiveHistory$1);
            if (objM19705a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataControlsViewModelImpl = dataControlsViewModelImpl$archiveHistory$1.f39505Y;
            AbstractC9233X.m9807c(objM19705a);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19705a;
        if (!(abstractC21955Q1 instanceof C21952P1)) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                dataControlsViewModelImpl.m14397m(new DataControlsViewModelImpl$archiveHistory$4$1((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            dataControlsViewModelImpl.m14392g(new C5038j(abstractC21955Q1));
            dataControlsViewModelImpl.m14392g(new C5037i(C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15)));
            return C17296C.f55119a;
        }
        dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$archiveHistory$3$1.f39510Y);
        dataControlsViewModelImpl.m14392g(new C5038j(abstractC21955Q1));
        dataControlsViewModelImpl.m14392g(new C5037i(C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15)));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14353o(DataControlsViewModelImpl dataControlsViewModelImpl, AbstractC19687c abstractC19687c) throws Throwable {
        DataControlsViewModelImpl$clearHistory$1 dataControlsViewModelImpl$clearHistory$1;
        dataControlsViewModelImpl.getClass();
        if (abstractC19687c instanceof DataControlsViewModelImpl$clearHistory$1) {
            dataControlsViewModelImpl$clearHistory$1 = (DataControlsViewModelImpl$clearHistory$1) abstractC19687c;
            int i10 = dataControlsViewModelImpl$clearHistory$1.f39515p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataControlsViewModelImpl$clearHistory$1.f39515p0 = i10 - Integer.MIN_VALUE;
            } else {
                dataControlsViewModelImpl$clearHistory$1 = new DataControlsViewModelImpl$clearHistory$1(dataControlsViewModelImpl, abstractC19687c);
            }
        } else {
            dataControlsViewModelImpl$clearHistory$1 = new DataControlsViewModelImpl$clearHistory$1(dataControlsViewModelImpl, abstractC19687c);
        }
        Object objM19708d = dataControlsViewModelImpl$clearHistory$1.f39513Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = dataControlsViewModelImpl$clearHistory$1.f39515p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19708d);
            dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66511g, C17690x.f56481Y);
            dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$clearHistory$2.f39516Y);
            dataControlsViewModelImpl$clearHistory$1.f39512Y = dataControlsViewModelImpl;
            dataControlsViewModelImpl$clearHistory$1.f39515p0 = 1;
            objM19708d = dataControlsViewModelImpl.f39494j.m19708d(dataControlsViewModelImpl$clearHistory$1);
            if (objM19708d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataControlsViewModelImpl = dataControlsViewModelImpl$clearHistory$1.f39512Y;
            AbstractC9233X.m9807c(objM19708d);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19708d;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C20885d c20885d = C20885d.f66512h;
        if (!z6) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66510f, C17690x.f56481Y);
                dataControlsViewModelImpl.m14397m(new DataControlsViewModelImpl$clearHistory$4$1((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            dataControlsViewModelImpl.m14392g(new C5039k(abstractC21955Q1));
            return C17296C.f55119a;
        }
        dataControlsViewModelImpl.f39497m.mo21447a(c20885d, C17690x.f56481Y);
        dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$clearHistory$3$1.f39517Y);
        dataControlsViewModelImpl.m14392g(new C5039k(abstractC21955Q1));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14354p(DataControlsViewModelImpl dataControlsViewModelImpl, AbstractC19687c abstractC19687c) {
        DataControlsViewModelImpl$deleteAccount$1 dataControlsViewModelImpl$deleteAccount$1;
        dataControlsViewModelImpl.getClass();
        if (abstractC19687c instanceof DataControlsViewModelImpl$deleteAccount$1) {
            dataControlsViewModelImpl$deleteAccount$1 = (DataControlsViewModelImpl$deleteAccount$1) abstractC19687c;
            int i10 = dataControlsViewModelImpl$deleteAccount$1.f39522p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataControlsViewModelImpl$deleteAccount$1.f39522p0 = i10 - Integer.MIN_VALUE;
            } else {
                dataControlsViewModelImpl$deleteAccount$1 = new DataControlsViewModelImpl$deleteAccount$1(dataControlsViewModelImpl, abstractC19687c);
            }
        } else {
            dataControlsViewModelImpl$deleteAccount$1 = new DataControlsViewModelImpl$deleteAccount$1(dataControlsViewModelImpl, abstractC19687c);
        }
        Object objM14821b = dataControlsViewModelImpl$deleteAccount$1.f39520Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = dataControlsViewModelImpl$deleteAccount$1.f39522p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM14821b);
            dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66508d, C17690x.f56481Y);
            dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$deleteAccount$2.f39523Y);
            dataControlsViewModelImpl$deleteAccount$1.f39519Y = dataControlsViewModelImpl;
            dataControlsViewModelImpl$deleteAccount$1.f39522p0 = 1;
            objM14821b = dataControlsViewModelImpl.f39496l.m14821b(dataControlsViewModelImpl$deleteAccount$1);
            if (objM14821b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataControlsViewModelImpl = dataControlsViewModelImpl$deleteAccount$1.f39519Y;
            AbstractC9233X.m9807c(objM14821b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM14821b;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C20885d c20885d = C20885d.f66509e;
        if (!z6) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66507c, C17690x.f56481Y);
                dataControlsViewModelImpl.m14397m(new DataControlsViewModelImpl$deleteAccount$4$1((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            dataControlsViewModelImpl.m14392g(new C5041m(abstractC21955Q1));
            return C17296C.f55119a;
        }
        dataControlsViewModelImpl.f39497m.mo21447a(c20885d, C17690x.f56481Y);
        dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$deleteAccount$3$1.f39524Y);
        dataControlsViewModelImpl.m14392g(new C5041m(abstractC21955Q1));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: q */
    public static final Object m14355q(DataControlsViewModelImpl dataControlsViewModelImpl, AbstractC19687c abstractC19687c) {
        DataControlsViewModelImpl$exportData$1 dataControlsViewModelImpl$exportData$1;
        DataControlsViewModelImpl$exportData$3$1 dataControlsViewModelImpl$exportData$3$1;
        dataControlsViewModelImpl.getClass();
        if (abstractC19687c instanceof DataControlsViewModelImpl$exportData$1) {
            dataControlsViewModelImpl$exportData$1 = (DataControlsViewModelImpl$exportData$1) abstractC19687c;
            int i10 = dataControlsViewModelImpl$exportData$1.f39529p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataControlsViewModelImpl$exportData$1.f39529p0 = i10 - Integer.MIN_VALUE;
            } else {
                dataControlsViewModelImpl$exportData$1 = new DataControlsViewModelImpl$exportData$1(dataControlsViewModelImpl, abstractC19687c);
            }
        } else {
            dataControlsViewModelImpl$exportData$1 = new DataControlsViewModelImpl$exportData$1(dataControlsViewModelImpl, abstractC19687c);
        }
        Object objM14822c = dataControlsViewModelImpl$exportData$1.f39527Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = dataControlsViewModelImpl$exportData$1.f39529p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM14822c);
            dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66514j, C17690x.f56481Y);
            dataControlsViewModelImpl.m14397m(DataControlsViewModelImpl$exportData$2.f39530Y);
            dataControlsViewModelImpl$exportData$1.f39526Y = dataControlsViewModelImpl;
            dataControlsViewModelImpl$exportData$1.f39529p0 = 1;
            objM14822c = dataControlsViewModelImpl.f39496l.m14822c(dataControlsViewModelImpl$exportData$1);
            if (objM14822c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataControlsViewModelImpl = dataControlsViewModelImpl$exportData$1.f39526Y;
            AbstractC9233X.m9807c(objM14822c);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM14822c;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C20885d c20885d = C20885d.f66515k;
        C17296C c17296c = C17296C.f55119a;
        if (!z6) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC21933K1 error = (AbstractC21933K1) abstractC21955Q1;
                dataControlsViewModelImpl.f39497m.mo21447a(C20885d.f66513i, C17690x.f56481Y);
                AbstractC16544l.m18094g(error, "error");
                dataControlsViewModelImpl.m14397m(new DataControlsViewModelImpl$exportData$4$1(error));
            } else {
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                dataControlsViewModelImpl.f39497m.mo21447a(c20885d, C17690x.f56481Y);
                dataControlsViewModelImpl$exportData$3$1 = new DataControlsViewModelImpl$exportData$3$1(1);
            }
            dataControlsViewModelImpl.m14392g(new C5040l(abstractC21955Q1));
            return c17296c;
        }
        dataControlsViewModelImpl.f39497m.mo21447a(c20885d, C17690x.f56481Y);
        dataControlsViewModelImpl$exportData$3$1 = new DataControlsViewModelImpl$exportData$3$1(1);
        dataControlsViewModelImpl.m14397m(dataControlsViewModelImpl$exportData$3$1);
        dataControlsViewModelImpl.m14392g(new C5040l(abstractC21955Q1));
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC5051w intent = (InterfaceC5051w) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C5047s.f16494a)) {
            m14394i(new DataControlsViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent.equals(C5046r.f16493a)) {
            m14394i(new DataControlsViewModelImpl$onIntent$2(this, null));
            return;
        }
        if (intent.equals(C5049u.f16496a)) {
            m14394i(new DataControlsViewModelImpl$onIntent$3(this, null));
            return;
        }
        if (intent.equals(C5048t.f16495a)) {
            m14394i(new DataControlsViewModelImpl$onIntent$4(this, null));
            return;
        }
        if (intent.equals(C5050v.f16497a)) {
            C5409l c5409l = C5409l.f17683h;
            c5409l.getClass();
            m14393h(new C2058g(c5409l.m5885a(C5391c.f17646Z), true));
        } else if (intent instanceof C5043o) {
            m14394i(new DataControlsViewModelImpl$onIntent$5(this, intent, null));
        } else if (intent instanceof C5045q) {
            m14394i(new DataControlsViewModelImpl$onIntent$6(this, intent, null));
        } else if (intent instanceof C5044p) {
            m14394i(new DataControlsViewModelImpl$onIntent$7(this, intent, null));
        }
    }
}
