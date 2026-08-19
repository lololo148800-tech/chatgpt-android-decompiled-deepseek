package p072Ci;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Ci.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C1701f f4846Z = new C1701f(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1701f f4847o0 = new C1701f(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1701f f4848p0 = new C1701f(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1701f f4849q0 = new C1701f(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C1701f f4850r0 = new C1701f(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C1701f f4851s0 = new C1701f(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C1701f f4852t0 = new C1701f(1, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4853Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1701f(int i10, int i11) {
        super(i10);
        this.f4853Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f4853Y) {
            case 0:
                C1705j settings = (C1705j) obj;
                AbstractC16544l.m18094g(settings, "settings");
                return Boolean.valueOf(settings.f4880m);
            case 1:
                C1705j settings2 = (C1705j) obj;
                AbstractC16544l.m18094g(settings2, "settings");
                return Boolean.valueOf(settings2.f4886s);
            case 2:
                C1705j settings3 = (C1705j) obj;
                AbstractC16544l.m18094g(settings3, "settings");
                return Boolean.valueOf(settings3.f4874g);
            case 3:
                C1705j settings4 = (C1705j) obj;
                AbstractC16544l.m18094g(settings4, "settings");
                return Boolean.valueOf(settings4.f4875h);
            case 4:
                C1705j settings5 = (C1705j) obj;
                AbstractC16544l.m18094g(settings5, "settings");
                return Boolean.valueOf(settings5.f4876i);
            case 5:
                C1705j settings6 = (C1705j) obj;
                AbstractC16544l.m18094g(settings6, "settings");
                return Boolean.valueOf(settings6.f4877j);
            default:
                C1705j settings7 = (C1705j) obj;
                AbstractC16544l.m18094g(settings7, "settings");
                return Boolean.valueOf(settings7.f4878k);
        }
    }
}
