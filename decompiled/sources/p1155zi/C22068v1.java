package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.v1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22068v1 {
    public static final C22064u1 Companion = new C22064u1();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f69766d = {null, EnumC22060t1.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f69767a;

    /* JADX INFO: renamed from: b */
    public final EnumC22060t1 f69768b;

    /* JADX INFO: renamed from: c */
    public final boolean f69769c;

    public /* synthetic */ C22068v1(int i10, String str, EnumC22060t1 enumC22060t1, boolean z6) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C22048q1.f69737a.getDescriptor());
            throw null;
        }
        this.f69767a = str;
        this.f69768b = enumC22060t1;
        this.f69769c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22068v1)) {
            return false;
        }
        C22068v1 c22068v1 = (C22068v1) obj;
        return AbstractC16544l.m18089b(this.f69767a, c22068v1.f69767a) && this.f69768b == c22068v1.f69768b && this.f69769c == c22068v1.f69769c;
    }

    public final int hashCode() {
        return ((this.f69768b.hashCode() + (this.f69767a.hashCode() * 31)) * 31) + (this.f69769c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C22068v1(String str, EnumC22060t1 enumC22060t1, boolean z6) {
        this.f69767a = str;
        this.f69768b = enumC22060t1;
        this.f69769c = z6;
    }
}
