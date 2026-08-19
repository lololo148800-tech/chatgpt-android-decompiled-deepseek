package p148Fi;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import mm.InterfaceC17306i;
import p003A1.AbstractC0168G;
import p040Bd.C1032Y1;
import p559Wn.C8972d;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Fi.N */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2778N extends AbstractC2841n {
    public static final C2774L Companion = new C2774L();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f8486g;

    /* JADX INFO: renamed from: a */
    public final String f8487a;

    /* JADX INFO: renamed from: b */
    public final String f8488b;

    /* JADX INFO: renamed from: c */
    public final C2862x0 f8489c;

    /* JADX INFO: renamed from: d */
    public final C1032Y1 f8490d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17306i f8491e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17306i f8492f;

    static {
        C16527D c16527d = AbstractC16526C.f51263a;
        f8486g = new KSerializer[]{null, null, null, null, new C8972d(c16527d.mo5693b(InterfaceC17306i.class), new Annotation[0]), new C8972d(c16527d.mo5693b(InterfaceC17306i.class), new Annotation[0])};
    }

    public C2778N(int i10, String str, String str2, C2862x0 c2862x0, C1032Y1 c1032y1, InterfaceC17306i interfaceC17306i, InterfaceC17306i interfaceC17306i2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C2772K.f8480a.getDescriptor());
            throw null;
        }
        this.f8487a = str;
        this.f8488b = str2;
        this.f8489c = c2862x0;
        this.f8490d = c1032y1;
        if ((i10 & 16) == 0) {
            this.f8491e = AbstractC9227W.m9800c(new C2776M(this, 1));
        } else {
            this.f8491e = interfaceC17306i;
        }
        if ((i10 & 32) == 0) {
            this.f8492f = AbstractC9227W.m9800c(new C2776M(this, 0));
        } else {
            this.f8492f = interfaceC17306i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2778N)) {
            return false;
        }
        C2778N c2778n = (C2778N) obj;
        return AbstractC16544l.m18089b(this.f8487a, c2778n.f8487a) && AbstractC16544l.m18089b(this.f8488b, c2778n.f8488b) && AbstractC16544l.m18089b(this.f8489c, c2778n.f8489c) && AbstractC16544l.m18089b(this.f8490d, c2778n.f8490d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f8487a.hashCode() * 31, 31, this.f8488b);
        C2862x0 c2862x0 = this.f8489c;
        int iHashCode = (iM527p + (c2862x0 == null ? 0 : c2862x0.hashCode())) * 31;
        C1032Y1 c1032y1 = this.f8490d;
        return iHashCode + (c1032y1 != null ? c1032y1.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
