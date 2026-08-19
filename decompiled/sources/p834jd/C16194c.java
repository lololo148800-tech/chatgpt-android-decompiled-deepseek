package p834jd;

import ao.C11158d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: jd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16194c {
    public static final C16193b Companion = new C16193b();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f50266f = {null, null, new C11158d(AbstractC16201j.Companion.serializer(), 2)};

    /* JADX INFO: renamed from: a */
    public final boolean f50267a;

    /* JADX INFO: renamed from: b */
    public final boolean f50268b;

    /* JADX INFO: renamed from: c */
    public final boolean f50269c;

    /* JADX INFO: renamed from: d */
    public final int f50270d;

    /* JADX INFO: renamed from: e */
    public final Set f50271e;

    public /* synthetic */ C16194c(int i10, boolean z6, int i11, Set set) {
        this.f50267a = false;
        this.f50268b = false;
        if ((i10 & 1) == 0) {
            this.f50269c = false;
        } else {
            this.f50269c = z6;
        }
        if ((i10 & 2) == 0) {
            this.f50270d = 0;
        } else {
            this.f50270d = i11;
        }
        if ((i10 & 4) == 0) {
            this.f50271e = C17691y.f56482Y;
        } else {
            this.f50271e = set;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C16194c m17803a(C16194c c16194c, boolean z6, boolean z10, boolean z11, int i10, LinkedHashSet linkedHashSet, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c16194c.f50267a;
        }
        boolean z12 = z6;
        if ((i11 & 2) != 0) {
            z10 = c16194c.f50268b;
        }
        boolean z13 = z10;
        if ((i11 & 4) != 0) {
            z11 = c16194c.f50269c;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            i10 = c16194c.f50270d;
        }
        int i12 = i10;
        Set set = linkedHashSet;
        if ((i11 & 16) != 0) {
            set = c16194c.f50271e;
        }
        Set seenAccountDisclosuresFor = set;
        c16194c.getClass();
        AbstractC16544l.m18094g(seenAccountDisclosuresFor, "seenAccountDisclosuresFor");
        return new C16194c(z12, z13, z14, i12, seenAccountDisclosuresFor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16194c)) {
            return false;
        }
        C16194c c16194c = (C16194c) obj;
        return this.f50267a == c16194c.f50267a && this.f50268b == c16194c.f50268b && this.f50269c == c16194c.f50269c && this.f50270d == c16194c.f50270d && AbstractC16544l.m18089b(this.f50271e, c16194c.f50271e);
    }

    public final int hashCode() {
        return this.f50271e.hashCode() + ((((((((this.f50267a ? 1231 : 1237) * 31) + (this.f50268b ? 1231 : 1237)) * 31) + (this.f50269c ? 1231 : 1237)) * 31) + this.f50270d) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C16194c(boolean z6, boolean z10, boolean z11, int i10, Set seenAccountDisclosuresFor) {
        AbstractC16544l.m18094g(seenAccountDisclosuresFor, "seenAccountDisclosuresFor");
        this.f50267a = z6;
        this.f50268b = z10;
        this.f50269c = z11;
        this.f50270d = i10;
        this.f50271e = seenAccountDisclosuresFor;
    }
}
