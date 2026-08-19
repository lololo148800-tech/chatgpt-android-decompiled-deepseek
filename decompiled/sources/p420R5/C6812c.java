package p420R5;

import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p111E5.InterfaceC2326j;
import p111E5.InterfaceC2327k;
import p160G5.C3003i;
import p374P5.C6361n;

/* JADX INFO: renamed from: R5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6812c implements InterfaceC2326j {

    /* JADX INFO: renamed from: a */
    public final boolean f21854a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f21855b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f21856c = false;

    @Override // p111E5.InterfaceC2326j
    /* JADX INFO: renamed from: a */
    public final InterfaceC2327k mo3427a(C3003i c3003i, C6361n c6361n) {
        long jMo1346Q;
        if (!AbstractC16544l.m18089b(c3003i.f9029b, "image/svg+xml")) {
            InterfaceC0677k interfaceC0677kMo3429O0 = c3003i.f9028a.mo3429O0();
            if (!interfaceC0677kMo3429O0.mo1361p0(0L, AbstractC6810a.f21852b)) {
                return null;
            }
            C0678l c0678l = AbstractC6810a.f21851a;
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
                jMo1346Q = interfaceC0677kMo3429O0.mo1346Q(b, j10, length);
                if (jMo1346Q == -1 || interfaceC0677kMo3429O0.mo1361p0(jMo1346Q, c0678l)) {
                    break;
                }
                j10 = 1 + jMo1346Q;
            }
            if (jMo1346Q == -1) {
                return null;
            }
        }
        return new C6813d(c3003i.f9028a, c6361n, this.f21854a, this.f21855b, this.f21856c);
    }
}
