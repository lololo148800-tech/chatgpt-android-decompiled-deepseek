package p780h7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16546n;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: h7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14419a {

    /* JADX INFO: renamed from: a */
    public final int f45313a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f45314b;

    /* JADX INFO: renamed from: c */
    public final AbstractC16546n f45315c;

    /* JADX INFO: renamed from: d */
    public final int f45316d;

    /* JADX WARN: Multi-variable type inference failed */
    public C14419a(int i10, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, int i11) {
        AbstractC14376f.m15825D(i11, "backpressureMitigation");
        this.f45313a = i10;
        this.f45314b = (AbstractC16546n) interfaceC1426a;
        this.f45315c = (AbstractC16546n) interfaceC1436k;
        this.f45316d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14419a)) {
            return false;
        }
        C14419a c14419a = (C14419a) obj;
        return this.f45313a == c14419a.f45313a && this.f45314b.equals(c14419a.f45314b) && this.f45315c.equals(c14419a.f45315c) && this.f45316d == c14419a.f45316d;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f45316d) + ((this.f45315c.hashCode() + ((this.f45314b.hashCode() + (this.f45313a * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackPressureStrategy(capacity=");
        sb2.append(this.f45313a);
        sb2.append(", onThresholdReached=");
        sb2.append(this.f45314b);
        sb2.append(", onItemDropped=");
        sb2.append(this.f45315c);
        sb2.append(", backpressureMitigation=");
        int i10 = this.f45316d;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "IGNORE_NEWEST";
        } else {
            str = "DROP_OLDEST";
        }
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
