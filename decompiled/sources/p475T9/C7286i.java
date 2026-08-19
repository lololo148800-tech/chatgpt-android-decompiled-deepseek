package p475T9;

import p571X9.AbstractC9201R3;

/* JADX INFO: renamed from: T9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7286i extends AbstractC7287j {

    /* JADX INFO: renamed from: o0 */
    public final transient int f23088o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f23089p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC7287j f23090q0;

    public C7286i(AbstractC7287j abstractC7287j, int i10, int i11) {
        this.f23090q0 = abstractC7287j;
        this.f23088o0 = i10;
        this.f23089p0 = i11;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: f */
    public final Object[] mo7735f() {
        return this.f23090q0.mo7735f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9201R3.m9767b(i10, this.f23089p0);
        return this.f23090q0.get(i10 + this.f23088o0);
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: i */
    public final int mo7736i() {
        return this.f23090q0.mo7736i() + this.f23088o0;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: j */
    public final int mo7737j() {
        return this.f23090q0.mo7736i() + this.f23088o0 + this.f23089p0;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: m */
    public final boolean mo7738m() {
        return true;
    }

    @Override // p475T9.AbstractC7287j, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC7287j subList(int i10, int i11) {
        AbstractC9201R3.m9768c(i10, i11, this.f23089p0);
        int i12 = this.f23088o0;
        return this.f23090q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23089p0;
    }
}
