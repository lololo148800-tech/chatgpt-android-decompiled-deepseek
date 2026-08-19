package p625Zh;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import mm.C17296C;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p523V9.AbstractC8168p6;
import p728ei.C13406b;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Zh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10396b implements InterfaceC19018a {

    /* JADX INFO: renamed from: Y */
    public final Application f30808Y;

    /* JADX INFO: renamed from: Z */
    public final C13406b f30809Z;

    /* JADX INFO: renamed from: o0 */
    public final C3430e f30810o0 = AbstractC8168p6.m8749b("ConnectivityChecker", null);

    /* JADX INFO: renamed from: p0 */
    public final C2153Q0 f30811p0;

    /* JADX INFO: renamed from: q0 */
    public final C2217y0 f30812q0;

    public C10396b(Application application, C13406b c13406b) {
        this.f30808Y = application;
        this.f30809Z = c13406b;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(Boolean.FALSE);
        this.f30811p0 = c2153q0M3204c;
        this.f30812q0 = new C2217y0(c2153q0M3204c);
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f30808Y.getSystemService(ConnectivityManager.class);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        Object objM3212k = AbstractC2124C.m3212k(this.f30809Z.f42469c, new C10395a(connectivityManager, networkRequestBuild, this, null), interfaceC18770c);
        return objM3212k == EnumC19250a.f61036Y ? objM3212k : C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }
}
