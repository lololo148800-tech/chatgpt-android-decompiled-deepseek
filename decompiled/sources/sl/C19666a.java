package sl;

import kotlin.jvm.internal.AbstractC16544l;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: sl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19666a {

    /* JADX INFO: renamed from: a */
    public final String f62331a;

    /* JADX INFO: renamed from: b */
    public final C21296a f62332b;

    public C19666a(String str, C21296a c21296a) {
        this.f62331a = str;
        this.f62332b = c21296a;
        if (AbstractC21322p.m21681O(str)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19666a)) {
            return false;
        }
        C19666a c19666a = (C19666a) obj;
        return AbstractC16544l.m18089b(this.f62331a, c19666a.f62331a) && AbstractC16544l.m18089b(this.f62332b, c19666a.f62332b);
    }

    public final int hashCode() {
        return this.f62332b.hashCode() + (this.f62331a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.f62331a;
    }
}
