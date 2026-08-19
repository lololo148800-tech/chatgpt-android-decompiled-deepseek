package p985r9;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p523V9.AbstractC7854B5;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;
import p746fa.InterfaceC13598g;

/* JADX INFO: renamed from: r9.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18894d implements InterfaceC13592a, InterfaceC13598g {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C18894d f60239Z = new C18894d(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C18894d f60240o0 = new C18894d(1);

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C18894d f60241p0 = new C18894d(2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60242Y;

    public /* synthetic */ C18894d(int i10) {
        this.f60242Y = i10;
    }

    @Override // p746fa.InterfaceC13592a
    /* JADX INFO: renamed from: L */
    public Object mo253L(C13606o c13606o) throws IOException {
        switch (this.f60242Y) {
            case 0:
                if (c13606o.m15132k()) {
                    return (Bundle) c13606o.m15130i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(c13606o.m15129h())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", c13606o.m15129h());
            default:
                Intent intent = (Intent) ((Bundle) c13606o.m15130i()).getParcelable("notification_data");
                if (intent != null) {
                    return new C18891a(intent);
                }
                return null;
        }
    }

    @Override // p746fa.InterfaceC13598g
    /* JADX INFO: renamed from: z */
    public C13606o mo272z(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = C18892b.f60228h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC7854B5.m8117e(bundle) : AbstractC7854B5.m8117e(null);
    }
}
