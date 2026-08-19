package p1105xc;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11192u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: xc.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21176f {
    public static final C21175e Companion = new C21175e();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f67314e = {EnumC21180j.Companion.serializer(), null, new C11158d(C21190t.f67355a, 0), new C11158d(C11192u.f33846a, 0)};

    /* JADX INFO: renamed from: a */
    public final EnumC21180j f67315a;

    /* JADX INFO: renamed from: b */
    public final String f67316b;

    /* JADX INFO: renamed from: c */
    public final List f67317c;

    /* JADX INFO: renamed from: d */
    public final List f67318d;

    public /* synthetic */ C21176f(int i10, EnumC21180j enumC21180j, String str, List list, List list2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21174d.f67313a.getDescriptor());
            throw null;
        }
        this.f67315a = enumC21180j;
        this.f67316b = str;
        this.f67317c = list;
        this.f67318d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21176f)) {
            return false;
        }
        C21176f c21176f = (C21176f) obj;
        return this.f67315a == c21176f.f67315a && AbstractC16544l.m18089b(this.f67316b, c21176f.f67316b) && AbstractC16544l.m18089b(this.f67317c, c21176f.f67317c) && AbstractC16544l.m18089b(this.f67318d, c21176f.f67318d);
    }

    public final int hashCode() {
        return this.f67318d.hashCode() + AbstractC14376f.m15858x(this.f67317c, AbstractC0168G.m527p(this.f67315a.hashCode() * 31, 31, this.f67316b), 31);
    }

    public final String toString() {
        return "█";
    }

    public C21176f(ArrayList arrayList) {
        EnumC21180j enumC21180j = EnumC21180j.f67323Z;
        C17689w c17689w = C17689w.f56480Y;
        this.f67315a = enumC21180j;
        this.f67316b = "completion_request_time";
        this.f67317c = c17689w;
        this.f67318d = arrayList;
    }
}
