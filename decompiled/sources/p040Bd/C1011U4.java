package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.U4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1011U4 {
    public static final C1005T4 Companion = new C1005T4();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2810c = {null, new C11158d(C1035Y4.f2862a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f2811a;

    /* JADX INFO: renamed from: b */
    public final List f2812b;

    public /* synthetic */ C1011U4(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0999S4.f2792a.getDescriptor());
            throw null;
        }
        this.f2811a = str;
        this.f2812b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1011U4)) {
            return false;
        }
        C1011U4 c1011u4 = (C1011U4) obj;
        return AbstractC16544l.m18089b(this.f2811a, c1011u4.f2811a) && AbstractC16544l.m18089b(this.f2812b, c1011u4.f2812b);
    }

    public final int hashCode() {
        String str = this.f2811a;
        return this.f2812b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "█";
    }
}
