package p101Dl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p571X9.AbstractC9227W;
import p855kj.C16432k;

/* JADX INFO: renamed from: Dl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2109j implements InterfaceC2101b {
    public static final C2108i Companion = new C2108i();

    /* JADX INFO: renamed from: h */
    public static final Object f6459h;

    /* JADX INFO: renamed from: i */
    public static final Object f6460i;

    /* JADX INFO: renamed from: j */
    public static final Object f6461j;

    /* JADX INFO: renamed from: a */
    public final Context f6462a;

    /* JADX INFO: renamed from: b */
    public int f6463b;

    /* JADX INFO: renamed from: c */
    public int f6464c;

    /* JADX INFO: renamed from: d */
    public int f6465d;

    /* JADX INFO: renamed from: e */
    public int f6466e;

    /* JADX INFO: renamed from: f */
    public C16432k f6467f;

    /* JADX INFO: renamed from: g */
    public final Handler f6468g;

    static {
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        f6459h = AbstractC9227W.m9799b(enumC17307j, C2106g.f6456o0);
        f6460i = AbstractC9227W.m9799b(enumC17307j, C2106g.f6455Z);
        f6461j = AbstractC9227W.m9799b(enumC17307j, C2106g.f6457p0);
    }

    public C2109j(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f6462a = context;
        this.f6463b = 3;
        this.f6465d = 2;
        this.f6466e = 1;
        this.f6468g = new Handler(Looper.getMainLooper());
    }

    @Override // p101Dl.InterfaceC2101b
    public final void start() {
        if (this.f6467f == null) {
            Handler handler = this.f6468g;
            handler.removeCallbacksAndMessages(null);
            handler.postAtFrontOfQueue(new RunnableC2104e(this, 0));
        }
    }

    @Override // p101Dl.InterfaceC2101b
    public final void stop() {
        Handler handler = this.f6468g;
        handler.removeCallbacksAndMessages(null);
        handler.postAtFrontOfQueue(new RunnableC2104e(this, 1));
    }
}
