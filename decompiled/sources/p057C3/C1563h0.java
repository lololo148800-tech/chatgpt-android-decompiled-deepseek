package p057C3;

import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import p1016t3.C19757G;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;

/* JADX INFO: renamed from: C3.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563h0 implements InterfaceC1536N {

    /* JADX INFO: renamed from: Y */
    public long f4360Y;

    /* JADX INFO: renamed from: Z */
    public long f4361Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f4362o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f4363p0;

    /* JADX INFO: renamed from: q0 */
    public Object f4364q0;

    public C1563h0(C20813o c20813o) {
        this.f4363p0 = c20813o;
        this.f4364q0 = C19757G.f62563d;
    }

    /* JADX INFO: renamed from: a */
    public void m2424a(long j10) {
        this.f4360Y = j10;
        if (this.f4362o0) {
            ((C20813o) this.f4363p0).getClass();
            this.f4361Z = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2425b() {
        if (this.f4362o0) {
            return;
        }
        ((C20813o) this.f4363p0).getClass();
        this.f4361Z = SystemClock.elapsedRealtime();
        this.f4362o0 = true;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: d */
    public void mo2329d(C19757G c19757g) {
        if (this.f4362o0) {
            m2424a(mo2330e());
        }
        this.f4364q0 = c19757g;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: e */
    public long mo2330e() {
        long j10 = this.f4360Y;
        if (!this.f4362o0) {
            return j10;
        }
        ((C20813o) this.f4363p0).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4361Z;
        C19757G c19757g = (C19757G) this.f4364q0;
        return j10 + (c19757g.f62564a == 1.0f ? AbstractC20817s.m21390D(jElapsedRealtime) : jElapsedRealtime * ((long) c19757g.f62566c));
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean mo2331f() {
        return false;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: g */
    public C19757G mo2332g() {
        return (C19757G) this.f4364q0;
    }

    public C1563h0(long j10, long j11, boolean z6, File file, HashMap map) {
        this.f4360Y = j10;
        this.f4363p0 = file;
        this.f4361Z = j11;
        this.f4364q0 = map;
        this.f4362o0 = z6;
    }
}
