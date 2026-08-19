package p774h1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8104h6;
import p759g1.C13801c;
import p759g1.C13802d;

/* JADX INFO: renamed from: h1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C14331I extends AbstractC14332J {

    /* JADX INFO: renamed from: a */
    public final C13802d f44971a;

    /* JADX INFO: renamed from: b */
    public final C14353i f44972b;

    public C14331I(C13802d c13802d) {
        C14353i c14353iM15631i;
        this.f44971a = c13802d;
        if (AbstractC8104h6.m8584c(c13802d)) {
            c14353iM15631i = null;
        } else {
            c14353iM15631i = AbstractC14334L.m15631i();
            AbstractC12107L1.m13812c(c14353iM15631i, c13802d);
        }
        this.f44972b = c14353iM15631i;
    }

    @Override // p774h1.AbstractC14332J
    /* JADX INFO: renamed from: a */
    public final C13801c mo15611a() {
        C13802d c13802d = this.f44971a;
        return new C13801c(c13802d.f43590a, c13802d.f43591b, c13802d.f43592c, c13802d.f43593d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14331I) {
            return AbstractC16544l.m18089b(this.f44971a, ((C14331I) obj).f44971a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44971a.hashCode();
    }
}
