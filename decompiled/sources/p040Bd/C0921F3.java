package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.F3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0921F3 implements InterfaceC1136o {
    public static final C0915E3 Companion = new C0915E3();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2659c = {new C11158d(C1034Y3.f2861d, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f2660a;

    /* JADX INFO: renamed from: b */
    public final String f2661b;

    public /* synthetic */ C0921F3(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0909D3.f2642a.getDescriptor());
            throw null;
        }
        this.f2660a = list;
        this.f2661b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0921F3)) {
            return false;
        }
        C0921F3 c0921f3 = (C0921F3) obj;
        return AbstractC16544l.m18089b(this.f2660a, c0921f3.f2660a) && AbstractC16544l.m18089b(this.f2661b, c0921f3.f2661b);
    }

    public final int hashCode() {
        return this.f2661b.hashCode() + (this.f2660a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C0921F3(ArrayList arrayList) {
        EnumC1124m[] enumC1124mArr = EnumC1124m.f3037Y;
        this.f2660a = arrayList;
        this.f2661b = "multimodal_text";
    }
}
