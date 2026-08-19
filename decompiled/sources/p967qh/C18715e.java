package p967qh;

/* JADX INFO: renamed from: qh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18715e implements InterfaceC18717g {

    /* JADX INFO: renamed from: a */
    public final float f59549a;

    public C18715e(float f10) {
        this.f59549a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18715e) && Float.compare(this.f59549a, ((C18715e) obj).f59549a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f59549a);
    }

    public final String toString() {
        return "█";
    }
}
