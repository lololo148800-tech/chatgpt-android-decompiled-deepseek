package com.openai.feature.messages.impl.listitem.content.reference.weather;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p072Ci.C1699d;
import p072Ci.EnumC1711p;
import p098Di.InterfaceC2053b;
import p121Ef.C2430g;
import p121Ef.C2431h;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p708dh.C13132J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/reference/weather/WeatherViewModelImpl;", "Lcom/openai/feature/messages/impl/listitem/content/reference/weather/WeatherViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class WeatherViewModelImpl extends WeatherViewModel {

    /* JADX INFO: renamed from: i */
    public final C13132J f38846i;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.reference.weather.WeatherViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.reference.weather.WeatherViewModelImpl$1", m20656f = "WeatherViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LCi/d;", "it", "LCi/p;", "<anonymous>", "(LCi/d;)LCi/p;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124251 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38847Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124251 c124251 = new C124251(2, interfaceC18770c);
            c124251.f38847Y = obj;
            return c124251;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124251) create((C1699d) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            EnumC1711p enumC1711p = ((C1699d) this.f38847Y).f4837k;
            return enumC1711p == null ? WeatherViewModelKt.m14317a() : enumC1711p;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.reference.weather.WeatherViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEf/h;", "LCi/p;", "it", "invoke", "(LEf/h;LCi/p;)LEf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124262 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124262 f38848Y = new C124262();

        public C124262() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2431h setOnEach = (C2431h) obj;
            EnumC1711p it = (EnumC1711p) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return new C2431h(it);
        }
    }

    public WeatherViewModelImpl(C13132J c13132j) {
        super(new C2431h(WeatherViewModelKt.m14317a()));
        this.f38846i = c13132j;
        m14396l(C124262.f38848Y, AbstractC9206S2.m9771b(new C124251(2, null), c13132j.f41695r0));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C2430g intent = (C2430g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (!(intent instanceof C2430g)) {
            throw new C0644w();
        }
        m14394i(new WeatherViewModelImpl$onIntent$1(this, intent, null));
        m14397m(new WeatherViewModelImpl$onIntent$2(intent));
    }
}
