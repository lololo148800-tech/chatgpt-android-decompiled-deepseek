package p107E1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p895n1.C17425e;

/* JADX INFO: renamed from: E1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2238b {

    /* JADX INFO: renamed from: a */
    public final C17425e f6857a;

    /* JADX INFO: renamed from: b */
    public final int f6858b;

    public C2238b(C17425e c17425e, int i10) {
        this.f6857a = c17425e;
        this.f6858b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2238b)) {
            return false;
        }
        C2238b c2238b = (C2238b) obj;
        return AbstractC16544l.m18089b(this.f6857a, c2238b.f6857a) && this.f6858b == c2238b.f6858b;
    }

    public final int hashCode() {
        return (this.f6857a.hashCode() * 31) + this.f6858b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f6857a);
        sb2.append(", configFlags=");
        return AbstractC12107L1.m13826q(sb2, this.f6858b, ')');
    }
}
