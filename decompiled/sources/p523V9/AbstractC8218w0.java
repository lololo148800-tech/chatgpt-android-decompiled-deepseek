package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11106o;
import androidx.lifecycle.C11107p;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p1000s0.C19414j;
import p1000s0.C19426v;
import p1113xn.C21307a;
import p1134ym.AbstractC21553d;
import p1134ym.C21552c;
import p1134ym.EnumC21551b;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p492U1.EnumC7546k;
import p571X9.AbstractC9381v3;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p860l0.EnumC16673F0;
import p911o0.AbstractC17792x;
import p953q0.C18558P;

/* JADX INFO: renamed from: V9.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8218w0 {
    /* JADX INFO: renamed from: a */
    public static final String m8846a(int i10) {
        int i11;
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        C21552c.f68250c.getClass();
        C21552c c21552c = C21552c.f68252e;
        c21552c.getClass();
        AbstractC9381v3.m9953a(0, i10, i10);
        int iM21830b = c21552c.m21830b(i10);
        byte[] bArr2 = new byte[iM21830b];
        AbstractC9381v3.m9953a(0, i10, i10);
        int iM21830b2 = c21552c.m21830b(i10);
        if (iM21830b < 0) {
            throw new IndexOutOfBoundsException(AbstractC10763a.m11048f(iM21830b, "destination offset: 0, destination size: "));
        }
        if (iM21830b2 < 0 || iM21830b2 > iM21830b) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("The destination array does not have enough capacity, destination offset: 0, destination size: ", iM21830b, iM21830b2, ", capacity needed: "));
        }
        byte[] bArr3 = c21552c.f68254a ? AbstractC21553d.f68258c : AbstractC21553d.f68256a;
        int i12 = c21552c.f68255b ? 19 : Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i11 = i13 + 2;
            if (i11 >= i10) {
                break;
            }
            int iMin = Math.min((i10 - i13) / 3, i12);
            for (int i15 = 0; i15 < iMin; i15++) {
                int i16 = bArr[i13] & 255;
                int i17 = i13 + 2;
                int i18 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i19 = (i18 << 8) | (i16 << 16) | (bArr[i17] & 255);
                bArr2[i14] = bArr3[i19 >>> 18];
                bArr2[i14 + 1] = bArr3[(i19 >>> 12) & 63];
                int i20 = i14 + 3;
                bArr2[i14 + 2] = bArr3[(i19 >>> 6) & 63];
                i14 += 4;
                bArr2[i20] = bArr3[i19 & 63];
            }
            if (iMin == i12 && i13 != i10) {
                int i21 = i14 + 1;
                byte[] bArr4 = C21552c.f68251d;
                bArr2[i14] = bArr4[0];
                i14 += 2;
                bArr2[i21] = bArr4[1];
            }
        }
        int i22 = i10 - i13;
        if (i22 == 1) {
            int i23 = (bArr[i13] & 255) << 4;
            bArr2[i14] = bArr3[i23 >>> 6];
            bArr2[1 + i14] = bArr3[i23 & 63];
            EnumC21551b[] enumC21551bArr = EnumC21551b.f68249Y;
            bArr2[2 + i14] = 61;
            bArr2[i14 + 3] = 61;
            i13++;
        } else if (i22 == 2) {
            int i24 = ((bArr[i13 + 1] & 255) << 2) | ((bArr[i13] & 255) << 10);
            bArr2[i14] = bArr3[i24 >>> 12];
            bArr2[1 + i14] = bArr3[(i24 >>> 6) & 63];
            bArr2[2 + i14] = bArr3[i24 & 63];
            EnumC21551b[] enumC21551bArr2 = EnumC21551b.f68249Y;
            bArr2[i14 + 3] = 61;
            i13 = i11;
        }
        if (i13 == i10) {
            return new String(bArr2, C21307a.f67721b);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: b */
    public static final C19414j m8847b(C18558P c18558p, int i10, long j10, C19426v c19426v, long j11, EnumC16673F0 enumC16673F0, InterfaceC10445c interfaceC10445c, C10450h c10450h, EnumC7546k enumC7546k, boolean z6, int i11) {
        return new C19414j(i10, i11, c18558p.m19938a(i10, j10), j11, c19426v.mo5912c(i10), enumC16673F0, interfaceC10445c, c10450h, enumC7546k, z6);
    }

    /* JADX INFO: renamed from: c */
    public static final C11107p m8848c(AbstractC11105n abstractC11105n) {
        AbstractC16544l.m18094g(abstractC11105n, "<this>");
        while (true) {
            AtomicReference atomicReference = abstractC11105n.f33480a;
            C11107p c11107p = (C11107p) atomicReference.get();
            if (c11107p != null) {
                return c11107p;
            }
            C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
            C3516e c3516e = AbstractC0593T.f1824a;
            C11107p c11107p2 = new C11107p(abstractC11105n, AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a.f3819q0));
            do {
                if (atomicReference.compareAndSet(null, c11107p2)) {
                    C3516e c3516e2 = AbstractC0593T.f1824a;
                    AbstractC0575H.m1156D(c11107p2, AbstractC2935m.f8797a.f3819q0, null, new C11106o(c11107p2, null), 2);
                    return c11107p2;
                }
            } while (atomicReference.get() == null);
        }
    }
}
