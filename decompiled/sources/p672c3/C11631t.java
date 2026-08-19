package p672c3;

import p776h3.C14387a;
import p776h3.C14388b;

/* JADX INFO: renamed from: c3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C11631t {

    /* JADX INFO: renamed from: a */
    public final EnumC11620n0 f35247a;

    /* JADX INFO: renamed from: b */
    public final int f35248b;

    /* JADX INFO: renamed from: c */
    public final int f35249c;

    public C11631t(EnumC11620n0 enumC11620n0, int i10, int i11) {
        this.f35247a = enumC11620n0;
        this.f35248b = i10;
        this.f35249c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11631t)) {
            return false;
        }
        C11631t c11631t = (C11631t) obj;
        return this.f35247a == c11631t.f35247a && C14387a.m15890b(this.f35248b, c11631t.f35248b) && C14388b.m15893b(this.f35249c, c11631t.f35249c);
    }

    public final int hashCode() {
        return (((this.f35247a.hashCode() * 31) + this.f35248b) * 31) + this.f35249c;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f35247a + ", horizontalAlignment=" + ((Object) C14387a.m15891c(this.f35248b)) + ", verticalAlignment=" + ((Object) C14388b.m15894c(this.f35249c)) + ')';
    }
}
