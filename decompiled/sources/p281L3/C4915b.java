package p281L3;

import bb.C11333z;
import java.util.ArrayList;
import java.util.Arrays;
import p001A.C0013G0;
import p1016t3.C19765O;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: L3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4915b implements InterfaceC4930q {

    /* JADX INFO: renamed from: a */
    public final C19765O f16003a;

    /* JADX INFO: renamed from: b */
    public final int f16004b;

    /* JADX INFO: renamed from: c */
    public final int[] f16005c;

    /* JADX INFO: renamed from: d */
    public final C19788o[] f16006d;

    /* JADX INFO: renamed from: e */
    public int f16007e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f16008f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4915b(C19765O c19765o, int[] iArr) {
        this(c19765o, iArr, (byte) 0);
        this.f16008f = 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m5520m(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C11333z c11333z = (C11333z) arrayList.get(i10);
            if (c11333z != null) {
                c11333z.m12762a(new C4914a(j10, jArr[i10]));
            }
        }
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: a */
    public final C19765O mo4904a() {
        return this.f16003a;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo4905b(boolean z6) {
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: c */
    public final C19788o mo4906c(int i10) {
        return this.f16006d[i10];
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: d */
    public void mo4907d() {
        int i10 = this.f16008f;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: e */
    public final int mo4908e(int i10) {
        return this.f16005c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4915b c4915b = (C4915b) obj;
        return this.f16003a.equals(c4915b.f16003a) && Arrays.equals(this.f16005c, c4915b.f16005c);
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: f */
    public void mo4909f() {
        int i10 = this.f16008f;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: g */
    public final int mo4910g() {
        return this.f16005c[0];
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: h */
    public final C19788o mo4911h() {
        return this.f16006d[0];
    }

    public final int hashCode() {
        if (this.f16007e == 0) {
            this.f16007e = Arrays.hashCode(this.f16005c) + (System.identityHashCode(this.f16003a) * 31);
        }
        return this.f16007e;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: i */
    public void mo4912i(float f10) {
        int i10 = this.f16008f;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo4913j() {
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo4914k() {
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: l */
    public final int mo4915l(int i10) {
        for (int i11 = 0; i11 < this.f16004b; i11++) {
            if (this.f16005c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p281L3.InterfaceC4930q
    public final int length() {
        return this.f16005c.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4915b(C19765O c19765o, int i10) {
        this(c19765o, new int[]{i10}, (byte) 0);
        this.f16008f = 1;
    }

    public C4915b(C19765O c19765o, int[] iArr, byte b) {
        C19788o[] c19788oArr;
        AbstractC20800b.m21320h(iArr.length > 0);
        c19765o.getClass();
        this.f16003a = c19765o;
        int length = iArr.length;
        this.f16004b = length;
        this.f16006d = new C19788o[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            c19788oArr = c19765o.f62605d;
            if (i10 >= length2) {
                break;
            }
            this.f16006d[i10] = c19788oArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f16006d, new C0013G0(4));
        this.f16005c = new int[this.f16004b];
        int i11 = 0;
        while (true) {
            int i12 = this.f16004b;
            if (i11 < i12) {
                int[] iArr2 = this.f16005c;
                C19788o c19788o = this.f16006d[i11];
                int i13 = 0;
                while (true) {
                    if (i13 >= c19788oArr.length) {
                        i13 = -1;
                        break;
                    } else if (c19788o == c19788oArr[i13]) {
                        break;
                    } else {
                        i13++;
                    }
                }
                iArr2[i11] = i13;
                i11++;
            } else {
                long[] jArr = new long[i12];
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m5521n() {
    }

    /* JADX INFO: renamed from: p */
    private final void m5522p() {
    }

    /* JADX INFO: renamed from: o */
    public final void m5524o() {
    }

    /* JADX INFO: renamed from: q */
    public final void m5525q() {
    }

    /* JADX INFO: renamed from: r */
    private final void m5523r(float f10) {
    }

    /* JADX INFO: renamed from: s */
    public final void m5526s(float f10) {
    }
}
