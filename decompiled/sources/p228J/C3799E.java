package p228J;

import android.util.Range;
import java.util.ArrayList;
import java.util.List;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: J.E */
/* JADX INFO: loaded from: classes.dex */
public final class C3799E {

    /* JADX INFO: renamed from: i */
    public static final C3828c f11479i = new C3828c("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: j */
    public static final C3828c f11480j = new C3828c("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: k */
    public static final C3828c f11481k = new C3828c("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a */
    public final ArrayList f11482a;

    /* JADX INFO: renamed from: b */
    public final C3835f0 f11483b;

    /* JADX INFO: renamed from: c */
    public final int f11484c;

    /* JADX INFO: renamed from: d */
    public final boolean f11485d;

    /* JADX INFO: renamed from: e */
    public final List f11486e;

    /* JADX INFO: renamed from: f */
    public final boolean f11487f;

    /* JADX INFO: renamed from: g */
    public final C3875z0 f11488g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3854p f11489h;

    public C3799E(ArrayList arrayList, C3835f0 c3835f0, int i10, boolean z6, ArrayList arrayList2, boolean z10, C3875z0 c3875z0, InterfaceC3854p interfaceC3854p) {
        this.f11482a = arrayList;
        this.f11483b = c3835f0;
        this.f11484c = i10;
        this.f11486e = DesugarCollections.unmodifiableList(arrayList2);
        this.f11487f = z10;
        this.f11488g = c3875z0;
        this.f11489h = interfaceC3854p;
        this.f11485d = z6;
    }

    /* JADX INFO: renamed from: a */
    public final int m4503a() {
        Object obj = this.f11488g.f11718a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: b */
    public final int m4504b() {
        Object objMo39b = 0;
        try {
            objMo39b = this.f11483b.mo39b(InterfaceC3800E0.f11494H);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo39b;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m4505c() {
        Object objMo39b = 0;
        try {
            objMo39b = this.f11483b.mo39b(InterfaceC3800E0.f11495J);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo39b;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
