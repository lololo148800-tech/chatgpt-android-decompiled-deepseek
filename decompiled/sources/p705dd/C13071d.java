package p705dd;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3590f;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8063c5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: dd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13071d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41523Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f41524Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f41525o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f41526p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f41527q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f41528r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ CharSequence f41529s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071d(C3590f c3590f, InterfaceC10459q interfaceC10459q, int i10, int i11, boolean z6, int i12) {
        super(2);
        this.f41529s0 = c3590f;
        this.f41524Z = interfaceC10459q;
        this.f41525o0 = i10;
        this.f41526p0 = i11;
        this.f41527q0 = z6;
        this.f41528r0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41523Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f41526p0 | 1);
                boolean z6 = this.f41527q0;
                AbstractC8011V4.m8325a((String) this.f41529s0, z6, this.f41524Z, this.f41525o0, (C6021p) obj, iM6447d0, this.f41528r0);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8063c5.m8467j((C3590f) this.f41529s0, this.f41524Z, this.f41525o0, this.f41526p0, this.f41527q0, (C6021p) obj, C5997d.m6447d0(this.f41528r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071d(String str, boolean z6, InterfaceC10459q interfaceC10459q, int i10, int i11, int i12) {
        super(2);
        this.f41529s0 = str;
        this.f41527q0 = z6;
        this.f41524Z = interfaceC10459q;
        this.f41525o0 = i10;
        this.f41526p0 = i11;
        this.f41528r0 = i12;
    }
}
