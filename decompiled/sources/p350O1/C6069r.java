package p350O1;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: O1.r */
/* JADX INFO: loaded from: classes.dex */
public class C6069r extends InputConnectionC6068q {
    @Override // p350O1.InputConnectionC6068q
    /* JADX INFO: renamed from: a */
    public final void mo6645a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // p350O1.InputConnectionC6068q, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // p350O1.InputConnectionC6068q, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
