package p826j6;

import org.json.JSONObject;

/* JADX INFO: renamed from: j6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16151e {

    /* JADX INFO: renamed from: a */
    public final String f50138a;

    public C16151e(String str) {
        this.f50138a = new JSONObject(str).optString("countryCode");
    }
}
