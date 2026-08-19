package p329N3;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p057C3.C1567l;
import p1016t3.C19771V;
import p1016t3.C19781h;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20812n;
import p1073w3.C20815q;

/* JADX INFO: renamed from: N3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5615e {

    /* JADX INFO: renamed from: a */
    public final Context f18167a;

    /* JADX INFO: renamed from: b */
    public final int f18168b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f18169c;

    /* JADX INFO: renamed from: d */
    public C19788o f18170d;

    /* JADX INFO: renamed from: e */
    public long f18171e;

    /* JADX INFO: renamed from: f */
    public boolean f18172f;

    /* JADX INFO: renamed from: g */
    public long f18173g;

    /* JADX INFO: renamed from: h */
    public InterfaceC5633w f18174h;

    /* JADX INFO: renamed from: i */
    public Executor f18175i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5616f f18176j;

    public C5615e(C5616f c5616f, Context context) {
        this.f18176j = c5616f;
        this.f18167a = context;
        this.f18168b = AbstractC20817s.m21388B(context) ? 1 : 5;
        this.f18169c = new ArrayList();
        this.f18171e = -9223372036854775807L;
        this.f18174h = InterfaceC5633w.f18302c0;
        this.f18175i = C5616f.f18177m;
    }

    /* JADX INFO: renamed from: a */
    public final void m6000a(boolean z6) {
        this.f18172f = false;
        this.f18171e = -9223372036854775807L;
        C5616f c5616f = this.f18176j;
        if (c5616f.f18189l == 1) {
            c5616f.f18188k++;
            c5616f.f18180c.m6040a();
            C20815q c20815q = c5616f.f18186i;
            AbstractC20800b.m21321i(c20815q);
            c20815q.m21377c(new RunnableC5611a(c5616f, 0));
        }
        if (z6) {
            C5625o c5625o = c5616f.f18179b;
            C5629s c5629s = c5625o.f18252b;
            c5629s.f18281m = 0L;
            c5629s.f18284p = -1L;
            c5629s.f18282n = -1L;
            c5625o.f18257g = -9223372036854775807L;
            c5625o.f18255e = -9223372036854775807L;
            c5625o.m6031c(1);
            c5625o.f18258h = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6001b(C19788o c19788o) throws C5634x {
        C5616f c5616f = this.f18176j;
        AbstractC20800b.m21320h(c5616f.f18189l == 0);
        C19781h c19781h = c19788o.f62765z;
        if (c19781h == null || !c19781h.m20743d()) {
            c19781h = C19781h.f62674h;
        }
        if (c19781h.f62677c != 7 || AbstractC20817s.f66106a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC20800b.m21321i(looperMyLooper);
        c5616f.f18186i = c5616f.f18182e.m21372a(looperMyLooper, null);
        try {
            C5613c c5613c = c5616f.f18181d;
            C11276A c11276a = AbstractC11278C.f34162Z;
            C11294T c11294t = C11294T.f34185q0;
            c5613c.m5999a();
            Pair pair = c5616f.f18187j;
            if (pair == null) {
                throw null;
            }
            int i10 = ((C20812n) pair.second).f66096a;
            throw null;
        } catch (C19771V e10) {
            throw new C5634x(e10, c19788o);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6002c() {
        if (this.f18170d == null) {
            return;
        }
        new ArrayList().addAll(this.f18169c);
        C19788o c19788o = this.f18170d;
        c19788o.getClass();
        AbstractC20800b.m21321i(null);
        C19781h c19781h = c19788o.f62765z;
        if (c19781h == null || !c19781h.m20743d()) {
            C19781h c19781h2 = C19781h.f62674h;
        }
        int i10 = c19788o.f62758s;
        AbstractC20800b.m21315c("width must be positive, but is: " + i10, i10 > 0);
        int i11 = c19788o.f62759t;
        AbstractC20800b.m21315c("height must be positive, but is: " + i11, i11 > 0);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m6003d(long j10, long j11) throws C5634x {
        try {
            this.f18176j.m6005a(j10, j11);
        } catch (C1567l e10) {
            C19788o c19788o = this.f18170d;
            if (c19788o == null) {
                c19788o = new C19788o(new C19787n());
            }
            throw new C5634x(e10, c19788o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6004e(Surface surface, C20812n c20812n) {
        C5616f c5616f = this.f18176j;
        Pair pair = c5616f.f18187j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C20812n) c5616f.f18187j.second).equals(c20812n)) {
            return;
        }
        c5616f.f18187j = Pair.create(surface, c20812n);
        int i10 = c20812n.f66096a;
    }
}
