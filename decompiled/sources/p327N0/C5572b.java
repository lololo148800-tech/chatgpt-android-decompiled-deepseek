package p327N0;

import java.util.Set;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5572b {

    /* JADX INFO: renamed from: a */
    public final int f18070a;

    /* JADX INFO: renamed from: b */
    public final int f18071b;

    public C5572b(int i10, int i11) {
        this.f18070a = i10;
        this.f18071b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5572b.class != obj.getClass()) {
            return false;
        }
        C5572b c5572b = (C5572b) obj;
        return C5573c.m5980a(this.f18070a, c5572b.f18070a) && C5571a.m5978a(this.f18071b, c5572b.f18071b);
    }

    public final int hashCode() {
        Set set = C5573c.f18072Z;
        int i10 = this.f18070a * 31;
        Set set2 = C5571a.f18067Z;
        return i10 + this.f18071b;
    }

    public final String toString() {
        return "WindowSizeClass(" + ((Object) C5573c.m5981b(this.f18070a)) + ", " + ((Object) C5571a.m5979b(this.f18071b)) + ')';
    }
}
