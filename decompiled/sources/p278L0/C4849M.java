package p278L0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p145Ff.C2728f;
import p229J0.AbstractC3970Q1;
import p492U1.C7541f;
import p492U1.C7544i;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p587Y1.InterfaceC9595u;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: L0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C4849M implements InterfaceC9595u {

    /* JADX INFO: renamed from: a */
    public final long f15783a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7537b f15784b;

    /* JADX INFO: renamed from: c */
    public final int f15785c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1439n f15786d;

    /* JADX INFO: renamed from: e */
    public final C4862a f15787e;

    /* JADX INFO: renamed from: f */
    public final C4862a f15788f;

    /* JADX INFO: renamed from: g */
    public final C4883k0 f15789g;

    /* JADX INFO: renamed from: h */
    public final C4883k0 f15790h;

    /* JADX INFO: renamed from: i */
    public final C4864b f15791i;

    /* JADX INFO: renamed from: j */
    public final C4864b f15792j;

    /* JADX INFO: renamed from: k */
    public final C4864b f15793k;

    /* JADX INFO: renamed from: l */
    public final C4885l0 f15794l;

    /* JADX INFO: renamed from: m */
    public final C4885l0 f15795m;

    public C4849M(long j10, InterfaceC7537b interfaceC7537b, C2728f c2728f) {
        int iMo7866k0 = interfaceC7537b.mo7866k0(AbstractC3970Q1.f12404a);
        this.f15783a = j10;
        this.f15784b = interfaceC7537b;
        this.f15785c = iMo7866k0;
        this.f15786d = c2728f;
        int iMo7866k1 = interfaceC7537b.mo7866k0(Float.intBitsToFloat((int) (j10 >> 32)));
        C10449g c10449g = C10444b.f30946y0;
        this.f15787e = new C4862a(c10449g, c10449g, iMo7866k1);
        C10449g c10449g2 = C10444b.f30932A0;
        this.f15788f = new C4862a(c10449g2, c10449g2, iMo7866k1);
        this.f15789g = new C4883k0(AbstractC10443a.f30929c);
        this.f15790h = new C4883k0(AbstractC10443a.f30930d);
        int iMo7866k2 = interfaceC7537b.mo7866k0(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        C10450h c10450h = C10444b.f30943v0;
        C10450h c10450h2 = C10444b.f30945x0;
        this.f15791i = new C4864b(c10450h, c10450h2, iMo7866k2);
        this.f15792j = new C4864b(c10450h2, c10450h, iMo7866k2);
        this.f15793k = new C4864b(C10444b.f30944w0, c10450h, iMo7866k2);
        this.f15794l = new C4885l0(c10450h, iMo7866k0);
        this.f15795m = new C4885l0(c10450h2, iMo7866k0);
    }

    @Override // p587Y1.InterfaceC9595u
    /* JADX INFO: renamed from: a */
    public final long mo2638a(C7544i c7544i, long j10, EnumC7546k enumC7546k, long j11) {
        int iMo5503a;
        int i10;
        int iM7885b = c7544i.m7885b() / 2;
        int i11 = c7544i.f23899a;
        int iM7884a = c7544i.m7884a() / 2;
        int i12 = c7544i.f23900b;
        int i13 = (int) (j10 >> 32);
        List listM19382k = AbstractC17681o.m19382k(this.f15787e, this.f15788f, ((int) (AbstractC9101A4.m9631a(iM7885b + i11, iM7884a + i12) >> 32)) < i13 / 2 ? this.f15789g : this.f15790h);
        int size = listM19382k.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                iMo5503a = 0;
                break;
            }
            int i15 = (int) (j11 >> 32);
            int i16 = size;
            int i17 = i14;
            List list = listM19382k;
            int i18 = i13;
            iMo5503a = ((InterfaceC4856U) listM19382k.get(i14)).mo5503a(c7544i, j10, i15, enumC7546k);
            if (i17 == AbstractC17681o.m19381j(list) || (iMo5503a >= 0 && i15 + iMo5503a <= i18)) {
                break;
            }
            i14 = i17 + 1;
            size = i16;
            i13 = i18;
            listM19382k = list;
        }
        int i19 = (int) (j10 & 4294967295L);
        int i20 = 0;
        List listM19382k2 = AbstractC17681o.m19382k(this.f15791i, this.f15792j, this.f15793k, ((int) (AbstractC9101A4.m9631a((c7544i.m7885b() / 2) + i11, (c7544i.m7884a() / 2) + i12) & 4294967295L)) < i19 / 2 ? this.f15794l : this.f15795m);
        int size2 = listM19382k2.size();
        for (int i21 = 0; i21 < size2; i21++) {
            int i22 = (int) (j11 & 4294967295L);
            int iMo5504a = ((InterfaceC4857V) listM19382k2.get(i21)).mo5504a(c7544i, j10, i22);
            if (i21 == AbstractC17681o.m19381j(listM19382k2) || (iMo5504a >= (i10 = this.f15785c) && i22 + iMo5504a <= i19 - i10)) {
                i20 = iMo5504a;
                break;
            }
        }
        long jM9631a = AbstractC9101A4.m9631a(iMo5503a, i20);
        int i23 = (int) (jM9631a >> 32);
        int i24 = (int) (jM9631a & 4294967295L);
        this.f15786d.invoke(c7544i, new C7544i(i23, i24, ((int) (j11 >> 32)) + i23, ((int) (j11 & 4294967295L)) + i24));
        return jM9631a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4849M)) {
            return false;
        }
        C4849M c4849m = (C4849M) obj;
        return this.f15783a == c4849m.f15783a && AbstractC16544l.m18089b(this.f15784b, c4849m.f15784b) && this.f15785c == c4849m.f15785c && AbstractC16544l.m18089b(this.f15786d, c4849m.f15786d);
    }

    public final int hashCode() {
        long j10 = this.f15783a;
        return this.f15786d.hashCode() + ((((this.f15784b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31) + this.f15785c) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C7541f.m7875a(this.f15783a)) + ", density=" + this.f15784b + ", verticalMargin=" + this.f15785c + ", onPositionCalculated=" + this.f15786d + ')';
    }
}
