package p758g0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16544l;
import p666bl.C11500p;

/* JADX INFO: renamed from: g0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13781p0 implements InterfaceC13797y {

    /* JADX INFO: renamed from: a */
    public final int f43519a;

    /* JADX INFO: renamed from: b */
    public final int f43520b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13798z f43521c;

    public C13781p0(int i10, InterfaceC13798z interfaceC13798z, int i11) {
        this((i11 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i10, 0, (i11 & 4) != 0 ? AbstractC13725A.f43288a : interfaceC13798z);
    }

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        return new C11500p(this.f43519a, this.f43520b, this.f43521c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13781p0)) {
            return false;
        }
        C13781p0 c13781p0 = (C13781p0) obj;
        return c13781p0.f43519a == this.f43519a && c13781p0.f43520b == this.f43520b && AbstractC16544l.m18089b(c13781p0.f43521c, this.f43521c);
    }

    public final int hashCode() {
        return ((this.f43521c.hashCode() + (this.f43519a * 31)) * 31) + this.f43520b;
    }

    @Override // p758g0.InterfaceC13797y, p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13789t0 mo15214a(C13783q0 c13783q0) {
        return new C11500p(this.f43519a, this.f43520b, this.f43521c);
    }

    public C13781p0(int i10, int i11, InterfaceC13798z interfaceC13798z) {
        this.f43519a = i10;
        this.f43520b = i11;
        this.f43521c = interfaceC13798z;
    }
}
