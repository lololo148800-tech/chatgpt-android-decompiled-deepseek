package com.openai.feature.onboarding.impl.viewmodel;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.onboarding.LoginViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import ec.AbstractC13361c;
import ga.C13834b;
import gd.C13876N;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p014Ac.AbstractC0424a;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p071Ch.C1676g;
import p071Ch.C1692w;
import p092Dc.C1991h;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p103Dn.C2153Q0;
import p1081wc.C20889h;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p318Mh.C5363G;
import p318Mh.C5371K;
import p318Mh.C5391c;
import p364Oh.C6226E;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8658k;
import p544W9.AbstractC8670m;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9339o3;
import p623Zf.AbstractC10323s;
import p623Zf.C10310f;
import p623Zf.C10314j;
import p623Zf.C10315k;
import p623Zf.C10317m;
import p623Zf.C10318n;
import p623Zf.C10319o;
import p623Zf.C10320p;
import p623Zf.C10321q;
import p623Zf.C10322r;
import p623Zf.C10324t;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import p948pi.C18426i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding.Container({@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class), @ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)})
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/LoginViewModelImpl;", "Lcom/openai/feature/onboarding/LoginViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LoginViewModelImpl extends LoginViewModel {

    /* JADX INFO: renamed from: r */
    public static final Intent f39158r;

    /* JADX INFO: renamed from: i */
    public final Application f39159i;

    /* JADX INFO: renamed from: j */
    public final EnumC21895B f39160j;

    /* JADX INFO: renamed from: k */
    public final AbstractC0424a f39161k;

    /* JADX INFO: renamed from: l */
    public final C1991h f39162l;

    /* JADX INFO: renamed from: m */
    public final C1692w f39163m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC20904w f39164n;

    /* JADX INFO: renamed from: o */
    public final C1676g f39165o;

    /* JADX INFO: renamed from: p */
    public final C3430e f39166p;

    /* JADX INFO: renamed from: q */
    public final C0564B0 f39167q;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$1", m20656f = "LoginViewModelImpl.kt", m20657l = {73}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124551 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39168Y;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZf/t;", "invoke", "(LZf/t;)LZf/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f39170Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C10324t setState = (C10324t) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C10324t.m10881e(setState, true, false, null, 29);
            }
        }

        public C124551(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return LoginViewModelImpl.this.new C124551(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124551) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39168Y;
            LoginViewModelImpl loginViewModelImpl = LoginViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                AbstractC0424a abstractC0424a = loginViewModelImpl.f39161k;
                this.f39168Y = 1;
                obj = abstractC0424a.m22317a(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.f39170Y;
                Intent intent = LoginViewModelImpl.f39158r;
                loginViewModelImpl.m14397m(anonymousClass1);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$2", m20656f = "LoginViewModelImpl.kt", m20657l = {80}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124562 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39171Y;

        public C124562(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return LoginViewModelImpl.this.new C124562(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124562) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39171Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39171Y = 1;
                if (LoginViewModelImpl.m14328o(LoginViewModelImpl.this, this) == enumC19250a) {
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

    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/LoginViewModelImpl$Companion;", "", "()V", "HELP_CENTER_INTENT", "Landroid/content/Intent;", "Lcom/openai/platform/uri/AndroidIntent;", "HELP_CENTER_URL", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        Intent intent = new Intent();
        AbstractC9186P.m9748b(intent, "https://help.openai.com/en/articles/8261897-chatgpt-android-app-sign-in-error-something-went-wrong-with-code-17-error");
        f39158r = intent;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX WARN: Illegal instructions before constructor call */
    public LoginViewModelImpl(Application application, EnumC21895B enumC21895B, AbstractC0424a abstractC0424a, C1991h c1991h, C1692w c1692w, InterfaceC20904w interfaceC20904w, C1676g c1676g, InterfaceC13849E interfaceC13849E, C6226E c6226e) {
        boolean z6;
        if (enumC21895B != EnumC21895B.f69418Y) {
            if (((C14005w2) interfaceC13849E).m15481a(C13876N.f43914c)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = true;
        }
        super(new C10324t("799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com", false, false, null, (14 & 16) != 0 ? false : z6));
        this.f39159i = application;
        this.f39160j = enumC21895B;
        this.f39161k = abstractC0424a;
        this.f39162l = c1991h;
        this.f39163m = c1692w;
        this.f39164n = interfaceC20904w;
        this.f39165o = c1676g;
        this.f39166p = AbstractC8168p6.m8749b("LoginViewModel", null);
        interfaceC20904w.mo21447a(C20897p.f66606f, C17690x.f56481Y);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124551(null), 3);
        this.f39167q = AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124562(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14328o(LoginViewModelImpl loginViewModelImpl, AbstractC19687c abstractC19687c) {
        LoginViewModelImpl$getIntegrityCookie$1 loginViewModelImpl$getIntegrityCookie$1;
        Object objM2510d;
        loginViewModelImpl.getClass();
        if (abstractC19687c instanceof LoginViewModelImpl$getIntegrityCookie$1) {
            loginViewModelImpl$getIntegrityCookie$1 = (LoginViewModelImpl$getIntegrityCookie$1) abstractC19687c;
            int i10 = loginViewModelImpl$getIntegrityCookie$1.f39182p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                loginViewModelImpl$getIntegrityCookie$1.f39182p0 = i10 - Integer.MIN_VALUE;
            } else {
                loginViewModelImpl$getIntegrityCookie$1 = new LoginViewModelImpl$getIntegrityCookie$1(loginViewModelImpl, abstractC19687c);
            }
        } else {
            loginViewModelImpl$getIntegrityCookie$1 = new LoginViewModelImpl$getIntegrityCookie$1(loginViewModelImpl, abstractC19687c);
        }
        Object objM2509c = loginViewModelImpl$getIntegrityCookie$1.f39180Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = loginViewModelImpl$getIntegrityCookie$1.f39182p0;
        if (i11 != 0) {
            if (i11 == 1) {
                loginViewModelImpl = loginViewModelImpl$getIntegrityCookie$1.f39179Y;
                AbstractC9233X.m9807c(objM2509c);
                C18426i c18426i = (C18426i) objM2509c;
                objM2510d = c18426i != null ? c18426i.f58788a : null;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM2509c);
            }
            return objM2509c;
        }
        AbstractC9233X.m9807c(objM2509c);
        loginViewModelImpl$getIntegrityCookie$1.f39179Y = loginViewModelImpl;
        loginViewModelImpl$getIntegrityCookie$1.f39182p0 = 1;
        objM2510d = loginViewModelImpl.f39163m.m2510d(true, loginViewModelImpl$getIntegrityCookie$1);
        if (objM2510d == enumC19250a) {
            return enumC19250a;
        }
        String str = (String) objM2510d;
        if (str != null) {
            return new C21952P1(new C18426i(str));
        }
        C1692w c1692w = loginViewModelImpl.f39163m;
        loginViewModelImpl$getIntegrityCookie$1.f39179Y = null;
        loginViewModelImpl$getIntegrityCookie$1.f39182p0 = 2;
        objM2509c = c1692w.m2509c(true, loginViewModelImpl$getIntegrityCookie$1);
        if (objM2509c == enumC19250a) {
            return enumC19250a;
        }
        return objM2509c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: p */
    public static final Object m14329p(LoginViewModelImpl loginViewModelImpl, Context context, AbstractC13361c abstractC13361c, C13834b c13834b, String str, String str2, AbstractC19687c abstractC19687c) {
        LoginViewModelImpl$startAuth0Login$1 loginViewModelImpl$startAuth0Login$1;
        loginViewModelImpl.getClass();
        if (abstractC19687c instanceof LoginViewModelImpl$startAuth0Login$1) {
            loginViewModelImpl$startAuth0Login$1 = (LoginViewModelImpl$startAuth0Login$1) abstractC19687c;
            int i10 = loginViewModelImpl$startAuth0Login$1.f39192p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                loginViewModelImpl$startAuth0Login$1.f39192p0 = i10 - Integer.MIN_VALUE;
            } else {
                loginViewModelImpl$startAuth0Login$1 = new LoginViewModelImpl$startAuth0Login$1(loginViewModelImpl, abstractC19687c);
            }
        } else {
            loginViewModelImpl$startAuth0Login$1 = new LoginViewModelImpl$startAuth0Login$1(loginViewModelImpl, abstractC19687c);
        }
        LoginViewModelImpl$startAuth0Login$1 loginViewModelImpl$startAuth0Login$2 = loginViewModelImpl$startAuth0Login$1;
        Object objMo1086d = loginViewModelImpl$startAuth0Login$2.f39190Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = loginViewModelImpl$startAuth0Login$2.f39192p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo1086d);
            loginViewModelImpl.m14397m(LoginViewModelImpl$startAuth0Login$2.f39193Y);
            loginViewModelImpl$startAuth0Login$2.f39189Y = loginViewModelImpl;
            loginViewModelImpl$startAuth0Login$2.f39192p0 = 1;
            objMo1086d = loginViewModelImpl.f39161k.mo1086d(context, abstractC13361c, c13834b, str, str2, loginViewModelImpl$startAuth0Login$2);
            if (objMo1086d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loginViewModelImpl = loginViewModelImpl$startAuth0Login$2.f39189Y;
            AbstractC9233X.m9807c(objMo1086d);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objMo1086d;
        if (abstractC21955Q1 instanceof C21952P1) {
            loginViewModelImpl.m14397m(LoginViewModelImpl$startAuth0Login$3$1.f39194Y);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            loginViewModelImpl.m14397m(LoginViewModelImpl$startAuth0Login$4$1.f39195Y);
            AbstractC8160o6.m8727b(loginViewModelImpl.f39166p, "Error starting Auth0 login", abstractC21933K1.f69485a, 4);
            loginViewModelImpl.m14392g(new C10314j(AbstractC8658k.m9349c(abstractC21933K1, loginViewModelImpl.f39162l, loginViewModelImpl.f39160j, loginViewModelImpl.f39165o.m2506a()), null, 14));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            loginViewModelImpl.m14397m(LoginViewModelImpl$startAuth0Login$5$1.f39196Y);
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        AbstractC10323s intent = (AbstractC10323s) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C10321q) {
            m14397m(new LoginViewModelImpl$onIntent$1(intent));
            return;
        }
        if (intent instanceof C10320p) {
            C10320p c10320p = (C10320p) intent;
            m14392g(new C10315k(c10320p.f30633a, c10320p.f30634b));
            return;
        }
        if (intent instanceof C10322r) {
            m14394i(new LoginViewModelImpl$onIntent$2(this, null));
            return;
        }
        boolean z6 = intent instanceof C10319o;
        C5391c c5391c = C5391c.f17646Z;
        if (z6) {
            C5371K c5371k = C5371K.f17620h;
            c5371k.getClass();
            m14393h(new C2058g(c5371k.m5885a(c5391c), true));
        } else if (intent instanceof C10318n) {
            C5363G c5363g = C5363G.f17602h;
            c5363g.getClass();
            m14393h(new C2058g(c5363g.m5885a(c5391c), true));
        } else if (intent instanceof C10317m) {
            m14394i(new LoginViewModelImpl$onIntent$3(this, intent, null));
        }
    }

    @Override // com.openai.feature.onboarding.LoginViewModel
    /* JADX INFO: renamed from: n */
    public final void mo14321n(Context activity, AbstractC13361c abstractC13361c, C13834b c13834b) {
        AbstractC16544l.m18094g(activity, "activity");
        C2153Q0 c2153q0 = this.f40343c;
        if (((C10324t) c2153q0.getValue()).f30640d != null) {
            return;
        }
        m14397m(new LoginViewModelImpl$startLoginOrShowBrowserWarning$1(abstractC13361c, c13834b));
        C10310f c10310f = ((C10324t) c2153q0.getValue()).f30640d;
        if (c10310f == null) {
            return;
        }
        C20889h c20889h = C20889h.f66553i;
        AbstractC13361c abstractC13361c2 = c10310f.f30611a;
        C17309l c17309l = new C17309l("connection", abstractC13361c2.mo14946a());
        String strM9363b = AbstractC8670m.m9363b(this.f39159i);
        if (strM9363b == null) {
            strM9363b = "unknown";
        }
        this.f39164n.mo21447a(c20889h, AbstractC17659D.m19244f(c17309l, new C17309l("default_browser", strM9363b)));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new LoginViewModelImpl$continueLogin$1(this, activity, abstractC13361c2, c10310f.f30612b, null), 3);
    }
}
