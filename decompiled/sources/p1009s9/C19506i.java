package p1009s9;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.recyclerview.widget.RecyclerView;
import co.C11818h;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15452y;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0100z;
import p003A1.AbstractC0168G;
import p004A2.InterfaceC0310a;
import p023Al.C0556b;
import p030B2.C0781s;
import p035B7.C0846c;
import p037B9.MeDP.MpoABj;
import p084D4.AbstractC1933p0;
import p084D4.C1934q;
import p1007s7.InterfaceC19466e;
import p100Dk.InterfaceC2094u;
import p1016t3.C19753C;
import p1022t9.C19819d;
import p1060v9.AbstractC20502t;
import p1073w3.C20811m;
import p1113xn.C21307a;
import p132F2.InterfaceC2646j;
import p178H.C3112E;
import p214Ib.C3677t;
import p228J.C3814P;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.EnumC3803G;
import p228J.EnumC3804G0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3831d0;
import p228J.InterfaceC3849m0;
import p301M.InterfaceC5221c;
import p301M.RunnableC5228j;
import p303M1.C5276b;
import p310M9.C5311e;
import p326N.InterfaceC5569k;
import p334Na.C5697d;
import p357Oa.InterfaceC6150c;
import p372P3.C6330l;
import p414R.RunnableC6774h;
import p425Ra.C6830c;
import p425Ra.C6839l;
import p425Ra.C6841n;
import p480Te.C7392q;
import p492U1.C7548m;
import p492U1.C7549n;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8712t;
import p561X.C8990d;
import p588Y2.C9602F;
import p588Y2.C9606J;
import p658b5.C11232c;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p666bl.InterfaceC11491g;
import p696d4.C13010h;
import p729ej.C13414e;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;
import p746fa.InterfaceC13596e;
import p746fa.InterfaceC13598g;
import p784hb.InterfaceC14439h;
import p784hb.InterfaceC14441j;
import p841k.C16281a;
import p841k.C16288h;
import p841k.InterfaceC16282b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: s9.i */
/* JADX INFO: loaded from: classes.dex */
public class C19506i implements InterfaceC19466e, InterfaceC3849m0, InterfaceC3798D0, InterfaceC5221c, InterfaceC3831d0, InterfaceC13592a, InterfaceC6150c, InterfaceC13598g, InterfaceC11491g, InterfaceC16282b, InterfaceC13596e, InterfaceC14439h {

    /* JADX INFO: renamed from: o0 */
    public static C19506i f61958o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61959Y;

    /* JADX INFO: renamed from: Z */
    public Object f61960Z;

    public /* synthetic */ C19506i(char c9, int i10) {
        this.f61959Y = i10;
    }

    /* JADX INFO: renamed from: V */
    public static C19506i m20604V(Context context) {
        AbstractC20502t.m21157h(context);
        synchronized (C19506i.class) {
            try {
                if (f61958o0 == null) {
                    AbstractC19513p.m20617a(context);
                    f61958o0 = new C19506i(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f61958o0;
    }

    /* JADX INFO: renamed from: W */
    public static C15446s m20605W(Throwable th2, C15437j c15437j, Long l4, List list, boolean z6) {
        Package r6 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        C15446s c15446s = new C15446s();
        String message = th2.getMessage();
        if (r6 != null) {
            name = name.replace(r6.getName() + Separators.DOT, "");
        }
        String name2 = r6 != null ? r6.getName() : null;
        if (list != null && !list.isEmpty()) {
            C15452y c15452y = new C15452y(list);
            if (z6) {
                c15452y.f48259o0 = Boolean.TRUE;
            }
            c15446s.f48213q0 = c15452y;
        }
        c15446s.f48212p0 = l4;
        c15446s.f48209Y = name;
        c15446s.f48214r0 = c15437j;
        c15446s.f48211o0 = name2;
        c15446s.f48210Z = message;
        return c15446s;
    }

    /* JADX INFO: renamed from: b0 */
    public static final AbstractBinderC19510m m20606b0(PackageInfo packageInfo, AbstractBinderC19510m... abstractBinderC19510mArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                AbstractC15256t.m16482t("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC19511n binderC19511n = new BinderC19511n(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < abstractBinderC19510mArr.length; i10++) {
                if (abstractBinderC19510mArr[i10].equals(binderC19511n)) {
                    return abstractBinderC19510mArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static final boolean m20607c0(PackageInfo packageInfo, boolean z6) {
        PackageInfo packageInfo2;
        if (!z6) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z6 ? m20606b0(packageInfo2, AbstractC19512o.f61971a) : m20606b0(packageInfo2, AbstractC19512o.f61971a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p228J.InterfaceC3831d0
    /* JADX INFO: renamed from: A */
    public void mo207A(Object obj) {
        ((InterfaceC0310a) this.f61960Z).accept(obj);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public /* synthetic */ Set mo34H(C3828c c3828c) {
        return AbstractC0168G.m516e(this, c3828c);
    }

    @Override // p746fa.InterfaceC13592a
    /* JADX INFO: renamed from: L */
    public Object mo253L(C13606o c13606o) {
        C11232c c11232c = (C11232c) this.f61960Z;
        if (c13606o.m15132k() || c13606o.f42985d) {
            return c13606o;
        }
        Exception excM15129h = c13606o.m15129h();
        if (!(excM15129h instanceof C19819d)) {
            return c13606o;
        }
        int i10 = ((C19819d) excM15129h).f62870Y.f36052Y;
        if (i10 != 43001 && i10 != 43002 && i10 != 43003 && i10 != 17) {
            if (i10 == 43000) {
                return AbstractC7854B5.m8116d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
            }
            return i10 != 15 ? c13606o : AbstractC7854B5.m8116d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        C5311e c5311e = (C5311e) c11232c.f33997Z;
        c5311e.getClass();
        C13599h c13599h = new C13599h();
        ((ExecutorService) c5311e.f17486p0).execute(new RunnableC5228j(c5311e, 6, c13599h));
        return c13599h.f42961a;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: M */
    public /* synthetic */ Object mo36M(C3828c c3828c, Object obj) {
        return AbstractC0168G.m520i(this, c3828c, obj);
    }

    @Override // p1007s7.InterfaceC19466e
    /* JADX INFO: renamed from: N */
    public Object mo3913N(Object obj) {
        int i10 = 1;
        String model = (String) obj;
        AbstractC16544l.m18094g(model, "model");
        try {
            try {
                return AbstractC8142m4.m8675c(AbstractC8712t.m9423e(model).m4390m());
            } catch (IllegalStateException e10) {
                throw new C3677t("Unable to parse json into type UserInfo", e10);
            }
        } catch (C3677t e11) {
            AbstractC7889G0.m8185c((InterfaceC11256c) this.f61960Z, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0846c(model, i10), e11, 48);
            return null;
        }
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: O */
    public /* synthetic */ boolean mo37O(C3828c c3828c) {
        return AbstractC0168G.m512a(this, c3828c);
    }

    /* JADX INFO: renamed from: R */
    public void m20608R(byte b) {
        ((Parcel) this.f61960Z).writeByte(b);
    }

    /* JADX INFO: renamed from: T */
    public void m20609T(float f10) {
        ((Parcel) this.f61960Z).writeFloat(f10);
    }

    /* JADX INFO: renamed from: U */
    public void m20610U(long j10) {
        long jM7894b = C7548m.m7894b(j10);
        byte b = 0;
        if (!C7549n.m7898a(jM7894b, 0L)) {
            if (C7549n.m7898a(jM7894b, 4294967296L)) {
                b = 1;
            } else if (C7549n.m7898a(jM7894b, 8589934592L)) {
                b = 2;
            }
        }
        m20608R(b);
        if (C7549n.m7898a(C7548m.m7894b(j10), 0L)) {
            return;
        }
        m20609T(C7548m.m7895c(j10));
    }

    /* JADX INFO: renamed from: X */
    public C19753C m20611X(C6330l c6330l, C8990d c8990d) throws EOFException, InterruptedIOException {
        C20811m c20811m = (C20811m) this.f61960Z;
        C19753C c19753cM14758e = null;
        int i10 = 0;
        while (true) {
            try {
                c6330l.mo3047d(c20811m.f66092a, 0, 10, false);
                c20811m.m21344F(0);
                if (c20811m.m21368w() != 4801587) {
                    break;
                }
                c20811m.m21345G(3);
                int iM21364s = c20811m.m21364s();
                int i11 = iM21364s + 10;
                if (c19753cM14758e == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(c20811m.f66092a, 0, bArr, 0, 10);
                    c6330l.mo3047d(bArr, 10, iM21364s, false);
                    c19753cM14758e = new C13010h(c8990d).m14758e(i11, bArr);
                } else {
                    c6330l.m6941g(iM21364s, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        c6330l.f20550r0 = 0;
        c6330l.m6941g(i10, false);
        return c19753cM14758e;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: Y */
    public void m20612Y(AbstractC1933p0 abstractC1933p0, C0781s c0781s, C0781s c0781s2) {
        boolean zM3105g;
        RecyclerView recyclerView = (RecyclerView) this.f61960Z;
        recyclerView.getClass();
        abstractC1933p0.m3101p(false);
        C1934q c1934q = (C1934q) recyclerView.f33625Z0;
        if (c0781s != null) {
            c1934q.getClass();
            int i10 = c0781s.f2192b;
            int i11 = c0781s2.f2192b;
            if (i10 == i11 && c0781s.f2193c == c0781s2.f2193c) {
                c1934q.m3109l(abstractC1933p0);
                abstractC1933p0.f5680a.setAlpha(0.0f);
                c1934q.f5702i.add(abstractC1933p0);
                zM3105g = true;
            } else {
                zM3105g = c1934q.m3105g(abstractC1933p0, i10, c0781s.f2193c, i11, c0781s2.f2193c);
            }
        } else {
            c1934q.m3109l(abstractC1933p0);
            abstractC1933p0.f5680a.setAlpha(0.0f);
            c1934q.f5702i.add(abstractC1933p0);
            zM3105g = true;
        }
        if (zM3105g) {
            recyclerView.m12273W();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m20613Z(AbstractC1933p0 abstractC1933p0, C0781s c0781s, C0781s c0781s2) {
        boolean zM3105g;
        RecyclerView recyclerView = (RecyclerView) this.f61960Z;
        recyclerView.f33644q0.m3037l(abstractC1933p0);
        recyclerView.m12284h(abstractC1933p0);
        abstractC1933p0.m3101p(false);
        C1934q c1934q = (C1934q) recyclerView.f33625Z0;
        c1934q.getClass();
        int i10 = c0781s.f2192b;
        int i11 = c0781s.f2193c;
        View view = abstractC1933p0.f5680a;
        int left = c0781s2 == null ? view.getLeft() : c0781s2.f2192b;
        int top = c0781s2 == null ? view.getTop() : c0781s2.f2193c;
        if (abstractC1933p0.m3095j() || (i10 == left && i11 == top)) {
            c1934q.m3109l(abstractC1933p0);
            c1934q.f5701h.add(abstractC1933p0);
            zM3105g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM3105g = c1934q.m3105g(abstractC1933p0, i10, i11, left, top);
        }
        if (zM3105g) {
            recyclerView.m12273W();
        }
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        C5697d c5697d = (C5697d) ((InterfaceC6150c) this.f61960Z).mo3914a();
        if (c5697d != null) {
            return c5697d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: a0 */
    public InterfaceC2646j m20614a0() throws PackageManager.NameNotFoundException {
        String string;
        Activity activity = (Activity) this.f61960Z;
        PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listM19322C0 = AbstractC17680n.m19322C0(arrayList);
        if (listM19322C0.isEmpty()) {
            return null;
        }
        Iterator it = listM19322C0.iterator();
        InterfaceC2646j interfaceC2646j = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(activity);
                AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC2646j interfaceC2646j2 = (InterfaceC2646j) objNewInstance;
                if (!interfaceC2646j2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC2646j != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC2646j = interfaceC2646j2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC2646j;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object mo39b(C3828c c3828c) {
        return AbstractC0168G.m519h(this, c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public void mo41e(C0100z c0100z) {
        getConfig().mo41e(c0100z);
    }

    @Override // p228J.InterfaceC3849m0
    public InterfaceC3805H getConfig() {
        return (InterfaceC3805H) this.f61960Z;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public /* synthetic */ EnumC3803G mo42h(C3828c c3828c) {
        return AbstractC0168G.m515d(this, c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Set mo44k() {
        return AbstractC0168G.m517f(this);
    }

    @Override // p178H.InterfaceC3177w
    /* JADX INFO: renamed from: o */
    public C3825a0 mo3780o() {
        return (C3825a0) this.f61960Z;
    }

    @Override // p228J.InterfaceC3831d0
    public void onError(Throwable th2) {
        AbstractC8072d6.m8488e("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f61959Y) {
            case 10:
                ((RunnableC6774h) this.f61960Z).run();
                break;
            default:
                ((C13599h) ((C13414e) this.f61960Z).f42490Y).f42961a.m15136o();
                break;
        }
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        return AbstractC0168G.m521j(this, c3828c, enumC3803G);
    }

    @Override // p784hb.InterfaceC14439h
    /* JADX INFO: renamed from: t */
    public Object mo15959t() {
        return ((InterfaceC14441j) this.f61960Z).mo3663A(null);
    }

    @Override // p228J.InterfaceC3798D0
    /* JADX INFO: renamed from: x */
    public InterfaceC3800E0 mo3781x() {
        return new C3814P(C3835f0.m4568a((C3825a0) this.f61960Z));
    }

    @Override // p666bl.InterfaceC11491g
    /* JADX INFO: renamed from: y */
    public void mo12523y(String message) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC8160o6.m8726a(((C7392q) this.f61960Z).f23422c, message, null, 6);
    }

    @Override // p746fa.InterfaceC13598g
    /* JADX INFO: renamed from: z */
    public C13606o mo272z(Object obj) {
        C6830c c6830c = (C6830c) this.f61960Z;
        return AbstractC7854B5.m8117e(new C6839l(c6830c.f21912b, ((Long) obj).longValue()));
    }

    public /* synthetic */ C19506i(C6830c c6830c, C6841n c6841n) {
        this.f61959Y = 19;
        this.f61960Z = c6830c;
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        C16281a c16281a = (C16281a) obj;
        C9606J c9606j = (C9606J) this.f61960Z;
        C9602F c9602f = (C9602F) c9606j.f33173D.pollFirst();
        if (c9602f == null) {
            AbstractC15256t.m16482t("FragmentManager", MpoABj.JgtztLGDUI + this);
            return;
        }
        String str = c9602f.f28898Y;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11836c = c9606j.f33186c.m11836c(str);
        if (abstractComponentCallbacksC11000aM11836c != null) {
            abstractComponentCallbacksC11000aM11836c.mo11760x(c9602f.f28899Z, c16281a.f50448Y, c16281a.f50449Z);
        } else {
            AbstractC15256t.m16482t("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public /* synthetic */ C19506i(Object obj, int i10) {
        this.f61959Y = i10;
        this.f61960Z = obj;
    }

    public C19506i(Context context) {
        this.f61959Y = 0;
        this.f61960Z = context.getApplicationContext();
    }

    public C19506i(InterfaceC11256c internalLogger) {
        this.f61959Y = 3;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f61960Z = internalLogger;
    }

    public C19506i(C16288h requestPermissionResultLauncher) {
        this.f61959Y = 18;
        AbstractC16544l.m18094g(requestPermissionResultLauncher, "requestPermissionResultLauncher");
        this.f61960Z = requestPermissionResultLauncher;
    }

    public C19506i(Activity context) {
        this.f61959Y = 7;
        AbstractC16544l.m18094g(context, "context");
        this.f61960Z = context;
    }

    public C19506i(InterfaceC2094u uiService) {
        this.f61959Y = 5;
        AbstractC16544l.m18094g(uiService, "uiService");
        this.f61960Z = uiService;
    }

    public C19506i(C0556b c0556b) {
        this.f61959Y = 25;
        this.f61960Z = new C11818h(c0556b, C21307a.f67720a);
    }

    public C19506i(int i10) {
        this.f61959Y = 11;
        this.f61960Z = new C5276b(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19506i(int i10, byte b) {
        this(C3825a0.m4558d());
        this.f61959Y = i10;
        switch (i10) {
            case 17:
                this.f61960Z = new C20811m(10);
                break;
            default:
                break;
        }
    }

    public C19506i(C3825a0 c3825a0) {
        Object objMo39b;
        this.f61959Y = 9;
        this.f61960Z = c3825a0;
        Object objMo39b2 = null;
        try {
            objMo39b = c3825a0.mo39b(InterfaceC5569k.f18065a0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        Class cls = (Class) objMo39b;
        if (cls != null && !cls.equals(C3112E.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((C3825a0) this.f61960Z).m4561x(InterfaceC3800E0.f11493G, EnumC3804G0.f11509o0);
        C3828c c3828c = InterfaceC5569k.f18065a0;
        C3825a0 c3825a1 = (C3825a0) this.f61960Z;
        c3825a1.m4561x(c3828c, C3112E.class);
        try {
            objMo39b2 = c3825a1.mo39b(InterfaceC5569k.f18064W);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo39b2 == null) {
            c3825a1.m4561x(InterfaceC5569k.f18064W, C3112E.class.getCanonicalName() + lZYtIbClQJm.pGxUTDmupKoJ + UUID.randomUUID());
        }
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
    }
}
