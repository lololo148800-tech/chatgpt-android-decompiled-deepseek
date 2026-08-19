package p501Ub;

import android.content.Context;
import io.sentry.android.core.AbstractC15256t;
import p658b5.C11238i;
import p746fa.InterfaceC13595d;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Ub.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7600b implements InterfaceC13595d, InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C7600b f24031Z = new C7600b(1);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C7600b f24032o0 = new C7600b(2);

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C7600b f24033p0 = new C7600b(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24034Y;

    public /* synthetic */ C7600b(int i10) {
        this.f24034Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        return new C7607i((Context) c11238i.mo12555a(Context.class));
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        switch (this.f24034Y) {
            case 1:
                AbstractC15256t.m16466d("OptionalModuleUtils", "Failed to check feature availability", exc);
                break;
            default:
                AbstractC15256t.m16466d("OptionalModuleUtils", "Failed to request modules install request", exc);
                break;
        }
    }
}
