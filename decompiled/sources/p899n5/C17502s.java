package p899n5;

import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p1075w5.C20835m;
import p864l5.C16826m;
import p958q5.C18638m;

/* JADX INFO: renamed from: n5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C17502s implements InterfaceC17490g {

    /* JADX INFO: renamed from: a */
    public final boolean f55980a = true;

    @Override // p899n5.InterfaceC17490g
    /* JADX INFO: renamed from: a */
    public final InterfaceC17491h mo19195a(C18638m c18638m, C20835m c20835m, C16826m c16826m) {
        long jMo1346Q;
        boolean zM18089b = AbstractC16544l.m18089b(c18638m.f59377b, "image/svg+xml");
        AbstractC17497n abstractC17497n = c18638m.f59376a;
        if (!zM18089b) {
            InterfaceC0677k interfaceC0677kMo19197O0 = abstractC17497n.mo19197O0();
            if (!interfaceC0677kMo19197O0.mo1361p0(0L, AbstractC17501r.f55979b)) {
                return null;
            }
            C0678l c0678l = AbstractC17501r.f55978a;
            byte[] bArr = c0678l.f1972Y;
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte b = bArr[0];
            long length = 1024 - ((long) bArr.length);
            long j10 = 0;
            while (true) {
                if (j10 >= length) {
                    jMo1346Q = -1;
                    break;
                }
                jMo1346Q = interfaceC0677kMo19197O0.mo1346Q(b, j10, length);
                if (jMo1346Q == -1 || interfaceC0677kMo19197O0.mo1361p0(jMo1346Q, c0678l)) {
                    break;
                }
                j10 = 1 + jMo1346Q;
            }
            if (jMo1346Q == -1) {
                return null;
            }
        }
        return new C17503t(abstractC17497n, c20835m, this.f55980a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17502s) {
            if (this.f55980a == ((C17502s) obj).f55980a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55980a ? 1231 : 1237;
    }
}
