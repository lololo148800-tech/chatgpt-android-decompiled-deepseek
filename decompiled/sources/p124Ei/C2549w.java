package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ei.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C2549w {

    /* JADX INFO: renamed from: a */
    public final String f7957a;

    /* JADX INFO: renamed from: b */
    public final long f7958b;

    /* JADX INFO: renamed from: c */
    public final Integer f7959c;

    /* JADX INFO: renamed from: d */
    public final Integer f7960d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1426a f7961e;

    public C2549w(String str, long j10, Integer num, Integer num2, InterfaceC1426a interfaceC1426a, int i10) {
        num = (i10 & 4) != 0 ? null : num;
        num2 = (i10 & 8) != 0 ? null : num2;
        interfaceC1426a = (i10 & 16) != 0 ? null : interfaceC1426a;
        this.f7957a = str;
        this.f7958b = j10;
        this.f7959c = num;
        this.f7960d = num2;
        this.f7961e = interfaceC1426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2549w)) {
            return false;
        }
        C2549w c2549w = (C2549w) obj;
        return AbstractC16544l.m18089b(this.f7957a, c2549w.f7957a) && C14365u.m15775c(this.f7958b, c2549w.f7958b) && AbstractC16544l.m18089b(this.f7959c, c2549w.f7959c) && AbstractC16544l.m18089b(this.f7960d, c2549w.f7960d) && AbstractC16544l.m18089b(this.f7961e, c2549w.f7961e);
    }

    public final int hashCode() {
        String str = this.f7957a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i10 = C14365u.f45061k;
        int iM15857w = AbstractC14376f.m15857w(this.f7958b, iHashCode * 31, 31);
        Integer num = this.f7959c;
        int iHashCode2 = (iM15857w + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7960d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        InterfaceC1426a interfaceC1426a = this.f7961e;
        return iHashCode3 + (interfaceC1426a != null ? interfaceC1426a.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
