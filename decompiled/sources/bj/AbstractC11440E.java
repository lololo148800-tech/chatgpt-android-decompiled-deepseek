package bj;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: bj.E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11440E implements Closeable, Flushable {

    /* JADX INFO: renamed from: q0 */
    public String f34575q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f34576r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f34577s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f34578t0;

    /* JADX INFO: renamed from: Y */
    public int f34571Y = 0;

    /* JADX INFO: renamed from: Z */
    public int[] f34572Z = new int[32];

    /* JADX INFO: renamed from: o0 */
    public String[] f34573o0 = new String[32];

    /* JADX INFO: renamed from: p0 */
    public int[] f34574p0 = new int[32];

    /* JADX INFO: renamed from: u0 */
    public int f34579u0 = -1;

    /* JADX INFO: renamed from: C0 */
    public abstract AbstractC11440E mo12822C0(double d10);

    /* JADX INFO: renamed from: E */
    public abstract AbstractC11440E mo12823E();

    /* JADX INFO: renamed from: H0 */
    public abstract AbstractC11440E mo12824H0(long j10);

    /* JADX INFO: renamed from: J0 */
    public abstract AbstractC11440E mo12825J0(Boolean bool);

    /* JADX INFO: renamed from: N0 */
    public abstract AbstractC11440E mo12826N0(Number number);

    /* JADX INFO: renamed from: P */
    public final String m12835P() {
        return AbstractC11452Q.m12854c(this.f34571Y, this.f34572Z, this.f34573o0, this.f34574p0);
    }

    /* JADX INFO: renamed from: S */
    public final void m12836S(Object obj) {
        if (obj instanceof Map) {
            mo12833e();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: ".concat(key.getClass().getName()));
                }
                mo12827T((String) key);
                m12836S(entry.getValue());
            }
            mo12823E();
            return;
        }
        if (obj instanceof List) {
            mo12832a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m12836S(it.next());
            }
            mo12834m();
            return;
        }
        if (obj instanceof String) {
            mo12828V0((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            mo12830W0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            mo12822C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            mo12824H0(((Long) obj).longValue());
        } else if (obj instanceof Number) {
            mo12826N0((Number) obj);
        } else {
            if (obj != null) {
                throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
            }
            mo12829W();
        }
    }

    /* JADX INFO: renamed from: T */
    public abstract AbstractC11440E mo12827T(String str);

    /* JADX INFO: renamed from: V0 */
    public abstract AbstractC11440E mo12828V0(String str);

    /* JADX INFO: renamed from: W */
    public abstract AbstractC11440E mo12829W();

    /* JADX INFO: renamed from: W0 */
    public abstract AbstractC11440E mo12830W0(boolean z6);

    /* JADX INFO: renamed from: a */
    public abstract AbstractC11440E mo12832a();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC11440E mo12833e();

    /* JADX INFO: renamed from: j0 */
    public final int m12837j0() {
        int i10 = this.f34571Y;
        if (i10 != 0) {
            return this.f34572Z[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC11440E mo12834m();

    /* JADX INFO: renamed from: r0 */
    public final void m12839r0(int i10) {
        int[] iArr = this.f34572Z;
        int i11 = this.f34571Y;
        this.f34571Y = i11 + 1;
        iArr[i11] = i10;
    }

    /* JADX INFO: renamed from: v0 */
    public void mo12840v0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f34575q0 = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m12838k() {
        int i10 = this.f34571Y;
        int[] iArr = this.f34572Z;
        if (i10 != iArr.length) {
            return;
        }
        if (i10 == 256) {
            throw new C11473t(MMVKXkcLpuHFDi.zpGqkjaoKegOBx + m12835P() + ": circular reference?");
        }
        this.f34572Z = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f34573o0;
        this.f34573o0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f34574p0;
        this.f34574p0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof C11439D) {
            C11439D c11439d = (C11439D) this;
            Object[] objArr = c11439d.f34569v0;
            c11439d.f34569v0 = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }
}
