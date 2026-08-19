package p147Fh;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8175q5;

/* JADX INFO: renamed from: Fh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2745b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8418Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f8419Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f8420o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f8421p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2745b(int i10, int i11, String str, boolean z6) {
        super(2);
        this.f8418Y = i11;
        this.f8419Z = str;
        this.f8420o0 = z6;
        this.f8421p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f8418Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8175q5.m8757b(this.f8419Z, this.f8420o0, c6021p, C5997d.m6447d0(this.f8421p0 | 1));
                break;
            default:
                AbstractC8175q5.m8757b(this.f8419Z, this.f8420o0, c6021p, C5997d.m6447d0(this.f8421p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
