package com.openai.feature.subscriptions.impl;

import android.app.Activity;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bh.C11431e;
import com.openai.chatgpt.R;
import com.openai.feature.subscriptions.SubscriptionsViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13904W1;
import gd.C13993t2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20856B;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21913F1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.EnumC22080y1;
import p1155zi.InterfaceC21925I1;
import p178H.AbstractC3137c;
import p195Hh.C3430e;
import p318Mh.C5370J0;
import p318Mh.C5426t0;
import p318Mh.EnumC5424s0;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p624Zg.AbstractC10345O;
import p624Zg.AbstractC10357a0;
import p624Zg.AbstractC10381m0;
import p624Zg.C10350U;
import p624Zg.C10351V;
import p624Zg.C10365e0;
import p624Zg.C10369g0;
import p624Zg.C10373i0;
import p624Zg.C10377k0;
import p624Zg.C10379l0;
import p909nm.AbstractC17659D;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/SubscriptionsViewModelImpl;", "Lcom/openai/feature/subscriptions/SubscriptionsViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionsViewModelImpl extends SubscriptionsViewModel {

    /* JADX INFO: renamed from: i */
    public final C11431e f39893i;

    /* JADX INFO: renamed from: j */
    public final C13993t2 f39894j;

    /* JADX INFO: renamed from: k */
    public final C18418a f39895k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f39896l;

    /* JADX INFO: renamed from: m */
    public final Object f39897m;

    /* JADX INFO: renamed from: n */
    public final C3430e f39898n;

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$1", m20656f = "SubscriptionsViewModelImpl.kt", m20657l = {60}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125191 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39899Y;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C11082S f39901o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125191(C11082S c11082s, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39901o0 = c11082s;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return SubscriptionsViewModelImpl.this.new C125191(this.f39901o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125191) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39899Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C11431e c11431e = SubscriptionsViewModelImpl.this.f39893i;
                C5426t0.f17732g.getClass();
                EnumC22080y1 enumC22080y1 = (EnumC22080y1) C5426t0.f17733h.m5892c(this.f39901o0);
                this.f39899Y = 1;
                if (c11431e.m12794c(enumC22080y1, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$2", m20656f = "SubscriptionsViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LZg/e0;", "subscriptionState", "Lmm/C;", "<anonymous>", "(LZg/e0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125202 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39902Y;

        /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/m0;", "invoke", "(LZg/m0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f39904Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                AbstractC10381m0 setState = (AbstractC10381m0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C10377k0(setState.mo10891e());
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/m0;", "invoke", "(LZg/m0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ InterfaceC21925I1 f39905Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ SubscriptionsViewModelImpl f39906Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC21925I1 interfaceC21925I1, SubscriptionsViewModelImpl subscriptionsViewModelImpl) {
                super(1);
                this.f39905Y = interfaceC21925I1;
                this.f39906Z = subscriptionsViewModelImpl;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0032  */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                boolean z6;
                AbstractC10381m0 abstractC10381m0 = (AbstractC10381m0) obj;
                AbstractC16544l.m18094g(abstractC10381m0, SfpOlmlMATQ.DEYMsLtYHW);
                List list = (List) ((C21921H1) this.f39905Y).f69472a;
                SubscriptionsViewModelImpl subscriptionsViewModelImpl = this.f39906Z;
                if (subscriptionsViewModelImpl.f39895k.f58774b.m22326e()) {
                    z6 = false;
                } else {
                    if (((Boolean) subscriptionsViewModelImpl.f39894j.m15479a(C13904W1.f43954d)).booleanValue()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                return new C10379l0(list, z6, null, null, abstractC10381m0.mo10891e());
            }
        }

        public C125202(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125202 c125202 = SubscriptionsViewModelImpl.this.new C125202(interfaceC18770c);
            c125202.f39902Y = obj;
            return c125202;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125202 c125202 = (C125202) create((C10365e0) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125202.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            InterfaceC21925I1 interfaceC21925I1 = ((C10365e0) this.f39902Y).f30719c;
            boolean zM18089b = AbstractC16544l.m18089b(interfaceC21925I1, C21917G1.f69468a);
            SubscriptionsViewModelImpl subscriptionsViewModelImpl = SubscriptionsViewModelImpl.this;
            if (zM18089b) {
                subscriptionsViewModelImpl.m14397m(AnonymousClass1.f39904Y);
            } else if (interfaceC21925I1 instanceof C21913F1) {
                Throwable th2 = ((C21913F1) interfaceC21925I1).f69462a.f69485a;
                AbstractC8160o6.m8727b(subscriptionsViewModelImpl.f39898n, "Unable to fetch subscription packages", th2, 4);
                if (th2 instanceof AbstractC10345O) {
                    C3430e c3430e = AbstractC10357a0.f30702o0;
                    SubscriptionsViewModelImpl.m14373p(subscriptionsViewModelImpl, AbstractC3137c.m3981d((AbstractC10345O) th2));
                } else {
                    SubscriptionsViewModelImpl.m14373p(subscriptionsViewModelImpl, new C10351V(th2));
                }
            } else if (interfaceC21925I1 instanceof C21921H1) {
                if (((List) ((C21921H1) interfaceC21925I1).f69472a).isEmpty()) {
                    AbstractC8160o6.m8727b(subscriptionsViewModelImpl.f39898n, "Packages successfully loaded, but were empty", null, 6);
                    SubscriptionsViewModelImpl.m14373p(subscriptionsViewModelImpl, C10350U.f30692p0);
                } else {
                    subscriptionsViewModelImpl.m14397m(new AnonymousClass2(interfaceC21925I1, subscriptionsViewModelImpl));
                }
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriptionsViewModelImpl(C11431e c11431e, C13993t2 c13993t2, C18418a c18418a, InterfaceC20904w interfaceC20904w, C11082S c11082s) {
        C5426t0.f17732g.getClass();
        C5370J0 c5370j0 = C5426t0.f17733h;
        super(new C10377k0((EnumC22080y1) c5370j0.m5892c(c11082s)));
        this.f39893i = c11431e;
        this.f39894j = c13993t2;
        this.f39895k = c18418a;
        this.f39896l = interfaceC20904w;
        C17309l c17309l = new C17309l("entry_point", ((EnumC5424s0) C5426t0.f17734i.m5892c(c11082s)).f17726Y);
        String str = c18418a.f58774b.m22327f().f69449Y;
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, new C17309l("current_plan", str == null ? "" : str), new C17309l("upsell_offering", ((EnumC22080y1) c5370j0.m5892c(c11082s)).f69800Z));
        this.f39897m = mapM19244f;
        this.f39898n = AbstractC8168p6.m8749b("SubscriptionsViewModel", null);
        interfaceC20904w.mo21447a(C20856B.f66314q, mapM19244f);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C125191(c11082s, null), 3);
        AbstractC2124C.m3226y(new C1970n(c11431e.f34536s0, 5, new C125202(null)), ViewModelKt.m12143a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static final Object m14372o(SubscriptionsViewModelImpl subscriptionsViewModelImpl, AbstractC19687c abstractC19687c) {
        SubscriptionsViewModelImpl$handleRestoreSubscription$1 subscriptionsViewModelImpl$handleRestoreSubscription$1;
        subscriptionsViewModelImpl.getClass();
        if (abstractC19687c instanceof SubscriptionsViewModelImpl$handleRestoreSubscription$1) {
            subscriptionsViewModelImpl$handleRestoreSubscription$1 = (SubscriptionsViewModelImpl$handleRestoreSubscription$1) abstractC19687c;
            int i10 = subscriptionsViewModelImpl$handleRestoreSubscription$1.f39910p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscriptionsViewModelImpl$handleRestoreSubscription$1.f39910p0 = i10 - Integer.MIN_VALUE;
            } else {
                subscriptionsViewModelImpl$handleRestoreSubscription$1 = new SubscriptionsViewModelImpl$handleRestoreSubscription$1(subscriptionsViewModelImpl, abstractC19687c);
            }
        } else {
            subscriptionsViewModelImpl$handleRestoreSubscription$1 = new SubscriptionsViewModelImpl$handleRestoreSubscription$1(subscriptionsViewModelImpl, abstractC19687c);
        }
        Object objM14825f = subscriptionsViewModelImpl$handleRestoreSubscription$1.f39908Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = subscriptionsViewModelImpl$handleRestoreSubscription$1.f39910p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM14825f);
            subscriptionsViewModelImpl.f39896l.mo21447a(C20856B.f66311n, subscriptionsViewModelImpl.f39897m);
            subscriptionsViewModelImpl$handleRestoreSubscription$1.f39907Y = subscriptionsViewModelImpl;
            subscriptionsViewModelImpl$handleRestoreSubscription$1.f39910p0 = 1;
            objM14825f = subscriptionsViewModelImpl.f39893i.f34532o0.m14825f(false, subscriptionsViewModelImpl$handleRestoreSubscription$1);
            if (objM14825f == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            subscriptionsViewModelImpl = subscriptionsViewModelImpl$handleRestoreSubscription$1.f39907Y;
            AbstractC9233X.m9807c(objM14825f);
        }
        if (((AbstractC21955Q1) objM14825f) instanceof AbstractC21933K1) {
            subscriptionsViewModelImpl.f39896l.mo21447a(C20856B.f66312o, subscriptionsViewModelImpl.f39897m);
            subscriptionsViewModelImpl.m14393h(new C2060i(R.string.subscriptions_restore_error));
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m14373p(SubscriptionsViewModelImpl subscriptionsViewModelImpl, AbstractC10357a0 abstractC10357a0) {
        subscriptionsViewModelImpl.getClass();
        int iOrdinal = abstractC10357a0.f30704Z.ordinal();
        if (iOrdinal == 0) {
            subscriptionsViewModelImpl.m14397m(new SubscriptionsViewModelImpl$presentError$1(abstractC10357a0));
            return;
        }
        int i10 = abstractC10357a0.f30703Y;
        if (iOrdinal == 1) {
            subscriptionsViewModelImpl.m14392g(new C10369g0(i10, false));
            subscriptionsViewModelImpl.m14397m(new SubscriptionsViewModelImpl$setStateIfLoaded$1(SubscriptionsViewModelImpl$presentError$2.f39914Y));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            subscriptionsViewModelImpl.m14392g(new C10369g0(i10, true));
            subscriptionsViewModelImpl.m14397m(new SubscriptionsViewModelImpl$presentError$3(abstractC10357a0));
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C10373i0 intent = (C10373i0) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C10373i0.f30742a)) {
            m14394i(new SubscriptionsViewModelImpl$onIntent$1(this, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.openai.feature.subscriptions.SubscriptionsViewModel
    /* JADX INFO: renamed from: n */
    public final void mo14370n(Activity activity, String str) {
        AbstractC16544l.m18094g(activity, "activity");
        this.f39896l.mo21447a(C20856B.f66307j, this.f39897m);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new SubscriptionsViewModelImpl$purchase$1(this, activity, str, null), 3);
    }
}
