package com.openai.feature.subscriptions.impl;

import android.app.Activity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bh.C11431e;
import com.openai.chatgpt.R;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p092Dc.C1991h;
import p098Di.C2055d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1081wc.C20856B;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1155zi.C21913F1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.C21975X1;
import p1155zi.EnumC21909E1;
import p1155zi.EnumC21981Z1;
import p1155zi.EnumC22080y1;
import p1155zi.InterfaceC21925I1;
import p165G9.AbstractC3021g;
import p178H.AbstractC3137c;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p624Zg.AbstractC10345O;
import p624Zg.AbstractC10357a0;
import p624Zg.AbstractC10391w;
import p624Zg.AbstractC10392x;
import p624Zg.C10337G;
import p624Zg.C10338H;
import p624Zg.C10346P;
import p624Zg.C10351V;
import p624Zg.C10358b;
import p624Zg.C10360c;
import p624Zg.C10362d;
import p624Zg.C10365e0;
import p624Zg.C10378l;
import p624Zg.C10390v;
import p624Zg.C10393y;
import p624Zg.InterfaceC10333C;
import p624Zg.InterfaceC10347Q;
import p624Zg.InterfaceC10364e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/ChoosePlanViewModelImpl;", "Lcom/openai/feature/subscriptions/ChoosePlanViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ChoosePlanViewModelImpl extends ChoosePlanViewModel {

    /* JADX INFO: renamed from: i */
    public final C1991h f39867i;

    /* JADX INFO: renamed from: j */
    public final C11431e f39868j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC20904w f39869k;

    /* JADX INFO: renamed from: l */
    public final C3430e f39870l;

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$1", m20656f = "ChoosePlanViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125161 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39871Y;

        public C125161(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ChoosePlanViewModelImpl.this.new C125161(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125161) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39871Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C11431e c11431e = ChoosePlanViewModelImpl.this.f39868j;
                EnumC22080y1 enumC22080y1 = EnumC22080y1.f69797r0;
                this.f39871Y = 1;
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

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LZg/l;", "LZg/e0;", "subscriptionState", "invoke", "(LZg/l;LZg/e0;)LZg/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125172 extends AbstractC16546n implements InterfaceC1439n {
        public C125172() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C10390v c10390v;
            boolean z6;
            AbstractC10357a0 c10351v;
            C10378l setOnEach = (C10378l) obj;
            C10365e0 subscriptionState = (C10365e0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(subscriptionState, "subscriptionState");
            InterfaceC21925I1 interfaceC21925I1 = subscriptionState.f30719c;
            boolean z10 = interfaceC21925I1 instanceof C21917G1;
            C17689w c17689w = C17689w.f56480Y;
            if (z10) {
                return C10378l.m10892e(setOnEach, c17689w, null, 2);
            }
            boolean z11 = interfaceC21925I1 instanceof C21913F1;
            ChoosePlanViewModelImpl choosePlanViewModelImpl = ChoosePlanViewModelImpl.this;
            if (z11) {
                Throwable th2 = ((C21913F1) interfaceC21925I1).f69462a.f69485a;
                AbstractC8160o6.m8727b(choosePlanViewModelImpl.f39870l, "Error purchasing package", th2, 4);
                if (th2 instanceof AbstractC10345O) {
                    C3430e c3430e = AbstractC10357a0.f30702o0;
                    c10351v = AbstractC3137c.m3981d((AbstractC10345O) th2);
                } else {
                    c10351v = new C10351V(th2);
                }
                choosePlanViewModelImpl.m14393h(new C2059h(choosePlanViewModelImpl.f39867i.m3160b(c10351v.f30703Y)));
                return C10378l.m10892e(setOnEach, c17689w, null, 2);
            }
            if (!(interfaceC21925I1 instanceof C21921H1)) {
                throw new C0644w();
            }
            Iterable<C10337G> iterable = (Iterable) ((C21921H1) interfaceC21925I1).f69472a;
            ArrayList arrayList = new ArrayList();
            for (C10337G c10337g : iterable) {
                String str = c10337g.f30669a;
                EnumC21909E1 enumC21909E1 = EnumC21909E1.Plus;
                boolean zM21667A = AbstractC21322p.m21667A(str, "oai.chatgpt.pro", false);
                C21975X1 c21975x1 = subscriptionState.f30718b;
                if (zM21667A) {
                    z6 = (c21975x1 != null ? c21975x1.f69571a : null) == EnumC21981Z1.f69583q0;
                    String strM3160b = choosePlanViewModelImpl.f39867i.m3160b(R.string.subscriptions_plan_name_pro);
                    C1991h c1991h = choosePlanViewModelImpl.f39867i;
                    String strM3160b2 = c1991h.m3160b(R.string.subscriptions_pro_upsell_subtitle);
                    String strM3160b3 = c1991h.m3160b(R.string.subscriptions_plan_get_pro);
                    List list = AbstractC10391w.f30799a;
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(c1991h.m3160b(((Number) it.next()).intValue()));
                    }
                    c10390v = new C10390v(c10337g, z6, false, strM3160b, strM3160b2, strM3160b3, arrayList2, true);
                } else if (AbstractC21322p.m21667A(c10337g.f30669a, "oai.chatgpt.plus", false)) {
                    z6 = (c21975x1 != null ? c21975x1.f69571a : null) == EnumC21981Z1.f69582p0;
                    String strM3160b4 = choosePlanViewModelImpl.f39867i.m3160b(R.string.subscriptions_plan_name_plus);
                    C1991h c1991h2 = choosePlanViewModelImpl.f39867i;
                    String strM3160b5 = c1991h2.m3160b(R.string.subscriptions_subtitle_plus);
                    String strM3160b6 = c1991h2.m3160b(R.string.subscriptions_plan_get_plus);
                    List list2 = AbstractC10391w.f30800b;
                    ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(c1991h2.m3160b(((Number) it2.next()).intValue()));
                    }
                    c10390v = new C10390v(c10337g, z6, false, strM3160b4, strM3160b5, strM3160b6, arrayList3, false);
                } else {
                    c10390v = null;
                }
                if (c10390v != null) {
                    arrayList.add(c10390v);
                }
            }
            return C10378l.m10892e(setOnEach, AbstractC17680n.m19370t0(arrayList, new Comparator() { // from class: com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$2$invoke$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return AbstractC3021g.m3873a(Boolean.valueOf(((C10390v) obj4).f30792b), Boolean.valueOf(((C10390v) obj3).f30792b));
                }
            }), null, 2);
        }
    }

    public ChoosePlanViewModelImpl(C1991h c1991h, C11431e c11431e, InterfaceC20904w interfaceC20904w) {
        super(new C10378l(C17689w.f56480Y, null));
        this.f39867i = c1991h;
        this.f39868j = c11431e;
        this.f39869k = interfaceC20904w;
        this.f39870l = AbstractC8168p6.m8749b("ChoosePlanViewModel", null);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C125161(null), 3);
        m14396l(new C125172(), c11431e.f34536s0);
    }

    /* JADX INFO: renamed from: o */
    public static final void m14371o(ChoosePlanViewModelImpl choosePlanViewModelImpl, InterfaceC10347Q interfaceC10347Q, InterfaceC10333C interfaceC10333C, String str) {
        C20856B c20856b;
        choosePlanViewModelImpl.getClass();
        Map mapM19244f = AbstractC17659D.m19244f(new C17309l("purchase_package_id", str), new C17309l("purchase_action", interfaceC10333C.mo10886a()));
        if (interfaceC10347Q instanceof C10346P) {
            c20856b = interfaceC10333C instanceof C10393y ? C20856B.f66305h : C20856B.f66310m;
        } else if (AbstractC16544l.m18089b(interfaceC10347Q, C10338H.f30673Y)) {
            c20856b = interfaceC10333C instanceof C10393y ? C20856B.f66302e : C20856B.f66308k;
        } else if (interfaceC10347Q instanceof AbstractC10345O) {
            c20856b = interfaceC10333C instanceof C10393y ? C20856B.f66304g : C20856B.f66309l;
        } else {
            if (interfaceC10347Q != null) {
                throw new C0644w();
            }
            c20856b = interfaceC10333C instanceof C10393y ? C20856B.f66301d : C20856B.f66307j;
        }
        choosePlanViewModelImpl.f39869k.mo21447a(c20856b, mapM19244f);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC10364e intent = (InterfaceC10364e) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C10360c.f30709a)) {
            m14393h(new C2055d(AbstractC10392x.f30801a));
        } else if (intent instanceof C10362d) {
            m14394i(new ChoosePlanViewModelImpl$onIntent$1(this, intent, null));
        } else if (intent instanceof C10358b) {
            m14397m(ChoosePlanViewModelImpl$onIntent$2.f39880Y);
        }
    }

    @Override // com.openai.feature.subscriptions.ChoosePlanViewModel
    /* JADX INFO: renamed from: n */
    public final void mo14369n(Activity activity, String str) {
        AbstractC16544l.m18094g(activity, "activity");
        m14397m(new ChoosePlanViewModelImpl$setPurchasing$1(str, true));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new ChoosePlanViewModelImpl$purchasePackage$1(this, str, activity, null), 3);
    }
}
