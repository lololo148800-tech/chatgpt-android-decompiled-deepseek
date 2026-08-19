package p108E2;

import android.content.ClipData;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p030B2.C0755f;
import p030B2.InterfaceC0753e;

/* JADX INFO: renamed from: E2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2257p {
    /* JADX INFO: renamed from: a */
    public static C0755f m3299a(View view, C0755f c0755f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0755f);
        }
        if (c0755f.f2132a.getSource() == 2) {
            return c0755f;
        }
        InterfaceC0753e interfaceC0753e = c0755f.f2132a;
        ClipData clipDataMo1604a = interfaceC0753e.mo1604a();
        int iMo1605c = interfaceC0753e.mo1605c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i10 = 0; i10 < clipDataMo1604a.getItemCount(); i10++) {
            ClipData.Item itemAt = clipDataMo1604a.getItemAt(i10);
            if ((iMo1605c & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), Separators.RETURN);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
