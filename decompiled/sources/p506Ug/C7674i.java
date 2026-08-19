package p506Ug;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ug.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7674i {
    public static final C7673h Companion = new C7673h();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f24194d = {new C11158d(C7669d.f24190a, 0), null, null};

    /* JADX INFO: renamed from: a */
    public final List f24195a;

    /* JADX INFO: renamed from: b */
    public final int f24196b;

    /* JADX INFO: renamed from: c */
    public final int f24197c;

    public /* synthetic */ C7674i(int i10, List list, int i11, int i12) {
        if (6 != (i10 & 6)) {
            AbstractC11153a0.m12389l(i10, 6, C7672g.f24193a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f24195a = null;
        } else {
            this.f24195a = list;
        }
        this.f24196b = i11;
        this.f24197c = i12;
    }

    /* JADX INFO: renamed from: a */
    public final Float m7970a() {
        int i10 = this.f24196b;
        if (i10 > 0) {
            return Float.valueOf(this.f24197c / i10);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7674i)) {
            return false;
        }
        C7674i c7674i = (C7674i) obj;
        return AbstractC16544l.m18089b(this.f24195a, c7674i.f24195a) && this.f24196b == c7674i.f24196b && this.f24197c == c7674i.f24197c;
    }

    public final int hashCode() {
        List list = this.f24195a;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.f24196b) * 31) + this.f24197c;
    }

    public final String toString() {
        return "█";
    }
}
