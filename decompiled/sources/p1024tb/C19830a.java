package p1024tb;

/* JADX INFO: renamed from: tb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19830a implements InterfaceC19833d {

    /* JADX INFO: renamed from: a */
    public final int f62890a;

    public C19830a(int i10) {
        this.f62890a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC19833d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC19833d)) {
            return false;
        }
        C19830a c19830a = (C19830a) ((InterfaceC19833d) obj);
        if (this.f62890a == c19830a.f62890a) {
            Object obj2 = EnumC19832c.f62891Y;
            c19830a.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f62890a) + (EnumC19832c.f62891Y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f62890a + "intEncoding=" + EnumC19832c.f62891Y + ')';
    }
}
