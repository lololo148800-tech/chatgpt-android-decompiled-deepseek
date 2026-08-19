package p531Vj;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: Vj.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C8353X extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26020Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f26021Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8361c0 f26022o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8351V f26023p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8353X(C8361c0 c8361c0, C13421l c13421l, C8351V c8351v) {
        super(0);
        this.f26020Y = 2;
        this.f26022o0 = c8361c0;
        this.f26021Z = c13421l;
        this.f26023p0 = c8351v;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f26020Y) {
            case 0:
                InterfaceC13418i interfaceC13418iMo3400l = this.f26021Z.f42503Y.mo3400l();
                C8351V c8351v = this.f26023p0;
                C8361c0 c8361c0 = this.f26022o0;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c8361c0, new C8352W(c8361c0, c8351v, 0)));
                break;
            case 1:
                InterfaceC13418i interfaceC13418iMo3400l2 = this.f26021Z.f42503Y.mo3400l();
                C8351V c8351v2 = this.f26023p0;
                C8361c0 c8361c1 = this.f26022o0;
                interfaceC13418iMo3400l2.mo3393B(AbstractC8215v5.m8839a(c8361c1, new C8352W(c8361c1, c8351v2, 1)));
                break;
            default:
                C8361c0 c8361c2 = this.f26022o0;
                c8361c2.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                Context context = (Context) c8361c2.f26042b;
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                this.f26021Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c2, new C8352W(c8361c2, this.f26023p0, 6)));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8353X(C13421l c13421l, C8361c0 c8361c0, C8351V c8351v, int i10) {
        super(0);
        this.f26020Y = i10;
        this.f26021Z = c13421l;
        this.f26022o0 = c8361c0;
        this.f26023p0 = c8351v;
    }
}
