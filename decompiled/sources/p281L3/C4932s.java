package p281L3;

import p057C3.C1559f0;
import p084D4.C1904b;
import p1016t3.C19770U;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: L3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4932s {

    /* JADX INFO: renamed from: a */
    public final int f16096a;

    /* JADX INFO: renamed from: b */
    public final C1559f0[] f16097b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4930q[] f16098c;

    /* JADX INFO: renamed from: d */
    public final C19770U f16099d;

    /* JADX INFO: renamed from: e */
    public final C1904b f16100e;

    public C4932s(C1559f0[] c1559f0Arr, InterfaceC4930q[] interfaceC4930qArr, C19770U c19770u, C1904b c1904b) {
        AbstractC20800b.m21316d(c1559f0Arr.length == interfaceC4930qArr.length);
        this.f16097b = c1559f0Arr;
        this.f16098c = (InterfaceC4930q[]) interfaceC4930qArr.clone();
        this.f16099d = c19770u;
        this.f16100e = c1904b;
        this.f16096a = c1559f0Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5541a(C4932s c4932s, int i10) {
        return c4932s != null && AbstractC20817s.m21400a(this.f16097b[i10], c4932s.f16097b[i10]) && AbstractC20817s.m21400a(this.f16098c[i10], c4932s.f16098c[i10]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5542b(int i10) {
        return this.f16097b[i10] != null;
    }
}
