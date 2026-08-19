package io.sentry.android.core;

import com.openai.chatgpt.app.MainApplication;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.C15269c;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C15498c;
import p588Y2.C9642z;
import p784hb.C14437f;
import p791hj.C14522e;

/* JADX INFO: renamed from: io.sentry.android.core.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15244m {
    /* JADX INFO: renamed from: a */
    public static void m16445a(MainApplication mainApplication, SentryAndroidOptions sentryAndroidOptions, C15184B c15184b, C15198P c15198p, C14522e c14522e, boolean z6, boolean z10, boolean z11) {
        C15498c c15498c = new C15498c(new C15243l(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C9642z(new C15243l(sentryAndroidOptions), 10), c15498c));
        sentryAndroidOptions.addIntegration(new NdkIntegration(C15198P.m16404b("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m16386a());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C14437f(new C15243l(sentryAndroidOptions)), c15498c));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AbstractC15256t.m16464b(mainApplication, c15184b));
        sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(mainApplication, c15184b, c14522e));
        sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(mainApplication));
        sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(mainApplication));
        sentryAndroidOptions.addIntegration(new UserInteractionIntegration(mainApplication));
        if (z6) {
            sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(mainApplication, true, true));
        }
        if (z10) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(mainApplication));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(mainApplication));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(mainApplication, c15184b, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(mainApplication));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(mainApplication));
        if (z11) {
            ReplayIntegration replayIntegration = new ReplayIntegration(mainApplication);
            replayIntegration.m16493W(new C15269c());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }
}
