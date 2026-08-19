package p709di;

import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21555b;

/* JADX INFO: renamed from: di.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13175c {

    /* JADX INFO: renamed from: a */
    public final boolean f41816a;

    /* JADX INFO: renamed from: b */
    public final C21555b f41817b;

    public C13175c(boolean z6, C21555b c21555b) {
        this.f41816a = z6;
        this.f41817b = c21555b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13175c)) {
            return false;
        }
        C13175c c13175c = (C13175c) obj;
        return this.f41816a == c13175c.f41816a && AbstractC16544l.m18089b(this.f41817b, c13175c.f41817b);
    }

    public final int hashCode() {
        int i10 = (this.f41816a ? 1231 : 1237) * 31;
        C21555b c21555b = this.f41817b;
        return i10 + (c21555b == null ? 0 : C21555b.m21837g(c21555b.f68263Y));
    }

    public final String toString() {
        return "█";
    }
}
