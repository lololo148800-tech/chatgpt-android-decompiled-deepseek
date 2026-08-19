package p1087wj;

import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileInputStream;
import mo.AbstractC17325B;
import mo.C17352s;
import p026Ao.InterfaceC0676j;
import p102Dm.AbstractC2119a;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8746y3;

/* JADX INFO: renamed from: wj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C20979J extends AbstractC17325B {

    /* JADX INFO: renamed from: a */
    public final File f66801a;

    /* JADX INFO: renamed from: b */
    public final C17352s f66802b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f66803c = AbstractC2124C.m3204c(0);

    public C20979J(File file, C17352s c17352s) {
        this.f66801a = file;
        this.f66802b = c17352s;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        return this.f66801a.length();
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        return this.f66802b;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) {
        File file = this.f66801a;
        float length = file.length();
        byte[] bArr = new byte[2048];
        C15378c c15378cM9492c = AbstractC8746y3.m9492c(file, new FileInputStream(file));
        try {
            int i10 = c15378cM9492c.read(bArr);
            long j10 = 0;
            int i11 = 0;
            while (i10 != -1) {
                j10 += (long) i10;
                interfaceC0676j.mo1336h0(bArr, 0, i10);
                i10 = c15378cM9492c.read(bArr);
                int iM3195i = AbstractC2119a.m3195i((j10 / length) * 100.0f);
                if (iM3195i - i11 > 1 || iM3195i >= 100) {
                    C2153Q0 c2153q0 = this.f66803c;
                    Integer numValueOf = Integer.valueOf(iM3195i);
                    c2153q0.getClass();
                    c2153q0.m3251l(null, numValueOf);
                    i11 = iM3195i;
                }
            }
            AbstractC7942M5.m8232a(c15378cM9492c, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15378cM9492c, th2);
                throw th3;
            }
        }
    }
}
