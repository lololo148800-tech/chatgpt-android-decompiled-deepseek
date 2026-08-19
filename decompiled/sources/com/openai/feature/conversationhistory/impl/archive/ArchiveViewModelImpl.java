package com.openai.feature.conversationhistory.impl.archive;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13888R0;
import java.util.ArrayList;
import java.util.List;
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
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1039ud.C20185b;
import p1039ud.C20186c;
import p1039ud.C20187d;
import p1039ud.C20188e;
import p1039ud.C20189f;
import p1039ud.C20192i;
import p1039ud.C20194k;
import p1039ud.InterfaceC20190g;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p318Mh.C5391c;
import p318Mh.C5410l0;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p582Xk.HXHG.bQBnquXS;
import p811ih.C15000g;
import p909nm.C17689w;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/archive/ArchiveViewModelImpl;", "Lcom/openai/feature/conversationhistory/impl/archive/ArchiveViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ArchiveViewModelImpl extends ArchiveViewModel {

    /* JADX INFO: renamed from: i */
    public final C20192i f37341i;

    /* JADX INFO: renamed from: j */
    public final C18077B f37342j;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lud/k;", "", "LQd/i;", "it", "invoke", "(Lud/k;Ljava/util/List;)Lud/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122331 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122331 f37343Y = new C122331();

        public C122331() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20194k setOnEach = (C20194k) obj;
            List it = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C20194k.m21010e(setOnEach, false, it, null, false, 27);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lud/k;", "", "it", "invoke", "(Lud/k;Z)Lud/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122342 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122342 f37344Y = new C122342();

        public C122342() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20194k setOnEach = (C20194k) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C20194k.m21010e(setOnEach, false, null, null, zBooleanValue, 15);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$3", m20656f = "ArchiveViewModel.kt", m20657l = {65}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122353 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37345Y;

        /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lud/k;", "invoke", "(Lud/k;)Lud/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f37347Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C20194k setState = (C20194k) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C20194k.m21010e(setState, false, null, null, false, 30);
            }
        }

        public C122353(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ArchiveViewModelImpl.this.new C122353(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122353) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37345Y;
            ArchiveViewModelImpl archiveViewModelImpl = ArchiveViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C20192i c20192i = archiveViewModelImpl.f37341i;
                this.f37345Y = 1;
                if ((c20192i.f63943d ? new C21952P1(Boolean.TRUE) : c20192i.m21009a(this)) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException(bQBnquXS.jduM);
                }
                AbstractC9233X.m9807c(obj);
            }
            archiveViewModelImpl.m14397m(AnonymousClass1.f37347Y);
            return C17296C.f55119a;
        }
    }

    public ArchiveViewModelImpl(C20192i c20192i, C18077B c18077b, C15000g c15000g) {
        super(new C20194k(true, true, C17689w.f56480Y, "", false));
        this.f37341i = c20192i;
        this.f37342j = c18077b;
        m14396l(C122331.f37343Y, c20192i.f63942c);
        m14396l(C122342.f37344Y, c15000g.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C122353(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14235n(ArchiveViewModelImpl archiveViewModelImpl, AbstractC19687c abstractC19687c) {
        ArchiveViewModelImpl$fetchMore$1 archiveViewModelImpl$fetchMore$1;
        archiveViewModelImpl.getClass();
        if (abstractC19687c instanceof ArchiveViewModelImpl$fetchMore$1) {
            archiveViewModelImpl$fetchMore$1 = (ArchiveViewModelImpl$fetchMore$1) abstractC19687c;
            int i10 = archiveViewModelImpl$fetchMore$1.f37351p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                archiveViewModelImpl$fetchMore$1.f37351p0 = i10 - Integer.MIN_VALUE;
            } else {
                archiveViewModelImpl$fetchMore$1 = new ArchiveViewModelImpl$fetchMore$1(archiveViewModelImpl, abstractC19687c);
            }
        } else {
            archiveViewModelImpl$fetchMore$1 = new ArchiveViewModelImpl$fetchMore$1(archiveViewModelImpl, abstractC19687c);
        }
        Object c21952p1 = archiveViewModelImpl$fetchMore$1.f37349Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = archiveViewModelImpl$fetchMore$1.f37351p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(c21952p1);
            archiveViewModelImpl$fetchMore$1.f37348Y = archiveViewModelImpl;
            archiveViewModelImpl$fetchMore$1.f37351p0 = 1;
            C20192i c20192i = archiveViewModelImpl.f37341i;
            c21952p1 = c20192i.f63943d ? new C21952P1(Boolean.TRUE) : c20192i.m21009a(archiveViewModelImpl$fetchMore$1);
            if (c21952p1 == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            archiveViewModelImpl = archiveViewModelImpl$fetchMore$1.f37348Y;
            AbstractC9233X.m9807c(c21952p1);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) c21952p1;
        if (abstractC21955Q1 instanceof C21952P1) {
            archiveViewModelImpl.m14397m(new ArchiveViewModelImpl$fetchMore$2$1(((Boolean) ((C21952P1) abstractC21955Q1).f69511a).booleanValue()));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            archiveViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m14236o(ArchiveViewModelImpl archiveViewModelImpl, AbstractC21955Q1 abstractC21955Q1, C6636i c6636i) {
        archiveViewModelImpl.getClass();
        if (!(abstractC21955Q1 instanceof C21952P1)) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                archiveViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                return;
            } else {
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                return;
            }
        }
        C20192i c20192i = archiveViewModelImpl.f37341i;
        c20192i.getClass();
        C2153Q0 c2153q0 = c20192i.f63941b;
        Iterable iterable = (Iterable) c2153q0.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!AbstractC16544l.m18089b(((C6636i) obj).f21379a, c6636i.f21379a)) {
                arrayList.add(obj);
            }
        }
        c2153q0.m3251l(null, arrayList);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC20190g intent = (InterfaceC20190g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C20187d) {
            m14397m(new ArchiveViewModelImpl$search$1(((C20187d) intent).f63933a));
            return;
        }
        if (intent instanceof C20186c) {
            m14394i(new ArchiveViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C20189f) {
            m14394i(new ArchiveViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C20185b) {
            m14394i(new ArchiveViewModelImpl$onIntent$3(this, intent, null));
        } else if (intent instanceof C20188e) {
            C5410l0 c5410l0 = C5410l0.f17684g;
            c5410l0.getClass();
            m14393h(new C2058g(c5410l0.m5885a(C5391c.f17646Z), true));
        }
    }
}
