package p082D2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p720e6.C13287b;

/* JADX INFO: renamed from: D2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1859f extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1860g f5345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1859f(InputConnection inputConnection, InterfaceC1860g interfaceC1860g) {
        super(inputConnection, false);
        this.f5345a = interfaceC1860g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        Object[] objArr;
        ResultReceiver resultReceiver;
        InterfaceC1860g interfaceC1860g = this.f5345a;
        boolean zMo257e = false;
        zMo257e = false;
        zMo257e = false;
        zMo257e = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i10 = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zMo257e = interfaceC1860g.mo257e(new C13287b(uri, clipDescription, uri2), i10, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zMo257e ? 1 : 0, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                resultReceiver = null;
            }
        }
        if (zMo257e) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
