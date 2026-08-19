package p500Ua;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.HashMap;
import java.util.Iterator;
import p265Kb.C4613f;
import p357Oa.ServiceConnectionC6160m;
import p524Va.AbstractBinderC8251c;
import p524Va.AbstractC8249a;
import p524Va.AbstractRunnableC8253e;
import p524Va.C8250b;
import p524Va.C8256h;
import p524Va.InterfaceC8252d;
import p746fa.C13599h;

/* JADX INFO: renamed from: Ua.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7595d extends AbstractRunnableC8253e {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f24019Z = 1;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f24020o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f24021p0;

    public C7595d(ServiceConnectionC6160m serviceConnectionC6160m, IBinder iBinder) {
        this.f24020o0 = iBinder;
        this.f24021p0 = serviceConnectionC6160m;
    }

    @Override // p524Va.AbstractRunnableC8253e
    /* JADX INFO: renamed from: a */
    public final void mo7946a() {
        HashMap map;
        InterfaceC8252d c8250b = null;
        switch (this.f24019Z) {
            case 0:
                try {
                    C7597f c7597f = (C7597f) this.f24021p0;
                    InterfaceC8252d interfaceC8252d = c7597f.f24026a.f25755m;
                    String str = c7597f.f24027b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = AbstractC7598g.f24028a;
                    synchronized (AbstractC7598g.class) {
                        map = AbstractC7598g.f24028a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    C7597f c7597f2 = (C7597f) this.f24021p0;
                    C13599h c13599h = (C13599h) this.f24020o0;
                    String str2 = c7597f2.f24027b;
                    BinderC7596e binderC7596e = new BinderC7596e(c7597f2, c13599h);
                    C8250b c8250b2 = (C8250b) interfaceC8252d;
                    c8250b2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i10 = AbstractC8249a.f25733a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(binderC7596e);
                    try {
                        c8250b2.f25734a.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e10) {
                    C7597f c7597f3 = (C7597f) this.f24021p0;
                    C4613f c4613f = C7597f.f24025c;
                    Object[] objArr = {c7597f3.f24027b};
                    c4613f.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC15256t.m16466d("PlayCore", C4613f.m5358e(c4613f.f15035Y, "error requesting in-app review for %s", objArr), e10);
                    }
                    ((C13599h) this.f24020o0).m15115c(new RuntimeException(e10));
                    return;
                }
            default:
                int i11 = AbstractBinderC8251c.f25735b;
                IBinder iBinder = (IBinder) this.f24020o0;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    c8250b = iInterfaceQueryLocalInterface instanceof InterfaceC8252d ? (InterfaceC8252d) iInterfaceQueryLocalInterface : new C8250b(iBinder);
                }
                ServiceConnectionC6160m serviceConnectionC6160m = (ServiceConnectionC6160m) this.f24021p0;
                C8256h c8256h = (C8256h) serviceConnectionC6160m.f20048b;
                c8256h.f25755m = c8250b;
                C4613f c4613f2 = c8256h.f25744b;
                c4613f2.m5360c("linkToDeath", new Object[0]);
                try {
                    c8256h.f25755m.asBinder().linkToDeath(c8256h.f25752j, 0);
                    break;
                } catch (RemoteException e11) {
                    Object[] objArr2 = new Object[0];
                    c4613f2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC15256t.m16466d("PlayCore", C4613f.m5358e(c4613f2.f15035Y, "linkToDeath failed", objArr2), e11);
                    }
                }
                C8256h c8256h2 = (C8256h) serviceConnectionC6160m.f20048b;
                c8256h2.f25749g = false;
                Iterator it = c8256h2.f25746d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                c8256h2.f25746d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7595d(C7597f c7597f, C13599h c13599h, C13599h c13599h2) {
        super(c13599h);
        this.f24020o0 = c13599h2;
        this.f24021p0 = c7597f;
    }
}
