package p109E3;

import bb.AbstractC11281F;
import bb.AbstractC11314g0;
import bb.C11280E;
import java.util.Set;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2280d {

    /* JADX INFO: renamed from: d */
    public static final C2280d f7047d;

    /* JADX INFO: renamed from: a */
    public final int f7048a;

    /* JADX INFO: renamed from: b */
    public final int f7049b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11281F f7050c;

    static {
        C2280d c2280d;
        if (AbstractC20817s.f66106a >= 33) {
            C11280E c11280e = new C11280E(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                c11280e.m12762a(Integer.valueOf(AbstractC20817s.m21415p(i10)));
            }
            c2280d = new C2280d(2, c11280e.m12702j());
        } else {
            c2280d = new C2280d(2, 10);
        }
        f7047d = c2280d;
    }

    public C2280d(int i10, Set set) {
        this.f7048a = i10;
        AbstractC11281F abstractC11281FM12705t = AbstractC11281F.m12705t(set);
        this.f7050c = abstractC11281FM12705t;
        AbstractC11314g0 it = abstractC11281FM12705t.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f7049b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280d)) {
            return false;
        }
        C2280d c2280d = (C2280d) obj;
        return this.f7048a == c2280d.f7048a && this.f7049b == c2280d.f7049b && AbstractC20817s.m21400a(this.f7050c, c2280d.f7050c);
    }

    public final int hashCode() {
        int i10 = ((this.f7048a * 31) + this.f7049b) * 31;
        AbstractC11281F abstractC11281F = this.f7050c;
        return i10 + (abstractC11281F == null ? 0 : abstractC11281F.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f7048a + ", maxChannelCount=" + this.f7049b + ", channelMasks=" + this.f7050c + "]";
    }

    public C2280d(int i10, int i11) {
        this.f7048a = i10;
        this.f7049b = i11;
        this.f7050c = null;
    }
}
