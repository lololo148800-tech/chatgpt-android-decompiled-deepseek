package p1105xc;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: xc.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21173c {
    public static final C21172b Companion = new C21172b();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f67308e = {EnumC21180j.Companion.serializer(), null, new C11158d(C21190t.f67355a, 0), null};

    /* JADX INFO: renamed from: a */
    public final EnumC21180j f67309a;

    /* JADX INFO: renamed from: b */
    public final String f67310b;

    /* JADX INFO: renamed from: c */
    public final List f67311c;

    /* JADX INFO: renamed from: d */
    public int f67312d;

    public /* synthetic */ C21173c(int i10, EnumC21180j enumC21180j, String str, List list, int i11) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21171a.f67307a.getDescriptor());
            throw null;
        }
        this.f67309a = enumC21180j;
        this.f67310b = str;
        this.f67311c = list;
        this.f67312d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21173c)) {
            return false;
        }
        C21173c c21173c = (C21173c) obj;
        return this.f67309a == c21173c.f67309a && AbstractC16544l.m18089b(this.f67310b, c21173c.f67310b) && AbstractC16544l.m18089b(this.f67311c, c21173c.f67311c) && this.f67312d == c21173c.f67312d;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f67311c, AbstractC0168G.m527p(this.f67309a.hashCode() * 31, 31, this.f67310b), 31) + this.f67312d;
    }

    public final String toString() {
        return "█";
    }

    public C21173c(EnumC21180j enumC21180j, String metric, List list, int i10) {
        AbstractC16544l.m18094g(metric, "metric");
        this.f67309a = enumC21180j;
        this.f67310b = metric;
        this.f67311c = list;
        this.f67312d = i10;
    }
}
