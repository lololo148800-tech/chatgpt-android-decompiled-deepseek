package p042Bf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0893B;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: Bf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3334Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f3335Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3336o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0893B f3337p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f3338q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1259a(String str, String str2, C0893B c0893b, int i10, int i11) {
        super(2);
        this.f3334Y = i11;
        this.f3335Z = str;
        this.f3336o0 = str2;
        this.f3337p0 = c0893b;
        this.f3338q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3334Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f3338q0 | 1);
                AbstractC1270l.m1982a(this.f3335Z, this.f3336o0, this.f3337p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f3338q0 | 1);
                AbstractC1270l.m1982a(this.f3335Z, this.f3336o0, this.f3337p0, c6021p, iM6447d1);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f3338q0 | 1);
                AbstractC1270l.m1982a(this.f3335Z, this.f3336o0, this.f3337p0, c6021p, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
