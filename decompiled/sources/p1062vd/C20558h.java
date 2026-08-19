package p1062vd;

/* JADX INFO: renamed from: vd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20558h implements InterfaceC20563m {

    /* JADX INFO: renamed from: a */
    public final boolean f65263a;

    public C20558h(boolean z6) {
        this.f65263a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20558h) && this.f65263a == ((C20558h) obj).f65263a;
    }

    @Override // p1062vd.InterfaceC20563m
    public final String getId() {
        return "DefaultGizmoItem";
    }

    public final int hashCode() {
        return this.f65263a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
