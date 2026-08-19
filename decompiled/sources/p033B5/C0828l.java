package p033B5;

import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9137G4;

/* JADX INFO: renamed from: B5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0828l {

    /* JADX INFO: renamed from: b */
    public static final C0828l f2308b = new C0828l(AbstractC9137G4.m9681c(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f2309a;

    public C0828l(Map map) {
        this.f2309a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0828l) && AbstractC16544l.m18089b(this.f2309a, ((C0828l) obj).f2309a);
    }

    public final int hashCode() {
        return this.f2309a.hashCode();
    }

    public final String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("Extras(data="), this.f2309a, ')');
    }
}
