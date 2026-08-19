package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: te.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C19880k extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63022Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f63023Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Uri f63024o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19880k(InterfaceC1436k interfaceC1436k, Uri uri, int i10) {
        super(0);
        this.f63022Y = i10;
        this.f63023Z = interfaceC1436k;
        this.f63024o0 = uri;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63022Y) {
            case 0:
                this.f63023Z.invoke(new C19894y(this.f63024o0));
                break;
            default:
                this.f63023Z.invoke(new C19856G(this.f63024o0));
                break;
        }
        return C17296C.f55119a;
    }
}
