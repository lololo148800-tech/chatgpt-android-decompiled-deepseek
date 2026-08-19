package p1014t1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19724a implements InterfaceC19734k {

    /* JADX INFO: renamed from: b */
    public final int f62446b;

    public C19724a(int i10) {
        this.f62446b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19724a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f62446b == ((C19724a) obj).f62446b;
    }

    public final int hashCode() {
        return this.f62446b;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("AndroidPointerIcon(type="), this.f62446b, ')');
    }
}
