package p003A1;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p349O0.C6021p;

/* JADX INFO: renamed from: A1.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0198Q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C0198Q f736Z = new C0198Q(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0198Q f737o0 = new C0198Q(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0198Q f738p0 = new C0198Q(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0198Q f739q0 = new C0198Q(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f740Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0198Q(int i10, int i11) {
        super(i10);
        this.f740Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f740Y) {
            case 0:
                C2968o c2968o = (C2968o) obj2;
                C2963j c2963j = ((C2968o) obj).f8889d;
                C2974u c2974u = C2971r.f8928n;
                Object objValueOf = c2963j.f8880Y.get(c2974u);
                if (objValueOf == null) {
                    objValueOf = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objValueOf).floatValue();
                Object objValueOf2 = c2968o.f8889d.f8880Y.get(c2974u);
                if (objValueOf2 == null) {
                    objValueOf2 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf2).floatValue()));
            case 1:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                return C17296C.f55119a;
            case 2:
                ((InterfaceC0193O0) obj).mo581I((Matrix) obj2);
                return C17296C.f55119a;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return C17296C.f55119a;
        }
    }
}
