package p523V9;

import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9393x3;
import p775h2.AbstractC14376f;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: V9.D0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7865D0 {
    /* JADX INFO: renamed from: a */
    public static long m8145a(boolean z6, int i10, int i11, long j10, long j11, int i12, boolean z10, long j12, long j13, long j14, long j15) {
        AbstractC14376f.m15825D(i11, "backoffPolicy");
        if (j15 != Long.MAX_VALUE && z10) {
            return i12 == 0 ? j15 : AbstractC8301I.m8916g(j15, 900000 + j11);
        }
        if (z6) {
            return AbstractC8301I.m8918i(i11 == 2 ? ((long) i10) * j10 : (long) Math.scalb(j10, i10 - 1), 18000000L) + j11;
        }
        if (z10) {
            long j16 = i12 == 0 ? j11 + j12 : j11 + j14;
            return (j13 == j14 || i12 != 0) ? j16 : (j14 - j13) + j16;
        }
        if (j11 == -1) {
            return Long.MAX_VALUE;
        }
        return j11 + j12;
    }

    /* JADX INFO: renamed from: b */
    public static final String m8146b(InterfaceC19455e interfaceC19455e) {
        AbstractC16544l.m18094g(interfaceC19455e, suYVq.DgSTN);
        if (interfaceC19455e.mo20558B0(AbstractC9393x3.m9974d("__typename")) != 0) {
            throw new IllegalStateException("__typename not found");
        }
        String strMo20582x = interfaceC19455e.mo20582x();
        if (strMo20582x != null) {
            return strMo20582x;
        }
        throw new IllegalStateException("__typename is null");
    }
}
