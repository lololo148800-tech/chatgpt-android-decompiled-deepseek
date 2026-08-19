package p1126yd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p040Bd.C1032Y1;
import p1155zi.C21977Y0;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: yd.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21494r {
    public static final C21492q Companion = new C21492q();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f68103e = {null, null, new C11158d(C21977Y0.f69577a, 0), null};

    /* JADX INFO: renamed from: a */
    public final String f68104a;

    /* JADX INFO: renamed from: b */
    public final String f68105b;

    /* JADX INFO: renamed from: c */
    public final List f68106c;

    /* JADX INFO: renamed from: d */
    public final C1032Y1 f68107d;

    public C21494r(int i10, String str, String str2, List list, C1032Y1 c1032y1) {
        if (5 != (i10 & 5)) {
            AbstractC11153a0.m12389l(i10, 5, C21490p.f68101a.getDescriptor());
            throw null;
        }
        this.f68104a = str;
        if ((i10 & 2) == 0) {
            this.f68105b = null;
        } else {
            this.f68105b = str2;
        }
        this.f68106c = list;
        if ((i10 & 8) == 0) {
            this.f68107d = null;
        } else {
            this.f68107d = c1032y1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21494r)) {
            return false;
        }
        C21494r c21494r = (C21494r) obj;
        if (!AbstractC16544l.m18089b(this.f68104a, c21494r.f68104a)) {
            return false;
        }
        String str = this.f68105b;
        String str2 = c21494r.f68105b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f68106c, c21494r.f68106c) && AbstractC16544l.m18089b(this.f68107d, c21494r.f68107d);
    }

    public final int hashCode() {
        int iHashCode = this.f68104a.hashCode() * 31;
        String str = this.f68105b;
        int iM15858x = AbstractC14376f.m15858x(this.f68106c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        C1032Y1 c1032y1 = this.f68107d;
        return iM15858x + (c1032y1 != null ? c1032y1.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
