package p738f2;

import java.util.ArrayList;
import p001A.AbstractC0010F;
import p492U1.C7540e;
import p636a2.C10482s;
import p716e2.C13265b;
import p760g2.C13804a;
import p760g2.C13807d;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13529a extends C13265b {

    /* JADX INFO: renamed from: P */
    public final C10482s f42817P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f42818Q;

    /* JADX INFO: renamed from: R */
    public int f42819R;

    /* JADX INFO: renamed from: S */
    public int f42820S;

    /* JADX INFO: renamed from: T */
    public C13804a f42821T;

    public C13529a(C10482s c10482s) {
        super(c10482s);
        this.f42818Q = new ArrayList();
        this.f42817P = c10482s;
    }

    @Override // p716e2.C13265b
    /* JADX INFO: renamed from: a */
    public final void mo14862a() {
        m15083h();
        int iM24h = AbstractC0010F.m24h(this.f42819R);
        int i10 = 1;
        if (iM24h != 1 && iM24h != 3) {
            if (iM24h != 4) {
                i10 = iM24h != 5 ? 0 : 3;
            } else {
                i10 = 2;
            }
        }
        C13804a c13804a = this.f42821T;
        c13804a.f43599t0 = i10;
        c13804a.f43601v0 = this.f42820S;
    }

    @Override // p716e2.C13265b
    /* JADX INFO: renamed from: d */
    public final C13807d mo14865d() {
        return m15083h();
    }

    @Override // p716e2.C13265b
    /* JADX INFO: renamed from: e */
    public final C13265b mo14866e(int i10) {
        this.f42820S = i10;
        return this;
    }

    @Override // p716e2.C13265b
    /* JADX INFO: renamed from: f */
    public final C13265b mo14867f(C7540e c7540e) {
        this.f42820S = this.f42817P.m10949b(c7540e);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C13804a m15083h() {
        if (this.f42821T == null) {
            this.f42821T = new C13804a();
        }
        return this.f42821T;
    }
}
