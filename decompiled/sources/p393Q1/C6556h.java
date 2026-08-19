package p393Q1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p349O0.C6002f0;
import p468T2.AbstractC7215g;
import p468T2.C7218j;
import p517V2.C7742c;
import p960q9.C18655i;

/* JADX INFO: renamed from: Q1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6556h extends AbstractC7215g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21222a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f21223b;

    /* JADX INFO: renamed from: c */
    public final Object f21224c;

    public C6556h(C6002f0 c6002f0, C18655i c18655i) {
        this.f21223b = c6002f0;
        this.f21224c = c18655i;
    }

    @Override // p468T2.AbstractC7215g
    /* JADX INFO: renamed from: a */
    public void mo7122a() {
        switch (this.f21222a) {
            case 0:
                ((C18655i) this.f21224c).f59414Z = AbstractC6559k.f21227a;
                break;
        }
    }

    @Override // p468T2.AbstractC7215g
    /* JADX INFO: renamed from: b */
    public final void mo7123b() {
        InputFilter[] filters;
        int length;
        switch (this.f21222a) {
            case 0:
                ((C6002f0) this.f21223b).setValue(Boolean.TRUE);
                ((C18655i) this.f21224c).f59414Z = new C6560l(true);
                break;
            default:
                TextView textView = (TextView) ((WeakReference) this.f21223b).get();
                InputFilter inputFilter = (InputFilter) ((WeakReference) this.f21224c).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                C7218j c7218jM7609a = C7218j.m7609a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    c7218jM7609a.getClass();
                                    length = text.length();
                                }
                                CharSequence charSequenceM7614f = c7218jM7609a.m7614f(0, length, 0, text);
                                if (text != charSequenceM7614f) {
                                    int selectionStart = Selection.getSelectionStart(charSequenceM7614f);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceM7614f);
                                    textView.setText(charSequenceM7614f);
                                    if (charSequenceM7614f instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceM7614f;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public C6556h(TextView textView, C7742c c7742c) {
        this.f21223b = new WeakReference(textView);
        this.f21224c = new WeakReference(c7742c);
    }
}
