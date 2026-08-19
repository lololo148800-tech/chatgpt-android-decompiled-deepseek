package p917o6;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C17869v {

    /* JADX INFO: renamed from: a */
    public final List f56965a;

    /* JADX INFO: renamed from: b */
    public final String f56966b;

    public C17869v(List list, String str) {
        this.f56965a = list;
        this.f56966b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17869v)) {
            return false;
        }
        C17869v c17869v = (C17869v) obj;
        return AbstractC16544l.m18089b(this.f56965a, c17869v.f56965a) && AbstractC16544l.m18089b(this.f56966b, c17869v.f56966b);
    }

    public final int hashCode() {
        int iHashCode = this.f56965a.hashCode() * 31;
        String str = this.f56966b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb2.append(this.f56965a);
        sb2.append(", label=");
        return AbstractC9306j0.m9892k(sb2, this.f56966b, ')');
    }
}
