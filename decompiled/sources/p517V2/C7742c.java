package p517V2;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p393Q1.C6556h;
import p468T2.C7218j;

/* JADX INFO: renamed from: V2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7742c implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f24413a;

    /* JADX INFO: renamed from: b */
    public C6556h f24414b;

    public C7742c(TextView textView) {
        this.f24413a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f24413a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM7611b = C7218j.m7609a().m7611b();
        if (iM7611b != 0) {
            if (iM7611b == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return C7218j.m7609a().m7614f(0, charSequence.length(), 0, charSequence);
            }
            if (iM7611b != 3) {
                return charSequence;
            }
        }
        C7218j c7218jM7609a = C7218j.m7609a();
        if (this.f24414b == null) {
            this.f24414b = new C6556h(textView, this);
        }
        c7218jM7609a.m7615g(this.f24414b);
        return charSequence;
    }
}
