package p004A2;

import kotlin.jvm.internal.AbstractC16544l;
import p655b2.C11218b;

/* JADX INFO: renamed from: A2.c */
/* JADX INFO: loaded from: classes.dex */
public class C0312c {

    /* JADX INFO: renamed from: a */
    public final Object[] f1084a;

    /* JADX INFO: renamed from: b */
    public int f1085b;

    public C0312c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1084a = new Object[i10];
    }

    /* JADX INFO: renamed from: a */
    public Object mo912a() {
        int i10 = this.f1085b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f1084a;
        Object obj = objArr[i11];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f1085b--;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m913b(C11218b c11218b) {
        int i10 = this.f1085b;
        Object[] objArr = this.f1084a;
        if (i10 < objArr.length) {
            objArr[i10] = c11218b;
            this.f1085b = i10 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo914c(Object instance) {
        Object[] objArr;
        boolean z6;
        AbstractC16544l.m18094g(instance, "instance");
        int i10 = this.f1085b;
        int i11 = 0;
        while (true) {
            objArr = this.f1084a;
            if (i11 >= i10) {
                z6 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z6 = true;
                break;
            }
            i11++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f1085b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f1085b = i12 + 1;
        return true;
    }

    public C0312c() {
        this.f1084a = new Object[256];
    }
}
