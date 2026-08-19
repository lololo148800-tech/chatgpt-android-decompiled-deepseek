package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;

/* JADX INFO: renamed from: Pn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6519d implements InterfaceC6530o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6526k f21128a;

    public C6519d(InterfaceC6526k interfaceC6526k) {
        this.f21128a = interfaceC6526k;
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        return this.f21128a.mo6320a();
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        return this.f21128a.mo6321b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6519d) {
            if (AbstractC16544l.m18089b(this.f21128a, ((C6519d) obj).f21128a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21128a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f21128a + ')';
    }
}
