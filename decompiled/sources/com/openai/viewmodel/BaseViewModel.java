package com.openai.viewmodel;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.EnumC0573G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p098Di.InterfaceC2052a;
import p098Di.InterfaceC2053b;
import p098Di.InterfaceC2061j;
import p098Di.InterfaceC2062k;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2133G0;
import p103Dn.C2137I0;
import p103Dn.C2153Q0;
import p103Dn.C2174d;
import p103Dn.C2197o0;
import p103Dn.C2215x0;
import p103Dn.InterfaceC2184i;
import p153Fn.C2942t;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p956q3.C18621a;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p985r9.C18903m;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007¨\u0006\b"}, m18067d2 = {"Lcom/openai/viewmodel/BaseViewModel;", "LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "Landroidx/lifecycle/ViewModel;", "viewmodel_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class BaseViewModel<S extends InterfaceC2062k, I extends InterfaceC2053b, E extends InterfaceC2052a> extends ViewModel {

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f40342b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f40343c;

    /* JADX INFO: renamed from: d */
    public final C2127D0 f40344d;

    /* JADX INFO: renamed from: e */
    public final C2127D0 f40345e;

    /* JADX INFO: renamed from: f */
    public final C1743k f40346f;

    /* JADX INFO: renamed from: g */
    public final C2215x0 f40347g;

    /* JADX INFO: renamed from: h */
    public final C2174d f40348h;

    /* JADX INFO: renamed from: com.openai.viewmodel.BaseViewModel$1 */
    @InterfaceC19689e(m20655c = "com.openai.viewmodel.BaseViewModel$1", m20656f = "BaseViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u008a@"}, m18067d2 = {"LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125841 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40349Y;

        public C125841(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125841 c125841 = new C125841(interfaceC18770c);
            c125841.f40349Y = obj;
            return c125841;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125841 c125841 = (C125841) create((InterfaceC2053b) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125841.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            BaseViewModel.this.mo14227j((InterfaceC2053b) this.f40349Y);
            return C17296C.f55119a;
        }
    }

    public BaseViewModel(InterfaceC2062k initialState) {
        AbstractC16544l.m18094g(initialState, "initialState");
        AbstractC8168p6.m8749b("BaseViewModel", null);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(initialState);
        this.f40342b = c2153q0M3204c;
        this.f40343c = c2153q0M3204c;
        EnumC1733a enumC1733a = EnumC1733a.f4962Z;
        C2127D0 c2127d0M3202a = AbstractC2124C.m3202a(1, 8, enumC1733a);
        this.f40344d = c2127d0M3202a;
        C2127D0 c2127d0M3202a2 = AbstractC2124C.m3202a(1, 8, enumC1733a);
        this.f40345e = c2127d0M3202a2;
        C1743k c1743kM8337a = AbstractC8017W3.m8337a(-2, 4, enumC1733a);
        this.f40346f = c1743kM8337a;
        C18621a c18621aM12143a = ViewModelKt.m12143a(this);
        C2137I0 c2137i0 = C2133G0.f6537b;
        C18903m c18903mM3213l = AbstractC2124C.m3213l(c2127d0M3202a, 0);
        C2127D0 c2127d0M3202a3 = AbstractC2124C.m3202a(0, c18903mM3213l.f60267a, (EnumC1733a) c18903mM3213l.f60269c);
        C2942t c2942t = AbstractC2124C.f6496c;
        C2137I0 c2137i1 = C2133G0.f6536a;
        AbstractC0575H.m1155C(c18621aM12143a, (InterfaceC18776i) c18903mM3213l.f60270d, c2137i0.equals(c2137i1) ? EnumC0573G.f1790Y : EnumC0573G.f1793p0, new C2197o0(c2137i0, (InterfaceC2184i) c18903mM3213l.f60268b, c2127d0M3202a3, c2942t, null));
        C2215x0 c2215x0 = new C2215x0(c2127d0M3202a3);
        C18621a c18621aM12143a2 = ViewModelKt.m12143a(this);
        C18903m c18903mM3213l2 = AbstractC2124C.m3213l(c2127d0M3202a2, 0);
        C2127D0 c2127d0M3202a4 = AbstractC2124C.m3202a(0, c18903mM3213l2.f60267a, (EnumC1733a) c18903mM3213l2.f60269c);
        AbstractC0575H.m1155C(c18621aM12143a2, (InterfaceC18776i) c18903mM3213l2.f60270d, c2137i0.equals(c2137i1) ? EnumC0573G.f1790Y : EnumC0573G.f1793p0, new C2197o0(c2137i0, (InterfaceC2184i) c18903mM3213l2.f60268b, c2127d0M3202a4, c2942t, null));
        this.f40347g = new C2215x0(c2127d0M3202a4);
        this.f40348h = new C2174d(c1743kM8337a);
        AbstractC2124C.m3226y(new C1970n(c2215x0, 5, new C125841(null)), ViewModelKt.m12143a(this));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2062k m14391f() {
        return (InterfaceC2062k) this.f40342b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m14392g(InterfaceC2052a effect) {
        AbstractC16544l.m18094g(effect, "effect");
        m14394i(new BaseViewModel$emitEffect$2(this, effect, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m14393h(InterfaceC2061j effect) {
        AbstractC16544l.m18094g(effect, "effect");
        m14394i(new BaseViewModel$emitEffect$1(this, effect, null));
    }

    /* JADX INFO: renamed from: i */
    public final C0564B0 m14394i(InterfaceC1436k interfaceC1436k) {
        return AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new BaseViewModel$launch$1(interfaceC1436k, null), 3);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo14227j(InterfaceC2053b interfaceC2053b);

    /* JADX INFO: renamed from: k */
    public final void m14395k(InterfaceC2053b intent) {
        AbstractC16544l.m18094g(intent, "intent");
        this.f40344d.mo3231f(intent);
    }

    /* JADX INFO: renamed from: l */
    public final void m14396l(InterfaceC1439n reducer, InterfaceC2184i interfaceC2184i) {
        AbstractC16544l.m18094g(interfaceC2184i, "<this>");
        AbstractC16544l.m18094g(reducer, "reducer");
        AbstractC2124C.m3226y(new C1970n(interfaceC2184i, 5, new BaseViewModel$setOnEach$1(this, reducer, null)), ViewModelKt.m12143a(this));
    }

    /* JADX INFO: renamed from: m */
    public final void m14397m(InterfaceC1436k reducer) {
        C2153Q0 c2153q0;
        Object value;
        AbstractC16544l.m18094g(reducer, "reducer");
        do {
            c2153q0 = this.f40342b;
            value = c2153q0.getValue();
        } while (!c2153q0.m3250k(value, reducer.invoke(value)));
    }
}
