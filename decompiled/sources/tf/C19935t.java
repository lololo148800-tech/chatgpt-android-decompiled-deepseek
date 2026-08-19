package tf;

import kotlin.jvm.internal.AbstractC16544l;
import p749fd.EnumC13617b;

/* JADX INFO: renamed from: tf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C19935t implements InterfaceC19938w {

    /* JADX INFO: renamed from: a */
    public final EnumC13617b f63193a;

    public C19935t(EnumC13617b mode) {
        AbstractC16544l.m18094g(mode, "mode");
        this.f63193a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19935t) && this.f63193a == ((C19935t) obj).f63193a;
    }

    public final int hashCode() {
        return this.f63193a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
