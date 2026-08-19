package p350O1;

import com.google.protobuf.AbstractC12107L1;
import p003A1.AbstractC0168G;
import p239Ja.C4312o;

/* JADX INFO: renamed from: O1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6058g implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final int f19739a;

    /* JADX INFO: renamed from: b */
    public final int f19740b;

    public C6058g(int i10, int i11) {
        this.f19739a = i10;
        this.f19740b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        int i10 = c6061j.f19745o0;
        int i11 = this.f19740b;
        int iM5100s = i10 + i11;
        int i12 = (i10 ^ iM5100s) & (i11 ^ iM5100s);
        C4312o c4312o = (C4312o) c6061j.f19748r0;
        if (i12 < 0) {
            iM5100s = c4312o.m5100s();
        }
        c6061j.m6629c(c6061j.f19745o0, Math.min(iM5100s, c4312o.m5100s()));
        int i13 = c6061j.f19744Z;
        int i14 = this.f19739a;
        int i15 = i13 - i14;
        if (((i13 ^ i15) & (i14 ^ i13)) < 0) {
            i15 = 0;
        }
        c6061j.m6629c(Math.max(0, i15), c6061j.f19744Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6058g)) {
            return false;
        }
        C6058g c6058g = (C6058g) obj;
        return this.f19739a == c6058g.f19739a && this.f19740b == c6058g.f19740b;
    }

    public final int hashCode() {
        return (this.f19739a * 31) + this.f19740b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f19739a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC12107L1.m13826q(sb2, this.f19740b, ')');
    }
}
