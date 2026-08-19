package p388Pm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: renamed from: Pm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6513g {

    /* JADX INFO: renamed from: a */
    public final ClassId f21121a;

    /* JADX INFO: renamed from: b */
    public final List f21122b;

    public C6513g(ClassId classId, List typeParametersCount) {
        AbstractC16544l.m18094g(classId, "classId");
        AbstractC16544l.m18094g(typeParametersCount, "typeParametersCount");
        this.f21121a = classId;
        this.f21122b = typeParametersCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6513g)) {
            return false;
        }
        C6513g c6513g = (C6513g) obj;
        return AbstractC16544l.m18089b(this.f21121a, c6513g.f21121a) && AbstractC16544l.m18089b(this.f21122b, c6513g.f21122b);
    }

    public final int hashCode() {
        return this.f21122b.hashCode() + (this.f21121a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f21121a + ", typeParametersCount=" + this.f21122b + ')';
    }
}
