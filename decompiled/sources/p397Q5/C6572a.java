package p397Q5;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: Q5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6572a implements InterfaceC6574c {

    /* JADX INFO: renamed from: a */
    public final int f21256a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6572a) {
            return this.f21256a == ((C6572a) obj).f21256a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21256a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("Pixels(px="), this.f21256a, ')');
    }
}
