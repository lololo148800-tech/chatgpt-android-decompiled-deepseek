package p666bl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.SparseArray;
import cn.UfGr.EhBykzn;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p063C9.AbstractC1616b;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1113xn.AbstractC21322p;
import p1142z3.C21747o;
import p1142z3.InterfaceC21739g;
import p1142z3.InterfaceC21740h;
import p115E9.C2361c;
import p315Me.Myis.CxcULo;
import p658b5.C11238i;
import p758g0.AbstractC13784r;
import p758g0.C13730F;
import p758g0.InterfaceC13789t0;
import p758g0.InterfaceC13798z;
import p824j4.C16106b;
import p824j4.InterfaceC16108d;
import sk.C19665d;

/* JADX INFO: renamed from: bl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C11500p implements InterfaceC11491g, InterfaceC13789t0, InterfaceC16108d, InterfaceC21739g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34807Y;

    /* JADX INFO: renamed from: Z */
    public int f34808Z;

    /* JADX INFO: renamed from: o0 */
    public int f34809o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f34810p0;

    public C11500p(Context context) {
        this.f34807Y = 5;
        this.f34809o0 = 0;
        this.f34810p0 = context;
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: F */
    public int mo3876F() {
        return this.f34809o0;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f34810p0).mo3877K(j10, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: N */
    public int mo3878N() {
        return this.f34808Z;
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: a */
    public int mo6627a() {
        return this.f34808Z;
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: b */
    public int mo6628b() {
        return this.f34809o0;
    }

    @Override // p1142z3.InterfaceC21739g
    /* JADX INFO: renamed from: c */
    public InterfaceC21740h mo12896c() {
        return new C21747o(this.f34808Z, this.f34809o0, (C19665d) this.f34810p0);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean mo3881d() {
        return false;
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: e */
    public int mo6631e() {
        int i10 = this.f34808Z;
        return i10 == -1 ? ((C20811m) this.f34810p0).m21369x() : i10;
    }

    /* JADX INFO: renamed from: f */
    public byte m12897f(int i10, int i11) {
        return ((byte[][]) this.f34810p0)[i11][i10];
    }

    /* JADX INFO: renamed from: g */
    public void m12898g(int i10, int i11, int i12) {
        ((byte[][]) this.f34810p0)[i11][i10] = (byte) i12;
    }

    /* JADX INFO: renamed from: h */
    public synchronized int m12899h() {
        PackageInfo packageInfo;
        if (this.f34808Z == 0) {
            try {
                packageInfo = C2361c.m3449a((Context) this.f34810p0).f7317Y.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                AbstractC15256t.m16482t("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f34808Z = packageInfo.versionCode;
            }
        }
        return this.f34808Z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006b, B:21:0x0050, B:23:0x0064, B:29:0x006f, B:33:0x007e), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX INFO: renamed from: i */
    public synchronized int m12900i() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i10 = this.f34809o0;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f34810p0;
        PackageManager packageManager = context.getPackageManager();
        if (C2361c.m3449a(context).f7317Y.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            AbstractC15256t.m16465c("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (AbstractC1616b.m2472d()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage(CxcULo.dygPfCnGMNgOg);
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            AbstractC15256t.m16482t("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != AbstractC1616b.m2472d()) {
                i11 = 2;
            }
            this.f34809o0 = i11;
            return i11;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage(CxcULo.dygPfCnGMNgOg);
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                AbstractC15256t.m16482t("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != AbstractC1616b.m2472d()) {
                    i11 = 2;
                }
                this.f34809o0 = i11;
                return i11;
            }
            i11 = 2;
        }
        this.f34809o0 = i11;
        return i11;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((long) (mo3878N() + mo3876F())) * 1000000;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f34810p0).mo3877K(mo3882q(abstractC13784r, abstractC13784r2, abstractC13784r3), abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    public String toString() {
        switch (this.f34807Y) {
            case 3:
                int i10 = this.f34808Z;
                int i11 = this.f34809o0;
                StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = ((byte[][]) this.f34810p0)[i12];
                    for (int i13 = 0; i13 < i10; i13++) {
                        byte b = bArr[i13];
                        if (b == 0) {
                            sb2.append(" 0");
                        } else if (b != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f34810p0).mo3884u(j10, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p666bl.InterfaceC11491g
    /* JADX INFO: renamed from: y */
    public void mo12523y(String message) {
        AbstractC16544l.m18094g(message, "message");
        while (true) {
            int length = message.length();
            InterfaceC11491g interfaceC11491g = (InterfaceC11491g) this.f34810p0;
            int i10 = this.f34808Z;
            if (length <= i10) {
                interfaceC11491g.mo12523y(message);
                return;
            }
            String strSubstring = message.substring(0, i10);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            int iM21683Q = AbstractC21322p.m21683Q(strSubstring, '\n', 0, 6);
            if (iM21683Q >= this.f34809o0) {
                strSubstring = strSubstring.substring(0, iM21683Q);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                i10 = iM21683Q + 1;
            }
            interfaceC11491g.mo12523y(strSubstring);
            message = message.substring(i10);
            AbstractC16544l.m18093f(message, "substring(...)");
        }
    }

    public C11500p(int i10, int i11, int i12) {
        this.f34807Y = i12;
        switch (i12) {
            case 6:
                this.f34810p0 = null;
                this.f34808Z = i10;
                int i13 = i11 & 7;
                this.f34809o0 = i13 == 0 ? 8 : i13;
                break;
            default:
                this.f34810p0 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
                this.f34808Z = i10;
                this.f34809o0 = i11;
                break;
        }
    }

    public C11500p(InterfaceC11491g interfaceC11491g) {
        this.f34807Y = 0;
        this.f34808Z = 4000;
        this.f34809o0 = 3000;
        this.f34810p0 = interfaceC11491g;
    }

    public C11500p(int i10) {
        this.f34807Y = i10;
        switch (i10) {
            case 8:
                this.f34810p0 = new C19665d(7);
                this.f34808Z = 8000;
                this.f34809o0 = 8000;
                break;
            default:
                this.f34810p0 = new C11500p[256];
                this.f34808Z = 0;
                this.f34809o0 = 0;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11500p(int i10, int i11, InterfaceC1426a interfaceC1426a) {
        this.f34807Y = 7;
        this.f34808Z = i10;
        this.f34809o0 = i11;
        this.f34810p0 = (AbstractC16546n) interfaceC1426a;
    }

    public C11500p(int i10, int i11, InterfaceC13798z interfaceC13798z) {
        this.f34807Y = 1;
        this.f34808Z = i10;
        this.f34809o0 = i11;
        this.f34810p0 = new C11238i(new C13730F(i10, i11, interfaceC13798z));
    }

    public C11500p(int i10, int i11, SparseArray sparseArray) {
        this.f34807Y = 4;
        this.f34808Z = i10;
        this.f34809o0 = i11;
        this.f34810p0 = sparseArray;
    }

    public C11500p(C16106b c16106b, C19788o c19788o) {
        this.f34807Y = 2;
        C20811m c20811m = c16106b.f49886o0;
        this.f34810p0 = c20811m;
        c20811m.m21344F(12);
        int iM21369x = c20811m.m21369x();
        if (EhBykzn.waRFUFlCKk.equals(c19788o.f62752m)) {
            int iM21420u = AbstractC20817s.m21420u(c19788o.f62731C, c19788o.f62729A);
            if (iM21369x == 0 || iM21369x % iM21420u != 0) {
                AbstractC20800b.m21332t("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM21420u + ", stsz sample size: " + iM21369x);
                iM21369x = iM21420u;
            }
        }
        this.f34808Z = iM21369x == 0 ? -1 : iM21369x;
        this.f34809o0 = c20811m.m21369x();
    }
}
