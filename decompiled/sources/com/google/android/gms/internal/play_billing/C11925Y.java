package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C11925Y extends AbstractC11872G {

    /* JADX INFO: renamed from: t0 */
    public static final Object[] f36217t0;

    /* JADX INFO: renamed from: u0 */
    public static final C11925Y f36218u0;

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f36219o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f36220p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f36221q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int f36222r0;

    /* JADX INFO: renamed from: s0 */
    public final transient int f36223s0;

    static {
        Object[] objArr = new Object[0];
        f36217t0 = objArr;
        f36218u0 = new C11925Y(0, 0, 0, objArr, objArr);
    }

    public C11925Y(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f36219o0 = objArr;
        this.f36220p0 = i10;
        this.f36221q0 = objArr2;
        this.f36222r0 = i11;
        this.f36223s0 = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f36221q0;
            if (objArr.length != 0) {
                int iM13442c = AbstractC11957g1.m13442c(obj.hashCode());
                while (true) {
                    int i10 = iM13442c & this.f36222r0;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM13442c = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        Object[] objArr2 = this.f36219o0;
        int i10 = this.f36223s0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36220p0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: i */
    public final int mo13212i() {
        return this.f36223s0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo13224m().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: j */
    public final int mo13213j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: q */
    public final Object[] mo13215q() {
        return this.f36219o0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G
    /* JADX INFO: renamed from: s */
    public final AbstractC11857B mo13265s() {
        return AbstractC11857B.m13221t(this.f36223s0, this.f36219o0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36223s0;
    }
}
