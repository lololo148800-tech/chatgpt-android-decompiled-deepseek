package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0971O extends AbstractC1142p {
    public static final C0947K Companion = new C0947K();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f2744e = {null, null, new C11158d(C0953L.f2712a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f2745a;

    /* JADX INFO: renamed from: b */
    public final Integer f2746b;

    /* JADX INFO: renamed from: c */
    public final List f2747c;

    /* JADX INFO: renamed from: d */
    public final String f2748d;

    public C0971O(int i10, Integer num, Integer num2, List list, String str) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0941J.f2705a.getDescriptor());
            throw null;
        }
        this.f2745a = num;
        this.f2746b = num2;
        if ((i10 & 4) == 0) {
            this.f2747c = C17689w.f56480Y;
        } else {
            this.f2747c = list;
        }
        if ((i10 & 8) == 0) {
            this.f2748d = "file_navlist";
        } else {
            this.f2748d = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2746b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2745a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2748d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0971O)) {
            return false;
        }
        C0971O c0971o = (C0971O) obj;
        return AbstractC16544l.m18089b(this.f2745a, c0971o.f2745a) && AbstractC16544l.m18089b(this.f2746b, c0971o.f2746b) && AbstractC16544l.m18089b(this.f2747c, c0971o.f2747c) && AbstractC16544l.m18089b(this.f2748d, c0971o.f2748d);
    }

    public final int hashCode() {
        Integer num = this.f2745a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2746b;
        return this.f2748d.hashCode() + AbstractC14376f.m15858x(this.f2747c, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
