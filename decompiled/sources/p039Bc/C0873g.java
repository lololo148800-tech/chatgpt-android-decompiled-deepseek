package p039Bc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1143z4.C21778h;
import p211I8.lPE.sRXLFOsOgS;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13493k;

/* JADX INFO: renamed from: Bc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0873g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C0873g f2564Z = new C0873g(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0873g f2565o0 = new C0873g(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0873g f2566p0 = new C0873g(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2567Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0873g(int i10, int i11) {
        super(i10);
        this.f2567Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f2567Y) {
            case 0:
                AbstractC16544l.m18094g((C13493k) obj, sRXLFOsOgS.bTgMIegIebVQa);
                return C13467E.f42621b;
            case 1:
                C13493k NavHost = (C13493k) obj;
                AbstractC16544l.m18094g(NavHost, "$this$NavHost");
                return C13468F.f42623b;
            default:
                C21778h entry = (C21778h) obj;
                AbstractC16544l.m18094g(entry, "entry");
                String str = entry.f69074Z.f69136s0;
                return entry.f69078r0 + ":" + (str != null ? AbstractC21322p.m21705m0(str, '?') : "unknown");
        }
    }
}
