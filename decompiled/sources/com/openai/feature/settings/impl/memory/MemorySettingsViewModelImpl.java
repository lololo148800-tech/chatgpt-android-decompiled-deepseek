package com.openai.feature.settings.impl.memory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13891S0;
import gd.C13894T0;
import gd.C14005w2;
import gd.InterfaceC13849E;
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
import p086D6.C1970n;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p318Mh.C5354B0;
import p318Mh.C5391c;
import p318Mh.C5437z;
import p406Qg.C6715k;
import p406Qg.C6716l;
import p406Qg.C6717m;
import p406Qg.C6718n;
import p406Qg.C6719o;
import p406Qg.C6720p;
import p406Qg.C6725u;
import p406Qg.InterfaceC6721q;
import p456Sg.C7132c;
import p506Ug.C7674i;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13132J;
import p811ih.C15000g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ve.C20584h;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/MemorySettingsViewModelImpl;", "Lcom/openai/feature/settings/impl/memory/MemorySettingsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MemorySettingsViewModelImpl extends MemorySettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final C13132J f39620i;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$1", m20656f = "MemorySettingsViewModel.kt", m20657l = {71}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124931 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39621Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C7132c f39622Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ MemorySettingsViewModelImpl f39623o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124931(C7132c c7132c, MemorySettingsViewModelImpl memorySettingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39622Z = c7132c;
            this.f39623o0 = memorySettingsViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C124931(this.f39622Z, this.f39623o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124931) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39621Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39621Y = 1;
                obj = this.f39622Z.m7523b(null, false, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException(SfpOlmlMATQ.BXptopmGHLvLze);
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            boolean z6 = abstractC21955Q1 instanceof C21952P1;
            MemorySettingsViewModelImpl memorySettingsViewModelImpl = this.f39623o0;
            if (z6) {
                memorySettingsViewModelImpl.m14397m(new MemorySettingsViewModelImpl$1$1$1((C7674i) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                memorySettingsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$2", m20656f = "MemorySettingsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lve/h;", "it", "Lmm/C;", "<anonymous>", "(Lve/h;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124942 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39625Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQg/u;", "invoke", "(LQg/u;)LQg/u;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C20584h f39627Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C20584h c20584h) {
                super(1);
                this.f39627Y = c20584h;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6725u setState = (C6725u) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C6725u.m7184e(setState, null, false, null, false, null, this.f39627Y, 63);
            }
        }

        public C124942(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124942 c124942 = MemorySettingsViewModelImpl.this.new C124942(interfaceC18770c);
            c124942.f39625Y = obj;
            return c124942;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124942 c124942 = (C124942) create((C20584h) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124942.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            MemorySettingsViewModelImpl.this.m14397m(new AnonymousClass1((C20584h) this.f39625Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LQg/u;", "", "it", "invoke", "(LQg/u;Z)LQg/u;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124953 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124953 f39628Y = new C124953();

        public C124953() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C6725u setOnEach = (C6725u) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C6725u.m7184e(setOnEach, null, zBooleanValue, null, false, null, null, 125);
        }
    }

    public MemorySettingsViewModelImpl(C13132J c13132j, C20592p c20592p, C7132c c7132c, InterfaceC13849E interfaceC13849E, C15000g c15000g) {
        super(new C6725u(null, false, null, ((C14005w2) interfaceC13849E).m15481a(C13894T0.f43943c), false, null, null));
        this.f39620i = c13132j;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124931(c7132c, this, null), 3);
        AbstractC2124C.m3226y(new C1970n(c20592p.f65348r0, 5, new C124942(null)), ViewModelKt.m12143a(this));
        m14396l(C124953.f39628Y, c15000g.m16134a(EnumC22026l.MemoryInSearch, C13891S0.f43941c));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC6721q intent = (InterfaceC6721q) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C6716l) {
            m14394i(new MemorySettingsViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C6717m) {
            m14394i(new MemorySettingsViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C6719o) {
            m14394i(new MemorySettingsViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C6718n) {
            m14397m(new MemorySettingsViewModelImpl$onIntent$4(intent));
            return;
        }
        boolean z6 = intent instanceof C6720p;
        C5391c c5391c = C5391c.f17646Z;
        if (z6) {
            C5354B0 c5354b0 = C5354B0.f17582h;
            c5354b0.getClass();
            m14393h(new C2058g(c5354b0.m5885a(c5391c), true));
        } else if (intent instanceof C6715k) {
            C5437z c5437z = C5437z.f17776h;
            c5437z.getClass();
            m14393h(new C2058g(c5437z.m5885a(c5391c), true));
        }
    }
}
