package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1071w0.AbstractC20740b0;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7855B6;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9751J3;
import p635a1.InterfaceC10459q;
import p936p0.C18280t;

/* JADX INFO: renamed from: Wc.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8761E extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26699Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f26700Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f26701o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f26702p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8761E(Object obj, boolean z6, int i10, int i11) {
        super(2);
        this.f26699Y = i11;
        this.f26702p0 = obj;
        this.f26700Z = z6;
        this.f26701o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f26699Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9751J3.m10350c(this.f26700Z, (InterfaceC1439n) this.f26702p0, c6021p, C5997d.m6447d0(this.f26701o0 | 1));
                break;
            case 1:
                AbstractC7855B6.m8124d(this.f26700Z, (InterfaceC10459q) this.f26702p0, c6021p, C5997d.m6447d0(this.f26701o0 | 1));
                break;
            case 2:
                AbstractC8301I.m8912c((C18280t) this.f26702p0, this.f26700Z, c6021p, C5997d.m6447d0(this.f26701o0 | 1));
                break;
            default:
                AbstractC20740b0.m21269j((C1837w0) this.f26702p0, this.f26700Z, c6021p, C5997d.m6447d0(this.f26701o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8761E(boolean z6, Object obj, int i10, int i11) {
        super(2);
        this.f26699Y = i11;
        this.f26700Z = z6;
        this.f26702p0 = obj;
        this.f26701o0 = i10;
    }
}
