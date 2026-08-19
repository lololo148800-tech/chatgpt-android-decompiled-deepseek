package p1058v7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: v7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20473e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f64993Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f64994Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f64995o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20473e(String str, int i10, int i11) {
        super(0);
        this.f64993Y = str;
        this.f64994Z = i10;
        this.f64995o0 = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return "Number of bytes read for operation='" + this.f64993Y + "' doesn't match with expected: expected=" + this.f64994Z + ", actual=" + this.f64995o0;
    }
}
