package p1142z3;

import android.os.SystemClock;
import bb.C11294T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p305M3.C5287g;

/* JADX INFO: renamed from: z3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21735c implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final boolean f68948Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f68949Z = new ArrayList(1);

    /* JADX INFO: renamed from: o0 */
    public int f68950o0;

    /* JADX INFO: renamed from: p0 */
    public C21743k f68951p0;

    public AbstractC21735c(boolean z6) {
        this.f68948Y = z6;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        ArrayList arrayList = this.f68949Z;
        if (arrayList.contains(interfaceC21730C)) {
            return;
        }
        arrayList.add(interfaceC21730C);
        this.f68950o0++;
    }

    /* JADX INFO: renamed from: g */
    public final void m22235g(int i10) {
        C21743k c21743k = this.f68951p0;
        int i11 = AbstractC20817s.f66106a;
        for (int i12 = 0; i12 < this.f68950o0; i12++) {
            InterfaceC21730C interfaceC21730C = (InterfaceC21730C) this.f68949Z.get(i12);
            boolean z6 = this.f68948Y;
            C5287g c5287g = (C5287g) interfaceC21730C;
            synchronized (c5287g) {
                C11294T c11294t = C5287g.f17410n;
                if (z6 && (c21743k.f68982i & 8) != 8) {
                    c5287g.f17424h += (long) i10;
                }
            }
        }
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public Map mo929h() {
        return Collections.emptyMap();
    }

    /* JADX INFO: renamed from: l */
    public final void m22236l() {
        C21743k c21743k = this.f68951p0;
        int i10 = AbstractC20817s.f66106a;
        for (int i11 = 0; i11 < this.f68950o0; i11++) {
            InterfaceC21730C interfaceC21730C = (InterfaceC21730C) this.f68949Z.get(i11);
            boolean z6 = this.f68948Y;
            C5287g c5287g = (C5287g) interfaceC21730C;
            synchronized (c5287g) {
                try {
                    C11294T c11294t = C5287g.f17410n;
                    if (z6 && (c21743k.f68982i & 8) != 8) {
                        AbstractC20800b.m21320h(c5287g.f17422f > 0);
                        c5287g.f17419c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (jElapsedRealtime - c5287g.f17423g);
                        c5287g.f17425i += (long) i12;
                        long j10 = c5287g.f17426j;
                        long j11 = c5287g.f17424h;
                        c5287g.f17426j = j10 + j11;
                        if (i12 > 0) {
                            c5287g.f17421e.m5833a((int) Math.sqrt(j11), (j11 * 8000.0f) / i12);
                            if (c5287g.f17425i >= 2000 || c5287g.f17426j >= 524288) {
                                c5287g.f17427k = (long) c5287g.f17421e.m5834b();
                            }
                            c5287g.m5828c(c5287g.f17424h, i12, c5287g.f17427k);
                            c5287g.f17423g = jElapsedRealtime;
                            c5287g.f17424h = 0L;
                        }
                        c5287g.f17422f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f68951p0 = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m22237m() {
        for (int i10 = 0; i10 < this.f68950o0; i10++) {
            ((InterfaceC21730C) this.f68949Z.get(i10)).getClass();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22238n(C21743k c21743k) {
        this.f68951p0 = c21743k;
        for (int i10 = 0; i10 < this.f68950o0; i10++) {
            InterfaceC21730C interfaceC21730C = (InterfaceC21730C) this.f68949Z.get(i10);
            boolean z6 = this.f68948Y;
            C5287g c5287g = (C5287g) interfaceC21730C;
            synchronized (c5287g) {
                try {
                    C11294T c11294t = C5287g.f17410n;
                    if (z6 && (c21743k.f68982i & 8) != 8) {
                        if (c5287g.f17422f == 0) {
                            c5287g.f17419c.getClass();
                            c5287g.f17423g = SystemClock.elapsedRealtime();
                        }
                        c5287g.f17422f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
