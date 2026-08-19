package p003A1;

import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;

/* JADX INFO: renamed from: A1.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0305y0 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m880C() {
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m881D() {
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ CredentialManager m884c(Object obj) {
        return (CredentialManager) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ CredentialOption.Builder m887f(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ GetCredentialException m889h(Throwable th2) {
        return (GetCredentialException) th2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ GetCredentialRequest.Builder m890i(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ GetCredentialResponse m892k(Object obj) {
        return (GetCredentialResponse) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ GraphemeClusterSegmentFinder m896o(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ SegmentFinder m897p(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m901t() {
    }
}
