package com.openai.chatgpt.app.p681di;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.onboarding.impl.viewmodel.CollectEmailViewModelLoggedOutImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModel;
import com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModelImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModel;
import com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModelImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedOutImpl_Factory;
import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel;
import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel_Factory;
import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel_Factory;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.openai.feature.sanction.impl.SanctionViewModel;
import com.openai.feature.sanction.impl.SanctionViewModelImpl_Factory;
import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModel;
import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl_Factory;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModel;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl_Factory;
import com.openai.feature.serverstatus.impl.unsupportedcountry.UnsupportedCountryViewModel;
import com.openai.feature.serverstatus.impl.unsupportedcountry.UnsupportedCountryViewModelImpl_Factory;
import com.openai.feature.settings.impl.language.AppLocaleViewModel;
import com.openai.feature.settings.impl.language.AppLocaleViewModelImpl_Factory;
import com.openai.viewmodel.ScreenViewModel;
import com.openai.viewmodel.impl.LoggedOutScreenViewModel_Factory;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17636j;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p025An.C0625m0;
import p025An.InterfaceC0627n0;
import p046Bk.C1342O;
import p092Dc.C1992i;
import p092Dc.C1998o;
import p092Dc.C2000q;
import p092Dc.C2007x;
import p092Dc.C2008y;
import p248Jk.C4471b;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.C4475f;
import p248Jk.C4477h;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p334Na.AbstractC5695b;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggedOutViewModelFactory_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final C4474e f37237a;

    /* JADX INFO: renamed from: b */
    public final C2000q f37238b;

    public LoggedOutViewModelFactory_Factory(C4474e c4474e, C2000q c2000q) {
        this.f37237a = c4474e;
        this.f37238b = c2000q;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        C17636j parentScope = (C17636j) this.f37237a.f14617a;
        C2008y c2008y = (C2008y) this.f37238b.get();
        AbstractC16544l.m18094g(parentScope, "parentScope");
        return new LoggedOutViewModelFactory(new AbstractSavedStateViewModelFactory() { // from class: com.openai.chatgpt.app.di.LoggedOutViewModelFactory.1

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C2008y f37236d;

            public C122191() {
                c2008y = c2008y;
            }

            @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
            /* JADX INFO: renamed from: e */
            public final ViewModel mo12114e(String str, Class cls, C11082S c11082s) {
                C17636j c17636j = c17636j;
                InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c17636j.f56418o0.get(C0625m0.f1875Y);
                if (interfaceC0627n0 == null) {
                    throw new IllegalStateException("Parent scope has no job!");
                }
                AbstractC0575H.m1174c(AbstractC5695b.m6138e(new C0566C0(interfaceC0627n0), AbstractC0593T.f1824a));
                C2008y c2008y2 = c2008y;
                C2007x c2007x = c2008y2.f6167b;
                InterfaceC4478i onboardingRepository = c2007x.f6165o;
                C1998o c1998o = c2008y2.f6166a;
                C1342O c1342o = c1998o.f6036c;
                InterfaceC4478i resolver = c1998o.f6006I;
                InterfaceC4478i analyticsService = c2007x.f6158h;
                CollectEmailViewModelLoggedOutImpl_Factory.f39077d.getClass();
                AbstractC16544l.m18094g(onboardingRepository, "onboardingRepository");
                AbstractC16544l.m18094g(resolver, "resolver");
                AbstractC16544l.m18094g(analyticsService, "analyticsService");
                CollectEmailViewModelLoggedOutImpl_Factory collectEmailViewModelLoggedOutImpl_Factory = new CollectEmailViewModelLoggedOutImpl_Factory(c1342o, onboardingRepository, resolver, analyticsService);
                InterfaceC4478i onboardingRepo = c2007x.f6165o;
                C4471b auth = c1998o.f6023R;
                InterfaceC4478i resolver2 = c1998o.f6006I;
                C1342O c1342o2 = c1998o.f6036c;
                InterfaceC4478i analyticsService2 = c2007x.f6158h;
                CreateAccountViewModelImpl_Factory.f39103e.getClass();
                AbstractC16544l.m18094g(onboardingRepo, "onboardingRepo");
                AbstractC16544l.m18094g(auth, "auth");
                AbstractC16544l.m18094g(resolver2, "resolver");
                AbstractC16544l.m18094g(analyticsService2, "analyticsService");
                CreateAccountViewModelImpl_Factory createAccountViewModelImpl_Factory = new CreateAccountViewModelImpl_Factory(onboardingRepo, auth, resolver2, c1342o2, analyticsService2);
                InterfaceC4478i onboardingRepo2 = c2007x.f6165o;
                C4471b auth2 = c1998o.f6023R;
                InterfaceC4478i resolver3 = c1998o.f6006I;
                C1992i clock = c1998o.f6013L0;
                InterfaceC4478i analytics = c2007x.f6158h;
                FinishAccountViewModelImpl_Factory.f39152f.getClass();
                AbstractC16544l.m18094g(onboardingRepo2, "onboardingRepo");
                AbstractC16544l.m18094g(auth2, "auth");
                AbstractC16544l.m18094g(resolver3, "resolver");
                AbstractC16544l.m18094g(clock, "clock");
                AbstractC16544l.m18094g(analytics, "analytics");
                FinishAccountViewModelImpl_Factory finishAccountViewModelImpl_Factory = new FinishAccountViewModelImpl_Factory(onboardingRepo2, auth2, resolver3, clock, analytics);
                LoginViewModelImpl_Factory loginViewModelImpl_FactoryM14330a = LoginViewModelImpl_Factory.m14330a(c1998o.f6038d, c1998o.f6036c, c1998o.f6023R, c1998o.f6006I, c1998o.f6047h0, c2007x.f6158h, c1998o.f6048i, c2007x.f6156f, c1998o.f6056m);
                InterfaceC4478i onboardingRepo3 = c2007x.f6165o;
                OnboardingLoadingViewModelImpl_Factory.f39212b.getClass();
                AbstractC16544l.m18094g(onboardingRepo3, "onboardingRepo");
                OnboardingLoadingViewModelImpl_Factory onboardingLoadingViewModelImpl_Factory = new OnboardingLoadingViewModelImpl_Factory(onboardingRepo3);
                InterfaceC4478i onboardingRepository2 = c2007x.f6165o;
                InterfaceC4478i analyticsService3 = c2007x.f6158h;
                InterfaceC4478i resolver4 = c1998o.f6006I;
                C1342O c1342o3 = c1998o.f6036c;
                VerifyEmailCodeViewModelLoggedOutImpl_Factory.f39276d.getClass();
                AbstractC16544l.m18094g(onboardingRepository2, "onboardingRepository");
                AbstractC16544l.m18094g(analyticsService3, "analyticsService");
                AbstractC16544l.m18094g(resolver4, "resolver");
                VerifyEmailCodeViewModelLoggedOutImpl_Factory verifyEmailCodeViewModelLoggedOutImpl_Factory = new VerifyEmailCodeViewModelLoggedOutImpl_Factory(c1342o3, onboardingRepository2, analyticsService3, resolver4);
                C4474e c4474eM5206a = C4474e.m5206a(c11082s);
                InterfaceC4478i analytics2 = c2007x.f6158h;
                InterfaceC4478i resolver5 = c1998o.f6006I;
                InterfaceC4478i onboardingRepo4 = c2007x.f6165o;
                C4471b auth3 = c1998o.f6023R;
                C1342O c1342o4 = c1998o.f6036c;
                VerifyEmailLinkViewModel_Factory.f39318f.getClass();
                AbstractC16544l.m18094g(analytics2, "analytics");
                AbstractC16544l.m18094g(resolver5, "resolver");
                AbstractC16544l.m18094g(onboardingRepo4, "onboardingRepo");
                AbstractC16544l.m18094g(auth3, "auth");
                VerifyEmailLinkViewModel_Factory verifyEmailLinkViewModel_Factory = new VerifyEmailLinkViewModel_Factory(c4474eM5206a, analytics2, resolver5, onboardingRepo4, auth3, c1342o4);
                C4474e context = c1998o.f6038d;
                InterfaceC4478i onboardingRepo5 = c2007x.f6165o;
                InterfaceC4478i resolver6 = c1998o.f6006I;
                C1342O c1342o5 = c1998o.f6036c;
                InterfaceC4478i analyticsService4 = c2007x.f6158h;
                VerifyPhoneViewModel_Factory.f39353e.getClass();
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(onboardingRepo5, "onboardingRepo");
                AbstractC16544l.m18094g(resolver6, "resolver");
                AbstractC16544l.m18094g(analyticsService4, "analyticsService");
                VerifyPhoneViewModel_Factory verifyPhoneViewModel_Factory = new VerifyPhoneViewModel_Factory(context, onboardingRepo5, resolver6, c1342o5, analyticsService4);
                AppLocaleViewModelImpl_Factory appLocaleViewModelImpl_FactoryM14357a = AppLocaleViewModelImpl_Factory.m14357a(c1998o.f6038d, c2007x.f6158h);
                InterfaceC4478i onboardingRepo6 = c2007x.f6165o;
                InterfaceC4478i sanctionManager = c1998o.f5993B0;
                SanctionViewModelImpl_Factory.f39438c.getClass();
                AbstractC16544l.m18094g(onboardingRepo6, "onboardingRepo");
                AbstractC16544l.m18094g(sanctionManager, "sanctionManager");
                SanctionViewModelImpl_Factory sanctionViewModelImpl_Factory = new SanctionViewModelImpl_Factory(onboardingRepo6, sanctionManager);
                FailwhaleViewModelImpl_Factory failwhaleViewModelImpl_FactoryM14347a = FailwhaleViewModelImpl_Factory.m14347a(c1998o.f6038d, c1998o.f6053k0, c2007x.f6158h);
                SunsetViewModelImpl_Factory sunsetViewModelImpl_FactoryM14348a = SunsetViewModelImpl_Factory.m14348a(c1998o.f6051j0, c2007x.f6158h);
                UnsupportedCountryViewModelImpl_Factory unsupportedCountryViewModelImpl_FactoryM14349a = UnsupportedCountryViewModelImpl_Factory.m14349a(c2007x.f6158h);
                C4475f c4475f = new C4475f(13, 1);
                c4475f.m4521L(CollectEmailViewModel.class, collectEmailViewModelLoggedOutImpl_Factory);
                c4475f.m4521L(CreateAccountViewModel.class, createAccountViewModelImpl_Factory);
                c4475f.m4521L(FinishAccountViewModel.class, finishAccountViewModelImpl_Factory);
                c4475f.m4521L(LoginViewModel.class, loginViewModelImpl_FactoryM14330a);
                c4475f.m4521L(OnboardingLoadingViewModel.class, onboardingLoadingViewModelImpl_Factory);
                c4475f.m4521L(VerifyEmailCodeViewModel.class, verifyEmailCodeViewModelLoggedOutImpl_Factory);
                c4475f.m4521L(VerifyEmailLinkViewModel.class, verifyEmailLinkViewModel_Factory);
                c4475f.m4521L(VerifyPhoneViewModel.class, verifyPhoneViewModel_Factory);
                c4475f.m4521L(AppLocaleViewModel.class, appLocaleViewModelImpl_FactoryM14357a);
                c4475f.m4521L(SanctionViewModel.class, sanctionViewModelImpl_Factory);
                c4475f.m4521L(FailwhaleViewModel.class, failwhaleViewModelImpl_FactoryM14347a);
                c4475f.m4521L(SunsetViewModel.class, sunsetViewModelImpl_FactoryM14348a);
                c4475f.m4521L(UnsupportedCountryViewModel.class, unsupportedCountryViewModelImpl_FactoryM14349a);
                C4477h c4477hM5207Q = c4475f.m5207Q();
                LoggedOutScreenViewModel_Factory.f40370b.getClass();
                ScreenViewModel screenViewModel = (ScreenViewModel) C4472c.m5205a(new LoggedOutScreenViewModel_Factory(c4477hM5207Q)).get();
                AbstractC16544l.m18092e(screenViewModel, "null cannot be cast to non-null type T of com.openai.chatgpt.app.di.LoggedOutViewModelFactory.<init>.<no name provided>.create");
                return screenViewModel;
            }
        });
    }
}
