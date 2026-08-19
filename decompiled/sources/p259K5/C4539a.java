package p259K5;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9137G4;

/* JADX INFO: renamed from: K5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4539a {

    /* JADX INFO: renamed from: a */
    public final String f14840a;

    /* JADX INFO: renamed from: b */
    public final Map f14841b;

    public C4539a(String str, Map map) {
        this.f14840a = str;
        this.f14841b = AbstractC9137G4.m9681c(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4539a) {
            C4539a c4539a = (C4539a) obj;
            if (AbstractC16544l.m18089b(this.f14840a, c4539a.f14840a) && AbstractC16544l.m18089b(this.f14841b, c4539a.f14841b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14841b.hashCode() + (this.f14840a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(key=");
        sb2.append(this.f14840a);
        sb2.append(", extras=");
        return AbstractC12107L1.m13827r(sb2, this.f14841b, ')');
    }
}
