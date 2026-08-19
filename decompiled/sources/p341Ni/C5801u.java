package p341Ni;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p075Cl.C1719b;
import p101Dl.InterfaceC2101b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p855kj.C16424c;
import p855kj.C16425d;
import p855kj.C16426e;
import p855kj.C16427f;
import p855kj.C16432k;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ni.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C5801u implements InterfaceC2101b {

    /* JADX INFO: renamed from: a */
    public final Application f18936a;

    /* JADX INFO: renamed from: b */
    public final C1719b f18937b;

    /* JADX INFO: renamed from: c */
    public final List f18938c;

    /* JADX INFO: renamed from: d */
    public final boolean f18939d;

    /* JADX INFO: renamed from: e */
    public final int f18940e;

    /* JADX INFO: renamed from: f */
    public final boolean f18941f;

    /* JADX INFO: renamed from: g */
    public C16432k f18942g;

    /* JADX INFO: renamed from: h */
    public final Handler f18943h;

    /* JADX INFO: renamed from: i */
    public final C5800t f18944i;

    /* JADX INFO: renamed from: j */
    public final C2153Q0 f18945j;

    /* JADX INFO: renamed from: k */
    public final C2217y0 f18946k;

    /* JADX INFO: renamed from: l */
    public final C2153Q0 f18947l;

    /* JADX INFO: renamed from: m */
    public final C2217y0 f18948m;

    public C5801u(Application context, C1719b c1719b) {
        AbstractC16544l.m18094g(context, "context");
        this.f18936a = context;
        this.f18937b = c1719b;
        this.f18938c = AbstractC17681o.m19382k(C16424c.class, C16427f.class, C16426e.class, C16425d.class);
        this.f18939d = true;
        this.f18940e = 1;
        this.f18941f = true;
        this.f18943h = new Handler(Looper.getMainLooper());
        this.f18944i = new C5800t(this);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
        this.f18945j = c2153q0M3204c;
        this.f18946k = new C2217y0(c2153q0M3204c);
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f18947l = c2153q0M3204c2;
        this.f18948m = new C2217y0(c2153q0M3204c2);
    }

    @Override // p101Dl.InterfaceC2101b
    public final void start() {
        Handler handler = this.f18943h;
        handler.removeCallbacksAndMessages(null);
        handler.postAtFrontOfQueue(new RunnableC5799s(this, 0));
    }

    @Override // p101Dl.InterfaceC2101b
    public final void stop() {
    }
}
