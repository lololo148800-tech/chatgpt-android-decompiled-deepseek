package p817j$.time.format;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: j$.time.format.d */
/* JADX INFO: loaded from: classes4.dex */
final class C15584d implements InterfaceC15586f {

    /* JADX INFO: renamed from: a */
    private final char f48662a;

    C15584d(char c9) {
        this.f48662a = c9;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        sb2.append(this.f48662a);
        return true;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        char c9 = this.f48662a;
        return (cCharAt == c9 || (!c15603w.m17091k() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c9) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c9)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c9 = this.f48662a;
        if (c9 == '\'') {
            return "''";
        }
        return Separators.QUOTE + c9 + Separators.QUOTE;
    }
}
