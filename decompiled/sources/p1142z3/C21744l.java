package p1142z3;

import android.content.Context;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: z3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C21744l implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final Context f68983Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f68984Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC21740h f68985o0;

    /* JADX INFO: renamed from: p0 */
    public C21750r f68986p0;

    /* JADX INFO: renamed from: q0 */
    public C21734b f68987q0;

    /* JADX INFO: renamed from: r0 */
    public C21737e f68988r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC21740h f68989s0;

    /* JADX INFO: renamed from: t0 */
    public C21732E f68990t0;

    /* JADX INFO: renamed from: u0 */
    public C21738f f68991u0;

    /* JADX INFO: renamed from: v0 */
    public C21758z f68992v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC21740h f68993w0;

    public C21744l(Context context, InterfaceC21740h interfaceC21740h) {
        this.f68983Y = context.getApplicationContext();
        interfaceC21740h.getClass();
        this.f68985o0 = interfaceC21740h;
        this.f68984Z = new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    public static void m22241l(InterfaceC21740h interfaceC21740h, InterfaceC21730C interfaceC21730C) {
        if (interfaceC21740h != null) {
            interfaceC21740h.mo927c(interfaceC21730C);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) {
        AbstractC20800b.m21320h(this.f68993w0 == null);
        String scheme = c21743k.f68974a.getScheme();
        int i10 = AbstractC20817s.f66106a;
        Uri uri = c21743k.f68974a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f68983Y;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f68986p0 == null) {
                    C21750r c21750r = new C21750r(false);
                    this.f68986p0 = c21750r;
                    m22242g(c21750r);
                }
                this.f68993w0 = this.f68986p0;
            } else {
                if (this.f68987q0 == null) {
                    C21734b c21734b = new C21734b(context);
                    this.f68987q0 = c21734b;
                    m22242g(c21734b);
                }
                this.f68993w0 = this.f68987q0;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f68987q0 == null) {
                C21734b c21734b2 = new C21734b(context);
                this.f68987q0 = c21734b2;
                m22242g(c21734b2);
            }
            this.f68993w0 = this.f68987q0;
        } else if ("content".equals(scheme)) {
            if (this.f68988r0 == null) {
                C21737e c21737e = new C21737e(context);
                this.f68988r0 = c21737e;
                m22242g(c21737e);
            }
            this.f68993w0 = this.f68988r0;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC21740h interfaceC21740h = this.f68985o0;
            if (zEquals) {
                if (this.f68989s0 == null) {
                    try {
                        InterfaceC21740h interfaceC21740h2 = (InterfaceC21740h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f68989s0 = interfaceC21740h2;
                        m22242g(interfaceC21740h2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC20800b.m21332t("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f68989s0 == null) {
                        this.f68989s0 = interfaceC21740h;
                    }
                }
                this.f68993w0 = this.f68989s0;
            } else if (ParameterNames.UDP.equals(scheme)) {
                if (this.f68990t0 == null) {
                    C21732E c21732e = new C21732E();
                    this.f68990t0 = c21732e;
                    m22242g(c21732e);
                }
                this.f68993w0 = this.f68990t0;
            } else if ("data".equals(scheme)) {
                if (this.f68991u0 == null) {
                    C21738f c21738f = new C21738f(false);
                    this.f68991u0 = c21738f;
                    m22242g(c21738f);
                }
                this.f68993w0 = this.f68991u0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f68992v0 == null) {
                    C21758z c21758z = new C21758z(context);
                    this.f68992v0 = c21758z;
                    m22242g(c21758z);
                }
                this.f68993w0 = this.f68992v0;
            } else {
                this.f68993w0 = interfaceC21740h;
            }
        }
        return this.f68993w0.mo926a(c21743k);
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        this.f68985o0.mo927c(interfaceC21730C);
        this.f68984Z.add(interfaceC21730C);
        m22241l(this.f68986p0, interfaceC21730C);
        m22241l(this.f68987q0, interfaceC21730C);
        m22241l(this.f68988r0, interfaceC21730C);
        m22241l(this.f68989s0, interfaceC21730C);
        m22241l(this.f68990t0, interfaceC21730C);
        m22241l(this.f68991u0, interfaceC21730C);
        m22241l(this.f68992v0, interfaceC21730C);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        InterfaceC21740h interfaceC21740h = this.f68993w0;
        if (interfaceC21740h != null) {
            try {
                interfaceC21740h.close();
            } finally {
                this.f68993w0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22242g(InterfaceC21740h interfaceC21740h) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f68984Z;
            if (i10 >= arrayList.size()) {
                return;
            }
            interfaceC21740h.mo927c((InterfaceC21730C) arrayList.get(i10));
            i10++;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        InterfaceC21740h interfaceC21740h = this.f68993w0;
        if (interfaceC21740h == null) {
            return null;
        }
        return interfaceC21740h.getUri();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        InterfaceC21740h interfaceC21740h = this.f68993w0;
        return interfaceC21740h == null ? Collections.emptyMap() : interfaceC21740h.mo929h();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        InterfaceC21740h interfaceC21740h = this.f68993w0;
        interfaceC21740h.getClass();
        return interfaceC21740h.read(bArr, i10, i11);
    }
}
