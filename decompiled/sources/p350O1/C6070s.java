package p350O1;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: O1.s */
/* JADX INFO: loaded from: classes.dex */
public class C6070s extends C6069r {
    @Override // p350O1.InputConnectionC6068q, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
