package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: z0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C21598V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68408Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f68409Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f68410o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21598V(int i10, int i11, int i12) {
        super(1);
        this.f68408Y = i12;
        this.f68409Z = i10;
        this.f68410o0 = i11;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac A[SYNTHETIC] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int length;
        int i10;
        int i11;
        C21593P c21593p;
        char cCharAt;
        switch (this.f68408Y) {
            case 0:
                C21577C c21577c = (C21577C) obj;
                int i12 = this.f68409Z;
                int i13 = this.f68410o0;
                if (i12 < 0 || i13 < 0) {
                    throw new IllegalArgumentException(AbstractC0168G.m532u("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i12, " and ", i13, " respectively.").toString());
                }
                int i14 = c21577c.f68327d;
                int length2 = i14 + i13;
                int i15 = (i13 ^ length2) & (i14 ^ length2);
                C21593P c21593p2 = c21577c.f68324a;
                if (i15 < 0) {
                    length2 = c21593p2.length();
                }
                c21577c.m21855c(c21577c.f68327d, Math.min(length2, c21593p2.length()));
                int i16 = c21577c.f68326c;
                int i17 = i16 - i12;
                if (((i12 ^ i16) & (i16 ^ i17)) < 0) {
                    i17 = 0;
                }
                c21577c.m21855c(Math.max(0, i17), c21577c.f68326c);
                return C17296C.f55119a;
            case 1:
                C21577C c21577c2 = (C21577C) obj;
                int i18 = this.f68409Z;
                int i19 = this.f68410o0;
                if (i18 < 0 || i19 < 0) {
                    throw new IllegalArgumentException(AbstractC0168G.m532u("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i18, " and ", i19, " respectively.").toString());
                }
                int i20 = 0;
                for (int i21 = 0; i21 < i18; i21++) {
                    int i22 = i20 + 1;
                    int i23 = c21577c2.f68326c;
                    if (i23 <= i22) {
                        i20 = i23;
                        length = 0;
                        for (int i24 = 0; i24 < i19; i24++) {
                            i10 = length + 1;
                            i11 = c21577c2.f68327d + i10;
                            c21593p = c21577c2.f68324a;
                            if (i11 < c21593p.length()) {
                                length = c21593p.length() - c21577c2.f68327d;
                                int i25 = c21577c2.f68327d;
                                c21577c2.m21855c(i25, length + i25);
                                int i26 = c21577c2.f68326c;
                                c21577c2.m21855c(i26 - i20, i26);
                                return C17296C.f55119a;
                            }
                            cCharAt = c21593p.charAt((c21577c2.f68327d + i10) - 1);
                            char cCharAt2 = c21593p.charAt(c21577c2.f68327d + i10);
                            if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                length = i10;
                            } else {
                                length += 2;
                            }
                        }
                        int i27 = c21577c2.f68327d;
                        c21577c2.m21855c(i27, length + i27);
                        int i28 = c21577c2.f68326c;
                        c21577c2.m21855c(i28 - i20, i28);
                        return C17296C.f55119a;
                    }
                    C21593P c21593p3 = c21577c2.f68324a;
                    i20 = (Character.isHighSurrogate(c21593p3.charAt((i23 - i22) + (-1))) && Character.isLowSurrogate(c21593p3.charAt(c21577c2.f68326c - i22))) ? i20 + 2 : i22;
                }
                length = 0;
                while (i24 < i19) {
                    i10 = length + 1;
                    i11 = c21577c2.f68327d + i10;
                    c21593p = c21577c2.f68324a;
                    if (i11 < c21593p.length()) {
                        length = c21593p.length() - c21577c2.f68327d;
                        int i29 = c21577c2.f68327d;
                        c21577c2.m21855c(i29, length + i29);
                        int i210 = c21577c2.f68326c;
                        c21577c2.m21855c(i210 - i20, i210);
                        return C17296C.f55119a;
                    }
                    cCharAt = c21593p.charAt((c21577c2.f68327d + i10) - 1);
                    char cCharAt3 = c21593p.charAt(c21577c2.f68327d + i10);
                    if (Character.isHighSurrogate(cCharAt)) {
                        length = i10;
                    } else {
                        length = i10;
                    }
                }
                int i211 = c21577c2.f68327d;
                c21577c2.m21855c(i211, length + i211);
                int i212 = c21577c2.f68326c;
                c21577c2.m21855c(i212 - i20, i212);
                return C17296C.f55119a;
            case 2:
                C21577C c21577c3 = (C21577C) obj;
                if (c21577c3.f68329f != -1) {
                    c21577c3.m21854b();
                }
                C21593P c21593p4 = c21577c3.f68324a;
                int iM8921l = AbstractC8301I.m8921l(this.f68409Z, 0, c21593p4.length());
                int iM8921l2 = AbstractC8301I.m8921l(this.f68410o0, 0, c21593p4.length());
                if (iM8921l != iM8921l2) {
                    if (iM8921l < iM8921l2) {
                        c21577c3.m21859g(iM8921l, iM8921l2);
                    } else {
                        c21577c3.m21859g(iM8921l2, iM8921l);
                    }
                }
                return C17296C.f55119a;
            default:
                ((C21577C) obj).m21860h(this.f68409Z, this.f68410o0);
                return C17296C.f55119a;
        }
    }
}
