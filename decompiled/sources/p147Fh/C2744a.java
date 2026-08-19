package p147Fh;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8175q5;
import p635a1.InterfaceC10459q;
import p870le.AbstractC16912v0;

/* JADX INFO: renamed from: Fh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2744a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8412Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f8413Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f8414o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f8415p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f8416q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f8417r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2744a(Object obj, boolean z6, boolean z10, int i10, int i11, int i12) {
        super(2);
        this.f8412Y = i12;
        this.f8413Z = obj;
        this.f8414o0 = z6;
        this.f8415p0 = z10;
        this.f8416q0 = i10;
        this.f8417r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8412Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f8416q0 | 1);
                String str = (String) this.f8413Z;
                AbstractC8175q5.m8756a(str, this.f8414o0, this.f8415p0, (C6021p) obj, iM6447d0, this.f8417r0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f8416q0 | 1);
                String str2 = (String) this.f8413Z;
                AbstractC8175q5.m8756a(str2, this.f8414o0, this.f8415p0, (C6021p) obj, iM6447d1, this.f8417r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f8416q0 | 1);
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f8413Z;
                AbstractC16912v0.m18585e(interfaceC10459q, this.f8414o0, this.f8415p0, (C6021p) obj, iM6447d2, this.f8417r0);
                break;
        }
        return C17296C.f55119a;
    }
}
