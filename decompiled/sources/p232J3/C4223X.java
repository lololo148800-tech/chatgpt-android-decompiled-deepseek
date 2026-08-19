package p232J3;

import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.Collections;
import java.util.List;
import p1016t3.AbstractC19764N;
import p1016t3.C19751A;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19775b;
import p1016t3.C19792s;
import p1016t3.C19793t;
import p1016t3.C19794u;
import p1016t3.C19795v;
import p1016t3.C19797x;
import p1073w3.AbstractC20800b;
import p372P3.C6337s;

/* JADX INFO: renamed from: J3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C4223X extends AbstractC19764N {

    /* JADX INFO: renamed from: g */
    public static final Object f13796g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f13797b;

    /* JADX INFO: renamed from: c */
    public final long f13798c;

    /* JADX INFO: renamed from: d */
    public final boolean f13799d;

    /* JADX INFO: renamed from: e */
    public final C19797x f13800e;

    /* JADX INFO: renamed from: f */
    public final C19793t f13801f;

    static {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        List listEmptyList = Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        C19795v c19795v = C19795v.f62784a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C19794u(uri, null, null, listEmptyList, c11294t2, -9223372036854775807L);
        }
        c6337s.m6951d();
        c19792s.m20750a();
        C19751A c19751a = C19751A.f62530y;
    }

    public C4223X(long j10, boolean z6, boolean z10, C19797x c19797x) {
        C19793t c19793t = z10 ? c19797x.f62787c : null;
        this.f13797b = j10;
        this.f13798c = j10;
        this.f13799d = z6;
        c19797x.getClass();
        this.f13800e = c19797x;
        this.f13801f = c19793t;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: b */
    public final int mo2413b(Object obj) {
        return f13796g.equals(obj) ? 0 : -1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: f */
    public final C19762L mo2410f(int i10, C19762L c19762l, boolean z6) {
        AbstractC20800b.m21318f(i10, 1);
        Object obj = z6 ? f13796g : null;
        c19762l.getClass();
        c19762l.m20721h(null, obj, 0, this.f13797b, 0L, C19775b.f62661c, false);
        return c19762l;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: h */
    public final int mo2417h() {
        return 1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: l */
    public final Object mo2419l(int i10) {
        AbstractC20800b.m21318f(i10, 1);
        return f13796g;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: m */
    public final C19763M mo2411m(int i10, C19763M c19763m, long j10) {
        AbstractC20800b.m21318f(i10, 1);
        Object obj = C19763M.f62584p;
        c19763m.m20723b(this.f13800e, this.f13799d, false, this.f13801f, 0L, this.f13798c);
        return c19763m;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: o */
    public final int mo2420o() {
        return 1;
    }
}
