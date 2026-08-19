package p328N1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: N1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5587c {

    /* JADX INFO: renamed from: a */
    public final int f18098a;

    public C5587c(int i10) {
        this.f18098a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5587c) && this.f18098a == ((C5587c) obj).f18098a;
    }

    public final int hashCode() {
        return this.f18098a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f18098a, ')');
    }
}
