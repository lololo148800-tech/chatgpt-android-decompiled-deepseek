package p1139z0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: z0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C21629n {

    /* JADX INFO: renamed from: a */
    public static final C21629n f68523a = new C21629n();

    /* JADX INFO: renamed from: a */
    public final boolean m21979a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i10, bundle);
    }
}
