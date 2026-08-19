package p350O1;

import com.google.protobuf.AbstractC12107L1;
import p239Ja.C4312o;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: O1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6076y implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final int f19775a;

    /* JADX INFO: renamed from: b */
    public final int f19776b;

    public C6076y(int i10, int i11) {
        this.f19775a = i10;
        this.f19776b = i11;
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        if (c6061j.f19746p0 != -1) {
            c6061j.f19746p0 = -1;
            c6061j.f19747q0 = -1;
        }
        C4312o c4312o = (C4312o) c6061j.f19748r0;
        int iM8921l = AbstractC8301I.m8921l(this.f19775a, 0, c4312o.m5100s());
        int iM8921l2 = AbstractC8301I.m8921l(this.f19776b, 0, c4312o.m5100s());
        if (iM8921l != iM8921l2) {
            if (iM8921l < iM8921l2) {
                c6061j.m6634h(iM8921l, iM8921l2);
            } else {
                c6061j.m6634h(iM8921l2, iM8921l);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6076y)) {
            return false;
        }
        C6076y c6076y = (C6076y) obj;
        return this.f19775a == c6076y.f19775a && this.f19776b == c6076y.f19776b;
    }

    public final int hashCode() {
        return (this.f19775a * 31) + this.f19776b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f19775a);
        sb2.append(", end=");
        return AbstractC12107L1.m13826q(sb2, this.f19776b, ')');
    }
}
