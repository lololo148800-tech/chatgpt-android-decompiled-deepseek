package p1096x2;

import java.util.List;
import p817j$.util.Objects;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21107b {

    /* JADX INFO: renamed from: a */
    public String f67042a;

    /* JADX INFO: renamed from: b */
    public String f67043b;

    /* JADX INFO: renamed from: c */
    public List f67044c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21107b)) {
            return false;
        }
        C21107b c21107b = (C21107b) obj;
        return Objects.equals(this.f67042a, c21107b.f67042a) && Objects.equals(this.f67043b, c21107b.f67043b) && Objects.equals(this.f67044c, c21107b.f67044c);
    }

    public final int hashCode() {
        return Objects.hash(this.f67042a, this.f67043b, this.f67044c);
    }
}
