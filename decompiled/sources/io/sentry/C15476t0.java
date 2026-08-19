package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.rrweb.AbstractC15461b;
import io.sentry.transport.C15480c;
import io.sentry.transport.InterfaceC15483f;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p593Y8.C9683j;
import p658b5.C11232c;

/* JADX INFO: renamed from: io.sentry.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15476t0 implements InterfaceC15119E0, InterfaceC15122F0, InterfaceC15148O, InterfaceC15167U1, InterfaceC15162T, InterfaceC15165U, InterfaceC15127H {

    /* JADX INFO: renamed from: Z */
    public static final C15476t0 f48341Z = new C15476t0(0);

    /* JADX INFO: renamed from: o0 */
    public static final C15476t0 f48342o0 = new C15476t0(1);

    /* JADX INFO: renamed from: p0 */
    public static final C15476t0 f48343p0 = new C15476t0(2);

    /* JADX INFO: renamed from: q0 */
    public static final C15476t0 f48344q0 = new C15476t0(3);

    /* JADX INFO: renamed from: r0 */
    public static final C15476t0 f48345r0 = new C15476t0(4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f48346Y;

    public /* synthetic */ C15476t0(int i10) {
        this.f48346Y = i10;
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: P */
    public InterfaceC15119E0 getF47667y0() {
        return f48341Z;
    }

    @Override // io.sentry.InterfaceC15165U
    /* JADX INFO: renamed from: b */
    public InterfaceC15483f mo16348b(C15524y1 c15524y1, C11232c c11232c) {
        return new C15480c(c15524y1, new C9683j(c15524y1), c15524y1.getTransportGate(), c11232c);
    }

    @Override // io.sentry.InterfaceC15167U1
    public void close() {
        int i10 = this.f48346Y;
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: g */
    public void mo16296g(EnumC15375i1 enumC15375i1, Throwable th2, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th2.toString();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC15375i1 + ": " + str2 + " \n " + string + Separators.RETURN + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: h */
    public void mo16297h(EnumC15375i1 enumC15375i1, String str, Throwable th2) {
        if (th2 == null) {
            mo16298o(enumC15375i1, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th2.toString());
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC15375i1 + ": " + str2 + Separators.RETURN + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC15162T
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.InterfaceC15162T
    /* JADX INFO: renamed from: l */
    public C15113C0 mo16347l(C15126G1 c15126g1, List list, C15524y1 c15524y1) {
        return null;
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: m */
    public boolean mo15969m() {
        return false;
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: n */
    public List mo16352n(InterfaceC15159S interfaceC15159S) {
        return null;
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: o */
    public void mo16298o(EnumC15375i1 enumC15375i1, String str, Object... objArr) {
        System.out.println(enumC15375i1 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: p */
    public boolean mo16299p(EnumC15375i1 enumC15375i1) {
        return true;
    }

    @Override // io.sentry.InterfaceC15119E0
    /* JADX INFO: renamed from: q */
    public AbstractC15461b mo16261q(C15345d c15345d) {
        return null;
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: r */
    public Future mo15970r(Runnable runnable, long j10) {
        return new FutureTask(new CallableC15519x(1));
    }

    @Override // io.sentry.InterfaceC15122F0
    public void start() {
        int i10 = this.f48346Y;
    }

    @Override // io.sentry.InterfaceC15148O
    public Future submit(Runnable runnable) {
        return new FutureTask(new CallableC15519x(1));
    }

    /* JADX INFO: renamed from: s */
    private final void m16665s() {
    }

    /* JADX INFO: renamed from: t */
    private final void m16666t() {
    }

    /* JADX INFO: renamed from: u */
    private final void m16667u() {
    }

    /* JADX INFO: renamed from: v */
    private final void m16668v() {
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: a */
    public void mo16264a() {
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: e */
    public void mo16265e() {
    }

    @Override // io.sentry.InterfaceC15122F0
    public void stop() {
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: c */
    public void mo16349c(C15135J1 c15135j1) {
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: d */
    public void mo15965d(long j10) {
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: f */
    public void mo16350f(C15135J1 c15135j1) {
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: i */
    public void mo16351i(C15126G1 c15126g1) {
    }

    @Override // io.sentry.InterfaceC15162T
    /* JADX INFO: renamed from: j */
    public void mo16346j(C15126G1 c15126g1) {
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: k */
    public void mo16266k(Boolean bool) {
    }
}
