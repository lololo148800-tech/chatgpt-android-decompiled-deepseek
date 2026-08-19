package p1035u7;

import io.sentry.C15358g1;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p087D7.AbstractC1976c;
import p1020t7.InterfaceC19806d;
import p109E3.RunnableC2301y;
import p1100x7.InterfaceC21155a;
import p163G7.InterfaceExecutorServiceC3006a;
import p569X7.EnumC9072a;
import p661b7.InterfaceC11256c;
import p885m4.C17152b;

/* JADX INFO: renamed from: u7.b */
/* JADX INFO: loaded from: classes.dex */
public class C20144b implements InterfaceC19806d {

    /* JADX INFO: renamed from: s0 */
    public static final C17152b f63806s0 = new C17152b();

    /* JADX INFO: renamed from: Y */
    public final InterfaceC19806d f63807Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC19806d f63808Z;

    /* JADX INFO: renamed from: o0 */
    public final C15358g1 f63809o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceExecutorServiceC3006a f63810p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC11256c f63811q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC19806d f63812r0;

    public C20144b(InterfaceC21155a consentProvider, InterfaceC19806d interfaceC19806d, InterfaceC19806d interfaceC19806d2, C15358g1 c15358g1, InterfaceExecutorServiceC3006a interfaceExecutorServiceC3006a, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(consentProvider, "consentProvider");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f63807Y = interfaceC19806d;
        this.f63808Z = interfaceC19806d2;
        this.f63809o0 = c15358g1;
        this.f63810p0 = interfaceExecutorServiceC3006a;
        this.f63811q0 = internalLogger;
        EnumC9072a enumC9072aMo13164h = consentProvider.mo13164h();
        AbstractC1976c.m3152i(interfaceExecutorServiceC3006a, "Data migration", internalLogger, new RunnableC2301y(this, null, m20962a(null), enumC9072aMo13164h, m20962a(enumC9072aMo13164h), 4));
        consentProvider.mo13166j(this);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC19806d m20962a(EnumC9072a enumC9072a) {
        int i10 = enumC9072a == null ? -1 : AbstractC20143a.f63805a[enumC9072a.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return this.f63807Y;
        }
        if (i10 == 2) {
            return this.f63808Z;
        }
        if (i10 == 3) {
            return f63806s0;
        }
        throw new C0644w();
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: n */
    public final File mo12595n(File file) {
        InterfaceC19806d interfaceC19806d = this.f63812r0;
        if (interfaceC19806d != null) {
            return interfaceC19806d.mo12595n(file);
        }
        AbstractC16544l.m18103p("delegateOrchestrator");
        throw null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: o */
    public final File mo12596o(boolean z6) {
        InterfaceC19806d interfaceC19806d = this.f63812r0;
        if (interfaceC19806d != null) {
            return interfaceC19806d.mo12596o(z6);
        }
        AbstractC16544l.m18103p("delegateOrchestrator");
        throw null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: r */
    public final File mo12597r() {
        return null;
    }
}
