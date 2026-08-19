package p946pc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3582M;
import p492U1.C7548m;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: pc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18342h {

    /* JADX INFO: renamed from: e */
    public static final C18342h f58552e = new C18342h(null, null, null, null);

    /* JADX INFO: renamed from: a */
    public final C3582M f58553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10459q f58554b;

    /* JADX INFO: renamed from: c */
    public final C7548m f58555c;

    /* JADX INFO: renamed from: d */
    public final Boolean f58556d;

    public C18342h(C3582M c3582m, InterfaceC10459q interfaceC10459q, C7548m c7548m, Boolean bool) {
        this.f58553a = c3582m;
        this.f58554b = interfaceC10459q;
        this.f58555c = c7548m;
        this.f58556d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18342h)) {
            return false;
        }
        C18342h c18342h = (C18342h) obj;
        return AbstractC16544l.m18089b(this.f58553a, c18342h.f58553a) && AbstractC16544l.m18089b(this.f58554b, c18342h.f58554b) && AbstractC16544l.m18089b(this.f58555c, c18342h.f58555c) && AbstractC16544l.m18089b(this.f58556d, c18342h.f58556d);
    }

    public final int hashCode() {
        C3582M c3582m = this.f58553a;
        int iHashCode = (c3582m == null ? 0 : c3582m.hashCode()) * 31;
        InterfaceC10459q interfaceC10459q = this.f58554b;
        int iHashCode2 = (iHashCode + (interfaceC10459q == null ? 0 : interfaceC10459q.hashCode())) * 31;
        C7548m c7548m = this.f58555c;
        int iM7896d = (iHashCode2 + (c7548m == null ? 0 : C7548m.m7896d(c7548m.f23910a))) * 31;
        Boolean bool = this.f58556d;
        return iM7896d + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.f58553a + ", modifier=" + this.f58554b + ", padding=" + this.f58555c + ", wordWrap=" + this.f58556d + Separators.RPAREN;
    }
}
