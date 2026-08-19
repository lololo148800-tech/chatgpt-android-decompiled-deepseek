package p692d0;

import af.C10564U;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;
import p894n0.InterfaceC17405k;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C12949B {

    /* JADX INFO: renamed from: a */
    public Object[] f41115a;

    /* JADX INFO: renamed from: b */
    public int f41116b;

    public C12949B(int i10) {
        this.f41115a = i10 == 0 ? AbstractC12978q.f41192b : new Object[i10];
    }

    /* JADX INFO: renamed from: a */
    public final void m14607a(Object obj) {
        int i10 = this.f41116b + 1;
        Object[] objArr = this.f41115a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41115a = objArrCopyOf;
        }
        Object[] objArr2 = this.f41115a;
        int i11 = this.f41116b;
        objArr2[i11] = obj;
        this.f41116b = i11 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m14608b(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f41115a;
            int i11 = this.f41116b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f41115a;
        int i12 = this.f41116b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m14609c(InterfaceC17405k interfaceC17405k) {
        int i10;
        int iM14608b = m14608b(interfaceC17405k);
        if (iM14608b >= 0) {
            if (iM14608b < 0 || iM14608b >= (i10 = this.f41116b)) {
                StringBuilder sbM11057o = AbstractC10763a.m11057o(iM14608b, "Index ", " must be in 0..");
                sbM11057o.append(this.f41116b - 1);
                throw new IndexOutOfBoundsException(sbM11057o.toString());
            }
            Object[] objArr = this.f41115a;
            Object obj = objArr[iM14608b];
            if (iM14608b != i10 - 1) {
                AbstractC17678l.m19304k(iM14608b, iM14608b + 1, i10, objArr, objArr);
            }
            int i11 = this.f41116b - 1;
            this.f41116b = i11;
            objArr[i11] = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12949B) {
            C12949B c12949b = (C12949B) obj;
            int i10 = c12949b.f41116b;
            int i11 = this.f41116b;
            if (i10 == i11) {
                Object[] objArr = this.f41115a;
                Object[] objArr2 = c12949b.f41115a;
                C3508g c3508gM8929t = AbstractC8301I.m8929t(0, i11);
                int i12 = c3508gM8929t.f10591Y;
                int i13 = c3508gM8929t.f10592Z;
                if (i12 > i13) {
                    return true;
                }
                while (AbstractC16544l.m18089b(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f41115a;
        int i10 = this.f41116b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        C10564U c10564u = new C10564U(this, 14);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f41115a;
        int i10 = this.f41116b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c10564u.invoke(obj));
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public /* synthetic */ C12949B() {
        this(16);
    }
}
