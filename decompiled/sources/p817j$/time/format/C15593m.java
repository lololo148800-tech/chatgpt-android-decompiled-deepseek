package p817j$.time.format;

import android.gov.nist.core.Separators;
import p817j$.time.DateTimeException;

/* JADX INFO: renamed from: j$.time.format.m */
/* JADX INFO: loaded from: classes4.dex */
final class C15593m implements InterfaceC15586f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC15586f f48683a;

    /* JADX INFO: renamed from: b */
    private final int f48684b;

    /* JADX INFO: renamed from: c */
    private final char f48685c;

    C15593m(InterfaceC15586f interfaceC15586f, int i10, char c9) {
        this.f48683a = interfaceC15586f;
        this.f48684b = i10;
        this.f48685c = c9;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f48683a.mo17053m(c15605y, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f48684b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f48685c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        boolean zM17092l = c15603w.m17092l();
        if (i10 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        int length = this.f48684b + i10;
        if (length > charSequence.length()) {
            if (zM17092l) {
                return ~i10;
            }
            length = charSequence.length();
        }
        int i11 = i10;
        while (i11 < length && c15603w.m17084b(charSequence.charAt(i11), this.f48685c)) {
            i11++;
        }
        int iMo17054o = this.f48683a.mo17054o(c15603w, charSequence.subSequence(0, length), i11);
        return (iMo17054o == length || !zM17092l) ? iMo17054o : ~(i10 + i11);
    }

    public final String toString() {
        String str;
        char c9 = this.f48685c;
        if (c9 == ' ') {
            str = Separators.RPAREN;
        } else {
            str = ",'" + c9 + "')";
        }
        return "Pad(" + this.f48683a + Separators.COMMA + this.f48684b + str;
    }
}
