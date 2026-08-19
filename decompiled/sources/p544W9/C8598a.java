package p544W9;

/* JADX INFO: renamed from: W9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8598a implements InterfaceC8616d {

    /* JADX INFO: renamed from: a */
    public final int f26425a;

    public C8598a(int i10) {
        this.f26425a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC8616d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8616d)) {
            return false;
        }
        C8598a c8598a = (C8598a) ((InterfaceC8616d) obj);
        if (this.f26425a == c8598a.f26425a) {
            Object obj2 = EnumC8610c.f26440Y;
            c8598a.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f26425a ^ 14552422) + (EnumC8610c.f26440Y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f26425a + "intEncoding=" + EnumC8610c.f26440Y + ')';
    }
}
