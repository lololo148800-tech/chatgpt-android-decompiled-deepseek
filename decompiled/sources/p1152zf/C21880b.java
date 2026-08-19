package p1152zf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: zf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21880b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69374Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f69375Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f69376o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f69377p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f69378q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f69379r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21880b(int i10, int i11, InterfaceC10459q interfaceC10459q, String str, String str2, List list) {
        super(2);
        this.f69374Y = i11;
        this.f69375Z = str;
        this.f69376o0 = str2;
        this.f69377p0 = list;
        this.f69378q0 = interfaceC10459q;
        this.f69379r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69374Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC21881c.m22320b(this.f69375Z, this.f69376o0, this.f69377p0, this.f69378q0, (C6021p) obj, C5997d.m6447d0(this.f69379r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC21881c.m22320b(this.f69375Z, this.f69376o0, this.f69377p0, this.f69378q0, (C6021p) obj, C5997d.m6447d0(this.f69379r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
