package com.openai.feature.auth.impl;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.openai.auth.SwitchAccountViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p014Ac.AbstractC0424a;
import p025An.C0644w;
import p071Ch.C1676g;
import p071Ch.C1692w;
import p092Dc.C1991h;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p1149zc.C21838G;
import p1149zc.C21842d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.AbstractC22014i;
import p1155zi.C21929J1;
import p1155zi.C21949O1;
import p1155zi.C21952P1;
import p1155zi.C22010h;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8226x0;
import p544W9.AbstractC8658k;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13166t;
import p948pi.C18426i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/auth/impl/SwitchAccountViewModelImpl;", "Lcom/openai/auth/SwitchAccountViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SwitchAccountViewModelImpl extends SwitchAccountViewModel {

    /* JADX INFO: renamed from: i */
    public final C13166t f37263i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0424a f37264j;

    /* JADX INFO: renamed from: k */
    public final C1692w f37265k;

    /* JADX INFO: renamed from: l */
    public final C1991h f37266l;

    /* JADX INFO: renamed from: m */
    public final EnumC21895B f37267m;

    /* JADX INFO: renamed from: n */
    public final C1676g f37268n;

    /* JADX INFO: renamed from: o */
    public final C3430e f37269o;

    public SwitchAccountViewModelImpl(C13166t c13166t, AbstractC0424a abstractC0424a, C1692w c1692w, C1991h c1991h, EnumC21895B enumC21895B, C1676g c1676g) {
        super(C21838G.f69304a);
        this.f37263i = c13166t;
        this.f37264j = abstractC0424a;
        this.f37265k = c1692w;
        this.f37266l = c1991h;
        this.f37267m = enumC21895B;
        this.f37268n = c1676g;
        this.f37269o = AbstractC8168p6.m8749b("SwitchAccountViewModel", null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: p */
    public static final Object m14232p(SwitchAccountViewModelImpl switchAccountViewModelImpl, Context context, C22010h c22010h, AbstractC19687c abstractC19687c) throws Throwable {
        SwitchAccountViewModelImpl$loginWithSso$1 switchAccountViewModelImpl$loginWithSso$1;
        SwitchAccountViewModelImpl switchAccountViewModelImpl2;
        C21842d c21842d;
        switchAccountViewModelImpl.getClass();
        if (abstractC19687c instanceof SwitchAccountViewModelImpl$loginWithSso$1) {
            switchAccountViewModelImpl$loginWithSso$1 = (SwitchAccountViewModelImpl$loginWithSso$1) abstractC19687c;
            int i10 = switchAccountViewModelImpl$loginWithSso$1.f37284s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                switchAccountViewModelImpl$loginWithSso$1.f37284s0 = i10 - Integer.MIN_VALUE;
            } else {
                switchAccountViewModelImpl$loginWithSso$1 = new SwitchAccountViewModelImpl$loginWithSso$1(switchAccountViewModelImpl, abstractC19687c);
            }
        } else {
            switchAccountViewModelImpl$loginWithSso$1 = new SwitchAccountViewModelImpl$loginWithSso$1(switchAccountViewModelImpl, abstractC19687c);
        }
        SwitchAccountViewModelImpl$loginWithSso$1 switchAccountViewModelImpl$loginWithSso$2 = switchAccountViewModelImpl$loginWithSso$1;
        Object obj = switchAccountViewModelImpl$loginWithSso$2.f37282q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = switchAccountViewModelImpl$loginWithSso$2.f37284s0;
        if (i11 != 0) {
            if (i11 == 1) {
                c21842d = switchAccountViewModelImpl$loginWithSso$2.f37281p0;
                c22010h = switchAccountViewModelImpl$loginWithSso$2.f37280o0;
                context = switchAccountViewModelImpl$loginWithSso$2.f37279Z;
                switchAccountViewModelImpl2 = switchAccountViewModelImpl$loginWithSso$2.f37278Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C21842d c21842d2 = new C21842d(c22010h.f69651d);
        switchAccountViewModelImpl$loginWithSso$2.f37278Y = switchAccountViewModelImpl;
        switchAccountViewModelImpl$loginWithSso$2.f37279Z = context;
        switchAccountViewModelImpl$loginWithSso$2.f37280o0 = c22010h;
        switchAccountViewModelImpl$loginWithSso$2.f37281p0 = c21842d2;
        switchAccountViewModelImpl$loginWithSso$2.f37284s0 = 1;
        Object objM14233q = switchAccountViewModelImpl.m14233q(switchAccountViewModelImpl$loginWithSso$2);
        if (objM14233q == enumC19250a) {
            return enumC19250a;
        }
        switchAccountViewModelImpl2 = switchAccountViewModelImpl;
        c21842d = c21842d2;
        obj = objM14233q;
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            String str = ((C18426i) ((C21952P1) abstractC21955Q1).f69511a).f58788a;
            switchAccountViewModelImpl$loginWithSso$2.f37278Y = null;
            switchAccountViewModelImpl$loginWithSso$2.f37279Z = null;
            switchAccountViewModelImpl$loginWithSso$2.f37280o0 = null;
            switchAccountViewModelImpl$loginWithSso$2.f37281p0 = null;
            switchAccountViewModelImpl$loginWithSso$2.f37284s0 = 2;
            if (switchAccountViewModelImpl2.m14234r(context, c21842d, str, null, switchAccountViewModelImpl$loginWithSso$2) == enumC19250a) {
                return enumC19250a;
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            C21949O1 c21949o1 = abstractC21933K1 instanceof C21949O1 ? (C21949O1) abstractC21933K1 : null;
            String str2 = c21949o1 != null ? c21949o1.f69508d : null;
            if (str2 != null) {
                switchAccountViewModelImpl2.m14393h(new C2060i(str2));
            } else {
                C21842d c21842d3 = new C21842d(c22010h.f69651d);
                String strM8862c = AbstractC8226x0.m8862c(abstractC21933K1);
                switchAccountViewModelImpl$loginWithSso$2.f37278Y = null;
                switchAccountViewModelImpl$loginWithSso$2.f37279Z = null;
                switchAccountViewModelImpl$loginWithSso$2.f37280o0 = null;
                switchAccountViewModelImpl$loginWithSso$2.f37281p0 = null;
                switchAccountViewModelImpl$loginWithSso$2.f37284s0 = 3;
                if (switchAccountViewModelImpl2.m14234r(context, c21842d3, null, strM8862c, switchAccountViewModelImpl$loginWithSso$2) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }

    @Override // com.openai.auth.SwitchAccountViewModel
    /* JADX INFO: renamed from: n */
    public final void mo14218n(Context activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m14394i(new SwitchAccountViewModelImpl$logout$1(this, activity, null));
    }

    @Override // com.openai.auth.SwitchAccountViewModel
    /* JADX INFO: renamed from: o */
    public final void mo14219o(Context activity, String str, AbstractC22014i abstractC22014i) {
        AbstractC16544l.m18094g(activity, "activity");
        if (str == null) {
            return;
        }
        m14394i(new SwitchAccountViewModelImpl$switchAccount$1(abstractC22014i, this, str, activity, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m14233q(AbstractC19687c abstractC19687c) throws Throwable {
        SwitchAccountViewModelImpl$getIntegrityCookie$1 switchAccountViewModelImpl$getIntegrityCookie$1;
        Object objM2510d;
        SwitchAccountViewModelImpl switchAccountViewModelImpl;
        if (abstractC19687c instanceof SwitchAccountViewModelImpl$getIntegrityCookie$1) {
            switchAccountViewModelImpl$getIntegrityCookie$1 = (SwitchAccountViewModelImpl$getIntegrityCookie$1) abstractC19687c;
            int i10 = switchAccountViewModelImpl$getIntegrityCookie$1.f37273p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                switchAccountViewModelImpl$getIntegrityCookie$1.f37273p0 = i10 - Integer.MIN_VALUE;
            } else {
                switchAccountViewModelImpl$getIntegrityCookie$1 = new SwitchAccountViewModelImpl$getIntegrityCookie$1(this, abstractC19687c);
            }
        } else {
            switchAccountViewModelImpl$getIntegrityCookie$1 = new SwitchAccountViewModelImpl$getIntegrityCookie$1(this, abstractC19687c);
        }
        Object objM2509c = switchAccountViewModelImpl$getIntegrityCookie$1.f37271Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = switchAccountViewModelImpl$getIntegrityCookie$1.f37273p0;
        if (i11 != 0) {
            if (i11 == 1) {
                switchAccountViewModelImpl = switchAccountViewModelImpl$getIntegrityCookie$1.f37270Y;
                AbstractC9233X.m9807c(objM2509c);
                C18426i c18426i = (C18426i) objM2509c;
                objM2510d = c18426i != null ? c18426i.f58788a : null;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM2509c);
            }
        }
        AbstractC9233X.m9807c(objM2509c);
        switchAccountViewModelImpl$getIntegrityCookie$1.f37270Y = this;
        switchAccountViewModelImpl$getIntegrityCookie$1.f37273p0 = 1;
        objM2510d = this.f37265k.m2510d(true, switchAccountViewModelImpl$getIntegrityCookie$1);
        if (objM2510d == enumC19250a) {
            return enumC19250a;
        }
        switchAccountViewModelImpl = this;
        String str = (String) objM2510d;
        if (str != null) {
            return new C21952P1(new C18426i(str));
        }
        C1692w c1692w = switchAccountViewModelImpl.f37265k;
        switchAccountViewModelImpl$getIntegrityCookie$1.f37270Y = null;
        switchAccountViewModelImpl$getIntegrityCookie$1.f37273p0 = 2;
        objM2509c = c1692w.m2509c(true, switchAccountViewModelImpl$getIntegrityCookie$1);
        return objM2509c == enumC19250a ? enumC19250a : objM2509c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m14234r(Context context, C21842d c21842d, String str, String str2, AbstractC19687c abstractC19687c) {
        SwitchAccountViewModelImpl$login$1 switchAccountViewModelImpl$login$1;
        SwitchAccountViewModelImpl switchAccountViewModelImpl;
        if (abstractC19687c instanceof SwitchAccountViewModelImpl$login$1) {
            switchAccountViewModelImpl$login$1 = (SwitchAccountViewModelImpl$login$1) abstractC19687c;
            int i10 = switchAccountViewModelImpl$login$1.f37277p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                switchAccountViewModelImpl$login$1.f37277p0 = i10 - Integer.MIN_VALUE;
            } else {
                switchAccountViewModelImpl$login$1 = new SwitchAccountViewModelImpl$login$1(this, abstractC19687c);
            }
        } else {
            switchAccountViewModelImpl$login$1 = new SwitchAccountViewModelImpl$login$1(this, abstractC19687c);
        }
        SwitchAccountViewModelImpl$login$1 switchAccountViewModelImpl$login$2 = switchAccountViewModelImpl$login$1;
        Object objMo1086d = switchAccountViewModelImpl$login$2.f37275Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = switchAccountViewModelImpl$login$2.f37277p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo1086d);
            switchAccountViewModelImpl$login$2.f37274Y = this;
            switchAccountViewModelImpl$login$2.f37277p0 = 1;
            objMo1086d = this.f37264j.mo1086d(context, c21842d, null, str, str2, switchAccountViewModelImpl$login$2);
            if (objMo1086d == enumC19250a) {
                return enumC19250a;
            }
            switchAccountViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            switchAccountViewModelImpl = switchAccountViewModelImpl$login$2.f37274Y;
            AbstractC9233X.m9807c(objMo1086d);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objMo1086d;
        if (abstractC21955Q1 instanceof C21952P1) {
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(switchAccountViewModelImpl.f37269o, "Error switching account", abstractC21933K1.f69485a, 4);
            switchAccountViewModelImpl.m14393h(new C2060i(AbstractC8658k.m9349c(abstractC21933K1, switchAccountViewModelImpl.f37266l, switchAccountViewModelImpl.f37267m, switchAccountViewModelImpl.f37268n.m2506a())));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
