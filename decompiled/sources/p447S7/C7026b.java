package p447S7;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0078o;
import p087D7.AbstractC1976c;
import p1009s9.C19506i;
import p1020t7.C19809g;
import p1112xm.AbstractC21304h;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p163G7.InterfaceExecutorServiceC3006a;
import p167Gb.C3032c;
import p214Ib.C3676s;
import p437Rn.C6949g;
import p437Rn.C6959q;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8206u4;
import p594Y9.C9895g4;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11685d;
import p676c7.C11688g;
import p775h2.AbstractC14376f;
import p849k7.C16351d;
import p849k7.C16354g;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: S7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7026b implements InterfaceC7027c {

    /* JADX INFO: renamed from: A0 */
    public boolean f22464A0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceExecutorServiceC3006a f22465Y;

    /* JADX INFO: renamed from: Z */
    public final C3032c f22466Z;

    /* JADX INFO: renamed from: o0 */
    public final C9895g4 f22467o0;

    /* JADX INFO: renamed from: p0 */
    public final C19506i f22468p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC11256c f22469q0;

    /* JADX INFO: renamed from: r0 */
    public final C19809g f22470r0;

    /* JADX INFO: renamed from: s0 */
    public final C16351d f22471s0;

    /* JADX INFO: renamed from: t0 */
    public final String f22472t0;

    /* JADX INFO: renamed from: u0 */
    public final File f22473u0;

    /* JADX INFO: renamed from: v0 */
    public C3676s f22474v0;

    /* JADX INFO: renamed from: w0 */
    public C11688g f22475w0;

    /* JADX INFO: renamed from: x0 */
    public C11685d f22476x0;

    /* JADX INFO: renamed from: y0 */
    public C7028d f22477y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f22478z0;

    public C7026b(File file, InterfaceExecutorServiceC3006a interfaceExecutorServiceC3006a, C3032c c3032c, C9895g4 c9895g4, C19506i c19506i, InterfaceC11256c internalLogger, C19809g c19809g, C16351d c16351d, String str) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f22465Y = interfaceExecutorServiceC3006a;
        this.f22466Z = c3032c;
        this.f22467o0 = c9895g4;
        this.f22468p0 = c19506i;
        this.f22469q0 = internalLogger;
        this.f22470r0 = c19809g;
        this.f22471s0 = c16351d;
        this.f22472t0 = str;
        this.f22473u0 = new File(file, "ndk_crash_reports_v2");
    }

    /* JADX INFO: renamed from: a */
    public final void m7423a() {
        File file = this.f22473u0;
        InterfaceC11256c interfaceC11256c = this.f22469q0;
        if (AbstractC8206u4.m8824f(file, interfaceC11256c)) {
            try {
                File[] fileArrM8826h = AbstractC8206u4.m8826h(file, interfaceC11256c);
                if (fileArrM8826h != null) {
                    for (File file2 : fileArrM8826h) {
                        AbstractC21304h.m21640c(file2);
                    }
                }
            } catch (Throwable th2) {
                AbstractC7889G0.m8185c(this.f22469q0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C6949g(this, 3), th2, 48);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m7424b(File file, C19809g c19809g) {
        byte[] bArr = (byte[]) c19809g.m20766c(file);
        if (bArr.length == 0) {
            return null;
        }
        String str = new String(bArr, C21307a.f67720a);
        if (AbstractC21322p.m21667A(str, "\\u0000", false) || AbstractC21322p.m21667A(str, "\u0000", false)) {
            AbstractC7889G0.m8184b(this.f22469q0, 5, EnumC11255b.f34100o0, new C6959q(file, str, bArr, 1), null, false, 56);
        }
        return str;
    }

    @Override // p447S7.InterfaceC7027c
    /* JADX INFO: renamed from: h */
    public final void mo7425h(C16354g c16354g, int i10) {
        AbstractC14376f.m15825D(i10, "reportTarget");
        AbstractC1976c.m3152i(this.f22465Y, "NDK crash report ", this.f22469q0, new RunnableC0078o(this, c16354g, i10, 5));
    }
}
