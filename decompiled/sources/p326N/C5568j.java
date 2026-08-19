package p326N;

import android.util.Rational;
import android.util.Size;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p544W9.AbstractC8470E2;

/* JADX INFO: renamed from: N.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5568j {

    /* JADX INFO: renamed from: a */
    public final int f18060a;

    /* JADX INFO: renamed from: b */
    public int f18061b;

    /* JADX INFO: renamed from: c */
    public boolean f18062c;

    /* JADX INFO: renamed from: d */
    public Object f18063d;

    public C5568j(InterfaceC3866v interfaceC3866v, Rational rational) {
        this.f18060a = interfaceC3866v.mo136a();
        this.f18061b = interfaceC3866v.mo141f();
        this.f18063d = rational;
        boolean z6 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z6 = false;
        }
        this.f18062c = z6;
    }

    /* JADX INFO: renamed from: a */
    public Size m5977a(InterfaceC3818U interfaceC3818U) {
        int iMo4541B = interfaceC3818U.mo4541B();
        Size sizeMo4542C = interfaceC3818U.mo4542C();
        if (sizeMo4542C == null) {
            return sizeMo4542C;
        }
        int iM9101b = AbstractC8470E2.m9101b(AbstractC8470E2.m9102c(iMo4541B), this.f18060a, 1 == this.f18061b);
        return (iM9101b == 90 || iM9101b == 270) ? new Size(sizeMo4542C.getHeight(), sizeMo4542C.getWidth()) : sizeMo4542C;
    }

    public C5568j(int i10) {
        this.f18060a = i10;
        this.f18061b = -1;
    }
}
