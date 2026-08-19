package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.o3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1140o3 implements InterfaceC1164s3 {
    public static final C1134n3 Companion = new C1134n3();

    /* JADX INFO: renamed from: a */
    public final String f3057a;

    /* JADX INFO: renamed from: b */
    public final String f3058b;

    /* JADX INFO: renamed from: c */
    public final String f3059c;

    /* JADX INFO: renamed from: d */
    public final String f3060d;

    public /* synthetic */ C1140o3(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1128m3.f3043a.getDescriptor());
            throw null;
        }
        this.f3057a = str;
        this.f3058b = str2;
        this.f3059c = str3;
        this.f3060d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1140o3)) {
            return false;
        }
        C1140o3 c1140o3 = (C1140o3) obj;
        return AbstractC16544l.m18089b(this.f3057a, c1140o3.f3057a) && AbstractC16544l.m18089b(this.f3058b, c1140o3.f3058b) && AbstractC16544l.m18089b(this.f3059c, c1140o3.f3059c) && AbstractC16544l.m18089b(this.f3060d, c1140o3.f3060d);
    }

    public final int hashCode() {
        return this.f3060d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3057a.hashCode() * 31, 31, this.f3058b), 31, this.f3059c);
    }

    public final String toString() {
        return "█";
    }
}
