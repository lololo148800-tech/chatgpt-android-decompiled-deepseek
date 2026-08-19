package p576Xe;

import bf.C11349D;
import bf.C11370Z;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p594Y9.AbstractC9937n4;

/* JADX INFO: renamed from: Xe.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C9480e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28534Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f28535Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9480e(C11349D c11349d, int i10) {
        super(1);
        this.f28534Y = i10;
        this.f28535Z = c11349d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f28534Y) {
            case 0:
                C11370Z gizmos = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos, "gizmos");
                return C11370Z.m12781a(gizmos, AbstractC9937n4.m10598a(gizmos.f34376b, this.f28535Z), null, 5);
            case 1:
                C11370Z gizmos2 = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos2, "gizmos");
                return C11370Z.m12781a(gizmos2, AbstractC9937n4.m10598a(gizmos2.f34376b, this.f28535Z), null, 5);
            case 2:
                C11370Z gizmos3 = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos3, "gizmos");
                return C11370Z.m12781a(gizmos3, AbstractC9937n4.m10598a(gizmos3.f34376b, this.f28535Z), null, 5);
            default:
                C11349D snorlax = (C11349D) obj;
                AbstractC16544l.m18094g(snorlax, "snorlax");
                C11349D c11349d = this.f28535Z;
                return AbstractC16544l.m18089b(snorlax.f34318a, c11349d.f34318a) ? c11349d : snorlax;
        }
    }
}
