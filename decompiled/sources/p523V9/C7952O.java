package p523V9;

/* JADX INFO: renamed from: V9.O */
/* JADX INFO: loaded from: classes.dex */
public final class C7952O implements InterfaceC7991T {

    /* JADX INFO: renamed from: a */
    public final int f25185a;

    public C7952O(int i10) {
        this.f25185a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC7991T.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC7991T)) {
            return false;
        }
        C7952O c7952o = (C7952O) ((InterfaceC7991T) obj);
        if (this.f25185a == c7952o.f25185a) {
            Object obj2 = EnumC7983S.f25247Y;
            c7952o.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f25185a ^ 14552422) + (EnumC7983S.f25247Y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f25185a + "intEncoding=" + EnumC7983S.f25247Y + ')';
    }
}
