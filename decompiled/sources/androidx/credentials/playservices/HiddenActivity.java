package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.javax.sip.C10808o;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import io.sentry.android.core.AbstractC15256t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mo.C17342i;
import p049Bm.InterfaceC1436k;
import p1009s9.C19501d;
import p1022t9.C19816a;
import p1022t9.C19819d;
import p1022t9.C19820e;
import p1022t9.InterfaceC19817b;
import p1060v9.AbstractC20502t;
import p166Ga.C3029c;
import p167Gb.C3032c;
import p238J9.C4293a;
import p263K9.C4603w;
import p333N9.AbstractC5685f;
import p333N9.C5682c;
import p720e6.C13287b;
import p746fa.AbstractC13600i;
import p746fa.C13606o;
import p746fa.ExecutorC13605n;
import p746fa.InterfaceC13595d;
import p746fa.InterfaceC13596e;
import p849k7.C16361n;
import p903n9.C17527a;
import p903n9.C17528b;
import p903n9.C17529c;
import p903n9.C17530d;
import p903n9.C17531e;
import p903n9.C17533g;
import p903n9.C17534h;
import p903n9.C17538l;
import p903n9.C17539m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m18067d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lmm/C;", "restoreState", "(Landroid/os/Bundle;)V", "handleCreatePublicKeyCredential", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "setupFailure", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "handleGetSignInIntent", "handleBeginSignIn", "handleCreatePassword", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "", "mWaitingForActivityResult", "Z", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class HiddenActivity extends Activity {
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        C13606o c13606oM20770b;
        C17531e c17531e = (C17531e) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c17531e != null) {
            C5682c c5682c = new C5682c(this, new C17539m());
            C17342i c17342iM19206b = C17527a.m19206b();
            c17342iM19206b.f55252a = false;
            c17342iM19206b.m19002b();
            C17527a c17527a = c17531e.f56071Z;
            AbstractC20502t.m21157h(c17527a);
            C17530d c17530d = c17531e.f56070Y;
            AbstractC20502t.m21157h(c17530d);
            C17529c c17529c = c17531e.f56075r0;
            AbstractC20502t.m21157h(c17529c);
            C17528b c17528b = c17531e.f56076s0;
            AbstractC20502t.m21157h(c17528b);
            C17531e c17531e2 = new C17531e(c17530d, c17527a, c5682c.f18451k, c17531e.f56073p0, c17531e.f56074q0, c17529c, c17528b, c17531e.f56077t0);
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9120e = new C19501d[]{new C19501d(8L, "auth_api_credentials_begin_sign_in")};
            c3029cM3900d.f9119d = new C10808o(c5682c, c17531e2, 17);
            c3029cM3900d.f9118c = false;
            c3029cM3900d.f9117b = 1553;
            c13606oM20770b = c5682c.m20770b(0, c3029cM3900d.m3904c());
            final HiddenActivity$handleBeginSignIn$1$1 hiddenActivity$handleBeginSignIn$1$1 = new HiddenActivity$handleBeginSignIn$1$1(this, intExtra);
            InterfaceC13596e interfaceC13596e = new InterfaceC13596e() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
                @Override // p746fa.InterfaceC13596e
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(hiddenActivity$handleBeginSignIn$1$1, obj);
                }
            };
            c13606oM20770b.getClass();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            c13606oM20770b.m15126e(executorC13605n, interfaceC13596e);
            c13606oM20770b.m15125d(executorC13605n, new InterfaceC13595d() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda7
                @Override // p746fa.InterfaceC13595d
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f$0, exc);
                }
            });
        } else {
            c13606oM20770b = null;
        }
        if (c13606oM20770b == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$8(InterfaceC1436k tmp0, Object obj) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity this$0, Exception e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "e");
        String str = ((e10 instanceof C19819d) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C19819d) e10).f62870Y.f36052Y))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC16544l.m18091d(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During begin sign in, failure response from one tap: " + e10.getMessage());
    }

    private final void handleCreatePassword() {
        C13606o c13606oM20770b;
        C17534h c17534h = (C17534h) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c17534h != null) {
            C5682c c5682c = new C5682c(this, new C17538l());
            C17534h c17534h2 = new C17534h(c17534h.f56085Y, c5682c.f18451k, c17534h.f56087o0);
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9120e = new C19501d[]{AbstractC5685f.f18455b};
            c3029cM3900d.f9119d = new C3032c(c5682c, c17534h2, 14);
            c3029cM3900d.f9118c = false;
            c3029cM3900d.f9117b = 1536;
            c13606oM20770b = c5682c.m20770b(0, c3029cM3900d.m3904c());
            final HiddenActivity$handleCreatePassword$1$1 hiddenActivity$handleCreatePassword$1$1 = new HiddenActivity$handleCreatePassword$1$1(this, intExtra);
            InterfaceC13596e interfaceC13596e = new InterfaceC13596e() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
                @Override // p746fa.InterfaceC13596e
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$12(hiddenActivity$handleCreatePassword$1$1, obj);
                }
            };
            c13606oM20770b.getClass();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            c13606oM20770b.m15126e(executorC13605n, interfaceC13596e);
            c13606oM20770b.m15125d(executorC13605n, new InterfaceC13595d() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
                @Override // p746fa.InterfaceC13595d
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f$0, exc);
                }
            });
        } else {
            c13606oM20770b = null;
        }
        if (c13606oM20770b == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$12(InterfaceC1436k tmp0, Object obj) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity this$0, Exception e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "e");
        String str = ((e10 instanceof C19819d) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C19819d) e10).f62870Y.f36052Y))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC16544l.m18091d(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During save password, found password failure response from one tap " + e10.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        C13606o c13606oM20770b;
        C4603w c4603w = (C4603w) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c4603w != null) {
            C19816a c19816a = InterfaceC19817b.f62869l0;
            C16361n c16361n = new C16361n();
            Looper mainLooper = getMainLooper();
            AbstractC20502t.m21158i(mainLooper, "Looper must not be null.");
            C4293a c4293a = new C4293a(this, this, C4293a.f13968k, c19816a, new C19820e(c16361n, mainLooper));
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9119d = new C10808o(c4293a, c4603w, 13);
            c3029cM3900d.f9117b = 5407;
            c13606oM20770b = c4293a.m20770b(0, c3029cM3900d.m3904c());
            final HiddenActivity$handleCreatePublicKeyCredential$1$1 hiddenActivity$handleCreatePublicKeyCredential$1$1 = new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra);
            InterfaceC13596e interfaceC13596e = new InterfaceC13596e() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda0
                @Override // p746fa.InterfaceC13596e
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(hiddenActivity$handleCreatePublicKeyCredential$1$1, obj);
                }
            };
            c13606oM20770b.getClass();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            c13606oM20770b.m15126e(executorC13605n, interfaceC13596e);
            c13606oM20770b.m15125d(executorC13605n, new InterfaceC13595d() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
                @Override // p746fa.InterfaceC13595d
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f$0, exc);
                }
            });
        } else {
            c13606oM20770b = null;
        }
        if (c13606oM20770b == null) {
            AbstractC15256t.m16482t(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC1436k tmp0, Object obj) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity this$0, Exception e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "e");
        String str = ((e10 instanceof C19819d) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C19819d) e10).f62870Y.f36052Y))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC16544l.m18091d(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During create public key credential, fido registration failure: " + e10.getMessage());
    }

    private final void handleGetSignInIntent() {
        C13606o c13606oM20770b;
        C17533g c17533g = (C17533g) getIntent().getParcelableExtra(qffLJgOYizGmMj.ZpuHdHQUZWp);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c17533g != null) {
            C5682c c5682c = new C5682c(this, new C17539m());
            String str = c17533g.f56079Y;
            AbstractC20502t.m21157h(str);
            C17533g c17533g2 = new C17533g(str, c17533g.f56084r0, c17533g.f56080Z, c17533g.f56083q0, c5682c.f18451k, c17533g.f56082p0);
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9120e = new C19501d[]{AbstractC5685f.f18456c};
            c3029cM3900d.f9119d = new C13287b(c5682c, c17533g2);
            c3029cM3900d.f9117b = 1555;
            c13606oM20770b = c5682c.m20770b(0, c3029cM3900d.m3904c());
            final HiddenActivity$handleGetSignInIntent$1$1 hiddenActivity$handleGetSignInIntent$1$1 = new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra);
            InterfaceC13596e interfaceC13596e = new InterfaceC13596e() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
                @Override // p746fa.InterfaceC13596e
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(hiddenActivity$handleGetSignInIntent$1$1, obj);
                }
            };
            c13606oM20770b.getClass();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            c13606oM20770b.m15126e(executorC13605n, interfaceC13596e);
            c13606oM20770b.m15125d(executorC13605n, new InterfaceC13595d() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
                @Override // p746fa.InterfaceC13595d
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f$0, exc);
                }
            });
        } else {
            c13606oM20770b = null;
        }
        if (c13606oM20770b == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$4(InterfaceC1436k tmp0, Object obj) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity this$0, Exception e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "e");
        String str = ((e10 instanceof C19819d) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C19819d) e10).f62870Y.f36052Y))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC16544l.m18091d(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e10.getMessage());
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, errName);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, requestCode);
        bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        AbstractC15256t.m16482t(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC16544l.m18094g(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
