package tf;

/* JADX INFO: renamed from: tf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19924i implements InterfaceC19938w {

    /* JADX INFO: renamed from: a */
    public final boolean f63181a;

    public C19924i(boolean z6) {
        this.f63181a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19924i) && this.f63181a == ((C19924i) obj).f63181a;
    }

    public final int hashCode() {
        return this.f63181a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
