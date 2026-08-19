package p812ii;

import android.gov.nist.core.Separators;
import ao.C11135I;
import ao.C11163f0;
import ao.C11181o0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.json.AbstractC16643b;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21329w;
import p606Yn.C10100a;
import p909nm.C17689w;

/* JADX INFO: renamed from: ii.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15011k extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C15011k f46703Z = new C15011k(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C15011k f46704o0 = new C15011k(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46705Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15011k(int i10, int i11) {
        super(i10);
        this.f46705Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f46705Y) {
            case 0:
                AbstractC15010j it = (AbstractC15010j) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it instanceof C15009i) {
                    return AbstractC21329w.m21731r(AbstractC21329w.m21731r(((C15009i) it).f46702a, "~", "~0"), Separators.SLASH, "~1");
                }
                if (it instanceof C15008h) {
                    return String.valueOf(((C15008h) it).f46701a);
                }
                throw new C0644w();
            default:
                C10100a buildClassSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C17689w c17689w = C17689w.f56480Y;
                C11181o0 c11181o0 = C11181o0.f33827a;
                C11163f0 c11163f0 = C11181o0.f33828b;
                buildClassSerialDescriptor.m10678a("o", c11163f0, c17689w, true);
                buildClassSerialDescriptor.m10678a("p", c11163f0, c17689w, true);
                buildClassSerialDescriptor.m10678a("v", AbstractC16643b.Companion.serializer().getDescriptor(), c17689w, true);
                buildClassSerialDescriptor.m10678a("f", c11163f0, c17689w, true);
                C11135I c11135i = C11135I.f33763a;
                buildClassSerialDescriptor.m10678a("c", C11135I.f33764b, c17689w, true);
                return C17296C.f55119a;
        }
    }
}
