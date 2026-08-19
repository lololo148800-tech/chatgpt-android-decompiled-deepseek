package p517V2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p468T2.C7218j;

/* JADX INFO: renamed from: V2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7747h implements TextWatcher {

    /* JADX INFO: renamed from: Y */
    public final EditText f24422Y;

    /* JADX INFO: renamed from: Z */
    public C7746g f24423Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f24424o0 = true;

    public C7747h(EditText editText) {
        this.f24422Y = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m8008a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C7218j c7218jM7609a = C7218j.m7609a();
            if (editableText == null) {
                length = 0;
            } else {
                c7218jM7609a.getClass();
                length = editableText.length();
            }
            c7218jM7609a.m7614f(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f24422Y;
        if (!editText.isInEditMode() && this.f24424o0 && C7218j.m7610c() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iM7611b = C7218j.m7609a().m7611b();
            if (iM7611b != 0) {
                if (iM7611b == 1) {
                    C7218j.m7609a().m7614f(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iM7611b != 3) {
                    return;
                }
            }
            C7218j c7218jM7609a = C7218j.m7609a();
            if (this.f24423Z == null) {
                this.f24423Z = new C7746g(editText);
            }
            c7218jM7609a.m7615g(this.f24423Z);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
