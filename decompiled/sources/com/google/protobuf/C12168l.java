package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.l */
/* JADX INFO: loaded from: classes3.dex */
public class C12168l extends AbstractC12171m {

    /* JADX INFO: renamed from: p0 */
    public final byte[] f37046p0;

    public C12168l(byte[] bArr) {
        this.f37049Y = 0;
        bArr.getClass();
        this.f37046p0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12171m) || size() != ((AbstractC12171m) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C12168l)) {
            return obj.equals(this);
        }
        C12168l c12168l = (C12168l) obj;
        int i10 = this.f37049Y;
        int i11 = c12168l.f37049Y;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c12168l.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c12168l.size()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(size, "Ran off end of other: 0, ", ", ");
            sbM11057o.append(c12168l.size());
            throw new IllegalArgumentException(sbM11057o.toString());
        }
        int iMo14002y = mo14002y() + size;
        int iMo14002y2 = mo14002y();
        int iMo14002y3 = c12168l.mo14002y();
        while (iMo14002y2 < iMo14002y) {
            if (this.f37046p0[iMo14002y2] != c12168l.f37046p0[iMo14002y3]) {
                return false;
            }
            iMo14002y2++;
            iMo14002y3++;
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: f */
    public byte mo13999f(int i10) {
        return this.f37046p0[i10];
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: p */
    public void mo14000p(int i10, byte[] bArr) {
        System.arraycopy(this.f37046p0, 0, bArr, 0, i10);
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: q */
    public byte mo14001q(int i10) {
        return this.f37046p0[i10];
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: r */
    public final boolean mo14003r() {
        int iMo14002y = mo14002y();
        return AbstractC12077B1.f36870a.mo13994X(this.f37046p0, iMo14002y, size() + iMo14002y) == 0;
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: s */
    public final AbstractC12186r mo14004s() {
        return AbstractC12186r.m14086h(this.f37046p0, mo14002y(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC12171m
    public int size() {
        return this.f37046p0.length;
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: t */
    public final int mo14005t(int i10, int i11) {
        int iMo14002y = mo14002y();
        Charset charset = AbstractC12175n0.f37050a;
        for (int i12 = iMo14002y; i12 < iMo14002y + i11; i12++) {
            i10 = (i10 * 31) + this.f37046p0[i12];
        }
        return i10;
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: u */
    public final AbstractC12171m mo14006u(int i10) {
        int iM14009i = AbstractC12171m.m14009i(0, i10, size());
        if (iM14009i == 0) {
            return AbstractC12171m.f37047Z;
        }
        return new C12165k(this.f37046p0, mo14002y(), iM14009i);
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: v */
    public final String mo14007v(Charset charset) {
        return new String(this.f37046p0, mo14002y(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: x */
    public final void mo14008x(AbstractC12195u abstractC12195u) {
        abstractC12195u.mo13995a0(this.f37046p0, mo14002y(), size());
    }

    /* JADX INFO: renamed from: y */
    public int mo14002y() {
        return 0;
    }
}
