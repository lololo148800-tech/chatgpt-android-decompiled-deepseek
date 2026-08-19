package p132F2;

import android.os.Bundle;
import org.json.JSONObject;
import p003A1.AbstractC0235c;

/* JADX INFO: renamed from: F2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2653q extends AbstractC0235c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2653q(String str, Bundle bundle, int i10) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", 1, bundle);
        switch (i10) {
            case 1:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", 1, bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("password should not be empty");
                }
                return;
        }
    }
}
