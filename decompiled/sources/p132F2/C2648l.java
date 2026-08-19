package p132F2;

import android.app.Activity;
import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.p649os.OutcomeReceiver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p003A1.AbstractC0305y0;
import p127El.ExecutorC2575a;

/* JADX INFO: renamed from: F2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2648l implements InterfaceC2646j {

    /* JADX INFO: renamed from: a */
    public final CredentialManager f8163a;

    public C2648l(Activity context) {
        AbstractC16544l.m18094g(context, "context");
        this.f8163a = AbstractC0305y0.m884c(context.getSystemService("credential"));
    }

    @Override // p132F2.InterfaceC2646j
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f8163a != null;
    }

    @Override // p132F2.InterfaceC2646j
    public final void onGetCredential(Context context, C2650n c2650n, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h interfaceC2644h) {
        AbstractC16544l.m18094g(context, "context");
        C2643g c2643g = (C2643g) interfaceC2644h;
        C0130g c0130g = new C0130g(c2643g, 21);
        CredentialManager credentialManager = this.f8163a;
        if (credentialManager == null) {
            c0130g.invoke();
            return;
        }
        C2647k c2647k = new C2647k(c2643g, this);
        AbstractC0305y0.m901t();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderM890i = AbstractC0305y0.m890i(bundle);
        for (AbstractC2645i abstractC2645i : c2650n.f8164a) {
            AbstractC0305y0.m880C();
            abstractC2645i.getClass();
            builderM890i.addCredentialOption(AbstractC0305y0.m887f(abstractC2645i.f8158a, abstractC2645i.f8159b).setIsSystemProviderRequired(true).setAllowedProviders(abstractC2645i.f8160c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderM890i.build();
        AbstractC16544l.m18093f(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential((Activity) context, getCredentialRequestBuild, cancellationSignal, (ExecutorC2575a) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) c2647k);
    }
}
