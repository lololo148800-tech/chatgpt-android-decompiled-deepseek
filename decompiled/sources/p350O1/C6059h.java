package p350O1;

import com.google.protobuf.AbstractC12107L1;
import p003A1.AbstractC0168G;
import p239Ja.C4312o;

/* JADX INFO: renamed from: O1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6059h implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final int f19741a;

    /* JADX INFO: renamed from: b */
    public final int f19742b;

    public C6059h(int i10, int i11) {
        this.f19741a = i10;
        this.f19742b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19741a; i11++) {
            int i12 = i10 + 1;
            int i13 = c6061j.f19744Z;
            if (i13 <= i12) {
                i10 = i13;
                break;
            }
            i10 = (Character.isHighSurrogate(c6061j.m6630d((i13 - i12) + (-1))) && Character.isLowSurrogate(c6061j.m6630d(c6061j.f19744Z - i12))) ? i10 + 2 : i12;
        }
        int iM5100s = 0;
        for (int i14 = 0; i14 < this.f19742b; i14++) {
            int i15 = iM5100s + 1;
            int i16 = c6061j.f19745o0 + i15;
            C4312o c4312o = (C4312o) c6061j.f19748r0;
            if (i16 >= c4312o.m5100s()) {
                iM5100s = c4312o.m5100s() - c6061j.f19745o0;
                break;
            }
            iM5100s = (Character.isHighSurrogate(c6061j.m6630d((c6061j.f19745o0 + i15) + (-1))) && Character.isLowSurrogate(c6061j.m6630d(c6061j.f19745o0 + i15))) ? iM5100s + 2 : i15;
        }
        int i17 = c6061j.f19745o0;
        c6061j.m6629c(i17, iM5100s + i17);
        int i18 = c6061j.f19744Z;
        c6061j.m6629c(i18 - i10, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6059h)) {
            return false;
        }
        C6059h c6059h = (C6059h) obj;
        return this.f19741a == c6059h.f19741a && this.f19742b == c6059h.f19742b;
    }

    public final int hashCode() {
        return (this.f19741a * 31) + this.f19742b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f19741a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC12107L1.m13826q(sb2, this.f19742b, ')');
    }
}
