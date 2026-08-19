package p647ak;

import af.C10564U;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p552Wg.C8847i;

/* JADX INFO: renamed from: ak.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10681Z0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31721Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10696e1 f31722Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10695e0 f31723o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10681Z0(C10696e1 c10696e1, C10695e0 c10695e0, int i10) {
        super(1);
        this.f31721Y = i10;
        this.f31722Z = c10696e1;
        this.f31723o0 = c10695e0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31721Y) {
            case 0:
                AbstractC10641F output = (AbstractC10641F) obj;
                AbstractC16544l.m18094g(output, "output");
                return AbstractC8215v5.m8839a(this.f31722Z, new C8847i(output, 14, this.f31723o0));
            default:
                C17296C it = (C17296C) obj;
                AbstractC16544l.m18094g(it, "it");
                return AbstractC8215v5.m8839a(this.f31722Z, new C10564U(this.f31723o0, 8));
        }
    }
}
