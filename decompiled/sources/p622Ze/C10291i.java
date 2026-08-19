package p622Ze;

import com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1048uo.AbstractC20397d;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p978r1.AbstractC18857c;

/* JADX INFO: renamed from: Ze.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C10291i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30567Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f30568Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmoSettingsViewModel f30569o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f30570p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10291i(InterfaceC10459q interfaceC10459q, GizmoSettingsViewModel gizmoSettingsViewModel, int i10, int i11) {
        super(2);
        this.f30567Y = i11;
        this.f30568Z = interfaceC10459q;
        this.f30569o0 = gizmoSettingsViewModel;
        this.f30570p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30567Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC18857c.m20154a(this.f30568Z, this.f30569o0, c6021p, C5997d.m6447d0(this.f30570p0 | 1));
                break;
            default:
                AbstractC20397d.m21059a(this.f30568Z, this.f30569o0, c6021p, C5997d.m6447d0(this.f30570p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
