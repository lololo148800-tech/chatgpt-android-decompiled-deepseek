package bf;

import ao.AbstractC11153a0;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.v */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11394v {
    public static final C11393u Companion = new C11393u();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f34419b = {AbstractC11153a0.m12383f("com.openai.feature.gizmos.model.Gizmo.ToolAuthType", EnumC11395w.values())};

    /* JADX INFO: renamed from: a */
    public final EnumC11395w f34420a;

    public /* synthetic */ C11394v(int i10, EnumC11395w enumC11395w) {
        if (1 == (i10 & 1)) {
            this.f34420a = enumC11395w;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C11392t.f34418a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11394v) && this.f34420a == ((C11394v) obj).f34420a;
    }

    public final int hashCode() {
        return this.f34420a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C11394v(EnumC11395w enumC11395w) {
        this.f34420a = enumC11395w;
    }
}
