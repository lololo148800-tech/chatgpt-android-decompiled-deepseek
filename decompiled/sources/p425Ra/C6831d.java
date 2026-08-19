package p425Ra;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p357Oa.ServiceConnectionC6160m;
import p572Xa.AbstractBinderC9424r;
import p572Xa.AbstractC9410d;
import p572Xa.AbstractRunnableC9428v;
import p572Xa.C9408b;
import p572Xa.C9423q;
import p572Xa.C9427u;
import p572Xa.InterfaceC9425s;
import p746fa.C13599h;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: Ra.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6831d extends AbstractRunnableC9428v {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f21913Z = 1;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f21914o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f21915p0;

    public C6831d(ServiceConnectionC6160m serviceConnectionC6160m, IBinder iBinder) {
        this.f21914o0 = iBinder;
        this.f21915p0 = serviceConnectionC6160m;
    }

    @Override // p572Xa.AbstractRunnableC9428v
    /* JADX INFO: renamed from: b */
    public final void mo7271b() {
        int length;
        String strEncodeToString;
        InterfaceC9425s c9423q;
        int i10 = 0;
        Object obj = this.f21914o0;
        Object obj2 = this.f21915p0;
        switch (this.f21913Z) {
            case 0:
                Context context = (Context) obj;
                C13599h c13599h = ((C6836i) obj2).f21930c;
                C9427u c9427u = AbstractC9410d.f28381a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        C9427u c9427u2 = AbstractC9410d.f28381a;
                        if (signatureArr == null || (length = signatureArr.length) == 0) {
                            Object[] objArr = new Object[0];
                            c9427u2.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", C9427u.m9998c(c9427u2.f28406a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr));
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    byte[] byteArray = signatureArr[i11].toByteArray();
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                        messageDigest.update(byteArray);
                                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                                    } catch (NoSuchAlgorithmException unused) {
                                        strEncodeToString = "";
                                    }
                                    arrayList.add(strEncodeToString);
                                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                                        String str = Build.TAGS;
                                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                            i11++;
                                        }
                                    }
                                    i10 = packageInfo.versionCode;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    Iterator it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        while (true) {
                                            sb2.append((CharSequence) it.next());
                                            if (it.hasNext()) {
                                                sb2.append((CharSequence) ", ");
                                            }
                                        }
                                    }
                                    String strM11054l = AbstractC10763a.m11054l("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "].");
                                    Object[] objArr2 = new Object[0];
                                    c9427u2.getClass();
                                    if (Log.isLoggable("PlayCore", 5)) {
                                        Log.w("PlayCore", C9427u.m9998c(c9427u2.f28406a, strM11054l, objArr2));
                                    }
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                c13599h.m15116d(Integer.valueOf(i10));
                break;
            default:
                ServiceConnectionC6160m serviceConnectionC6160m = (ServiceConnectionC6160m) obj2;
                ((C9408b) serviceConnectionC6160m.f20048b).f28375i.getClass();
                int i12 = AbstractBinderC9424r.f28405b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    c9423q = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(suYVq.eluPzYsa);
                    c9423q = iInterfaceQueryLocalInterface instanceof InterfaceC9425s ? (InterfaceC9425s) iInterfaceQueryLocalInterface : new C9423q(iBinder);
                }
                C9408b c9408b = (C9408b) serviceConnectionC6160m.f20048b;
                c9408b.f28380n = c9423q;
                C9427u c9427u3 = c9408b.f28368b;
                c9427u3.m10000b("linkToDeath", new Object[0]);
                try {
                    c9408b.f28380n.asBinder().linkToDeath(c9408b.f28377k, 0);
                } catch (RemoteException e10) {
                    c9427u3.m9999a(e10, "linkToDeath failed", new Object[0]);
                }
                c9408b.f28373g = false;
                Iterator it2 = c9408b.f28370d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c9408b.f28370d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6831d(C6836i c6836i, C13599h c13599h, Context context) {
        super(c13599h);
        this.f21914o0 = context;
        this.f21915p0 = c6836i;
    }
}
