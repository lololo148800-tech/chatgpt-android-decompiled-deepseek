package p349O0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: O0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5945C0 implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final C5943B0 f19359Y;

    /* JADX INFO: renamed from: Z */
    public final int f19360Z;

    /* JADX INFO: renamed from: o0 */
    public final int f19361o0;

    public C5945C0(C5943B0 c5943b0, int i10, int i11) {
        this.f19359Y = c5943b0;
        this.f19360Z = i10;
        this.f19361o0 = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int iM6438Y;
        C5943B0 c5943b0 = this.f19359Y;
        if (c5943b0.f19352s0 != this.f19361o0) {
            throw new ConcurrentModificationException();
        }
        HashMap map = c5943b0.f19354u0;
        C5995c c5995c = null;
        int i11 = this.f19360Z;
        if (map != null) {
            if (c5943b0.f19351r0) {
                C5997d.m6470z("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i11 >= 0 && i11 < (i10 = c5943b0.f19347Z) && (iM6438Y = C5997d.m6438Y((arrayList = c5943b0.f19353t0), i11, i10)) >= 0) {
                c5995c = (C5995c) arrayList.get(iM6438Y);
            }
            if (c5995c != null) {
            }
        }
        return new C5956I(c5943b0, i11 + 1, c5943b0.f19346Y[(i11 * 5) + 3] + i11);
    }
}
