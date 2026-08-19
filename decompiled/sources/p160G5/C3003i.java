package p160G5;

import kotlin.jvm.internal.AbstractC16544l;
import p111E5.EnumC2324h;
import p111E5.InterfaceC2333q;

/* JADX INFO: renamed from: G5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3003i implements InterfaceC2999e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2333q f9028a;

    /* JADX INFO: renamed from: b */
    public final String f9029b;

    /* JADX INFO: renamed from: c */
    public final EnumC2324h f9030c;

    public C3003i(InterfaceC2333q interfaceC2333q, String str, EnumC2324h enumC2324h) {
        this.f9028a = interfaceC2333q;
        this.f9029b = str;
        this.f9030c = enumC2324h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3003i)) {
            return false;
        }
        C3003i c3003i = (C3003i) obj;
        return AbstractC16544l.m18089b(this.f9028a, c3003i.f9028a) && AbstractC16544l.m18089b(this.f9029b, c3003i.f9029b) && this.f9030c == c3003i.f9030c;
    }

    public final int hashCode() {
        int iHashCode = this.f9028a.hashCode() * 31;
        String str = this.f9029b;
        return this.f9030c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f9028a + ", mimeType=" + this.f9029b + ", dataSource=" + this.f9030c + ')';
    }
}
