package p672c3;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7542g;

/* JADX INFO: renamed from: c3.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11571E0 {

    /* JADX INFO: renamed from: a */
    public final Context f34973a;

    /* JADX INFO: renamed from: b */
    public final int f34974b;

    /* JADX INFO: renamed from: c */
    public final boolean f34975c;

    /* JADX INFO: renamed from: d */
    public final C11606g0 f34976d;

    /* JADX INFO: renamed from: e */
    public final int f34977e;

    /* JADX INFO: renamed from: f */
    public final boolean f34978f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f34979g;

    /* JADX INFO: renamed from: h */
    public final C11600d0 f34980h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f34981i;

    /* JADX INFO: renamed from: j */
    public final long f34982j;

    /* JADX INFO: renamed from: k */
    public final int f34983k;

    /* JADX INFO: renamed from: l */
    public final int f34984l;

    /* JADX INFO: renamed from: m */
    public final boolean f34985m;

    /* JADX INFO: renamed from: n */
    public final Integer f34986n;

    /* JADX INFO: renamed from: o */
    public final ComponentName f34987o;

    public C11571E0(Context context, int i10, boolean z6, C11606g0 c11606g0, int i11, boolean z10, AtomicInteger atomicInteger, C11600d0 c11600d0, AtomicBoolean atomicBoolean, long j10, int i12, int i13, boolean z11, Integer num, ComponentName componentName) {
        this.f34973a = context;
        this.f34974b = i10;
        this.f34975c = z6;
        this.f34976d = c11606g0;
        this.f34977e = i11;
        this.f34978f = z10;
        this.f34979g = atomicInteger;
        this.f34980h = c11600d0;
        this.f34981i = atomicBoolean;
        this.f34982j = j10;
        this.f34983k = i12;
        this.f34984l = i13;
        this.f34985m = z11;
        this.f34986n = num;
        this.f34987o = componentName;
    }

    /* JADX INFO: renamed from: a */
    public static C11571E0 m12967a(C11571E0 c11571e0, int i10, boolean z6, AtomicInteger atomicInteger, C11600d0 c11600d0, AtomicBoolean atomicBoolean, long j10, boolean z10, Integer num, int i11) {
        Context context = c11571e0.f34973a;
        int i12 = c11571e0.f34974b;
        boolean z11 = c11571e0.f34975c;
        C11606g0 c11606g0 = c11571e0.f34976d;
        int i13 = (i11 & 16) != 0 ? c11571e0.f34977e : i10;
        boolean z12 = (i11 & 32) != 0 ? c11571e0.f34978f : z6;
        AtomicInteger atomicInteger2 = (i11 & 64) != 0 ? c11571e0.f34979g : atomicInteger;
        C11600d0 c11600d1 = (i11 & 128) != 0 ? c11571e0.f34980h : c11600d0;
        AtomicBoolean atomicBoolean2 = (i11 & 256) != 0 ? c11571e0.f34981i : atomicBoolean;
        long j11 = (i11 & 512) != 0 ? c11571e0.f34982j : j10;
        int i14 = (i11 & 1024) != 0 ? c11571e0.f34983k : 0;
        int i15 = c11571e0.f34984l;
        boolean z13 = (i11 & 4096) != 0 ? c11571e0.f34985m : z10;
        Integer num2 = (i11 & 8192) != 0 ? c11571e0.f34986n : num;
        ComponentName componentName = c11571e0.f34987o;
        c11571e0.getClass();
        return new C11571E0(context, i12, z11, c11606g0, i13, z12, atomicInteger2, c11600d1, atomicBoolean2, j11, i14, i15, z13, num2, componentName);
    }

    /* JADX INFO: renamed from: b */
    public final C11571E0 m12968b(C11600d0 c11600d0, int i10) {
        return m12967a(this, i10, false, null, c11600d0, null, 0L, false, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11571E0)) {
            return false;
        }
        C11571E0 c11571e0 = (C11571E0) obj;
        return AbstractC16544l.m18089b(this.f34973a, c11571e0.f34973a) && this.f34974b == c11571e0.f34974b && this.f34975c == c11571e0.f34975c && AbstractC16544l.m18089b(this.f34976d, c11571e0.f34976d) && this.f34977e == c11571e0.f34977e && this.f34978f == c11571e0.f34978f && AbstractC16544l.m18089b(this.f34979g, c11571e0.f34979g) && AbstractC16544l.m18089b(this.f34980h, c11571e0.f34980h) && AbstractC16544l.m18089b(this.f34981i, c11571e0.f34981i) && this.f34982j == c11571e0.f34982j && this.f34983k == c11571e0.f34983k && this.f34984l == c11571e0.f34984l && this.f34985m == c11571e0.f34985m && AbstractC16544l.m18089b(this.f34986n, c11571e0.f34986n) && AbstractC16544l.m18089b(this.f34987o, c11571e0.f34987o);
    }

    public final int hashCode() {
        int iHashCode = ((((this.f34973a.hashCode() * 31) + this.f34974b) * 31) + (this.f34975c ? 1231 : 1237)) * 31;
        C11606g0 c11606g0 = this.f34976d;
        int iHashCode2 = (this.f34981i.hashCode() + ((this.f34980h.hashCode() + ((this.f34979g.hashCode() + ((((((iHashCode + (c11606g0 == null ? 0 : c11606g0.hashCode())) * 31) + this.f34977e) * 31) + (this.f34978f ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f34982j;
        int i10 = (((((((((int) (j10 ^ (j10 >>> 32))) + iHashCode2) * 31) + this.f34983k) * 31) + this.f34984l) * 31) + (this.f34985m ? 1231 : 1237)) * 31;
        Integer num = this.f34986n;
        int iHashCode3 = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f34987o;
        return iHashCode3 + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f34973a + ", appWidgetId=" + this.f34974b + ", isRtl=" + this.f34975c + ", layoutConfiguration=" + this.f34976d + ", itemPosition=" + this.f34977e + ", isLazyCollectionDescendant=" + this.f34978f + ", lastViewId=" + this.f34979g + ", parentContext=" + this.f34980h + ", isBackgroundSpecified=" + this.f34981i + ", layoutSize=" + ((Object) C7542g.m7878c(this.f34982j)) + ", layoutCollectionViewId=" + this.f34983k + ", layoutCollectionItemId=" + this.f34984l + ", canUseSelectableGroup=" + this.f34985m + ", actionTargetId=" + this.f34986n + ", actionBroadcastReceiver=" + this.f34987o + ')';
    }
}
