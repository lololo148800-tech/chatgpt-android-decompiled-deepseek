package p030B2;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import om.C18238e;
import p451Sb.C7102a;

/* JADX INFO: renamed from: B2.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0727H {

    /* JADX INFO: renamed from: Y */
    public int f2085Y;

    /* JADX INFO: renamed from: Z */
    public int f2086Z;

    /* JADX INFO: renamed from: o0 */
    public int f2087o0;

    /* JADX INFO: renamed from: p0 */
    public Object f2088p0;

    public AbstractC0727H() {
        if (C7102a.f22599Z == null) {
            C7102a.f22599Z = new C7102a(18);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1537a(int i10) {
        if (i10 < this.f2087o0) {
            return ((ByteBuffer) this.f2088p0).getShort(this.f2086Z + i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m1538b() {
        if (((C18238e) this.f2088p0).f58118t0 != this.f2087o0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo1534c(View view);

    /* JADX INFO: renamed from: d */
    public abstract void mo1535d(View view, Object obj);

    /* JADX INFO: renamed from: e */
    public void m1539e() {
        while (true) {
            int i10 = this.f2085Y;
            C18238e c18238e = (C18238e) this.f2088p0;
            if (i10 >= c18238e.f58116r0 || c18238e.f58113o0[i10] >= 0) {
                return;
            } else {
                this.f2085Y = i10 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1540f(View view, Object obj) {
        Object tag;
        C0747b c0747b;
        if (Build.VERSION.SDK_INT >= this.f2086Z) {
            mo1535d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2086Z) {
            tag = mo1534c(view);
        } else {
            tag = view.getTag(this.f2085Y);
            if (!((Class) this.f2088p0).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo1536g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM1575c = AbstractC0738T.m1575c(view);
            if (accessibilityDelegateM1575c == null) {
                c0747b = null;
            } else {
                c0747b = accessibilityDelegateM1575c instanceof C0745a ? ((C0745a) accessibilityDelegateM1575c).f2113a : new C0747b(accessibilityDelegateM1575c);
            }
            if (c0747b == null) {
                c0747b = new C0747b();
            }
            AbstractC0738T.m1584l(view, c0747b);
            view.setTag(this.f2085Y, obj);
            AbstractC0738T.m1579g(view, this.f2087o0);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo1536g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2085Y < ((C18238e) this.f2088p0).f58116r0;
    }

    public void remove() {
        m1538b();
        if (this.f2086Z == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C18238e c18238e = (C18238e) this.f2088p0;
        c18238e.m19756c();
        c18238e.m19765m(this.f2086Z);
        this.f2086Z = -1;
        this.f2087o0 = c18238e.f58118t0;
    }
}
