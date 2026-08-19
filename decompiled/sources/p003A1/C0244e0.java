package p003A1;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1426a;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p523V9.AbstractC8143m5;

/* JADX INFO: renamed from: A1.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244e0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f935Y;

    /* JADX INFO: renamed from: Z */
    public static final C0244e0 f922Z = new C0244e0(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0244e0 f923o0 = new C0244e0(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0244e0 f924p0 = new C0244e0(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0244e0 f925q0 = new C0244e0(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C0244e0 f926r0 = new C0244e0(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C0244e0 f927s0 = new C0244e0(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C0244e0 f928t0 = new C0244e0(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C0244e0 f929u0 = new C0244e0(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C0244e0 f930v0 = new C0244e0(0, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C0244e0 f931w0 = new C0244e0(0, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C0244e0 f932x0 = new C0244e0(0, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C0244e0 f933y0 = new C0244e0(0, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C0244e0 f934z0 = new C0244e0(0, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C0244e0 f906A0 = new C0244e0(0, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C0244e0 f907B0 = new C0244e0(0, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C0244e0 f908C0 = new C0244e0(0, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C0244e0 f909D0 = new C0244e0(0, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C0244e0 f910E0 = new C0244e0(0, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C0244e0 f911F0 = new C0244e0(0, 18);

    /* JADX INFO: renamed from: G0 */
    public static final C0244e0 f912G0 = new C0244e0(0, 19);

    /* JADX INFO: renamed from: H0 */
    public static final C0244e0 f913H0 = new C0244e0(0, 20);

    /* JADX INFO: renamed from: I0 */
    public static final C0244e0 f914I0 = new C0244e0(0, 21);

    /* JADX INFO: renamed from: J0 */
    public static final C0244e0 f915J0 = new C0244e0(0, 22);

    /* JADX INFO: renamed from: K0 */
    public static final C0244e0 f916K0 = new C0244e0(0, 23);

    /* JADX INFO: renamed from: L0 */
    public static final C0244e0 f917L0 = new C0244e0(0, 24);

    /* JADX INFO: renamed from: M0 */
    public static final C0244e0 f918M0 = new C0244e0(0, 25);

    /* JADX INFO: renamed from: N0 */
    public static final C0244e0 f919N0 = new C0244e0(0, 26);

    /* JADX INFO: renamed from: O0 */
    public static final C0244e0 f920O0 = new C0244e0(0, 27);

    /* JADX INFO: renamed from: P0 */
    public static final C0244e0 f921P0 = new C0244e0(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0244e0(int i10, int i11) {
        super(i10);
        this.f935Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f935Y) {
            case 0:
                AndroidCompositionLocals_androidKt.m11354b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.m11354b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.m11354b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.m11354b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.m11354b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.m11354b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C3516e c3516e = AbstractC0593T.f1824a;
                    choreographer = (Choreographer) AbstractC0575H.m1161I(AbstractC2935m.f8797a, new C0281q0(2, null));
                }
                C0290t0 c0290t0 = new C0290t0(choreographer, AbstractC8143m5.m8678a(Looper.getMainLooper()));
                return c0290t0.plus(c0290t0.f1053w0);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC0187M0.m569b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC0187M0.m569b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC0187M0.m569b("LocalDensity");
                throw null;
            case 12:
                AbstractC0187M0.m569b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC0187M0.m569b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC0187M0.m569b("LocalFontLoader");
                throw null;
            case 15:
                AbstractC0187M0.m569b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC0187M0.m569b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC0187M0.m569b("LocalInputManager");
                throw null;
            case 18:
                AbstractC0187M0.m569b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC0187M0.m569b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC0187M0.m569b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC0187M0.m569b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC0187M0.m569b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
