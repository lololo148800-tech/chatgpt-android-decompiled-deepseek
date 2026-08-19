package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.loader.app.C11119a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.AbstractC15256t;
import p037B9.MeDP.MpoABj;
import p548Wd.p549VF.zakks;
import p729ej.C13414e;
import p960q9.C18648b;
import p960q9.C18655i;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC11001b {

    /* JADX INFO: renamed from: Q0 */
    public static boolean f36037Q0;

    /* JADX INFO: renamed from: L0 */
    public boolean f36038L0 = false;

    /* JADX INFO: renamed from: M0 */
    public SignInConfiguration f36039M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f36040N0;

    /* JADX INFO: renamed from: O0 */
    public int f36041O0;

    /* JADX INFO: renamed from: P0 */
    public Intent f36042P0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f36037Q0 = false;
    }

    @Override // androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f36040N0);
        if (this.f36040N0) {
            bundle.putInt("signInResultCode", this.f36041O0);
            bundle.putParcelable("signInResultData", this.f36042P0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m13181p(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f36037Q0 = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f36038L0) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(MpoABj.lSdfutNInx);
            if (signInAccount != null && (googleSignInAccount = signInAccount.f36033Z) != null) {
                C18655i c18655iM20023t = C18655i.m20023t(this);
                GoogleSignInOptions googleSignInOptions = this.f36039M0.f36036Z;
                synchronized (c18655iM20023t) {
                    ((C18648b) c18655iM20023t.f59414Z).m20009d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f36040N0 = true;
                this.f36041O0 = i11;
                this.f36042P0 = intent;
                new C11119a(this, mo10152e()).m12177b(new C13414e(this));
                f36037Q0 = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m13181p(intExtra);
                return;
            }
        }
        m13181p(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            AbstractC15256t.m16465c("AuthSignInClient", "Null action");
            m13181p(12500);
            return;
        }
        if (action.equals(zakks.xyKH)) {
            AbstractC15256t.m16465c("AuthSignInClient", "Action not implemented");
            m13181p(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            AbstractC15256t.m16465c("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            AbstractC15256t.m16465c("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            AbstractC15256t.m16465c("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f36039M0 = signInConfiguration;
        if (bundle == null) {
            if (f36037Q0) {
                setResult(0);
                m13181p(12502);
                return;
            }
            f36037Q0 = true;
            Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.f36039M0);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f36038L0 = true;
                AbstractC15256t.m16482t("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                m13181p(17);
                return;
            }
        }
        boolean z6 = bundle.getBoolean("signingInGoogleApiClients");
        this.f36040N0 = z6;
        if (z6) {
            this.f36041O0 = bundle.getInt("signInResultCode");
            Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
            if (intent3 == null) {
                AbstractC15256t.m16465c("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            } else {
                this.f36042P0 = intent3;
                new C11119a(this, mo10152e()).m12177b(new C13414e(this));
                f36037Q0 = false;
            }
        }
    }
}
