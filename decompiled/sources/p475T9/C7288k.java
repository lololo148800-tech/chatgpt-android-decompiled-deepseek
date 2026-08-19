package p475T9;

import p571X9.AbstractC9201R3;
import p817j$.util.Objects;

/* JADX INFO: renamed from: T9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7288k extends AbstractC7287j {

    /* JADX INFO: renamed from: q0 */
    public static final C7288k f23092q0 = new C7288k(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f23093o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f23094p0;

    public C7288k(int i10, Object[] objArr) {
        this.f23093o0 = objArr;
        this.f23094p0 = i10;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: f */
    public final Object[] mo7735f() {
        return this.f23093o0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9201R3.m9767b(i10, this.f23094p0);
        Object obj = this.f23093o0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: i */
    public final int mo7736i() {
        return 0;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: j */
    public final int mo7737j() {
        return this.f23094p0;
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: m */
    public final boolean mo7738m() {
        return false;
    }

    @Override // p475T9.AbstractC7287j, p475T9.AbstractC7284g
    /* JADX INFO: renamed from: p */
    public final int mo7739p(Object[] objArr) {
        Object[] objArr2 = this.f23093o0;
        int i10 = this.f23094p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23094p0;
    }
}
