package p672c3;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: c3.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11642y0 implements InterfaceC11563A0 {

    /* JADX INFO: renamed from: a */
    public final Set f35271a;

    public C11642y0(Set set) {
        this.f35271a = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of sizes cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11642y0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
        return AbstractC16544l.m18089b(this.f35271a, ((C11642y0) obj).f35271a);
    }

    public final int hashCode() {
        return this.f35271a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.f35271a + ')';
    }
}
