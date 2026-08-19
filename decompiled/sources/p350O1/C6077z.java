package p350O1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p239Ja.C4312o;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: O1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6077z implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final C3590f f19777a;

    /* JADX INFO: renamed from: b */
    public final int f19778b;

    public C6077z(String str, int i10) {
        this.f19777a = new C3590f(6, str, null);
        this.f19778b = i10;
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        int i10 = c6061j.f19746p0;
        boolean z6 = i10 != -1;
        C3590f c3590f = this.f19777a;
        if (z6) {
            c6061j.m6633g(i10, c6061j.f19747q0, c3590f.f10934Y);
            String str = c3590f.f10934Y;
            if (str.length() > 0) {
                c6061j.m6634h(i10, str.length() + i10);
            }
        } else {
            int i11 = c6061j.f19744Z;
            c6061j.m6633g(i11, c6061j.f19745o0, c3590f.f10934Y);
            String str2 = c3590f.f10934Y;
            if (str2.length() > 0) {
                c6061j.m6634h(i11, str2.length() + i11);
            }
        }
        int i12 = c6061j.f19744Z;
        int i13 = c6061j.f19745o0;
        int i14 = i12 == i13 ? i13 : -1;
        int i15 = this.f19778b;
        int iM8921l = AbstractC8301I.m8921l(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - c3590f.f10934Y.length(), 0, ((C4312o) c6061j.f19748r0).m5100s());
        c6061j.m6635i(iM8921l, iM8921l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6077z)) {
            return false;
        }
        C6077z c6077z = (C6077z) obj;
        return AbstractC16544l.m18089b(this.f19777a.f10934Y, c6077z.f19777a.f10934Y) && this.f19778b == c6077z.f19778b;
    }

    public final int hashCode() {
        return (this.f19777a.f10934Y.hashCode() * 31) + this.f19778b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f19777a.f10934Y);
        sb2.append("', newCursorPosition=");
        return AbstractC12107L1.m13826q(sb2, this.f19778b, ')');
    }
}
