package p350O1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p239Ja.C4312o;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: O1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6052a implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final C3590f f19711a;

    /* JADX INFO: renamed from: b */
    public final int f19712b;

    public C6052a(C3590f c3590f, int i10) {
        this.f19711a = c3590f;
        this.f19712b = i10;
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        int i10 = c6061j.f19746p0;
        boolean z6 = i10 != -1;
        C3590f c3590f = this.f19711a;
        if (z6) {
            c6061j.m6633g(i10, c6061j.f19747q0, c3590f.f10934Y);
        } else {
            c6061j.m6633g(c6061j.f19744Z, c6061j.f19745o0, c3590f.f10934Y);
        }
        int i11 = c6061j.f19744Z;
        int i12 = c6061j.f19745o0;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f19712b;
        int iM8921l = AbstractC8301I.m8921l(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - c3590f.f10934Y.length(), 0, ((C4312o) c6061j.f19748r0).m5100s());
        c6061j.m6635i(iM8921l, iM8921l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6052a)) {
            return false;
        }
        C6052a c6052a = (C6052a) obj;
        return AbstractC16544l.m18089b(this.f19711a.f10934Y, c6052a.f19711a.f10934Y) && this.f19712b == c6052a.f19712b;
    }

    public final int hashCode() {
        return (this.f19711a.f10934Y.hashCode() * 31) + this.f19712b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f19711a.f10934Y);
        sb2.append("', newCursorPosition=");
        return AbstractC12107L1.m13826q(sb2, this.f19712b, ')');
    }

    public C6052a(String str, int i10) {
        this(new C3590f(6, str, null), i10);
    }
}
