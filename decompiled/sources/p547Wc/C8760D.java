package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p080D0.InterfaceC1818n;
import p1071w0.AbstractC20739b;
import p349O0.C5997d;
import p349O0.C6021p;
import p594Y9.AbstractC9745I3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Wc.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8760D extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26693Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f26694Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f26695o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f26696p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f26697q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f26698r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8760D(Object obj, InterfaceC10459q interfaceC10459q, long j10, int i10, int i11, int i12) {
        super(2);
        this.f26693Y = i12;
        this.f26698r0 = obj;
        this.f26694Z = interfaceC10459q;
        this.f26695o0 = j10;
        this.f26696p0 = i10;
        this.f26697q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26693Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f26696p0 | 1);
                String str = (String) this.f26698r0;
                AbstractC9745I3.m10335a(str, this.f26694Z, this.f26695o0, (C6021p) obj, iM6447d0, this.f26697q0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f26696p0 | 1);
                InterfaceC1818n interfaceC1818n = (InterfaceC1818n) this.f26698r0;
                AbstractC20739b.m21256a(interfaceC1818n, this.f26694Z, this.f26695o0, (C6021p) obj, iM6447d1, this.f26697q0);
                break;
        }
        return C17296C.f55119a;
    }
}
