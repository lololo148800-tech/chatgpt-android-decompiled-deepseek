package p1155zi;

import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.N */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21943N {
    public static final C21939M Companion = new C21939M();

    /* JADX INFO: renamed from: a */
    public final float f69494a;

    /* JADX INFO: renamed from: b */
    public final float f69495b;

    public /* synthetic */ C21943N(float f10, float f11, int i10) {
        if ((i10 & 1) == 0) {
            this.f69494a = 0.0f;
        } else {
            this.f69494a = f10;
        }
        if ((i10 & 2) == 0) {
            this.f69495b = 0.0f;
        } else {
            this.f69495b = f11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21943N)) {
            return false;
        }
        C21943N c21943n = (C21943N) obj;
        return Float.compare(this.f69494a, c21943n.f69494a) == 0 && Float.compare(this.f69495b, c21943n.f69495b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f69495b) + (Float.floatToIntBits(this.f69494a) * 31);
    }

    public final String toString() {
        return "█";
    }
}
