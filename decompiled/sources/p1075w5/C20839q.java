package p1075w5;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17690x;

/* JADX INFO: renamed from: w5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C20839q {

    /* JADX INFO: renamed from: b */
    public static final C20839q f66262b = new C20839q(C17690x.f56481Y);

    /* JADX INFO: renamed from: a */
    public final Map f66263a;

    public C20839q(Map map) {
        this.f66263a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20839q) {
            if (AbstractC16544l.m18089b(this.f66263a, ((C20839q) obj).f66263a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66263a.hashCode();
    }

    public final String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("Tags(tags="), this.f66263a, ')');
    }
}
