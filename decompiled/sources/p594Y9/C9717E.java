package p594Y9;

/* JADX INFO: renamed from: Y9.E */
/* JADX INFO: loaded from: classes.dex */
public final class C9717E implements InterfaceC9735H {

    /* JADX INFO: renamed from: a */
    public final int f29245a;

    public C9717E(int i10) {
        this.f29245a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC9735H.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC9735H)) {
            return false;
        }
        C9717E c9717e = (C9717E) ((InterfaceC9735H) obj);
        if (this.f29245a == c9717e.f29245a) {
            Object obj2 = EnumC9729G.f29252Y;
            c9717e.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f29245a ^ 14552422) + (EnumC9729G.f29252Y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f29245a + "intEncoding=" + EnumC9729G.f29252Y + ')';
    }
}
