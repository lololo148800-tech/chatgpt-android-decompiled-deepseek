package p072Ci;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Ci.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1700e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C1700e f4838Z = new C1700e(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1700e f4839o0 = new C1700e(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1700e f4840p0 = new C1700e(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1700e f4841q0 = new C1700e(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C1700e f4842r0 = new C1700e(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C1700e f4843s0 = new C1700e(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C1700e f4844t0 = new C1700e(2, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4845Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1700e(int i10, int i11) {
        super(i10);
        this.f4845Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4845Y) {
            case 0:
                C1705j settings = (C1705j) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings, "settings");
                return C1705j.m2512a(settings, false, null, false, false, false, false, false, false, zBooleanValue, false, false, false, false, false, null, false, false, false, false, 2096127);
            case 1:
                C1705j settings2 = (C1705j) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings2, "settings");
                return C1705j.m2512a(settings2, false, null, false, false, false, false, false, false, false, false, zBooleanValue2, false, false, false, null, false, false, false, false, 2093055);
            case 2:
                C1705j settings3 = (C1705j) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings3, "settings");
                return C1705j.m2512a(settings3, false, null, false, false, false, false, false, false, false, false, false, false, false, false, null, false, zBooleanValue3, false, false, 1835007);
            case 3:
                C1705j settings4 = (C1705j) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings4, "settings");
                return C1705j.m2512a(settings4, false, null, false, false, zBooleanValue4, false, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097087);
            case 4:
                C1705j settings5 = (C1705j) obj;
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings5, "settings");
                return C1705j.m2512a(settings5, false, null, false, false, false, zBooleanValue5, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097023);
            case 5:
                C1705j settings6 = (C1705j) obj;
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings6, "settings");
                return C1705j.m2512a(settings6, false, null, false, false, false, false, zBooleanValue6, false, false, false, false, false, false, false, null, false, false, false, false, 2096895);
            default:
                C1705j settings7 = (C1705j) obj;
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(settings7, "settings");
                return C1705j.m2512a(settings7, false, null, false, false, false, false, false, zBooleanValue7, false, false, false, false, false, false, null, false, false, false, false, 2096639);
        }
    }
}
