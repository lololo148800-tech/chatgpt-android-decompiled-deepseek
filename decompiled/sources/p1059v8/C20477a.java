package p1059v8;

import android.content.Context;
import io.sentry.C15358g1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p001A.C0095w0;
import p1077w8.C20849a;
import p1077w8.C20850b;
import p138F8.InterfaceC2677a;
import p571X9.AbstractC9227W;
import p604Yk.C10077b;
import p661b7.InterfaceC11256c;
import p699d7.InterfaceC13039c;
import p721e7.InterfaceC13290b;
import p743f7.C13577c;
import p765g7.InterfaceC13823a;
import p803i7.C14941d;
import p846k4.C16340i;
import p887m7.C17176b;

/* JADX INFO: renamed from: v8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20477a implements InterfaceC13039c {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f65000Y;

    /* JADX INFO: renamed from: Z */
    public final C16340i f65001Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2677a f65002o0 = new C20849a();

    /* JADX INFO: renamed from: p0 */
    public final AtomicBoolean f65003p0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q0 */
    public final String f65004q0 = "tracing";

    /* JADX INFO: renamed from: r0 */
    public final C17314q f65005r0 = AbstractC9227W.m9800c(new C17176b(this, 25));

    /* JADX INFO: renamed from: s0 */
    public final C13577c f65006s0 = C13577c.f42927a;

    public C20477a(InterfaceC13823a interfaceC13823a, C16340i c16340i) {
        this.f65000Y = interfaceC13823a;
        this.f65001Z = c16340i;
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: a */
    public final void mo3513a() {
        this.f65002o0 = new C20849a();
        this.f65003p0.set(false);
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: f */
    public final C13577c mo5603f() {
        return this.f65006s0;
    }

    @Override // p699d7.InterfaceC13037a
    public final String getName() {
        return this.f65004q0;
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: j */
    public final InterfaceC13290b mo5604j() {
        return (InterfaceC13290b) this.f65005r0.getValue();
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: k */
    public final void mo3517k(Context appContext) {
        AbstractC16544l.m18094g(appContext, "appContext");
        InterfaceC13823a interfaceC13823a = this.f65000Y;
        InterfaceC11256c interfaceC11256cMo15463s = interfaceC13823a.mo15463s();
        C0095w0 c0095w0 = new C0095w0(14);
        C10077b c10077b = new C10077b(this.f65001Z, interfaceC11256cMo15463s);
        C14941d c14941d = new C14941d(interfaceC11256cMo15463s);
        C15358g1 c15358g1 = new C15358g1();
        c15358g1.f47945Y = interfaceC11256cMo15463s;
        c15358g1.f47946Z = c14941d;
        this.f65002o0 = new C20850b(interfaceC13823a, c0095w0, c10077b, c15358g1, interfaceC11256cMo15463s);
        InterfaceC11256c internalLogger = interfaceC13823a.mo15463s();
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        new C14941d(internalLogger);
        this.f65003p0.set(true);
    }
}
