package p259K5;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p571X9.AbstractC9137G4;

/* JADX INFO: renamed from: K5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4540b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f14842a;

    /* JADX INFO: renamed from: b */
    public final Map f14843b;

    public C4540b(InterfaceC0829m interfaceC0829m, Map map) {
        this.f14842a = interfaceC0829m;
        this.f14843b = AbstractC9137G4.m9681c(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4540b) {
            C4540b c4540b = (C4540b) obj;
            if (AbstractC16544l.m18089b(this.f14842a, c4540b.f14842a) && AbstractC16544l.m18089b(this.f14843b, c4540b.f14843b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14843b.hashCode() + (this.f14842a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Value(image=");
        sb2.append(this.f14842a);
        sb2.append(", extras=");
        return AbstractC12107L1.m13827r(sb2, this.f14843b, ')');
    }
}
