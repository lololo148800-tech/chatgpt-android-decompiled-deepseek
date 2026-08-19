package p446S6;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p421R6.C6815a;

/* JADX INFO: renamed from: S6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7023b extends C6815a {

    /* JADX INFO: renamed from: Y */
    public String f22454Y;

    /* JADX INFO: renamed from: Z */
    public String f22455Z;

    /* JADX INFO: renamed from: o0 */
    public int f22456o0;

    /* JADX INFO: renamed from: p0 */
    public Map f22457p0;

    public C7023b() {
        super("An error occurred when trying to authenticate with the server.", null);
    }

    /* JADX INFO: renamed from: a */
    public final String m7418a() {
        String str = this.f22454Y;
        if (str == null) {
            return "a0.sdk.internal_error.unknown";
        }
        AbstractC16544l.m18091d(str);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final String m7419b() {
        String str = this.f22455Z;
        if (TextUtils.isEmpty(str)) {
            return "a0.sdk.internal_error.unknown".equals(m7418a()) ? String.format("Received error with code %s", Arrays.copyOf(new Object[]{m7418a()}, 1)) : "Failed with unknown error";
        }
        AbstractC16544l.m18091d(str);
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7023b(String code, String str) {
        this();
        AbstractC16544l.m18094g(code, "code");
        this.f22454Y = code;
        this.f22455Z = str;
    }
}
