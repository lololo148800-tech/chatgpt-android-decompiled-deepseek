package p157G2;

import kotlin.jvm.internal.AbstractC16544l;
import p181H2.C3198a;

/* JADX INFO: renamed from: G2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2978d extends AbstractC2979e {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f8946Y = 0;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ int f8947Z = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978d(String str, int i10) {
        super(str, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
        switch (i10) {
            case 3:
                super(str, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
                break;
            default:
                break;
        }
    }

    public C2978d(String str, String str2) {
        super(str2, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2978d(C3198a c3198a, CharSequence charSequence) {
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(c3198a.f9650a);
        AbstractC16544l.m18094g(type, "type");
        super(charSequence, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
