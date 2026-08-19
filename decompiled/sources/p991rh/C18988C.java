package p991rh;

/* JADX INFO: renamed from: rh.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C18988C implements InterfaceC18989D {

    /* JADX INFO: renamed from: a */
    public final float f60562a;

    public C18988C(float f10) {
        this.f60562a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18988C) && Float.compare(this.f60562a, ((C18988C) obj).f60562a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f60562a);
    }

    public final String toString() {
        return "█";
    }
}
