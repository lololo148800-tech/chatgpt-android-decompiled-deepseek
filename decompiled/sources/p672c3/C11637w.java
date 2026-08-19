package p672c3;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: c3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C11637w {

    /* JADX INFO: renamed from: a */
    public final int f35263a;

    public C11637w(int i10) {
        this.f35263a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11637w) && this.f35263a == ((C11637w) obj).f35263a;
    }

    public final int hashCode() {
        return this.f35263a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("ContainerInfo(layoutId="), this.f35263a, ')');
    }
}
