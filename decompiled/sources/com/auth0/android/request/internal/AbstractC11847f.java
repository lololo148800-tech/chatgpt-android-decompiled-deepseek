package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import p214Ib.C3669l;
import p214Ib.C3670m;
import p288Lb.C4968a;
import p568X6.C9071a;

/* JADX INFO: renamed from: com.auth0.android.request.internal.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11847f {

    /* JADX INFO: renamed from: a */
    public static final C3669l f35979a;

    static {
        Type type = TypeToken.getParameterized(Map.class, String.class, PublicKey.class).getType();
        C3670m c3670m = new C3670m();
        c3670m.f11162e.add(new C4968a(6));
        c3670m.m4379b(C9071a.class, new C11851j());
        c3670m.m4379b(Credentials.class, new C11849h(2));
        c3670m.m4379b(type, new C11849h(0));
        c3670m.f11164g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        f35979a = c3670m.m4378a();
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
