package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p392Q0.C6546d;

/* JADX INFO: renamed from: z0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C21599W extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68411Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InputConnectionC21601Y f68412Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21599W(InputConnectionC21601Y inputConnectionC21601Y, int i10) {
        super(1);
        this.f68411Y = i10;
        this.f68412Z = inputConnectionC21601Y;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68411Y) {
            case 0:
                C21577C c21577c = (C21577C) obj;
                C6546d c6546d = this.f68412Z.f68415c;
                int i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    int i11 = 0;
                    do {
                        ((InterfaceC1436k) objArr[i11]).invoke(c21577c);
                        i11++;
                    } while (i11 < i10);
                }
                break;
            default:
                ((C21577C) obj).m21860h(0, this.f68412Z.m21946c().f67817Y.length());
                break;
        }
        return C17296C.f55119a;
    }
}
