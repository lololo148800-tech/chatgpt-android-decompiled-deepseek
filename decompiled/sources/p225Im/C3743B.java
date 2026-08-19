package p225Im;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;

/* JADX INFO: renamed from: Im.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C3743B {

    /* JADX INFO: renamed from: c */
    public static final C3743B f11391c = new C3743B(null, null);

    /* JADX INFO: renamed from: a */
    public final EnumC3744C f11392a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3777y f11393b;

    public C3743B(EnumC3744C enumC3744C, InterfaceC3777y interfaceC3777y) {
        String str;
        this.f11392a = enumC3744C;
        this.f11393b = interfaceC3777y;
        if ((enumC3744C == null) == (interfaceC3777y == null)) {
            return;
        }
        if (enumC3744C == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC3744C + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3743B)) {
            return false;
        }
        C3743B c3743b = (C3743B) obj;
        return this.f11392a == c3743b.f11392a && AbstractC16544l.m18089b(this.f11393b, c3743b.f11393b);
    }

    public final int hashCode() {
        EnumC3744C enumC3744C = this.f11392a;
        int iHashCode = (enumC3744C == null ? 0 : enumC3744C.hashCode()) * 31;
        InterfaceC3777y interfaceC3777y = this.f11393b;
        return iHashCode + (interfaceC3777y != null ? interfaceC3777y.hashCode() : 0);
    }

    public final String toString() {
        EnumC3744C enumC3744C = this.f11392a;
        int i10 = enumC3744C == null ? -1 : AbstractC3742A.f11390a[enumC3744C.ordinal()];
        if (i10 == -1) {
            return Separators.STAR;
        }
        InterfaceC3777y interfaceC3777y = this.f11393b;
        if (i10 == 1) {
            return String.valueOf(interfaceC3777y);
        }
        if (i10 == 2) {
            return "in " + interfaceC3777y;
        }
        if (i10 != 3) {
            throw new C0644w();
        }
        return "out " + interfaceC3777y;
    }
}
