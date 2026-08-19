package p479Td;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7356i extends AbstractC7343b0 {
    public static final C7354h Companion = new C7354h();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f23333d = {null, new C11158d(C7348e.f23263a, 0)};

    /* JADX INFO: renamed from: c */
    public final List f23334c;

    public C7356i(ArrayList arrayList) {
        this.f23334c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7356i) && AbstractC16544l.m18089b(this.f23334c, ((C7356i) obj).f23334c);
    }

    public final int hashCode() {
        return this.f23334c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7356i(int i10, boolean z6, List list) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7346d.f23261a.getDescriptor());
            throw null;
        }
        this.f23334c = list;
    }
}
