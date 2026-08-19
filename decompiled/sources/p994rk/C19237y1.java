package p994rk;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p523V9.AbstractC8122k0;

/* JADX INFO: renamed from: rk.y1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19237y1 implements TextWatcher {

    /* JADX INFO: renamed from: Y */
    public final String f60987Y;

    /* JADX INFO: renamed from: Z */
    public boolean f60988Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f60989o0;

    public C19237y1(String mask) {
        AbstractC16544l.m18094g(mask, "mask");
        this.f60987Y = mask;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC8122k0 c19231w1;
        boolean zIsLetter;
        AbstractC16544l.m18094g(editable, "editable");
        if (this.f60988Z || this.f60989o0) {
            return;
        }
        this.f60988Z = true;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String str = this.f60987Y;
            if (i10 >= str.length()) {
                editable.replace(0, editable.length(), sb2);
                this.f60988Z = false;
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '#') {
                c19231w1 = C19224u1.f60973a;
            } else if (cCharAt == '@') {
                c19231w1 = C19220t1.f60969a;
            } else {
                c19231w1 = cCharAt == '*' ? C19228v1.f60976a : new C19231w1(cCharAt);
            }
            while (i11 < editable.length()) {
                char cCharAt2 = editable.charAt(i11);
                if (c19231w1 instanceof C19224u1) {
                    zIsLetter = Character.isDigit(cCharAt2);
                } else if (c19231w1 instanceof C19220t1) {
                    zIsLetter = Character.isLetter(cCharAt2);
                } else if (c19231w1 instanceof C19228v1) {
                    if (Character.isDigit(cCharAt2) || Character.isLetter(cCharAt2)) {
                        zIsLetter = true;
                    } else {
                        zIsLetter = false;
                    }
                } else {
                    if (!(c19231w1 instanceof C19231w1)) {
                        throw new C0644w();
                    }
                    if (cCharAt2 == ((C19231w1) c19231w1).f60979a) {
                        zIsLetter = true;
                    } else {
                        zIsLetter = false;
                    }
                }
                if (zIsLetter) {
                    sb2.append(cCharAt2);
                    i11++;
                    break;
                } else {
                    if (c19231w1 instanceof C19231w1) {
                        sb2.append(cCharAt);
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        AbstractC16544l.m18094g(charSequence, "charSequence");
        this.f60989o0 = i11 > i12;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        AbstractC16544l.m18094g(charSequence, "charSequence");
    }
}
