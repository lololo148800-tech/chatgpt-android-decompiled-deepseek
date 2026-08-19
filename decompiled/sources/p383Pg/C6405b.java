package p383Pg;

import java.util.ArrayList;
import p098Di.InterfaceC2062k;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Pg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6405b implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20838a;

    /* JADX INFO: renamed from: b */
    public final C6408e f20839b;

    public C6405b(ArrayList arrayList, C6408e c6408e) {
        this.f20838a = arrayList;
        this.f20839b = c6408e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6405b)) {
            return false;
        }
        C6405b c6405b = (C6405b) obj;
        return this.f20838a.equals(c6405b.f20838a) && this.f20839b.equals(c6405b.f20839b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20839b.f20847a) + (this.f20838a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
