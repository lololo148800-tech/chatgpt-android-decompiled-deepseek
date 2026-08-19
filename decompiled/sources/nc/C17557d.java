package nc;

import android.content.Context;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p923oc.C18037A;
import p923oc.C18038B;
import p923oc.C18040D;
import p923oc.C18042F;
import p923oc.C18063s;
import p923oc.C18064t;

/* JADX INFO: renamed from: nc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17557d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C17557d f56166Z = new C17557d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17557d f56167o0 = new C17557d(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C17557d f56168p0 = new C17557d(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C17557d f56169q0 = new C17557d(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C17557d f56170r0 = new C17557d(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C17557d f56171s0 = new C17557d(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C17557d f56172t0 = new C17557d(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C17557d f56173u0 = new C17557d(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C17557d f56174v0 = new C17557d(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C17557d f56175w0 = new C17557d(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C17557d f56176x0 = new C17557d(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C17557d f56177y0 = new C17557d(1, 11);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56178Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17557d(int i10, int i11) {
        super(i10);
        this.f56178Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f56178Y) {
            case 0:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, "context");
                return new TextView(context);
            case 1:
                C18064t it = (C18064t) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(it.f57620a instanceof C18063s);
            case 2:
                C2963j semantics = (C2963j) obj;
                AbstractC16544l.m18094g(semantics, "$this$semantics");
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8922h;
                C17296C c17296c = C17296C.f55119a;
                semantics.m3787m(c2974u, c17296c);
                return c17296c;
            case 3:
                InterfaceC7537b $receiver = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g($receiver, "$this$$receiver");
                float f10 = 128;
                return new C7545j(AbstractC9113C4.m9643a($receiver.mo7866k0(f10), $receiver.mo7866k0(f10)));
            case 4:
                C18064t it2 = (C18064t) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.f57620a instanceof C18040D);
            case 5:
                C18064t it3 = (C18064t) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(it3.f57620a instanceof C18042F);
            case 6:
                C18064t it4 = (C18064t) obj;
                AbstractC16544l.m18094g(it4, "it");
                return Boolean.valueOf(it4.f57620a instanceof C18038B);
            case 7:
                C18064t it5 = (C18064t) obj;
                AbstractC16544l.m18094g(it5, "it");
                return Boolean.valueOf(it5.f57620a instanceof C18038B);
            case 8:
                C18064t it6 = (C18064t) obj;
                AbstractC16544l.m18094g(it6, "it");
                return Boolean.valueOf(it6.f57620a instanceof C18037A);
            case 9:
                C18064t it7 = (C18064t) obj;
                AbstractC16544l.m18094g(it7, "it");
                return Boolean.valueOf(it7.f57620a instanceof C18042F);
            case 10:
                C18064t it8 = (C18064t) obj;
                AbstractC16544l.m18094g(it8, "it");
                return it8.f57621b.f57626e;
            default:
                C18064t it9 = (C18064t) obj;
                AbstractC16544l.m18094g(it9, "it");
                return it9.f57621b.f57625d;
        }
    }
}
