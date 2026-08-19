package p517V2;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import p468T2.C7218j;
import p959q8.C18639a;

/* JADX INFO: renamed from: V2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7741b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f24411a;

    /* JADX INFO: renamed from: b */
    public final C18639a f24412b;

    public C7741b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C18639a c18639a = new C18639a(18);
        super(inputConnection, false);
        this.f24411a = editText;
        this.f24412b = c18639a;
        if (C7218j.m7610c()) {
            C7218j.m7609a().m7616h(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f24411a.getEditableText();
        this.f24412b.getClass();
        return C18639a.m19997s(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f24411a.getEditableText();
        this.f24412b.getClass();
        return C18639a.m19997s(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
