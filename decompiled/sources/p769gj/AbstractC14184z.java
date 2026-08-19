package p769gj;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p225Im.InterfaceC3756d;

/* JADX INFO: renamed from: gj.z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14184z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f44579a;

    public AbstractC14184z(InterfaceC3756d type) {
        AbstractC16544l.m18094g(type, "type");
        this.f44579a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            C16527D c16527d = AbstractC16526C.f51263a;
            if (!c16527d.mo5693b(cls).equals(c16527d.mo5693b(obj.getClass()))) {
                return false;
            }
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.ViewEnvironmentKey<*>");
        }
        return AbstractC16544l.m18089b(this.f44579a, ((AbstractC14184z) obj).f44579a);
    }

    public final int hashCode() {
        return this.f44579a.hashCode();
    }

    public final String toString() {
        return "ViewEnvironmentKey(" + this.f44579a + ")-" + super.toString();
    }
}
