package p232J3;

/* JADX INFO: renamed from: J3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C4212L {

    /* JADX INFO: renamed from: a */
    public final int f13697a;

    /* JADX INFO: renamed from: b */
    public final boolean f13698b;

    public C4212L(int i10, boolean z6) {
        this.f13697a = i10;
        this.f13698b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4212L.class != obj.getClass()) {
            return false;
        }
        C4212L c4212l = (C4212L) obj;
        return this.f13697a == c4212l.f13697a && this.f13698b == c4212l.f13698b;
    }

    public final int hashCode() {
        return (this.f13697a * 31) + (this.f13698b ? 1 : 0);
    }
}
