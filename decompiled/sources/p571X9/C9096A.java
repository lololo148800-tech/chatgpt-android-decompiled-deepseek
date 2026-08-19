package p571X9;

/* JADX INFO: renamed from: X9.A */
/* JADX INFO: loaded from: classes.dex */
public final class C9096A implements InterfaceC9114D {

    /* JADX INFO: renamed from: a */
    public final int f27862a;

    public C9096A(int i10) {
        this.f27862a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC9114D.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC9114D)) {
            return false;
        }
        C9096A c9096a = (C9096A) ((InterfaceC9114D) obj);
        if (this.f27862a == c9096a.f27862a) {
            Object obj2 = EnumC9108C.f27869Y;
            c9096a.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f27862a ^ 14552422) + (EnumC9108C.f27869Y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f27862a + "intEncoding=" + EnumC9108C.f27869Y + ')';
    }
}
