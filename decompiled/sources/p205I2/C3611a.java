package p205I2;

import kotlin.jvm.internal.AbstractC16544l;
import p157G2.AbstractC2976b;
import p181H2.C3198a;

/* JADX INFO: renamed from: I2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3611a extends AbstractC2976b {
    /* JADX WARN: Illegal instructions before constructor call */
    public C3611a(C3198a c3198a, String str) {
        String type = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(c3198a.f9650a);
        AbstractC16544l.m18094g(type, "type");
        super(type, str);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
