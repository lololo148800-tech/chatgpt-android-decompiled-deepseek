package p515V0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: V0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7735a {

    /* JADX INFO: renamed from: a */
    public int f24401a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7735a) && this.f24401a == ((C7735a) obj).f24401a;
    }

    public final int hashCode() {
        return this.f24401a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("DeltaCounter(count="), this.f24401a, ')');
    }
}
