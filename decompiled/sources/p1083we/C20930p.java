package p1083we;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;
import ve.EnumC20582f;

/* JADX INFO: renamed from: we.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20930p {
    public static final C20929o Companion = new C20929o();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f66691e = {null, null, null, new C11158d(EnumC20582f.Companion.serializer(), 2)};

    /* JADX INFO: renamed from: a */
    public final boolean f66692a;

    /* JADX INFO: renamed from: b */
    public final String f66693b;

    /* JADX INFO: renamed from: c */
    public final String f66694c;

    /* JADX INFO: renamed from: d */
    public final Set f66695d;

    public /* synthetic */ C20930p(int i10, boolean z6, String str, String str2, Set set) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C20928n.f66690a.getDescriptor());
            throw null;
        }
        this.f66692a = z6;
        this.f66693b = str;
        this.f66694c = str2;
        if ((i10 & 8) == 0) {
            this.f66695d = C17691y.f56482Y;
        } else {
            this.f66695d = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20930p)) {
            return false;
        }
        C20930p c20930p = (C20930p) obj;
        return this.f66692a == c20930p.f66692a && AbstractC16544l.m18089b(this.f66693b, c20930p.f66693b) && AbstractC16544l.m18089b(this.f66694c, c20930p.f66694c) && AbstractC16544l.m18089b(this.f66695d, c20930p.f66695d);
    }

    public final int hashCode() {
        return this.f66695d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((this.f66692a ? 1231 : 1237) * 31, 31, this.f66693b), 31, this.f66694c);
    }

    public final String toString() {
        return "█";
    }
}
