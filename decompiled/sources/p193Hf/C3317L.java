package p193Hf;

import bo.C11519g;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1155zi.C22011h0;
import p926of.InterfaceC18159W;

/* JADX INFO: renamed from: Hf.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3317L extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10119Y;

    /* JADX INFO: renamed from: Z */
    public static final C3317L f10106Z = new C3317L(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3317L f10107o0 = new C3317L(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3317L f10108p0 = new C3317L(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3317L f10109q0 = new C3317L(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C3317L f10110r0 = new C3317L(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C3317L f10111s0 = new C3317L(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C3317L f10112t0 = new C3317L(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C3317L f10113u0 = new C3317L(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C3317L f10114v0 = new C3317L(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C3317L f10115w0 = new C3317L(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C3317L f10116x0 = new C3317L(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C3317L f10117y0 = new C3317L(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C3317L f10118z0 = new C3317L(1, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C3317L f10102A0 = new C3317L(1, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C3317L f10103B0 = new C3317L(1, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C3317L f10104C0 = new C3317L(1, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C3317L f10105D0 = new C3317L(1, 16);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3317L(int i10, int i11) {
        super(i10);
        this.f10119Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f10119Y) {
            case 0:
                AbstractC16544l.m18094g((InterfaceC18159W) obj, "it");
                return C17296C.f55119a;
            case 1:
                return Integer.valueOf(((Number) obj).intValue());
            case 2:
                return Integer.valueOf(((Number) obj).intValue());
            case 3:
                C3420z0 it = (C3420z0) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f10420e.f68132a;
            case 4:
                C3420z0 it2 = (C3420z0) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.f10426k);
            case 5:
                C3420z0 it3 = (C3420z0) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(it3.f10427l);
            case 6:
                C3420z0 it4 = (C3420z0) obj;
                AbstractC16544l.m18094g(it4, "it");
                return it4.f10420e.f68133b;
            case 7:
                C3420z0 it5 = (C3420z0) obj;
                AbstractC16544l.m18094g(it5, "it");
                return Boolean.valueOf(it5.f10419d);
            case 8:
                C11519g Json = (C11519g) obj;
                AbstractC16544l.m18094g(Json, "$this$Json");
                Json.f34861k = null;
                return C17296C.f55119a;
            case 9:
                AbstractC16544l.m18094g((Throwable) obj, "it");
                return C17296C.f55119a;
            case 10:
                AbstractC16544l.m18094g((AbstractC3409v) obj, "it");
                return C17296C.f55119a;
            case 11:
                AbstractC16544l.m18094g((AbstractC3409v) obj, "it");
                return C17296C.f55119a;
            case 12:
                AbstractC16544l.m18094g((Throwable) obj, "it");
                return C17296C.f55119a;
            case 13:
                C3324O0 view = (C3324O0) obj;
                AbstractC16544l.m18094g(view, "view");
                view.setOnMessage(f10117y0);
                view.setOnFailure(f10118z0);
                return C17296C.f55119a;
            case 14:
                C3420z0 it6 = (C3420z0) obj;
                AbstractC16544l.m18094g(it6, "it");
                return new C22011h0(it6.f10417b);
            case 15:
                C3420z0 it7 = (C3420z0) obj;
                AbstractC16544l.m18094g(it7, "it");
                return it7.f10421f;
            default:
                C3420z0 it8 = (C3420z0) obj;
                AbstractC16544l.m18094g(it8, "it");
                return it8.f10425j;
        }
    }
}
