package p672c3;

import kotlin.jvm.internal.AbstractC16544l;
import p776h3.C14387a;
import p776h3.C14388b;

/* JADX INFO: renamed from: c3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C11639x {

    /* JADX INFO: renamed from: a */
    public final EnumC11620n0 f35265a;

    /* JADX INFO: renamed from: b */
    public final int f35266b;

    /* JADX INFO: renamed from: c */
    public final C14387a f35267c;

    /* JADX INFO: renamed from: d */
    public final C14388b f35268d;

    public C11639x(EnumC11620n0 enumC11620n0, int i10, C14387a c14387a, C14388b c14388b) {
        this.f35265a = enumC11620n0;
        this.f35266b = i10;
        this.f35267c = c14387a;
        this.f35268d = c14388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11639x)) {
            return false;
        }
        C11639x c11639x = (C11639x) obj;
        return this.f35265a == c11639x.f35265a && this.f35266b == c11639x.f35266b && AbstractC16544l.m18089b(this.f35267c, c11639x.f35267c) && AbstractC16544l.m18089b(this.f35268d, c11639x.f35268d);
    }

    public final int hashCode() {
        int iHashCode = ((this.f35265a.hashCode() * 31) + this.f35266b) * 31;
        C14387a c14387a = this.f35267c;
        int i10 = (iHashCode + (c14387a == null ? 0 : c14387a.f45114a)) * 31;
        C14388b c14388b = this.f35268d;
        return i10 + (c14388b != null ? c14388b.f45115a : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f35265a + ", numChildren=" + this.f35266b + ", horizontalAlignment=" + this.f35267c + ", verticalAlignment=" + this.f35268d + ')';
    }

    public /* synthetic */ C11639x(EnumC11620n0 enumC11620n0, int i10, C14387a c14387a, C14388b c14388b, int i11) {
        this(enumC11620n0, i10, (i11 & 4) != 0 ? null : c14387a, (i11 & 8) != 0 ? null : c14388b);
    }
}
