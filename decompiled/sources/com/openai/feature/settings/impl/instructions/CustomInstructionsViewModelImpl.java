package com.openai.feature.settings.impl.instructions;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p086D6.C1970n;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.EnumC22026l;
import p363Og.C6214r;
import p363Og.C6215s;
import p363Og.C6216t;
import p363Og.C6221y;
import p363Og.InterfaceC6217u;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13133K;
import p811ih.C15000g;
import p885m4.C17155e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ve.C20584h;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/instructions/CustomInstructionsViewModelImpl;", "Lcom/openai/feature/settings/impl/instructions/CustomInstructionsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomInstructionsViewModelImpl extends CustomInstructionsViewModel {

    /* JADX INFO: renamed from: i */
    public final C20592p f39588i;

    /* JADX INFO: renamed from: j */
    public final C13133K f39589j;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$1", m20656f = "CustomInstructionsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lve/h;", "it", "Lmm/C;", "<anonymous>", "(Lve/h;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124871 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39590Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/y;", "invoke", "(LOg/y;)LOg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C20584h f39592Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C20584h c20584h) {
                super(1);
                this.f39592Y = c20584h;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6221y setState = (C6221y) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C6221y.m6733e(setState, false, false, this.f39592Y, false, 23);
            }
        }

        public C124871(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124871 c124871 = CustomInstructionsViewModelImpl.this.new C124871(interfaceC18770c);
            c124871.f39590Y = obj;
            return c124871;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124871 c124871 = (C124871) create((C20584h) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124871.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            CustomInstructionsViewModelImpl.this.m14397m(new AnonymousClass1((C20584h) this.f39590Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$2", m20656f = "CustomInstructionsViewModel.kt", m20657l = {63}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124882 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39593Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/y;", "invoke", "(LOg/y;)LOg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f39595Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6221y setState = (C6221y) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C6221y.m6733e(setState, false, false, null, false, 27);
            }
        }

        public C124882(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return CustomInstructionsViewModelImpl.this.new C124882(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124882) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39593Y;
            CustomInstructionsViewModelImpl customInstructionsViewModelImpl = CustomInstructionsViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C20592p c20592p = customInstructionsViewModelImpl.f39588i;
                this.f39593Y = 1;
                obj = c20592p.m21189c(this);
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
                customInstructionsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            }
            customInstructionsViewModelImpl.m14397m(AnonymousClass2.f39595Y);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$3", m20656f = "CustomInstructionsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LCi/j;", "it", "Lmm/C;", "<anonymous>", "(LCi/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124893 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39596Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/y;", "invoke", "(LOg/y;)LOg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C1705j f39598Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1705j c1705j) {
                super(1);
                this.f39598Y = c1705j;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6221y setState = (C6221y) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C6221y.m6733e(setState, this.f39598Y.f4872e, false, null, false, 30);
            }
        }

        public C124893(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124893 c124893 = CustomInstructionsViewModelImpl.this.new C124893(interfaceC18770c);
            c124893.f39596Y = obj;
            return c124893;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124893 c124893 = (C124893) create((C1705j) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124893.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            CustomInstructionsViewModelImpl.this.m14397m(new AnonymousClass1((C1705j) this.f39596Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOg/y;", "", "it", "invoke", "(LOg/y;Z)LOg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124904 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124904 f39599Y = new C124904();

        public C124904() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C6221y setOnEach = (C6221y) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C6221y.m6733e(setOnEach, false, false, null, zBooleanValue, 15);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$5 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$5", m20656f = "CustomInstructionsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/A;", "it", "", "<anonymous>", "(Lzi/A;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124915 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39600Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124915 c124915 = new C124915(2, interfaceC18770c);
            c124915.f39600Y = obj;
            return c124915;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124915) create((C21891A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(((C21891A) this.f39600Y).m22331j());
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsViewModelImpl$6 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOg/y;", "", "it", "invoke", "(LOg/y;Z)LOg/y;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124926 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124926 f39601Y = new C124926();

        public C124926() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C6221y setOnEach = (C6221y) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C6221y.m6733e(setOnEach, false, zBooleanValue, null, false, 29);
        }
    }

    public CustomInstructionsViewModelImpl(C20592p c20592p, C15000g c15000g, C13133K c13133k) {
        super(new C6221y(false, false, true, null, false));
        this.f39588i = c20592p;
        this.f39589j = c13133k;
        AbstractC2124C.m3226y(new C1970n(c20592p.f65348r0, 5, new C124871(null)), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124882(null), 3);
        AbstractC2124C.m3226y(new C1970n(c13133k.f41697b, 5, new C124893(null)), ViewModelKt.m12143a(this));
        C17155e c17155e = EnumC22026l.f69677Z;
        m14396l(C124904.f39599Y, c15000g.m16134a(EnumC22026l.SearchTool, null));
        m14396l(C124926.f39601Y, AbstractC9206S2.m9771b(new C124915(2, null), c15000g.f46691b));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC6217u intent = (InterfaceC6217u) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C6215s) {
            m14394i(new CustomInstructionsViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C6214r) {
            this.f39589j.m14817a(CustomInstructionsViewModelImpl$onIntent$2.f39605Y);
        } else if (intent instanceof C6216t) {
            m14394i(new CustomInstructionsViewModelImpl$onIntent$3(this, intent, null));
        }
    }
}
