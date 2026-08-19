package p566X4;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: X4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9044b extends AbstractC9045c {

    /* JADX INFO: renamed from: a */
    public final int f27616a;

    public C9044b(int i10) {
        this.f27616a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9044b) && this.f27616a == ((C9044b) obj).f27616a;
    }

    public final int hashCode() {
        return this.f27616a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("ConstraintsNotMet(reason="), this.f27616a, ')');
    }
}
