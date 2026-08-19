package p053C;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import p523V9.AbstractC8072d6;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p817j$.util.Objects;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: C.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1482q {

    /* JADX INFO: renamed from: a */
    public final List f3893a;

    /* JADX INFO: renamed from: b */
    public final Size f3894b;

    /* JADX INFO: renamed from: c */
    public final int f3895c;

    /* JADX INFO: renamed from: d */
    public final int f3896d;

    /* JADX INFO: renamed from: e */
    public String f3897e;

    /* JADX INFO: renamed from: f */
    public boolean f3898f;

    /* JADX INFO: renamed from: g */
    public long f3899g;

    public C1482q(Surface surface) {
        Size size;
        int iIntValue;
        String str = CsqksqyPE.qgcaMdADWClZFjN;
        int iIntValue2 = 0;
        this.f3898f = false;
        this.f3899g = 1L;
        this.f3893a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            AbstractC8072d6.m8488e(str, "Unable to retrieve surface size.", e10);
            size = null;
        }
        this.f3894b = size;
        try {
            iIntValue2 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            AbstractC8072d6.m8488e(str, "Unable to retrieve surface format.", e11);
        }
        this.f3895c = iIntValue2;
        try {
            iIntValue = ((Integer) Surface.class.getDeclaredMethod(MMVKXkcLpuHFDi.yYpCswPcW, null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e12) {
            AbstractC8072d6.m8488e(str, "Unable to retrieve surface generation id.", e12);
            iIntValue = -1;
        }
        this.f3896d = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1482q)) {
            return false;
        }
        C1482q c1482q = (C1482q) obj;
        if (!this.f3894b.equals(c1482q.f3894b) || this.f3895c != c1482q.f3895c || this.f3896d != c1482q.f3896d || this.f3898f != c1482q.f3898f || this.f3899g != c1482q.f3899g || !Objects.equals(this.f3897e, c1482q.f3897e)) {
            return false;
        }
        List list = this.f3893a;
        int size = list.size();
        List list2 = c1482q.f3893a;
        int iMin = Math.min(size, list2.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            if (list.get(i10) != list2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f3893a.hashCode() ^ 31;
        int i10 = this.f3896d ^ ((iHashCode << 5) - iHashCode);
        int iHashCode2 = this.f3894b.hashCode() ^ ((i10 << 5) - i10);
        int i11 = this.f3895c ^ ((iHashCode2 << 5) - iHashCode2);
        int i12 = (this.f3898f ? 1 : 0) ^ ((i11 << 5) - i11);
        int i13 = (i12 << 5) - i12;
        String str = this.f3897e;
        int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i13;
        int i14 = (iHashCode3 << 5) - iHashCode3;
        long j10 = this.f3899g;
        return ((int) (j10 ^ (j10 >>> 32))) ^ i14;
    }
}
