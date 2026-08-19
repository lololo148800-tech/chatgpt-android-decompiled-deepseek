package p1140z1;

import androidx.compose.p650ui.node.Owner;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1095x1.AbstractC21068W;

/* JADX INFO: renamed from: z1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C21662H extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21665K f68677Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Owner f68678Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f68679o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21662H(C21665K c21665k, Owner owner, long j10) {
        super(0);
        this.f68677Y = c21665k;
        this.f68678Z = owner;
        this.f68679o0 = j10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        AbstractC21669O abstractC21669OMo22157H0;
        C21665K c21665k = this.f68677Y;
        AbstractC21068W placementScope = null;
        if (AbstractC21690f.m22213r(c21665k.f68729a)) {
            AbstractC21678Y abstractC21678Y = c21665k.m22107a().f68821z0;
            if (abstractC21678Y != null) {
                placementScope = abstractC21678Y.f68759u0;
            }
        } else {
            AbstractC21678Y abstractC21678Y2 = c21665k.m22107a().f68821z0;
            if (abstractC21678Y2 != null && (abstractC21669OMo22157H0 = abstractC21678Y2.mo22157H0()) != null) {
                placementScope = abstractC21669OMo22157H0.f68759u0;
            }
        }
        if (placementScope == null) {
            placementScope = this.f68678Z.getPlacementScope();
        }
        AbstractC21669O abstractC21669OMo22157H1 = c21665k.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H1);
        AbstractC21068W.m21537f(placementScope, abstractC21669OMo22157H1, this.f68679o0);
        return C17296C.f55119a;
    }
}
