package p440S0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p594Y9.AbstractC9870d0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: S0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6983i extends AbstractC6977c {

    /* JADX INFO: renamed from: Z */
    public static final C6983i f22327Z = new C6983i(new Object[0]);

    /* JADX INFO: renamed from: Y */
    public final Object[] f22328Y;

    public C6983i(Object[] objArr) {
        this.f22328Y = objArr;
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f22328Y.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9870d0.m10523a(i10, mo1316f());
        return this.f22328Y[i10];
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC17678l.m19279B(obj, this.f22328Y);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: j */
    public final AbstractC6977c mo7337j(int i10, Object obj) {
        Object[] objArr = this.f22328Y;
        AbstractC9870d0.m10524b(i10, objArr.length);
        if (i10 == objArr.length) {
            return mo7338m(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC17678l.m19308o(0, i10, 6, objArr, objArr2);
            AbstractC17678l.m19304k(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new C6983i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, size)");
        AbstractC17678l.m19304k(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C6979e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f22328Y;
        AbstractC16544l.m18094g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f22328Y;
        AbstractC9870d0.m10524b(i10, objArr.length);
        return new C6978d(objArr, i10, objArr.length);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: m */
    public final AbstractC6977c mo7338m(Object obj) {
        Object[] objArr = this.f22328Y;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new C6979e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[objArr.length] = obj;
        return new C6983i(objArrCopyOf);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: p */
    public final AbstractC6977c mo7339p(Collection collection) {
        Object[] objArr = this.f22328Y;
        if (collection.size() + objArr.length > 32) {
            C6980f c6980fMo7340q = mo7340q();
            c6980fMo7340q.addAll(collection);
            return c6980fMo7340q.m7373m();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C6983i(objArrCopyOf);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: q */
    public final C6980f mo7340q() {
        return new C6980f(this, null, this.f22328Y, 0);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: s */
    public final AbstractC6977c mo7342s(int i10) {
        Object[] objArr = this.f22328Y;
        AbstractC9870d0.m10523a(i10, objArr.length);
        if (objArr.length == 1) {
            return f22327Z;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        AbstractC17678l.m19304k(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new C6983i(objArrCopyOf);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: t */
    public final AbstractC6977c mo7343t(int i10, Object obj) {
        Object[] objArr = this.f22328Y;
        AbstractC9870d0.m10523a(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = obj;
        return new C6983i(objArrCopyOf);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: r */
    public final AbstractC6977c mo7341r(C6976b c6976b) {
        Object[] objArr = this.f22328Y;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z6 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) c6976b.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC16544l.m18093f(objArrCopyOf, ahZQMZ.bVl);
                    z6 = true;
                    length = i10;
                }
            } else if (z6) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f22327Z : new C6983i(AbstractC17678l.m19310q(objArrCopyOf, 0, length));
    }
}
