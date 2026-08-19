package p849k7;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p214Ib.C3676s;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p676c7.C11685d;
import p676c7.C11687f;
import p699d7.InterfaceC13037a;
import p699d7.InterfaceC13038b;
import p714e0.C13254b;
import p765g7.InterfaceC13823a;
import p909nm.C17689w;
import p909nm.C17690x;
import p918o7.C17878e;

/* JADX INFO: renamed from: k7.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16359l implements InterfaceC13823a {

    /* JADX INFO: renamed from: a */
    public static final C16359l f50805a = new C16359l();

    /* JADX INFO: renamed from: b */
    public static final C11687f f50806b;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f50806b = new C11687f(timeUnit.toNanos(jCurrentTimeMillis), timeUnit.toNanos(jCurrentTimeMillis), 0L, 0L);
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: d */
    public final Map mo15448d(String str) {
        return C17690x.f56481Y;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: e */
    public final List mo15449e() {
        return C17689w.f56480Y;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: f */
    public final C11685d mo15450f() {
        return new C11685d(12, null, null, null, null, null, null, 126);
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: g */
    public final Long mo15451g() {
        return null;
    }

    @Override // p765g7.InterfaceC13823a
    public final String getName() {
        return "no-op";
    }

    @Override // p765g7.InterfaceC13823a
    public final C11687f getTime() {
        return f50806b;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: h */
    public final boolean mo15452h() {
        return false;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: i */
    public final long mo15453i() {
        return 0L;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService mo15454j(String str) {
        return new ScheduledExecutorServiceC16357j(0);
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: k */
    public final void mo15455k(String featureName) {
        AbstractC16544l.m18094g(featureName, "featureName");
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: l */
    public final String mo15456l() {
        return "";
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: n */
    public final C16360m mo15458n(String featureName) {
        AbstractC16544l.m18094g(featureName, "featureName");
        return null;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: o */
    public final void mo15459o(String featureName, InterfaceC13038b interfaceC13038b) {
        AbstractC16544l.m18094g(featureName, "featureName");
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: s */
    public final InterfaceC11256c mo15463s() {
        return new C17878e(this);
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: t */
    public final C13254b mo15464t() {
        return new C13254b(C17690x.f56481Y);
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: u */
    public final ExecutorService mo15465u(String str) {
        return new ExecutorServiceC16356i();
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: v */
    public final C11682a mo15466v() {
        return null;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: w */
    public final C3676s mo15467w() {
        return null;
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: b */
    public final void mo15446b(Map map) {
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: m */
    public final void mo15457m(InterfaceC13037a interfaceC13037a) {
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: q */
    public final void mo15461q(byte[] bArr) {
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: r */
    public final void mo15462r(long j10) {
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: p */
    public final void mo15460p(String str, InterfaceC1436k interfaceC1436k) {
    }

    @Override // p765g7.InterfaceC13823a
    /* JADX INFO: renamed from: c */
    public final void mo15447c(String str, String str2, String str3, Map map) {
    }
}
