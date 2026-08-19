package p349O0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p076Cm.InterfaceC1723a;
import p692d0.C12982u;

/* JADX INFO: renamed from: O0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5943B0 implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Z */
    public int f19347Z;

    /* JADX INFO: renamed from: p0 */
    public int f19349p0;

    /* JADX INFO: renamed from: q0 */
    public int f19350q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f19351r0;

    /* JADX INFO: renamed from: s0 */
    public int f19352s0;

    /* JADX INFO: renamed from: u0 */
    public HashMap f19354u0;

    /* JADX INFO: renamed from: v0 */
    public C12982u f19355v0;

    /* JADX INFO: renamed from: Y */
    public int[] f19346Y = new int[0];

    /* JADX INFO: renamed from: o0 */
    public Object[] f19348o0 = new Object[0];

    /* JADX INFO: renamed from: t0 */
    public ArrayList f19353t0 = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final int m6341f(C5995c c5995c) {
        if (this.f19351r0) {
            C5997d.m6470z("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c5995c.m6411a()) {
            return c5995c.f19473a;
        }
        C5997d.m6443b0("Anchor refers to a group that was removed");
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5956I(this, 0, this.f19347Z);
    }

    /* JADX INFO: renamed from: j */
    public final void m6342j() {
        this.f19354u0 = new HashMap();
    }

    /* JADX INFO: renamed from: m */
    public final C5941A0 m6343m() {
        if (this.f19351r0) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f19350q0++;
        return new C5941A0(this);
    }

    /* JADX INFO: renamed from: p */
    public final C5947D0 m6344p() {
        if (this.f19351r0) {
            C5997d.m6470z("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f19350q0 > 0) {
            C5997d.m6470z("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f19351r0 = true;
        this.f19352s0++;
        return new C5947D0(this);
    }
}
