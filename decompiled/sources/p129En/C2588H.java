package p129En;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2149O0;

/* JADX INFO: renamed from: En.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C2588H extends C2127D0 implements InterfaceC2149O0 {
    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f6512t0;
            AbstractC16544l.m18091d(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f6513u0 + ((long) ((int) ((m3239q() + ((long) this.f6515w0)) - this.f6513u0)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: x */
    public final void m3609x(int i10) {
        synchronized (this) {
            Object[] objArr = this.f6512t0;
            AbstractC16544l.m18091d(objArr);
            mo3231f(Integer.valueOf(((Number) objArr[((int) ((this.f6513u0 + ((long) ((int) ((m3239q() + ((long) this.f6515w0)) - this.f6513u0)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
