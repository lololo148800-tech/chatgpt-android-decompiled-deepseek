package p463Sn;

import ao.C11135I;
import ao.C11141O;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p606Yn.C10100a;
import p909nm.C17689w;

/* JADX INFO: renamed from: Sn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7153f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7153f f22746Z = new C7153f(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7153f f22747o0 = new C7153f(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7153f f22748p0 = new C7153f(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22749Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7153f(int i10, int i11) {
        super(i10);
        this.f22749Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        C17689w c17689w = C17689w.f56480Y;
        switch (this.f22749Y) {
            case 0:
                C10100a buildClassSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C11135I c11135i = C11135I.f33763a;
                buildClassSerialDescriptor.m10678a("days", C11135I.f33764b, c17689w, false);
                break;
            case 1:
                C10100a buildClassSerialDescriptor2 = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor2, "$this$buildClassSerialDescriptor");
                C11135I c11135i2 = C11135I.f33763a;
                buildClassSerialDescriptor2.m10678a("months", C11135I.f33764b, c17689w, false);
                break;
            default:
                C10100a buildClassSerialDescriptor3 = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor3, "$this$buildClassSerialDescriptor");
                C11141O c11141o = C11141O.f33773a;
                buildClassSerialDescriptor3.m10678a("nanoseconds", C11141O.f33774b, c17689w, false);
                break;
        }
        return c17296c;
    }
}
