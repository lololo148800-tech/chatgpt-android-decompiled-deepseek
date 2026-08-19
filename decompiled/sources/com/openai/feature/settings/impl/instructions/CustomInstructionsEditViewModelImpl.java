package com.openai.feature.settings.impl.instructions;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2056e;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1083we.C20911B;
import p1113xn.AbstractC21322p;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC22055s0;
import p318Mh.C5351A;
import p350O1.C6045C;
import p363Og.C6202f;
import p363Og.C6203g;
import p363Og.C6204h;
import p363Og.C6205i;
import p363Og.C6213q;
import p363Og.InterfaceC6206j;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p909nm.C17691y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ve.C20584h;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/instructions/CustomInstructionsEditViewModelImpl;", "Lcom/openai/feature/settings/impl/instructions/CustomInstructionsEditViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomInstructionsEditViewModelImpl extends CustomInstructionsEditViewModel {

    /* JADX INFO: renamed from: i */
    public final C20592p f39564i;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModelImpl$1", m20656f = "CustomInstructionsEditViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lve/h;", "it", "Lmm/C;", "<anonymous>", "(Lve/h;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124851 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39565Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/q;", "invoke", "(LOg/q;)LOg/q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C20584h f39567Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C20584h c20584h) {
                super(1);
                this.f39567Y = c20584h;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x001f A[PHI: r2
              0x001f: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:15:0x002b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                String str;
                C6213q setState = (C6213q) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                int iOrdinal = setState.f20221a.ordinal();
                String str2 = "";
                C20584h c20584h = this.f39567Y;
                if (iOrdinal == 0) {
                    str = c20584h != null ? c20584h.f65316b : null;
                    if (str != null) {
                        str2 = str;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                    str = c20584h != null ? c20584h.f65317c : null;
                    if (str != null) {
                        str2 = str;
                    }
                }
                int length = str2.length();
                return C6213q.m6731e(setState, this.f39567Y, new C6045C(AbstractC8676n.m9365b(length, length), str2, 4), false, false, 25);
            }
        }

        public C124851(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124851 c124851 = CustomInstructionsEditViewModelImpl.this.new C124851(interfaceC18770c);
            c124851.f39565Y = obj;
            return c124851;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124851 c124851 = (C124851) create((C20584h) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124851.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            CustomInstructionsEditViewModelImpl.this.m14397m(new AnonymousClass1((C20584h) this.f39565Y));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomInstructionsEditViewModelImpl(C11082S c11082s, C20592p c20592p) {
        super(new C6213q((EnumC22055s0) C5351A.f17576h.m5892c(c11082s), null, new C6045C(0L, "", 6), false, false));
        C5351A.f17575g.getClass();
        this.f39564i = c20592p;
        AbstractC2124C.m3226y(new C1970n(c20592p.f65348r0, 5, new C124851(null)), ViewModelKt.m12143a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14356n(CustomInstructionsEditViewModelImpl customInstructionsEditViewModelImpl, AbstractC19687c abstractC19687c) {
        CustomInstructionsEditViewModelImpl$save$1 customInstructionsEditViewModelImpl$save$1;
        C20584h c20584hM21188a;
        customInstructionsEditViewModelImpl.getClass();
        if (abstractC19687c instanceof CustomInstructionsEditViewModelImpl$save$1) {
            customInstructionsEditViewModelImpl$save$1 = (CustomInstructionsEditViewModelImpl$save$1) abstractC19687c;
            int i10 = customInstructionsEditViewModelImpl$save$1.f39575p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                customInstructionsEditViewModelImpl$save$1.f39575p0 = i10 - Integer.MIN_VALUE;
            } else {
                customInstructionsEditViewModelImpl$save$1 = new CustomInstructionsEditViewModelImpl$save$1(customInstructionsEditViewModelImpl, abstractC19687c);
            }
        } else {
            customInstructionsEditViewModelImpl$save$1 = new CustomInstructionsEditViewModelImpl$save$1(customInstructionsEditViewModelImpl, abstractC19687c);
        }
        Object objM21191e = customInstructionsEditViewModelImpl$save$1.f39573Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = customInstructionsEditViewModelImpl$save$1.f39575p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM21191e);
            customInstructionsEditViewModelImpl.m14397m(CustomInstructionsEditViewModelImpl$save$2.f39576Y);
            C6213q c6213q = (C6213q) customInstructionsEditViewModelImpl.f40343c.getValue();
            C20584h c20584h = c6213q.f20222b;
            if (c20584h == null) {
                c20584h = new C20584h(false, "", "", C17691y.f56482Y);
            }
            C20584h c20584h2 = c20584h;
            int iOrdinal = c6213q.f20221a.ordinal();
            C6045C c6045c = c6213q.f20223c;
            if (iOrdinal == 0) {
                c20584hM21188a = C20584h.m21188a(c20584h2, false, c6045c.f19682a.f10934Y, null, null, 13);
            } else {
                if (iOrdinal != 1) {
                    throw new C0644w();
                }
                c20584hM21188a = C20584h.m21188a(c20584h2, false, null, c6045c.f19682a.f10934Y, null, 11);
            }
            customInstructionsEditViewModelImpl$save$1.f39572Y = customInstructionsEditViewModelImpl;
            customInstructionsEditViewModelImpl$save$1.f39575p0 = 1;
            objM21191e = customInstructionsEditViewModelImpl.f39564i.m21191e(c20584hM21188a, customInstructionsEditViewModelImpl$save$1);
            if (objM21191e == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customInstructionsEditViewModelImpl = customInstructionsEditViewModelImpl$save$1.f39572Y;
            AbstractC9233X.m9807c(objM21191e);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM21191e;
        if (abstractC21955Q1 instanceof C21952P1) {
            customInstructionsEditViewModelImpl.m14393h(C2056e.f6277a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            Throwable th2 = abstractC21933K1.f69485a;
            if (th2 instanceof C20911B) {
                customInstructionsEditViewModelImpl.m14393h(new C2059h(((C20911B) th2).f66659Y.f66656a));
            } else {
                customInstructionsEditViewModelImpl.m14393h(new C2059h(abstractC21933K1));
            }
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        customInstructionsEditViewModelImpl.m14397m(CustomInstructionsEditViewModelImpl$save$5.f39577Y);
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC6206j intent = (InterfaceC6206j) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean z6 = intent instanceof C6202f;
        C2056e c2056e = C2056e.f6277a;
        if (z6) {
            if (((C6213q) this.f40343c.getValue()).m6732f()) {
                m14397m(CustomInstructionsEditViewModelImpl$onIntent$1.f39568Y);
                return;
            } else {
                m14393h(c2056e);
                return;
            }
        }
        if (intent instanceof C6203g) {
            if (((C6203g) intent).f20207a) {
                m14393h(c2056e);
                return;
            } else {
                m14397m(CustomInstructionsEditViewModelImpl$onIntent$2.f39569Y);
                return;
            }
        }
        if (intent instanceof C6204h) {
            m14394i(new CustomInstructionsEditViewModelImpl$onIntent$3(this, null));
        } else if (intent instanceof C6205i) {
            C6045C c6045c = ((C6205i) intent).f20209a;
            m14397m(new CustomInstructionsEditViewModelImpl$update$1(c6045c, AbstractC21322p.m21709q0(1500, c6045c.f19682a.f10934Y)));
        }
    }
}
