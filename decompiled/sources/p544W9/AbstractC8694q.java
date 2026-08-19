package p544W9;

import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p157G2.AbstractC2979e;
import p157G2.C2978d;
import p181H2.C3198a;
import p231J2.C4200a;
import p408Qj.C6748n;
import p488Tn.C7518a;
import p488Tn.C7524g;
import p488Tn.InterfaceC7526i;
import p722e8.C13298H;
import p729ej.C13420k;

/* JADX INFO: renamed from: W9.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8694q {
    /* JADX INFO: renamed from: a */
    public static final C7518a m9394a(InterfaceC7526i interfaceC7526i) {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        C7518a c7518aMo7819b = interfaceC7526i.mo7819b();
        C7518a c7518a = new C7518a();
        if (c7518aMo7819b.f23841o0 != 0) {
            C7524g c7524g = c7518aMo7819b.f23839Y;
            AbstractC16544l.m18091d(c7524g);
            C7524g c7524gM7831e = c7524g.m7831e();
            c7518a.f23839Y = c7524gM7831e;
            c7518a.f23840Z = c7524gM7831e;
            for (C7524g c7524g2 = c7524g.f23859f; c7524g2 != null; c7524g2 = c7524g2.f23859f) {
                C7524g c7524g3 = c7518a.f23840Z;
                AbstractC16544l.m18091d(c7524g3);
                C7524g c7524gM7831e2 = c7524g2.m7831e();
                c7524g3.m7830d(c7524gM7831e2);
                c7518a.f23840Z = c7524gM7831e2;
            }
            c7518a.f23841o0 = c7518aMo7819b.f23841o0;
        }
        return c7518a;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2979e m9395b(String str, String str2) {
        Exception excM9385a;
        try {
            C2978d c2978d = new C2978d(new C3198a(26), (CharSequence) null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(0), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(1), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(3), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(4), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(10), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_NAMESPACE_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(12), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(14), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(16), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(17), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_OPERATION_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_OPT_OUT_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_READ_ONLY_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(22), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_SYNTAX_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(24), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a(26), str2, c2978d);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_VERSION_ERROR"), str2, c2978d);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new C4200a();
                }
                excM9385a = AbstractC8688p.m9385a(new C3198a("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str2, c2978d);
            }
            return (AbstractC2979e) excM9385a;
        } catch (C4200a unused) {
            return new C2978d(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m9396c(InterfaceC7526i interfaceC7526i, long j10) {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        interfaceC7526i.mo7823l(j10);
        long jMin = Math.min(j10, m9397d(interfaceC7526i));
        interfaceC7526i.mo7819b().skip(jMin);
        return jMin;
    }

    /* JADX INFO: renamed from: d */
    public static final long m9397d(InterfaceC7526i interfaceC7526i) {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        return interfaceC7526i.mo7819b().f23841o0;
    }

    /* JADX INFO: renamed from: e */
    public static final C13420k m9398e(Parcelable parcelable) {
        AbstractC16544l.m18094g(parcelable, "<this>");
        return new C13420k(new C13298H(new C6748n(parcelable, 3), 4));
    }
}
