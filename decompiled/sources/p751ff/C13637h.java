package p751ff;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7902H5;

/* JADX INFO: renamed from: ff.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13637h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43080Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f43081Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f43082o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f43083p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f43084q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13637h(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f43080Y = i11;
        this.f43081Z = z6;
        this.f43082o0 = interfaceC1426a;
        this.f43083p0 = interfaceC1436k;
        this.f43084q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f43080Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f43084q0 | 1);
                AbstractC7902H5.m8202g(this.f43081Z, this.f43082o0, this.f43083p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f43084q0 | 1);
                AbstractC7902H5.m8202g(this.f43081Z, this.f43082o0, this.f43083p0, c6021p, iM6447d1);
                break;
            case 2:
                int iM6447d2 = C5997d.m6447d0(this.f43084q0 | 1);
                AbstractC7902H5.m8204i(this.f43081Z, this.f43082o0, this.f43083p0, c6021p, iM6447d2);
                break;
            default:
                int iM6447d3 = C5997d.m6447d0(this.f43084q0 | 1);
                AbstractC7902H5.m8204i(this.f43081Z, this.f43082o0, this.f43083p0, c6021p, iM6447d3);
                break;
        }
        return C17296C.f55119a;
    }
}
