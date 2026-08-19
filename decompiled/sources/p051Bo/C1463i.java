package p051Bo;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p026Ao.C0657F;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Bo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1463i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3862Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0657F f3863Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f3864o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f3865p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16525B f3866q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463i(C0657F c0657f, C16525B c16525b, C16525B c16525b2, C16525B c16525b3) {
        super(2);
        this.f3863Z = c0657f;
        this.f3864o0 = c16525b;
        this.f3865p0 = c16525b2;
        this.f3866q0 = c16525b3;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f3862Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 1) {
                    C16525B c16525b = this.f3864o0;
                    if (c16525b.f51262Y != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C0657F c0657f = this.f3863Z;
                    c16525b.f51262Y = Long.valueOf(c0657f.m1340E());
                    this.f3865p0.f51262Y = Long.valueOf(c0657f.m1340E());
                    this.f3866q0.f51262Y = Long.valueOf(c0657f.m1340E());
                }
                return C17296C.f55119a;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long jLongValue2 = ((Number) obj2).longValue();
                if (iIntValue2 == 21589) {
                    if (jLongValue2 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C0657F c0657f2 = this.f3863Z;
                    byte b = c0657f2.readByte();
                    boolean z6 = (b & 1) == 1;
                    boolean z10 = (b & 2) == 2;
                    boolean z11 = (b & 4) == 4;
                    long j10 = z6 ? 5L : 1L;
                    if (z10) {
                        j10 += 4;
                    }
                    if (z11) {
                        j10 += 4;
                    }
                    if (jLongValue2 < j10) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z6) {
                        this.f3864o0.f51262Y = Integer.valueOf(c0657f2.m1360m());
                    }
                    if (z10) {
                        this.f3865p0.f51262Y = Integer.valueOf(c0657f2.m1360m());
                    }
                    if (z11) {
                        this.f3866q0.f51262Y = Integer.valueOf(c0657f2.m1360m());
                    }
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463i(C16525B c16525b, C0657F c0657f, C16525B c16525b2, C16525B c16525b3) {
        super(2);
        this.f3864o0 = c16525b;
        this.f3863Z = c0657f;
        this.f3865p0 = c16525b2;
        this.f3866q0 = c16525b3;
    }
}
