package bb;

import java.util.Iterator;
import java.util.ListIterator;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: bb.B */
/* JADX INFO: loaded from: classes.dex */
public final class C11277B extends AbstractC11278C {

    /* JADX INFO: renamed from: o0 */
    public final transient int f34159o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f34160p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC11278C f34161q0;

    public C11277B(AbstractC11278C abstractC11278C, int i10, int i11) {
        this.f34161q0 = abstractC11278C;
        this.f34159o0 = i10;
        this.f34160p0 = i11;
    }

    @Override // bb.AbstractC11278C, java.util.List
    /* JADX INFO: renamed from: B */
    public final AbstractC11278C subList(int i10, int i11) {
        AbstractC8020X.m8355e(i10, i11, this.f34160p0);
        int i12 = this.f34159o0;
        return this.f34161q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC8020X.m8353c(i10, this.f34160p0);
        return this.f34161q0.get(i10 + this.f34159o0);
    }

    @Override // bb.AbstractC11278C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: j */
    public final Object[] mo12684j() {
        return this.f34161q0.mo12684j();
    }

    @Override // bb.AbstractC11278C, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: m */
    public final int mo12685m() {
        return this.f34161q0.mo12686p() + this.f34159o0 + this.f34160p0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: p */
    public final int mo12686p() {
        return this.f34161q0.mo12686p() + this.f34159o0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34160p0;
    }

    @Override // bb.AbstractC11278C, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
