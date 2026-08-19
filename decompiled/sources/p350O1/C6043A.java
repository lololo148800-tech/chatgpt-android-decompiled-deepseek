package p350O1;

import com.google.protobuf.AbstractC12107L1;
import p239Ja.C4312o;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: O1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6043A implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final int f19678a;

    /* JADX INFO: renamed from: b */
    public final int f19679b;

    public C6043A(int i10, int i11) {
        this.f19678a = i10;
        this.f19679b = i11;
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        int iM8921l = AbstractC8301I.m8921l(this.f19678a, 0, ((C4312o) c6061j.f19748r0).m5100s());
        int iM8921l2 = AbstractC8301I.m8921l(this.f19679b, 0, ((C4312o) c6061j.f19748r0).m5100s());
        if (iM8921l < iM8921l2) {
            c6061j.m6635i(iM8921l, iM8921l2);
        } else {
            c6061j.m6635i(iM8921l2, iM8921l);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6043A)) {
            return false;
        }
        C6043A c6043a = (C6043A) obj;
        return this.f19678a == c6043a.f19678a && this.f19679b == c6043a.f19679b;
    }

    public final int hashCode() {
        return (this.f19678a * 31) + this.f19679b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f19678a);
        sb2.append(", end=");
        return AbstractC12107L1.m13826q(sb2, this.f19679b, ')');
    }
}
