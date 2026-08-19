package re;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3061C;

/* JADX INFO: renamed from: re.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18965r extends AbstractC18967t {

    /* JADX INFO: renamed from: a */
    public final C3061C f60520a;

    public C18965r(C3061C c3061c) {
        this.f60520a = c3061c;
    }

    @Override // re.AbstractC18967t
    /* JADX INFO: renamed from: e */
    public final C3061C mo20277e() {
        return this.f60520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18965r) && AbstractC16544l.m18089b(this.f60520a, ((C18965r) obj).f60520a);
    }

    public final int hashCode() {
        return this.f60520a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
