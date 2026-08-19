package p672c3;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: c3.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11608h0 {

    /* JADX INFO: renamed from: a */
    public final int f35117a;

    public C11608h0(int i10) {
        this.f35117a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11608h0) && this.f35117a == ((C11608h0) obj).f35117a;
    }

    public final int hashCode() {
        return this.f35117a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("LayoutInfo(layoutId="), this.f35117a, ')');
    }
}
