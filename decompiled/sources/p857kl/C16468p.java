package p857kl;

import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8639g4;

/* JADX INFO: renamed from: kl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C16468p implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51105Y;

    /* JADX INFO: renamed from: Z */
    public static final C16468p f51092Z = new C16468p(0);

    /* JADX INFO: renamed from: o0 */
    public static final C16468p f51093o0 = new C16468p(1);

    /* JADX INFO: renamed from: p0 */
    public static final C16468p f51094p0 = new C16468p(2);

    /* JADX INFO: renamed from: q0 */
    public static final C16468p f51095q0 = new C16468p(3);

    /* JADX INFO: renamed from: r0 */
    public static final C16468p f51096r0 = new C16468p(4);

    /* JADX INFO: renamed from: s0 */
    public static final C16468p f51097s0 = new C16468p(5);

    /* JADX INFO: renamed from: t0 */
    public static final C16468p f51098t0 = new C16468p(6);

    /* JADX INFO: renamed from: u0 */
    public static final C16468p f51099u0 = new C16468p(7);

    /* JADX INFO: renamed from: v0 */
    public static final C16468p f51100v0 = new C16468p(8);

    /* JADX INFO: renamed from: w0 */
    public static final C16468p f51101w0 = new C16468p(9);

    /* JADX INFO: renamed from: x0 */
    public static final C16468p f51102x0 = new C16468p(10);

    /* JADX INFO: renamed from: y0 */
    public static final C16468p f51103y0 = new C16468p(11);

    /* JADX INFO: renamed from: z0 */
    public static final C16468p f51104z0 = new C16468p(12);

    /* JADX INFO: renamed from: A0 */
    public static final C16468p f51087A0 = new C16468p(13);

    /* JADX INFO: renamed from: B0 */
    public static final C16468p f51088B0 = new C16468p(14);

    /* JADX INFO: renamed from: C0 */
    public static final C16468p f51089C0 = new C16468p(15);

    /* JADX INFO: renamed from: D0 */
    public static final C16468p f51090D0 = new C16468p(16);

    /* JADX INFO: renamed from: E0 */
    public static final C16468p f51091E0 = new C16468p(17);

    public /* synthetic */ C16468p(int i10) {
        this.f51105Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f51105Y) {
            case 0:
                return Boolean.valueOf(AbstractC8639g4.m9301e(((Character) obj).charValue()));
            case 1:
                char cCharValue = ((Character) obj).charValue();
                boolean z6 = false;
                if (cCharValue >= 0 && cCharValue < 256) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 2:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 3:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 4:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 6:
                return Boolean.valueOf(AbstractC8639g4.m9301e(((Character) obj).charValue()));
            case 7:
                char cCharValue2 = ((Character) obj).charValue();
                boolean z10 = false;
                if (cCharValue2 >= 0 && cCharValue2 < 256) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 8:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 9:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 10:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 11:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 12:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 13:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            case 14:
                return Boolean.valueOf(AbstractC8639g4.m9301e(((Character) obj).charValue()));
            case 15:
                char cCharValue3 = ((Character) obj).charValue();
                boolean z11 = false;
                if (cCharValue3 >= 0 && cCharValue3 < 256) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 16:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
            default:
                return Boolean.valueOf(AbstractC8639g4.m9299c(((Character) obj).charValue()));
        }
    }
}
