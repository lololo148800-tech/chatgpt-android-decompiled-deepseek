package ve;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: ve.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20584h {
    public static final C20579c Companion = new C20579c();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f65314e = {null, null, null, new C11158d(EnumC20582f.Companion.serializer(), 2)};

    /* JADX INFO: renamed from: a */
    public final boolean f65315a;

    /* JADX INFO: renamed from: b */
    public final String f65316b;

    /* JADX INFO: renamed from: c */
    public final String f65317c;

    /* JADX INFO: renamed from: d */
    public final Set f65318d;

    public /* synthetic */ C20584h(int i10, boolean z6, String str, String str2, Set set) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C20578b.f65304a.getDescriptor());
            throw null;
        }
        this.f65315a = z6;
        this.f65316b = str;
        this.f65317c = str2;
        if ((i10 & 8) == 0) {
            this.f65318d = C17691y.f56482Y;
        } else {
            this.f65318d = set;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C20584h m21188a(C20584h c20584h, boolean z6, String str, String str2, LinkedHashSet linkedHashSet, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c20584h.f65315a;
        }
        if ((i10 & 2) != 0) {
            str = c20584h.f65316b;
        }
        if ((i10 & 4) != 0) {
            str2 = c20584h.f65317c;
        }
        Set disabledTools = linkedHashSet;
        if ((i10 & 8) != 0) {
            disabledTools = c20584h.f65318d;
        }
        c20584h.getClass();
        AbstractC16544l.m18094g(disabledTools, "disabledTools");
        return new C20584h(z6, str, str2, disabledTools);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20584h)) {
            return false;
        }
        C20584h c20584h = (C20584h) obj;
        return this.f65315a == c20584h.f65315a && AbstractC16544l.m18089b(this.f65316b, c20584h.f65316b) && AbstractC16544l.m18089b(this.f65317c, c20584h.f65317c) && AbstractC16544l.m18089b(this.f65318d, c20584h.f65318d);
    }

    public final int hashCode() {
        int i10 = (this.f65315a ? 1231 : 1237) * 31;
        String str = this.f65316b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65317c;
        return this.f65318d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C20584h(boolean z6, String str, String str2, Set disabledTools) {
        AbstractC16544l.m18094g(disabledTools, "disabledTools");
        this.f65315a = z6;
        this.f65316b = str;
        this.f65317c = str2;
        this.f65318d = disabledTools;
    }
}
