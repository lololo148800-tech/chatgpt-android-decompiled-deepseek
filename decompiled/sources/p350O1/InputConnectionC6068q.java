package p350O1;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p003A1.C0254h0;

/* JADX INFO: renamed from: O1.q */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionC6068q implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0254h0 f19764a;

    /* JADX INFO: renamed from: b */
    public InputConnection f19765b;

    public InputConnectionC6068q(InputConnection inputConnection, C0254h0 c0254h0) {
        this.f19764a = c0254h0;
        this.f19765b = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            if (inputConnection != null) {
                mo6645a(inputConnection);
                this.f19765b = null;
            }
            this.f19764a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f19765b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void mo6645a(InputConnection inputConnection) {
    }
}
