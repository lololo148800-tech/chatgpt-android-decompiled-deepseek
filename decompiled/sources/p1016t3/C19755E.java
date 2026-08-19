package p1016t3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;

/* JADX INFO: renamed from: t3.E */
/* JADX INFO: loaded from: classes.dex */
public class C19755E extends IOException {

    /* JADX INFO: renamed from: Y */
    public final boolean f62559Y;

    /* JADX INFO: renamed from: Z */
    public final int f62560Z;

    public C19755E(String str, RuntimeException runtimeException, boolean z6, int i10) {
        super(str, runtimeException);
        this.f62559Y = z6;
        this.f62560Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C19755E m20712a(RuntimeException runtimeException, String str) {
        return new C19755E(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C19755E m20713b(String str) {
        return new C19755E(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f62559Y);
        sb2.append(", dataType=");
        return AbstractC10763a.m11056n(sb2, this.f62560Z, "}");
    }
}
