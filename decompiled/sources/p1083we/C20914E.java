package p1083we;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;
import ve.EnumC20582f;

/* JADX INFO: renamed from: we.E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20914E {
    public static final C20913D Companion = new C20913D();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f66661d = {null, null, new C11158d(EnumC20582f.Companion.serializer(), 2)};

    /* JADX INFO: renamed from: a */
    public final String f66662a;

    /* JADX INFO: renamed from: b */
    public final String f66663b;

    /* JADX INFO: renamed from: c */
    public final Set f66664c;

    public /* synthetic */ C20914E(int i10, String str, String str2, Set set) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C20912C.f66660a.getDescriptor());
            throw null;
        }
        this.f66662a = str;
        this.f66663b = str2;
        if ((i10 & 4) == 0) {
            this.f66664c = C17691y.f56482Y;
        } else {
            this.f66664c = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20914E)) {
            return false;
        }
        C20914E c20914e = (C20914E) obj;
        return AbstractC16544l.m18089b(this.f66662a, c20914e.f66662a) && AbstractC16544l.m18089b(this.f66663b, c20914e.f66663b) && AbstractC16544l.m18089b(this.f66664c, c20914e.f66664c);
    }

    public final int hashCode() {
        return this.f66664c.hashCode() + AbstractC0168G.m527p(this.f66662a.hashCode() * 31, 31, this.f66663b);
    }

    public final String toString() {
        return "█";
    }

    public C20914E(String str, String str2, Set disabledTools) {
        AbstractC16544l.m18094g(disabledTools, "disabledTools");
        this.f66662a = str;
        this.f66663b = str2;
        this.f66664c = disabledTools;
    }
}
