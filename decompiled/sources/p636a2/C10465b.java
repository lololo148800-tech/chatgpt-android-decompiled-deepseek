package p636a2;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;
import p492U1.EnumC7546k;
import p716e2.C13265b;

/* JADX INFO: renamed from: a2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10465b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C10465b f30986Z = new C10465b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10465b f30987o0 = new C10465b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10465b f30988p0 = new C10465b(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10465b f30989q0 = new C10465b(3, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30990Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10465b(int i10, int i11) {
        super(i10);
        this.f30990Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object other, Object obj2) {
        switch (this.f30990Y) {
            case 0:
                C13265b arrayOf = (C13265b) obj;
                EnumC7546k layoutDirection = (EnumC7546k) obj2;
                AbstractC16544l.m18094g(arrayOf, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
                C10466c.m10936a(arrayOf, layoutDirection);
                arrayOf.f41897O = 1;
                arrayOf.f41916s = other;
                return arrayOf;
            case 1:
                C13265b arrayOf2 = (C13265b) obj;
                EnumC7546k layoutDirection2 = (EnumC7546k) obj2;
                AbstractC16544l.m18094g(arrayOf2, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                AbstractC16544l.m18094g(layoutDirection2, "layoutDirection");
                C10466c.m10936a(arrayOf2, layoutDirection2);
                arrayOf2.f41897O = 2;
                arrayOf2.f41917t = other;
                return arrayOf2;
            case 2:
                C13265b arrayOf3 = (C13265b) obj;
                EnumC7546k layoutDirection3 = (EnumC7546k) obj2;
                AbstractC16544l.m18094g(arrayOf3, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                AbstractC16544l.m18094g(layoutDirection3, "layoutDirection");
                C10466c.m10937b(arrayOf3, layoutDirection3);
                arrayOf3.f41897O = 3;
                arrayOf3.f41918u = other;
                return arrayOf3;
            default:
                C13265b arrayOf4 = (C13265b) obj;
                EnumC7546k layoutDirection4 = (EnumC7546k) obj2;
                AbstractC16544l.m18094g(arrayOf4, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                AbstractC16544l.m18094g(layoutDirection4, "layoutDirection");
                C10466c.m10937b(arrayOf4, layoutDirection4);
                arrayOf4.f41897O = 4;
                arrayOf4.f41919v = other;
                return arrayOf4;
        }
    }
}
